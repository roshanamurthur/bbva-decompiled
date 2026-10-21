package org.koin.androidx.viewmodel.ext.android;

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
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FragmentSharedVM.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007j\u0004\u0018\u0001`\rH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001ah\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007j\u0004\u0018\u0001`\rH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"getSharedViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "owner", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "sharedViewModel", "Lkotlin/Lazy;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FragmentSharedVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentSharedVMKt$sharedViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentSharedVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentSharedVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentSharedVMKt$sharedViewModel$2\n+ 2 FragmentSharedVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentSharedVMKt\n*L\n1#1,62:1\n56#2,5:63\n54#2,6:68\n*S KotlinDebug\n*F\n+ 1 FragmentSharedVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentSharedVMKt$sharedViewModel$2\n*L\n42#1:63,5\n42#1:68,6\n*E\n"})
    public static final class AnonymousClass2<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92249p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92250q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStoreOwner> f92251r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<CreationExtras> f92252s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92253t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> function0, Function0<? extends CreationExtras> function1, Function0<? extends ParametersHolder> function2) {
            super(0);
            this.f92249p0 = fragment;
            this.f92250q0 = qualifier;
            this.f92251r0 = function0;
            this.f92252s0 = function1;
            this.f92253t0 = function2;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            CreationExtras defaultViewModelCreationExtras;
            Qualifier qualifier = this.f92250q0;
            Function0<ParametersHolder> function0 = this.f92253t0;
            ViewModelStore viewModelStore = this.f92251r0.invoke().getViewModelStore();
            Fragment fragment = this.f92249p0;
            Function0<CreationExtras> function1 = this.f92252s0;
            if (function1 == null || (defaultViewModelCreationExtras = function1.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            }
            CreationExtras creationExtras = defaultViewModelCreationExtras;
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function0);
        }
    }

    @Deprecated(message = "Use Fragment.getActivityViewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> T getSharedViewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function1) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewModelStore viewModelStore = owner.invoke().getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
            defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        }
        CreationExtras creationExtras = defaultViewModelCreationExtras;
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function1);
    }

    public static /* synthetic */ ViewModel getSharedViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        CreationExtras defaultViewModelCreationExtras;
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        Function0 owner = (i10 & 2) != 0 ? new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedVMKt.getSharedViewModel.1
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
        } : function0;
        Function0 function3 = (i10 & 4) != 0 ? null : function1;
        Function0 function4 = (i10 & 8) != 0 ? null : function2;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) owner.invoke()).getViewModelStore();
        if (function3 == null || (defaultViewModelCreationExtras = (CreationExtras) function3.invoke()) == null) {
            defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        }
        CreationExtras creationExtras = defaultViewModelCreationExtras;
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function4);
    }

    @Deprecated(message = "Use Fragment.activityViewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> sharedViewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier, owner, function0, function1));
    }

    public static /* synthetic */ Lazy sharedViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, Function0 function2, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        if ((i10 & 2) != 0) {
            function0 = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedVMKt.sharedViewModel.1
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
        Function0 owner = function0;
        Function0 function3 = (i10 & 4) != 0 ? null : function1;
        Function0 function4 = (i10 & 8) != 0 ? null : function2;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier2, owner, function3, function4));
    }
}
