package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzn extends zzec implements zzfm {
    private static final zzn zza;
    private int zze;
    private String zzf = "";
    private zzdb zzg;
    private String zzh;
    private zzdb zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;

    static {
        zzn zznVar = new zzn();
        zza = zznVar;
        zzec.zzS(zzn.class, zznVar);
    }

    public zzn() {
        zzdb zzdbVar = zzdb.zzb;
        this.zzg = zzdbVar;
        this.zzh = "";
        this.zzi = zzdbVar;
        this.zzj = 0.25f;
        this.zzk = 0.25f;
        this.zzl = 0.5f;
        this.zzm = 0.85f;
        this.zzn = 1;
    }

    public static /* synthetic */ void b(zzn zznVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        zznVar.zze |= 2;
        zznVar.zzg = zzdbVar;
    }

    public static /* synthetic */ void c(zzn zznVar, zzdb zzdbVar) {
        zzdbVar.getClass();
        zznVar.zze |= 8;
        zznVar.zzi = zzdbVar;
    }

    public static zzm zza() {
        return (zzm) zza.zzF();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zzn();
        }
        if (i11 == 4) {
            return new zzm(zza);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
