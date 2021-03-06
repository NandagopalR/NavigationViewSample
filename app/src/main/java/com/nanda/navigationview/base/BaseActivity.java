package com.nanda.navigationview.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import com.nanda.navigationview.R;

/**
 * Created by nandagopal on 2/17/17.
 */
public class BaseActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  public void setNewFragment(Fragment fragment, boolean addToBackStack) {
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.replace(R.id.frame, fragment);
    if (addToBackStack) transaction.addToBackStack(fragment.getClass().getName());
    transaction.commit();
  }
}
