package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExtraKeys;
import com.bbva.tohu.android.product.valkyria.sdk.export.beans.PushMessage;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.DeleteCardIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.DeleteDeviceIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.EnablePaymentIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.GetTokenWithDelayService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.GetTransactionHistoryIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.InitIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.ProcessMessageIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.ReplenishIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.SuspendTokenIntentService;
import com.bbva.valkyria.sdk.services.AndroidHceService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class IntentManagerDefaultImpl implements IntentManager {
    public static final String EXTRA_CARDS_LIST = "CARDS_LIST";
    public static final String TAG = "IntentManagerDefaultImpl";
    private Context context;
    private SerializerService serializerService;

    public IntentManagerDefaultImpl(Context context, SerializerService serializerService) {
        this.context = context;
        this.serializerService = serializerService;
    }

    @NonNull
    private String getCardEmulationDescription(int i10) {
        if (i10 == 0) {
            return "checkDefaultApp: SELECTION_MODE_PREFER_DEFAULT";
        }
        if (i10 != 1) {
            return i10 != 2 ? "checkDefaultApp: Unknown SELECTION_MODE" : "checkDefaultApp: SELECTION_MODE_ASK_IF_CONFLICT";
        }
        return "checkDefaultApp: SELECTION_MODE_ALWAYS_ASK";
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void deleteCard(String str, String str2, TohuCallbackErrors tohuCallbackErrors) {
        Intent intent = new Intent(this.context, (Class<?>) DeleteCardIntentService.class);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE, str);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CALLBACK, tohuCallbackErrors);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_PKCS7, str2);
        JobIntentService.enqueueWork(this.context, (Class<?>) DeleteCardIntentService.class, DeleteCardIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void deleteDevice(String str, TohuCallback tohuCallback) {
        Intent intent = new Intent(this.context, (Class<?>) DeleteDeviceIntentService.class);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CALLBACK, tohuCallback);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_PKCS7, str);
        JobIntentService.enqueueWork(this.context, (Class<?>) DeleteDeviceIntentService.class, DeleteDeviceIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void enablePayment(List<Card> list, String str, TohuCallbackErrors tohuCallbackErrors) {
        Intent intent = new Intent(this.context, (Class<?>) EnablePaymentIntentService.class);
        intent.putParcelableArrayListExtra(EXTRA_CARDS_LIST, (ArrayList) list);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CALLBACK, tohuCallbackErrors);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_PKCS7, str);
        JobIntentService.enqueueWork(this.context, (Class<?>) EnablePaymentIntentService.class, EnablePaymentIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void getTokenWithDelay(String str) {
        Intent intent = new Intent(this.context, (Class<?>) GetTokenWithDelayService.class);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE, str);
        JobIntentService.enqueueWork(this.context, (Class<?>) GetTokenWithDelayService.class, GetTokenWithDelayService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void getTransactionHistory(String str, String str2, TohuCallback tohuCallback) {
        Intent intent = new Intent(this.context, (Class<?>) GetTransactionHistoryIntentService.class);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE, str);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CALLBACK, tohuCallback);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_PKCS7, str2);
        JobIntentService.enqueueWork(this.context, (Class<?>) GetTransactionHistoryIntentService.class, GetTransactionHistoryIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void init(TohuCallback tohuCallback, String str) {
        Intent intent = new Intent(this.context, (Class<?>) InitIntentService.class);
        intent.putExtra(ExtraKeys.TOHU_COUNTRY_CODE, str);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CALLBACK, tohuCallback);
        JobIntentService.enqueueWork(this.context, (Class<?>) InitIntentService.class, InitIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void processMessage(PushMessage pushMessage) {
        Intent intent = new Intent(this.context, (Class<?>) ReplenishIntentService.class);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_PUSH_MESSAGE, pushMessage);
        JobIntentService.enqueueWork(this.context, (Class<?>) ProcessMessageIntentService.class, ProcessMessageIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void replenish(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putString(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE, str);
        bundle.putBoolean(ExtraKeys.TOHU_EXTRA_NEED_NOTIFY_REPLENISH, z10);
        Intent intent = new Intent(this.context, (Class<?>) ReplenishIntentService.class);
        intent.putExtras(bundle);
        JobIntentService.enqueueWork(this.context, (Class<?>) ReplenishIntentService.class, ReplenishIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void suspendToken(String str, String str2, TohuCallbackErrors tohuCallbackErrors) {
        Intent intent = new Intent(this.context, (Class<?>) SuspendTokenIntentService.class);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CARD_UNIQUE_REFERENCE, str);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_CALLBACK, tohuCallbackErrors);
        intent.putExtra(ExtraKeys.TOHU_EXTRA_PKCS7, str2);
        JobIntentService.enqueueWork(this.context, (Class<?>) SuspendTokenIntentService.class, SuspendTokenIntentService.JOB_ID, intent);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager
    public void tohuPaymentApp(Activity activity, int i10) {
        CardEmulation cardEmulation = CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(activity));
        ComponentName componentName = new ComponentName(activity, AndroidHceService.class.getCanonicalName());
        if (cardEmulation.isDefaultServiceForCategory(componentName, "payment")) {
            LogTohu.d(TAG, "onCreate: TOHU is already the default NFC payment application.", new Object[0]);
        } else {
            Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
            intent.putExtra("category", "payment");
            intent.putExtra("component", componentName);
            activity.startActivityForResult(intent, i10);
            LogTohu.d(TAG, "onCreate: Requesting Android to make TOHU the default payment application.", new Object[0]);
        }
        LogTohu.d(TAG, getCardEmulationDescription(cardEmulation.getSelectionModeForCategory("payment")), new Object[0]);
    }
}
