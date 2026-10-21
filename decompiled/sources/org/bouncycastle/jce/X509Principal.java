package org.bouncycastle.jce;

import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes8.dex */
public class X509Principal extends X509Name implements Principal {
    public X509Principal(String str) {
        super(str);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        try {
            return getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new RuntimeException(e5.toString());
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }

    public X509Principal(Hashtable hashtable) {
        super(hashtable);
    }

    public X509Principal(Vector vector, Hashtable hashtable) {
        super(vector, hashtable);
    }

    public X509Principal(Vector vector, Vector vector2) {
        super(vector, vector2);
    }

    public X509Principal(X500Name x500Name) {
        super((ASN1Sequence) x500Name.toASN1Primitive());
    }

    public X509Principal(X509Name x509Name) {
        super((ASN1Sequence) x509Name.toASN1Primitive());
    }

    public X509Principal(boolean z10, String str) {
        super(z10, str);
    }

    public X509Principal(boolean z10, Hashtable hashtable, String str) {
        super(z10, hashtable, str);
    }

    public X509Principal(byte[] bArr) throws IOException {
        try {
            super(ASN1Sequence.getInstance(new ASN1InputStream(bArr).readObject()));
        } catch (IllegalArgumentException e5) {
            throw new IOException("not an ASN.1 Sequence: " + e5);
        }
    }
}
