package pm;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.BufferedOutputStream;
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
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d extends X509CRL {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final JcaJceHelper f92708p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CertificateList f92709q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f92710r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f92711s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f92712t0;

    public d(JcaJceHelper jcaJceHelper, CertificateList certificateList, String str, byte[] bArr, boolean z10) {
        this.f92708p0 = jcaJceHelper;
        this.f92709q0 = certificateList;
        this.f92710r0 = str;
        this.f92711s0 = bArr;
        this.f92712t0 = z10;
    }

    public final void a(PublicKey publicKey, Signature signature) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        CertificateList certificateList = this.f92709q0;
        if (!certificateList.getSignatureAlgorithm().equals(certificateList.getTBSCertList().getSignature())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        byte[] bArr = this.f92711s0;
        if (bArr != null) {
            try {
                j.d(signature, ASN1Primitive.fromByteArray(bArr));
            } catch (IOException e5) {
                throw new SignatureException(androidx.camera.core.impl.a.d(e5, new StringBuilder("cannot decode signature parameters: ")));
            }
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(OutputStreamFactory.createStream(signature), 512);
            certificateList.getTBSCertList().encodeTo(bufferedOutputStream, ASN1Encoding.DER);
            bufferedOutputStream.close();
            if (!signature.verify(getSignature())) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e7) {
            throw new CRLException(e7.toString());
        }
    }

    public final HashSet b(boolean z10) {
        Extensions extensions;
        CertificateList certificateList = this.f92709q0;
        if (certificateList.getVersionNumber() != 2 || (extensions = certificateList.getTBSCertList().getExtensions()) == null) {
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

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return b(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f92709q0.getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CRLException(e5.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f92709q0.getTBSCertList().getExtensions();
        ASN1OctetString extnValue = (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) ? null : extension.getExtnValue();
        if (extnValue == null) {
            return null;
        }
        try {
            return extnValue.getEncoded();
        } catch (Exception e5) {
            throw new IllegalStateException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("error parsing ")));
        }
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        return new X509Principal(X500Name.getInstance(this.f92709q0.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public final X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f92709q0.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getNextUpdate() {
        CertificateList certificateList = this.f92709q0;
        if (certificateList.getNextUpdate() != null) {
            return certificateList.getNextUpdate().getDate();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return b(false);
    }

    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        Enumeration revokedCertificateEnumeration = this.f92709q0.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            boolean zHasValue = cRLEntry.getUserCertificate().hasValue(bigInteger);
            boolean z10 = this.f92712t0;
            if (zHasValue) {
                return new c(cRLEntry, z10, x500Name);
            }
            if (z10 && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        Extension extension;
        HashSet hashSet = new HashSet();
        Enumeration revokedCertificateEnumeration = this.f92709q0.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            boolean z10 = this.f92712t0;
            hashSet.add(new c(cRLEntry, z10, x500Name));
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
    public final String getSigAlgName() {
        return this.f92710r0;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgOID() {
        return this.f92709q0.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSigAlgParams() {
        return Arrays.clone(this.f92711s0);
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSignature() {
        return this.f92709q0.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getTBSCertList() throws CRLException {
        try {
            return this.f92709q0.getTBSCertList().getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CRLException(e5.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getThisUpdate() {
        return this.f92709q0.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public final int getVersion() {
        return this.f92709q0.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        HashSet hashSetB = b(true);
        if (hashSetB == null) {
            return false;
        }
        hashSetB.remove(Extension.issuingDistributionPoint.getId());
        hashSetB.remove(Extension.deltaCRLIndicator.getId());
        return true ^ hashSetB.isEmpty();
    }

    @Override // java.security.cert.CRL
    public final boolean isRevoked(Certificate certificate) {
        X500Name issuer;
        Extension extension;
        if (!certificate.getType().equals(ConstantKt.CERTIFICATE_TYPE_X509)) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        CertificateList certificateList = this.f92709q0;
        Enumeration revokedCertificateEnumeration = certificateList.getRevokedCertificateEnumeration();
        X500Name issuer2 = certificateList.getIssuer();
        if (revokedCertificateEnumeration.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                TBSCertList.CRLEntry cRLEntry = TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                if (this.f92712t0 && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                    issuer2 = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                }
                if (cRLEntry.getUserCertificate().hasValue(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        issuer = X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            issuer = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
                        } catch (CertificateEncodingException e5) {
                            throw new IllegalArgumentException("Cannot process certificate: " + e5.getMessage());
                        }
                    }
                    return issuer2.equals(issuer);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f0 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:23:0x00e8, B:25:0x00f0, B:26:0x0101, B:27:0x0104, B:28:0x0108, B:30:0x0110, B:31:0x0132, B:32:0x0136, B:34:0x013e, B:35:0x0147, B:37:0x014f, B:38:0x0158, B:40:0x0160, B:41:0x0169), top: B:52:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0108 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:23:0x00e8, B:25:0x00f0, B:26:0x0101, B:27:0x0104, B:28:0x0108, B:30:0x0110, B:31:0x0132, B:32:0x0136, B:34:0x013e, B:35:0x0147, B:37:0x014f, B:38:0x0158, B:40:0x0160, B:41:0x0169), top: B:52:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0110 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:23:0x00e8, B:25:0x00f0, B:26:0x0101, B:27:0x0104, B:28:0x0108, B:30:0x0110, B:31:0x0132, B:32:0x0136, B:34:0x013e, B:35:0x0147, B:37:0x014f, B:38:0x0158, B:40:0x0160, B:41:0x0169), top: B:52:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0136 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:23:0x00e8, B:25:0x00f0, B:26:0x0101, B:27:0x0104, B:28:0x0108, B:30:0x0110, B:31:0x0132, B:32:0x0136, B:34:0x013e, B:35:0x0147, B:37:0x014f, B:38:0x0158, B:40:0x0160, B:41:0x0169), top: B:52:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x013e A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:23:0x00e8, B:25:0x00f0, B:26:0x0101, B:27:0x0104, B:28:0x0108, B:30:0x0110, B:31:0x0132, B:32:0x0136, B:34:0x013e, B:35:0x0147, B:37:0x014f, B:38:0x0158, B:40:0x0160, B:41:0x0169), top: B:52:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0147 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:23:0x00e8, B:25:0x00f0, B:26:0x0101, B:27:0x0104, B:28:0x0108, B:30:0x0110, B:31:0x0132, B:32:0x0136, B:34:0x013e, B:35:0x0147, B:37:0x014f, B:38:0x0158, B:40:0x0160, B:41:0x0169), top: B:52:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x017e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.security.cert.CRL
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.d.toString():java.lang.String");
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException, NoSuchProviderException {
        Signature signature;
        String str = this.f92710r0;
        try {
            signature = this.f92708p0.createSignature(str);
        } catch (Exception unused) {
            signature = Signature.getInstance(str);
        }
        a(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException, NoSuchProviderException {
        String str2 = this.f92710r0;
        a(publicKey, str != null ? Signature.getInstance(str2, str) : Signature.getInstance(str2));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        String str = this.f92710r0;
        a(publicKey, provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str));
    }
}
