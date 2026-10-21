package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzp extends zzec implements zzfm {
    private static final zzp zza;
    private int zze;
    private zzjh zzk;
    private byte zzl = 2;
    private zzei zzf = zzec.zzN();
    private zzeh zzg = zzec.zzL();
    private boolean zzh = true;
    private String zzi = "";
    private String zzj = "";

    static {
        zzp zzpVar = new zzp();
        zza = zzpVar;
        zzec.zzS(zzp.class, zzpVar);
    }

    private zzp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzp();
        }
        zzn zznVar = null;
        if (i11 == 4) {
            return new zzo(zznVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
