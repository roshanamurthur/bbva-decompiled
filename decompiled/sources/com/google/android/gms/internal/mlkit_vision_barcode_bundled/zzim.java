package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzim extends zzec implements zzfm {
    private static final zzim zza;
    private int zze;
    private int zzf;
    private int zzg = 100;
    private int zzh;

    static {
        zzim zzimVar = new zzim();
        zza = zzimVar;
        zzec.zzS(zzim.class, zzimVar);
    }

    private zzim() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", zzik.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzim();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzil(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
