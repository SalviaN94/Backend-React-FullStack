package com.nick.apirestcursofullstack.logger;

import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;

@Component
public class Writer {

    BufferedWriter bufferedWriter;

    public Writer(){
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("PetitionLogs.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeLog(String message){
        try {
            bufferedWriter.write(message);
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
