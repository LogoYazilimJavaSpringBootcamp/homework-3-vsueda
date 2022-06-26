package com.example.homework3.IsbasiController;

import com.example.homework3.IsbasiModel.CustomerRepresentative;
import com.example.homework3.IsbasiService.CustomerRepresentativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
@RequestMapping("/customerrepresentative")
public class CustomerRepresentativeController {
    @Autowired
    CustomerRepresentativeService representativeService;


    @PostMapping(value = "{representativeName}/{representativeBank}/{representativePhone}")
    public CustomerRepresentative add(@PathVariable("representativeName") String representativeName, @PathVariable("representativeBank") String representativeBank, @PathVariable("representativePhone") String representativePhone) {
        return representativeService.add(representativeName, representativeBank, representativePhone);
    }

    @GetMapping
    public ArrayList<CustomerRepresentative> getcustomerRepresentatives() {
        return representativeService.getcustomerRepresentatives();
    }


    @GetMapping(value = "/{id}")
    public CustomerRepresentative getcustomerRepresentative(@PathVariable Integer id) {
        return representativeService.getcustomerRepresentative(id);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void remove(@PathParam("id") Integer id) {
        representativeService.remove(id);
    }

    @PutMapping
    public void update(CustomerRepresentative customerRepresentative) {
        representativeService.update(customerRepresentative);
    }
}
