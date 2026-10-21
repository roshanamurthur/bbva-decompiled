package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractECLookupTable implements ECLookupTable {
    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i10) {
        return lookup(i10);
    }
}
