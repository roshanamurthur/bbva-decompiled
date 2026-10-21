package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import wg.e;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzy extends zzec implements zzfm {
    private static final zzy zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzec.zzS(zzy.class, zzyVar);
    }

    public static zzy zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zzh;
    }

    public final int zzf() {
        int iZza = zzx.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", e.f94247a, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzy();
        }
        if (i11 == 4) {
            return new zzu(zza);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
