package com.UDC.budgettracker.Model;

public class ModelBank {
    String BankName,bankUrl;
    int Banklogo;

    public String getBankUrl() {
        return bankUrl;
    }

    public void setBankUrl(String bankUrl) {
        this.bankUrl = bankUrl;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public int getBanklogo() {
        return Banklogo;
    }

    public void setBanklogo(int banklogo) {
        Banklogo = banklogo;
    }
}
