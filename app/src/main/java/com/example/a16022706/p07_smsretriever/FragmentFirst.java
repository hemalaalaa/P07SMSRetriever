package com.example.a16022706.p07_smsretriever;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {

    TextView tvSms;
    Button btnRetrieve;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvSms = (TextView) view.findViewById(R.id.tvFrag1);
        btnRetrieve = (Button) view.findViewById(R.id.btnAddTextFrag1);

        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvSms.getText().toString() + "\n" + "New Data";
                tvSms.setText(data);
            }
        });

        return view;
    }


}
