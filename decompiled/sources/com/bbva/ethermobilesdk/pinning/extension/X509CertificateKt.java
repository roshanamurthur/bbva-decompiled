package com.bbva.ethermobilesdk.pinning.extension;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: X509Certificate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"getSubjectAlternativeNamesBy", "", "", "Ljava/security/cert/X509Certificate;", "hostname", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nX509Certificate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 X509Certificate.kt\ncom/bbva/ethermobilesdk/pinning/extension/X509CertificateKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n766#2:20\n857#2,2:21\n1549#2:23\n1620#2,3:24\n*S KotlinDebug\n*F\n+ 1 X509Certificate.kt\ncom/bbva/ethermobilesdk/pinning/extension/X509CertificateKt\n*L\n13#1:20\n13#1:21,2\n14#1:23\n14#1:24,3\n*E\n"})
public final class X509CertificateKt {
    @NotNull
    public static final List<String> getSubjectAlternativeNamesBy(@NotNull X509Certificate x509Certificate, @NotNull String hostname) {
        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            int i10 = StringKt.isAnIPAddress(hostname) ? 7 : 2;
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : subjectAlternativeNames) {
                    Object obj2 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) obj2).intValue() == i10) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object obj3 = ((List) it.next()).get(1);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    arrayList2.add((String) obj3);
                }
                List<String> list = CollectionsKt___CollectionsKt.toList(arrayList2);
                if (list != null) {
                    return list;
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        } catch (Exception unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
