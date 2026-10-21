package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
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
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ActivityStateVM.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aY\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\n\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001aZ\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\n\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\fH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"getStateViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "state", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/activity/ComponentActivity;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "stateViewModel", "Lkotlin/Lazy;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ActivityStateVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.ActivityStateVMKt$stateViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityStateVM.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nActivityStateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityStateVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityStateVMKt$stateViewModel$1\n+ 2 ActivityStateVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityStateVMKt\n*L\n1#1,63:1\n56#2,5:64\n54#2,6:69\n*S KotlinDebug\n*F\n+ 1 ActivityStateVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityStateVMKt$stateViewModel$1\n*L\n42#1:64,5\n42#1:69,6\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f92217p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92218q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Bundle> f92219r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92220s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.f92217p0 = componentActivity;
            this.f92218q0 = qualifier;
            this.f92219r0 = function0;
            this.f92220s0 = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            Qualifier qualifier = this.f92218q0;
            Function0<ParametersHolder> function0 = this.f92220s0;
            ComponentActivity componentActivity = this.f92217p0;
            ViewModelStore viewModelStore = componentActivity.getViewModelStore();
            CreationExtras extras = BundleExtKt.toExtras(this.f92219r0.invoke(), componentActivity);
            if (extras == null) {
                extras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(extras, "this.defaultViewModelCreationExtras");
            }
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, extras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function0);
        }
    }

    @Deprecated(message = "Use ComponentActivity.getViewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> T getStateViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras(state.invoke(), componentActivity);
        if (extras == null) {
            extras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "this.defaultViewModelCreationExtras");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        return (T) GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, extras, (4 & 16) != 0 ? null : qualifier, koinScope, (4 & 64) != 0 ? null : function0);
    }

    public static /* synthetic */ ViewModel getStateViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 state, Function0 function0, int i10, Object obj) {
        Qualifier qualifier2 = (i10 & 1) != 0 ? null : qualifier;
        if ((i10 & 2) != 0) {
            state = ScopeExtKt.emptyState();
        }
        Function0 function1 = (i10 & 4) != 0 ? null : function0;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras((Bundle) state.invoke(), componentActivity);
        if (extras == null) {
            extras = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "this.defaultViewModelCreationExtras");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, extras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function1);
    }

    @Deprecated(message = "Use ComponentActivity.viewModel() with extras: CreationExtras")
    @MainThread
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> stateViewModel(ComponentActivity componentActivity, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, state, function0));
    }

    public static /* synthetic */ Lazy stateViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, Function0 state, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            state = ScopeExtKt.emptyState();
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(componentActivity, qualifier, state, function0));
    }
}
