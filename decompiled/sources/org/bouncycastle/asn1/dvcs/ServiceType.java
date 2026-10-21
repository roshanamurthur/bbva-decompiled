package org.bouncycastle.asn1.dvcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class ServiceType extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Enumerated f87151p0;
    public static final ServiceType CPD = new ServiceType(1);
    public static final ServiceType VSD = new ServiceType(2);
    public static final ServiceType VPKC = new ServiceType(3);
    public static final ServiceType CCPD = new ServiceType(4);

    public ServiceType(int i10) {
        this.f87151p0 = new ASN1Enumerated(i10);
    }

    public static ServiceType getInstance(Object obj) {
        if (obj instanceof ServiceType) {
            return (ServiceType) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(obj);
        ServiceType serviceType = new ServiceType();
        serviceType.f87151p0 = aSN1Enumerated;
        return serviceType;
    }

    public BigInteger getValue() {
        return this.f87151p0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87151p0;
    }

    public String toString() {
        String str;
        int iIntValueExact = this.f87151p0.intValueExact();
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(iIntValueExact);
        if (iIntValueExact == CPD.f87151p0.intValueExact()) {
            str = "(CPD)";
        } else if (iIntValueExact == VSD.f87151p0.intValueExact()) {
            str = "(VSD)";
        } else if (iIntValueExact == VPKC.f87151p0.intValueExact()) {
            str = "(VPKC)";
        } else {
            str = iIntValueExact == CCPD.f87151p0.intValueExact() ? "(CCPD)" : "?";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static ServiceType getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Enumerated.getInstance(aSN1TaggedObject, z10));
    }
}
