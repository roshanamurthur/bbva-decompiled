package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzxt extends zzuw implements zzvx {
    private static final zzxt zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        zzxt zzxtVar = new zzxt();
        zzb = zzxtVar;
        zzuw.zzF(zzxt.class, zzxtVar);
    }

    private zzxt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzuw.zzC(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzxt();
        }
        zzxj zzxjVar = null;
        if (i11 == 4) {
            return new zzxs(zzxjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
