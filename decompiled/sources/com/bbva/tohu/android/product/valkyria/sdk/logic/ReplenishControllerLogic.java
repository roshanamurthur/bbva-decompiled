package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.DeviceSecurityDisabledException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.ReplenishRejectedException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishControllerLogic {
    private static final String TAG = "ReplenishControllerLogic";
    private final String PAYMENT = "0";
    private BroadcastManager systemNotifications;
    private UserSharedPreferencesManager userSharedPreferencesManager;

    public ReplenishControllerLogic(UserSharedPreferencesManager userSharedPreferencesManager, BroadcastManager broadcastManager) {
        this.userSharedPreferencesManager = userSharedPreferencesManager;
        this.systemNotifications = broadcastManager;
    }

    public void replenish(String str, boolean z10, Context context) {
        try {
            LogicFactory.getReplenishLogic(context).doReplenish(str, "0", false, z10, context);
        } catch (CryptoInitException e5) {
            LogTohu.d(TAG, "(Replenish KO) CryptoInitException at Replenish" + e5.getMessage(), new Object[0]);
            this.systemNotifications.sendBroadcast("TOHU_LOGIN_NEEDED");
        } catch (DeviceSecurityDisabledException unused) {
            LogTohu.d(TAG, "INSECURE DEVICE detected during replenish", new Object[0]);
            this.systemNotifications.sendBroadcast("TOHU_DETECTED_ROOTED_DEVICE");
        } catch (NetworkNotPresentException unused2) {
            LogTohu.d(TAG, "(Replenish KO) Error Replenish for NetworkNotPresentException.", new Object[0]);
        } catch (ReplenishRejectedException unused3) {
            LogTohu.d(TAG, "Too many requests with reason: PAYMENT", new Object[0]);
        } catch (TohuSdkException e7) {
            LogTohu.d(TAG, "(Replenish KO) Error Replenish TohuSdkException." + e7.getMessage(), new Object[0]);
        }
    }
}
