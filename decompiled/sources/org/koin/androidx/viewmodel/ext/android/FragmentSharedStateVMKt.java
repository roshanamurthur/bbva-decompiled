package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FragmentSharedStateVM.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aq\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007j\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001ai\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\n\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u000e\b\n\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007j\u0004\u0018\u0001`\u0010H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001ar\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007j\u0004\u0018\u0001`\u0010H\u0007\u001aj\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0014\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\n\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u000e\b\n\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007j\u0004\u0018\u0001`\u0010H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"getSharedStateViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "clazz", "Lkotlin/reflect/KClass;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "sharedStateViewModel", "Lkotlin/Lazy;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FragmentSharedStateVMKt {

    /* JADX INFO: compiled from: FragmentSharedStateVM.kt */
    public static final class a extends Lambda implements Function0<FragmentActivity> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92232p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f92232p0 = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FragmentActivity invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.f92232p0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: compiled from: FragmentSharedStateVM.kt */
    public static final class b extends Lambda implements Function0<FragmentActivity> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92233p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f92233p0 = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FragmentActivity invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.f92233p0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FragmentSharedStateVM.kt */
    public static final class c<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92234p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92235q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Bundle> f92236r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStoreOwner> f92237s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ KClass<T> f92238t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92239u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Fragment fragment, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ViewModelStoreOwner> function1, KClass<T> kClass, Function0<? extends ParametersHolder> function2) {
            super(0);
            this.f92234p0 = fragment;
            this.f92235q0 = qualifier;
            this.f92236r0 = function0;
            this.f92237s0 = function1;
            this.f92238t0 = kClass;
            this.f92239u0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FragmentSharedStateVMKt.getSharedStateViewModel(this.f92234p0, this.f92235q0, this.f92236r0, this.f92237s0, this.f92238t0, this.f92239u0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$sharedStateViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentSharedStateVM.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentSharedStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentSharedStateVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentSharedStateVMKt$sharedStateViewModel$2\n+ 2 FragmentSharedStateVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentSharedStateVMKt\n*L\n1#1,101:1\n75#2,5:102\n73#2,6:107\n*S KotlinDebug\n*F\n+ 1 FragmentSharedStateVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentSharedStateVMKt$sharedStateViewModel$2\n*L\n46#1:102,5\n46#1:107,6\n*E\n"})
    public static final class AnonymousClass2<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92242p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92243q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Bundle> f92244r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStoreOwner> f92245s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92246t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Fragment fragment, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ViewModelStoreOwner> function1, Function0<? extends ParametersHolder> function2) {
            super(0);
            this.f92242p0 = fragment;
            this.f92243q0 = qualifier;
            this.f92244r0 = function0;
            this.f92245s0 = function1;
            this.f92246t0 = function2;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            Qualifier qualifier = this.f92243q0;
            Function0<ParametersHolder> function0 = this.f92246t0;
            ViewModelStore viewModelStore = this.f92245s0.invoke().getViewModelStore();
            Bundle bundleInvoke = this.f92244r0.invoke();
            Fragment fragment = this.f92242p0;
            CreationExtras extras = BundleExtKt.toExtras(bundleInvoke, fragment);
            if (extras == null) {
                extras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(extras, "this.defaultViewModelCreationExtras");
            }
            CreationExtras creationExtras = extras;
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function0);
        }
    }

    @Deprecated(message = "Use Fragment.getActivityViewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> T getSharedStateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewModelStore viewModelStore = owner.invoke().getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras(state.invoke(), fragment);
        if (extras == null) {
            extras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "this.defaultViewModelCreationExtras");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, extras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function0);
    }

    public static /* synthetic */ ViewModel getSharedStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        Function0 state = (i10 & 2) != 0 ? ScopeExtKt.emptyState() : function0;
        Function0 owner = (i10 & 4) != 0 ? new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt.getSharedStateViewModel.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FragmentActivity invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return fragmentActivityRequireActivity;
            }
        } : function1;
        Function0 function3 = (i10 & 8) != 0 ? null : function2;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) owner.invoke()).getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras((Bundle) state.invoke(), fragment);
        if (extras == null) {
            extras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "this.defaultViewModelCreationExtras");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, extras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function3);
    }

    @Deprecated(message = "Use Fragment.activityViewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> sharedStateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier, state, owner, function0));
    }

    public static /* synthetic */ Lazy sharedStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        if ((i10 & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        Function0 state = function0;
        if ((i10 & 4) != 0) {
            function1 = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt.sharedStateViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        Function0 owner = function1;
        Function0 function3 = (i10 & 8) != 0 ? null : function2;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier2, state, owner, function3));
    }

    @Deprecated(message = "Use Fragment.activityViewModel() with extras: CreationExtras")
    @MainThread
    @NotNull
    public static final <T extends ViewModel> Lazy<T> sharedStateViewModel(@NotNull Fragment fragment, @Nullable Qualifier qualifier, @NotNull Function0<Bundle> state, @NotNull Function0<? extends ViewModelStoreOwner> owner, @NotNull KClass<T> clazz, @Nullable Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new c(fragment, qualifier, state, owner, clazz, function0));
    }

    @Deprecated(message = "Use Fragment.getActivityViewModel() with extras: CreationExtras")
    @MainThread
    @NotNull
    public static final <T extends ViewModel> T getSharedStateViewModel(@NotNull Fragment fragment, @Nullable Qualifier qualifier, @NotNull Function0<Bundle> state, @NotNull Function0<? extends ViewModelStoreOwner> owner, @NotNull KClass<T> clazz, @Nullable Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ViewModelStore viewModelStore = owner.invoke().getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras(state.invoke(), fragment);
        if (extras == null) {
            extras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "this.defaultViewModelCreationExtras");
        }
        return (T) GetViewModelKt.resolveViewModel(clazz, viewModelStore, (4 & 4) != 0 ? null : null, extras, (4 & 16) != 0 ? null : qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), (4 & 64) != 0 ? null : function0);
    }

    public static /* synthetic */ Lazy sharedStateViewModel$default(Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, KClass kClass, Function0 function2, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        if ((i10 & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        Function0 function3 = function0;
        if ((i10 & 4) != 0) {
            function1 = new b(fragment);
        }
        return sharedStateViewModel(fragment, qualifier2, function3, function1, kClass, (i10 & 16) != 0 ? null : function2);
    }

    public static /* synthetic */ ViewModel getSharedStateViewModel$default(Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, KClass kClass, Function0 function2, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        if ((i10 & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        Function0 function3 = function0;
        if ((i10 & 4) != 0) {
            function1 = new a(fragment);
        }
        return getSharedStateViewModel(fragment, qualifier2, function3, function1, kClass, (i10 & 16) != 0 ? null : function2);
    }
}
