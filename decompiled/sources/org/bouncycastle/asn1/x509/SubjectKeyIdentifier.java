package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class SubjectKeyIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f87687p0;

    public SubjectKeyIdentifier(ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }

    public static SubjectKeyIdentifier fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.subjectKeyIdentifier));
    }

    public static SubjectKeyIdentifier getInstance(Object obj) {
        if (obj instanceof SubjectKeyIdentifier) {
            return (SubjectKeyIdentifier) obj;
        }
        if (obj != null) {
            return new SubjectKeyIdentifier(ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    public byte[] getKeyIdentifier() {
        return Arrays.clone(this.f87687p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(getKeyIdentifier());
    }

    public SubjectKeyIdentifier(byte[] bArr) {
        this.f87687p0 = Arrays.clone(bArr);
    }

    public static SubjectKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1OctetString.getInstance(aSN1TaggedObject, z10));
    }
}
