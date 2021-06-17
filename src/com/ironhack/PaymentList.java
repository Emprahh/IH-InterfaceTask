package com.ironhack;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PaymentList implements TransactionList{

    private List<Transaction> transactionList = new ArrayList<>();

    public Transaction getLastTransaction() {
        return transactionList.get(transactionList.size() - 1);
    }


    public void addTransaction(Transaction a) {
        transactionList.add(a);
    }


    public Transaction getTransactionByDate(Date d) {
        for (Transaction i : transactionList) {
            if (i.getAccountDate() == d) {
                return i;
            }
        }
        return null;
    }


    public List<Transaction> getAllTransactions() {
        return transactionList;
    }
}
