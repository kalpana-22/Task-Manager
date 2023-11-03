package com.tasks.accessingdatarest.Service;

import com.tasks.accessingdatarest.Dao.UserDao;
import com.tasks.accessingdatarest.Model.Tasks;
import com.tasks.accessingdatarest.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public ResponseEntity<User> getuserByUserId(int userId) {
        try {
            return new ResponseEntity<>(userDao.findById(userId).get(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new User(), HttpStatus.BAD_REQUEST);
    }
}
