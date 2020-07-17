package com.tracking.tas2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentData extends Fragment {

    TextView tv_longitud1, tv_latitud1;

    public FragmentData() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_data, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv_longitud1 = (TextView) Objects.requireNonNull(getView()).findViewById(R.id.tv_longitud);
        tv_latitud1 = (TextView) Objects.requireNonNull(getView()).findViewById(R.id.tv_latitud);

        tv_longitud1.setText("HELLO - MACARRON");
        tv_latitud1.setText("HAyyy");
    }

}
