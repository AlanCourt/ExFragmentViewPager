package com.example.iossenac.exfragmentviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by iossenac on 15/07/17.
 */

public class ScreenSlidePageFragment extends Fragment {

    public static ScreenSlidePageFragment newInstance(int position){

     ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        TextView txtFrag = (TextView) rootView.findViewById(R.id.txtFrag);
        switch (getArguments().getInt("position")){

            case 0:
                txtFrag.setText(R.string.lorem_ipsum_1);
                break;
            case 1:
                txtFrag.setText(R.string.lorem_ipsum_2);
                break;
            case 2:
                txtFrag.setText(R.string.lorem_ipsum_3);
                break;
            case 3:
                txtFrag.setText(R.string.lorem_ipsum_4);
                break;
            case 4:
                txtFrag.setText(R.string.lorem_ipsum_5);
                break;

        }

        return rootView;
    }
}
