package adapter;

public interface BankAdapter {
    double getBalance(String userId, int pin);
    boolean transfer(String fromUserId, String toUserId, int amount);
    boolean updatePin(String userId, int currentPin, int newPin);
}