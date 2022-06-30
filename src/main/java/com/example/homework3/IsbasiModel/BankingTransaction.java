package com.example.homework3.IsbasiModel;

public class BankingTransaction {
    private int bankingTransactionid;
    private String bankingTransactionVersion;
    private Bank bank;
    private CustomerRepresentative customerRepresentative;

    public BankingTransaction() {
    }

    public BankingTransaction(int bankingTransactionid, String bankingTransactionVersion, Bank bank, CustomerRepresentative customerRepresentative) {
        this.bankingTransactionid = bankingTransactionid;
        this.bankingTransactionVersion = bankingTransactionVersion;
        this.bank = bank;
        this.customerRepresentative = customerRepresentative;
    }

    public int getBankingTransactionid() {
        return bankingTransactionid;
    }

    public void setBankingTransactionid(int bankingTransactionid) {
        this.bankingTransactionid = bankingTransactionid;
    }

    public String getBankingTransactionVersion() {
        return bankingTransactionVersion;
    }

    public void setBankingTransactionVersion(String bankingTransactionVersion) {
        this.bankingTransactionVersion = bankingTransactionVersion;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public CustomerRepresentative getCustomerRepresentative() {
        return customerRepresentative;
    }

    public void setCustomerRepresentative(CustomerRepresentative customerRepresentative) {
        this.customerRepresentative = customerRepresentative;
    }
}
