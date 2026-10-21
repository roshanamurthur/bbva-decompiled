package com.bbva.component.dm.analytics.usecase;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CookieCriteria.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/analytics/usecase/RegexCookieCriteria;", "Lcom/bbva/component/dm/analytics/usecase/CookieCriteria;", "Lkotlin/Pair;", "", "cookie", "", "meetsCriteria", "Lkotlin/text/Regex;", "regex", "<init>", "(Lkotlin/text/Regex;)V", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class RegexCookieCriteria implements CookieCriteria {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Regex f27420a;

    public RegexCookieCriteria(@NotNull Regex regex) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.f27420a = regex;
    }

    @Override // com.bbva.component.dm.analytics.usecase.CookieCriteria
    public boolean meetsCriteria(@NotNull Pair<String, String> cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return this.f27420a.matches(cookie.getFirst());
    }
}
