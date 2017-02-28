package com.morgan.example.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Morgan on 2017/2/24.
 */
public class HelloAction extends ActionSupport {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String execute() throws Exception {
        return "success";
    }


}
