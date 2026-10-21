package org.koin.androidx.viewmodel;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.factory.KoinViewModelFactory;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: GetViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001at\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007H\u0007\u001am\u0010\u0013\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007j\u0004\u0018\u0001`\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"lazyResolveViewModel", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "vmClass", "Lkotlin/reflect/KClass;", "viewModelStore", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "key", "", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "scope", "Lorg/koin/core/scope/Scope;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "resolveViewModel", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/ViewModelStore;Ljava/lang/String;Landroidx/lifecycle/viewmodel/CreationExtras;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class GetViewModelKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: GetViewModel.kt */
    public static final class a<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KClass<T> f92157p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStore> f92158q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f92159r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<CreationExtras> f92160s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92161t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Scope f92162u0;
        public final /* synthetic */ Function0<ParametersHolder> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(KClass<T> kClass, Function0<? extends ViewModelStore> function0, String str, Function0<? extends CreationExtras> function1, Qualifier qualifier, Scope scope, Function0<? extends ParametersHolder> function2) {
            super(0);
            this.f92157p0 = kClass;
            this.f92158q0 = function0;
            this.f92159r0 = str;
            this.f92160s0 = function1;
            this.f92161t0 = qualifier;
            this.f92162u0 = scope;
            this.v0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GetViewModelKt.resolveViewModel(this.f92157p0, this.f92158q0.invoke(), this.f92159r0, this.f92160s0.invoke(), this.f92161t0, this.f92162u0, this.v0);
        }
    }

    @KoinInternalApi
    @MainThread
    @NotNull
    public static final <T extends ViewModel> Lazy<T> lazyResolveViewModel(@NotNull KClass<T> vmClass, @NotNull Function0<? extends ViewModelStore> viewModelStore, @Nullable String str, @NotNull Function0<? extends CreationExtras> extras, @Nullable Qualifier qualifier, @NotNull Scope scope, @Nullable Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(vmClass, "vmClass");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a(vmClass, viewModelStore, str, extras, qualifier, scope, function0));
    }

    @KoinInternalApi
    @NotNull
    public static final <T extends ViewModel> T resolveViewModel(@NotNull KClass<T> vmClass, @NotNull ViewModelStore viewModelStore, @Nullable String str, @NotNull CreationExtras extras, @Nullable Qualifier qualifier, @NotNull Scope scope, @Nullable Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(vmClass, "vmClass");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Class<T> javaClass = JvmClassMappingKt.getJavaClass((KClass) vmClass);
        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStore, new KoinViewModelFactory(vmClass, scope, qualifier, function0), extras);
        if (qualifier != null) {
            return (T) viewModelProvider.get(qualifier.getValue(), javaClass);
        }
        return str != null ? (T) viewModelProvider.get(str, javaClass) : (T) viewModelProvider.get(javaClass);
    }
}
