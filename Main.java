package com.gmail.dmytrohrytsenko5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String str;

//        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DmytroHrytsenko\\IdeaProjects\\ParcerJson\\src\\com\\gmail\\dmytrohrytsenko5\\parsejson.json"))){
//            while((str = reader.readLine()) != null){
//                result.append(str);
//            }
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        String json = "";
        try (RandomAccessFile file = new RandomAccessFile("C:\\Users\\DmytroHrytsenko\\IdeaProjects\\ParcerJson\\src\\com\\gmail\\dmytrohrytsenko5\\json.txt" , "r")){
            byte[] buffer = new byte[(int)file.length()];
            file.read(buffer);
            json = new String(buffer);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        Gson gson = new GsonBuilder().create();
//        Person person = (Person)gson.fromJson(result.toString(),Person.class);
//        Adress adress = (Adress)gson.fromJson(result.toString(),Adress.class);
//
//        System.out.println(person.toString());
//        System.out.println(adress.toString());
        Person person = gson.fromJson(json, Person.class);
        Adress adress = gson.fromJson(json, Adress.class);

        System.out.println(person);
        System.out.println(adress);

    }
}
