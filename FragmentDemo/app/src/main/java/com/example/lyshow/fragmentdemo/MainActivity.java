package com.example.lyshow.fragmentdemo;

import android.os.Bundle;

/**
 * Created by lyshow on 16/5/19.
 */
public class MainActivity extends AppActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return MainFragment.newInstance();
    }
}
