package com.driver.repositary;

import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;

@Repository
public class RepositaryLayer {

    HashMap<String,Hotel> hotelBd = new HashMap<>();

    HashMap<Integer,User> userDb = new HashMap<>();
    public String addHotel(Hotel hotel){
        if(hotel.getHotelName().equals("") || hotel==null || hotelBd.containsKey(hotel.getHotelName())){
            return "FAILURE";
        }
        hotelBd.put(hotel.getHotelName(),hotel);
        return "SUCCESS";
    }

    public Integer addUser(User user){
        userDb.put(user.getaadharCardNo(),user);
        return user.getaadharCardNo();
    }

    public String getHotelWithMostFacilities(){
        String ans="";
        int size=0;
        for(String name:hotelBd.keySet()){
            if(size<hotelBd.get(name).getFacilities().size()){
                size=hotelBd.get(name).getFacilities().size();
                ans=name;
            }
        }
        return ans;
    }


}
