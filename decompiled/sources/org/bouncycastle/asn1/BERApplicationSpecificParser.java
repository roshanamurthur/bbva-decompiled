package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class BERApplicationSpecificParser implements ASN1ApplicationSpecificParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f86542p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1StreamParser f86543q0;

    public BERApplicationSpecificParser(int i10, ASN1StreamParser aSN1StreamParser) {
        this.f86542p0 = i10;
        this.f86543q0 = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new BERApplicationSpecific(this.f86542p0, this.f86543q0.c());
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecificParser
    public ASN1Encodable readObject() throws IOException {
        return this.f86543q0.readObject();
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
