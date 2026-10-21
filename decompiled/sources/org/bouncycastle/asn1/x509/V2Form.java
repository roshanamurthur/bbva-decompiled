package org.bouncycastle.asn1.x509;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class V2Form extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GeneralNames f87741p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final IssuerSerial f87742q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ObjectDigestInfo f87743r0;

    public V2Form(ASN1Sequence aSN1Sequence) {
        int i10;
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            i10 = 0;
        } else {
            this.f87741p0 = GeneralNames.getInstance(aSN1Sequence.getObjectAt(0));
            i10 = 1;
        }
        while (i10 != aSN1Sequence.size()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.f87742q0 = IssuerSerial.getInstance(aSN1TaggedObject, false);
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
                }
                this.f87743r0 = ObjectDigestInfo.getInstance(aSN1TaggedObject, false);
            }
            i10++;
        }
    }

    public static V2Form getInstance(Object obj) {
        if (obj instanceof V2Form) {
            return (V2Form) obj;
        }
        if (obj != null) {
            return new V2Form(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IssuerSerial getBaseCertificateID() {
        return this.f87742q0;
    }

    public GeneralNames getIssuerName() {
        return this.f87741p0;
    }

    public ObjectDigestInfo getObjectDigestInfo() {
        return this.f87743r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        GeneralNames generalNames = this.f87741p0;
        if (generalNames != null) {
            aSN1EncodableVector.add(generalNames);
        }
        IssuerSerial issuerSerial = this.f87742q0;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, issuerSerial));
        }
        ObjectDigestInfo objectDigestInfo = this.f87743r0;
        if (objectDigestInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, objectDigestInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static V2Form getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public V2Form(GeneralNames generalNames) {
        this(generalNames, null, null);
    }

    public V2Form(GeneralNames generalNames, IssuerSerial issuerSerial) {
        this(generalNames, issuerSerial, null);
    }

    public V2Form(GeneralNames generalNames, IssuerSerial issuerSerial, ObjectDigestInfo objectDigestInfo) {
        this.f87741p0 = generalNames;
        this.f87742q0 = issuerSerial;
        this.f87743r0 = objectDigestInfo;
    }

    public V2Form(GeneralNames generalNames, ObjectDigestInfo objectDigestInfo) {
        this(generalNames, null, objectDigestInfo);
    }
}
