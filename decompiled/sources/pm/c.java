package pm;

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
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends X509CRLEntry {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TBSCertList.CRLEntry f92704p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final X500Name f92705q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public volatile boolean f92706r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile int f92707s0;

    public c(TBSCertList.CRLEntry cRLEntry, boolean z10, X500Name x500Name) {
        this.f92704p0 = cRLEntry;
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
        this.f92705q0 = x500Name;
    }

    public final HashSet a(boolean z10) {
        Extensions extensions = this.f92704p0.getExtensions();
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
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return super.equals(this);
        }
        c cVar = (c) obj;
        if (this.f92706r0 && cVar.f92706r0 && this.f92707s0 != cVar.f92707s0) {
            return false;
        }
        return this.f92704p0.equals(cVar.f92704p0);
    }

    @Override // java.security.cert.X509CRLEntry
    public final X500Principal getCertificateIssuer() {
        X500Name x500Name = this.f92705q0;
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
    public final Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public final byte[] getEncoded() throws CRLException {
        try {
            return this.f92704p0.getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CRLException(e5.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(str);
        Extensions extensions = this.f92704p0.getExtensions();
        Extension extension = extensions != null ? extensions.getExtension(aSN1ObjectIdentifier) : null;
        if (extension == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e5) {
            throw new IllegalStateException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("Exception encoding: ")));
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public final Date getRevocationDate() {
        return this.f92704p0.getRevocationDate().getDate();
    }

    @Override // java.security.cert.X509CRLEntry
    public final BigInteger getSerialNumber() {
        return this.f92704p0.getUserCertificate().getValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean hasExtensions() {
        return this.f92704p0.getExtensions() != null;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        HashSet hashSetA = a(true);
        return (hashSetA == null || hashSetA.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public final int hashCode() {
        if (!this.f92706r0) {
            this.f92707s0 = super.hashCode();
            this.f92706r0 = true;
        }
        return this.f92707s0;
    }

    @Override // java.security.cert.X509CRLEntry
    public final String toString() {
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
        Extensions extensions = this.f92704p0.getExtensions();
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
                                    if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.reasonCode)) {
                                        generalNames = CRLReason.getInstance(ASN1Enumerated.getInstance(aSN1InputStream.readObject()));
                                    } else {
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.certificateIssuer)) {
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
}
