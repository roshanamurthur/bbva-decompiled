package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzxz extends zzus {
    private static final zzxz zzd;
    private int zze;
    private zzxo zzf;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private long zzo;
    private long zzp;
    private long zzq;
    private float zzr;
    private zzxt zzs;
    private byte zzt = 2;
    private zzvb zzg = zzuw.zzA();
    private zzvb zzm = zzuw.zzA();
    private zzvb zzn = zzuw.zzA();

    static {
        zzxz zzxzVar = new zzxz();
        zzd = zzxzVar;
        zzuw.zzF(zzxz.class, zzxzVar);
    }

    private zzxz() {
    }

    public static zzxz zzm() {
        return zzd;
    }

    public final boolean zzJ() {
        return (this.zze & 2) != 0;
    }

    public final float zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i11 == 2) {
            return zzuw.zzC(zzd, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005\u000eဉ\n", new Object[]{"zze", "zzf", "zzg", zzxy.class, "zzh", "zzi", "zzj", "zzk", "zzm", zzxr.class, "zzn", zzxm.class, "zzp", "zzr", "zzq", "zzo", "zzl", "zzs"});
        }
        if (i11 == 3) {
            return new zzxz();
        }
        zzxj zzxjVar = null;
        if (i11 == 4) {
            return new zzxp(zzxjVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzt = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final float zzg() {
        return this.zzj;
    }

    public final float zzh() {
        return this.zzi;
    }

    public final float zzi() {
        return this.zzk;
    }

    public final long zzj() {
        return this.zzp;
    }

    public final zzxo zzk() {
        zzxo zzxoVar = this.zzf;
        return zzxoVar == null ? zzxo.zzi() : zzxoVar;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzg;
    }
}
