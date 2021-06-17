package com.ironhack;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*AndroidPlayer androidPlayer = new AndroidPlayer(20);

        androidPlayer.play();
        androidPlayer.pause();
        androidPlayer.mute();
        System.out.println("Volume: " + androidPlayer.getVolume());
        androidPlayer.increaseVolume(10);
        androidPlayer.changeBrightness(30);
        androidPlayer.changeContrast(10);

        ApplePlayer AP = new ApplePlayer();
        AP.play();
        AP.pause();
        AP.mute();
        System.out.println("Volume: " + AP.getVolume());
        AP.increaseVolume(20);
        AP.changeBrightness(15);
        AP.changeContrast(24);
        */


        Date date1 = new Date();
        Transaction transaction1 = new Transaction(12323, 54332, 1000, date1);
        Transaction transaction2 = new Transaction(14523, 34354332, 4000, new Date());
        Transaction transaction3 = new Transaction(78423, 24332, 700000, new Date());

        PaymentList paymentList1 = new PaymentList();

        paymentList1.addTransaction(transaction1);
        paymentList1.addTransaction(transaction2);
        paymentList1.addTransaction(transaction3);
        Transaction returnedTransaction = paymentList1.getTransactionByDate(date1);
        System.out.println(returnedTransaction.getBuyerAccountNum());

        List<Transaction> allTransactionsReturned = paymentList1.getAllTransactions();
        for (Transaction i : allTransactionsReturned){
            System.out.println(i.getBuyerAccountNum());
        }
    }


}
