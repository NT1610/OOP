package builderpattern.demoprogram;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("OOPBank", "123456789")
                .setEmail("contract@oopbank.com")
                .setNewsletter(true)
                .build();
        System.out.println(bankAccount);
    }
}
