package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzq {
    private final String zza;
    private final zzo zzb;
    private zzo zzc;

    public /* synthetic */ zzq(String str, zzp zzpVar) {
        zzo zzoVar = new zzo();
        this.zzb = zzoVar;
        this.zzc = zzoVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzo zzoVar = this.zzb.zzc;
        String str = "";
        while (zzoVar != null) {
            Object obj = zzoVar.zzb;
            sb2.append(str);
            String str2 = zzoVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzoVar = zzoVar.zzc;
            str = ", ";
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final zzq zza(String str, @CheckForNull Object obj) {
        zzo zzoVar = new zzo();
        this.zzc.zzc = zzoVar;
        this.zzc = zzoVar;
        zzoVar.zzb = obj;
        zzoVar.zza = str;
        return this;
    }

    public final zzq zzb(String str, boolean z10) {
        String strValueOf = String.valueOf(z10);
        zzn zznVar = new zzn(null);
        this.zzc.zzc = zznVar;
        this.zzc = zznVar;
        zznVar.zzb = strValueOf;
        zznVar.zza = "isManifestFile";
        return this;
    }
}
