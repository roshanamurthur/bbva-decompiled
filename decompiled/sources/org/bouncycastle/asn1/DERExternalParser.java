package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DERExternalParser implements ASN1Encodable, InMemoryRepresentable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1StreamParser f86563p0;

    public DERExternalParser(ASN1StreamParser aSN1StreamParser) {
        this.f86563p0 = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        try {
            return new DLExternal(this.f86563p0.c());
        } catch (IllegalArgumentException e5) {
            throw new ASN1Exception(e5.getMessage(), e5);
        }
    }

    public ASN1Encodable readObject() throws IOException {
        return this.f86563p0.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e5) {
            throw new ASN1ParsingException("unable to get DER object", e5);
        } catch (IllegalArgumentException e7) {
            throw new ASN1ParsingException("unable to get DER object", e7);
        }
    }
}
