package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziw extends zzec implements zzfm {
    private static final zziw zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zziw zziwVar = new zziw();
        zza = zziwVar;
        zzec.zzS(zziw.class, zziwVar);
    }

    private zziw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zziw();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zziv(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
