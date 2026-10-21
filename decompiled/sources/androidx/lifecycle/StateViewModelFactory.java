package androidx.lifecycle;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: StateViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "use KoinViewModelFactory")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\n\u001a\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/StateViewModelFactory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/SavedStateHandle;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "d", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "e", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "getParameters", "()Lorg/koin/androidx/viewmodel/ViewModelParameter;", "parameters", "<init>", "(Lorg/koin/core/scope/Scope;Lorg/koin/androidx/viewmodel/ViewModelParameter;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
@KoinInternalApi
public final class StateViewModelFactory<T extends ViewModel> extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Scope scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelParameter<T> parameters;

    /* JADX WARN: Illegal instructions before constructor call */
    public StateViewModelFactory(@NotNull Scope scope, @NotNull ViewModelParameter<T> parameters) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        SavedStateRegistryOwner registryOwner = parameters.getRegistryOwner();
        if (registryOwner == null) {
            throw new IllegalStateException("Can't create SavedStateViewModelFactory without a proper stateRegistryOwner".toString());
        }
        Function0<Bundle> state = parameters.getState();
        super(registryOwner, state != null ? state.invoke() : null);
        this.scope = scope;
        this.parameters = parameters;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    @NotNull
    public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
        ParametersHolder parametersHolderEmptyParametersHolder;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        ViewModelParameter<T> viewModelParameter = this.parameters;
        Function0<ParametersHolder> parameters = viewModelParameter.getParameters();
        if (parameters == null || (parametersHolderEmptyParametersHolder = parameters.invoke()) == null) {
            parametersHolderEmptyParametersHolder = ParametersHolderKt.emptyParametersHolder();
        }
        return (T) this.scope.get(viewModelParameter.getClazz(), viewModelParameter.getQualifier(), new n(parametersHolderEmptyParametersHolder, handle));
    }

    @NotNull
    public final ViewModelParameter<T> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }
}
