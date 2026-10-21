package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.misc.NetscapeRevocationURL;
import org.bouncycastle.asn1.misc.VerisignCzagExtension;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes8.dex */
public class X509CertificateObject extends X509Certificate implements PKCS12BagAttributeCarrier {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Certificate f90462p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BasicConstraints f90463q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean[] f90464r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f90465s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f90466t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final PKCS12BagAttributeCarrierImpl f90467u0 = new PKCS12BagAttributeCarrierImpl();

    public X509CertificateObject(Certificate certificate) throws CertificateParsingException {
        this.f90462p0 = certificate;
        try {
            byte[] bArrC = c(ObjectIdentifiers.basicConstraints);
            if (bArrC != null) {
                this.f90463q0 = BasicConstraints.getInstance(ASN1Primitive.fromByteArray(bArrC));
            }
            try {
                byte[] bArrC2 = c("2.5.29.15");
                if (bArrC2 == null) {
                    this.f90464r0 = null;
                    return;
                }
                DERBitString dERBitString = DERBitString.getInstance(ASN1Primitive.fromByteArray(bArrC2));
                byte[] bytes = dERBitString.getBytes();
                int length = (bytes.length * 8) - dERBitString.getPadBits();
                int i10 = 9;
                if (length >= 9) {
                    i10 = length;
                }
                this.f90464r0 = new boolean[i10];
                for (int i11 = 0; i11 != length; i11++) {
                    this.f90464r0[i11] = (bytes[i11 / 8] & (128 >>> (i11 % 8))) != 0;
                }
            } catch (Exception e5) {
                throw new CertificateParsingException(c2.b.d("cannot construct KeyUsage: ", e5));
            }
        } catch (Exception e7) {
            throw new CertificateParsingException(c2.b.d("cannot construct BasicConstraints: ", e7));
        }
    }

    public static Collection b(byte[] bArr) throws CertificateParsingException {
        String string;
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration objects = ASN1Sequence.getInstance(bArr).getObjects();
            while (objects.hasMoreElements()) {
                GeneralName generalName = GeneralName.getInstance(objects.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(generalName.getEncoded());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 1:
                    case 2:
                    case 6:
                        string = ((ASN1String) generalName.getName()).getString();
                        arrayList2.add(string);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        string = X500Name.getInstance(RFC4519Style.INSTANCE, generalName.getName()).toString();
                        arrayList2.add(string);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            string = InetAddress.getByAddress(ASN1OctetString.getInstance(generalName.getName()).getOctets()).getHostAddress();
                            arrayList2.add(string);
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                        break;
                    case 8:
                        string = ASN1ObjectIdentifier.getInstance(generalName.getName()).getId();
                        arrayList2.add(string);
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException("Bad tag number: " + generalName.getTagNo());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e5) {
            throw new CertificateParsingException(e5.getMessage());
        }
    }

    public final void a(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        Certificate certificate = this.f90462p0;
        AlgorithmIdentifier signatureAlgorithm = certificate.getSignatureAlgorithm();
        AlgorithmIdentifier signature2 = certificate.getTBSCertificate().getSignature();
        if (!signatureAlgorithm.getAlgorithm().equals((ASN1Primitive) signature2.getAlgorithm()) || (signatureAlgorithm.getParameters() != null ? signature2.getParameters() != null ? !signatureAlgorithm.getParameters().equals(signature2.getParameters()) : !(signatureAlgorithm.getParameters() == null || signatureAlgorithm.getParameters().equals(DERNull.INSTANCE)) : !(signature2.getParameters() == null || signature2.getParameters().equals(DERNull.INSTANCE)))) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        ASN1Encodable parameters = certificate.getSignatureAlgorithm().getParameters();
        if (parameters == null) {
            DERNull dERNull = j.f90516a;
        } else if (!j.f90516a.equals(parameters)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                algorithmParameters.init(parameters.toASN1Primitive().getEncoded());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e5) {
                        throw new SignatureException(androidx.emoji2.text.flatbuffer.a.d(e5, new StringBuilder("Exception extracting parameters: ")));
                    }
                }
            } catch (IOException e7) {
                throw new SignatureException(androidx.camera.core.impl.a.d(e7, new StringBuilder("IOException decoding parameters: ")));
            }
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("certificate does not verify with supplied key");
        }
    }

    public final byte[] c(String str) {
        Extension extension;
        Extensions extensions = this.f90462p0.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.security.cert.Certificate)) {
            return false;
        }
        try {
            return Arrays.areEqual(getEncoded(), ((java.security.cert.Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f90467u0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f90467u0.getBagAttributeKeys();
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        BasicConstraints basicConstraints = this.f90463q0;
        if (basicConstraints == null || !basicConstraints.isCA()) {
            return -1;
        }
        if (basicConstraints.getPathLenConstraint() == null) {
            return Integer.MAX_VALUE;
        }
        return basicConstraints.getPathLenConstraint().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.f90462p0.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.f90462p0.getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CertificateEncodingException(e5.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] bArrC = c("2.5.29.37");
        if (bArrC == null) {
            return null;
        }
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(bArrC).readObject();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
                arrayList.add(((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(i10)).getId());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f90462p0.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e5) {
            throw new IllegalStateException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("error parsing ")));
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return b(c(Extension.issuerAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new X509Principal(this.f90462p0.getIssuer());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        DERBitString issuerUniqueId = this.f90462p0.getTBSCertificate().getIssuerUniqueId();
        if (issuerUniqueId == null) {
            return null;
        }
        byte[] bytes = issuerUniqueId.getBytes();
        int length = (bytes.length * 8) - issuerUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 != length; i10++) {
            zArr[i10] = (bytes[i10 / 8] & (128 >>> (i10 % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f90462p0.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.f90464r0;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.f90462p0.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (!extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f90462p0.getEndDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f90462p0.getStartDate().getDate();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f90462p0.getSubjectPublicKeyInfo());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f90462p0.getSerialNumber().getValue();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i10 = 0; i10 != providers.length; i10++) {
            String property2 = providers[i10].getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f90462p0.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        Certificate certificate = this.f90462p0;
        if (certificate.getSignatureAlgorithm().getParameters() != null) {
            try {
                return certificate.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded(ASN1Encoding.DER);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f90462p0.getSignature().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return b(c(Extension.subjectAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new X509Principal(this.f90462p0.getSubject());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        DERBitString subjectUniqueId = this.f90462p0.getTBSCertificate().getSubjectUniqueId();
        if (subjectUniqueId == null) {
            return null;
        }
        byte[] bytes = subjectUniqueId.getBytes();
        int length = (bytes.length * 8) - subjectUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 != length; i10++) {
            zArr[i10] = (bytes[i10 / 8] & (128 >>> (i10 % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.f90462p0.getSubject().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.f90462p0.getTBSCertificate().getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new CertificateEncodingException(e5.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f90462p0.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 3 || (extensions = this.f90462p0.getTBSCertificate().getExtensions()) == null) {
            return false;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            String id = aSN1ObjectIdentifier.getId();
            if (!id.equals(g.f90509l) && !id.equals(g.f90498a) && !id.equals(g.f90499b) && !id.equals(g.f90500c) && !id.equals(g.f90505h) && !id.equals(g.f90501d) && !id.equals(g.f90502e) && !id.equals(g.f90503f) && !id.equals(g.f90504g) && !id.equals(g.f90506i) && !id.equals(g.f90507j) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        try {
            if (!this.f90465s0) {
                int i10 = 0;
                try {
                    byte[] encoded = getEncoded();
                    int i11 = 0;
                    for (int i12 = 1; i12 < encoded.length; i12++) {
                        i11 += encoded[i12] * i12;
                    }
                    i10 = i11;
                } catch (CertificateEncodingException unused) {
                }
                this.f90466t0 = i10;
                this.f90465s0 = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f90466t0;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f90467u0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        Object verisignCzagExtension;
        StringBuffer stringBuffer = new StringBuffer("  [0]         Version: ");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(getVersion());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(strLineSeparator);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(Hex.encode(signature, 0, 20)));
        stringBuffer.append(strLineSeparator);
        int i10 = 20;
        while (i10 < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i10 < length ? new String(Hex.encode(signature, i10, 20)) : new String(Hex.encode(signature, i10, signature.length - i10)));
            stringBuffer.append(strLineSeparator);
            i10 += 20;
        }
        Extensions extensions = this.f90462p0.getTBSCertificate().getExtensions();
        if (extensions != null) {
            Enumeration enumerationOids = extensions.oids();
            if (enumerationOids.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (enumerationOids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
                Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                if (extension.getExtnValue() != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(extension.isCritical());
                    stringBuffer.append(") ");
                    try {
                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.basicConstraints)) {
                            verisignCzagExtension = BasicConstraints.getInstance(aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.keyUsage)) {
                            verisignCzagExtension = KeyUsage.getInstance(aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.netscapeCertType)) {
                            verisignCzagExtension = new NetscapeCertType((DERBitString) aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.netscapeRevocationURL)) {
                            verisignCzagExtension = new NetscapeRevocationURL((DERIA5String) aSN1InputStream.readObject());
                        } else {
                            if (aSN1ObjectIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.verisignCzagExtension)) {
                                verisignCzagExtension = new VerisignCzagExtension((DERIA5String) aSN1InputStream.readObject());
                            } else {
                                stringBuffer.append(aSN1ObjectIdentifier.getId());
                                stringBuffer.append(" value = ");
                                stringBuffer.append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                            }
                            stringBuffer.append(strLineSeparator);
                        }
                        stringBuffer.append(verisignCzagExtension);
                        stringBuffer.append(strLineSeparator);
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.getId());
                        stringBuffer.append(" value = *****");
                        stringBuffer.append(strLineSeparator);
                    }
                }
                stringBuffer.append(strLineSeparator);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        Signature signature;
        String strB = j.b(this.f90462p0.getSignatureAlgorithm());
        try {
            signature = Signature.getInstance(strB, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(strB);
        }
        a(publicKey, signature);
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        long time = date.getTime();
        long time2 = getNotAfter().getTime();
        Certificate certificate = this.f90462p0;
        if (time > time2) {
            throw new CertificateExpiredException("certificate expired on " + certificate.getEndDate().getTime());
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        throw new CertificateNotYetValidException("certificate not valid till " + certificate.getStartDate().getTime());
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        String strB = j.b(this.f90462p0.getSignatureAlgorithm());
        a(publicKey, str != null ? Signature.getInstance(strB, str) : Signature.getInstance(strB));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        String strB = j.b(this.f90462p0.getSignatureAlgorithm());
        a(publicKey, provider != null ? Signature.getInstance(strB, provider) : Signature.getInstance(strB));
    }
}
