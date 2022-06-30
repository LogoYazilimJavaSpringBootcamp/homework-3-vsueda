package com.example.homework3.IsbasiService;

import com.example.homework3.IsbasiModel.Bank;
import com.example.homework3.IsbasiRepository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public Bank add(String bankName, String bankLocation, String bankPhone) {
        return bankRepository.add(bankName, bankLocation, bankPhone);
    }

    public ArrayList<Bank> getBanks() {
        return bankRepository.getBanks();
    }

    public Bank getBank(Integer bankId) {
        return bankRepository.getBank(bankId);
    }

    public void removeBank(Integer bankId) {
        bankRepository.removeBank(bankId);
    }

    public void update(Bank bank) {
        bankRepository.update(bank);
    }
}
