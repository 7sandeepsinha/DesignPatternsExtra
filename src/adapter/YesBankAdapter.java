package adapter;

import adapter.bankAPI.YesBankAPI;

public class YesBankAdapter implements BankAdapter{

    private YesBankAPI yesBankAPI;

    public YesBankAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double getBalance(String userId, int pin) {
        return yesBankAPI.checkBalance(userId, pin);
    }

    @Override
    public boolean transfer(String fromUserId, String toUserId, int amount) {
        double balance = yesBankAPI.checkBalance(fromUserId, 1234);
        char result = yesBankAPI.transferMoney(fromUserId, toUserId, amount);
        return result == 'Y';
    }

    @Override
    public boolean updatePin(String userId, int currentPin, int newPin) {
        char result = yesBankAPI.updatePin(userId, currentPin, newPin);
        return result == 'Y';
    }
}
