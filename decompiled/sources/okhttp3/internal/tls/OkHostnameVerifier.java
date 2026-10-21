package okhttp3.internal.tls;

import androidx.room.a;
import androidx.webkit.ProxyConfig;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "", "host", "Ljavax/net/ssl/SSLSession;", "session", "", "verify", "Ljava/security/cert/X509Certificate;", "certificate", "", "allSubjectAltNames", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
public final class OkHostnameVerifier implements HostnameVerifier {

    @NotNull
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public final List<String> allSubjectAltNames(@NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt___CollectionsKt.plus((Collection) a(certificate, 7), (Iterable) a(certificate, 2));
    }

    public final boolean verify(@NotNull String host, @NotNull X509Certificate certificate) {
        int length;
        String host2 = host;
        Intrinsics.checkNotNullParameter(host2, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (Util.canParseAsIpAddress(host)) {
            String canonicalHost = HostnamesKt.toCanonicalHost(host);
            List listA = a(certificate, 7);
            if ((listA instanceof Collection) && listA.isEmpty()) {
                return false;
            }
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                }
            }
            return false;
        }
        if (host.length() == ((int) Utf8.size$default(host2, 0, 0, 3, null))) {
            Locale locale = Locale.US;
            host2 = a.d(locale, "US", host2, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(certificate, 2);
        if ((listA2 instanceof Collection) && listA2.isEmpty()) {
            return false;
        }
        for (String strD : listA2) {
            INSTANCE.getClass();
            if (host2 != null && host2.length() != 0 && !l.startsWith$default(host2, Constant.DOT_STRING, false, 2, null) && !l.endsWith$default(host2, "..", false, 2, null) && strD != null && strD.length() != 0 && !l.startsWith$default(strD, Constant.DOT_STRING, false, 2, null) && !l.endsWith$default(strD, "..", false, 2, null)) {
                String strConcat = !l.endsWith$default(host2, Constant.DOT_STRING, false, 2, null) ? host2.concat(Constant.DOT_STRING) : host2;
                if (!l.endsWith$default(strD, Constant.DOT_STRING, false, 2, null)) {
                    strD = strD.concat(Constant.DOT_STRING);
                }
                if (strD.length() == ((int) Utf8.size$default(strD, 0, 0, 3, null))) {
                    Locale locale2 = Locale.US;
                    strD = a.d(locale2, "US", strD, locale2, "this as java.lang.String).toLowerCase(locale)");
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) strD, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null)) {
                    if (l.startsWith$default(strD, "*.", false, 2, null) && StringsKt__StringsKt.indexOf$default((CharSequence) strD, '*', 1, false, 4, (Object) null) == -1 && strConcat.length() >= strD.length() && !Intrinsics.areEqual("*.", strD)) {
                        String strSubstring = strD.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (l.endsWith$default(strConcat, strSubstring, false, 2, null) && ((length = strConcat.length() - strSubstring.length()) <= 0 || StringsKt__StringsKt.lastIndexOf$default((CharSequence) strConcat, '.', length - 1, false, 4, (Object) null) == -1)) {
                        }
                    }
                } else if (Intrinsics.areEqual(strConcat, strD)) {
                }
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!(host.length() == ((int) Utf8.size$default(host, 0, 0, 3, null)))) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
