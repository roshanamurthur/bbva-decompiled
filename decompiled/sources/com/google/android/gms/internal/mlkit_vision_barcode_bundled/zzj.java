package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzj extends zzec implements zzfm {
    private static final zzj zza;
    private int zze;
    private int zzh;
    private zzv zzi;
    private zzp zzj;
    private zzjh zzk;
    private int zzl;
    private byte zzn = 2;
    private int zzf = 17;
    private zzek zzg = zzec.zzO();
    private zzek zzm = zzec.zzO();

    static {
        zzj zzjVar = new zzj();
        zza = zzjVar;
        zzec.zzS(zzj.class, zzjVar);
    }

    private zzj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001ဌ\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zze", "zzf", zzi.zza, "zzg", zzaj.class, "zzh", "zzi", "zzj", "zzl", "zzm", zzam.class, "zzk"});
        }
        if (i11 == 3) {
            return new zzj();
        }
        zzg zzgVar = null;
        if (i11 == 4) {
            return new zzh(zzgVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
