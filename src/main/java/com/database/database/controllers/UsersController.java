package com.database.database.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.database.database.models.Users;

@Controller
public class UsersController {
    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("retrieving all users");
        //ToDo: get all users from database
        List<Users> users = new ArrayList<>();
        //end database call
        model.addAttribute("us", users);
        return "users/showAll";
    }
}
