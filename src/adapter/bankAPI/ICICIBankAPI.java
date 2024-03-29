package adapter.bankAPI;

public class ICICIBankAPI {
    public double getBalance(String token){
        return 10000.00;
    }

    public String pay(String fromUser, String toUser, int amount){
        return "Done";
    }

    public boolean changePin(String user, int oldPin, int newPin){
        return true;
    }
}
