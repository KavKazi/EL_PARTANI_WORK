package com.example.el_partani;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {
    
    EditText student_id,student_name,student_password;
    TextView forgat_password;
    Button login;
    float v=0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        student_id = root.findViewById(R.id.student_id);
        student_password = root.findViewById(R.id.student_password);
        student_name = root.findViewById(R.id.student_name);
        forgat_password = root.findViewById(R.id.forgat_password);
        login = root.findViewById(R.id.log_in_button);

        student_id.setTranslationX(800);
        student_password.setTranslationX(800);
        student_name.setTranslationX(800);
        forgat_password.setTranslationX(800);
        login.setTranslationX(800);

        student_id.setAlpha(v);
        student_password.setAlpha(v);
        student_name.setAlpha(v);
        forgat_password.setAlpha(v);
        login.setAlpha(v);

        student_id.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        student_password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        student_name.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgat_password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        
        return root;
    }
}
