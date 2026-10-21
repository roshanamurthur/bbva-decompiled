package com.google.mlkit.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public class MlKit {
    public static void initialize(@NonNull Context context) {
        MlKitContext.zza(context);
    }
}
