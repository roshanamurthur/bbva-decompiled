package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSKeyParameters extends AsymmetricKeyParameter {
    public static final String SHAKE128 = "SHAKE128";
    public static final String SHAKE256 = "SHAKE256";
    public static final String SHA_256 = "SHA-256";
    public static final String SHA_512 = "SHA-512";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f91317q0;

    public XMSSKeyParameters(boolean z10, String str) {
        super(z10);
        this.f91317q0 = str;
    }

    public String getTreeDigest() {
        return this.f91317q0;
    }
}
