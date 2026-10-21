package org.bouncycastle.asn1.ocsp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes12.dex */
public class OCSPResponseStatus extends ASN1Object {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Enumerated f87343p0;

    public OCSPResponseStatus(int i10) {
        this(new ASN1Enumerated(i10));
    }

    public static OCSPResponseStatus getInstance(Object obj) {
        if (obj instanceof OCSPResponseStatus) {
            return (OCSPResponseStatus) obj;
        }
        if (obj != null) {
            return new OCSPResponseStatus(ASN1Enumerated.getInstance(obj));
        }
        return null;
    }

    public BigInteger getValue() {
        return this.f87343p0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87343p0;
    }

    public OCSPResponseStatus(ASN1Enumerated aSN1Enumerated) {
        this.f87343p0 = aSN1Enumerated;
    }
}
