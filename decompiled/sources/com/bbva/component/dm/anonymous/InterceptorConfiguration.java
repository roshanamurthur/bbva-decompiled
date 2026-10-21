package com.bbva.component.dm.anonymous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InterceptorConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/anonymous/InterceptorConfiguration;", "", "", "a", "Ljava/lang/String;", "getAuthHeaderName", "()Ljava/lang/String;", "authHeaderName", "", "Lkotlin/text/Regex;", "b", "Ljava/util/List;", "getWhiteList", "()Ljava/util/List;", "whiteList", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component-dm-anonymous_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInterceptorConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorConfiguration.kt\ncom/bbva/component/dm/anonymous/InterceptorConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,6:1\n1549#2:7\n1620#2,3:8\n*S KotlinDebug\n*F\n+ 1 InterceptorConfiguration.kt\ncom/bbva/component/dm/anonymous/InterceptorConfiguration\n*L\n4#1:7\n4#1:8,3\n*E\n"})
public final class InterceptorConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authHeaderName;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f27433b;

    public InterceptorConfiguration(@NotNull List<String> whiteList, @NotNull String authHeaderName) {
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(authHeaderName, "authHeaderName");
        this.authHeaderName = authHeaderName;
        List<String> list = whiteList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Regex((String) it.next()));
        }
        this.f27433b = arrayList;
    }

    @NotNull
    public final String getAuthHeaderName() {
        return this.authHeaderName;
    }

    @NotNull
    public final List<Regex> getWhiteList() {
        return this.f27433b;
    }
}
