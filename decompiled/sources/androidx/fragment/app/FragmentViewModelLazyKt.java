package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aD\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"activityViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "createViewModelLazy", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "viewModels", "ownerProducer", "Landroidx/lifecycle/ViewModelStoreOwner;", "fragment-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FragmentViewModelLazyKt {

    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    public static final class a extends Lambda implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f21650p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f21650p0 = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.f21650p0.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f21651p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.f21651p0 = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.f21651p0.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2 extends Lambda implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f21652p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.f21652p0 = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.f21652p0.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C05602 extends Lambda implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStoreOwner> f21654p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05602(Function0<? extends ViewModelStoreOwner> function0) {
            super(0);
            this.f21654p0 = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.f21654p0.invoke().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass3 extends Lambda implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<ViewModelStoreOwner> f21655p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Fragment f21656q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<? extends ViewModelStoreOwner> function0, Fragment fragment) {
            super(0);
            this.f21655p0 = function0;
            this.f21656q0 = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner viewModelStoreOwnerInvoke = this.f21655p0.invoke();
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerInvoke instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerInvoke : null;
            ViewModelProvider.Factory defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory() : null;
            if (defaultViewModelProviderFactory == null) {
                defaultViewModelProviderFactory = this.f21656q0.getDefaultViewModelProviderFactory();
            }
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> activityViewModels(Fragment fragment, Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment);
        if (function0 == null) {
            function0 = new AnonymousClass2(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, anonymousClass1, function0);
    }

    public static /* synthetic */ Lazy activityViewModels$default(Fragment fragment, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment);
        if (function0 == null) {
            function0 = new AnonymousClass2(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, anonymousClass1, function0);
    }

    @MainThread
    @NotNull
    public static final <VM extends ViewModel> Lazy<VM> createViewModelLazy(@NotNull Fragment fragment, @NotNull KClass<VM> viewModelClass, @NotNull Function0<? extends ViewModelStore> storeProducer, @Nullable Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        if (function0 == null) {
            function0 = new a(fragment);
        }
        return new ViewModelLazy(viewModelClass, storeProducer, function0);
    }

    public static /* synthetic */ Lazy createViewModelLazy$default(Fragment fragment, KClass kClass, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function1);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(Fragment fragment, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C05602 c05602 = new C05602(ownerProducer);
        if (function0 == null) {
            function0 = new AnonymousClass3(ownerProducer, fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c05602, function0);
    }

    public static /* synthetic */ Lazy viewModels$default(final Fragment fragment, Function0 ownerProducer, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ownerProducer = new Function0<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
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
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C05602 c05602 = new C05602(ownerProducer);
        if (function0 == null) {
            function0 = new AnonymousClass3(ownerProducer, fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c05602, function0);
    }
}
