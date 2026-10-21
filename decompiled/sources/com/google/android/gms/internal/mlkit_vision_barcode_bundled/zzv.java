package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzv extends zzec implements zzfm {
    public static final zzea zza;
    private static final zzv zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private zzjh zzi;
    private byte zzj = 2;

    static {
        zzv zzvVar = new zzv();
        zze = zzvVar;
        zzec.zzS(zzv.class, zzvVar);
        zza = zzec.zzH(zzjh.zzf(), zzvVar, zzvVar, null, 13258261, zzhf.zzk, zzv.class);
    }

    private zzv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzec.zzR(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzv();
        }
        zzt zztVar = null;
        if (i11 == 4) {
            return new zzu(zztVar);
        }
        if (i11 == 5) {
            return zze;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
