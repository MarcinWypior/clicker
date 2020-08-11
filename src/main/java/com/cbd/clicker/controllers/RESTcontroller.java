package com.cbd.clicker.controllers;


import com.cbd.clicker.entities.User;
import com.cbd.clicker.reposititories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RESTcontroller {
    private UserRepository userRepository;

    public RESTcontroller(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @GetMapping("money/{user_id}/{amount}")
    public String addMoney(@PathVariable Long user_id,@PathVariable int amount){
        User user = userRepository.findById(user_id).get();
        user.setMoney(user.getMoney()+amount);
        userRepository.save(user);
        return user.toString();
    }

    @GetMapping("air/{user_id}/{amount}")
    public String addAir(@PathVariable Long user_id,@PathVariable int amount){
        User user = userRepository.findById(user_id).get();
        user.setAir(user.getAir()+amount);
        userRepository.save(user);
        return user.toString();
    }

    @GetMapping("soil/{user_id}/{amount}")
    public String addSoil(@PathVariable Long user_id,@PathVariable int amount){
        User user = userRepository.findById(user_id).get();
        user.setSoil(user.getSoil()+amount);
        userRepository.save(user);
        return user.toString();
    }

    @GetMapping("water/{user_id}/{amount}")
    public String addWater(@PathVariable Long user_id,@PathVariable int amount){
        User user = userRepository.findById(user_id).get();
        user.setWater(user.getWater()+amount);
        userRepository.save(user);
        return user.toString();
    }

    @GetMapping("light/{user_id}/{amount}")
    public String addLight(@PathVariable Long user_id,@PathVariable int amount){
        User user = userRepository.findById(user_id).get();
        user.setLight(user.getLight()+amount);
        userRepository.save(user);
        return user.toString();
    }


}
