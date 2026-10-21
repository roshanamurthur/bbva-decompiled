package org.koin.android.scope;

import android.app.Service;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ServiceExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n*\u00020\u0002¨\u0006\u000b"}, d2 = {"createScope", "Lorg/koin/core/scope/Scope;", "Landroid/app/Service;", "source", "", "createServiceScope", "destroyServiceScope", "", "getScopeOrNull", "serviceScope", "Lkotlin/Lazy;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ServiceExtKt {

    /* JADX INFO: compiled from: ServiceExt.kt */
    public static final class a extends Lambda implements Function0<Scope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Service f92082p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Service service) {
            super(0);
            this.f92082p0 = service;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return ServiceExtKt.createServiceScope(this.f92082p0);
        }
    }

    @KoinInternalApi
    @NotNull
    public static final Scope createScope(@NotNull Service service, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        return ComponentCallbackExtKt.getKoin(service).createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), obj);
    }

    public static /* synthetic */ Scope createScope$default(Service service, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return createScope(service, obj);
    }

    @NotNull
    public static final Scope createServiceScope(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        if (!(service instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
        }
        Koin koin = ComponentCallbackExtKt.getKoin(service);
        Scope scopeOrNull = koin.getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
        return scopeOrNull == null ? koin.createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), service) : scopeOrNull;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void destroyServiceScope(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        if (!(service instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Service should implement AndroidScopeComponent".toString());
        }
        ((AndroidScopeComponent) service).getScope().close();
    }

    @KoinInternalApi
    @Nullable
    public static final Scope getScopeOrNull(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        return ComponentCallbackExtKt.getKoin(service).getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
    }

    @NotNull
    public static final Lazy<Scope> serviceScope(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        return LazyKt__LazyJVMKt.lazy(new a(service));
    }
}
