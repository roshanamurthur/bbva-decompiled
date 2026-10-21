package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzr extends zzec implements zzfm {
    private static final zzr zza;
    private int zze;
    private zzcd zzf;
    private byte zzn = 2;
    private String zzg = "";
    private String zzh = "";
    private zzek zzi = zzec.zzO();
    private zzek zzj = zzec.zzO();
    private zzek zzk = zzec.zzO();
    private zzek zzl = zzec.zzO();
    private String zzm = "";

    static {
        zzr zzrVar = new zzr();
        zza = zzrVar;
        zzec.zzS(zzr.class, zzrVar);
    }

    public static zzr zzc() {
        return zza;
    }

    public final zzcd zza() {
        zzcd zzcdVar = this.zzf;
        return zzcdVar == null ? zzcd.zzb() : zzcdVar;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzci.class, "zzj", zzy.class, "zzk", "zzl", zzcb.class, "zzm"});
        }
        if (i11 == 3) {
            return new zzr();
        }
        if (i11 == 4) {
            return new zzq(zza);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzh() {
        return this.zzj;
    }

    public final List zzi() {
        return this.zzi;
    }

    public final List zzj() {
        return this.zzk;
    }
}
