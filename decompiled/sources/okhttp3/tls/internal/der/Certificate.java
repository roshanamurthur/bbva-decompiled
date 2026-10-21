package okhttp3.tls.internal.der;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010(\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0013\u0010,\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Lokhttp3/tls/internal/der/Certificate;", "", "Ljava/security/PublicKey;", "issuer", "", "checkSignature", "Ljava/security/cert/X509Certificate;", "toX509Certificate", "Lokhttp3/tls/internal/der/TbsCertificate;", "component1", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component2", "Lokhttp3/tls/internal/der/BitString;", "component3", "tbsCertificate", "signatureAlgorithm", "signatureValue", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lokhttp3/tls/internal/der/TbsCertificate;", "getTbsCertificate", "()Lokhttp3/tls/internal/der/TbsCertificate;", "b", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getSignatureAlgorithm", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "c", "Lokhttp3/tls/internal/der/BitString;", "getSignatureValue", "()Lokhttp3/tls/internal/der/BitString;", "getCommonName", "()Ljava/lang/Object;", "commonName", "getOrganizationalUnitName", "organizationalUnitName", "Lokhttp3/tls/internal/der/Extension;", "getSubjectAlternativeNames", "()Lokhttp3/tls/internal/der/Extension;", "subjectAlternativeNames", "getBasicConstraints", "basicConstraints", "<init>", "(Lokhttp3/tls/internal/der/TbsCertificate;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Certificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TbsCertificate tbsCertificate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AlgorithmIdentifier signatureAlgorithm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BitString signatureValue;

    public Certificate(@NotNull TbsCertificate tbsCertificate, @NotNull AlgorithmIdentifier signatureAlgorithm, @NotNull BitString signatureValue) {
        Intrinsics.checkNotNullParameter(tbsCertificate, "tbsCertificate");
        Intrinsics.checkNotNullParameter(signatureAlgorithm, "signatureAlgorithm");
        Intrinsics.checkNotNullParameter(signatureValue, "signatureValue");
        this.tbsCertificate = tbsCertificate;
        this.signatureAlgorithm = signatureAlgorithm;
        this.signatureValue = signatureValue;
    }

    public static /* synthetic */ Certificate copy$default(Certificate certificate, TbsCertificate tbsCertificate, AlgorithmIdentifier algorithmIdentifier, BitString bitString, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tbsCertificate = certificate.tbsCertificate;
        }
        if ((i10 & 2) != 0) {
            algorithmIdentifier = certificate.signatureAlgorithm;
        }
        if ((i10 & 4) != 0) {
            bitString = certificate.signatureValue;
        }
        return certificate.copy(tbsCertificate, algorithmIdentifier, bitString);
    }

    public final boolean checkSignature(@NotNull PublicKey issuer) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        BasicDerAdapter<TbsCertificate> tbsCertificate$okhttp_tls = CertificateAdapters.INSTANCE.getTbsCertificate$okhttp_tls();
        TbsCertificate tbsCertificate = this.tbsCertificate;
        ByteString der = tbsCertificate$okhttp_tls.toDer(tbsCertificate);
        Signature signature = Signature.getInstance(tbsCertificate.getSignatureAlgorithmName());
        signature.initVerify(issuer);
        signature.update(der.toByteArray());
        return signature.verify(this.signatureValue.getByteString().toByteArray());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TbsCertificate getTbsCertificate() {
        return this.tbsCertificate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BitString getSignatureValue() {
        return this.signatureValue;
    }

    @NotNull
    public final Certificate copy(@NotNull TbsCertificate tbsCertificate, @NotNull AlgorithmIdentifier signatureAlgorithm, @NotNull BitString signatureValue) {
        Intrinsics.checkNotNullParameter(tbsCertificate, "tbsCertificate");
        Intrinsics.checkNotNullParameter(signatureAlgorithm, "signatureAlgorithm");
        Intrinsics.checkNotNullParameter(signatureValue, "signatureValue");
        return new Certificate(tbsCertificate, signatureAlgorithm, signatureValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) other;
        return Intrinsics.areEqual(this.tbsCertificate, certificate.tbsCertificate) && Intrinsics.areEqual(this.signatureAlgorithm, certificate.signatureAlgorithm) && Intrinsics.areEqual(this.signatureValue, certificate.signatureValue);
    }

    @NotNull
    public final Extension getBasicConstraints() {
        for (Extension extension : this.tbsCertificate.getExtensions()) {
            if (Intrinsics.areEqual(extension.getId(), ObjectIdentifiers.basicConstraints)) {
                return extension;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Nullable
    public final Object getCommonName() {
        Object next;
        Iterator it = CollectionsKt__IterablesKt.flatten(this.tbsCertificate.getSubject()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((AttributeTypeAndValue) next).getType(), ObjectIdentifiers.commonName));
        AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) next;
        if (attributeTypeAndValue != null) {
            return attributeTypeAndValue.getValue();
        }
        return null;
    }

    @Nullable
    public final Object getOrganizationalUnitName() {
        Object next;
        Iterator it = CollectionsKt__IterablesKt.flatten(this.tbsCertificate.getSubject()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((AttributeTypeAndValue) next).getType(), ObjectIdentifiers.organizationalUnitName));
        AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) next;
        if (attributeTypeAndValue != null) {
            return attributeTypeAndValue.getValue();
        }
        return null;
    }

    @NotNull
    public final AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    @NotNull
    public final BitString getSignatureValue() {
        return this.signatureValue;
    }

    @Nullable
    public final Extension getSubjectAlternativeNames() {
        Object next;
        Iterator<T> it = this.tbsCertificate.getExtensions().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Extension) next).getId(), ObjectIdentifiers.subjectAlternativeName)) {
                return (Extension) next;
            }
        }
        next = null;
        return (Extension) next;
    }

    @NotNull
    public final TbsCertificate getTbsCertificate() {
        return this.tbsCertificate;
    }

    public int hashCode() {
        TbsCertificate tbsCertificate = this.tbsCertificate;
        int iHashCode = (tbsCertificate != null ? tbsCertificate.hashCode() : 0) * 31;
        AlgorithmIdentifier algorithmIdentifier = this.signatureAlgorithm;
        int iHashCode2 = (iHashCode + (algorithmIdentifier != null ? algorithmIdentifier.hashCode() : 0)) * 31;
        BitString bitString = this.signatureValue;
        return iHashCode2 + (bitString != null ? bitString.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Certificate(tbsCertificate=" + this.tbsCertificate + ", signatureAlgorithm=" + this.signatureAlgorithm + ", signatureValue=" + this.signatureValue + ")";
    }

    @NotNull
    public final X509Certificate toX509Certificate() {
        try {
            Collection<? extends java.security.cert.Certificate> certificates = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificates(new Buffer().write(CertificateAdapters.INSTANCE.getCertificate$okhttp_tls().toDer(this)).inputStream());
            Intrinsics.checkNotNullExpressionValue(certificates, "certificates");
            Object objSingle = CollectionsKt___CollectionsKt.single(certificates);
            if (objSingle != null) {
                return (X509Certificate) objSingle;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException("failed to decode certificate", e5);
        } catch (GeneralSecurityException e7) {
            throw new IllegalArgumentException("failed to decode certificate", e7);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException("failed to decode certificate", e10);
        }
    }
}
