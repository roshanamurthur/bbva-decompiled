package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class BERSetParser implements ASN1SetParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1StreamParser f86558p0;

    public BERSetParser(ASN1StreamParser aSN1StreamParser) {
        this.f86558p0 = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new BERSet(this.f86558p0.c());
    }

    @Override // org.bouncycastle.asn1.ASN1SetParser
    public ASN1Encodable readObject() throws IOException {
        return this.f86558p0.readObject();
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
