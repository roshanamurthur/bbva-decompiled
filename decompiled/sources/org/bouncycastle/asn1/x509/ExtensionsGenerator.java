package org.bouncycastle.asn1.x509;

import androidx.constraintlayout.core.parser.a;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes12.dex */
public class ExtensionsGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Hashtable f87623a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector f87624b = new Vector();

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws IOException {
        addExtension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    public Extensions generate() {
        Extension[] extensionArr = new Extension[this.f87624b.size()];
        for (int i10 = 0; i10 != this.f87624b.size(); i10++) {
            extensionArr[i10] = (Extension) this.f87623a.get(this.f87624b.elementAt(i10));
        }
        return new Extensions(extensionArr);
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.f87623a.get(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f87623a.containsKey(aSN1ObjectIdentifier);
    }

    public boolean isEmpty() {
        return this.f87624b.isEmpty();
    }

    public void removeExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (!this.f87623a.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(a.b("extension ", aSN1ObjectIdentifier, " not present"));
        }
        this.f87624b.removeElement(aSN1ObjectIdentifier);
        this.f87623a.remove(aSN1ObjectIdentifier);
    }

    public void replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws IOException {
        replaceExtension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    public void reset() {
        this.f87623a = new Hashtable();
        this.f87624b = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        if (this.f87623a.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(a.b("extension ", aSN1ObjectIdentifier, " already added"));
        }
        this.f87624b.addElement(aSN1ObjectIdentifier);
        this.f87623a.put(aSN1ObjectIdentifier, new Extension(aSN1ObjectIdentifier, z10, new DEROctetString(bArr)));
    }

    public void replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        replaceExtension(new Extension(aSN1ObjectIdentifier, z10, bArr));
    }

    public void replaceExtension(Extension extension) {
        if (this.f87623a.containsKey(extension.getExtnId())) {
            this.f87623a.put(extension.getExtnId(), extension);
            return;
        }
        throw new IllegalArgumentException("extension " + extension.getExtnId() + " not present");
    }

    public void addExtension(Extension extension) {
        if (!this.f87623a.containsKey(extension.getExtnId())) {
            this.f87624b.addElement(extension.getExtnId());
            this.f87623a.put(extension.getExtnId(), extension);
        } else {
            throw new IllegalArgumentException("extension " + extension.getExtnId() + " already added");
        }
    }
}
