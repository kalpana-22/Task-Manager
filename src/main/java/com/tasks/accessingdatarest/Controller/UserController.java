package com.tasks.accessingdatarest.Controller;

import com.tasks.accessingdatarest.Model.Tasks;
import com.tasks.accessingdatarest.Model.User;
import com.tasks.accessingdatarest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("userId")
    public ResponseEntity<User> getUserById(@RequestParam int userId){
        return userService.getuserByUserId(userId);
    }
}
