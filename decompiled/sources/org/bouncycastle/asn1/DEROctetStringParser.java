package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class DEROctetStringParser implements ASN1OctetStringParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final e f86572p0;

    public DEROctetStringParser(e eVar) {
        this.f86572p0 = eVar;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return new DEROctetString(this.f86572p0.e());
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return this.f86572p0;
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
