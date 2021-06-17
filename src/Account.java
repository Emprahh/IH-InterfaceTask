class Account {
    private String accountName;
    private String accountAddress;
    private int thisAccountName;
    private int accountBalance;

    public Account(String accountName, String accountAddress, int thisAccountName, int accountBalance) {
        this.accountName = accountName;
        this.accountAddress = accountAddress;
        this.thisAccountName = thisAccountName;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    public int getThisAccountName() {
        return thisAccountName;
    }

    public void setThisAccountName(int thisAccountName) {
        this.thisAccountName = thisAccountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}