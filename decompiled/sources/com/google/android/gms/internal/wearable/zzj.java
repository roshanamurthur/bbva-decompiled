package com.google.android.gms.internal.wearable;

import androidx.appcompat.widget.c;
import com.mypinpad.tsdk.isolation.z1;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class zzj extends zzn<zzj> {
    public byte[] zzgd = zzw.zzhy;
    public String zzge = "";
    public double zzgf = 0.0d;
    public float zzgg = 0.0f;
    public long zzgh = 0;
    public int zzgi = 0;
    public int zzgj = 0;
    public boolean zzgk = false;
    public zzh[] zzgl = zzh.zzh();
    public zzi[] zzgm = zzi.zzi();
    public String[] zzgn = zzw.zzhw;
    public long[] zzgo = zzw.zzhs;
    public float[] zzgp = zzw.zzht;
    public long zzgq = 0;

    public zzj() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!Arrays.equals(this.zzgd, zzjVar.zzgd)) {
            return false;
        }
        String str = this.zzge;
        if (str == null) {
            if (zzjVar.zzge != null) {
                return false;
            }
        } else if (!str.equals(zzjVar.zzge)) {
            return false;
        }
        if (Double.doubleToLongBits(this.zzgf) != Double.doubleToLongBits(zzjVar.zzgf) || Float.floatToIntBits(this.zzgg) != Float.floatToIntBits(zzjVar.zzgg) || this.zzgh != zzjVar.zzgh || this.zzgi != zzjVar.zzgi || this.zzgj != zzjVar.zzgj || this.zzgk != zzjVar.zzgk || !zzr.equals(this.zzgl, zzjVar.zzgl) || !zzr.equals(this.zzgm, zzjVar.zzgm) || !zzr.equals(this.zzgn, zzjVar.zzgn) || !zzr.equals(this.zzgo, zzjVar.zzgo) || !zzr.equals(this.zzgp, zzjVar.zzgp) || this.zzgq != zzjVar.zzgq) {
            return false;
        }
        zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zzjVar.zzhc);
        }
        zzp zzpVar2 = zzjVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.zzgd) + 1588755251) * 31;
        String str = this.zzge;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzgf);
        int iA = z1.a(this.zzgg, (((iHashCode + iHashCode3) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31);
        long j10 = this.zzgh;
        int iHashCode4 = (zzr.hashCode(this.zzgp) + ((zzr.hashCode(this.zzgo) + ((((zzr.hashCode(this.zzgm) + ((zzr.hashCode(this.zzgl) + ((((((((iA + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.zzgi) * 31) + this.zzgj) * 31) + (this.zzgk ? 1231 : 1237)) * 31)) * 31)) * 31) + zzr.hashCode(this.zzgn)) * 31)) * 31)) * 31;
        long j11 = this.zzgq;
        int i10 = (iHashCode4 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            iHashCode2 = this.zzhc.hashCode();
        }
        return i10 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(zzl zzlVar) throws IOException {
        if (!Arrays.equals(this.zzgd, zzw.zzhy)) {
            byte[] bArr = this.zzgd;
            zzlVar.zzf(1, 2);
            zzlVar.zzl(bArr.length);
            zzlVar.zzc(bArr);
        }
        String str = this.zzge;
        if (str != null && !str.equals("")) {
            zzlVar.zza(2, this.zzge);
        }
        if (Double.doubleToLongBits(this.zzgf) != Double.doubleToLongBits(0.0d)) {
            double d2 = this.zzgf;
            zzlVar.zzf(3, 1);
            zzlVar.zzb(Double.doubleToLongBits(d2));
        }
        if (Float.floatToIntBits(this.zzgg) != Float.floatToIntBits(0.0f)) {
            zzlVar.zza(4, this.zzgg);
        }
        long j10 = this.zzgh;
        if (j10 != 0) {
            zzlVar.zza(5, j10);
        }
        int i10 = this.zzgi;
        if (i10 != 0) {
            zzlVar.zzd(6, i10);
        }
        int i11 = this.zzgj;
        int i12 = 0;
        if (i11 != 0) {
            zzlVar.zzf(7, 0);
            zzlVar.zzl(zzl.zzn(i11));
        }
        boolean z10 = this.zzgk;
        if (z10) {
            zzlVar.zzf(8, 0);
            zzlVar.zza(z10 ? (byte) 1 : (byte) 0);
        }
        zzh[] zzhVarArr = this.zzgl;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                zzh[] zzhVarArr2 = this.zzgl;
                if (i13 >= zzhVarArr2.length) {
                    break;
                }
                zzh zzhVar = zzhVarArr2[i13];
                if (zzhVar != null) {
                    zzlVar.zza(9, zzhVar);
                }
                i13++;
            }
        }
        zzi[] zziVarArr = this.zzgm;
        if (zziVarArr != null && zziVarArr.length > 0) {
            int i14 = 0;
            while (true) {
                zzi[] zziVarArr2 = this.zzgm;
                if (i14 >= zziVarArr2.length) {
                    break;
                }
                zzi zziVar = zziVarArr2[i14];
                if (zziVar != null) {
                    zzlVar.zza(10, zziVar);
                }
                i14++;
            }
        }
        String[] strArr = this.zzgn;
        if (strArr != null && strArr.length > 0) {
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.zzgn;
                if (i15 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i15];
                if (str2 != null) {
                    zzlVar.zza(11, str2);
                }
                i15++;
            }
        }
        long[] jArr = this.zzgo;
        if (jArr != null && jArr.length > 0) {
            int i16 = 0;
            while (true) {
                long[] jArr2 = this.zzgo;
                if (i16 >= jArr2.length) {
                    break;
                }
                zzlVar.zza(12, jArr2[i16]);
                i16++;
            }
        }
        long j11 = this.zzgq;
        if (j11 != 0) {
            zzlVar.zza(13, j11);
        }
        float[] fArr = this.zzgp;
        if (fArr != null && fArr.length > 0) {
            while (true) {
                float[] fArr2 = this.zzgp;
                if (i12 >= fArr2.length) {
                    break;
                }
                zzlVar.zza(14, fArr2[i12]);
                i12++;
            }
        }
        super.zza(zzlVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        long[] jArr;
        int i10;
        int iZzg = super.zzg();
        if (!Arrays.equals(this.zzgd, zzw.zzhy)) {
            byte[] bArr = this.zzgd;
            iZzg = c.a(zzl.zzm(bArr.length), bArr.length, zzl.zzk(1), iZzg);
        }
        String str = this.zzge;
        if (str != null && !str.equals("")) {
            iZzg += zzl.zzb(2, this.zzge);
        }
        if (Double.doubleToLongBits(this.zzgf) != Double.doubleToLongBits(0.0d)) {
            iZzg += zzl.zzk(3) + 8;
        }
        if (Float.floatToIntBits(this.zzgg) != Float.floatToIntBits(0.0f)) {
            iZzg += zzl.zzk(4) + 4;
        }
        long j10 = this.zzgh;
        if (j10 != 0) {
            iZzg += zzl.zzb(5, j10);
        }
        int i11 = this.zzgi;
        if (i11 != 0) {
            iZzg += zzl.zze(6, i11);
        }
        int i12 = this.zzgj;
        if (i12 != 0) {
            iZzg += zzl.zzm(zzl.zzn(i12)) + zzl.zzk(7);
        }
        if (this.zzgk) {
            iZzg += zzl.zzk(8) + 1;
        }
        zzh[] zzhVarArr = this.zzgl;
        int i13 = 0;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i14 = 0;
            while (true) {
                zzh[] zzhVarArr2 = this.zzgl;
                if (i14 >= zzhVarArr2.length) {
                    break;
                }
                zzh zzhVar = zzhVarArr2[i14];
                if (zzhVar != null) {
                    iZzg = zzl.zzb(9, zzhVar) + iZzg;
                }
                i14++;
            }
        }
        zzi[] zziVarArr = this.zzgm;
        if (zziVarArr != null && zziVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                zzi[] zziVarArr2 = this.zzgm;
                if (i15 >= zziVarArr2.length) {
                    break;
                }
                zzi zziVar = zziVarArr2[i15];
                if (zziVar != null) {
                    iZzg = zzl.zzb(10, zziVar) + iZzg;
                }
                i15++;
            }
        }
        String[] strArr = this.zzgn;
        if (strArr != null && strArr.length > 0) {
            int i16 = 0;
            int iZzg2 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr2 = this.zzgn;
                if (i16 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i16];
                if (str2 != null) {
                    i17++;
                    iZzg2 += zzl.zzg(str2);
                }
                i16++;
            }
            iZzg = iZzg + iZzg2 + i17;
        }
        long[] jArr2 = this.zzgo;
        if (jArr2 != null && jArr2.length > 0) {
            int i18 = 0;
            while (true) {
                jArr = this.zzgo;
                if (i13 >= jArr.length) {
                    break;
                }
                long j11 = jArr[i13];
                if ((j11 & (-128)) == 0) {
                    i10 = 1;
                } else if ((j11 & (-16384)) == 0) {
                    i10 = 2;
                } else if ((j11 & (-2097152)) == 0) {
                    i10 = 3;
                } else if ((j11 & (-268435456)) == 0) {
                    i10 = 4;
                } else if ((j11 & (-34359738368L)) == 0) {
                    i10 = 5;
                } else if ((j11 & (-4398046511104L)) == 0) {
                    i10 = 6;
                } else if ((j11 & (-562949953421312L)) == 0) {
                    i10 = 7;
                } else if ((j11 & (-72057594037927936L)) == 0) {
                    i10 = 8;
                } else {
                    i10 = (j11 & Long.MIN_VALUE) == 0 ? 9 : 10;
                }
                i18 += i10;
                i13++;
            }
            iZzg = iZzg + i18 + jArr.length;
        }
        long j12 = this.zzgq;
        if (j12 != 0) {
            iZzg += zzl.zzb(13, j12);
        }
        float[] fArr = this.zzgp;
        if (fArr == null || fArr.length <= 0) {
            return iZzg;
        }
        return fArr.length + (fArr.length * 4) + iZzg;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public final /* synthetic */ zzt zza(zzk zzkVar) throws IOException {
        while (true) {
            int iZzj = zzkVar.zzj();
            switch (iZzj) {
                case 0:
                    return this;
                case 10:
                    this.zzgd = zzkVar.readBytes();
                    break;
                case 18:
                    this.zzge = zzkVar.readString();
                    break;
                case 25:
                    this.zzgf = Double.longBitsToDouble(zzkVar.zzn());
                    break;
                case 37:
                    this.zzgg = Float.intBitsToFloat(zzkVar.zzm());
                    break;
                case 40:
                    this.zzgh = zzkVar.zzl();
                    break;
                case 48:
                    this.zzgi = zzkVar.zzk();
                    break;
                case 56:
                    int iZzk = zzkVar.zzk();
                    this.zzgj = (-(iZzk & 1)) ^ (iZzk >>> 1);
                    break;
                case 64:
                    this.zzgk = zzkVar.zzk() != 0;
                    break;
                case 74:
                    int iZzb = zzw.zzb(zzkVar, 74);
                    zzh[] zzhVarArr = this.zzgl;
                    int length = zzhVarArr == null ? 0 : zzhVarArr.length;
                    int i10 = iZzb + length;
                    zzh[] zzhVarArr2 = new zzh[i10];
                    if (length != 0) {
                        System.arraycopy(zzhVarArr, 0, zzhVarArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        zzh zzhVar = new zzh();
                        zzhVarArr2[length] = zzhVar;
                        zzkVar.zza(zzhVar);
                        zzkVar.zzj();
                        length++;
                    }
                    zzh zzhVar2 = new zzh();
                    zzhVarArr2[length] = zzhVar2;
                    zzkVar.zza(zzhVar2);
                    this.zzgl = zzhVarArr2;
                    break;
                case 82:
                    int iZzb2 = zzw.zzb(zzkVar, 82);
                    zzi[] zziVarArr = this.zzgm;
                    int length2 = zziVarArr == null ? 0 : zziVarArr.length;
                    int i11 = iZzb2 + length2;
                    zzi[] zziVarArr2 = new zzi[i11];
                    if (length2 != 0) {
                        System.arraycopy(zziVarArr, 0, zziVarArr2, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        zzi zziVar = new zzi();
                        zziVarArr2[length2] = zziVar;
                        zzkVar.zza(zziVar);
                        zzkVar.zzj();
                        length2++;
                    }
                    zzi zziVar2 = new zzi();
                    zziVarArr2[length2] = zziVar2;
                    zzkVar.zza(zziVar2);
                    this.zzgm = zziVarArr2;
                    break;
                case 90:
                    int iZzb3 = zzw.zzb(zzkVar, 90);
                    String[] strArr = this.zzgn;
                    int length3 = strArr == null ? 0 : strArr.length;
                    int i12 = iZzb3 + length3;
                    String[] strArr2 = new String[i12];
                    if (length3 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length3);
                    }
                    while (length3 < i12 - 1) {
                        strArr2[length3] = zzkVar.readString();
                        zzkVar.zzj();
                        length3++;
                    }
                    strArr2[length3] = zzkVar.readString();
                    this.zzgn = strArr2;
                    break;
                case 96:
                    int iZzb4 = zzw.zzb(zzkVar, 96);
                    long[] jArr = this.zzgo;
                    int length4 = jArr == null ? 0 : jArr.length;
                    int i13 = iZzb4 + length4;
                    long[] jArr2 = new long[i13];
                    if (length4 != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length4);
                    }
                    while (length4 < i13 - 1) {
                        jArr2[length4] = zzkVar.zzl();
                        zzkVar.zzj();
                        length4++;
                    }
                    jArr2[length4] = zzkVar.zzl();
                    this.zzgo = jArr2;
                    break;
                case 98:
                    int iZze = zzkVar.zze(zzkVar.zzk());
                    int position = zzkVar.getPosition();
                    int i14 = 0;
                    while (zzkVar.zzp() > 0) {
                        zzkVar.zzl();
                        i14++;
                    }
                    zzkVar.zzg(position);
                    long[] jArr3 = this.zzgo;
                    int length5 = jArr3 == null ? 0 : jArr3.length;
                    int i15 = i14 + length5;
                    long[] jArr4 = new long[i15];
                    if (length5 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length5);
                    }
                    while (length5 < i15) {
                        jArr4[length5] = zzkVar.zzl();
                        length5++;
                    }
                    this.zzgo = jArr4;
                    zzkVar.zzf(iZze);
                    break;
                case 104:
                    this.zzgq = zzkVar.zzl();
                    break;
                case 114:
                    int iZzk2 = zzkVar.zzk();
                    int iZze2 = zzkVar.zze(iZzk2);
                    int i16 = iZzk2 / 4;
                    float[] fArr = this.zzgp;
                    int length6 = fArr == null ? 0 : fArr.length;
                    int i17 = i16 + length6;
                    float[] fArr2 = new float[i17];
                    if (length6 != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length6);
                    }
                    while (length6 < i17) {
                        fArr2[length6] = Float.intBitsToFloat(zzkVar.zzm());
                        length6++;
                    }
                    this.zzgp = fArr2;
                    zzkVar.zzf(iZze2);
                    break;
                case 117:
                    int iZzb5 = zzw.zzb(zzkVar, 117);
                    float[] fArr3 = this.zzgp;
                    int length7 = fArr3 == null ? 0 : fArr3.length;
                    int i18 = iZzb5 + length7;
                    float[] fArr4 = new float[i18];
                    if (length7 != 0) {
                        System.arraycopy(fArr3, 0, fArr4, 0, length7);
                    }
                    while (length7 < i18 - 1) {
                        fArr4[length7] = Float.intBitsToFloat(zzkVar.zzm());
                        zzkVar.zzj();
                        length7++;
                    }
                    fArr4[length7] = Float.intBitsToFloat(zzkVar.zzm());
                    this.zzgp = fArr4;
                    break;
                default:
                    if (!super.zza(zzkVar, iZzj)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }
}
