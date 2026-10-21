package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzy extends zzec implements zzfm {
    private static final zzy zza;
    private int zze;
    private zzab zzf;

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzec.zzS(zzy.class, zzyVar);
    }

    private zzy() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzy();
        }
        zzw zzwVar = null;
        if (i11 == 4) {
            return new zzx(zzwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
