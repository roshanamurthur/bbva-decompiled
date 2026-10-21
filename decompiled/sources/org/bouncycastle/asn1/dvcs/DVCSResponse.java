package org.bouncycastle.asn1.dvcs;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSResponse extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DVCSCertInfo f87140p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DVCSErrorNotice f87141q0;

    public DVCSResponse(DVCSCertInfo dVCSCertInfo) {
        this.f87140p0 = dVCSCertInfo;
    }

    public static DVCSResponse getInstance(Object obj) {
        if (obj == null || (obj instanceof DVCSResponse)) {
            return (DVCSResponse) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e5) {
                throw new IllegalArgumentException(a.d(e5, new StringBuilder("failed to construct sequence from byte[]: ")));
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new DVCSResponse(DVCSCertInfo.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            return new DVCSResponse(DVCSErrorNotice.getInstance(ASN1TaggedObject.getInstance(obj), false));
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "Couldn't convert from object to DVCSResponse: "));
    }

    public DVCSCertInfo getCertInfo() {
        return this.f87140p0;
    }

    public DVCSErrorNotice getErrorNotice() {
        return this.f87141q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DVCSCertInfo dVCSCertInfo = this.f87140p0;
        return dVCSCertInfo != null ? dVCSCertInfo.toASN1Primitive() : new DERTaggedObject(false, 0, this.f87141q0);
    }

    public String toString() {
        DVCSCertInfo dVCSCertInfo = this.f87140p0;
        if (dVCSCertInfo != null) {
            return "DVCSResponse {\ndvCertInfo: " + dVCSCertInfo.toString() + "}\n";
        }
        return "DVCSResponse {\ndvErrorNote: " + this.f87141q0.toString() + "}\n";
    }

    public DVCSResponse(DVCSErrorNotice dVCSErrorNotice) {
        this.f87141q0 = dVCSErrorNotice;
    }

    public static DVCSResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
