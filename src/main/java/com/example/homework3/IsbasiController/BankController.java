package com.example.homework3.IsbasiController;

import com.example.homework3.IsbasiModel.Bank;
import com.example.homework3.IsbasiService.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
@RequestMapping("/banks")
public class BankController {
    @Autowired
    BankService bankService;


    @PostMapping(value = "{bankName}/{bankLocation}/{bankPhone}")
    public Bank add(@PathVariable("bankName") String bankName, @PathVariable("bankLocation") String bankLocation, @PathVariable("bankPhone") String bankPhone) {
        return bankService.add(bankName, bankLocation, bankPhone);
    }

    @GetMapping
    public ArrayList<Bank> getBanks() {
        return bankService.getBanks();
    }


    @GetMapping(value = "/{id}")
    public Bank getBank(@PathVariable Integer id) {
        return bankService.getBank(id);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void removeBank(@PathParam("id") Integer id) {
        bankService.removeBank(id);
    }

    @PutMapping
    public void update(Bank bank) {
        bankService.update(bank);
    }
}
