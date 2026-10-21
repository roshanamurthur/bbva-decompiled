package com.bbva.component.dm.analytics.usecase;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CleanCookiesUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/analytics/usecase/CleanCookiesParams;", "", "", "Lcom/bbva/component/dm/analytics/usecase/CookieCriteria;", "a", "Ljava/util/List;", "getCriteria", "()Ljava/util/List;", "criteria", "", "b", "Z", "getPropagate", "()Z", "propagate", "<init>", "(Ljava/util/List;Z)V", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class CleanCookiesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<CookieCriteria> criteria;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean propagate;

    /* JADX WARN: Multi-variable type inference failed */
    public CleanCookiesParams(@NotNull List<? extends CookieCriteria> criteria, boolean z10) {
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        this.criteria = criteria;
        this.propagate = z10;
    }

    @NotNull
    public final List<CookieCriteria> getCriteria() {
        return this.criteria;
    }

    public final boolean getPropagate() {
        return this.propagate;
    }

    public /* synthetic */ CleanCookiesParams(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
