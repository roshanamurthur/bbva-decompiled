package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziu extends zzec implements zzfm {
    private static final zziu zza;
    private int zze;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zziu zziuVar = new zziu();
        zza = zziuVar;
        zzec.zzS(zziu.class, zziuVar);
    }

    private zziu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zziu();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzit(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
