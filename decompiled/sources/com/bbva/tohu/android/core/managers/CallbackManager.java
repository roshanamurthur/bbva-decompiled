package com.bbva.tohu.android.core.managers;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface CallbackManager {
    void sendErrorWithCode(int i10);

    void sendErrorWithCodeAndData(int i10, Map<String, ArrayList<String>> map);

    void sendResultOk();

    void sendTohuException(TohuSdkException tohuSdkException, Map<String, String> map);
}
