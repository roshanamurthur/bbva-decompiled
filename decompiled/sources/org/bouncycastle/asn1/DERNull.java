package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DERNull extends ASN1Null {
    public static final DERNull INSTANCE = new DERNull();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final byte[] f86570p0 = new byte[0];

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 5, f86570p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        return 2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }
}
