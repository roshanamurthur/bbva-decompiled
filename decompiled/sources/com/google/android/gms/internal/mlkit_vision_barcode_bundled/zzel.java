package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.veridas.Veridas;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzel {
    static final Charset zza = Charset.forName(Veridas.US_ASCII);
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzde zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzdd zzddVar = new zzdd(bArr, 0, 0, false, null);
        try {
            zzddVar.zza(0);
            zzf = zzddVar;
        } catch (zzen e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int iZzd = zzd(length, bArr, 0, length);
        if (iZzd == 0) {
            return 1;
        }
        return iZzd;
    }

    public static int zzc(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int zzd(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static Object zze(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object zzf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Object zzg(Object obj, Object obj2) {
        return ((zzfl) obj).zzV().zzg((zzfl) obj2).zzm();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzi(zzfl zzflVar) {
        if (!(zzflVar instanceof zzcl)) {
            return false;
        }
        throw null;
    }

    public static boolean zzj(byte[] bArr) {
        return zzhe.zzh(bArr);
    }
}
