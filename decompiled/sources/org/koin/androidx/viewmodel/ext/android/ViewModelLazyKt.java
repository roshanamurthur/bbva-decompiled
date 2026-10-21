package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0080\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rj\u0004\u0018\u0001`\u0014H\u0007\u001a|\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rj\u0004\u0018\u0001`\u0014H\u0007\u001a\u0082\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rj\u0004\u0018\u0001`\u0014H\u0007¨\u0006\u0018"}, d2 = {"getLazyViewModelForClass", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "clazz", "Lkotlin/reflect/KClass;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "scope", "Lorg/koin/core/scope/Scope;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "key", "", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "viewModelForClass", "Landroidx/activity/ComponentActivity;", "Landroidx/fragment/app/Fragment;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ViewModelLazyKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ViewModelLazy.kt */
    public static final class a<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Bundle> f92268p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewModelStoreOwner f92269q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ KClass<T> f92270r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ViewModelStore f92271s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f92272t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92273u0;
        public final /* synthetic */ Scope v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92274w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<Bundle> function0, ViewModelStoreOwner viewModelStoreOwner, KClass<T> kClass, ViewModelStore viewModelStore, String str, Qualifier qualifier, Scope scope, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.f92268p0 = function0;
            this.f92269q0 = viewModelStoreOwner;
            this.f92270r0 = kClass;
            this.f92271s0 = viewModelStore;
            this.f92272t0 = str;
            this.f92273u0 = qualifier;
            this.v0 = scope;
            this.f92274w0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras extras;
            Bundle bundleInvoke;
            Function0<Bundle> function0 = this.f92268p0;
            if (function0 == null || (bundleInvoke = function0.invoke()) == null || (extras = BundleExtKt.toExtras(bundleInvoke, this.f92269q0)) == null) {
                extras = CreationExtras.Empty.INSTANCE;
            }
            return GetViewModelKt.resolveViewModel(this.f92270r0, this.f92271s0, this.f92272t0, extras, this.f92273u0, this.v0, this.f92274w0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ViewModelLazy.kt */
    public static final class b<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Bundle> f92275p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewModelStoreOwner f92276q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f92277r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ KClass<T> f92278s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ViewModelStore f92279t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f92280u0;
        public final /* synthetic */ Qualifier v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92281w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<Bundle> function0, ViewModelStoreOwner viewModelStoreOwner, ComponentActivity componentActivity, KClass<T> kClass, ViewModelStore viewModelStore, String str, Qualifier qualifier, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.f92275p0 = function0;
            this.f92276q0 = viewModelStoreOwner;
            this.f92277r0 = componentActivity;
            this.f92278s0 = kClass;
            this.f92279t0 = viewModelStore;
            this.f92280u0 = str;
            this.v0 = qualifier;
            this.f92281w0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras extras;
            Bundle bundleInvoke;
            Function0<Bundle> function0 = this.f92275p0;
            if (function0 == null || (bundleInvoke = function0.invoke()) == null || (extras = BundleExtKt.toExtras(bundleInvoke, this.f92276q0)) == null) {
                extras = CreationExtras.Empty.INSTANCE;
            }
            return GetViewModelKt.resolveViewModel(this.f92278s0, this.f92279t0, this.f92280u0, extras, this.v0, AndroidKoinScopeExtKt.getKoinScope(this.f92277r0), this.f92281w0);
        }
    }

    /* JADX INFO: compiled from: ViewModelLazy.kt */
    public static final class c extends Lambda implements Function0<Fragment> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92282p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f92282p0 = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f92282p0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ViewModelLazy.kt */
    public static final class d<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStoreOwner> f92283p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Bundle> f92284q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92285r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ KClass<T> f92286s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f92287t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92288u0;
        public final /* synthetic */ Function0<ParametersHolder> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, KClass kClass, Qualifier qualifier, Function0 function0, Function0 function1, String str, Function0 function2) {
            super(0);
            this.f92283p0 = function0;
            this.f92284q0 = function1;
            this.f92285r0 = fragment;
            this.f92286s0 = kClass;
            this.f92287t0 = str;
            this.f92288u0 = qualifier;
            this.v0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras extras;
            Bundle bundleInvoke;
            ViewModelStoreOwner viewModelStoreOwnerInvoke = this.f92283p0.invoke();
            ViewModelStore viewModelStore = viewModelStoreOwnerInvoke.getViewModelStore();
            Function0<Bundle> function0 = this.f92284q0;
            if (function0 == null || (bundleInvoke = function0.invoke()) == null || (extras = BundleExtKt.toExtras(bundleInvoke, viewModelStoreOwnerInvoke)) == null) {
                extras = CreationExtras.Empty.INSTANCE;
            }
            return GetViewModelKt.resolveViewModel(this.f92286s0, viewModelStore, this.f92287t0, extras, this.f92288u0, AndroidKoinScopeExtKt.getKoinScope(this.f92285r0), this.v0);
        }
    }

    @MainThread
    @NotNull
    public static final <T extends ViewModel> Lazy<T> getLazyViewModelForClass(@NotNull KClass<T> clazz, @NotNull ViewModelStoreOwner owner, @NotNull Scope scope, @Nullable Qualifier qualifier, @Nullable Function0<Bundle> function0, @Nullable String str, @Nullable Function0<? extends ParametersHolder> function1) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a(function0, owner, clazz, owner.getViewModelStore(), str, qualifier, scope, function1));
    }

    public static /* synthetic */ Lazy getLazyViewModelForClass$default(KClass kClass, ViewModelStoreOwner viewModelStoreOwner, Scope scope, Qualifier qualifier, Function0 function0, String str, Function0 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            scope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        }
        return getLazyViewModelForClass(kClass, viewModelStoreOwner, scope, (i10 & 8) != 0 ? null : qualifier, (i10 & 16) != 0 ? null : function0, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : function1);
    }

    @MainThread
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModelForClass(@NotNull ComponentActivity componentActivity, @NotNull KClass<T> clazz, @Nullable Qualifier qualifier, @NotNull ViewModelStoreOwner owner, @Nullable Function0<Bundle> function0, @Nullable String str, @Nullable Function0<? extends ParametersHolder> function1) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new b(function0, owner, componentActivity, clazz, owner.getViewModelStore(), str, qualifier, function1));
    }

    @MainThread
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModelForClass(@NotNull Fragment fragment, @NotNull KClass<T> clazz, @Nullable Qualifier qualifier, @NotNull Function0<? extends ViewModelStoreOwner> owner, @Nullable Function0<Bundle> function0, @Nullable String str, @Nullable Function0<? extends ParametersHolder> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(owner, "owner");
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new d(fragment, clazz, qualifier, owner, function0, str, function1));
    }
}
