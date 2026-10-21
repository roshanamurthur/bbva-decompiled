package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
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
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ComponentCallbackExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0003\u001aP\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\n\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"get", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/content/ComponentCallbacks;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getKoin", "Lorg/koin/core/Koin;", "inject", "Lkotlin/Lazy;", "mode", "Lkotlin/LazyThreadSafetyMode;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nComponentCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n133#2:59\n*S KotlinDebug\n*F\n+ 1 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n*L\n56#1:59\n*E\n"})
public final class ComponentCallbackExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.android.ext.android.ComponentCallbackExtKt$inject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComponentCallbackExt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nComponentCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt$inject$1\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n56#2:59\n133#3:60\n*S KotlinDebug\n*F\n+ 1 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt$inject$1\n*L\n44#1:59\n44#1:60\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f92072p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92073q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92074r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f92072p0 = componentCallbacks;
            this.f92073q0 = qualifier;
            this.f92074r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(this.f92072p0);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) koinScope.get(Reflection.getOrCreateKotlinClass(Object.class), this.f92073q0, this.f92074r0);
        }
    }

    public static final /* synthetic */ <T> T get(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) koinScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return koinScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    @NotNull
    public static final Koin getKoin(@NotNull ComponentCallbacks componentCallbacks) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        return componentCallbacks instanceof KoinComponent ? ((KoinComponent) componentCallbacks).getKoin() : GlobalContext.INSTANCE.get();
    }

    public static final /* synthetic */ <T> Lazy<T> inject(ComponentCallbacks componentCallbacks, Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    public static /* synthetic */ Lazy inject$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new AnonymousClass1(componentCallbacks, qualifier, function0));
    }
}
