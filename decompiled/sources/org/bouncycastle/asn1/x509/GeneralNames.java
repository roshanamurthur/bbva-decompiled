package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class GeneralNames extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GeneralName[] f87627p0;

    public GeneralNames(ASN1Sequence aSN1Sequence) {
        this.f87627p0 = new GeneralName[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            this.f87627p0[i10] = GeneralName.getInstance(aSN1Sequence.getObjectAt(i10));
        }
    }

    public static GeneralNames fromExtensions(Extensions extensions, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, aSN1ObjectIdentifier));
    }

    public static GeneralNames getInstance(Object obj) {
        if (obj instanceof GeneralNames) {
            return (GeneralNames) obj;
        }
        if (obj != null) {
            return new GeneralNames(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralName[] getNames() {
        GeneralName[] generalNameArr = this.f87627p0;
        GeneralName[] generalNameArr2 = new GeneralName[generalNameArr.length];
        System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        return generalNameArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f87627p0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(strLineSeparator);
        int i10 = 0;
        while (true) {
            GeneralName[] generalNameArr = this.f87627p0;
            if (i10 == generalNameArr.length) {
                return stringBuffer.toString();
            }
            stringBuffer.append("    ");
            stringBuffer.append(generalNameArr[i10]);
            stringBuffer.append(strLineSeparator);
            i10++;
        }
    }

    public GeneralNames(GeneralName generalName) {
        this.f87627p0 = new GeneralName[]{generalName};
    }

    public static GeneralNames getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return new GeneralNames(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public GeneralNames(GeneralName[] generalNameArr) {
        GeneralName[] generalNameArr2 = new GeneralName[generalNameArr.length];
        System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        this.f87627p0 = generalNameArr2;
    }
}
