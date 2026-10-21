package com.bbva.tohu.android.product.valkyria.sdk.export.callbacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TohuCallbackWithAsoAuthentication extends TohuCallback {
    public abstract void asoAuthenticationNeeded(Bundle bundle);

    public abstract void asoAuthenticationValueNeeded(Bundle bundle);

    @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback, com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors, android.os.ResultReceiver
    public void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 9) {
            asoAuthenticationNeeded(bundle);
        } else if (i10 == 10) {
            asoAuthenticationValueNeeded(bundle);
        } else {
            super.onReceiveResult(i10, bundle);
        }
    }
}
