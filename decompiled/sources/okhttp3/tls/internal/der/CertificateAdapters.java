package okhttp3.tls.internal.der;

import java.io.IOException;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CertificateAdapters.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR2\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR,\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0 0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR2\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007R \u0010+\u001a\b\u0012\u0004\u0012\u00020(0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u000eR \u0010/\u001a\b\u0012\u0004\u0012\u00020,0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000eR \u00103\u001a\b\u0012\u0004\u0012\u0002000\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR \u00107\u001a\b\u0012\u0004\u0012\u0002040\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\f\u001a\u0004\b6\u0010\u000e¨\u0006:"}, d2 = {"Lokhttp3/tls/internal/der/CertificateAdapters;", "", "Lokhttp3/tls/internal/der/DerAdapter;", "", "a", "Lokhttp3/tls/internal/der/DerAdapter;", "getTime$okhttp_tls", "()Lokhttp3/tls/internal/der/DerAdapter;", "time", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "c", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "getAlgorithmIdentifier$okhttp_tls", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "algorithmIdentifier", "", "e", "getGeneralNameDnsName$okhttp_tls", "generalNameDnsName", "Lokio/ByteString;", "f", "getGeneralNameIpAddress$okhttp_tls", "generalNameIpAddress", "Lkotlin/Pair;", "g", "getGeneralName$okhttp_tls", "generalName", "Lokhttp3/tls/internal/der/Extension;", "i", "getExtension$okhttp_tls", "extension", "", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "j", "getRdnSequence$okhttp_tls", "rdnSequence", "k", "getName$okhttp_tls", "name", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "l", "getSubjectPublicKeyInfo$okhttp_tls", "subjectPublicKeyInfo", "Lokhttp3/tls/internal/der/TbsCertificate;", "m", "getTbsCertificate$okhttp_tls", "tbsCertificate", "Lokhttp3/tls/internal/der/Certificate;", "n", "getCertificate$okhttp_tls", "certificate", "Lokhttp3/tls/internal/der/PrivateKeyInfo;", "o", "getPrivateKeyInfo$okhttp_tls", "privateKeyInfo", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class CertificateAdapters {
    public static final CertificateAdapters INSTANCE = new CertificateAdapters();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CertificateAdapters$time$1 f86243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DerAdapter<Object> f86244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<AlgorithmIdentifier> algorithmIdentifier;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BasicDerAdapter<BasicConstraints> f86246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<String> generalNameDnsName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<ByteString> generalNameIpAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final DerAdapter<Pair<DerAdapter<?>, Object>> generalName;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BasicDerAdapter<List<Pair<DerAdapter<?>, Object>>> f86250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<Extension> extension;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<List<List<AttributeTypeAndValue>>> rdnSequence;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final DerAdapter<Pair<DerAdapter<?>, Object>> name;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<SubjectPublicKeyInfo> subjectPublicKeyInfo;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<TbsCertificate> tbsCertificate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<Certificate> certificate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<PrivateKeyInfo> privateKeyInfo;

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class a extends Lambda implements Function1<AlgorithmIdentifier, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f86257p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(AlgorithmIdentifier algorithmIdentifier) {
            AlgorithmIdentifier it = algorithmIdentifier;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(it.getAlgorithm(), it.getParameters());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class b extends Lambda implements Function1<List<?>, AlgorithmIdentifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f86258p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final AlgorithmIdentifier invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj != null) {
                return new AlgorithmIdentifier((String) obj, it.get(1));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class c extends Lambda implements Function1<Object, DerAdapter<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f86259p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final DerAdapter<?> invoke(Object obj) {
            if (Intrinsics.areEqual(obj, ObjectIdentifiers.sha256WithRSAEncryption)) {
                return Adapters.INSTANCE.getNULL();
            }
            if (Intrinsics.areEqual(obj, ObjectIdentifiers.rsaEncryption)) {
                return Adapters.INSTANCE.getNULL();
            }
            if (Intrinsics.areEqual(obj, ObjectIdentifiers.ecPublicKey)) {
                return Adapters.INSTANCE.getOBJECT_IDENTIFIER();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class d extends Lambda implements Function1<AttributeTypeAndValue, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f86260p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(AttributeTypeAndValue attributeTypeAndValue) {
            AttributeTypeAndValue it = attributeTypeAndValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(it.getType(), it.getValue());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class e extends Lambda implements Function1<List<?>, AttributeTypeAndValue> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f86261p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final AttributeTypeAndValue invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj != null) {
                return new AttributeTypeAndValue((String) obj, it.get(1));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class f extends Lambda implements Function1<BasicConstraints, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f86262p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(BasicConstraints basicConstraints) {
            BasicConstraints it = basicConstraints;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(Boolean.valueOf(it.getCa()), it.getMaxIntermediateCas());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class g extends Lambda implements Function1<List<?>, BasicConstraints> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f86263p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final BasicConstraints invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj != null) {
                return new BasicConstraints(((Boolean) obj).booleanValue(), (Long) it.get(1));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class h extends Lambda implements Function1<Certificate, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f86264p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(Certificate certificate) {
            Certificate it = certificate;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(it.getTbsCertificate(), it.getSignatureAlgorithm(), it.getSignatureValue());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class i extends Lambda implements Function1<List<?>, Certificate> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f86265p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final Certificate invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.TbsCertificate");
            }
            TbsCertificate tbsCertificate = (TbsCertificate) obj;
            Object obj2 = it.get(1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) obj2;
            Object obj3 = it.get(2);
            if (obj3 != null) {
                return new Certificate(tbsCertificate, algorithmIdentifier, (BitString) obj3);
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class j extends Lambda implements Function1<Extension, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f86266p0 = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(Extension extension) {
            Extension it = extension;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(it.getId(), Boolean.valueOf(it.getCritical()), it.getValue());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class k extends Lambda implements Function1<List<?>, Extension> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f86267p0 = new k(1);

        @Override // kotlin.jvm.functions.Function1
        public final Extension invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            String str = (String) obj;
            Object obj2 = it.get(1);
            if (obj2 != null) {
                return new Extension(str, ((Boolean) obj2).booleanValue(), it.get(2));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class l extends Lambda implements Function1<Object, DerAdapter<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f86268p0 = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final DerAdapter<?> invoke(Object obj) {
            if (Intrinsics.areEqual(obj, ObjectIdentifiers.subjectAlternativeName)) {
                return CertificateAdapters.access$getSubjectAlternativeName$p(CertificateAdapters.INSTANCE);
            }
            if (Intrinsics.areEqual(obj, ObjectIdentifiers.basicConstraints)) {
                return CertificateAdapters.access$getBasicConstraints$p(CertificateAdapters.INSTANCE);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class m extends Lambda implements Function1<PrivateKeyInfo, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f86269p0 = new m(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(PrivateKeyInfo privateKeyInfo) {
            PrivateKeyInfo it = privateKeyInfo;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(Long.valueOf(it.getVersion()), it.getAlgorithmIdentifier(), it.getPrivateKey());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class n extends Lambda implements Function1<List<?>, PrivateKeyInfo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f86270p0 = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final PrivateKeyInfo invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = it.get(1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) obj2;
            Object obj3 = it.get(2);
            if (obj3 != null) {
                return new PrivateKeyInfo(jLongValue, algorithmIdentifier, (ByteString) obj3);
            }
            throw new NullPointerException("null cannot be cast to non-null type okio.ByteString");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class o extends Lambda implements Function1<SubjectPublicKeyInfo, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f86271p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(SubjectPublicKeyInfo subjectPublicKeyInfo) {
            SubjectPublicKeyInfo it = subjectPublicKeyInfo;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(it.getAlgorithm(), it.getSubjectPublicKey());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class p extends Lambda implements Function1<List<?>, SubjectPublicKeyInfo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f86272p0 = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final SubjectPublicKeyInfo invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) obj;
            Object obj2 = it.get(1);
            if (obj2 != null) {
                return new SubjectPublicKeyInfo(algorithmIdentifier, (BitString) obj2);
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class q extends Lambda implements Function1<TbsCertificate, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f86273p0 = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(TbsCertificate tbsCertificate) {
            TbsCertificate it = tbsCertificate;
            Intrinsics.checkNotNullParameter(it, "it");
            CertificateAdapters certificateAdapters = CertificateAdapters.INSTANCE;
            return CollectionsKt__CollectionsKt.listOf(Long.valueOf(it.getVersion()), it.getSerialNumber(), it.getSignature(), TuplesKt.to(certificateAdapters.getRdnSequence$okhttp_tls(), it.getIssuer()), it.getValidity(), TuplesKt.to(certificateAdapters.getRdnSequence$okhttp_tls(), it.getSubject()), it.getSubjectPublicKeyInfo(), it.getIssuerUniqueID(), it.getSubjectUniqueID(), it.getExtensions());
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class r extends Lambda implements Function1<List<?>, TbsCertificate> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f86274p0 = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final TbsCertificate invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = it.get(1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.math.BigInteger");
            }
            BigInteger bigInteger = (BigInteger) obj2;
            Object obj3 = it.get(2);
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) obj3;
            Object obj4 = it.get(3);
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<*, *>");
            }
            Object second = ((Pair) obj4).getSecond();
            if (second == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
            }
            List list2 = (List) second;
            Object obj5 = it.get(4);
            if (obj5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.Validity");
            }
            Validity validity = (Validity) obj5;
            Object obj6 = it.get(5);
            if (obj6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<*, *>");
            }
            Object second2 = ((Pair) obj6).getSecond();
            if (second2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
            }
            List list3 = (List) second2;
            Object obj7 = it.get(6);
            if (obj7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.SubjectPublicKeyInfo");
            }
            SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) obj7;
            BitString bitString = (BitString) it.get(7);
            BitString bitString2 = (BitString) it.get(8);
            Object obj8 = it.get(9);
            if (obj8 != null) {
                return new TbsCertificate(jLongValue, bigInteger, algorithmIdentifier, list2, validity, list3, subjectPublicKeyInfo, bitString, bitString2, (List) obj8);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.tls.internal.der.Extension>");
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class s extends Lambda implements Function1<Validity, List<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final s f86275p0 = new s(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(Validity validity) {
            Validity it = validity;
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(it.getNotBefore()), Long.valueOf(it.getNotAfter())});
        }
    }

    /* JADX INFO: compiled from: CertificateAdapters.kt */
    public static final class t extends Lambda implements Function1<List<?>, Validity> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final t f86276p0 = new t(1);

        @Override // kotlin.jvm.functions.Function1
        public final Validity invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = it.get(1);
            if (obj2 != null) {
                return new Validity(jLongValue, ((Long) obj2).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.tls.internal.der.CertificateAdapters$time$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static {
        ?? r1 = new DerAdapter<Long>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$time$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Long>> asSequenceOf(@NotNull String name2, int i10, long j10) {
                Intrinsics.checkNotNullParameter(name2, "name");
                return DerAdapter.DefaultImpls.asSequenceOf(this, name2, i10, j10);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Long>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public Long fromDer(@NotNull ByteString byteString) {
                Intrinsics.checkNotNullParameter(byteString, "byteString");
                return (Long) DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@NotNull DerHeader header) {
                Intrinsics.checkNotNullParameter(header, "header");
                Adapters adapters = Adapters.INSTANCE;
                return adapters.getUTC_TIME().matches(header) || adapters.getGENERALIZED_TIME().matches(header);
            }

            @NotNull
            public ByteString toDer(long j10) {
                return DerAdapter.DefaultImpls.toDer(this, Long.valueOf(j10));
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<Long> withExplicitBox(int i10, long j10, @Nullable Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i10, j10, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public /* bridge */ /* synthetic */ ByteString toDer(Long l6) {
                return toDer(l6.longValue());
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public /* bridge */ /* synthetic */ void toDer(DerWriter derWriter, Long l6) throws IOException {
                toDer(derWriter, l6.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public Long fromDer(@NotNull DerReader reader) throws IOException {
                long jLongValue;
                Intrinsics.checkNotNullParameter(reader, "reader");
                DerHeader derHeaderPeekHeader = reader.peekHeader();
                if (derHeaderPeekHeader != null) {
                    int tagClass = derHeaderPeekHeader.getTagClass();
                    Adapters adapters = Adapters.INSTANCE;
                    if (tagClass == adapters.getUTC_TIME().getTagClass() && derHeaderPeekHeader.getTag() == adapters.getUTC_TIME().getTag()) {
                        jLongValue = adapters.getUTC_TIME().fromDer(reader).longValue();
                    } else if (derHeaderPeekHeader.getTagClass() == adapters.getGENERALIZED_TIME().getTagClass() && derHeaderPeekHeader.getTag() == adapters.getGENERALIZED_TIME().getTag()) {
                        jLongValue = adapters.getGENERALIZED_TIME().fromDer(reader).longValue();
                    } else {
                        throw new ProtocolException("expected time but was " + derHeaderPeekHeader + " at " + reader);
                    }
                    return Long.valueOf(jLongValue);
                }
                throw new ProtocolException("expected time but was exhausted at " + reader);
            }

            public void toDer(@NotNull DerWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (-631152000000L <= value && 2524608000000L > value) {
                    Adapters.INSTANCE.getUTC_TIME().toDer(writer, Long.valueOf(value));
                } else {
                    Adapters.INSTANCE.getGENERALIZED_TIME().toDer(writer, Long.valueOf(value));
                }
            }
        };
        f86243a = r1;
        Adapters adapters = Adapters.INSTANCE;
        BasicDerAdapter basicDerAdapterSequence = adapters.sequence("Validity", new DerAdapter[]{r1, r1}, s.f86275p0, t.f86276p0);
        DerAdapter<Object> derAdapterUsingTypeHint = adapters.usingTypeHint(c.f86259p0);
        f86244b = derAdapterUsingTypeHint;
        BasicDerAdapter<AlgorithmIdentifier> basicDerAdapterSequence2 = adapters.sequence("AlgorithmIdentifier", new DerAdapter[]{adapters.getOBJECT_IDENTIFIER().asTypeHint(), derAdapterUsingTypeHint}, a.f86257p0, b.f86258p0);
        algorithmIdentifier = basicDerAdapterSequence2;
        BasicDerAdapter<Boolean> basicDerAdapter = adapters.getBOOLEAN();
        Boolean bool = Boolean.FALSE;
        f86246d = adapters.sequence("BasicConstraints", new DerAdapter[]{basicDerAdapter.optional(bool), BasicDerAdapter.optional$default(adapters.getINTEGER_AS_LONG(), null, 1, null)}, f.f86262p0, g.f86263p0);
        BasicDerAdapter<String> basicDerAdapterWithTag$default = BasicDerAdapter.withTag$default(adapters.getIA5_STRING(), 0, 2L, 1, null);
        generalNameDnsName = basicDerAdapterWithTag$default;
        BasicDerAdapter<ByteString> basicDerAdapterWithTag$default2 = BasicDerAdapter.withTag$default(adapters.getOCTET_STRING(), 0, 7L, 1, null);
        generalNameIpAddress = basicDerAdapterWithTag$default2;
        DerAdapter<Pair<DerAdapter<?>, Object>> derAdapterChoice = adapters.choice(basicDerAdapterWithTag$default, basicDerAdapterWithTag$default2, adapters.getANY_VALUE());
        generalName = derAdapterChoice;
        f86250h = DerAdapter.DefaultImpls.asSequenceOf$default(derAdapterChoice, null, 0, 0L, 7, null);
        BasicDerAdapter<Extension> basicDerAdapterSequence3 = adapters.sequence("Extension", new DerAdapter[]{adapters.getOBJECT_IDENTIFIER().asTypeHint(), adapters.getBOOLEAN().optional(bool), adapters.usingTypeHint(l.f86268p0).withExplicitBox(adapters.getOCTET_STRING().getTagClass(), adapters.getOCTET_STRING().getTag(), bool)}, j.f86266p0, k.f86267p0);
        extension = basicDerAdapterSequence3;
        BasicDerAdapter<List<List<AttributeTypeAndValue>>> basicDerAdapterAsSequenceOf$default = DerAdapter.DefaultImpls.asSequenceOf$default(adapters.sequence("AttributeTypeAndValue", new DerAdapter[]{adapters.getOBJECT_IDENTIFIER(), Adapters.any$default(adapters, new Pair[]{TuplesKt.to(Reflection.getOrCreateKotlinClass(String.class), adapters.getUTF8_STRING()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), adapters.getPRINTABLE_STRING()), TuplesKt.to(Reflection.getOrCreateKotlinClass(AnyValue.class), adapters.getANY_VALUE())}, false, null, 6, null)}, d.f86260p0, e.f86261p0).asSetOf(), null, 0, 0L, 7, null);
        rdnSequence = basicDerAdapterAsSequenceOf$default;
        DerAdapter<Pair<DerAdapter<?>, Object>> derAdapterChoice2 = adapters.choice(basicDerAdapterAsSequenceOf$default);
        name = derAdapterChoice2;
        BasicDerAdapter<SubjectPublicKeyInfo> basicDerAdapterSequence4 = adapters.sequence("SubjectPublicKeyInfo", new DerAdapter[]{basicDerAdapterSequence2, adapters.getBIT_STRING()}, o.f86271p0, p.f86272p0);
        subjectPublicKeyInfo = basicDerAdapterSequence4;
        BasicDerAdapter<TbsCertificate> basicDerAdapterSequence5 = adapters.sequence("TBSCertificate", new DerAdapter[]{DerAdapter.DefaultImpls.withExplicitBox$default(adapters.getINTEGER_AS_LONG(), 0, 0L, null, 5, null).optional(0L), adapters.getINTEGER_AS_BIG_INTEGER(), basicDerAdapterSequence2, derAdapterChoice2, basicDerAdapterSequence, derAdapterChoice2, basicDerAdapterSequence4, BasicDerAdapter.optional$default(BasicDerAdapter.withTag$default(adapters.getBIT_STRING(), 0, 1L, 1, null), null, 1, null), BasicDerAdapter.optional$default(BasicDerAdapter.withTag$default(adapters.getBIT_STRING(), 0, 2L, 1, null), null, 1, null), DerAdapter.DefaultImpls.withExplicitBox$default(DerAdapter.DefaultImpls.asSequenceOf$default(basicDerAdapterSequence3, null, 0, 0L, 7, null), 0, 3L, null, 5, null).optional(CollectionsKt__CollectionsKt.emptyList())}, q.f86273p0, r.f86274p0);
        tbsCertificate = basicDerAdapterSequence5;
        certificate = adapters.sequence("Certificate", new DerAdapter[]{basicDerAdapterSequence5, basicDerAdapterSequence2, adapters.getBIT_STRING()}, h.f86264p0, i.f86265p0);
        privateKeyInfo = adapters.sequence("PrivateKeyInfo", new DerAdapter[]{adapters.getINTEGER_AS_LONG(), basicDerAdapterSequence2, adapters.getOCTET_STRING()}, m.f86269p0, n.f86270p0);
    }

    public static final /* synthetic */ BasicDerAdapter access$getBasicConstraints$p(CertificateAdapters certificateAdapters) {
        return f86246d;
    }

    public static final /* synthetic */ BasicDerAdapter access$getSubjectAlternativeName$p(CertificateAdapters certificateAdapters) {
        return f86250h;
    }

    @NotNull
    public final BasicDerAdapter<AlgorithmIdentifier> getAlgorithmIdentifier$okhttp_tls() {
        return algorithmIdentifier;
    }

    @NotNull
    public final BasicDerAdapter<Certificate> getCertificate$okhttp_tls() {
        return certificate;
    }

    @NotNull
    public final BasicDerAdapter<Extension> getExtension$okhttp_tls() {
        return extension;
    }

    @NotNull
    public final DerAdapter<Pair<DerAdapter<?>, Object>> getGeneralName$okhttp_tls() {
        return generalName;
    }

    @NotNull
    public final BasicDerAdapter<String> getGeneralNameDnsName$okhttp_tls() {
        return generalNameDnsName;
    }

    @NotNull
    public final BasicDerAdapter<ByteString> getGeneralNameIpAddress$okhttp_tls() {
        return generalNameIpAddress;
    }

    @NotNull
    public final DerAdapter<Pair<DerAdapter<?>, Object>> getName$okhttp_tls() {
        return name;
    }

    @NotNull
    public final BasicDerAdapter<PrivateKeyInfo> getPrivateKeyInfo$okhttp_tls() {
        return privateKeyInfo;
    }

    @NotNull
    public final BasicDerAdapter<List<List<AttributeTypeAndValue>>> getRdnSequence$okhttp_tls() {
        return rdnSequence;
    }

    @NotNull
    public final BasicDerAdapter<SubjectPublicKeyInfo> getSubjectPublicKeyInfo$okhttp_tls() {
        return subjectPublicKeyInfo;
    }

    @NotNull
    public final BasicDerAdapter<TbsCertificate> getTbsCertificate$okhttp_tls() {
        return tbsCertificate;
    }

    @NotNull
    public final DerAdapter<Long> getTime$okhttp_tls() {
        return f86243a;
    }
}
