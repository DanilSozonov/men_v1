import java.util.List;

public class Client extends Person {
    Client(String firstName, String phoneNumber, String passport) {
        super(firstName, phoneNumber, passport);
    }

    private List<Account> accounts;
    private List<Car> cars;

    public int createAccount() {
        int newAccount = Account.currentAccountNumber++;

        accounts.add(new Account(newAccount, null));
        return newAccount;
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void useCar(int accountNumber){
        Account account = findAccount(accountNumber);
        for(Car car: cars){
            if(car.isFree)
                account.setCar(car);
            else
                account.setCar(null);
        }
    }
}
