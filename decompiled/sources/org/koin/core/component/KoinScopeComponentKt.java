package org.koin.core.component;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: KoinScopeComponent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u000b\"\b\b\u0000\u0010\u0002*\u00020\u0005*\u0002H\u0002¢\u0006\u0002\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u0002*\u00020\u0005*\u0002H\u0002¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\b\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\t¨\u0006\u0013"}, d2 = {"createScope", "Lorg/koin/core/scope/Scope;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/component/KoinScopeComponent;", "source", "", "(Lorg/koin/core/component/KoinScopeComponent;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getOrCreateScope", "Lkotlin/Lazy;", "(Lorg/koin/core/component/KoinScopeComponent;)Lkotlin/Lazy;", "getScopeId", "", "(Ljava/lang/Object;)Ljava/lang/String;", "getScopeName", "Lorg/koin/core/qualifier/TypeQualifier;", "(Ljava/lang/Object;)Lorg/koin/core/qualifier/TypeQualifier;", "getScopeOrNull", "(Lorg/koin/core/component/KoinScopeComponent;)Lorg/koin/core/scope/Scope;", "newScope", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KoinScopeComponentKt {

    /* JADX INFO: compiled from: KoinScopeComponent.kt */
    public static final class a extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KoinScopeComponent f92320p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public a(KoinScopeComponent koinScopeComponent) {
            super(0);
            this.f92320p0 = koinScopeComponent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            KoinScopeComponent koinScopeComponent = this.f92320p0;
            Scope scopeOrNull = KoinScopeComponentKt.getScopeOrNull(koinScopeComponent);
            return scopeOrNull == null ? KoinScopeComponentKt.createScope$default(koinScopeComponent, null, 1, null) : scopeOrNull;
        }
    }

    /* JADX INFO: compiled from: KoinScopeComponent.kt */
    public static final class b extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KoinScopeComponent f92321p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public b(KoinScopeComponent koinScopeComponent) {
            super(0);
            this.f92321p0 = koinScopeComponent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return KoinScopeComponentKt.createScope$default(this.f92321p0, null, 1, null);
        }
    }

    @NotNull
    public static final <T extends KoinScopeComponent> Scope createScope(@NotNull T t10, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return t10.getKoin().createScope(getScopeId(t10), getScopeName(t10), obj);
    }

    public static /* synthetic */ Scope createScope$default(KoinScopeComponent koinScopeComponent, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return createScope(koinScopeComponent, obj);
    }

    @NotNull
    public static final <T extends KoinScopeComponent> Lazy<Scope> getOrCreateScope(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return LazyKt__LazyJVMKt.lazy(new a(t10));
    }

    @NotNull
    public static final <T> String getScopeId(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(t10.getClass())) + '@' + t10.hashCode();
    }

    @NotNull
    public static final <T> TypeQualifier getScopeName(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(t10.getClass()));
    }

    @Nullable
    public static final <T extends KoinScopeComponent> Scope getScopeOrNull(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return t10.getKoin().getScopeOrNull(getScopeId(t10));
    }

    @NotNull
    public static final <T extends KoinScopeComponent> Lazy<Scope> newScope(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        return LazyKt__LazyJVMKt.lazy(new b(t10));
    }
}
