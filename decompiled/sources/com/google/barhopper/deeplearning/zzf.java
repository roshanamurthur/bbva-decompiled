package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzf extends zzec implements zzfm {
    private static final zzf zza;
    private zzek zze = zzec.zzO();

    static {
        zzf zzfVar = new zzf();
        zza = zzfVar;
        zzec.zzS(zzf.class, zzfVar);
    }

    public static /* synthetic */ void b(zzf zzfVar, zzc zzcVar) {
        zzcVar.getClass();
        zzek zzekVar = zzfVar.zze;
        if (!zzekVar.zzc()) {
            zzfVar.zze = zzec.zzP(zzekVar);
        }
        zzfVar.zze.add(zzcVar);
    }

    public static zze zza() {
        return (zze) zza.zzF();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzc.class});
        }
        if (i11 == 3) {
            return new zzf();
        }
        if (i11 == 4) {
            return new zze(zza);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
