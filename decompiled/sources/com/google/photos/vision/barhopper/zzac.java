package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzac extends zzec implements zzfm {
    private static final zzac zza;
    private int zze;
    private double zzf;
    private double zzg;
    private byte zzh = 2;

    static {
        zzac zzacVar = new zzac();
        zza = zzacVar;
        zzec.zzS(zzac.class, zzacVar);
    }

    public static zzac zzd() {
        return zza;
    }

    public final double zza() {
        return this.zzf;
    }

    public final double zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzac();
        }
        if (i11 == 4) {
            return new zzab(zza);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
