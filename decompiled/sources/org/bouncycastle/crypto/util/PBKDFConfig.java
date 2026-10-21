package org.bouncycastle.crypto.util;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PBKDFConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1ObjectIdentifier f89642a;

    public PBKDFConfig(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f89642a = aSN1ObjectIdentifier;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.f89642a;
    }
}
