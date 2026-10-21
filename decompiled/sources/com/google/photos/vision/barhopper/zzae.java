package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzae extends zzec implements zzfm {
    private static final zzae zza;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzae zzaeVar = new zzae();
        zza = zzaeVar;
        zzec.zzS(zzae.class, zzaeVar);
    }

    public static /* synthetic */ void b(int i10, zzae zzaeVar) {
        zzaeVar.zze |= 1;
        zzaeVar.zzf = i10;
    }

    public static /* synthetic */ void c(int i10, zzae zzaeVar) {
        zzaeVar.zze |= 2;
        zzaeVar.zzg = i10;
    }

    public static zzad zzc() {
        return (zzad) zza.zzF();
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzae();
        }
        if (i11 == 4) {
            return new zzad(zza);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
