package com.example.homework3.IsbasiService;

import com.example.homework3.IsbasiModel.CustomerRepresentative;
import com.example.homework3.IsbasiRepository.CustomerRepresentativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerRepresentativeService {
    @Autowired
    CustomerRepresentativeRepository representativeRepository;

    public CustomerRepresentative add(String customerRepresentativeName, String customerRepresentativeBank, String customerRepresentativePhone) {
        return representativeRepository.add(customerRepresentativeName, customerRepresentativeBank, customerRepresentativePhone);
    }

    public ArrayList<CustomerRepresentative> getcustomerRepresentatives() {
        return representativeRepository.getcustomerRepresentatives();
    }

    public CustomerRepresentative getcustomerRepresentative(Integer id) {
        return representativeRepository.getcustomerRepresentative(id);
    }

    public void remove(Integer id) {
        representativeRepository.remove(id);
    }

    public void update(CustomerRepresentative customerRepresentative) {
        representativeRepository.update(customerRepresentative);
    }
}
