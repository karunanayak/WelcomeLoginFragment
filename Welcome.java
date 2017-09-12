package com.example.ranu.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Welcome extends Fragment {

    TextView tvStatus;
    Button btnBack;

    public Welcome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_welcome,container,false);
        tvStatus = (TextView) v.findViewById(R.id.tvStatus);
        btnBack = (Button) v.findViewById(R.id.btnBack);

        tvStatus.setText(Login.etUid.getText().toString()+"\n"+Login.etPwd.getText().toString());


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Login();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.frameLayout,fragment);
                transaction.commit();
            }
        });

        return  v;
    }

    }


