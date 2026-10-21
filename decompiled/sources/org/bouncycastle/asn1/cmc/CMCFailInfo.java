package org.bouncycastle.asn1.cmc;

import androidx.emoji2.text.flatbuffer.a;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes12.dex */
public class CMCFailInfo extends ASN1Object {
    public static final CMCFailInfo authDataFail;
    public static final CMCFailInfo badAlg;
    public static final CMCFailInfo badCertId;
    public static final CMCFailInfo badIdentity;
    public static final CMCFailInfo badMessageCheck;
    public static final CMCFailInfo badRequest;
    public static final CMCFailInfo badTime;
    public static final CMCFailInfo internalCAError;
    public static final CMCFailInfo mustArchiveKeys;
    public static final CMCFailInfo noKeyReuse;
    public static final CMCFailInfo popFailed;
    public static final CMCFailInfo popRequired;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final HashMap f86640q0;
    public static final CMCFailInfo tryLater;
    public static final CMCFailInfo unsupportedExt;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86641p0;

    static {
        CMCFailInfo cMCFailInfo = new CMCFailInfo(new ASN1Integer(0L));
        badAlg = cMCFailInfo;
        CMCFailInfo cMCFailInfo2 = new CMCFailInfo(new ASN1Integer(1L));
        badMessageCheck = cMCFailInfo2;
        CMCFailInfo cMCFailInfo3 = new CMCFailInfo(new ASN1Integer(2L));
        badRequest = cMCFailInfo3;
        CMCFailInfo cMCFailInfo4 = new CMCFailInfo(new ASN1Integer(3L));
        badTime = cMCFailInfo4;
        CMCFailInfo cMCFailInfo5 = new CMCFailInfo(new ASN1Integer(4L));
        badCertId = cMCFailInfo5;
        CMCFailInfo cMCFailInfo6 = new CMCFailInfo(new ASN1Integer(5L));
        unsupportedExt = cMCFailInfo6;
        CMCFailInfo cMCFailInfo7 = new CMCFailInfo(new ASN1Integer(6L));
        mustArchiveKeys = cMCFailInfo7;
        CMCFailInfo cMCFailInfo8 = new CMCFailInfo(new ASN1Integer(7L));
        badIdentity = cMCFailInfo8;
        CMCFailInfo cMCFailInfo9 = new CMCFailInfo(new ASN1Integer(8L));
        popRequired = cMCFailInfo9;
        CMCFailInfo cMCFailInfo10 = new CMCFailInfo(new ASN1Integer(9L));
        popFailed = cMCFailInfo10;
        CMCFailInfo cMCFailInfo11 = new CMCFailInfo(new ASN1Integer(10L));
        noKeyReuse = cMCFailInfo11;
        CMCFailInfo cMCFailInfo12 = new CMCFailInfo(new ASN1Integer(11L));
        internalCAError = cMCFailInfo12;
        CMCFailInfo cMCFailInfo13 = new CMCFailInfo(new ASN1Integer(12L));
        tryLater = cMCFailInfo13;
        CMCFailInfo cMCFailInfo14 = new CMCFailInfo(new ASN1Integer(13L));
        authDataFail = cMCFailInfo14;
        HashMap map = new HashMap();
        f86640q0 = map;
        map.put(cMCFailInfo.f86641p0, cMCFailInfo);
        map.put(cMCFailInfo2.f86641p0, cMCFailInfo2);
        map.put(cMCFailInfo3.f86641p0, cMCFailInfo3);
        map.put(cMCFailInfo4.f86641p0, cMCFailInfo4);
        ASN1Integer aSN1Integer = cMCFailInfo5.f86641p0;
        map.put(aSN1Integer, cMCFailInfo5);
        ASN1Integer aSN1Integer2 = cMCFailInfo9.f86641p0;
        map.put(aSN1Integer2, cMCFailInfo9);
        map.put(cMCFailInfo6.f86641p0, cMCFailInfo6);
        map.put(cMCFailInfo7.f86641p0, cMCFailInfo7);
        map.put(cMCFailInfo8.f86641p0, cMCFailInfo8);
        map.put(aSN1Integer2, cMCFailInfo9);
        map.put(cMCFailInfo10.f86641p0, cMCFailInfo10);
        map.put(aSN1Integer, cMCFailInfo5);
        map.put(aSN1Integer2, cMCFailInfo9);
        map.put(cMCFailInfo11.f86641p0, cMCFailInfo11);
        map.put(cMCFailInfo12.f86641p0, cMCFailInfo12);
        map.put(cMCFailInfo13.f86641p0, cMCFailInfo13);
        map.put(cMCFailInfo14.f86641p0, cMCFailInfo14);
    }

    public CMCFailInfo(ASN1Integer aSN1Integer) {
        this.f86641p0 = aSN1Integer;
    }

    public static CMCFailInfo getInstance(Object obj) {
        if (obj instanceof CMCFailInfo) {
            return (CMCFailInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        CMCFailInfo cMCFailInfo = (CMCFailInfo) f86640q0.get(ASN1Integer.getInstance(obj));
        if (cMCFailInfo != null) {
            return cMCFailInfo;
        }
        throw new IllegalArgumentException(a.c(obj, "unknown object in getInstance(): "));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86641p0;
    }
}
