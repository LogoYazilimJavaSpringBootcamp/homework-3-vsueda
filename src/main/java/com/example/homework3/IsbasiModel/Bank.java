package com.example.homework3.IsbasiModel;

public class Bank {
    private int bankId;
    private String bankName;
    private String bankLocation;
    private String bankPhone;

    public Bank() {
    }

    public Bank(int bankId, String bankName, String bankLocation, String bankPhone) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankLocation = bankLocation;
        this.bankPhone = bankPhone;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }
}
