package ict376.murdoch.edu.au.universityquest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by yangchengyu on 2017/10/16.
 */

public class LoginFragment extends Fragment{

    View    mLayoutView;

    Button Button_Login;
    Button Button_Regist;

    /**
     * Create a new instance of DetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static LoginFragment newInstance() {

        LoginFragment f = new LoginFragment();

        // Supply index input as an argument.
        // Google recommends using bundles to pass in arguments
        /*Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);*/

        return f;
    }

    // Retrieve the index of the contact that will be displayed
    public int getShownIndex() {

        return getArguments().getInt("index", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        mLayoutView = inflater.inflate(R.layout.login_page, null);

        return mLayoutView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        // setting the listeners for the buttons
        Button_Login   = (Button) getActivity().findViewById(R.id.button_login);
        Button_Regist   = (Button) getActivity().findViewById(R.id.button_regist);


    }
}
