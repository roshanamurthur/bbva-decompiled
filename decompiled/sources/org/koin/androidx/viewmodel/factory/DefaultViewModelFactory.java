package org.koin.androidx.viewmodel.factory;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.p;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: DefaultViewModelFactory.kt */
/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "use KoinViewModelFactory")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\r\u001a\u00020\b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0006\u001a\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lorg/koin/androidx/viewmodel/factory/DefaultViewModelFactory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "a", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "b", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "getParameters", "()Lorg/koin/androidx/viewmodel/ViewModelParameter;", "parameters", "<init>", "(Lorg/koin/core/scope/Scope;Lorg/koin/androidx/viewmodel/ViewModelParameter;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
@KoinInternalApi
public final class DefaultViewModelFactory<T extends ViewModel> implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Scope scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelParameter<T> parameters;

    public DefaultViewModelFactory(@NotNull Scope scope, @NotNull ViewModelParameter<T> parameters) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.scope = scope;
        this.parameters = parameters;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return p.b(this, cls, creationExtras);
    }

    @NotNull
    public final ViewModelParameter<T> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
        return p.c(this, kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        ViewModelParameter<T> viewModelParameter = this.parameters;
        Object obj = this.scope.get(viewModelParameter.getClazz(), viewModelParameter.getQualifier(), viewModelParameter.getParameters());
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.koin.androidx.viewmodel.factory.DefaultViewModelFactory.create");
        return (T) obj;
    }
}
