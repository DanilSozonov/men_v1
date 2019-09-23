public class Account {
    public static int currentAccountNumber = 1000000000;
    private int accountNumber;
    private Car car;

    Account(int accountNumber, Car car){
        this.accountNumber = accountNumber;
        this.car = car;
    }
    int getAccountNumber(){
        return accountNumber;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
