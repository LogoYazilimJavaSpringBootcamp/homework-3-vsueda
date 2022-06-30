package com.example.homework3.IsbasiRepository;

import com.example.homework3.IsbasiModel.Bank;
import com.example.homework3.IsbasiModel.BankingTransaction;
import com.example.homework3.IsbasiModel.CustomerRepresentative;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;

@Repository
public class BankingTransactionRepository {

    private ArrayList<BankingTransaction> bankingTransactionList = new ArrayList<>(initialize());

//    Başlangıçta listeyi doldurmayı sağlayan metot.
    public ArrayList<BankingTransaction> initialize() {
        bankingTransactionList = new ArrayList<>();
        Bank bank = new Bank(1, "Garanti", "Istanbul", "555");
        CustomerRepresentative customerRepresentative =  new CustomerRepresentative(1, "Sueda", "Garanti", "444");
        bankingTransactionList.add(new BankingTransaction(1, "1", bank, customerRepresentative));
        return bankingTransactionList;
    }

//    Listeye ekleme yapılmasına olanak sağlar.
    public BankingTransaction add(String version, Bank bank, CustomerRepresentative customerRepresentative) {
        int findLastId = bankingTransactionList.stream().max(Comparator.comparing(BankingTransaction::getBankingTransactionid)).get().getBankingTransactionid() + 1;
        BankingTransaction bankingTransaction = new BankingTransaction(findLastId, version, bank, customerRepresentative);
        bankingTransactionList.add(bankingTransaction);
        return bankingTransaction;
    }

//    Tüm elemanları listeler.
    public ArrayList<BankingTransaction> getBankingTransactions() {
        return bankingTransactionList;
    }

//    Belli bir id'ye göre eleman getirir
    public BankingTransaction getBankingTransaction(Integer id) {
        return bankingTransactionList.get(id);
    }

//    Verilen id için silme işlemi yapar
    public void remove(Integer id) {
        bankingTransactionList.remove(id);
    }

//    İstenilen elemanın güncellenmesine olanak sağlar.
    public void update(BankingTransaction bankingTransaction) {
        remove(bankingTransaction.getBankingTransactionid());
        bankingTransactionList.add(bankingTransaction);
    }
}
