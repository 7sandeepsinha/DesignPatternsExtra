package adapter;

public class Phonepe {
    private BankAdapter bankAdapter;

    public Phonepe() {
        this.bankAdapter = new AxisBankAdapter();
    }

    public void getCurrentBalance(String userId, int pin){
        double balance = bankAdapter.getBalance(userId, pin);
        System.out.println("Current Balance - " + balance);
    }

    public void doTransfer(String fromUserId, int fromUserPin, String toUserId, int amount){
        double fromBalance = bankAdapter.getBalance(fromUserId, fromUserPin );
        if(fromBalance >= amount){
            boolean result = bankAdapter.transfer(fromUserId, toUserId, amount);
            if(result) {
                System.out.println("Transfer successful");
            } else {
                System.out.println("Transfer failed");
            }
        } else {
            System.out.println("Not enough balance");
        }
    }

    public void updatePin(String userId, int currentPin, int newPin){
        boolean result = bankAdapter.updatePin(userId, currentPin, newPin);
        System.out.println("The update was successful : " + result);
    }
}
