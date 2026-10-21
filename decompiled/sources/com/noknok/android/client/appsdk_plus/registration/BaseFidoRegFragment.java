package com.noknok.android.client.appsdk_plus.registration;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes11.dex */
public class BaseFidoRegFragment extends Fragment {
    protected FidoRegistrationController mController;
    protected FidoRegistrationViewModel mModel;

    public BaseFidoRegFragment(FidoRegistrationController fidoRegistrationController) {
        this.mController = fidoRegistrationController;
    }

    public FidoRegistrationController getController() {
        return this.mController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FidoRegistrationViewModel fidoRegistrationViewModel = (FidoRegistrationViewModel) new ViewModelProvider(this).get(FidoRegistrationViewModel.class);
        this.mModel = fidoRegistrationViewModel;
        FidoRegistrationController fidoRegistrationController = this.mController;
        if (fidoRegistrationController == null) {
            this.mController = fidoRegistrationViewModel.getController();
        } else {
            fidoRegistrationViewModel.setController(fidoRegistrationController);
        }
    }
}
