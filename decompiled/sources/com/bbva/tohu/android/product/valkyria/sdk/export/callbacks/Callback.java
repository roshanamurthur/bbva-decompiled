package com.bbva.tohu.android.product.valkyria.sdk.export.callbacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Callback extends ResultReceiver {
    public Callback() {
        super(new Handler());
    }

    public abstract void onFailure(int i10, Bundle bundle);

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 4) {
            onSuccess(bundle);
        } else {
            onFailure(i10, bundle);
        }
    }

    public abstract void onSuccess(Bundle bundle);
}
