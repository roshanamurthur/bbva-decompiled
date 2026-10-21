package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzxm extends zzuw implements zzvx {
    private static final zzxm zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private float zzg;
    private float zzh;

    static {
        zzxm zzxmVar = new zzxm();
        zzb = zzxmVar;
        zzuw.zzF(zzxm.class, zzxmVar);
    }

    private zzxm() {
    }

    public final float zzb() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzuw.zzC(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", zzxl.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzxm();
        }
        zzxj zzxjVar = null;
        if (i11 == 4) {
            return new zzxk(zzxjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
