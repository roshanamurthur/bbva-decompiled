package com.noknok.android.client.utils;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwner;
import com.noknok.android.common.R;
import com.noknok.android.common.databinding.NnlDialogProgressBinding;

/* JADX INFO: loaded from: classes11.dex */
public class ProgressObserver implements IProgressObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AlertDialog f63465a;

    public ProgressObserver(Activity activity) {
        NnlDialogProgressBinding nnlDialogProgressBindingInflate = NnlDialogProgressBinding.inflate(activity.getLayoutInflater());
        new ViewWrapper(nnlDialogProgressBindingInflate.getRoot()).onShow();
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity, R.style.Theme_AppCompat_Dialog).setView(nnlDialogProgressBindingInflate.getRoot()).setCancelable(false).create();
        this.f63465a = alertDialogCreate;
        alertDialogCreate.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override // com.noknok.android.client.utils.IProgressObserver
    public void disable() {
        onChanged(Boolean.FALSE);
        ProgressIndicator.getInstance().getLiveData().removeObserver(this);
    }

    @Override // com.noknok.android.client.utils.IProgressObserver
    public void enable(LifecycleOwner lifecycleOwner) {
        ProgressIndicator.getInstance().getLiveData().observe(lifecycleOwner, this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.noknok.android.client.utils.IProgressObserver, androidx.lifecycle.Observer
    public void onChanged(@Nullable Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            if (this.f63465a.isShowing()) {
                return;
            }
            this.f63465a.show();
        } else if (this.f63465a.isShowing()) {
            this.f63465a.dismiss();
        }
    }
}
