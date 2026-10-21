package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
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
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FragmentStateVM.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001ai\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\n\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u000e\b\n\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aj\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0011\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\n\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u000e\b\n\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000eH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"getStateViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "stateViewModel", "Lkotlin/Lazy;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FragmentStateVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt$stateViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentStateVM.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentStateVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentStateVMKt$stateViewModel$2\n+ 2 FragmentStateVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentStateVMKt\n*L\n1#1,63:1\n57#2,5:64\n55#2,6:69\n*S KotlinDebug\n*F\n+ 1 FragmentStateVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentStateVMKt$stateViewModel$2\n*L\n43#1:64,5\n43#1:69,6\n*E\n"})
    public static final class AnonymousClass2<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92256p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92257q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Bundle> f92258r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStoreOwner> f92259s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92260t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Fragment fragment, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ViewModelStoreOwner> function1, Function0<? extends ParametersHolder> function2) {
            super(0);
            this.f92256p0 = fragment;
            this.f92257q0 = qualifier;
            this.f92258r0 = function0;
            this.f92259s0 = function1;
            this.f92260t0 = function2;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            Qualifier qualifier = this.f92257q0;
            Function0<ParametersHolder> function0 = this.f92260t0;
            ViewModelStore viewModelStore = this.f92259s0.invoke().getViewModelStore();
            Bundle bundleInvoke = this.f92258r0.invoke();
            Fragment fragment = this.f92256p0;
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

    @Deprecated(message = "Use Fragment.getViewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> T getStateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) {
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

    public static /* synthetic */ ViewModel getStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        Function0 state = (i10 & 2) != 0 ? ScopeExtKt.emptyState() : function0;
        Function0 owner = (i10 & 4) != 0 ? new Function0<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt.getStateViewModel.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return fragment;
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

    @Deprecated(message = "Use Fragment.viewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> stateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier, state, owner, function0));
    }

    public static /* synthetic */ Lazy stateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        if ((i10 & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        Function0 state = function0;
        if ((i10 & 4) != 0) {
            function1 = new Function0<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt.stateViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Fragment invoke() {
                    return fragment;
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
}
