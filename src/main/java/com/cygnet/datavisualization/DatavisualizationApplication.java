package com.cygnet.datavisualization;

import com.cygnet.datavisualization.Config.CsvReader.Dbconn;
import com.cygnet.datavisualization.Config.CsvReader.ReadCSVWithScanner;
import com.cygnet.datavisualization.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.io.IOException;
import java.sql.SQLException;

@SpringBootApplication
public class DatavisualizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatavisualizationApplication.class, args);

		ReadCSVWithScanner scanner=new ReadCSVWithScanner();
		try {
			//System.out.println("hello");
			scanner.read();
			System.out.println("hello");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Dbconn connect = new Dbconn();
		connect.dbconn();
		System.out.println("dbconnection sucess");
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepo repo) throws Exception {
		builder.userDetailsService(new UserDetailsService() {
			@Override
			public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
				return new CustomUserDetails(repo.findByEmail(s));
			}
		});
	}
}


