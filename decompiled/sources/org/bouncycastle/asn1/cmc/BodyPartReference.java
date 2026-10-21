package org.bouncycastle.asn1.cmc;

import androidx.emoji2.text.flatbuffer.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes12.dex */
public class BodyPartReference extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartID f86638p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BodyPartPath f86639q0;

    public BodyPartReference(BodyPartID bodyPartID) {
        this.f86638p0 = bodyPartID;
        this.f86639q0 = null;
    }

    public static BodyPartReference getInstance(Object obj) {
        if (obj instanceof BodyPartReference) {
            return (BodyPartReference) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Integer) {
                return new BodyPartReference(BodyPartID.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof ASN1Sequence) {
                return new BodyPartReference(BodyPartPath.getInstance(aSN1Primitive));
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.c(obj, "unknown object in getInstance(): "));
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException unused) {
            throw new IllegalArgumentException("unknown encoding in getInstance()");
        }
    }

    public BodyPartID getBodyPartID() {
        return this.f86638p0;
    }

    public BodyPartPath getBodyPartPath() {
        return this.f86639q0;
    }

    public boolean isBodyPartID() {
        return this.f86638p0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        BodyPartID bodyPartID = this.f86638p0;
        return bodyPartID != null ? bodyPartID.toASN1Primitive() : this.f86639q0.toASN1Primitive();
    }

    public BodyPartReference(BodyPartPath bodyPartPath) {
        this.f86638p0 = null;
        this.f86639q0 = bodyPartPath;
    }
}
