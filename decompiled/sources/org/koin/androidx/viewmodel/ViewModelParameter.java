package org.koin.androidx.viewmodel;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: compiled from: ViewModelParameter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "Deprecated API in favor of KoinViewModelFactory")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001Be\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fj\u0004\u0018\u0001`\u0018\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b(\u0010)R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fj\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010'\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelParameter;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "getClazz", "()Lkotlin/reflect/KClass;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "b", "Lorg/koin/core/qualifier/Qualifier;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "c", "Lkotlin/jvm/functions/Function0;", "getState", "()Lkotlin/jvm/functions/Function0;", "state", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "d", "getParameters", "parameters", "Landroidx/lifecycle/ViewModelStoreOwner;", "e", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "()Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "f", "Landroidx/savedstate/SavedStateRegistryOwner;", "getRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "registryOwner", "<init>", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
@KoinInternalApi
public final class ViewModelParameter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KClass<T> clazz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Qualifier qualifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function0<Bundle> state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function0<ParametersHolder> parameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewModelStoreOwner viewModelStoreOwner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SavedStateRegistryOwner registryOwner;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelParameter(@NotNull KClass<T> clazz, @Nullable Qualifier qualifier, @Nullable Function0<Bundle> function0, @Nullable Function0<? extends ParametersHolder> function1, @NotNull ViewModelStoreOwner viewModelStoreOwner, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.clazz = clazz;
        this.qualifier = qualifier;
        this.state = function0;
        this.parameters = function1;
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.registryOwner = savedStateRegistryOwner;
    }

    @NotNull
    public final KClass<T> getClazz() {
        return this.clazz;
    }

    @Nullable
    public final Function0<ParametersHolder> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    @Nullable
    public final SavedStateRegistryOwner getRegistryOwner() {
        return this.registryOwner;
    }

    @Nullable
    public final Function0<Bundle> getState() {
        return this.state;
    }

    @NotNull
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public /* synthetic */ ViewModelParameter(KClass kClass, Qualifier qualifier, Function0 function0, Function0 function1, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i10 & 2) != 0 ? null : qualifier, (i10 & 4) != 0 ? null : function0, (i10 & 8) != 0 ? null : function1, viewModelStoreOwner, (i10 & 32) != 0 ? null : savedStateRegistryOwner);
    }
}
