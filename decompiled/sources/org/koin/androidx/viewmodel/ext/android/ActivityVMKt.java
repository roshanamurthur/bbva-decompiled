package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
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
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ActivityVM.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aQ\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\n\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aR\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\n\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"getViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "extrasProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "(Landroidx/activity/ComponentActivity;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ActivityVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.ActivityVMKt$viewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityVM.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nActivityVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt$viewModel$1\n+ 2 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n*L\n1#1,74:1\n66#2,5:75\n64#2,6:80\n*S KotlinDebug\n*F\n+ 1 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt$viewModel$1\n*L\n47#1:75,5\n47#1:80,6\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f92221p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92222q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<CreationExtras> f92223r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92224s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.f92221p0 = componentActivity;
            this.f92222q0 = qualifier;
            this.f92223r0 = function0;
            this.f92224s0 = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            CreationExtras defaultViewModelCreationExtras;
            Qualifier qualifier = this.f92222q0;
            Function0<ParametersHolder> function0 = this.f92224s0;
            ComponentActivity componentActivity = this.f92221p0;
            ViewModelStore viewModelStore = componentActivity.getViewModelStore();
            Function0<CreationExtras> function1 = this.f92223r0;
            if (function1 == null || (defaultViewModelCreationExtras = function1.invoke()) == null) {
                defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            }
            CreationExtras creationExtras = defaultViewModelCreationExtras;
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function0);
        }
    }

    @MainThread
    public static final /* synthetic */ <T extends ViewModel> T getViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function1) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = function0.invoke()) == null) {
            defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        }
        CreationExtras creationExtras = defaultViewModelCreationExtras;
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        return (T) GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function1);
    }

    public static /* synthetic */ ViewModel getViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function1, int i10, Object obj) {
        CreationExtras defaultViewModelCreationExtras;
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Function0 function2 = (i10 & 4) != 0 ? null : function1;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        if (function0 == null || (defaultViewModelCreationExtras = (CreationExtras) function0.invoke()) == null) {
            defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        }
        CreationExtras creationExtras = defaultViewModelCreationExtras;
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function2);
    }

    @MainThread
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> viewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<? extends CreationExtras> function0, Function0<? extends ParametersHolder> function1) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, function0, function1));
    }

    public static /* synthetic */ Lazy viewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, function0, function1));
    }
}
