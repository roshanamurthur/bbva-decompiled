package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhj extends zzec implements zzfm {
    private static final zzhj zza;
    private int zze;
    private int zzf;
    private zzjc zzg;
    private zziq zzh;
    private zzis zzi;

    static {
        zzhj zzhjVar = new zzhj();
        zza = zzhjVar;
        zzec.zzS(zzhj.class, zzhjVar);
    }

    private zzhj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zze", "zzf", zzic.zza, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzhj();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzhi(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
