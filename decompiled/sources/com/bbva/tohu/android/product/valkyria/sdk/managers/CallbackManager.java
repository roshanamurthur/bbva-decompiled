package com.bbva.tohu.android.product.valkyria.sdk.managers;

import android.os.Parcelable;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface CallbackManager {
    void result(Map<String, String> map);

    void sendResultOk();

    void sendTohuException(TohuSdkException tohuSdkException, Map<String, String> map);

    void sendWithData(int i10, Map<String, ArrayList<String>> map);

    void sendWithResult(Parcelable parcelable);

    void sendWithResult(String str);
}
