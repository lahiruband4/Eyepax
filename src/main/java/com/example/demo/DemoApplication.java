package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {




	public static void main(String[] args) {
		JFrame f=new RandomColorCode();
		f.setVisible(true);
		f.setSize(100,120);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringApplication.run(DemoApplication.class, args);
	}

}
