package com.bbva.component.dm.analytics.usecase;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CookieCriteria.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"matches", "", "", "Lcom/bbva/component/dm/analytics/usecase/CookieCriteria;", "cookie", "Lkotlin/Pair;", "", "component-dm-analytics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCookieCriteria.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieCriteria.kt\ncom/bbva/component/dm/analytics/usecase/CookieCriteriaKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1747#2,3:19\n*S KotlinDebug\n*F\n+ 1 CookieCriteria.kt\ncom/bbva/component/dm/analytics/usecase/CookieCriteriaKt\n*L\n17#1:19,3\n*E\n"})
public final class CookieCriteriaKt {
    public static final boolean matches(@NotNull List<? extends CookieCriteria> list, @NotNull Pair<String, String> cookie) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        List<? extends CookieCriteria> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((CookieCriteria) it.next()).meetsCriteria(cookie)) {
                return true;
            }
        }
        return false;
    }
}
