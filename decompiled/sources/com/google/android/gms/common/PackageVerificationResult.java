package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes9.dex */
@CheckReturnValue
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i10, boolean z10, @Nullable String str2, @Nullable Throwable th2) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = str2;
        this.zzd = th2;
    }

    @NonNull
    public static PackageVerificationResult zza(@NonNull String str, @NonNull String str2, @Nullable Throwable th2) {
        return new PackageVerificationResult(str, 1, false, str2, th2);
    }

    @NonNull
    public static PackageVerificationResult zzd(@NonNull String str, int i10) {
        return new PackageVerificationResult(str, i10, true, null, null);
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        String str = this.zzc;
        Throwable th2 = this.zzd;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th2 == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th2);
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
