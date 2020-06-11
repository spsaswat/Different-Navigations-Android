package com.spsaswat.diff_nav.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Saswat Panda Welcomes you to the notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}