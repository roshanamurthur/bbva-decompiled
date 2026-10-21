package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import wg.b;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzao extends zzec implements zzfm {
    private static final zzao zza;
    private int zze;
    private int zzg;
    private boolean zzi;
    private byte zzj = 2;
    private String zzf = "";
    private String zzh = "";

    static {
        zzao zzaoVar = new zzao();
        zza = zzaoVar;
        zzec.zzS(zzao.class, zzaoVar);
    }

    public static zzao zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final int zze() {
        int iZza = zzan.zza(this.zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", b.f94244a, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzao();
        }
        if (i11 == 4) {
            return new zzak(zza);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
