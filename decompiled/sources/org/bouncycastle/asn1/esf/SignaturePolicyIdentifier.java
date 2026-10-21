package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;

/* JADX INFO: loaded from: classes12.dex */
public class SignaturePolicyIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SignaturePolicyId f87234p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f87235q0 = true;

    public SignaturePolicyIdentifier() {
    }

    public static SignaturePolicyIdentifier getInstance(Object obj) {
        if (obj instanceof SignaturePolicyIdentifier) {
            return (SignaturePolicyIdentifier) obj;
        }
        if ((obj instanceof ASN1Null) || ASN1Object.hasEncodedTagValue(obj, 5)) {
            return new SignaturePolicyIdentifier();
        }
        if (obj != null) {
            return new SignaturePolicyIdentifier(SignaturePolicyId.getInstance(obj));
        }
        return null;
    }

    public SignaturePolicyId getSignaturePolicyId() {
        return this.f87234p0;
    }

    public boolean isSignaturePolicyImplied() {
        return this.f87235q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87235q0 ? DERNull.INSTANCE : this.f87234p0.toASN1Primitive();
    }

    public SignaturePolicyIdentifier(SignaturePolicyId signaturePolicyId) {
        this.f87234p0 = signaturePolicyId;
    }
}
