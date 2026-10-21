package com.bbva.tohu.android.product.valkyria.sdk.managers;

import android.app.Activity;
import com.bbva.tohu.android.product.valkyria.sdk.export.beans.PushMessage;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface IntentManager {
    void deleteCard(String str, String str2, TohuCallbackErrors tohuCallbackErrors);

    void deleteDevice(String str, TohuCallback tohuCallback);

    void enablePayment(List<Card> list, String str, TohuCallbackErrors tohuCallbackErrors);

    void getTokenWithDelay(String str);

    void getTransactionHistory(String str, String str2, TohuCallback tohuCallback);

    void init(TohuCallback tohuCallback, String str);

    void processMessage(PushMessage pushMessage);

    void replenish(String str, boolean z10);

    void suspendToken(String str, String str2, TohuCallbackErrors tohuCallbackErrors);

    void tohuPaymentApp(Activity activity, int i10);
}
