package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.c;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzec {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzeb zzd;

    public zzec(zzeb zzebVar) {
        this.zzd = zzebVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (zzkw.zzak(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbD = c.d(Constant.BRACKET_OPEN);
        for (Object obj : objArr) {
            String strZzb = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (strZzb != null) {
                if (sbD.length() != 1) {
                    sbD.append(", ");
                }
                sbD.append(strZzb);
            }
        }
        sbD.append(Constant.BRACKET_CLOSE);
        return sbD.toString();
    }

    public final String zzb(Bundle bundle) {
        String strZza;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbD = c.d("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbD.length() != 8) {
                sbD.append(", ");
            }
            sbD.append(zze(str));
            sbD.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strZza = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strZza = zza((Object[]) obj);
            } else {
                strZza = obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbD.append(strZza);
        }
        sbD.append("}]");
        return sbD.toString();
    }

    public final String zzc(zzau zzauVar) {
        String string;
        if (!this.zzd.zza()) {
            return zzauVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzauVar.zzc);
        sb2.append(",name=");
        sb2.append(zzd(zzauVar.zza));
        sb2.append(",params=");
        zzas zzasVar = zzauVar.zzb;
        if (zzasVar == null) {
            string = null;
        } else {
            string = !this.zzd.zza() ? zzasVar.toString() : zzb(zzasVar.zzc());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgo.zzc, zzgo.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgp.zzb, zzgp.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            return str.startsWith("_exp_") ? h0.b("experiment_id(", str, ")") : zzg(str, zzgq.zzb, zzgq.zza, zzc);
        }
        return str;
    }
}
