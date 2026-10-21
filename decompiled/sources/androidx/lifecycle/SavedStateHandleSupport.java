package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0007\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0016\u001a\u00020\u0013*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", ExifInterface.GPS_DIRECTION_TRUE, "", "enableSavedStateHandles", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/SavedStateHandle;", "createSavedStateHandle", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "VIEW_MODEL_STORE_OWNER_KEY", "Landroid/os/Bundle;", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "SavedStateHandleSupport")
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class SavedStateHandleSupport {

    @JvmField
    @NotNull
    public static final CreationExtras.Key<SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = new CreationExtras.Key<SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };

    @JvmField
    @NotNull
    public static final CreationExtras.Key<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new CreationExtras.Key<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };

    @JvmField
    @NotNull
    public static final CreationExtras.Key<Bundle> DEFAULT_ARGS_KEY = new CreationExtras.Key<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    @MainThread
    @NotNull
    public static final SavedStateHandle createSavedStateHandle(@NotNull CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (savedStateRegistryOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
        String str = (String) creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle savedStateHandleCreateHandle = SavedStateHandle.INSTANCE.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, savedStateHandleCreateHandle);
        return savedStateHandleCreateHandle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public static final <T extends SavedStateRegistryOwner & ViewModelStoreOwner> void enableSavedStateHandles(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Lifecycle.State f21906d = t10.getLifecycle().getF21906d();
        if (f21906d != Lifecycle.State.INITIALIZED && f21906d != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().registerSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            t10.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    @NotNull
    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(@NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider = savedStateProvider instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) savedStateProvider : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @NotNull
    public static final SavedStateHandlesVM getSavedStateHandlesVM(@NotNull ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1
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
                return new SavedStateHandlesVM();
            }
        }).get("androidx.lifecycle.internal.SavedStateHandlesVM", SavedStateHandlesVM.class);
    }
}
