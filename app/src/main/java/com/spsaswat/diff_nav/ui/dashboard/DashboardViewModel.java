package com.spsaswat.diff_nav.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Saswat Panda Welcomes you to the dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}