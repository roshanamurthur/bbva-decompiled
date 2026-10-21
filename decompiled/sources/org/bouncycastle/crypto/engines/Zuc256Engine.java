package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public final class Zuc256Engine extends Zuc256CoreEngine {
    public Zuc256Engine() {
    }

    @Override // org.bouncycastle.crypto.engines.Zuc256CoreEngine, org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc256Engine(this);
    }

    public Zuc256Engine(int i10) {
        super(i10);
    }
}
