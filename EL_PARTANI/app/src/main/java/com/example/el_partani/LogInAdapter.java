package com.example.el_partani;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LogInAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;

    public LogInAdapter(@NonNull FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment =new LoginTabFragment();
                return loginTabFragment;
            case 1: 
                SignupTabFragment signupTabFragment= new SignupTabFragment();
                return signupTabFragment;
            default:
                return null;
                
        }
    }

}
