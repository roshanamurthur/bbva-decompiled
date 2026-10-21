package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzis extends zzec implements zzfm {
    private static final zzis zza;
    private int zze;
    private zzek zzf = zzec.zzO();
    private zziu zzg;
    private zzhl zzh;

    static {
        zzis zzisVar = new zzis();
        zza = zzisVar;
        zzec.zzS(zzis.class, zzisVar);
    }

    private zzis() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", zzjc.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzis();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzir(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
