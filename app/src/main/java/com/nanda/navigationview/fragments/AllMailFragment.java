package com.nanda.navigationview.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nanda.navigationview.R;
import com.nanda.navigationview.base.BaseFragment;

public class AllMailFragment extends BaseFragment {

  @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_all_mail, container, false);
  }
}
