package com.google.android.play.core.splitinstall.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46322a;

    public zzu(String str) {
        this.f46322a = androidx.collection.k.c("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String a(String str, String str2, @Nullable Object... objArr) {
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

    public final int zza(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", a(this.f46322a, str, objArr));
        }
        return 0;
    }

    public final int zzb(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", a(this.f46322a, str, objArr));
        }
        return 0;
    }

    public final int zzc(Throwable th2, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", a(this.f46322a, str, objArr), th2);
        }
        return 0;
    }

    public final int zzd(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", a(this.f46322a, str, objArr));
        }
        return 0;
    }

    public final int zze(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", a(this.f46322a, str, objArr));
        }
        return 0;
    }
}
