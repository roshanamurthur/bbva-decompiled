package org.koin.androidx.scope;

import android.content.ComponentCallbacks;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.c;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeCallback;

/* JADX INFO: compiled from: ComponentActivityExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0003\u001a\u0018\u0010\u0007\u001a\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0014\u0010\n\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0002*\u00020\u0003\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¨\u0006\u0012"}, d2 = {"activityRetainedScope", "Lkotlin/Lazy;", "Lorg/koin/core/scope/Scope;", "Landroidx/activity/ComponentActivity;", "activityScope", "createActivityRetainedScope", "createActivityScope", "createScope", "source", "", "createScopeForCurrentLifecycle", "Landroid/content/ComponentCallbacks;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "getScopeOrNull", "registerScopeForLifecycle", "", "scope", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nComponentActivityExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentActivityExt.kt\norg/koin/androidx/scope/ComponentActivityExtKt\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,96:1\n75#2,13:97\n*S KotlinDebug\n*F\n+ 1 ComponentActivityExt.kt\norg/koin/androidx/scope/ComponentActivityExtKt\n*L\n90#1:97,13\n*E\n"})
public final class ComponentActivityExtKt {

    /* JADX INFO: compiled from: ComponentActivityExt.kt */
    public static final class a extends Lambda implements Function0<Scope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f92133p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f92133p0 = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return ComponentActivityExtKt.createActivityRetainedScope(this.f92133p0);
        }
    }

    /* JADX INFO: compiled from: ComponentActivityExt.kt */
    public static final class b extends Lambda implements Function0<Scope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f92134p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f92134p0 = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return ComponentActivityExtKt.createActivityScope(this.f92134p0);
        }
    }

    @NotNull
    public static final Lazy<Scope> activityRetainedScope(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return LazyKt__LazyJVMKt.lazy(new a(componentActivity));
    }

    @NotNull
    public static final Lazy<Scope> activityScope(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return LazyKt__LazyJVMKt.lazy(new b(componentActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Scope createActivityRetainedScope(@NotNull final ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (!(componentActivity instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        final Function0 function0 = null;
        ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(Reflection.getOrCreateKotlinClass(ScopeHandlerViewModel.class), new Function0<ViewModelStore>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = componentActivity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }).getValue();
        if (scopeHandlerViewModel.getScope() == null) {
            scopeHandlerViewModel.setScope(Koin.createScope$default(ComponentCallbackExtKt.getKoin(componentActivity), KoinScopeComponentKt.getScopeId(componentActivity), KoinScopeComponentKt.getScopeName(componentActivity), null, 4, null));
        }
        Scope scope = scopeHandlerViewModel.getScope();
        Intrinsics.checkNotNull(scope);
        return scope;
    }

    @NotNull
    public static final Scope createActivityScope(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (!(componentActivity instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(componentActivity).getScopeOrNull(KoinScopeComponentKt.getScopeId(componentActivity));
        return scopeOrNull == null ? createScopeForCurrentLifecycle(componentActivity, componentActivity) : scopeOrNull;
    }

    @KoinInternalApi
    @NotNull
    public static final Scope createScope(@NotNull ComponentActivity componentActivity, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return ComponentCallbackExtKt.getKoin(componentActivity).createScope(KoinScopeComponentKt.getScopeId(componentActivity), KoinScopeComponentKt.getScopeName(componentActivity), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentActivity componentActivity, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return createScope(componentActivity, obj);
    }

    @NotNull
    public static final Scope createScopeForCurrentLifecycle(@NotNull ComponentCallbacks componentCallbacks, @NotNull final LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Scope scopeCreateScope = ComponentCallbackExtKt.getKoin(componentCallbacks).createScope(KoinScopeComponentKt.getScopeId(componentCallbacks), KoinScopeComponentKt.getScopeName(componentCallbacks), componentCallbacks);
        scopeCreateScope.registerCallback(new ScopeCallback() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.createScopeForCurrentLifecycle.1
            @Override // org.koin.core.scope.ScopeCallback
            public void onScopeClose(@NotNull Scope scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                LifecycleOwner lifecycleOwner = owner;
                Intrinsics.checkNotNull(lifecycleOwner, "null cannot be cast to non-null type org.koin.android.scope.AndroidScopeComponent");
                ((AndroidScopeComponent) lifecycleOwner).onCloseScope();
            }
        });
        registerScopeForLifecycle(owner, scopeCreateScope);
        return scopeCreateScope;
    }

    @Nullable
    public static final Scope getScopeOrNull(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return ComponentCallbackExtKt.getKoin(componentActivity).getScopeOrNull(KoinScopeComponentKt.getScopeId(componentActivity));
    }

    public static final void registerScopeForLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Scope scope) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.registerScopeForLifecycle.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner2) {
                c.a(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                c.b(this, owner);
                scope.close();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner2) {
                c.c(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner2) {
                c.d(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner2) {
                c.e(this, lifecycleOwner2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner2) {
                c.f(this, lifecycleOwner2);
            }
        });
    }
}
