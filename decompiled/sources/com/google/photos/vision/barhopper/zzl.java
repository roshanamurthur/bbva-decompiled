package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzl extends zzec implements zzfm {
    private static final zzl zza;
    private int zze;
    private String zzf = "";
    private zzek zzg = zzec.zzO();

    static {
        zzl zzlVar = new zzl();
        zza = zzlVar;
        zzec.zzS(zzl.class, zzlVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzaa.class});
        }
        if (i11 == 3) {
            return new zzl();
        }
        if (i11 == 4) {
            return new zzk(zza);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
