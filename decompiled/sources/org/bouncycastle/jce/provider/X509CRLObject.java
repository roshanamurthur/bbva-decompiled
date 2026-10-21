package org.bouncycastle.jce.provider;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.jce.X509Principal;

/* JADX INFO: loaded from: classes8.dex */
public class X509CRLObject extends X509CRL {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CertificateList f90447p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f90448q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f90449r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f90450s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f90451t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f90452u0;

    public X509CRLObject(CertificateList certificateList) throws CRLException {
        this.f90447p0 = certificateList;
        try {
            this.f90448q0 = j.b(certificateList.getSignatureAlgorithm());
            if (certificateList.getSignatureAlgorithm().getParameters() != null) {
                this.f90449r0 = certificateList.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded(ASN1Encoding.DER);
            } else {
                this.f90449r0 = null;
            }
            this.f90450s0 = isIndirectCRL(this);
        } catch (Exception e5) {
            throw new CRLException(c2.b.d("CRL contents invalid: ", e5));
        }
    }

    public static boolean isIndirectCRL(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
            return extensionValue != null && IssuingDistributionPoint.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL();
        } catch (Exception e5) {
            d dVar = new d("Exception reading IssuingDistributionPoint");
            dVar.f90494p0 = e5;
            throw dVar;
        }
    }

    public final void a(PublicKey publicKey, Signature signature) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        CertificateList certificateList = this.f90447p0;
        if (!certificateList.getSignatureAlgorithm().equals(certificateList.getTBSCertList().getSignature())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("CRL does not verify with supplied public key.");
        }
    }

    public final HashSet b(boolean z10) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.f90447p0.getTBSCertList().getExtensions()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (z10 == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (this.f90451t0 && x509CRLObject.f90451t0 && x509CRLObject.f90452u0 != this.f90452u0) {
            return false;
        }
        return this.f90447p0.equals(x509CRLObject.f90447p0);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return b(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f90447p0.getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CRLException(e5.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f90447p0.getTBSCertList().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e5) {
            throw new IllegalStateException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("error parsing ")));
        }
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new X509Principal(X500Name.getInstance(this.f90447p0.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f90447p0.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        CertificateList certificateList = this.f90447p0;
        if (certificateList.getNextUpdate() != null) {
            return certificateList.getNextUpdate().getDate();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return b(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        Enumeration revokedCertificateEnumeration = this.f90447p0.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            boolean zHasValue = cRLEntry.getUserCertificate().hasValue(bigInteger);
            boolean z10 = this.f90450s0;
            if (zHasValue) {
                return new X509CRLEntryObject(cRLEntry, z10, x500Name);
            }
            if (z10 && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Extension extension;
        HashSet hashSet = new HashSet();
        Enumeration revokedCertificateEnumeration = this.f90447p0.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            boolean z10 = this.f90450s0;
            hashSet.add(new X509CRLEntryObject(cRLEntry, z10, x500Name));
            if (z10 && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.f90448q0;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.f90447p0.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        byte[] bArr = this.f90449r0;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f90447p0.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.f90447p0.getTBSCertList().getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CRLException(e5.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f90447p0.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f90447p0.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(g.f90501d);
        criticalExtensionOIDs.remove(g.f90502e);
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.f90451t0) {
            this.f90451t0 = true;
            this.f90452u0 = super.hashCode();
        }
        return this.f90452u0;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        X500Name issuer;
        Extension extension;
        if (!certificate.getType().equals(ConstantKt.CERTIFICATE_TYPE_X509)) {
            throw new RuntimeException("X.509 CRL used with non X.509 Cert");
        }
        CertificateList certificateList = this.f90447p0;
        Enumeration revokedCertificateEnumeration = certificateList.getRevokedCertificateEnumeration();
        X500Name issuer2 = certificateList.getIssuer();
        if (revokedCertificateEnumeration != null) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                TBSCertList.CRLEntry cRLEntry = TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                if (this.f90450s0 && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                    issuer2 = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                }
                if (cRLEntry.getUserCertificate().hasValue(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        issuer = X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            issuer = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
                        } catch (CertificateEncodingException unused) {
                            throw new RuntimeException("Cannot process certificate");
                        }
                    }
                    return issuer2.equals(issuer);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f2 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:23:0x00ea, B:25:0x00f2, B:26:0x0103, B:27:0x0106, B:28:0x010a, B:30:0x0112, B:31:0x0134, B:32:0x0138, B:34:0x0140, B:35:0x0149, B:37:0x0151, B:38:0x015a, B:40:0x0162, B:41:0x016b), top: B:52:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:28:0x010a A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:23:0x00ea, B:25:0x00f2, B:26:0x0103, B:27:0x0106, B:28:0x010a, B:30:0x0112, B:31:0x0134, B:32:0x0138, B:34:0x0140, B:35:0x0149, B:37:0x0151, B:38:0x015a, B:40:0x0162, B:41:0x016b), top: B:52:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0112 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:23:0x00ea, B:25:0x00f2, B:26:0x0103, B:27:0x0106, B:28:0x010a, B:30:0x0112, B:31:0x0134, B:32:0x0138, B:34:0x0140, B:35:0x0149, B:37:0x0151, B:38:0x015a, B:40:0x0162, B:41:0x016b), top: B:52:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0138 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:23:0x00ea, B:25:0x00f2, B:26:0x0103, B:27:0x0106, B:28:0x010a, B:30:0x0112, B:31:0x0134, B:32:0x0138, B:34:0x0140, B:35:0x0149, B:37:0x0151, B:38:0x015a, B:40:0x0162, B:41:0x016b), top: B:52:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0140 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:23:0x00ea, B:25:0x00f2, B:26:0x0103, B:27:0x0106, B:28:0x010a, B:30:0x0112, B:31:0x0134, B:32:0x0138, B:34:0x0140, B:35:0x0149, B:37:0x0151, B:38:0x015a, B:40:0x0162, B:41:0x016b), top: B:52:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0149 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:23:0x00ea, B:25:0x00f2, B:26:0x0103, B:27:0x0106, B:28:0x010a, B:30:0x0112, B:31:0x0134, B:32:0x0138, B:34:0x0140, B:35:0x0149, B:37:0x0151, B:38:0x015a, B:40:0x0162, B:41:0x016b), top: B:52:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x0180
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509CRLObject.toString():java.lang.String");
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException, NoSuchProviderException {
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        a(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException, NoSuchProviderException {
        a(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        a(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
