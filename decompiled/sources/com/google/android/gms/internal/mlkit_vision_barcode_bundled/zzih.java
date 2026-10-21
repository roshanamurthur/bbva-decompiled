package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzih extends zzec implements zzfm {
    private static final zzih zza;
    private int zze;
    private boolean zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzh = true;
    private String zzm = "";
    private String zzn = "";

    static {
        zzih zzihVar = new zzih();
        zza = zzihVar;
        zzec.zzS(zzih.class, zzihVar);
    }

    private zzih() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzeg zzegVar = zzii.zza;
            return zzec.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဈ\u0007\tဈ\b", new Object[]{"zze", "zzf", "zzg", zzij.zza, "zzh", "zzi", zzif.zza, "zzj", zzegVar, "zzk", zzegVar, "zzl", zzegVar, "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zzih();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzig(zzhhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
