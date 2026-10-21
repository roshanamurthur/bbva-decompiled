package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.veridas.Veridas;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzvc {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName(Veridas.US_ASCII);
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zztw(bArr, 0, 0, false, null).zza(0);
        } catch (zzve e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
