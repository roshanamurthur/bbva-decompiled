package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes13.dex */
public class SimpleLookupTable extends AbstractECLookupTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPoint[] f90605a;

    public SimpleLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        ECPoint[] eCPointArr2 = new ECPoint[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            eCPointArr2[i12] = eCPointArr[i10 + i12];
        }
        this.f90605a = eCPointArr2;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public int getSize() {
        return this.f90605a.length;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookup(int i10) {
        throw new UnsupportedOperationException("Constant-time lookup not supported");
    }

    @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i10) {
        return this.f90605a[i10];
    }
}
