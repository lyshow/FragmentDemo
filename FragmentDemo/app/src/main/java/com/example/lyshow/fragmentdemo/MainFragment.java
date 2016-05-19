package com.example.lyshow.fragmentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lyshow on 16/5/19.
 */
public class MainFragment extends BaseFragment {

    private Button mainBtn, mainSecondBtn,mainTabBtn;

    public static MainFragment newInstance() {
        return new MainFragment();
    }


    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        mainBtn = (Button) view.findViewById(R.id.main_btn);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle data = new Bundle();
                data.putString("username", "lyshow");
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                intent.putExtras(data);
                startActivity(intent);

            }
        });

        mainSecondBtn = (Button) view.findViewById(R.id.main_second_btn);
        mainSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(SecondFragment.newInstance("从首界面跳转过来的"));
            }
        });

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }
}
