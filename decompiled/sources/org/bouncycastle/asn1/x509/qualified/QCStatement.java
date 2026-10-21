package org.bouncycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class QCStatement extends ASN1Object implements ETSIQCObjectIdentifiers, RFC3739QCObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87795q0;

    public QCStatement(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87794p0 = aSN1ObjectIdentifier;
        this.f87795q0 = null;
    }

    public static QCStatement getInstance(Object obj) {
        if (obj instanceof QCStatement) {
            return (QCStatement) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        QCStatement qCStatement = new QCStatement();
        Enumeration objects = aSN1Sequence.getObjects();
        qCStatement.f87794p0 = ASN1ObjectIdentifier.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            qCStatement.f87795q0 = (ASN1Encodable) objects.nextElement();
        }
        return qCStatement;
    }

    public ASN1ObjectIdentifier getStatementId() {
        return this.f87794p0;
    }

    public ASN1Encodable getStatementInfo() {
        return this.f87795q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87794p0);
        ASN1Encodable aSN1Encodable = this.f87795q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public QCStatement(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87794p0 = aSN1ObjectIdentifier;
        this.f87795q0 = aSN1Encodable;
    }
}
