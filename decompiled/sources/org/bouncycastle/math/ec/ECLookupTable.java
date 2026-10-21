package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes13.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i10);

    ECPoint lookupVar(int i10);
}
