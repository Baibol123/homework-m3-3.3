package com.example.homework_m3_33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView itemContacts;
    private ArrayList<Contact> contact = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        CustomAdapter customAdapter = new CustomAdapter(loadData(contact));
        itemContacts.setAdapter(customAdapter);
    }


    private void initView() {
        itemContacts = findViewById(R.id.rv_contact);
    }


    private ArrayList<Contact> loadData(ArrayList<Contact> contacts) {
        contacts.add(new Contact("Bakyt","Orozbaev"));
        contacts.add(new Contact("Rahmonberdi","Zholdoshev"));
        contacts.add(new Contact("Samat","Yuldashev"));
        contacts.add(new Contact("Kurmanbek","Askarov"));
        contacts.add(new Contact("Adylet","Shermatov"));
        contacts.add(new Contact("Kanat","Baltabaev"));
        contacts.add(new Contact("Myrzakan","Zhoroev"));
        contacts.add(new Contact("Djoomart","Omorov"));
        contacts.add(new Contact("Adis","Abdullaev"));
        contacts.add(new Contact("Asilbek","Aliev"));
        contacts.add(new Contact("Dilara","Usmanova"));
        contacts.add(new Contact("Altinay","Aytmatova"));
        contacts.add(new Contact("Leila","Mamatalieva"));
        contacts.add(new Contact("Jyrgal","Abdulova"));
        contacts.add(new Contact("Kalima","Temirova"));
        contacts.add(new Contact("Ayjan","Ergasheva"));
        return contacts;
    }
}