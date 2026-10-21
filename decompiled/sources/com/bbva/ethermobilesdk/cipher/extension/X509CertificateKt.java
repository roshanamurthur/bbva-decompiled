package com.bbva.ethermobilesdk.cipher.extension;

import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: X509Certificate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"commonNames", "", "", "Ljava/security/cert/X509Certificate;", "id", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class X509CertificateKt {

    /* JADX INFO: compiled from: X509Certificate.kt */
    public static final class a extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29303p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt__StringsKt.trim((CharSequence) it).toString();
        }
    }

    /* JADX INFO: compiled from: X509Certificate.kt */
    public static final class b extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f29304p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.length() > 3);
        }
    }

    /* JADX INFO: compiled from: X509Certificate.kt */
    public static final class c extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f29305p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            String strSubstring = it.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return Boolean.valueOf(l.equals(strSubstring, "CN=", true));
        }
    }

    /* JADX INFO: compiled from: X509Certificate.kt */
    public static final class d extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f29306p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt__StringsKt.removePrefix(it, (CharSequence) "CN=");
        }
    }

    @NotNull
    public static final List<String> commonNames(@NotNull X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
        String string = x509Certificate.getSubjectX500Principal().toString();
        Intrinsics.checkNotNullExpressionValue(string, "subjectX500Principal.toString()");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null)), a.f29303p0), b.f29304p0), c.f29305p0), d.f29306p0));
    }

    @NotNull
    public static final String id(@NotNull X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
        return x509Certificate.getIssuerDN().getName() + Constant.DASH_STRING + x509Certificate.getSerialNumber();
    }
}
