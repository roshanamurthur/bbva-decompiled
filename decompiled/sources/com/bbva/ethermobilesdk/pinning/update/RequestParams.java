package com.bbva.ethermobilesdk.pinning.update;

import bk.q;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/update/RequestParams;", "", "params", "", "", "(Ljava/util/Map;)V", "toBase64String", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRequestParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestParams.kt\ncom/bbva/ethermobilesdk/pinning/update/RequestParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n*S KotlinDebug\n*F\n+ 1 RequestParams.kt\ncom/bbva/ethermobilesdk/pinning/update/RequestParams\n*L\n13#1:21\n13#1:22,3\n*E\n"})
public final class RequestParams {

    @NotNull
    private final Map<String, String> params;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String toBase64String() {
        Set<String> setKeySet = this.params.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
        for (String str : setKeySet) {
            String str2 = this.params.get(str);
            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(TuplesKt.to(str, str2));
        }
        byte[] bytes = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, new Function1<Pair<? extends String, ? extends String>, CharSequence>() { // from class: com.bbva.ethermobilesdk.pinning.update.RequestParams.toBase64String.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends String> pair) {
                return invoke2((Pair<String, String>) pair);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Pair<String, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String first = it.getFirst();
                byte[] bytes2 = it.getSecond().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                return ((Object) first) + "=" + EncodingUtilsKt.toBase64(bytes2);
            }
        }, 30, null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return EncodingUtilsKt.toBase64(bytes);
    }

    public RequestParams(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public /* synthetic */ RequestParams(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.emptyMap() : map);
    }
}
