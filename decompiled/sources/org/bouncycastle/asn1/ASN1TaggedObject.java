package org.bouncycastle.asn1;

import androidx.appcompat.widget.g0;
import java.io.IOException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f86538p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f86539q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Encodable f86540r0;

    public ASN1TaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        this.f86538p0 = i10;
        this.f86539q0 = z10 || (aSN1Encodable instanceof ASN1Choice);
        this.f86540r0 = aSN1Encodable;
    }

    public static ASN1TaggedObject getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1TaggedObject)) {
            return (ASN1TaggedObject) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e5) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct tagged object from byte[]: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
        if (this.f86538p0 != aSN1TaggedObject.f86538p0 || this.f86539q0 != aSN1TaggedObject.f86539q0) {
            return false;
        }
        ASN1Primitive aSN1Primitive2 = this.f86540r0.toASN1Primitive();
        ASN1Primitive aSN1Primitive3 = aSN1TaggedObject.f86540r0.toASN1Primitive();
        return aSN1Primitive2 == aSN1Primitive3 || aSN1Primitive2.asn1Equals(aSN1Primitive3);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive c() {
        return new DERTaggedObject(this.f86539q0, this.f86538p0, this.f86540r0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive d() {
        return new DLTaggedObject(this.f86539q0, this.f86538p0, this.f86540r0);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    public ASN1Primitive getObject() {
        return this.f86540r0.toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable getObjectParser(int i10, boolean z10) throws IOException {
        if (i10 == 4) {
            return ASN1OctetString.getInstance(this, z10).parser();
        }
        if (i10 == 16) {
            return ASN1Sequence.getInstance(this, z10).parser();
        }
        if (i10 == 17) {
            return ASN1Set.getInstance(this, z10).parser();
        }
        if (z10) {
            return getObject();
        }
        throw new ASN1Exception(g0.c("implicit tagging not implemented for tag: ", i10));
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.f86538p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return ((this.f86539q0 ? 15 : 240) ^ this.f86538p0) ^ this.f86540r0.toASN1Primitive().hashCode();
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isExplicit() {
        return this.f86539q0;
    }

    public String toString() {
        return Constant.BRACKET_OPEN + this.f86538p0 + Constant.BRACKET_CLOSE + this.f86540r0;
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (z10) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }
}
