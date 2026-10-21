package org.bouncycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class SemanticsInformation extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87796p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralName[] f87797q0;

    public SemanticsInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87796p0 = aSN1ObjectIdentifier;
        this.f87797q0 = null;
    }

    public static SemanticsInformation getInstance(Object obj) {
        if (obj instanceof SemanticsInformation) {
            return (SemanticsInformation) obj;
        }
        Object objNextElement = null;
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SemanticsInformation semanticsInformation = new SemanticsInformation();
        Enumeration objects = aSN1Sequence.getObjects();
        if (aSN1Sequence.size() < 1) {
            throw new IllegalArgumentException("no objects in SemanticsInformation");
        }
        Object objNextElement2 = objects.nextElement();
        if (objNextElement2 instanceof ASN1ObjectIdentifier) {
            semanticsInformation.f87796p0 = ASN1ObjectIdentifier.getInstance(objNextElement2);
            if (objects.hasMoreElements()) {
                objNextElement = objects.nextElement();
            }
        } else {
            objNextElement = objNextElement2;
        }
        if (objNextElement != null) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(objNextElement);
            semanticsInformation.f87797q0 = new GeneralName[aSN1Sequence2.size()];
            for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
                semanticsInformation.f87797q0[i10] = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i10));
            }
        }
        return semanticsInformation;
    }

    public GeneralName[] getNameRegistrationAuthorities() {
        GeneralName[] generalNameArr = this.f87797q0;
        if (generalNameArr == null) {
            return null;
        }
        GeneralName[] generalNameArr2 = new GeneralName[generalNameArr.length];
        System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        return generalNameArr2;
    }

    public ASN1ObjectIdentifier getSemanticsIdentifier() {
        return this.f87796p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f87796p0;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        GeneralName[] generalNameArr = this.f87797q0;
        if (generalNameArr != null) {
            aSN1EncodableVector.add(new DERSequence(generalNameArr));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SemanticsInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName[] generalNameArr) {
        GeneralName[] generalNameArr2;
        this.f87796p0 = aSN1ObjectIdentifier;
        if (generalNameArr != null) {
            generalNameArr2 = new GeneralName[generalNameArr.length];
            System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        } else {
            generalNameArr2 = null;
        }
        this.f87797q0 = generalNameArr2;
    }

    public SemanticsInformation(GeneralName[] generalNameArr) {
        GeneralName[] generalNameArr2 = null;
        this.f87796p0 = null;
        if (generalNameArr != null) {
            generalNameArr2 = new GeneralName[generalNameArr.length];
            System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        }
        this.f87797q0 = generalNameArr2;
    }
}
