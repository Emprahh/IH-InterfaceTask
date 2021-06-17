package com.ironhack;

import java.util.Date;
import java.util.List;

public interface TransactionList {
    public Transaction getLastTransaction();
    public void addTransaction(Transaction a);
    public Transaction getTransactionByDate(Date d);
    public List<Transaction> getAllTransactions();

}

