package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhl extends zzec implements zzfm {
    private static final zzhl zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzhl zzhlVar = new zzhl();
        zza = zzhlVar;
        zzec.zzS(zzhl.class, zzhlVar);
    }

    private zzhl() {
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
            return new zzhl();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzhk(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
