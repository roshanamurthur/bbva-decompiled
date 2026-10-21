package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\u000bJ7\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\t\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "", "key", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "viewModel", "", "onRequery", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final SavedStateRegistry f21807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Lifecycle f21808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Bundle f21809c;

    public AbstractSavedStateViewModelFactory() {
    }

    @NotNull
    public abstract <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle);

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
        return p.c(this, kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(@NotNull ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        SavedStateRegistry savedStateRegistry = this.f21807a;
        if (savedStateRegistry != null) {
            Intrinsics.checkNotNull(savedStateRegistry);
            Lifecycle lifecycle = this.f21808b;
            Intrinsics.checkNotNull(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public AbstractSavedStateViewModelFactory(@NotNull SavedStateRegistryOwner owner, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f21807a = owner.getSavedStateRegistry();
        this.f21808b = owner.getLifecycle();
        this.f21809c = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        SavedStateRegistry savedStateRegistry = this.f21807a;
        if (savedStateRegistry == null) {
            return (T) create(str, modelClass, SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        Intrinsics.checkNotNull(savedStateRegistry);
        Lifecycle lifecycle = this.f21808b;
        Intrinsics.checkNotNull(lifecycle);
        SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, this.f21809c);
        T t10 = (T) create(str, modelClass, savedStateHandleControllerCreate.getHandle());
        t10.addCloseable(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, savedStateHandleControllerCreate);
        return t10;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.f21808b != null) {
                SavedStateRegistry savedStateRegistry = this.f21807a;
                Intrinsics.checkNotNull(savedStateRegistry);
                Lifecycle lifecycle = this.f21808b;
                Intrinsics.checkNotNull(lifecycle);
                SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, canonicalName, this.f21809c);
                T t10 = (T) create(canonicalName, modelClass, savedStateHandleControllerCreate.getHandle());
                t10.addCloseable(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, savedStateHandleControllerCreate);
                return t10;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
