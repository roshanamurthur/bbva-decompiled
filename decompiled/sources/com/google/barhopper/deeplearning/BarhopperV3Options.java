package com.google.barhopper.deeplearning;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class BarhopperV3Options extends zzec<BarhopperV3Options, zzk> implements zzfm {
    private static final BarhopperV3Options zza;
    private int zze;
    private zzi zzf;
    private zzn zzg;

    static {
        BarhopperV3Options barhopperV3Options = new BarhopperV3Options();
        zza = barhopperV3Options;
        zzec.zzS(BarhopperV3Options.class, barhopperV3Options);
    }

    public static /* synthetic */ void b(BarhopperV3Options barhopperV3Options, zzi zziVar) {
        zziVar.getClass();
        barhopperV3Options.zzf = zziVar;
        barhopperV3Options.zze |= 1;
    }

    public static /* synthetic */ void c(BarhopperV3Options barhopperV3Options, zzn zznVar) {
        zznVar.getClass();
        barhopperV3Options.zzg = zznVar;
        barhopperV3Options.zze |= 2;
    }

    public static zzk zza() {
        return (zzk) zza.zzF();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    @NonNull
    public final Object zzg(int i10, @NonNull Object obj, @NonNull Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new BarhopperV3Options();
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
