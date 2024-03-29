package adapter.bankAPI;

public class YesBankAPI {
    public int checkBalance(String userId, int pin){
        return 10000;
    }

    public char transferMoney(String fromUser, String toUser, int amount){
        return 'Y';
    }

    public char updatePin(String user, int oldPin, int newPin){
        return 'Y';
    }
}
