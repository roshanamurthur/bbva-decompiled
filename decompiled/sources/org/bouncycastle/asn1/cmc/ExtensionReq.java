package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.Extension;

/* JADX INFO: loaded from: classes12.dex */
public class ExtensionReq extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Extension[] f86687p0;

    public ExtensionReq(ASN1Sequence aSN1Sequence) {
        this.f86687p0 = new Extension[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            this.f86687p0[i10] = Extension.getInstance(aSN1Sequence.getObjectAt(i10));
        }
    }

    public static ExtensionReq getInstance(Object obj) {
        if (obj instanceof ExtensionReq) {
            return (ExtensionReq) obj;
        }
        if (obj != null) {
            return new ExtensionReq(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Extension[] getExtensions() {
        Extension[] extensionArr = this.f86687p0;
        Extension[] extensionArr2 = new Extension[extensionArr.length];
        System.arraycopy(extensionArr, 0, extensionArr2, 0, extensionArr.length);
        return extensionArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f86687p0);
    }

    public ExtensionReq(Extension extension) {
        this.f86687p0 = new Extension[]{extension};
    }

    public static ExtensionReq getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public ExtensionReq(Extension[] extensionArr) {
        Extension[] extensionArr2 = new Extension[extensionArr.length];
        System.arraycopy(extensionArr, 0, extensionArr2, 0, extensionArr.length);
        this.f86687p0 = extensionArr2;
    }
}
