package com.bbva.component.request.headers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InterceptorConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B=\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/request/headers/InterceptorConfig;", "", "", "", "a", "Ljava/util/Map;", "getHeadersMap", "()Ljava/util/Map;", "headersMap", "", "Lkotlin/text/Regex;", "b", "Ljava/util/List;", "getAllowList", "()Ljava/util/List;", "allowList", "c", "getDenyList", "denyList", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "request-headers_release"}, k = 1, mv = {1, 9, 0})
public final class InterceptorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headersMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Regex> allowList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Regex> denyList;

    public InterceptorConfig() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final List<Regex> getAllowList() {
        return this.allowList;
    }

    @NotNull
    public final List<Regex> getDenyList() {
        return this.denyList;
    }

    @NotNull
    public final Map<String, String> getHeadersMap() {
        return this.headersMap;
    }

    public InterceptorConfig(@NotNull Map<String, String> headersMap, @NotNull List<Regex> allowList, @NotNull List<Regex> denyList) {
        Intrinsics.checkNotNullParameter(headersMap, "headersMap");
        Intrinsics.checkNotNullParameter(allowList, "allowList");
        Intrinsics.checkNotNullParameter(denyList, "denyList");
        this.headersMap = headersMap;
        this.allowList = allowList;
        this.denyList = denyList;
    }

    public /* synthetic */ InterceptorConfig(Map map, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
