package org.koin.androidx.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.StateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.factory.DefaultViewModelFactory;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ViewModelResolver.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007\u001a)\u0010\u0007\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"pickFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "viewModelParameters", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "resolveInstance", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;Lorg/koin/androidx/viewmodel/ViewModelParameter;)Landroidx/lifecycle/ViewModel;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ViewModelResolverKt {
    @Deprecated(message = "Deprecated API in favor of KoinViewModelFactory")
    @KoinInternalApi
    @NotNull
    public static final <T extends ViewModel> ViewModelProvider.Factory pickFactory(@NotNull Scope scope, @NotNull ViewModelParameter<T> viewModelParameters) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameters, "viewModelParameters");
        return (viewModelParameters.getRegistryOwner() == null || viewModelParameters.getState() == null) ? new DefaultViewModelFactory(scope, viewModelParameters) : new StateViewModelFactory(scope, viewModelParameters);
    }

    @Deprecated(message = "Deprecated API in favor of KoinViewModelFactory")
    @KoinInternalApi
    @NotNull
    public static final <T extends ViewModel> T resolveInstance(@NotNull ViewModelProvider viewModelProvider, @NotNull ViewModelParameter<T> viewModelParameters) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "<this>");
        Intrinsics.checkNotNullParameter(viewModelParameters, "viewModelParameters");
        Class<T> javaClass = JvmClassMappingKt.getJavaClass((KClass) viewModelParameters.getClazz());
        return viewModelParameters.getQualifier() != null ? (T) viewModelProvider.get(viewModelParameters.getQualifier().toString(), javaClass) : (T) viewModelProvider.get(javaClass);
    }
}
