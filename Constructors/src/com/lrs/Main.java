package com.lrs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount account1 = new BankAccount();

        account1.setAccount(314152525);
        account1.setCustomer("Customer #1");
        account1.setBalance(32000);
        account1.deposit(999);
        System.out.println("Balance after deposit " + account1.getBalance());
        account1.withdraw(2999);
        System.out.println("Balance after withdraw " + account1.getBalance());


        BankAccount account2 = new BankAccount(412424, 10000, "account2", "acc@ount2.com", 123456);
        System.out.println("Acc mail "+ account2.getEmail());

        BankAccount account3 = new BankAccount();// constructor with default;
        System.out.println("Constructor default " + account3.getCustomer());

        BankAccount account4 = new BankAccount("account4", "acc@unt4.com", 321971); //constructor with some defaults
        System.out.println("Account 4 " + account4.getBalance() + "----" + account4.getEmail());


        System.out.println("********** CHALLENGE **********");

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("doi","2@doi.com");
        VipCustomer vip3 = new VipCustomer("trei", 3333, "33@trei.com");

        System.out.println("vip1 " + vip1.getName() + " - " + vip1.getCreditLimit() + " - " + vip1.getEmail());
        System.out.println("vip2 " + vip2.getName() + " - " + vip2.getCreditLimit() + " - " + vip2.getEmail());
        System.out.println("vip3 " + vip3.getName() + " - " + vip3.getCreditLimit() + " - " + vip3.getEmail());
    }
}
