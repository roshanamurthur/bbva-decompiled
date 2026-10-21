package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.c;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LifecycleViewModelScopeDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B-\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¨\u0006\u0010"}, d2 = {"Lorg/koin/androidx/scope/LifecycleViewModelScopeDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/lifecycle/LifecycleOwner;", "Lorg/koin/core/scope/Scope;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "Landroidx/activity/ComponentActivity;", "lifecycleOwner", "Lorg/koin/core/Koin;", "koin", "Lkotlin/Function1;", "createScope", "<init>", "(Landroidx/activity/ComponentActivity;Lorg/koin/core/Koin;Lkotlin/jvm/functions/Function1;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
@SourceDebugExtension({"SMAP\nLifecycleViewModelScopeDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleViewModelScopeDelegate.kt\norg/koin/androidx/scope/LifecycleViewModelScopeDelegate\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Logger.kt\norg/koin/core/logger/Logger\n*L\n1#1,53:1\n75#2,13:54\n28#3:67\n46#3,2:68\n29#3:70\n*S KotlinDebug\n*F\n+ 1 LifecycleViewModelScopeDelegate.kt\norg/koin/androidx/scope/LifecycleViewModelScopeDelegate\n*L\n24#1:54,13\n43#1:67\n43#1:68,2\n43#1:70\n*E\n"})
public final class LifecycleViewModelScopeDelegate implements ReadOnlyProperty<LifecycleOwner, Scope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f92142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Koin f92143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<Koin, Scope> f92144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Scope f92145d;

    /* JADX INFO: compiled from: LifecycleViewModelScopeDelegate.kt */
    public static final class a extends Lambda implements Function1<Koin, Scope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f92148p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(1);
            this.f92148p0 = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Scope invoke(Koin koin) {
            Koin k10 = koin;
            Intrinsics.checkNotNullParameter(k10, "k");
            ComponentActivity componentActivity = this.f92148p0;
            return Koin.createScope$default(k10, KoinScopeComponentKt.getScopeName(componentActivity).getValue(), KoinScopeComponentKt.getScopeName(componentActivity), null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleViewModelScopeDelegate(@NotNull final ComponentActivity lifecycleOwner, @NotNull Koin koin, @NotNull Function1<? super Koin, Scope> createScope) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(koin, "koin");
        Intrinsics.checkNotNullParameter(createScope, "createScope");
        this.f92142a = lifecycleOwner;
        this.f92143b = koin;
        this.f92144c = createScope;
        final Function0 function0 = null;
        final ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(Reflection.getOrCreateKotlinClass(ScopeHandlerViewModel.class), new Function0<ViewModelStore>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = lifecycleOwner.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = lifecycleOwner.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = lifecycleOwner.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }).getValue();
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                ScopeHandlerViewModel scopeHandlerViewModel2 = scopeHandlerViewModel;
                Scope scope = scopeHandlerViewModel2.getScope();
                LifecycleViewModelScopeDelegate lifecycleViewModelScopeDelegate = this;
                if (scope == null) {
                    scopeHandlerViewModel2.setScope((Scope) lifecycleViewModelScopeDelegate.f92144c.invoke(lifecycleViewModelScopeDelegate.f92143b));
                }
                lifecycleViewModelScopeDelegate.f92145d = scopeHandlerViewModel2.getScope();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner2) {
                c.b(this, lifecycleOwner2);
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

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Scope getValue(LifecycleOwner lifecycleOwner, KProperty kProperty) {
        return getValue2(lifecycleOwner, (KProperty<?>) kProperty);
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public Scope getValue2(@NotNull LifecycleOwner thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Scope scope = this.f92145d;
        if (scope != null) {
            Intrinsics.checkNotNull(scope);
            return scope;
        }
        boolean zIsAtLeast = thisRef.getLifecycle().getF21906d().isAtLeast(Lifecycle.State.CREATED);
        ComponentActivity componentActivity = this.f92142a;
        if (!zIsAtLeast) {
            throw new IllegalStateException(("can't get Scope for " + componentActivity + " - LifecycleOwner is not Active").toString());
        }
        String value = KoinScopeComponentKt.getScopeName(componentActivity).getValue();
        Koin koin = this.f92143b;
        Scope scopeOrNull = koin.getScopeOrNull(value);
        if (scopeOrNull == null) {
            scopeOrNull = this.f92144c.invoke(koin);
        }
        this.f92145d = scopeOrNull;
        Logger logger = koin.getLogger();
        String str = "got scope: " + this.f92145d + " for " + componentActivity;
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, str);
        }
        Scope scope2 = this.f92145d;
        Intrinsics.checkNotNull(scope2);
        return scope2;
    }

    public /* synthetic */ LifecycleViewModelScopeDelegate(ComponentActivity componentActivity, Koin koin, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentActivity, koin, (i10 & 4) != 0 ? new a(componentActivity) : function1);
    }
}
