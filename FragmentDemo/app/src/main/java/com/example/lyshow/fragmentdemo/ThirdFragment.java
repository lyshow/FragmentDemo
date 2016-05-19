package com.example.lyshow.fragmentdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by lyshow on 16/5/19.
 */
public class ThirdFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_third;
    }

    private ImageView backIMg;

    public static ThirdFragment newInstance() {

        return new ThirdFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

        backIMg = (ImageView) view.findViewById(R.id.third_back);
        backIMg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeFragment();
            }
        });

    }


}
