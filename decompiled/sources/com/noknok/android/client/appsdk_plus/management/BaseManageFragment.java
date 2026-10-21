package com.noknok.android.client.appsdk_plus.management;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes11.dex */
public class BaseManageFragment extends Fragment {
    protected ManageRegistrationController mController;
    protected ManageRegistrationViewModel mModel;

    public BaseManageFragment(ManageRegistrationController manageRegistrationController) {
        this.mController = manageRegistrationController;
    }

    public ManageRegistrationController getController() {
        return this.mController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ManageRegistrationViewModel manageRegistrationViewModel = (ManageRegistrationViewModel) new ViewModelProvider(this).get(ManageRegistrationViewModel.class);
        this.mModel = manageRegistrationViewModel;
        ManageRegistrationController manageRegistrationController = this.mController;
        if (manageRegistrationController == null) {
            this.mController = manageRegistrationViewModel.getController();
        } else {
            manageRegistrationViewModel.setController(manageRegistrationController);
        }
    }
}
