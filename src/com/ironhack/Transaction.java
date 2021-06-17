package com.ironhack;

import java.util.Date;

public class Transaction {
        private int sellerAccountNum;
        private int buyerAccountNum;
        private int Amount;
        private Date AccountDate;

        public Transaction(int sellerAccountNum, int buyerAccountNum, int amount, Date accountDate) {
            this.sellerAccountNum = sellerAccountNum;
            this.buyerAccountNum = buyerAccountNum;
            Amount = amount;
            AccountDate = accountDate;
        }

        public int getSellerAccountNum() {
            return sellerAccountNum;
        }

        public void setSellerAccountNum(int sellerAccountNum) {
            this.sellerAccountNum = sellerAccountNum;
        }

        public int getBuyerAccountNum() {
            return buyerAccountNum;
        }

        public void setBuyerAccountNum(int buyerAccountNum) {
            this.buyerAccountNum = buyerAccountNum;
        }

        public int getAmount() {
            return Amount;
        }

        public void setAmount(int amount) {
            Amount = amount;
        }

        public Date getAccountDate() {
            return AccountDate;
        }

        public void setAccountDate(Date accountDate) {
            AccountDate = accountDate;
        }

}
