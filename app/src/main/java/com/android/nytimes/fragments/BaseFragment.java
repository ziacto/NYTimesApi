package com.android.nytimes.fragments;

import android.app.Activity;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.nytimes.MainActivity;



public abstract class BaseFragment extends Fragment {
    protected MainActivity getMainActivity() {
        return (MainActivity) getActivity();
    }

    protected abstract String setTitle();

    @Override
    public void onResume() {
        super.onResume();
        getMainActivity().bindingViews.toolbar.setTitle(setTitle(), true);
    }

}
