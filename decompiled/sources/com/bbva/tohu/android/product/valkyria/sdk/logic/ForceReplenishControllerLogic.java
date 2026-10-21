package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.ReplenishRejectedException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.UpdateCardResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;

/* JADX INFO: loaded from: classes6.dex */
public class ForceReplenishControllerLogic {
    private static final String TAG = "ForceReplenishControllerLogic";
    private BroadcastManager cardUpdateBroadcastManager;
    private BroadcastManager systemBroadcastManager;

    public ForceReplenishControllerLogic(BroadcastManager broadcastManager, BroadcastManager broadcastManager2) {
        this.systemBroadcastManager = broadcastManager;
        this.cardUpdateBroadcastManager = broadcastManager2;
    }

    public void replenish(String str, String str2, Context context) {
        try {
            LogicFactory.getReplenishLogic(context).doReplenish(str, str2, true, false, context);
        } catch (CryptoInitException e5) {
            e5.getMessage();
            this.systemBroadcastManager.sendBroadcast("TOHU_LOGIN_NEEDED");
        } catch (NetworkNotPresentException unused) {
            this.cardUpdateBroadcastManager.sendBroadcast("TOHU_STATUS_UPDATED", new UpdateCardResponse(str, PaymentStatus.TEMP_DISABLED));
        } catch (ReplenishRejectedException unused2) {
        } catch (TohuSdkException e7) {
            logMessage("Send broadcast TOHU_STATUS_UPDATED with payment NOT_ENABLED");
            this.cardUpdateBroadcastManager.sendBroadcast("TOHU_STATUS_UPDATED", new UpdateCardResponse(str, PaymentStatus.NOT_ENABLED));
            e7.getMessage();
        }
    }

    private void logMessage(String str) {
    }
}
