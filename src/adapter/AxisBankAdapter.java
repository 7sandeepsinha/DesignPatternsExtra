package adapter;

public class AxisBankAdapter implements BankAdapter{
    @Override
    public double getBalance(String userId, int pin) {
        return 0;
    }

    @Override
    public boolean transfer(String fromUserId, String toUserId, int amount) {
        return false;
    }

    @Override
    public boolean updatePin(String userId, int currentPin, int newPin) {
        return false;
    }
}
