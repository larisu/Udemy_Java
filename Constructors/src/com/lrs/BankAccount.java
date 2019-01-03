package com.lrs;

public class BankAccount {

    private long account;
    private double balance;
    private String customer;
    private String email;
    private long phone;

    public BankAccount(){
        this(9999999, 10000, "default_customer", "default_cust@mer.com", 12345678);
        System.out.println("Empty constructor");
    }

    public BankAccount(long account, double balance, String customer, String email, long phone){
        this.account = account;
        this.balance = balance;
        this.customer = customer;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String customer, String email, long phone) {
        this(8888888, 80000, customer, email, phone);

    }

    public void setAccount(long account){
        this.account = account;
        System.out.println("Account " + account);
    }

    public long getAccount(){
        return account;
    }

    public void setBalance(int balance){
        this.balance = balance;
        System.out.println("Balance set " + balance);
    }
    public double getBalance(){
        return balance;
    }

    public void setCustomer(String name){
        this.customer = name;
        System.out.println("Customer name " + name);
    }

    public String getCustomer() {
        return customer;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email set " + email);
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
        System.out.println("Phone was set " + phone);
    }

    public long getPhone() {
        return phone;
    }

    public void deposit(int money){
        this.balance += money;
        System.out.println("Deposit success");
    }
    public void withdraw(int money){
        if (this.balance - money >= 0){
            this.balance -= money;
            System.out.println("Withdraw success");
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
}
