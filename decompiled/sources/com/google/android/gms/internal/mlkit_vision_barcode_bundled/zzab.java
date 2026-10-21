package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzab extends zzec implements zzfm {
    private static final zzab zza;
    private int zze;
    private zzae zzf;
    private boolean zzg;

    static {
        zzab zzabVar = new zzab();
        zza = zzabVar;
        zzec.zzS(zzab.class, zzabVar);
    }

    private zzab() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzab();
        }
        zzz zzzVar = null;
        if (i11 == 4) {
            return new zzaa(zzzVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
