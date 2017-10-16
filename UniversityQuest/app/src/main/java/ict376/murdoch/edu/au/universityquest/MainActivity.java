package ict376.murdoch.edu.au.universityquest;

import android.app.Activity;
import android.os.Bundle;
import com.idescout.sql.SqlScoutServer;

public class MainActivity extends Activity {

    LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SqlScoutServer.create(this, getPackageName());

        setContentView(R.layout.activity_main);

        // By default Android will retain the fragment objects after rotation
        if (savedInstanceState == null) {
            loginFragment = LoginFragment.newInstance();
            getFragmentManager().beginTransaction().add(R.id.login_fragment_container, loginFragment).commit();




        }else{
            loginFragment = (LoginFragment)getFragmentManager().findFragmentById(R.id.login_fragment_container);
        }
    }

}
