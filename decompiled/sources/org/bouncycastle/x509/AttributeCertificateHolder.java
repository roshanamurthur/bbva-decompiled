package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.asn1.x509.ObjectDigestInfo;
import org.bouncycastle.jce.PrincipalUtil;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes13.dex */
public class AttributeCertificateHolder implements CertSelector, Selector {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Holder f91684p0;

    public AttributeCertificateHolder(int i10, String str, String str2, byte[] bArr) {
        this.f91684p0 = new Holder(new ObjectDigestInfo(i10, new ASN1ObjectIdentifier(str2), new AlgorithmIdentifier(new ASN1ObjectIdentifier(str)), Arrays.clone(bArr)));
    }

    public static Principal[] a(GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        ArrayList arrayList = new ArrayList(names.length);
        for (int i10 = 0; i10 != names.length; i10++) {
            if (names[i10].getTagNo() == 4) {
                try {
                    arrayList.add(new X500Principal(names[i10].getName().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        Object[] array = arrayList.toArray(new Object[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 != array.length; i11++) {
            Object obj = array[i11];
            if (obj instanceof Principal) {
                arrayList2.add(obj);
            }
        }
        return (Principal[]) arrayList2.toArray(new Principal[arrayList2.size()]);
    }

    public static boolean b(X509Principal x509Principal, GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i10 = 0; i10 != names.length; i10++) {
            GeneralName generalName = names[i10];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new X509Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x509Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return new AttributeCertificateHolder((ASN1Sequence) this.f91684p0.toASN1Primitive());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeCertificateHolder) {
            return this.f91684p0.equals(((AttributeCertificateHolder) obj).f91684p0);
        }
        return false;
    }

    public String getDigestAlgorithm() {
        Holder holder = this.f91684p0;
        if (holder.getObjectDigestInfo() != null) {
            return holder.getObjectDigestInfo().getDigestAlgorithm().getAlgorithm().getId();
        }
        return null;
    }

    public int getDigestedObjectType() {
        Holder holder = this.f91684p0;
        if (holder.getObjectDigestInfo() != null) {
            return holder.getObjectDigestInfo().getDigestedObjectType().intValueExact();
        }
        return -1;
    }

    public Principal[] getEntityNames() {
        Holder holder = this.f91684p0;
        if (holder.getEntityName() != null) {
            return a(holder.getEntityName());
        }
        return null;
    }

    public Principal[] getIssuer() {
        Holder holder = this.f91684p0;
        if (holder.getBaseCertificateID() != null) {
            return a(holder.getBaseCertificateID().getIssuer());
        }
        return null;
    }

    public byte[] getObjectDigest() {
        Holder holder = this.f91684p0;
        if (holder.getObjectDigestInfo() != null) {
            return holder.getObjectDigestInfo().getObjectDigest().getBytes();
        }
        return null;
    }

    public String getOtherObjectTypeID() {
        Holder holder = this.f91684p0;
        if (holder.getObjectDigestInfo() == null) {
            return null;
        }
        holder.getObjectDigestInfo().getOtherObjectTypeID().getId();
        return null;
    }

    public BigInteger getSerialNumber() {
        Holder holder = this.f91684p0;
        if (holder.getBaseCertificateID() != null) {
            return holder.getBaseCertificateID().getSerial().getValue();
        }
        return null;
    }

    public int hashCode() {
        return this.f91684p0.hashCode();
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    public AttributeCertificateHolder(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            this.f91684p0 = new Holder(new IssuerSerial(GeneralNames.getInstance(new DERSequence(new GeneralName(PrincipalUtil.getIssuerX509Principal(x509Certificate)))), new ASN1Integer(x509Certificate.getSerialNumber())));
        } catch (Exception e5) {
            throw new CertificateParsingException(e5.getMessage());
        }
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) throws NoSuchAlgorithmException, NoSuchProviderException {
        Holder holder = this.f91684p0;
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        try {
            if (holder.getBaseCertificateID() != null) {
                return holder.getBaseCertificateID().getSerial().hasValue(x509Certificate.getSerialNumber()) && b(PrincipalUtil.getIssuerX509Principal(x509Certificate), holder.getBaseCertificateID().getIssuer());
            }
            if (holder.getEntityName() != null && b(PrincipalUtil.getSubjectX509Principal(x509Certificate), holder.getEntityName())) {
                return true;
            }
            if (holder.getObjectDigestInfo() != null) {
                MessageDigest messageDigest = MessageDigest.getInstance(getDigestAlgorithm(), BouncyCastleProvider.PROVIDER_NAME);
                int digestedObjectType = getDigestedObjectType();
                if (digestedObjectType == 0) {
                    messageDigest.update(certificate.getPublicKey().getEncoded());
                } else if (digestedObjectType == 1) {
                    messageDigest.update(certificate.getEncoded());
                }
                Arrays.areEqual(messageDigest.digest(), getObjectDigest());
            }
            return false;
        } catch (CertificateEncodingException | Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttributeCertificateHolder(X500Principal x500Principal) {
        this(new X509Principal(x500Principal.getEncoded()));
        Hashtable hashtable = e.f91746a;
        try {
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot convert principal");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttributeCertificateHolder(X500Principal x500Principal, BigInteger bigInteger) {
        this(new X509Principal(x500Principal.getEncoded()), bigInteger);
        Hashtable hashtable = e.f91746a;
        try {
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot convert principal");
        }
    }

    public AttributeCertificateHolder(ASN1Sequence aSN1Sequence) {
        this.f91684p0 = Holder.getInstance(aSN1Sequence);
    }

    public AttributeCertificateHolder(X509Principal x509Principal) {
        this.f91684p0 = new Holder(GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal))));
    }

    public AttributeCertificateHolder(X509Principal x509Principal, BigInteger bigInteger) {
        this.f91684p0 = new Holder(new IssuerSerial(GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal))), new ASN1Integer(bigInteger)));
    }
}
