package org.bouncycastle.asn1.cmc;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes12.dex */
public class OtherStatusInfo extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CMCFailInfo f86706p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PendInfo f86707q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ExtendedFailInfo f86708r0;

    public OtherStatusInfo(CMCFailInfo cMCFailInfo, PendInfo pendInfo, ExtendedFailInfo extendedFailInfo) {
        this.f86706p0 = cMCFailInfo;
        this.f86707q0 = pendInfo;
        this.f86708r0 = extendedFailInfo;
    }

    public static OtherStatusInfo getInstance(Object obj) {
        if (obj instanceof OtherStatusInfo) {
            return (OtherStatusInfo) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Integer) {
                return new OtherStatusInfo(CMCFailInfo.getInstance(aSN1Primitive), null, null);
            }
            if (aSN1Primitive instanceof ASN1Sequence) {
                return ((ASN1Sequence) aSN1Primitive).getObjectAt(0) instanceof ASN1ObjectIdentifier ? new OtherStatusInfo(null, null, ExtendedFailInfo.getInstance(aSN1Primitive)) : new OtherStatusInfo(null, PendInfo.getInstance(aSN1Primitive), null);
            }
        } else if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e5) {
                throw new IllegalArgumentException(a.d(e5, new StringBuilder("parsing error: ")));
            }
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance(): "));
    }

    public boolean isExtendedFailInfo() {
        return this.f86708r0 != null;
    }

    public boolean isFailInfo() {
        return this.f86706p0 != null;
    }

    public boolean isPendingInfo() {
        return this.f86707q0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        PendInfo pendInfo = this.f86707q0;
        if (pendInfo != null) {
            return pendInfo.toASN1Primitive();
        }
        CMCFailInfo cMCFailInfo = this.f86706p0;
        return cMCFailInfo != null ? cMCFailInfo.toASN1Primitive() : this.f86708r0.toASN1Primitive();
    }
}
