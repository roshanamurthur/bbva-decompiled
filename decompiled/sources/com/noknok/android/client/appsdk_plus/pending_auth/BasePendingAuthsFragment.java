package com.noknok.android.client.appsdk_plus.pending_auth;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes11.dex */
public class BasePendingAuthsFragment extends Fragment {
    protected PendingAuthsController mController;
    protected PendingAuthsViewModel mModel;

    public BasePendingAuthsFragment(PendingAuthsController pendingAuthsController) {
        this.mController = pendingAuthsController;
    }

    public PendingAuthsController getController() {
        return this.mController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PendingAuthsViewModel pendingAuthsViewModel = (PendingAuthsViewModel) new ViewModelProvider(this).get(PendingAuthsViewModel.class);
        this.mModel = pendingAuthsViewModel;
        PendingAuthsController pendingAuthsController = this.mController;
        if (pendingAuthsController == null) {
            this.mController = pendingAuthsViewModel.getController();
        } else {
            pendingAuthsViewModel.setController(pendingAuthsController);
        }
    }
}
