package org.objenesis;

import org.objenesis.strategy.StdInstantiatorStrategy;

/* JADX INFO: loaded from: classes13.dex */
public class ObjenesisStd extends ObjenesisBase {
    public ObjenesisStd() {
        super(new StdInstantiatorStrategy());
    }

    public ObjenesisStd(boolean z10) {
        super(new StdInstantiatorStrategy(), z10);
    }
}
