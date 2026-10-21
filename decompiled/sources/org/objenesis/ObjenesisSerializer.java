package org.objenesis;

import org.objenesis.strategy.SerializingInstantiatorStrategy;

/* JADX INFO: loaded from: classes13.dex */
public class ObjenesisSerializer extends ObjenesisBase {
    public ObjenesisSerializer() {
        super(new SerializingInstantiatorStrategy());
    }

    public ObjenesisSerializer(boolean z10) {
        super(new SerializingInstantiatorStrategy(), z10);
    }
}
