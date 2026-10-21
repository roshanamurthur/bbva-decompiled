package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.ResponseCodes;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.logic.DeleteCardLogic;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;
import com.bbva.tohu.android.product.valkyria.sdk.utils.ForceDigitizeMessage;
import com.google.gson.Gson;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ForceDigitizeMessageManagerImpl implements MessageManager {
    private static final String MESSAGE_FORCE_DIGITIZE = "Message force digitize %s";
    public static final String TAG = "ForceDigitizeMessageManagerImpl";
    private BroadcastManager broadcastSystemNotification;
    private DeleteCardLogic deleteCardLogic;
    private Gson gson;

    public ForceDigitizeMessageManagerImpl(DeleteCardLogic deleteCardLogic, BroadcastManager broadcastManager, Gson gson) {
        this.deleteCardLogic = deleteCardLogic;
        this.broadcastSystemNotification = broadcastManager;
        this.gson = gson;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager
    public void processMessage(String str, Context context) throws TohuSdkException {
        LogTohu.d(TAG, MESSAGE_FORCE_DIGITIZE, str);
        ForceDigitizeMessage forceDigitizeMessage = (ForceDigitizeMessage) new Gson().fromJson(str, ForceDigitizeMessage.class);
        if (forceDigitizeMessage == null || forceDigitizeMessage.getListCardUniqueReference() == null || forceDigitizeMessage.getListCardUniqueReference().isEmpty()) {
            return;
        }
        List<String> listCardUniqueReference = forceDigitizeMessage.getListCardUniqueReference();
        for (String str2 : listCardUniqueReference) {
            if (str2 != null) {
                this.deleteCardLogic.deleteCardLocal(str2);
            }
        }
        this.broadcastSystemNotification.sendBroadcast(ResponseCodes.TOHU_ENABLE_CARD_NEEDED, listCardUniqueReference);
    }
}
