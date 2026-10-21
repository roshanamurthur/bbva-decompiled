package com.bbva.component.request.headers;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeaderAccessIdInterceptorConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/request/headers/HeaderAccessIdInterceptorConfig;", "", "", "", "a", "Ljava/util/List;", "getAllowList", "()Ljava/util/List;", "allowList", "<init>", "(Ljava/util/List;)V", "header-access-id_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class HeaderAccessIdInterceptorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> allowList;

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderAccessIdInterceptorConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final List<String> getAllowList() {
        return this.allowList;
    }

    public HeaderAccessIdInterceptorConfig(@NotNull List<String> allowList) {
        Intrinsics.checkNotNullParameter(allowList, "allowList");
        this.allowList = allowList;
    }

    public /* synthetic */ HeaderAccessIdInterceptorConfig(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
