package okhttp3.tls;

import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.d;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.noknok.android.client.metrics.Tabulator;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.security.auth.x500.X500Principal;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okhttp3.internal.Util;
import okhttp3.tls.internal.der.AlgorithmIdentifier;
import okhttp3.tls.internal.der.AttributeTypeAndValue;
import okhttp3.tls.internal.der.BasicConstraints;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okhttp3.tls.internal.der.BitString;
import okhttp3.tls.internal.der.Certificate;
import okhttp3.tls.internal.der.CertificateAdapters;
import okhttp3.tls.internal.der.Extension;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import okhttp3.tls.internal.der.PrivateKeyInfo;
import okhttp3.tls.internal.der.SubjectPublicKeyInfo;
import okhttp3.tls.internal.der.TbsCertificate;
import okhttp3.tls.internal.der.Validity;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HeldCertificate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0014B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\bR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0016"}, d2 = {"Lokhttp3/tls/HeldCertificate;", "", "Ljava/security/cert/X509Certificate;", "-deprecated_certificate", "()Ljava/security/cert/X509Certificate;", "certificate", "Ljava/security/KeyPair;", "-deprecated_keyPair", "()Ljava/security/KeyPair;", "keyPair", "", "certificatePem", "privateKeyPkcs8Pem", "privateKeyPkcs1Pem", "a", "Ljava/security/KeyPair;", "b", "Ljava/security/cert/X509Certificate;", "<init>", "(Ljava/security/KeyPair;Ljava/security/cert/X509Certificate;)V", "Companion", "Builder", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class HeldCertificate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f86167c = new Regex("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KeyPair keyPair;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final X509Certificate certificate;

    /* JADX INFO: compiled from: HeldCertificate.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0000J\u0006\u0010\u001e\u001a\u00020\u0000J\u0006\u0010\u001f\u001a\u00020\u0018¨\u0006#"}, d2 = {"Lokhttp3/tls/HeldCertificate$Builder;", "", "", "notBefore", "notAfter", "validityInterval", TypedValues.TransitionType.S_DURATION, "Ljava/util/concurrent/TimeUnit;", Tabulator.KEY_UNIT, "", "altName", "addSubjectAlternativeName", "cn", "commonName", "ou", "organizationalUnit", "Ljava/math/BigInteger;", DigipassManagerConstants.KEY_SERIAL_NUMBER, "Ljava/security/KeyPair;", "keyPair", "Ljava/security/PublicKey;", FacialAuthFragment.PUBLIC_KEY, "Ljava/security/PrivateKey;", "privateKey", "Lokhttp3/tls/HeldCertificate;", "signedBy", "", "maxIntermediateCas", "certificateAuthority", "ecdsa256", "rsa2048", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "Companion", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f86172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f86173d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public BigInteger f86175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public KeyPair f86176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public HeldCertificate f86177h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f86179j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f86180k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f86170a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f86171b = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f86174e = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f86178i = -1;

        public Builder() {
            ecdsa256();
        }

        @NotNull
        public final Builder addSubjectAlternativeName(@NotNull String altName) {
            Intrinsics.checkNotNullParameter(altName, "altName");
            this.f86174e.add(altName);
            return this;
        }

        @NotNull
        public final HeldCertificate build() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, UnknownHostException {
            KeyPair keyPair;
            List listFromDer;
            Pair pair;
            KeyPair keyPairGenerateKeyPair = this.f86176g;
            if (keyPairGenerateKeyPair == null) {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(this.f86179j);
                keyPairGenerator.initialize(this.f86180k, new SecureRandom());
                keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "KeyPairGenerator.getInst…generateKeyPair()\n      }");
            }
            CertificateAdapters certificateAdapters = CertificateAdapters.INSTANCE;
            BasicDerAdapter<SubjectPublicKeyInfo> subjectPublicKeyInfo$okhttp_tls = certificateAdapters.getSubjectPublicKeyInfo$okhttp_tls();
            ByteString.Companion companion = ByteString.INSTANCE;
            PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
            Intrinsics.checkNotNullExpressionValue(publicKey, "subjectKeyPair.public");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "subjectKeyPair.public.encoded");
            SubjectPublicKeyInfo subjectPublicKeyInfoFromDer = subjectPublicKeyInfo$okhttp_tls.fromDer(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null));
            ArrayList arrayList = new ArrayList();
            String str = this.f86173d;
            if (str != null) {
                arrayList.add(d.listOf(new AttributeTypeAndValue(ObjectIdentifiers.organizationalUnitName, str)));
            }
            String string = this.f86172c;
            if (string == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "UUID.randomUUID().toString()");
            }
            arrayList.add(d.listOf(new AttributeTypeAndValue(ObjectIdentifiers.commonName, string)));
            HeldCertificate heldCertificate = this.f86177h;
            if (heldCertificate != null) {
                Intrinsics.checkNotNull(heldCertificate);
                KeyPair keyPair2 = heldCertificate.keyPair();
                BasicDerAdapter<List<List<AttributeTypeAndValue>>> rdnSequence$okhttp_tls = certificateAdapters.getRdnSequence$okhttp_tls();
                HeldCertificate heldCertificate2 = this.f86177h;
                Intrinsics.checkNotNull(heldCertificate2);
                X500Principal subjectX500Principal = heldCertificate2.certificate().getSubjectX500Principal();
                Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "signedBy!!.certificate.subjectX500Principal");
                byte[] encoded2 = subjectX500Principal.getEncoded();
                Intrinsics.checkNotNullExpressionValue(encoded2, "signedBy!!.certificate.s…jectX500Principal.encoded");
                listFromDer = rdnSequence$okhttp_tls.fromDer(ByteString.Companion.of$default(companion, encoded2, 0, 0, 3, null));
                keyPair = keyPair2;
            } else {
                keyPair = keyPairGenerateKeyPair;
                listFromDer = arrayList;
            }
            AlgorithmIdentifier algorithmIdentifier = keyPair.getPrivate() instanceof RSAPrivateKey ? new AlgorithmIdentifier(ObjectIdentifiers.sha256WithRSAEncryption, null) : new AlgorithmIdentifier(ObjectIdentifiers.sha256withEcdsa, ByteString.EMPTY);
            BigInteger bigInteger = this.f86175f;
            if (bigInteger == null) {
                bigInteger = BigInteger.ONE;
            }
            BigInteger bigInteger2 = bigInteger;
            Intrinsics.checkNotNullExpressionValue(bigInteger2, "serialNumber ?: BigInteger.ONE");
            long jCurrentTimeMillis = this.f86170a;
            if (jCurrentTimeMillis == -1) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j10 = this.f86171b;
            if (j10 == -1) {
                j10 = jCurrentTimeMillis + 86400000;
            }
            Validity validity = new Validity(jCurrentTimeMillis, j10);
            ArrayList arrayList2 = new ArrayList();
            int i10 = this.f86178i;
            if (i10 != -1) {
                arrayList2.add(new Extension(ObjectIdentifiers.basicConstraints, true, new BasicConstraints(true, Long.valueOf(i10))));
            }
            ArrayList<String> arrayList3 = this.f86174e;
            if (!arrayList3.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                for (String str2 : arrayList3) {
                    if (Util.canParseAsIpAddress(str2)) {
                        BasicDerAdapter<ByteString> generalNameIpAddress$okhttp_tls = CertificateAdapters.INSTANCE.getGeneralNameIpAddress$okhttp_tls();
                        ByteString.Companion companion2 = ByteString.INSTANCE;
                        InetAddress byName = InetAddress.getByName(str2);
                        Intrinsics.checkNotNullExpressionValue(byName, "InetAddress.getByName(it)");
                        byte[] address = byName.getAddress();
                        Intrinsics.checkNotNullExpressionValue(address, "InetAddress.getByName(it).address");
                        pair = TuplesKt.to(generalNameIpAddress$okhttp_tls, ByteString.Companion.of$default(companion2, address, 0, 0, 3, null));
                    } else {
                        pair = TuplesKt.to(CertificateAdapters.INSTANCE.getGeneralNameDnsName$okhttp_tls(), str2);
                    }
                    arrayList4.add(pair);
                }
                arrayList2.add(new Extension(ObjectIdentifiers.subjectAlternativeName, true, arrayList4));
            }
            TbsCertificate tbsCertificate = new TbsCertificate(2L, bigInteger2, algorithmIdentifier, listFromDer, validity, arrayList, subjectPublicKeyInfoFromDer, null, null, arrayList2);
            Signature signature = Signature.getInstance(tbsCertificate.getSignatureAlgorithmName());
            signature.initSign(keyPair.getPrivate());
            signature.update(CertificateAdapters.INSTANCE.getTbsCertificate$okhttp_tls().toDer(tbsCertificate).toByteArray());
            ByteString.Companion companion3 = ByteString.INSTANCE;
            byte[] bArrSign = signature.sign();
            Intrinsics.checkNotNullExpressionValue(bArrSign, "sign()");
            return new HeldCertificate(keyPairGenerateKeyPair, new Certificate(tbsCertificate, algorithmIdentifier, new BitString(ByteString.Companion.of$default(companion3, bArrSign, 0, 0, 3, null), 0)).toX509Certificate());
        }

        @NotNull
        public final Builder certificateAuthority(int maxIntermediateCas) {
            if (!(maxIntermediateCas >= 0)) {
                throw new IllegalArgumentException(g0.c("maxIntermediateCas < 0: ", maxIntermediateCas).toString());
            }
            this.f86178i = maxIntermediateCas;
            return this;
        }

        @NotNull
        public final Builder commonName(@NotNull String cn2) {
            Intrinsics.checkNotNullParameter(cn2, "cn");
            this.f86172c = cn2;
            return this;
        }

        @NotNull
        public final Builder duration(long duration, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            long jCurrentTimeMillis = System.currentTimeMillis();
            validityInterval(jCurrentTimeMillis, unit.toMillis(duration) + jCurrentTimeMillis);
            return this;
        }

        @NotNull
        public final Builder ecdsa256() {
            this.f86179j = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
            this.f86180k = 256;
            return this;
        }

        @NotNull
        public final Builder keyPair(@NotNull KeyPair keyPair) {
            Intrinsics.checkNotNullParameter(keyPair, "keyPair");
            this.f86176g = keyPair;
            return this;
        }

        @NotNull
        public final Builder organizationalUnit(@NotNull String ou) {
            Intrinsics.checkNotNullParameter(ou, "ou");
            this.f86173d = ou;
            return this;
        }

        @NotNull
        public final Builder rsa2048() {
            this.f86179j = "RSA";
            this.f86180k = 2048;
            return this;
        }

        @NotNull
        public final Builder serialNumber(@NotNull BigInteger serialNumber) {
            Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
            this.f86175f = serialNumber;
            return this;
        }

        @NotNull
        public final Builder signedBy(@Nullable HeldCertificate signedBy) {
            this.f86177h = signedBy;
            return this;
        }

        @NotNull
        public final Builder validityInterval(long notBefore, long notAfter) {
            boolean z10 = false;
            if (notBefore <= notAfter) {
                if ((notBefore == -1) == (notAfter == -1)) {
                    z10 = true;
                }
            }
            if (z10) {
                this.f86170a = notBefore;
                this.f86171b = notAfter;
                return this;
            }
            throw new IllegalArgumentException(("invalid interval: " + notBefore + ".." + notAfter).toString());
        }

        @NotNull
        public final Builder keyPair(@NotNull PublicKey publicKey, @NotNull PrivateKey privateKey) {
            Intrinsics.checkNotNullParameter(publicKey, "publicKey");
            Intrinsics.checkNotNullParameter(privateKey, "privateKey");
            keyPair(new KeyPair(publicKey, privateKey));
            return this;
        }

        @NotNull
        public final Builder serialNumber(long serialNumber) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(serialNumber);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(serialNumber)");
            serialNumber(bigIntegerValueOf);
            return this;
        }
    }

    /* JADX INFO: compiled from: HeldCertificate.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/tls/HeldCertificate$Companion;", "", "", "certificateAndPrivateKeyPem", "Lokhttp3/tls/HeldCertificate;", "decode", "Lkotlin/text/Regex;", "PEM_REGEX", "Lkotlin/text/Regex;", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HeldCertificate decode(@NotNull String certificateAndPrivateKeyPem) {
            String str;
            Intrinsics.checkNotNullParameter(certificateAndPrivateKeyPem, "certificateAndPrivateKeyPem");
            String value = null;
            Iterator it = Regex.findAll$default(HeldCertificate.f86167c, certificateAndPrivateKeyPem, 0, 2, null).iterator();
            String value2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!(value != null)) {
                        throw new IllegalArgumentException("string does not include a certificate".toString());
                    }
                    if (!(value2 != null)) {
                        throw new IllegalArgumentException("string does not include a private key".toString());
                    }
                    X509Certificate x509CertificateDecodeCertificatePem = Certificates.decodeCertificatePem(value);
                    ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(value2);
                    if (byteStringDecodeBase64 == null) {
                        throw new IllegalArgumentException("failed to decode private key");
                    }
                    PublicKey publicKey = x509CertificateDecodeCertificatePem.getPublicKey();
                    if (publicKey instanceof ECPublicKey) {
                        str = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
                    } else {
                        if (!(publicKey instanceof RSAPublicKey)) {
                            throw new IllegalArgumentException("unexpected key type: " + x509CertificateDecodeCertificatePem.getPublicKey());
                        }
                        str = "RSA";
                    }
                    try {
                        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(byteStringDecodeBase64.toByteArray()));
                        Intrinsics.checkNotNullExpressionValue(privateKeyGeneratePrivate, "keyFactory.generatePriva…Spec(data.toByteArray()))");
                        return new HeldCertificate(new KeyPair(x509CertificateDecodeCertificatePem.getPublicKey(), privateKeyGeneratePrivate), x509CertificateDecodeCertificatePem);
                    } catch (GeneralSecurityException e5) {
                        throw new IllegalArgumentException("failed to decode private key", e5);
                    }
                }
                MatchResult matchResult = (MatchResult) it.next();
                MatchGroup matchGroup = matchResult.getGroups().get(1);
                Intrinsics.checkNotNull(matchGroup);
                String value3 = matchGroup.getValue();
                int iHashCode = value3.hashCode();
                if (iHashCode != -189606537) {
                    if (iHashCode != -170985982 || !value3.equals("PRIVATE KEY")) {
                        throw new IllegalArgumentException("unexpected type: ".concat(value3));
                    }
                    if (!(value2 == null)) {
                        throw new IllegalArgumentException("string includes multiple private keys".toString());
                    }
                    MatchGroup matchGroup2 = matchResult.getGroups().get(2);
                    Intrinsics.checkNotNull(matchGroup2);
                    value2 = matchGroup2.getValue();
                } else {
                    if (!value3.equals("CERTIFICATE")) {
                        throw new IllegalArgumentException("unexpected type: ".concat(value3));
                    }
                    if (!(value == null)) {
                        throw new IllegalArgumentException("string includes multiple certificates".toString());
                    }
                    MatchGroup matchGroup3 = matchResult.getGroups().get(0);
                    Intrinsics.checkNotNull(matchGroup3);
                    value = matchGroup3.getValue();
                }
            }
        }
    }

    public HeldCertificate(@NotNull KeyPair keyPair, @NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(keyPair, "keyPair");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        this.keyPair = keyPair;
        this.certificate = certificate;
    }

    @JvmStatic
    @NotNull
    public static final HeldCertificate decode(@NotNull String str) {
        return INSTANCE.decode(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificate", imports = {}))
    @JvmName(name = "-deprecated_certificate")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_certificate, reason: not valid java name and from getter */
    public final X509Certificate getCertificate() {
        return this.certificate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "keyPair", imports = {}))
    @JvmName(name = "-deprecated_keyPair")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_keyPair, reason: not valid java name and from getter */
    public final KeyPair getKeyPair() {
        return this.keyPair;
    }

    @JvmName(name = "certificate")
    @NotNull
    public final X509Certificate certificate() {
        return this.certificate;
    }

    @NotNull
    public final String certificatePem() {
        return Certificates.certificatePem(this.certificate);
    }

    @JvmName(name = "keyPair")
    @NotNull
    public final KeyPair keyPair() {
        return this.keyPair;
    }

    @NotNull
    public final String privateKeyPkcs1Pem() {
        KeyPair keyPair = this.keyPair;
        if (!(keyPair.getPrivate() instanceof RSAPrivateKey)) {
            throw new IllegalStateException("PKCS1 only supports RSA keys".toString());
        }
        StringBuilder sbD = c.d("-----BEGIN RSA PRIVATE KEY-----\n");
        BasicDerAdapter<PrivateKeyInfo> privateKeyInfo$okhttp_tls = CertificateAdapters.INSTANCE.getPrivateKeyInfo$okhttp_tls();
        ByteString.Companion companion = ByteString.INSTANCE;
        PrivateKey privateKey = keyPair.getPrivate();
        Intrinsics.checkNotNullExpressionValue(privateKey, "keyPair.private");
        byte[] encoded = privateKey.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "keyPair.private.encoded");
        Certificates.encodeBase64Lines(sbD, privateKeyInfo$okhttp_tls.fromDer(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null)).getPrivateKey());
        sbD.append("-----END RSA PRIVATE KEY-----\n");
        String string = sbD.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String privateKeyPkcs8Pem() {
        StringBuilder sbD = c.d("-----BEGIN PRIVATE KEY-----\n");
        ByteString.Companion companion = ByteString.INSTANCE;
        PrivateKey privateKey = this.keyPair.getPrivate();
        Intrinsics.checkNotNullExpressionValue(privateKey, "keyPair.private");
        byte[] encoded = privateKey.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "keyPair.private.encoded");
        Certificates.encodeBase64Lines(sbD, ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null));
        sbD.append("-----END PRIVATE KEY-----\n");
        String string = sbD.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
