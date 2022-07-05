package com.hrodriguesdev.seriral.properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SerialProperties {
    private String porta;
    private int baud = 0;
    private int timeout = 0;
    private int stopBits = 0;


	public String getPorta() {
        return porta;
    }

    public int getBaud() {
        return baud;
    }

    public int getTimeout() {
        return timeout;
    }
    
    public int getStopBits() {
        return stopBits;
    }

	public String getParidade() {
		return paridade;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}
	
}
