package org.bouncycastle.asn1.tsp;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class TSTInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87499p0 = new ASN1Integer(1);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87500q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MessageImprint f87501r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Integer f87502s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1GeneralizedTime f87503t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Accuracy f87504u0;
    public ASN1Boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ASN1Integer f87505w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public GeneralName f87506x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Extensions f87507y0;

    public TSTInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, MessageImprint messageImprint, ASN1Integer aSN1Integer, ASN1GeneralizedTime aSN1GeneralizedTime, Accuracy accuracy, ASN1Boolean aSN1Boolean, ASN1Integer aSN1Integer2, GeneralName generalName, Extensions extensions) {
        this.f87500q0 = aSN1ObjectIdentifier;
        this.f87501r0 = messageImprint;
        this.f87502s0 = aSN1Integer;
        this.f87503t0 = aSN1GeneralizedTime;
        this.f87504u0 = accuracy;
        this.v0 = aSN1Boolean;
        this.f87505w0 = aSN1Integer2;
        this.f87506x0 = generalName;
        this.f87507y0 = extensions;
    }

    public static TSTInfo getInstance(Object obj) {
        if (obj instanceof TSTInfo) {
            return (TSTInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TSTInfo tSTInfo = new TSTInfo();
        Enumeration objects = aSN1Sequence.getObjects();
        tSTInfo.f87499p0 = ASN1Integer.getInstance(objects.nextElement());
        tSTInfo.f87500q0 = ASN1ObjectIdentifier.getInstance(objects.nextElement());
        tSTInfo.f87501r0 = MessageImprint.getInstance(objects.nextElement());
        tSTInfo.f87502s0 = ASN1Integer.getInstance(objects.nextElement());
        tSTInfo.f87503t0 = ASN1GeneralizedTime.getInstance(objects.nextElement());
        ASN1Boolean aSN1Boolean = ASN1Boolean.getInstance(false);
        while (true) {
            tSTInfo.v0 = aSN1Boolean;
            while (objects.hasMoreElements()) {
                ASN1Object aSN1Object = (ASN1Object) objects.nextElement();
                if (aSN1Object instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Object;
                    int tagNo = aSN1TaggedObject.getTagNo();
                    if (tagNo == 0) {
                        tSTInfo.f87506x0 = GeneralName.getInstance(aSN1TaggedObject, true);
                    } else {
                        if (tagNo != 1) {
                            throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag value ")));
                        }
                        tSTInfo.f87507y0 = Extensions.getInstance(aSN1TaggedObject, false);
                    }
                } else if ((aSN1Object instanceof ASN1Sequence) || (aSN1Object instanceof Accuracy)) {
                    tSTInfo.f87504u0 = Accuracy.getInstance(aSN1Object);
                } else if (aSN1Object instanceof ASN1Boolean) {
                    aSN1Boolean = ASN1Boolean.getInstance(aSN1Object);
                } else if (aSN1Object instanceof ASN1Integer) {
                    tSTInfo.f87505w0 = ASN1Integer.getInstance(aSN1Object);
                }
            }
            return tSTInfo;
        }
    }

    public Accuracy getAccuracy() {
        return this.f87504u0;
    }

    public Extensions getExtensions() {
        return this.f87507y0;
    }

    public ASN1GeneralizedTime getGenTime() {
        return this.f87503t0;
    }

    public MessageImprint getMessageImprint() {
        return this.f87501r0;
    }

    public ASN1Integer getNonce() {
        return this.f87505w0;
    }

    public ASN1Boolean getOrdering() {
        return this.v0;
    }

    public ASN1ObjectIdentifier getPolicy() {
        return this.f87500q0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87502s0;
    }

    public GeneralName getTsa() {
        return this.f87506x0;
    }

    public ASN1Integer getVersion() {
        return this.f87499p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        aSN1EncodableVector.add(this.f87499p0);
        aSN1EncodableVector.add(this.f87500q0);
        aSN1EncodableVector.add(this.f87501r0);
        aSN1EncodableVector.add(this.f87502s0);
        aSN1EncodableVector.add(this.f87503t0);
        Accuracy accuracy = this.f87504u0;
        if (accuracy != null) {
            aSN1EncodableVector.add(accuracy);
        }
        ASN1Boolean aSN1Boolean = this.v0;
        if (aSN1Boolean != null && aSN1Boolean.isTrue()) {
            aSN1EncodableVector.add(aSN1Boolean);
        }
        ASN1Integer aSN1Integer = this.f87505w0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        GeneralName generalName = this.f87506x0;
        if (generalName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, generalName));
        }
        Extensions extensions = this.f87507y0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
