package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzm extends zzec implements zzfm {
    private static final zzm zza;
    private int zze;
    private zzek zzf = zzec.zzO();
    private String zzg = "";

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzec.zzS(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i11 == 4) {
            return new zzl(zzkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
