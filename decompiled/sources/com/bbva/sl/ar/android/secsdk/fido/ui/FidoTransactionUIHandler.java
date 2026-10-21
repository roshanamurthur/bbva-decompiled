package com.bbva.sl.ar.android.secsdk.fido.ui;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.ITransactionUI;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.h;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes8.dex */
public class FidoTransactionUIHandler implements ITransactionUI, FidoSdk.FidoUITransactionCallback {
    private FidoSdk.FidoUITransactionListener fidoUITransactionListener;
    private Semaphore lock;
    private Outcome outcomeResult = Outcome.CANCELED;

    public FidoTransactionUIHandler(@Nullable FidoSdk.FidoUITransactionListener fidoUITransactionListener) {
        if (fidoUITransactionListener != null) {
            this.fidoUITransactionListener = fidoUITransactionListener;
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoUITransactionCallback
    public void onTransactionComplete(boolean z10) {
        if (z10) {
            this.outcomeResult = Outcome.SUCCESS;
        }
        Semaphore semaphore = this.lock;
        if (semaphore != null) {
            semaphore.release();
        }
    }

    @Override // com.noknok.android.client.utils.ITransactionUI
    public final /* synthetic */ Outcome openUI(ActivityProxy activityProxy, String str, String str2, Map map) {
        return h.b(this, activityProxy, str, str2, map);
    }

    @Override // com.noknok.android.client.utils.ITransactionUI
    public Outcome openUI(Activity activity, String str, String str2, Map<String, String> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.ui.FidoTransactionUIHandler.1
            @Override // java.lang.Runnable
            public void run() {
                FidoTransactionUIHandler.this.fidoUITransactionListener.confirmTransaction(FidoTransactionUIHandler.this);
            }
        });
        Semaphore semaphore = new Semaphore(0);
        this.lock = semaphore;
        try {
            semaphore.acquire();
            return this.outcomeResult;
        } catch (InterruptedException unused) {
            return Outcome.FAILURE;
        }
    }
}
