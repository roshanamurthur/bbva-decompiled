package com.bbva.tohu.android.product.valkyria.sdk.export.callbacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TohuCallbackErrors extends ResultReceiver {
    public static final String CARD_UNIQUE_REFERENCE_KEY = "cardUniqueReference";

    public TohuCallbackErrors() {
        super(new Handler());
    }

    public abstract void internalError(Bundle bundle);

    public abstract void loginNeeded(Bundle bundle);

    public abstract void networkNotPresent(Bundle bundle);

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 0) {
            loginNeeded(bundle);
            return;
        }
        if (i10 == 1) {
            networkNotPresent(bundle);
        } else if (i10 == 2) {
            temporarilyUnavailable(bundle);
        } else {
            if (i10 != 3) {
                return;
            }
            internalError(bundle);
        }
    }

    public abstract void temporarilyUnavailable(Bundle bundle);
}
