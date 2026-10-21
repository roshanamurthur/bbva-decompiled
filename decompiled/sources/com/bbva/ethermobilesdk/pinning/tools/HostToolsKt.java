package com.bbva.ethermobilesdk.pinning.tools;

import com.bbva.ethermobilesdk.cipher.extension.X509CertificateKt;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.ethermobilesdk.pinning.extension.ExceptionKt;
import com.bbva.ethermobilesdk.pinning.extension.StringKt;
import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HostTools.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a&\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\rH\u0002¨\u0006\u000e"}, d2 = {"matchHostname", "", "hostName", "", "commonName", "matchWildCard", "isAIP", "strictWithSubdomain", "verifyHost", "host", "certificate", "Ljava/security/cert/X509Certificate;", "commonNamesFormatted", "", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHostTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostTools.kt\ncom/bbva/ethermobilesdk/pinning/tools/HostToolsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1549#2:84\n1620#2,3:85\n1747#2,3:88\n1559#2:91\n1590#2,4:92\n*S KotlinDebug\n*F\n+ 1 HostTools.kt\ncom/bbva/ethermobilesdk/pinning/tools/HostToolsKt\n*L\n37#1:84\n37#1:85,3\n38#1:88,3\n80#1:91\n80#1:92,4\n*E\n"})
public final class HostToolsKt {
    private static final String commonNamesFormatted(List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add("<" + ((String) obj) + "> " + (CollectionsKt__CollectionsKt.getLastIndex(list) != i10 ? "OR" : ""));
            i10 = i11;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
    }

    private static final boolean matchHostname(String str, String str2) {
        return Intrinsics.areEqual(str, StringKt.normaliseIPV6Address(str2));
    }

    public static final boolean matchWildCard(@NotNull String hostName, @NotNull String commonName, boolean z10, boolean z11) {
        boolean zEndsWith$default;
        Intrinsics.checkNotNullParameter(hostName, "hostName");
        Intrinsics.checkNotNullParameter(commonName, "commonName");
        if (!StringKt.isAWildcard(commonName, z10)) {
            return false;
        }
        String str = new Regex("\\.").split(commonName, 0).get(0);
        if (str.length() > 0) {
            String strSubstring = str.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = commonName.substring(str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String strSubstring3 = hostName.substring(strSubstring.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            zEndsWith$default = l.startsWith$default(hostName, strSubstring, false, 2, null) && l.endsWith$default(strSubstring3, strSubstring2, false, 2, null);
        } else {
            String strSubstring4 = commonName.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
            zEndsWith$default = l.endsWith$default(hostName, strSubstring4, false, 2, null);
        }
        if (zEndsWith$default && z11) {
            return StringKt.dotCount(hostName) == StringKt.dotCount(commonName);
        }
        return zEndsWith$default;
    }

    public static final boolean verifyHost(@NotNull String host, @NotNull X509Certificate certificate, boolean z10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        List<String> listCommonNames = X509CertificateKt.commonNames(certificate);
        List<String> subjectAlternativeNamesBy = com.bbva.ethermobilesdk.pinning.extension.X509CertificateKt.getSubjectAlternativeNamesBy(certificate, host);
        if (listCommonNames.isEmpty() && subjectAlternativeNamesBy.isEmpty()) {
            ExceptionKt.throwError$default(new ErrorType.HostCommonNameNotFound(host), (Throwable) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        boolean zIsAnIPAddress = StringKt.isAnIPAddress(host);
        String strNormaliseIPV6Address = StringKt.normaliseIPV6Address(host);
        ArrayList<String> arrayList = new ArrayList();
        if (!listCommonNames.isEmpty()) {
            arrayList.add(CollectionsKt___CollectionsKt.first((List) listCommonNames));
        }
        arrayList.addAll(subjectAlternativeNamesBy);
        ArrayList<String> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (String str : arrayList) {
            Locale LOCALE = ConstantKt.getLOCALE();
            Intrinsics.checkNotNullExpressionValue(LOCALE, "LOCALE");
            String lowerCase = str.toLowerCase(LOCALE);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            arrayList2.add(lowerCase);
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                if (matchHostname(strNormaliseIPV6Address, str2) || matchWildCard(strNormaliseIPV6Address, str2, zIsAnIPAddress, z10)) {
                    return true;
                }
            }
        }
        ExceptionKt.throwError$default(new ErrorType.HostNoMatch(host, commonNamesFormatted(arrayList)), (Throwable) null, 2, (Object) null);
        throw new KotlinNothingValueException();
    }
}
