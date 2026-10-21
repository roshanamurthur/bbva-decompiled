package org.koin.androidx.viewmodel.factory;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.p;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.parameter.AndroidParametersHolder;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: KoinViewModelFactory.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/koin/androidx/viewmodel/factory/KoinViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "kClass", "Lorg/koin/core/scope/Scope;", "scope", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "params", "<init>", "(Lkotlin/reflect/KClass;Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class KoinViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KClass<? extends ViewModel> f92291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Scope f92292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Qualifier f92293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Function0<ParametersHolder> f92294d;

    /* JADX INFO: compiled from: KoinViewModelFactory.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AndroidParametersHolder f92295p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AndroidParametersHolder androidParametersHolder) {
            super(0);
            this.f92295p0 = androidParametersHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return this.f92295p0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KoinViewModelFactory(@NotNull KClass<? extends ViewModel> kClass, @NotNull Scope scope, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f92291a = kClass;
        this.f92292b = scope;
        this.f92293c = qualifier;
        this.f92294d = function0;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls) {
        return p.a(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
        return p.c(this, kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) this.f92292b.get(this.f92291a, this.f92293c, new a(new AndroidParametersHolder(this.f92294d, extras)));
    }

    public /* synthetic */ KoinViewModelFactory(KClass kClass, Scope scope, Qualifier qualifier, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, scope, (i10 & 4) != 0 ? null : qualifier, (i10 & 8) != 0 ? null : function0);
    }
}
