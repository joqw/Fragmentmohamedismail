package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class PashionFragment extends Fragment {

    View view;
    ImageView imagepashion;
    TextView pashiontext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.pashion, container, false);
// get the reference of Button
        imagepashion = (ImageView) view.findViewById(R.id.imagepashion);
        pashiontext=(TextView) view.findViewById(R.id.pashiontext);

// perform setOnClickListener on second Button
        imagepashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "ll", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}