package com.google.android.gms.internal.measurement;

import ad.d;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzix implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzix zzb = new zziv(zzkf.zzd);
    private static final zziw zzd;
    private int zzc = 0;

    static {
        int i10 = zzij.zza;
        zzd = new zziw(null);
        zza = new zziq();
    }

    public static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 >= 0) {
            if (i11 < i10) {
                throw new IndexOutOfBoundsException(d.d(66, "Beginning index larger than ending index: ", i10, ", ", i11));
            }
            throw new IndexOutOfBoundsException(d.d(37, "End index: ", i11, " >= ", i12));
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Beginning index: ");
        sb2.append(i10);
        sb2.append(" < 0");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static zzix zzl(byte[] bArr, int i10, int i11) {
        zzj(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zziv(bArr2);
    }

    public static zzix zzm(String str) {
        return new zziv(str.getBytes(zzkf.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzlz.zza(this) : zzlz.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract int zze(int i10, int i11, int i12);

    public abstract zzix zzf(int i10, int i11);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzin zzinVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
