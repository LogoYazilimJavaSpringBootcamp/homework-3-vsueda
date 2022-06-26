package com.example.homework3.IsbasiRepository;

import com.example.homework3.IsbasiModel.CustomerRepresentative;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;

@Repository
public class CustomerRepresentativeRepository {

    private ArrayList<CustomerRepresentative> customerRepresentativeList = new ArrayList<>(initialize());

    //    Başlangıçta listeyi doldurmayı sağlayan metot.
    public ArrayList<CustomerRepresentative> initialize() {
        customerRepresentativeList = new ArrayList<>();
        customerRepresentativeList.add(new CustomerRepresentative(1, "Sueda", "Garanti", "444"));
        return customerRepresentativeList;
    }

    //    Listeye ekleme yapılmasına olanak sağlar.
    public CustomerRepresentative add(String customerRepresentativeName, String customerRepresentativeBank, String customerRepresentativePhone) {
        int findLastId = customerRepresentativeList.stream().max(Comparator.comparing(CustomerRepresentative::getCustomerRepresentativeid)).get().getCustomerRepresentativeid() + 1;
        CustomerRepresentative customerRepresentative = new CustomerRepresentative(findLastId, customerRepresentativeName, customerRepresentativeBank, customerRepresentativePhone);
        customerRepresentativeList.add(customerRepresentative);
        return customerRepresentative;
    }

    //    Tüm elemanları listeler.
    public ArrayList<CustomerRepresentative> getcustomerRepresentatives() {
        return customerRepresentativeList;
    }

    //    Belli bir id'ye göre eleman getirir
    public CustomerRepresentative getcustomerRepresentative(Integer id) {
        return customerRepresentativeList.get(id);
    }

    //    Verilen id için silme işlemi yapar
    public void remove(Integer id) {
        customerRepresentativeList.remove(id);
    }

    //    İstenilen elemanın güncellenmesine olanak sağlar.
    public void update(CustomerRepresentative customerRepresentative) {
        remove(customerRepresentative.getCustomerRepresentativeid());
        customerRepresentativeList.add(customerRepresentative);
    }
}
