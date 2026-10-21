package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import ad.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzdb implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzdb zzb = new zzcz(zzel.zzd);
    private static final zzda zzd;
    private int zzc = 0;

    static {
        int i10 = zzcn.zza;
        zzd = new zzda(null);
        zza = new zzcu();
    }

    private static zzdb zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zzdb) it.next();
        }
        int i11 = i10 >>> 1;
        zzdb zzdbVarZzc = zzc(it, i11);
        zzdb zzdbVarZzc2 = zzc(it, i10 - i11);
        if (Integer.MAX_VALUE - zzdbVarZzc.zzd() >= zzdbVarZzc2.zzd()) {
            return zzga.zzA(zzdbVarZzc, zzdbVarZzc2);
        }
        throw new IllegalArgumentException(d.d(53, "ByteString would be too long: ", zzdbVarZzc.zzd(), "+", zzdbVarZzc2.zzd()));
    }

    public static int zzo(int i10, int i11, int i12) {
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

    public static zzdb zzr(byte[] bArr, int i10, int i11) {
        zzo(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzcz(bArr2);
    }

    public static zzdb zzs(String str) {
        return new zzcz(str.getBytes(zzel.zzb));
    }

    public static zzdb zzt(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = inputStream.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            zzdb zzdbVarZzr = i10 == 0 ? null : zzr(bArr, 0, i10);
            if (zzdbVarZzr == null) {
                break;
            }
            arrayList.add(zzdbVarZzr);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzw(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(d.d(40, "Index > length: ", i10, ", ", i11));
            }
            throw new ArrayIndexOutOfBoundsException(androidx.camera.core.imagecapture.a.a(22, "Index < 0: ", i10));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zzc;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zzc = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgn.zza(this) : zzgn.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i10, int i11, int i12);

    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzdb zzk(int i10, int i11);

    public abstract String zzl(Charset charset);

    public abstract void zzm(zzcr zzcrVar) throws IOException;

    public abstract boolean zzn();

    public final int zzp() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzcx iterator() {
        return new zzcs(this);
    }

    public final String zzu(Charset charset) {
        return zzd() == 0 ? "" : zzl(charset);
    }

    public final String zzv() {
        return zzu(zzel.zzb);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i10, int i11, int i12) {
        zzo(0, i12, zzd());
        zzo(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final byte[] zzy() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzel.zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
