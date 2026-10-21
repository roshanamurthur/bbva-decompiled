package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@NonNull Context context, @NonNull Throwable th2) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th2);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
