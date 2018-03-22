
package com.cygnet.datavisualization.Controller;

import com.cygnet.datavisualization.Model.Data;
import com.cygnet.datavisualization.Repository.UserRepo;
import com.cygnet.datavisualization.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController
{
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userrepo;
    @CrossOrigin
    @PostMapping("/register")
    public boolean register(@RequestBody Data data)
    {

        return userService.RegisterService(data.fname,data.lname,data.email,data.password);

    }

    @CrossOrigin
    @PostMapping("/getdata")
    public String hello(){
        return "private";
    }


}
