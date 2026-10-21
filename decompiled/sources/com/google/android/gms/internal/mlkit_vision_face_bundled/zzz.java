package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzz extends zzuw implements zzvx {
    private static final zzz zzb;
    private int zzd;
    private zzag zze;
    private zzag zzf;
    private zzag zzg;
    private zzag zzh;

    static {
        zzz zzzVar = new zzz();
        zzb = zzzVar;
        zzuw.zzF(zzz.class, zzzVar);
    }

    private zzz() {
    }

    public static zzy zza() {
        return (zzy) zzb.zzv();
    }

    public static /* synthetic */ void zzc(zzz zzzVar, zzag zzagVar) {
        zzagVar.getClass();
        zzzVar.zze = zzagVar;
        zzzVar.zzd |= 1;
    }

    public static /* synthetic */ void zzd(zzz zzzVar, zzag zzagVar) {
        zzagVar.getClass();
        zzzVar.zzf = zzagVar;
        zzzVar.zzd |= 2;
    }

    public static /* synthetic */ void zze(zzz zzzVar, zzag zzagVar) {
        zzagVar.getClass();
        zzzVar.zzg = zzagVar;
        zzzVar.zzd |= 4;
    }

    public static /* synthetic */ void zzg(zzz zzzVar, zzag zzagVar) {
        zzagVar.getClass();
        zzzVar.zzh = zzagVar;
        zzzVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw
    public final Object zzf(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzuw.zzC(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzz();
        }
        zzj zzjVar = null;
        if (i11 == 4) {
            return new zzy(zzjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
