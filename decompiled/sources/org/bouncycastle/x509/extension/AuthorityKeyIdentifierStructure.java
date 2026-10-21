package org.bouncycastle.x509.extension;

import c2.b;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.jce.PrincipalUtil;

/* JADX INFO: loaded from: classes13.dex */
public class AuthorityKeyIdentifierStructure extends AuthorityKeyIdentifier {
    public AuthorityKeyIdentifierStructure(PublicKey publicKey) throws InvalidKeyException {
        try {
            super((ASN1Sequence) new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())).toASN1Primitive());
        } catch (Exception e5) {
            throw new InvalidKeyException(b.d("can't process key: ", e5));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthorityKeyIdentifierStructure(X509Certificate x509Certificate) throws CertificateParsingException {
        ASN1Primitive aSN1Primitive;
        try {
            if (x509Certificate.getVersion() != 3) {
                aSN1Primitive = new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()), new GeneralNames(new GeneralName(PrincipalUtil.getIssuerX509Principal(x509Certificate))), x509Certificate.getSerialNumber()).toASN1Primitive();
            } else {
                GeneralName generalName = new GeneralName(PrincipalUtil.getIssuerX509Principal(x509Certificate));
                byte[] extensionValue = x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId());
                aSN1Primitive = extensionValue != null ? new AuthorityKeyIdentifier(((ASN1OctetString) X509ExtensionUtil.fromExtensionValue(extensionValue)).getOctets(), new GeneralNames(generalName), x509Certificate.getSerialNumber()).toASN1Primitive() : new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()), new GeneralNames(generalName), x509Certificate.getSerialNumber()).toASN1Primitive();
            }
            super((ASN1Sequence) aSN1Primitive);
        } catch (Exception e5) {
            throw new CertificateParsingException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("Exception extracting certificate details: ")));
        }
    }

    public AuthorityKeyIdentifierStructure(Extension extension) {
        super((ASN1Sequence) extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(X509Extension x509Extension) {
        super((ASN1Sequence) x509Extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(byte[] bArr) throws IOException {
        super((ASN1Sequence) X509ExtensionUtil.fromExtensionValue(bArr));
    }
}
