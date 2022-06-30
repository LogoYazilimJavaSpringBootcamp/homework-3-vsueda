package com.example.homework3.IsbasiService;

import com.example.homework3.IsbasiModel.Bank;
import com.example.homework3.IsbasiModel.BankingTransaction;
import com.example.homework3.IsbasiModel.CustomerRepresentative;
import com.example.homework3.IsbasiRepository.BankRepository;
import com.example.homework3.IsbasiRepository.BankingTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankingTransactionService {

    @Autowired
    BankingTransactionRepository transactionRepository;

    public BankingTransaction add(String version, Bank bank, CustomerRepresentative customerRepresentative) {
        return transactionRepository.add(version, bank, customerRepresentative);
    }

    public ArrayList<BankingTransaction> getBankingTransactions() {
        return transactionRepository.getBankingTransactions();
    }

    public BankingTransaction getBankingTransaction(Integer id) {
        return transactionRepository.getBankingTransaction(id);
    }

    public void remove(Integer id) {
        transactionRepository.remove(id);
    }

    public void update(BankingTransaction bankingTransaction) {
        transactionRepository.update(bankingTransaction);
    }
}
