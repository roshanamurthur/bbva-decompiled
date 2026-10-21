package org.bouncycastle.asn1;

import androidx.appcompat.widget.g0;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1External extends ASN1Primitive {
    protected ASN1Primitive dataValueDescriptor;
    protected ASN1ObjectIdentifier directReference;
    protected int encoding;
    protected ASN1Primitive externalContent;
    protected ASN1Integer indirectReference;

    public ASN1External(ASN1EncodableVector aSN1EncodableVector) {
        int i10 = 0;
        ASN1Primitive aSN1PrimitiveE = e(0, aSN1EncodableVector);
        if (aSN1PrimitiveE instanceof ASN1ObjectIdentifier) {
            this.directReference = (ASN1ObjectIdentifier) aSN1PrimitiveE;
            aSN1PrimitiveE = e(1, aSN1EncodableVector);
            i10 = 1;
        }
        if (aSN1PrimitiveE instanceof ASN1Integer) {
            this.indirectReference = (ASN1Integer) aSN1PrimitiveE;
            i10++;
            aSN1PrimitiveE = e(i10, aSN1EncodableVector);
        }
        if (!(aSN1PrimitiveE instanceof ASN1TaggedObject)) {
            this.dataValueDescriptor = aSN1PrimitiveE;
            i10++;
            aSN1PrimitiveE = e(i10, aSN1EncodableVector);
        }
        if (aSN1EncodableVector.size() != i10 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(aSN1PrimitiveE instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1PrimitiveE;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo < 0 || tagNo > 2) {
            throw new IllegalArgumentException(g0.c("invalid encoding value: ", tagNo));
        }
        this.encoding = tagNo;
        this.externalContent = aSN1TaggedObject.getObject();
    }

    public static ASN1Primitive e(int i10, ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector.size() > i10) {
            return aSN1EncodableVector.get(i10).toASN1Primitive();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        ASN1Primitive aSN1Primitive2;
        ASN1Integer aSN1Integer;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (!(aSN1Primitive instanceof ASN1External)) {
            return false;
        }
        if (this == aSN1Primitive) {
            return true;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.directReference;
        if (aSN1ObjectIdentifier2 != null && ((aSN1ObjectIdentifier = aSN1External.directReference) == null || !aSN1ObjectIdentifier.equals((ASN1Primitive) aSN1ObjectIdentifier2))) {
            return false;
        }
        ASN1Integer aSN1Integer2 = this.indirectReference;
        if (aSN1Integer2 != null && ((aSN1Integer = aSN1External.indirectReference) == null || !aSN1Integer.equals((ASN1Primitive) aSN1Integer2))) {
            return false;
        }
        ASN1Primitive aSN1Primitive3 = this.dataValueDescriptor;
        if (aSN1Primitive3 == null || ((aSN1Primitive2 = aSN1External.dataValueDescriptor) != null && aSN1Primitive2.equals(aSN1Primitive3))) {
            return this.externalContent.equals(aSN1External.externalContent);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int b() throws IOException {
        return getEncoded().length;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive c() {
        return new DERExternal(this.directReference, this.indirectReference, this.dataValueDescriptor, this.encoding, this.externalContent);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive d() {
        return new DLExternal(this.directReference, this.indirectReference, this.dataValueDescriptor, this.encoding, this.externalContent);
    }

    public ASN1Primitive getDataValueDescriptor() {
        return this.dataValueDescriptor;
    }

    public ASN1ObjectIdentifier getDirectReference() {
        return this.directReference;
    }

    public int getEncoding() {
        return this.encoding;
    }

    public ASN1Primitive getExternalContent() {
        return this.externalContent;
    }

    public ASN1Integer getIndirectReference() {
        return this.indirectReference;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.directReference;
        int iHashCode = aSN1ObjectIdentifier != null ? aSN1ObjectIdentifier.hashCode() : 0;
        ASN1Integer aSN1Integer = this.indirectReference;
        if (aSN1Integer != null) {
            iHashCode ^= aSN1Integer.hashCode();
        }
        ASN1Primitive aSN1Primitive = this.dataValueDescriptor;
        if (aSN1Primitive != null) {
            iHashCode ^= aSN1Primitive.hashCode();
        }
        return iHashCode ^ this.externalContent.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return true;
    }

    public ASN1External(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, int i10, ASN1Primitive aSN1Primitive2) {
        this.directReference = aSN1ObjectIdentifier;
        this.indirectReference = aSN1Integer;
        this.dataValueDescriptor = aSN1Primitive;
        if (i10 >= 0 && i10 <= 2) {
            this.encoding = i10;
            this.externalContent = aSN1Primitive2.toASN1Primitive();
            return;
        }
        throw new IllegalArgumentException(g0.c("invalid encoding value: ", i10));
    }

    public ASN1External(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, DERTaggedObject dERTaggedObject) {
        this(aSN1ObjectIdentifier, aSN1Integer, aSN1Primitive, dERTaggedObject.getTagNo(), dERTaggedObject.toASN1Primitive());
    }
}
