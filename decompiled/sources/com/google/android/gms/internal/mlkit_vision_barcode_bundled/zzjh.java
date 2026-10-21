package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjh extends zzdy {
    private static final zzjh zze;
    private byte zzf = 2;

    static {
        zzjh zzjhVar = new zzjh();
        zze = zzjhVar;
        zzec.zzS(zzjh.class, zzjhVar);
    }

    private zzjh() {
    }

    public static zzjh zzf() {
        return zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzf);
        }
        zzjf zzjfVar = null;
        if (i11 == 2) {
            return zzec.zzR(zze, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new zzjh();
        }
        if (i11 == 4) {
            return new zzjg(zzjfVar);
        }
        if (i11 == 5) {
            return zze;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
