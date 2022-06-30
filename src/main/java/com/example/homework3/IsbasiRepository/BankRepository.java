package com.example.homework3.IsbasiRepository;

import com.example.homework3.IsbasiModel.Bank;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;

@Repository
public class BankRepository {
    private ArrayList<Bank> bankList = new ArrayList<>(initialize());

    //    Başlangıçta listeyi doldurmayı sağlayan metot.
    public ArrayList<Bank> initialize() {
        bankList = new ArrayList<>();
        bankList.add(new Bank(1, "Garanti", "Istanbul", "555"));
        return bankList;
    }

    //    Listeye ekleme yapılmasına olanak sağlar.
    public Bank add(String bankName, String bankLocation, String bankPhone) {
        int findLastId = bankList.stream().max(Comparator.comparing(Bank::getBankId)).get().getBankId() + 1;
        Bank newBank = new Bank(findLastId, bankName, bankLocation, bankPhone);
        bankList.add(newBank);
        return newBank;
    }

    //    Tüm elemanları listeler.
    public ArrayList<Bank> getBanks() {
        return bankList;
    }

    //    Belli bir id'ye göre eleman getirir
    public Bank getBank(Integer bankId) {
        return bankList.get(bankId);
    }

    //    Verilen id için silme işlemi yapar
    public void removeBank(Integer bankId) {
        bankList.remove(bankId);
    }

    //    İstenilen elemanın güncellenmesine olanak sağlar.
    public void update(Bank bank) {
        removeBank(bank.getBankId());
        bankList.add(bank);
    }
}
