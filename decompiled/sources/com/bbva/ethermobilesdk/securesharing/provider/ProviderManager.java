package com.bbva.ethermobilesdk.securesharing.provider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m7.a;
import m7.b;
import m7.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Provider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/provider/ProviderManager;", "", "Landroid/content/Context;", "context", "", "Landroid/content/pm/ProviderInfo;", "get", "<init>", "()V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class ProviderManager {

    @NotNull
    public static final ProviderManager INSTANCE = new ProviderManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f29968a = new d(new a(new b(null)));

    @NotNull
    public final List<ProviderInfo> get(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<ProviderInfo> listA = f29968a.a(context);
        return listA == null ? CollectionsKt__CollectionsKt.emptyList() : listA;
    }
}
