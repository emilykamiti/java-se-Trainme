package com.systechafrica.part2.interfaces;

import java.util.UUID;

public class User {
    private String id;
    private String userid;
    private String username;

    

    
    public User(String userid, String username) {
        this.userid = userid;
        this.username = username;
    }
    public String getId() {
        return id;
    }
    public void setId(String string) {
        this.id = string;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", userid=" + userid + ", username=" + username + "]";
    }
    
    
}
