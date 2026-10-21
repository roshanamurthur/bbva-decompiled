package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import androidx.camera.core.impl.utils.a;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ForceReplenishControllerLogic;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;
import com.bbva.tohu.android.product.valkyria.sdk.utils.ReplenishNeededMessage;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishNeededMessageManagerImpl implements MessageManager {
    private static final String MESSAGE_REPLENISH_NEEDED = "Message replenish needed with data %s";
    private static final String MESSAGE_REPLENISH_NEEDED_TYPE_WITH_DATA_PAYLOAD = "Message replenish needed type with data payload: %s";
    private static final String MESSAGE_REPLENIS_NEEDED_COMES_WITHOUD_CARD_UNIQUE_REFERENCE = "Message replenish needed without card unique reference - Replenish will not be called";
    public static final String TAG = "ReplenishNeededMessageManagerImpl";
    public static final String TTL_TYPE = "1";
    private final ForceReplenishControllerLogic forceReplenishControllerLogic;

    public ReplenishNeededMessageManagerImpl(ForceReplenishControllerLogic forceReplenishControllerLogic) {
        this.forceReplenishControllerLogic = forceReplenishControllerLogic;
    }

    private String getTypeReplenishNeededMessage(ReplenishNeededMessage replenishNeededMessage) {
        return (replenishNeededMessage.getType() == null || replenishNeededMessage.getType().isEmpty()) ? "1" : replenishNeededMessage.getType();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager
    public void processMessage(String str, Context context) {
        String str2 = TAG;
        LogTohu.d(str2, MESSAGE_REPLENISH_NEEDED, str);
        ReplenishNeededMessage replenishNeededMessage = (ReplenishNeededMessage) new Gson().fromJson(str, ReplenishNeededMessage.class);
        if (replenishNeededMessage == null || replenishNeededMessage.getCardUniqueReference() == null || replenishNeededMessage.getCardUniqueReference().isEmpty()) {
            LogTohu.d(str2, MESSAGE_REPLENIS_NEEDED_COMES_WITHOUD_CARD_UNIQUE_REFERENCE, new Object[0]);
            return;
        }
        String cardUniqueReference = replenishNeededMessage.getCardUniqueReference();
        String typeReplenishNeededMessage = getTypeReplenishNeededMessage(replenishNeededMessage);
        LogTohu.d(str2, MESSAGE_REPLENISH_NEEDED_TYPE_WITH_DATA_PAYLOAD, a.b(cardUniqueReference, " type : ", typeReplenishNeededMessage));
        this.forceReplenishControllerLogic.replenish(cardUniqueReference, typeReplenishNeededMessage, context);
    }
}
