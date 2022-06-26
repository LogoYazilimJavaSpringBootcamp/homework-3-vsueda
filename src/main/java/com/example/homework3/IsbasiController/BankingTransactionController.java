package com.example.homework3.IsbasiController;

import com.example.homework3.IsbasiModel.Bank;
import com.example.homework3.IsbasiModel.BankingTransaction;
import com.example.homework3.IsbasiModel.CustomerRepresentative;
import com.example.homework3.IsbasiService.BankService;
import com.example.homework3.IsbasiService.BankingTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
@RequestMapping("/bankingtransaction")
public class BankingTransactionController {
    @Autowired
    BankingTransactionService transactionService;


    @PostMapping(value = "{version}/{bank}/{customerrepresentative}")
    public BankingTransaction add(@PathVariable("versison")String version, Bank bank, CustomerRepresentative customerRepresentative) {
        return transactionService.add(version, bank, customerRepresentative);
    }

    @GetMapping
    public ArrayList<BankingTransaction> getBankingTransactions() {
        return transactionService.getBankingTransactions();
    }


    @GetMapping(value = "/{id}")
    public BankingTransaction getBankingTransaction(Integer id) {
        return transactionService.getBankingTransaction(id);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void remove(@PathParam("id") Integer id) {
        transactionService.remove(id);
    }

    @PutMapping
    public void update(BankingTransaction bankingTransaction) {
        transactionService.update(bankingTransaction);
    }
}
