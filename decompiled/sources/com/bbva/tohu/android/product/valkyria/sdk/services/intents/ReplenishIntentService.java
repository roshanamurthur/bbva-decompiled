package com.bbva.tohu.android.product.valkyria.sdk.services.intents;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExtraKeys;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishIntentService extends JobIntentService {
    public static final int JOB_ID = 100001;
    private static final String TAG = "ReplenishIntentService";

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        LogTohu.d(TAG, "Begin Replenish JOB INTENT SERVICE", new Object[0]);
        Bundle extras = intent.getExtras();
        String string = extras.getString(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE);
        boolean z10 = extras.getBoolean(ExtraKeys.TOHU_EXTRA_NEED_NOTIFY_REPLENISH);
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(getApplicationContext());
        }
        LogicFactory.getReplenishControllerLogic(getApplicationContext()).replenish(string, z10, getApplicationContext());
    }
}
