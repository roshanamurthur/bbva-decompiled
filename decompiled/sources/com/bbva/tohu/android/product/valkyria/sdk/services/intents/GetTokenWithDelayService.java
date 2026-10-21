package com.bbva.tohu.android.product.valkyria.sdk.services.intents;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExtraKeys;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.OperationLockManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;

/* JADX INFO: loaded from: classes6.dex */
public class GetTokenWithDelayService extends JobIntentService {
    private static final Long DELAY_TO_GET_TOKEN = 30000L;
    public static final int JOB_ID = 100009;
    private static final String TAG = "GetTokenWithDelayService";
    private DatabaseManager databaseManager;
    private OperationLockManager operationLockManager;

    private boolean existsTokenInDb(String str) {
        try {
            this.databaseManager.getTokenByCardUniqueReference(str);
            return true;
        } catch (NotFoundEntityException e5) {
            LogTohu.d(TAG, "NotFoundEntityException" + e5, new Object[0]);
            return false;
        }
    }

    private void initManagersAndUtils(Context context) {
        this.databaseManager = ManagerFactory.getDatabaseManager();
        this.operationLockManager = ManagerFactory.getOperationLockManager(context);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        LogTohu.d(TAG, "Started GetTokenWithDelayService JOB INTENT SERVICE", new Object[0]);
        try {
            Thread.sleep(DELAY_TO_GET_TOKEN.longValue());
        } catch (InterruptedException unused) {
            LogTohu.d(TAG, "Exception on Get Token With Delay sleeping thread", new Object[0]);
        }
        LogTohu.d(TAG, "Begin GetTokenWithDelayService JOB INTENT SERVICE after sleep", new Object[0]);
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(getApplicationContext());
        }
        initManagersAndUtils(getApplicationContext());
        String stringExtra = intent.getStringExtra(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE);
        if (existsTokenInDb(stringExtra)) {
            return;
        }
        try {
            if (this.operationLockManager.lock(stringExtra)) {
                try {
                    LogicFactory.getTokenLogic(getApplicationContext()).getToken(stringExtra, getApplicationContext());
                } catch (CryptoInitException e5) {
                    LogTohu.d(TAG, "CryptoInitException on Get Token With Delay", new Object[0]);
                    ManagerFactory.getBroadCastSystemNotification().sendBroadcast(e5);
                } catch (TohuSdkException unused2) {
                    LogTohu.d(TAG, "Exception on Get Token With Delay", new Object[0]);
                }
            }
        } finally {
            this.operationLockManager.unlock(stringExtra);
        }
    }
}
