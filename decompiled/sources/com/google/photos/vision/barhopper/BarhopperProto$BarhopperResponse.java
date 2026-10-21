package com.google.photos.vision.barhopper;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import java.util.List;
import wg.a;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class BarhopperProto$BarhopperResponse extends zzec<BarhopperProto$BarhopperResponse, zzj> implements zzfm {
    private static final BarhopperProto$BarhopperResponse zza;
    private int zze;
    private int zzg;
    private byte zzj = 2;
    private zzek zzf = zzec.zzO();
    private String zzh = "";
    private zzdb zzi = zzdb.zzb;

    static {
        BarhopperProto$BarhopperResponse barhopperProto$BarhopperResponse = new BarhopperProto$BarhopperResponse();
        zza = barhopperProto$BarhopperResponse;
        zzec.zzS(BarhopperProto$BarhopperResponse.class, barhopperProto$BarhopperResponse);
    }

    public static BarhopperProto$BarhopperResponse zzb(byte[] bArr, zzdn zzdnVar) throws zzen {
        return (BarhopperProto$BarhopperResponse) zzec.zzJ(zza, bArr, zzdnVar);
    }

    @NonNull
    public final List zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    @NonNull
    public final Object zzg(int i10, @NonNull Object obj, @NonNull Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᔌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", zzc.class, "zzg", a.f94243a, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new BarhopperProto$BarhopperResponse();
        }
        if (i11 == 4) {
            return new zzj(zza);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
