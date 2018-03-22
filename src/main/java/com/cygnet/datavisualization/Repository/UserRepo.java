package com.cygnet.datavisualization.Repository;

import com.cygnet.datavisualization.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;


public interface UserRepo extends JpaRepository<User,Long>{
    User findByEmail(String email);

}
