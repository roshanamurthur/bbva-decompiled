package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1OctetString extends ASN1Primitive implements ASN1OctetStringParser {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86521p0;

    public ASN1OctetString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f86521p0 = bArr;
    }

    public static ASN1OctetString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1OctetString)) {
            return (ASN1OctetString) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e5) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct OCTET STRING from byte[]: ")));
            }
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1OctetString) {
                return (ASN1OctetString) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1OctetString) {
            return Arrays.areEqual(this.f86521p0, ((ASN1OctetString) aSN1Primitive).f86521p0);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive c() {
        return new DEROctetString(this.f86521p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive d() {
        return new DEROctetString(this.f86521p0);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.f86521p0);
    }

    public byte[] getOctets() {
        return this.f86521p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(getOctets());
    }

    public String toString() {
        return "#" + Strings.fromByteArray(Hex.encode(this.f86521p0));
    }

    public static ASN1OctetString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (z10) {
            if (aSN1TaggedObject.isExplicit()) {
                return getInstance(aSN1TaggedObject.getObject());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        ASN1Primitive object = aSN1TaggedObject.getObject();
        int i10 = 0;
        if (aSN1TaggedObject.isExplicit()) {
            ASN1OctetString aSN1OctetString = getInstance(object);
            return aSN1TaggedObject instanceof BERTaggedObject ? new BEROctetString(new ASN1OctetString[]{aSN1OctetString}) : (ASN1OctetString) new BEROctetString(new ASN1OctetString[]{aSN1OctetString}).d();
        }
        if (object instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString2 = (ASN1OctetString) object;
            return aSN1TaggedObject instanceof BERTaggedObject ? aSN1OctetString2 : (ASN1OctetString) aSN1OctetString2.d();
        }
        if (!(object instanceof ASN1Sequence)) {
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(aSN1TaggedObject.getClass().getName()));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) object;
        if (aSN1TaggedObject instanceof BERTaggedObject) {
            int size = aSN1Sequence.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            while (i10 < size) {
                aSN1OctetStringArr[i10] = getInstance(aSN1Sequence.getObjectAt(i10));
                i10++;
            }
            return new BEROctetString(aSN1OctetStringArr);
        }
        int size2 = aSN1Sequence.size();
        ASN1OctetString[] aSN1OctetStringArr2 = new ASN1OctetString[size2];
        while (i10 < size2) {
            aSN1OctetStringArr2[i10] = getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
        return (ASN1OctetString) new BEROctetString(aSN1OctetStringArr2).d();
    }

    public ASN1OctetStringParser parser() {
        return this;
    }
}
