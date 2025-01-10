/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.servlet;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author trainer
 */

public class WebController implements Serializable {
    private String text;

    public WebController() {
        text="Greeting from Webctroller am "+LocalDateTime.now();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
    
}
