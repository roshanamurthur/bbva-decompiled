package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46381a;

    public k(String str) {
        this.f46381a = androidx.collection.k.c("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String f(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + Constant.BRACKET_CLOSE;
            }
        }
        return androidx.camera.core.impl.utils.a.b(str, " : ", str2);
    }

    public final int a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.f46381a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f46381a, "Phonesky is not installed.", objArr));
        }
        return 0;
    }

    public final int c(Throwable th2, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f46381a, str, objArr), th2);
        }
        return 0;
    }

    public final int d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.f46381a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.f46381a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
