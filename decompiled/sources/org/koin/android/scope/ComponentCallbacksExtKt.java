package org.koin.android.scope;

import android.content.ComponentCallbacks;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ComponentCallbacksExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\t\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\t¨\u0006\r"}, d2 = {"createScope", "Lorg/koin/core/scope/Scope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/ComponentCallbacks;", "source", "", "(Landroid/content/ComponentCallbacks;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getOrCreateScope", "Lkotlin/Lazy;", "(Landroid/content/ComponentCallbacks;)Lkotlin/Lazy;", "getScopeOrNull", "(Landroid/content/ComponentCallbacks;)Lorg/koin/core/scope/Scope;", "newScope", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ComponentCallbacksExtKt {

    /* JADX INFO: compiled from: ComponentCallbacksExt.kt */
    public static final class a extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f92079p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public a(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f92079p0 = componentCallbacks;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            ComponentCallbacks componentCallbacks = this.f92079p0;
            Scope scopeOrNull = ComponentCallbacksExtKt.getScopeOrNull(componentCallbacks);
            return scopeOrNull == null ? ComponentCallbacksExtKt.createScope$default(componentCallbacks, null, 1, null) : scopeOrNull;
        }
    }

    /* JADX INFO: compiled from: ComponentCallbacksExt.kt */
    public static final class b extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f92080p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f92080p0 = componentCallbacks;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return ComponentCallbacksExtKt.createScope$default(this.f92080p0, null, 1, null);
        }
    }

    @NotNull
    public static final <T extends ComponentCallbacks> Scope createScope(@NotNull T t10, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return ComponentCallbackExtKt.getKoin(t10).createScope(KoinScopeComponentKt.getScopeId(t10), KoinScopeComponentKt.getScopeName(t10), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentCallbacks componentCallbacks, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return createScope(componentCallbacks, obj);
    }

    @NotNull
    public static final <T extends ComponentCallbacks> Lazy<Scope> getOrCreateScope(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return LazyKt__LazyJVMKt.lazy(new a(t10));
    }

    @Nullable
    public static final <T extends ComponentCallbacks> Scope getScopeOrNull(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return ComponentCallbackExtKt.getKoin(t10).getScopeOrNull(KoinScopeComponentKt.getScopeId(t10));
    }

    @NotNull
    public static final <T extends ComponentCallbacks> Lazy<Scope> newScope(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return LazyKt__LazyJVMKt.lazy(new b(t10));
    }
}
