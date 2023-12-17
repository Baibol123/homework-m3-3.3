package com.example.homework_m3_33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewContactName;
    private TextView textViewContact;
    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);

    }
    private void initView(View itemView) {
        textViewContactName = itemView.findViewById(R.id.textViewContactName);
        textViewContact = itemView.findViewById(R.id.textViewContact);
    }

    public void onBind(String contactName, String contactSurname) {
        String fullName = contactName + " " + contactSurname;
        textViewContactName.setText(fullName);
        if (contactName.length() > 1 && contactSurname.length() > 1) {
            String initials = contactName.substring(0, 1) + contactSurname.charAt(0);
            textViewContact.setText(initials);
        }
    }
}
