package com.example.homework_m3_33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<ContactsViewHolder> {
    private final ArrayList<Contact> contactData;

    public CustomAdapter(ArrayList<Contact> contactData) {
        this.contactData = contactData;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.onBind(contactData.get(position).getName(), contactData.get(position).getSurname());
    }

    @Override
    public int getItemCount() {
        return contactData.size();
    }
}
