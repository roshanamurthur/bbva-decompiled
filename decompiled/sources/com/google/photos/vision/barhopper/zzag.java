package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzag extends zzec implements zzfm {
    private static final zzag zza;
    private int zze;
    private byte zzh = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        zzag zzagVar = new zzag();
        zza = zzagVar;
        zzec.zzS(zzag.class, zzagVar);
    }

    public static zzag zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzag();
        }
        if (i11 == 4) {
            return new zzaf(zza);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
