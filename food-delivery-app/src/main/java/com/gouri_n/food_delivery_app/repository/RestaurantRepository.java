package com.gouri_n.food_delivery_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gouri_n.food_delivery_app.entity.*;

import java.util.*;


public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    
}
