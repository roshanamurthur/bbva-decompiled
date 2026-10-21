package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzib extends zzec implements zzfm {
    private static final zzib zza;
    private int zze;
    private int zzf;
    private zzhu zzi;
    private int zzk;
    private int zzl;
    private zzek zzg = zzec.zzO();
    private int zzh = -1;
    private String zzj = "";

    static {
        zzib zzibVar = new zzib();
        zza = zzibVar;
        zzec.zzS(zzib.class, zzibVar);
    }

    private zzib() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဌ\u0005", new Object[]{"zze", "zzf", zzhx.zza, "zzg", zzhw.class, "zzh", "zzi", "zzj", "zzk", zzhz.zza, "zzl", zzia.zza});
        }
        if (i11 == 3) {
            return new zzib();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzhy(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
