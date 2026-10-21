package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzc extends zzec implements zzfm {
    private static final zzc zza;
    private int zze;
    private zzeh zzf = zzec.zzL();
    private zzeh zzg = zzec.zzL();
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzc zzcVar = new zzc();
        zza = zzcVar;
        zzec.zzS(zzc.class, zzcVar);
    }

    public static /* synthetic */ void b(zzc zzcVar, int i10) {
        zzcVar.zze |= 2;
        zzcVar.zzi = i10;
    }

    public static /* synthetic */ void c(zzc zzcVar, float f6) {
        zzeh zzehVar = zzcVar.zzf;
        if (!zzehVar.zzc()) {
            zzcVar.zzf = zzec.zzM(zzehVar);
        }
        zzcVar.zzf.zzg(f6);
    }

    public static /* synthetic */ void d(zzc zzcVar, float f6) {
        zzeh zzehVar = zzcVar.zzg;
        if (!zzehVar.zzc()) {
            zzcVar.zzg = zzec.zzM(zzehVar);
        }
        zzcVar.zzg.zzg(f6);
    }

    public static /* synthetic */ void e(zzc zzcVar, int i10) {
        zzcVar.zze |= 1;
        zzcVar.zzh = i10;
    }

    public static zzb zza() {
        return (zzb) zza.zzF();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzc();
        }
        if (i11 == 4) {
            return new zzb(zza);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
