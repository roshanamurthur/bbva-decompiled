package org.bouncycastle.jce.provider;

import java.security.cert.X509CRL;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.x509.X509AttributeCertificate;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f90510a = Extension.targetInformation.getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f90511b = Extension.noRevAvail.getId();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f90512c = Extension.cRLDistributionPoints.getId();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f90513d = Extension.authorityInfoAccess.getId();

    public static void a(DistributionPoint distributionPoint, X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters, Date date, c cVar, i iVar, List list, BCJcaJceHelper bCJcaJceHelper) throws AnnotatedException {
        Iterator it;
        if (x509AttributeCertificate.getExtensionValue(X509Extensions.NoRevAvail.getId()) != null) {
            return;
        }
        Date date2 = new Date(System.currentTimeMillis());
        if (date.getTime() > date2.getTime()) {
            throw new AnnotatedException("Validation time is in future.");
        }
        Iterator it2 = b.i(distributionPoint, x509AttributeCertificate, date2, pKIXExtendedParameters).iterator();
        boolean z10 = false;
        AnnotatedException e5 = null;
        while (it2.hasNext() && cVar.f90492a == 11 && !iVar.a()) {
            try {
                X509CRL x509crl = (X509CRL) it2.next();
                i iVarF = g.f(x509crl, distributionPoint);
                int i10 = iVarF.f90515a;
                if ((i10 | (iVar.f90515a ^ i10)) != 0) {
                    it = it2;
                    try {
                        X509CRL x509crlI = pKIXExtendedParameters.isUseDeltasEnabled() ? g.i(b.j(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()), g.h(x509crl, g.g(x509crl, null, null, pKIXExtendedParameters, list, bCJcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509AttributeCertificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        g.c(distributionPoint, x509AttributeCertificate, x509crl);
                        g.d(distributionPoint, x509AttributeCertificate, x509crl);
                        g.e(x509crlI, x509crl, pKIXExtendedParameters);
                        if (pKIXExtendedParameters.isUseDeltasEnabled() && x509crlI != null) {
                            b.h(date, x509crlI, x509AttributeCertificate, cVar);
                        }
                        if (cVar.f90492a == 11) {
                            b.h(date, x509crl, x509AttributeCertificate, cVar);
                        }
                        if (cVar.f90492a == 8) {
                            cVar.f90492a = 11;
                        }
                        iVar.f90515a |= iVarF.f90515a;
                        z10 = true;
                    } catch (AnnotatedException e7) {
                        e5 = e7;
                    }
                    it2 = it;
                } else {
                    continue;
                }
            } catch (AnnotatedException e10) {
                e5 = e10;
                it = it2;
            }
        }
        if (!z10) {
            throw e5;
        }
    }
}
