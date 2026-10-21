package org.koin.core.component;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: KoinComponent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001aP\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"get", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/koin/core/component/KoinComponent;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/component/KoinComponent;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n+ 3 Koin.kt\norg/koin/core/Koin\n*L\n1#1,71:1\n133#2:72\n133#2:74\n107#3:73\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n46#1:72\n47#1:74\n47#1:73\n*E\n"})
public final class KoinComponentKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.component.KoinComponentKt$inject$1, reason: invalid class name */
    /* JADX INFO: compiled from: KoinComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,71:1\n45#2,2:72\n47#2:75\n133#3:74\n107#4:76\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n61#1:72,2\n61#1:75\n61#1:74\n61#1:76\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f92317p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92318q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92319r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(KoinComponent koinComponent, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f92317p0 = koinComponent;
            this.f92318q0 = qualifier;
            this.f92319r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            KoinComponent koinComponent = this.f92317p0;
            boolean z10 = koinComponent instanceof KoinScopeComponent;
            Qualifier qualifier = this.f92318q0;
            Function0<ParametersHolder> function0 = this.f92319r0;
            Scope scope = z10 ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    public static final /* synthetic */ <T> T get(KoinComponent koinComponent, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        if (koinComponent instanceof KoinScopeComponent) {
            Scope scope = ((KoinScopeComponent) koinComponent).getScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
        Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(KoinComponent koinComponent, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        if (koinComponent instanceof KoinScopeComponent) {
            Scope scope = ((KoinScopeComponent) koinComponent).getScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
        Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static final /* synthetic */ <T> Lazy<T> inject(KoinComponent koinComponent, Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new AnonymousClass1(koinComponent, qualifier, function0));
    }

    public static /* synthetic */ Lazy inject$default(KoinComponent koinComponent, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            mode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new AnonymousClass1(koinComponent, qualifier, function0));
    }
}
