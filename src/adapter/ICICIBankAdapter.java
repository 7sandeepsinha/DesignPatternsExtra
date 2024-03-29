package adapter;

import adapter.bankAPI.ICICIBankAPI;

public class ICICIBankAdapter implements BankAdapter{
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public double getBalance(String userId, int pin) {
        String token = generateToken(userId, pin);
        return iciciBankAPI.getBalance(token);
    }

    @Override
    public boolean transfer(String fromUserId, String toUserId, int amount) {
        String result = iciciBankAPI.pay(fromUserId, toUserId, amount);
        return result.equalsIgnoreCase("Done");
    }

    @Override
    public boolean updatePin(String userId, int currentPin, int newPin) {
        return iciciBankAPI.changePin(userId, currentPin, newPin);
    }

    private String generateToken(String userID, int pin){
        return "token";
    }
}
