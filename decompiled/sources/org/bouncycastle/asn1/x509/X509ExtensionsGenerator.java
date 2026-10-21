package org.bouncycastle.asn1.x509;

import ad.e;
import androidx.constraintlayout.core.parser.a;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes12.dex */
public class X509ExtensionsGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Hashtable f87772a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector f87773b = new Vector();

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) {
        try {
            addExtension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        } catch (IOException e5) {
            throw new IllegalArgumentException(e.d("error encoding value: ", e5));
        }
    }

    public X509Extensions generate() {
        return new X509Extensions(this.f87773b, this.f87772a);
    }

    public boolean isEmpty() {
        return this.f87773b.isEmpty();
    }

    public void reset() {
        this.f87772a = new Hashtable();
        this.f87773b = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        if (this.f87772a.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(a.b("extension ", aSN1ObjectIdentifier, " already added"));
        }
        this.f87773b.addElement(aSN1ObjectIdentifier);
        this.f87772a.put(aSN1ObjectIdentifier, new X509Extension(z10, new DEROctetString(bArr)));
    }
}
