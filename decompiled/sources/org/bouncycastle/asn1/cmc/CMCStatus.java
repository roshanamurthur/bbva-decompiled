package org.bouncycastle.asn1.cmc;

import androidx.emoji2.text.flatbuffer.a;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes12.dex */
public class CMCStatus extends ASN1Object {
    public static final CMCStatus confirmRequired;
    public static final CMCStatus failed;
    public static final CMCStatus noSupport;
    public static final CMCStatus partial;
    public static final CMCStatus pending;
    public static final CMCStatus popRequired;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final HashMap f86645q0;
    public static final CMCStatus success;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86646p0;

    static {
        CMCStatus cMCStatus = new CMCStatus(new ASN1Integer(0L));
        success = cMCStatus;
        CMCStatus cMCStatus2 = new CMCStatus(new ASN1Integer(2L));
        failed = cMCStatus2;
        CMCStatus cMCStatus3 = new CMCStatus(new ASN1Integer(3L));
        pending = cMCStatus3;
        CMCStatus cMCStatus4 = new CMCStatus(new ASN1Integer(4L));
        noSupport = cMCStatus4;
        CMCStatus cMCStatus5 = new CMCStatus(new ASN1Integer(5L));
        confirmRequired = cMCStatus5;
        CMCStatus cMCStatus6 = new CMCStatus(new ASN1Integer(6L));
        popRequired = cMCStatus6;
        CMCStatus cMCStatus7 = new CMCStatus(new ASN1Integer(7L));
        partial = cMCStatus7;
        HashMap map = new HashMap();
        f86645q0 = map;
        map.put(cMCStatus.f86646p0, cMCStatus);
        map.put(cMCStatus2.f86646p0, cMCStatus2);
        map.put(cMCStatus3.f86646p0, cMCStatus3);
        map.put(cMCStatus4.f86646p0, cMCStatus4);
        map.put(cMCStatus5.f86646p0, cMCStatus5);
        map.put(cMCStatus6.f86646p0, cMCStatus6);
        map.put(cMCStatus7.f86646p0, cMCStatus7);
    }

    public CMCStatus(ASN1Integer aSN1Integer) {
        this.f86646p0 = aSN1Integer;
    }

    public static CMCStatus getInstance(Object obj) {
        if (obj instanceof CMCStatus) {
            return (CMCStatus) obj;
        }
        if (obj == null) {
            return null;
        }
        CMCStatus cMCStatus = (CMCStatus) f86645q0.get(ASN1Integer.getInstance(obj));
        if (cMCStatus != null) {
            return cMCStatus;
        }
        throw new IllegalArgumentException(a.c(obj, "unknown object in getInstance(): "));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86646p0;
    }
}
