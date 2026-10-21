package org.bouncycastle.asn1.isismtt.x509;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.DirectoryString;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.IssuerSerial;

/* JADX INFO: loaded from: classes12.dex */
public class ProcurationSyntax extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f87300p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DirectoryString f87301q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public GeneralName f87302r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public IssuerSerial f87303s0;

    public ProcurationSyntax(String str, DirectoryString directoryString, GeneralName generalName) {
        this.f87300p0 = str;
        this.f87301q0 = directoryString;
        this.f87302r0 = generalName;
        this.f87303s0 = null;
    }

    public static ProcurationSyntax getInstance(Object obj) {
        if (obj == null || (obj instanceof ProcurationSyntax)) {
            return (ProcurationSyntax) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        ProcurationSyntax procurationSyntax = new ProcurationSyntax();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                procurationSyntax.f87300p0 = DERPrintableString.getInstance(aSN1TaggedObject, true).getString();
            } else if (tagNo == 2) {
                procurationSyntax.f87301q0 = DirectoryString.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 3) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
                }
                ASN1Primitive object = aSN1TaggedObject.getObject();
                if (object instanceof ASN1TaggedObject) {
                    procurationSyntax.f87302r0 = GeneralName.getInstance(object);
                } else {
                    procurationSyntax.f87303s0 = IssuerSerial.getInstance(object);
                }
            }
        }
        return procurationSyntax;
    }

    public IssuerSerial getCertRef() {
        return this.f87303s0;
    }

    public String getCountry() {
        return this.f87300p0;
    }

    public GeneralName getThirdPerson() {
        return this.f87302r0;
    }

    public DirectoryString getTypeOfSubstitution() {
        return this.f87301q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        String str = this.f87300p0;
        if (str != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, new DERPrintableString(str, true)));
        }
        DirectoryString directoryString = this.f87301q0;
        if (directoryString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, directoryString));
        }
        GeneralName generalName = this.f87302r0;
        if (generalName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, generalName));
        } else {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, this.f87303s0));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ProcurationSyntax(String str, DirectoryString directoryString, IssuerSerial issuerSerial) {
        this.f87300p0 = str;
        this.f87301q0 = directoryString;
        this.f87302r0 = null;
        this.f87303s0 = issuerSerial;
    }
}
