package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes12.dex */
public class BEROctetStringParser implements ASN1OctetStringParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1StreamParser f86556p0;

    public BEROctetStringParser(ASN1StreamParser aSN1StreamParser) {
        this.f86556p0 = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new BEROctetString(Streams.readAll(getOctetStream()));
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return new b(this.f86556p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e5) {
            throw new ASN1ParsingException(androidx.camera.core.impl.a.d(e5, new StringBuilder("IOException converting stream to byte array: ")), e5);
        }
    }
}
