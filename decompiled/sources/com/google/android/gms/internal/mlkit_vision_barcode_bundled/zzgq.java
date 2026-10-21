package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.appcompat.widget.o1;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgq {
    private static final zzgq zza = new zzgq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgq(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzgq zzc() {
        return zza;
    }

    public static zzgq zzd(zzgq zzgqVar, zzgq zzgqVar2) {
        int i10 = zzgqVar.zzb + zzgqVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgqVar.zzc, i10);
        System.arraycopy(zzgqVar2.zzc, 0, iArrCopyOf, zzgqVar.zzb, zzgqVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgqVar.zzd, i10);
        System.arraycopy(zzgqVar2.zzd, 0, objArrCopyOf, zzgqVar.zzb, zzgqVar2.zzb);
        return new zzgq(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzgq zze() {
        return new zzgq(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgq)) {
            return false;
        }
        zzgq zzgqVar = (zzgq) obj;
        int i10 = this.zzb;
        if (i10 == zzgqVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgqVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzgqVar.zzd;
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
        int iZzD;
        int iZzE;
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
                    iA = o1.a(i13 << 3, 8, iA);
                } else if (i14 == 2) {
                    zzdb zzdbVar = (zzdb) this.zzd[i11];
                    int iZzD2 = zzdi.zzD(i13 << 3);
                    int iZzd = zzdbVar.zzd();
                    iA = a.a(iZzd, iZzd, iZzD2, iA);
                } else if (i14 == 3) {
                    int iZzC = zzdi.zzC(i13);
                    iZzD = iZzC + iZzC;
                    iZzE = ((zzgq) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzen.zza());
                    }
                    ((Integer) this.zzd[i11]).intValue();
                    iA = o1.a(i13 << 3, 4, iA);
                }
            } else {
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzD = zzdi.zzD(i13 << 3);
                iZzE = zzdi.zzE(jLongValue);
            }
            iA = iZzE + iZzD + iA;
        }
        this.zze = iA;
        return iA;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzD = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            zzdb zzdbVar = (zzdb) this.zzd[i11];
            int iZzD2 = zzdi.zzD(8);
            int iZzd = zzdbVar.zzd();
            iZzD += zzdi.zzD(iZzd) + iZzd + zzdi.zzD(24) + o1.a(i12 >>> 3, zzdi.zzD(16), iZzD2 + iZzD2);
        }
        this.zze = iZzD;
        return iZzD;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzfn.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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

    public final void zzi(zzdj zzdjVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzdjVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzj(zzdj zzdjVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzdjVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzdjVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzdjVar.zzd(i12, (zzdb) obj);
                } else if (i13 == 3) {
                    zzdjVar.zzF(i12);
                    ((zzgq) obj).zzj(zzdjVar);
                    zzdjVar.zzh(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(zzen.zza());
                    }
                    zzdjVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzgq() {
        this(0, new int[8], new Object[8], true);
    }
}
