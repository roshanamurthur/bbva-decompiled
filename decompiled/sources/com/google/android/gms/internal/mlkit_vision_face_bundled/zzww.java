package com.google.android.gms.internal.mlkit_vision_face_bundled;

import ai.a;
import androidx.appcompat.widget.c;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzww {
    private static final zzww zza = new zzww(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzww(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzww zzc() {
        return zza;
    }

    public static zzww zze(zzww zzwwVar, zzww zzwwVar2) {
        int i10 = zzwwVar.zzb + zzwwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzwwVar.zzc, i10);
        System.arraycopy(zzwwVar2.zzc, 0, iArrCopyOf, zzwwVar.zzb, zzwwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzwwVar.zzd, i10);
        System.arraycopy(zzwwVar2.zzd, 0, objArrCopyOf, zzwwVar.zzb, zzwwVar2.zzb);
        return new zzww(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzww zzf() {
        return new zzww(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzww)) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        int i10 = this.zzb;
        if (i10 == zzwwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzwwVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzwwVar.zzd;
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
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzz3 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        zztu zztuVar = (zztu) this.zzd[i11];
                        int iZzz4 = zzuc.zzz(i15);
                        int iZzd = zztuVar.zzd();
                        iZzz3 = zzuc.zzz(iZzd) + iZzd + iZzz4 + iZzz3;
                    } else if (i14 == 3) {
                        int iZzz5 = zzuc.zzz(i13 << 3);
                        iZzz = iZzz5 + iZzz5;
                        iZzA = ((zzww) this.zzd[i11]).zza();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new zzvd("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i11]).intValue();
                        iZzz2 = zzuc.zzz(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i11]).longValue();
                    iZzz2 = zzuc.zzz(i13 << 3) + 8;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzz = zzuc.zzz(i16);
                iZzA = zzuc.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zztu zztuVar = (zztu) this.zzd[i11];
            int iZzz = zzuc.zzz(8);
            int iZzz2 = zzuc.zzz(i12) + zzuc.zzz(16);
            int iZzz3 = zzuc.zzz(24);
            int iZzd = zztuVar.zzd();
            iA = c.a(iZzz + iZzz, iZzz2, a.d(iZzd, iZzd, iZzz3), iA);
        }
        this.zze = iA;
        return iA;
    }

    public final zzww zzd(zzww zzwwVar) {
        if (zzwwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzwwVar.zzb;
        zzm(i10);
        System.arraycopy(zzwwVar.zzc, 0, this.zzc, this.zzb, zzwwVar.zzb);
        System.arraycopy(zzwwVar.zzd, 0, this.zzd, this.zzb, zzwwVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzvy.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzxi zzxiVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzxiVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzxi zzxiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzxiVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzxiVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzxiVar.zzd(i13, (zztu) obj);
                } else if (i12 == 3) {
                    zzxiVar.zzF(i13);
                    ((zzww) obj).zzl(zzxiVar);
                    zzxiVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzvd("Protocol message tag had invalid wire type."));
                    }
                    zzxiVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzww() {
        this(0, new int[8], new Object[8], true);
    }
}
