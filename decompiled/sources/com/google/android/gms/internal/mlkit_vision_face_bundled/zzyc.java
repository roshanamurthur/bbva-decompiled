package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzyc extends zzuw implements zzvx {
    private static final zzyc zzb;
    private byte zze = 2;
    private zzvb zzd = zzuw.zzA();

    static {
        zzyc zzycVar = new zzyc();
        zzb = zzycVar;
        zzuw.zzF(zzyc.class, zzycVar);
    }

    private zzyc() {
    }

    public static zzyc zzd() {
        return zzb;
    }

    public final List zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return zzuw.zzC(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzxz.class});
        }
        if (i11 == 3) {
            return new zzyc();
        }
        zzya zzyaVar = null;
        if (i11 == 4) {
            return new zzyb(zzyaVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
