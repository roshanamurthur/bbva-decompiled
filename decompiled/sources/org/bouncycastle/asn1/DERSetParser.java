package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DERSetParser implements ASN1SetParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1StreamParser f86578p0;

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new DLSet(this.f86578p0.c());
    }

    @Override // org.bouncycastle.asn1.ASN1SetParser
    public ASN1Encodable readObject() throws IOException {
        return this.f86578p0.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e5) {
            throw new ASN1ParsingException(e5.getMessage(), e5);
        }
    }
}
