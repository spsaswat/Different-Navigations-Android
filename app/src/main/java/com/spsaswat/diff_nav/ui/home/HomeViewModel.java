package com.spsaswat.diff_nav.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Saswat Panda Welcomes you to the\n home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}