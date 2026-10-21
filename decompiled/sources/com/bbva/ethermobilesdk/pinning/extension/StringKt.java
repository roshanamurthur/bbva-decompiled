package com.bbva.ethermobilesdk.pinning.extension;

import android.util.Base64;
import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.catalog.MatchType;
import com.bbva.ethermobilesdk.pinning.tools.InetAddressToolsKt;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0003H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0003H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0003H\u0000¨\u0006\u0015"}, d2 = {"acceptableCountryWildcard", "", "cn", "", "deleteLineBreak", "deleteXmlSpaces", "dotCount", "", "isAWildcard", "isAnIP", "isAnIPAddress", "matchHostWith", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/MatchType;", "validHost", "normaliseIPV6Address", "toLastModifiedDate", "Ljava/util/Date;", "toPublicKey", "Ljava/security/PublicKey;", "toX509Certificate", "Ljava/security/cert/X509Certificate;", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/bbva/ethermobilesdk/pinning/extension/StringKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,109:1\n1099#2,3:110\n*S KotlinDebug\n*F\n+ 1 String.kt\ncom/bbva/ethermobilesdk/pinning/extension/StringKt\n*L\n55#1:110,3\n*E\n"})
public final class StringKt {
    private static final boolean acceptableCountryWildcard(String str) {
        List<String> listSplit = new Regex("\\.").split(str, 0);
        return (listSplit.size() == 3 && listSplit.get(2).length() == 2 && CollectionsKt__CollectionsKt.binarySearch$default(ConstantKt.getBAD_COUNTRY_2LDS(), listSplit.get(1), 0, 0, 6, (Object) null) >= 0) ? false : true;
    }

    @NotNull
    public static final String deleteLineBreak(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("\\n").replace(str, "");
    }

    @NotNull
    public static final String deleteXmlSpaces(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex(">\\s*<").replace(str, "><");
    }

    public static final int dotCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '.') {
                i10++;
            }
        }
        return i10;
    }

    public static final boolean isAWildcard(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List<String> listSplit = new Regex("\\.").split(str, 0);
        return listSplit.size() >= 3 && l.endsWith$default(listSplit.get(0), ProxyConfig.MATCH_ALL_SCHEMES, false, 2, null) && acceptableCountryWildcard(str) && !z10;
    }

    public static final boolean isAnIPAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return InetAddressToolsKt.isIPv4Address(str) || InetAddressToolsKt.isIPv6Address(str);
    }

    @NotNull
    public static final MatchType matchHostWith(@NotNull String str, @NotNull String validHost) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(validHost, "validHost");
        if (Intrinsics.areEqual(str, validHost)) {
            return MatchType.SITE;
        }
        return Pattern.compile(l.replace$default(l.replace$default(validHost, Constant.DOT_STRING, "\\.", false, 4, (Object) null), ProxyConfig.MATCH_ALL_SCHEMES, ".*", false, 4, (Object) null)).matcher(str).matches() ? MatchType.WILDCARD : MatchType.NO_MATCH;
    }

    @NotNull
    public static final String normaliseIPV6Address(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = StringsKt__StringsKt.trim((CharSequence) str).toString();
        Locale LOCALE = ConstantKt.getLOCALE();
        Intrinsics.checkNotNullExpressionValue(LOCALE, "LOCALE");
        String lowerCase = string.toLowerCase(LOCALE);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (InetAddressToolsKt.isIPv6Address(str)) {
            try {
                lowerCase = InetAddress.getByName(lowerCase).getHostAddress();
            } catch (UnknownHostException unused) {
            }
            Intrinsics.checkNotNullExpressionValue(lowerCase, "{\n        try {\n        …  trimmed\n        }\n    }");
        }
        return lowerCase;
    }

    @Nullable
    public static final Date toLastModifiedDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH).parse(str);
    }

    @NotNull
    public static final PublicKey toPublicKey(@NotNull String str) throws InvalidKeySpecException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(EncodingUtilsKt.base64ToByteArray(str)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(x509EncodedKeySpec)");
        return publicKeyGeneratePublic;
    }

    @NotNull
    public static final X509Certificate toX509Certificate(@NotNull String str) throws CertificateException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() == 0) {
                throw new CertificateException("Certificate is empty.");
            }
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(Base64.decode(new Regex("[\\s\n\r\t]").replace(str, ""), 0)));
            X509Certificate x509Certificate = certificateGenerateCertificate instanceof X509Certificate ? (X509Certificate) certificateGenerateCertificate : null;
            if (x509Certificate != null) {
                return x509Certificate;
            }
            throw new CertificateException();
        } catch (Throwable th2) {
            LoggerKt.logError(th2);
            throw new CertificateException("Failed to parse certificate.", th2);
        }
    }
}
