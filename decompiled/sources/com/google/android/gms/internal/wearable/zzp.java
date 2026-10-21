package com.google.android.gms.internal.wearable;

/* JADX INFO: loaded from: classes9.dex */
public final class zzp implements Cloneable {
    private static final zzq zzhe = new zzq();
    private int mSize;
    private boolean zzhf;
    private int[] zzhg;
    private zzq[] zzhh;

    public zzp() {
        this(10);
    }

    private static int idealIntArraySize(int i10) {
        int i11 = i10 << 2;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        return i11 / 4;
    }

    private final int zzq(int i10) {
        int i11 = this.mSize - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.zzhg[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i10 = this.mSize;
        zzp zzpVar = new zzp(i10);
        System.arraycopy(this.zzhg, 0, zzpVar.zzhg, 0, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            zzq zzqVar = this.zzhh[i11];
            if (zzqVar != null) {
                zzpVar.zzhh[i11] = (zzq) zzqVar.clone();
            }
        }
        zzpVar.mSize = i10;
        return zzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp zzpVar = (zzp) obj;
        int i10 = this.mSize;
        if (i10 != zzpVar.mSize) {
            return false;
        }
        int[] iArr = this.zzhg;
        int[] iArr2 = zzpVar.zzhg;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        zzq[] zzqVarArr = this.zzhh;
        zzq[] zzqVarArr2 = zzpVar.zzhh;
        int i12 = this.mSize;
        for (int i13 = 0; i13 < i12; i13++) {
            if (!zzqVarArr[i13].equals(zzqVarArr2[i13])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i10 = 0; i10 < this.mSize; i10++) {
            iHashCode = (((iHashCode * 31) + this.zzhg[i10]) * 31) + this.zzhh[i10].hashCode();
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    public final int size() {
        return this.mSize;
    }

    public final void zza(int i10, zzq zzqVar) {
        int iZzq = zzq(i10);
        if (iZzq >= 0) {
            this.zzhh[iZzq] = zzqVar;
            return;
        }
        int i11 = ~iZzq;
        int i12 = this.mSize;
        if (i11 < i12) {
            zzq[] zzqVarArr = this.zzhh;
            if (zzqVarArr[i11] == zzhe) {
                this.zzhg[i11] = i10;
                zzqVarArr[i11] = zzqVar;
                return;
            }
        }
        if (i12 >= this.zzhg.length) {
            int iIdealIntArraySize = idealIntArraySize(i12 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            zzq[] zzqVarArr2 = new zzq[iIdealIntArraySize];
            int[] iArr2 = this.zzhg;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzq[] zzqVarArr3 = this.zzhh;
            System.arraycopy(zzqVarArr3, 0, zzqVarArr2, 0, zzqVarArr3.length);
            this.zzhg = iArr;
            this.zzhh = zzqVarArr2;
        }
        int i13 = this.mSize;
        if (i13 - i11 != 0) {
            int[] iArr3 = this.zzhg;
            int i14 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i14, i13 - i11);
            zzq[] zzqVarArr4 = this.zzhh;
            System.arraycopy(zzqVarArr4, i11, zzqVarArr4, i14, this.mSize - i11);
        }
        this.zzhg[i11] = i10;
        this.zzhh[i11] = zzqVar;
        this.mSize++;
    }

    public final zzq zzo(int i10) {
        zzq zzqVar;
        int iZzq = zzq(i10);
        if (iZzq < 0 || (zzqVar = this.zzhh[iZzq]) == zzhe) {
            return null;
        }
        return zzqVar;
    }

    public final zzq zzp(int i10) {
        return this.zzhh[i10];
    }

    private zzp(int i10) {
        this.zzhf = false;
        int iIdealIntArraySize = idealIntArraySize(i10);
        this.zzhg = new int[iIdealIntArraySize];
        this.zzhh = new zzq[iIdealIntArraySize];
        this.mSize = 0;
    }
}
