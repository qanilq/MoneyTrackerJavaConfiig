package com.hcl.anil.mt.service;

import com.hcl.anil.mt.dto.User;
import org.springframework.stereotype.Service;

/**
 * Created by M ANIL KUMAR on 02-05-2015.
 */
@Service("loginService")
public class LoginService {

    public boolean authenticateUser(User user){
        boolean isAuthenticated =false;
        if( "test".equals(user.getUserName()) &&
                "test".equals(user.getPassword()) ){
            isAuthenticated=true;
        }
        return isAuthenticated;
    }
}
