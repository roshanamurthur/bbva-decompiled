package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "Landroidx/savedstate/SavedStateRegistry;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "create", "Landroidx/lifecycle/ViewModel;", "viewModel", "", "attachHandleIfNeeded", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "Ljava/lang/String;", "<init>", "()V", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class LegacySavedStateHandleController {

    @NotNull
    public static final LegacySavedStateHandleController INSTANCE = new LegacySavedStateHandleController();

    @NotNull
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "()V", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(@NotNull SavedStateRegistryOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) owner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                ViewModel viewModel = viewModelStore.get(it.next());
                Intrinsics.checkNotNull(viewModel);
                LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, owner.getLifecycle());
            }
            if (!viewModelStore.keys().isEmpty()) {
                savedStateRegistry.runOnNextRecreation(OnRecreation.class);
            }
        }
    }

    public static void a(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) {
        Lifecycle.State f21906d = lifecycle.getF21906d();
        if (f21906d == Lifecycle.State.INITIALIZED || f21906d.isAtLeast(Lifecycle.State.STARTED)) {
            savedStateRegistry.runOnNextRecreation(OnRecreation.class);
        } else {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        savedStateRegistry.runOnNextRecreation(LegacySavedStateHandleController.OnRecreation.class);
                    }
                }
            });
        }
    }

    @JvmStatic
    public static final void attachHandleIfNeeded(@NotNull ViewModel viewModel, @NotNull SavedStateRegistry registry, @NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable(TAG_SAVED_STATE_HANDLE_CONTROLLER);
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.getClass();
        a(registry, lifecycle);
    }

    @JvmStatic
    @NotNull
    public static final SavedStateHandleController create(@NotNull SavedStateRegistry registry, @NotNull Lifecycle lifecycle, @Nullable String key, @Nullable Bundle defaultArgs) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(key, SavedStateHandle.INSTANCE.createHandle(registry.consumeRestoredStateForKey(key), defaultArgs));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.getClass();
        a(registry, lifecycle);
        return savedStateHandleController;
    }
}
