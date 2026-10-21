package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1StreamParser f86594p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f86595q0 = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public InputStream f86596r0;

    public b(ASN1StreamParser aSN1StreamParser) {
        this.f86594p0 = aSN1StreamParser;
    }

    public final ASN1OctetStringParser b() throws IOException {
        ASN1Encodable object = this.f86594p0.readObject();
        if (object == null) {
            return null;
        }
        if (object instanceof ASN1OctetStringParser) {
            return (ASN1OctetStringParser) object;
        }
        throw new IOException("unknown object encountered: " + object.getClass());
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ASN1OctetStringParser aSN1OctetStringParserB;
        if (this.f86596r0 == null) {
            if (!this.f86595q0 || (aSN1OctetStringParserB = b()) == null) {
                return -1;
            }
            this.f86595q0 = false;
            this.f86596r0 = aSN1OctetStringParserB.getOctetStream();
        }
        while (true) {
            int i10 = this.f86596r0.read();
            if (i10 >= 0) {
                return i10;
            }
            ASN1OctetStringParser aSN1OctetStringParserB2 = b();
            if (aSN1OctetStringParserB2 == null) {
                this.f86596r0 = null;
                return -1;
            }
            this.f86596r0 = aSN1OctetStringParserB2.getOctetStream();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        ASN1OctetStringParser aSN1OctetStringParserB;
        int i12 = 0;
        if (this.f86596r0 == null) {
            if (!this.f86595q0 || (aSN1OctetStringParserB = b()) == null) {
                return -1;
            }
            this.f86595q0 = false;
            this.f86596r0 = aSN1OctetStringParserB.getOctetStream();
        }
        while (true) {
            int i13 = this.f86596r0.read(bArr, i10 + i12, i11 - i12);
            if (i13 >= 0) {
                i12 += i13;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                ASN1OctetStringParser aSN1OctetStringParserB2 = b();
                if (aSN1OctetStringParserB2 == null) {
                    this.f86596r0 = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f86596r0 = aSN1OctetStringParserB2.getOctetStream();
            }
        }
    }
}
