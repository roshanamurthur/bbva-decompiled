package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class X509CRLEntryObject extends X509CRLEntry {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TBSCertList.CRLEntry f90443p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final X500Name f90444q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f90445r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f90446s0;

    public X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry) {
        this.f90443p0 = cRLEntry;
        this.f90444q0 = null;
    }

    public final HashSet a(boolean z10) {
        Extensions extensions = this.f90443p0.getExtensions();
        if (extensions == null) {
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

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof X509CRLEntryObject ? this.f90443p0.equals(((X509CRLEntryObject) obj).f90443p0) : super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        X500Name x500Name = this.f90444q0;
        if (x500Name == null) {
            return null;
        }
        try {
            return new X500Principal(x500Name.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f90443p0.getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CRLException(e5.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(str);
        Extensions extensions = this.f90443p0.getExtensions();
        Extension extension = extensions != null ? extensions.getExtension(aSN1ObjectIdentifier) : null;
        if (extension == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e5) {
            throw new RuntimeException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("error encoding ")));
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.f90443p0.getRevocationDate().getDate();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.f90443p0.getUserCertificate().getValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.f90443p0.getExtensions() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.f90446s0) {
            this.f90445r0 = super.hashCode();
            this.f90446s0 = true;
        }
        return this.f90445r0;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        Object generalNames;
        StringBuffer stringBuffer = new StringBuffer("      userCertificate: ");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(strLineSeparator);
        Extensions extensions = this.f90443p0.getExtensions();
        if (extensions != null) {
            Enumeration enumerationOids = extensions.oids();
            if (enumerationOids.hasMoreElements()) {
                String str = "   crlEntryExtensions:";
                loop0: while (true) {
                    stringBuffer.append(str);
                    while (true) {
                        stringBuffer.append(strLineSeparator);
                        while (true) {
                            if (!enumerationOids.hasMoreElements()) {
                                break loop0;
                            }
                            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
                            Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                            if (extension.getExtnValue() != null) {
                                ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                                stringBuffer.append("                       critical(");
                                stringBuffer.append(extension.isCritical());
                                stringBuffer.append(") ");
                                try {
                                    if (aSN1ObjectIdentifier.equals((ASN1Primitive) X509Extension.reasonCode)) {
                                        generalNames = CRLReason.getInstance(ASN1Enumerated.getInstance(aSN1InputStream.readObject()));
                                    } else {
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) X509Extension.certificateIssuer)) {
                                            stringBuffer.append("Certificate issuer: ");
                                            generalNames = GeneralNames.getInstance(aSN1InputStream.readObject());
                                        } else {
                                            stringBuffer.append(aSN1ObjectIdentifier.getId());
                                            stringBuffer.append(" value = ");
                                            stringBuffer.append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                                        }
                                        stringBuffer.append(strLineSeparator);
                                    }
                                    stringBuffer.append(generalNames);
                                    stringBuffer.append(strLineSeparator);
                                } catch (Exception unused) {
                                    stringBuffer.append(aSN1ObjectIdentifier.getId());
                                    str = " value = *****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    public X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry, boolean z10, X500Name x500Name) {
        this.f90443p0 = cRLEntry;
        if (z10) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.certificateIssuer;
            Extensions extensions = cRLEntry.getExtensions();
            Extension extension = extensions != null ? extensions.getExtension(aSN1ObjectIdentifier) : null;
            if (extension != null) {
                try {
                    GeneralName[] names = GeneralNames.getInstance(extension.getParsedValue()).getNames();
                    for (int i10 = 0; i10 < names.length; i10++) {
                        if (names[i10].getTagNo() == 4) {
                            x500Name = X500Name.getInstance(names[i10].getName());
                        }
                    }
                } catch (Exception unused) {
                }
                x500Name = null;
            }
        } else {
            x500Name = null;
        }
        this.f90444q0 = x500Name;
    }
}
