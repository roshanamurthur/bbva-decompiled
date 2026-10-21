package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class BERSequenceParser implements ASN1SequenceParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1StreamParser f86557p0;

    public BERSequenceParser(ASN1StreamParser aSN1StreamParser) {
        this.f86557p0 = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new BERSequence(this.f86557p0.c());
    }

    @Override // org.bouncycastle.asn1.ASN1SequenceParser
    public ASN1Encodable readObject() throws IOException {
        return this.f86557p0.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e5) {
            throw new IllegalStateException(e5.getMessage());
        }
    }
}
