package com.salesforce.marketingcloud;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface d {
    @NonNull
    String componentName();

    @Nullable
    JSONObject componentState();

    void tearDown(boolean z10);
}
