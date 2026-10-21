package com.bbva.component.ic.security.utils;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0000\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0000¨\u0006\b"}, d2 = {"toSecurityType", "Lcom/bbva/component/ic/security/utils/SecurityType;", "", "isIn", "", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "mapToSecurityType", "component-ic-security_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/bbva/component/ic/security/utils/StringExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1#2:19\n1#2:30\n1611#3,9:20\n1863#3:29\n1864#3:31\n1620#3:32\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/bbva/component/ic/security/utils/StringExtensionsKt\n*L\n16#1:30\n16#1:20,9\n16#1:29\n16#1:31\n16#1:32\n*E\n"})
public final class StringExtensionsKt {
    public static final boolean isIn(@NotNull List<? extends SecurityType> list, @NotNull List<? extends SecurityType> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "list");
        return !CollectionsKt___CollectionsKt.intersect(list, list2).isEmpty();
    }

    @NotNull
    public static final List<SecurityType> mapToSecurityType(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            SecurityType securityType = toSecurityType((String) it.next());
            if (securityType != null) {
                arrayList.add(securityType);
            }
        }
        return arrayList;
    }

    @Nullable
    public static final SecurityType toSecurityType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (SecurityType securityType : SecurityType.values()) {
            if (Intrinsics.areEqual(str, securityType.getAuthenticationType())) {
                return securityType;
            }
        }
        return null;
    }
}
