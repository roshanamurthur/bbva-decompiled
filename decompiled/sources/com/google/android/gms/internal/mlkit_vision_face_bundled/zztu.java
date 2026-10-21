package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.b;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zztu implements Iterable, Serializable {
    public static final zztu zzb = new zztt(zzvc.zzb);
    private int zza = 0;

    static {
        int i10 = zzti.zza;
    }

    public static int zzh(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(b.a("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(n1.e("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(n1.e("End index: ", i11, " >= ", i12));
    }

    public static zztu zzj(byte[] bArr, int i10, int i11) {
        zzh(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zztt(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zztn(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzwt.zza(this) : zzwt.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract int zze(int i10, int i11, int i12);

    public abstract zztu zzf(int i10, int i11);

    public abstract void zzg(zztm zztmVar) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
