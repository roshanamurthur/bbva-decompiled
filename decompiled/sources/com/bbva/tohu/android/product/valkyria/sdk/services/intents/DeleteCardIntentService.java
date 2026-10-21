package com.bbva.tohu.android.product.valkyria.sdk.services.intents;

import android.content.Intent;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExtraKeys;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteCardIntentService extends JobIntentService {
    public static final int JOB_ID = 100003;
    private static final String TAG = "DeleteCardIntentService";

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        LogTohu.d(TAG, "Begin Delete card JOB INTENT SERVICE", new Object[0]);
        String stringExtra = intent.getStringExtra(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE);
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(ExtraKeys.TOHU_EXTRA_CALLBACK);
        LogicFactory.getDeleteCardControllerLogic(getApplicationContext()).deleteCard(stringExtra, intent.getStringExtra(ExtraKeys.TOHU_EXTRA_PKCS7), resultReceiver);
    }
}
