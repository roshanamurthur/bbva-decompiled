package org.bouncycastle.asn1.x509;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class GeneralSubtree extends ASN1Object {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BigInteger f87629s0 = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GeneralName f87630p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f87631q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Integer f87632r0;

    public GeneralSubtree(ASN1Sequence aSN1Sequence) {
        this.f87630p0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.f87631q0 = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    return;
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
                    }
                    this.f87632r0 = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    return;
                }
            }
            if (size != 3) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
            if (aSN1TaggedObject2.getTagNo() != 0) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject2, new StringBuilder("Bad tag number for 'minimum': ")));
            }
            this.f87631q0 = ASN1Integer.getInstance(aSN1TaggedObject2, false);
            ASN1TaggedObject aSN1TaggedObject3 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2));
            if (aSN1TaggedObject3.getTagNo() != 1) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject3, new StringBuilder("Bad tag number for 'maximum': ")));
            }
            this.f87632r0 = ASN1Integer.getInstance(aSN1TaggedObject3, false);
        }
    }

    public static GeneralSubtree getInstance(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof GeneralSubtree ? (GeneralSubtree) obj : new GeneralSubtree(ASN1Sequence.getInstance(obj));
    }

    public GeneralName getBase() {
        return this.f87630p0;
    }

    public BigInteger getMaximum() {
        ASN1Integer aSN1Integer = this.f87632r0;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    public BigInteger getMinimum() {
        ASN1Integer aSN1Integer = this.f87631q0;
        return aSN1Integer == null ? f87629s0 : aSN1Integer.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87630p0);
        ASN1Integer aSN1Integer = this.f87631q0;
        if (aSN1Integer != null && !aSN1Integer.hasValue(f87629s0)) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1Integer));
        }
        ASN1Integer aSN1Integer2 = this.f87632r0;
        if (aSN1Integer2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1Integer2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static GeneralSubtree getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return new GeneralSubtree(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public GeneralSubtree(GeneralName generalName) {
        this(generalName, null, null);
    }

    public GeneralSubtree(GeneralName generalName, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f87630p0 = generalName;
        if (bigInteger2 != null) {
            this.f87632r0 = new ASN1Integer(bigInteger2);
        }
        this.f87631q0 = bigInteger == null ? null : new ASN1Integer(bigInteger);
    }
}
