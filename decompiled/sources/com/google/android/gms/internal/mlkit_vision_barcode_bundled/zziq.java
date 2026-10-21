package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziq extends zzec implements zzfm {
    private static final zziq zza;
    private int zze;
    private String zzf = "";
    private zziw zzg;

    static {
        zziq zziqVar = new zziq();
        zza = zziqVar;
        zzec.zzS(zziq.class, zziqVar);
    }

    private zziq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zziq();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzip(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
