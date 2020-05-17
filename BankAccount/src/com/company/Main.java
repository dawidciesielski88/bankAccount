package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount bobsAccount = new BankAccount();
//        //("123456", 25000, "Bob Smith", "bobsmith@gmaiil.com", "123123123"); // calling Constructor
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(50);
//        bobsAccount.deposit(500);

        VipCustomer georgeBush = new VipCustomer("George Bush", 1000000, "george.bush@gmail.com");
        System.out.println(georgeBush.getName());

        VipCustomer someDude = new VipCustomer();
        System.out.println(someDude.getName());

        VipCustomer anotherOne = new VipCustomer("Mike Ike", 100);
        System.out.println(anotherOne.getName());

    }
}
