package com.driver.service;

import com.driver.model.Hotel;
import com.driver.model.User;
import com.driver.repositary.RepositaryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

    @Autowired
    RepositaryLayer repo;

    public String addHotel(Hotel hotel){
        return repo.addHotel(hotel);
    }

    public Integer addUser(User user){
        return repo.addUser(user);
    }

    public String getHotelWithMostFacilities(){
        return repo.getHotelWithMostFacilities();
    }
}
