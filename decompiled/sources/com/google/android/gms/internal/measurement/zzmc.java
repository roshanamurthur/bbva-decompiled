package com.google.android.gms.internal.measurement;

import ad.e;
import c2.b;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzmc {
    private static final zzmc zza = new zzmc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmc(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzmc zzc() {
        return zza;
    }

    public static zzmc zzd(zzmc zzmcVar, zzmc zzmcVar2) {
        int i10 = zzmcVar.zzb + zzmcVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmcVar.zzc, i10);
        System.arraycopy(zzmcVar2.zzc, 0, iArrCopyOf, zzmcVar.zzb, zzmcVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmcVar.zzd, i10);
        System.arraycopy(zzmcVar2.zzd, 0, objArrCopyOf, zzmcVar.zzb, zzmcVar2.zzb);
        return new zzmc(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzmc zze() {
        return new zzmc(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmc)) {
            return false;
        }
        zzmc zzmcVar = (zzmc) obj;
        int i10 = this.zzb;
        if (i10 == zzmcVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmcVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzmcVar.zzd;
            int i12 = this.zzb;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).longValue();
                    iA = e.a(i13 << 3, 8, iA);
                } else if (i14 == 2) {
                    zzix zzixVar = (zzix) this.zzd[i11];
                    int iZzA2 = zzje.zzA(i13 << 3);
                    int iZzd = zzixVar.zzd();
                    iA = b.f(iZzd, iZzd, iZzA2, iA);
                } else if (i14 == 3) {
                    int iZzz = zzje.zzz(i13);
                    iZzA = iZzz + iZzz;
                    iZzB = ((zzmc) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzkh.zza());
                    }
                    ((Integer) this.zzd[i11]).intValue();
                    iA = e.a(i13 << 3, 4, iA);
                }
            } else {
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzA = zzje.zzA(i13 << 3);
                iZzB = zzje.zzB(jLongValue);
            }
            iA = iZzB + iZzA + iA;
        }
        this.zze = iA;
        return iA;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            zzix zzixVar = (zzix) this.zzd[i11];
            int iZzA2 = zzje.zzA(8);
            int iZzd = zzixVar.zzd();
            iZzA += zzje.zzA(iZzd) + iZzd + zzje.zzA(24) + e.a(i12 >>> 3, zzje.zzA(16), iZzA2 + iZzA2);
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzle.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzh(int i10, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.zzb;
        int[] iArr = this.zzc;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.zzc = Arrays.copyOf(iArr, i12);
            this.zzd = Arrays.copyOf(this.zzd, i12);
        }
        int[] iArr2 = this.zzc;
        int i13 = this.zzb;
        iArr2[i13] = i10;
        this.zzd[i13] = obj;
        this.zzb = i13 + 1;
    }

    public final void zzi(zzjf zzjfVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzjfVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzjfVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzjfVar.zzd(i12, (zzix) obj);
                } else if (i13 == 3) {
                    zzjfVar.zzE(i12);
                    ((zzmc) obj).zzi(zzjfVar);
                    zzjfVar.zzh(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(zzkh.zza());
                    }
                    zzjfVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzmc() {
        this(0, new int[8], new Object[8], true);
    }
}
