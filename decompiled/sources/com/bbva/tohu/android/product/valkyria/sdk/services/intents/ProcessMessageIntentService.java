package com.bbva.tohu.android.product.valkyria.sdk.services.intents;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExtraKeys;
import com.bbva.tohu.android.product.valkyria.sdk.export.beans.PushMessage;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class ProcessMessageIntentService extends JobIntentService {
    public static final int JOB_ID = 101001;
    private static final String TAG = "ProcessMessageIntentService";

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        LogTohu.d(TAG, "Begin process message JOB INTENT SERVICE", new Object[0]);
        ManagerFactory.getMessagesManager(getApplicationContext()).processMessage((PushMessage) intent.getParcelableExtra(ExtraKeys.TOHU_EXTRA_PUSH_MESSAGE), getApplicationContext());
    }
}
