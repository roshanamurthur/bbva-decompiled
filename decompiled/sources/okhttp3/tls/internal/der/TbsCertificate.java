package okhttp3.tls.internal.der;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.android.gms.measurement.internal.a;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\b\u0080\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\nHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\nHÆ\u0003J\u008f\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\b2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n2\b\b\u0002\u0010\u001b\u001a\u00020\r2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\nHÆ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n8\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\n8\u0006¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u00106R\u0011\u0010K\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lokhttp3/tls/internal/der/TbsCertificate;", "", "", GenerateActivationFormCommand.HASH_CODE, "", "component1", "Ljava/math/BigInteger;", "component2", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component3", "", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "component4", "Lokhttp3/tls/internal/der/Validity;", "component5", "component6", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "component7", "Lokhttp3/tls/internal/der/BitString;", "component8", "component9", "Lokhttp3/tls/internal/der/Extension;", "component10", "version", DigipassManagerConstants.KEY_SERIAL_NUMBER, "signature", "issuer", "validity", "subject", "subjectPublicKeyInfo", "issuerUniqueID", "subjectUniqueID", IAppSDKPlus.EXTRA_KEY_EXTENSIONS, "copy", "", "toString", "other", "", "equals", "a", "J", "getVersion", "()J", "b", "Ljava/math/BigInteger;", "getSerialNumber", "()Ljava/math/BigInteger;", "c", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getSignature", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "d", "Ljava/util/List;", "getIssuer", "()Ljava/util/List;", "e", "Lokhttp3/tls/internal/der/Validity;", "getValidity", "()Lokhttp3/tls/internal/der/Validity;", "f", "getSubject", "g", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "getSubjectPublicKeyInfo", "()Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "h", "Lokhttp3/tls/internal/der/BitString;", "getIssuerUniqueID", "()Lokhttp3/tls/internal/der/BitString;", "i", "getSubjectUniqueID", "j", "getExtensions", "getSignatureAlgorithmName", "()Ljava/lang/String;", "signatureAlgorithmName", "<init>", "(JLjava/math/BigInteger;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Ljava/util/List;Lokhttp3/tls/internal/der/Validity;Ljava/util/List;Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;Lokhttp3/tls/internal/der/BitString;Lokhttp3/tls/internal/der/BitString;Ljava/util/List;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class TbsCertificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BigInteger serialNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AlgorithmIdentifier signature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<List<AttributeTypeAndValue>> issuer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Validity validity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<List<AttributeTypeAndValue>> subject;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SubjectPublicKeyInfo subjectPublicKeyInfo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final BitString issuerUniqueID;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final BitString subjectUniqueID;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Extension> extensions;

    /* JADX WARN: Multi-variable type inference failed */
    public TbsCertificate(long j10, @NotNull BigInteger serialNumber, @NotNull AlgorithmIdentifier signature, @NotNull List<? extends List<AttributeTypeAndValue>> issuer, @NotNull Validity validity, @NotNull List<? extends List<AttributeTypeAndValue>> subject, @NotNull SubjectPublicKeyInfo subjectPublicKeyInfo, @Nullable BitString bitString, @Nullable BitString bitString2, @NotNull List<Extension> extensions) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(validity, "validity");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(subjectPublicKeyInfo, "subjectPublicKeyInfo");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.version = j10;
        this.serialNumber = serialNumber;
        this.signature = signature;
        this.issuer = issuer;
        this.validity = validity;
        this.subject = subject;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        this.issuerUniqueID = bitString;
        this.subjectUniqueID = bitString2;
        this.extensions = extensions;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @NotNull
    public final List<Extension> component10() {
        return this.extensions;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    @NotNull
    public final List<List<AttributeTypeAndValue>> component4() {
        return this.issuer;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Validity getValidity() {
        return this.validity;
    }

    @NotNull
    public final List<List<AttributeTypeAndValue>> component6() {
        return this.subject;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BitString getIssuerUniqueID() {
        return this.issuerUniqueID;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BitString getSubjectUniqueID() {
        return this.subjectUniqueID;
    }

    @NotNull
    public final TbsCertificate copy(long version, @NotNull BigInteger serialNumber, @NotNull AlgorithmIdentifier signature, @NotNull List<? extends List<AttributeTypeAndValue>> issuer, @NotNull Validity validity, @NotNull List<? extends List<AttributeTypeAndValue>> subject, @NotNull SubjectPublicKeyInfo subjectPublicKeyInfo, @Nullable BitString issuerUniqueID, @Nullable BitString subjectUniqueID, @NotNull List<Extension> extensions) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(validity, "validity");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(subjectPublicKeyInfo, "subjectPublicKeyInfo");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return new TbsCertificate(version, serialNumber, signature, issuer, validity, subject, subjectPublicKeyInfo, issuerUniqueID, subjectUniqueID, extensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TbsCertificate)) {
            return false;
        }
        TbsCertificate tbsCertificate = (TbsCertificate) other;
        return this.version == tbsCertificate.version && Intrinsics.areEqual(this.serialNumber, tbsCertificate.serialNumber) && Intrinsics.areEqual(this.signature, tbsCertificate.signature) && Intrinsics.areEqual(this.issuer, tbsCertificate.issuer) && Intrinsics.areEqual(this.validity, tbsCertificate.validity) && Intrinsics.areEqual(this.subject, tbsCertificate.subject) && Intrinsics.areEqual(this.subjectPublicKeyInfo, tbsCertificate.subjectPublicKeyInfo) && Intrinsics.areEqual(this.issuerUniqueID, tbsCertificate.issuerUniqueID) && Intrinsics.areEqual(this.subjectUniqueID, tbsCertificate.subjectUniqueID) && Intrinsics.areEqual(this.extensions, tbsCertificate.extensions);
    }

    @NotNull
    public final List<Extension> getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final List<List<AttributeTypeAndValue>> getIssuer() {
        return this.issuer;
    }

    @Nullable
    public final BitString getIssuerUniqueID() {
        return this.issuerUniqueID;
    }

    @NotNull
    public final BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    @NotNull
    public final String getSignatureAlgorithmName() {
        AlgorithmIdentifier algorithmIdentifier = this.signature;
        String algorithm = algorithmIdentifier.getAlgorithm();
        int iHashCode = algorithm.hashCode();
        if (iHashCode != -551630290) {
            if (iHashCode == 368620366 && algorithm.equals(ObjectIdentifiers.sha256withEcdsa)) {
                return "SHA256withECDSA";
            }
        } else if (algorithm.equals(ObjectIdentifiers.sha256WithRSAEncryption)) {
            return "SHA256WithRSA";
        }
        throw new IllegalStateException(("unexpected signature algorithm: " + algorithmIdentifier.getAlgorithm()).toString());
    }

    @NotNull
    public final List<List<AttributeTypeAndValue>> getSubject() {
        return this.subject;
    }

    @NotNull
    public final SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    @Nullable
    public final BitString getSubjectUniqueID() {
        return this.subjectUniqueID;
    }

    @NotNull
    public final Validity getValidity() {
        return this.validity;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = (this.subjectPublicKeyInfo.hashCode() + a.a(this.subject, (this.validity.hashCode() + a.a(this.issuer, (this.signature.hashCode() + ((this.serialNumber.hashCode() + (((int) this.version) * 31)) * 31)) * 31, 31)) * 31, 31)) * 31;
        BitString bitString = this.issuerUniqueID;
        int iHashCode2 = (iHashCode + (bitString != null ? bitString.hashCode() : 0)) * 31;
        BitString bitString2 = this.subjectUniqueID;
        return this.extensions.hashCode() + ((iHashCode2 + (bitString2 != null ? bitString2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TbsCertificate(version=");
        sb2.append(this.version);
        sb2.append(", serialNumber=");
        sb2.append(this.serialNumber);
        sb2.append(", signature=");
        sb2.append(this.signature);
        sb2.append(", issuer=");
        sb2.append(this.issuer);
        sb2.append(", validity=");
        sb2.append(this.validity);
        sb2.append(", subject=");
        sb2.append(this.subject);
        sb2.append(", subjectPublicKeyInfo=");
        sb2.append(this.subjectPublicKeyInfo);
        sb2.append(", issuerUniqueID=");
        sb2.append(this.issuerUniqueID);
        sb2.append(", subjectUniqueID=");
        sb2.append(this.subjectUniqueID);
        sb2.append(", extensions=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.extensions, ")");
    }
}
