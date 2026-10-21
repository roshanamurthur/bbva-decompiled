package com.bbva.tohu.android.product.valkyria.sdk.services.intents;

import android.content.Intent;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExtraKeys;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.IntentManagerDefaultImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class EnablePaymentIntentService extends JobIntentService {
    public static final int JOB_ID = 100002;
    private static final String TAG = "EnablePaymentIntentService";

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        LogTohu.d(TAG, "Begin Enable payment JOB INTENT SERVICE", new Object[0]);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(IntentManagerDefaultImpl.EXTRA_CARDS_LIST);
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(ExtraKeys.TOHU_EXTRA_CALLBACK);
        String stringExtra = intent.getStringExtra(ExtraKeys.TOHU_EXTRA_PKCS7);
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(getApplicationContext());
        }
        LogicFactory.getEnablePaymentControllerLogic(getApplicationContext()).enablePayment(parcelableArrayListExtra, stringExtra, resultReceiver, getApplicationContext());
    }
}
