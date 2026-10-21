package com.bbva.tohu.android.product.valkyria.sdk.managers;

import android.os.Parcelable;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface BroadcastManager {
    void sendBroadcast(TohuSdkException tohuSdkException);

    void sendBroadcast(TohuSdkException tohuSdkException, Parcelable parcelable);

    void sendBroadcast(TohuSdkException tohuSdkException, String str);

    void sendBroadcast(String str);

    void sendBroadcast(String str, Parcelable parcelable);

    void sendBroadcast(String str, String str2);

    void sendBroadcast(String str, List<String> list);
}
