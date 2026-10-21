package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzq extends zzuw implements zzvx {
    private static final zzq zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;

    static {
        zzq zzqVar = new zzq();
        zzb = zzqVar;
        zzuw.zzF(zzq.class, zzqVar);
    }

    private zzq() {
    }

    public final float zza() {
        return this.zze;
    }

    public final float zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzuw.zzC(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzq();
        }
        zzj zzjVar = null;
        if (i11 == 4) {
            return new zzp(zzjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
