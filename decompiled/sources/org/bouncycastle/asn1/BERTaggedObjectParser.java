package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class BERTaggedObjectParser implements ASN1TaggedObjectParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f86559p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f86560q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1StreamParser f86561r0;

    public BERTaggedObjectParser(boolean z10, int i10, ASN1StreamParser aSN1StreamParser) {
        this.f86559p0 = z10;
        this.f86560q0 = i10;
        this.f86561r0 = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        boolean z10 = this.f86559p0;
        return this.f86561r0.b(this.f86560q0, z10);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable getObjectParser(int i10, boolean z10) throws IOException {
        ASN1StreamParser aSN1StreamParser = this.f86561r0;
        boolean z11 = this.f86559p0;
        if (z10) {
            if (z11) {
                return aSN1StreamParser.readObject();
            }
            throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
        }
        InputStream inputStream = aSN1StreamParser.f86535a;
        if (inputStream instanceof f) {
            if (z11) {
                return aSN1StreamParser.a(i10);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        if (z11) {
            if (i10 == 4) {
                return new BEROctetStringParser(aSN1StreamParser);
            }
            if (i10 == 16) {
                return new DLSequenceParser(aSN1StreamParser);
            }
            if (i10 == 17) {
                return new DLSetParser(aSN1StreamParser);
            }
        } else {
            if (i10 == 4) {
                return new DEROctetStringParser((e) inputStream);
            }
            if (i10 == 16) {
                throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (i10 == 17) {
                throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
        }
        throw new ASN1Exception("implicit tagging not implemented");
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.f86560q0;
    }

    public boolean isConstructed() {
        return this.f86559p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e5) {
            throw new ASN1ParsingException(e5.getMessage());
        }
    }
}
