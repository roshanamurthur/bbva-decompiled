package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* JADX INFO: loaded from: classes13.dex */
public interface XMSSPrivateKey extends XMSSKey, PrivateKey {
    XMSSPrivateKey extractKeyShard(int i10);

    long getIndex();

    long getUsagesRemaining();
}
