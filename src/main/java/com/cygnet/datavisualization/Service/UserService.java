package com.cygnet.datavisualization.Service;


import com.cygnet.datavisualization.Model.Role;
import com.cygnet.datavisualization.Model.User;
import com.cygnet.datavisualization.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class UserService
{
    @Autowired
    UserRepo userrepo;
    public boolean RegisterService(String fname,String lname,String email,String password)
    {
        User user=new User();
        user.setFname(fname);
        user.setLname(lname);
        user.setEmail(email);
        user.setPassword(password);
        user.setActive(true);
        user.setRoles(Arrays.asList(new Role("admin")));
        try {
            userrepo.save(user);
            return true;

        }catch(Exception e) {
            return false;
        }

    }

}
