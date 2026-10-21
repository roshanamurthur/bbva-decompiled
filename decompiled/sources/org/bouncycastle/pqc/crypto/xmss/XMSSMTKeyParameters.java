package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSMTKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f91327q0;

    public XMSSMTKeyParameters(boolean z10, String str) {
        super(z10);
        this.f91327q0 = str;
    }

    public String getTreeDigest() {
        return this.f91327q0;
    }
}
