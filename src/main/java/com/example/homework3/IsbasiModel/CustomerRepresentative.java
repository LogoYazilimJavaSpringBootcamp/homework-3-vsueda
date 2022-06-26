package com.example.homework3.IsbasiModel;

public class CustomerRepresentative {
    private int customerRepresentativeid;
    private String customerRepresentativeName;
    private String customerRepresentativeBank;
    private String customerRepresentativePhone;

    public CustomerRepresentative() {
    }

    public CustomerRepresentative(int customerRepresentativeid, String customerRepresentativeName, String customerRepresentativeBank, String customerRepresentativePhone) {
        this.customerRepresentativeid = customerRepresentativeid;
        this.customerRepresentativeName = customerRepresentativeName;
        this.customerRepresentativeBank = customerRepresentativeBank;
        this.customerRepresentativePhone = customerRepresentativePhone;
    }

    public int getCustomerRepresentativeid() {
        return customerRepresentativeid;
    }

    public void setCustomerRepresentativeid(int customerRepresentativeid) {
        this.customerRepresentativeid = customerRepresentativeid;
    }

    public String getCustomerRepresentativeName() {
        return customerRepresentativeName;
    }

    public void setCustomerRepresentativeName(String customerRepresentativeName) {
        this.customerRepresentativeName = customerRepresentativeName;
    }

    public String getCustomerRepresentativeBank() {
        return customerRepresentativeBank;
    }

    public void setCustomerRepresentativeBank(String customerRepresentativeBank) {
        this.customerRepresentativeBank = customerRepresentativeBank;
    }

    public String getCustomerRepresentativePhone() {
        return customerRepresentativePhone;
    }

    public void setCustomerRepresentativePhone(String customerRepresentativePhone) {
        this.customerRepresentativePhone = customerRepresentativePhone;
    }
}
