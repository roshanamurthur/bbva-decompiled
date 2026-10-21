package androidx.savedstate;

import android.os.Bundle;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Recreator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class Recreator implements LifecycleEventObserver {

    @NotNull
    public static final String CLASSES_KEY = "classes_to_restore";

    @NotNull
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SavedStateRegistryOwner f23400p0;

    /* JADX INFO: compiled from: Recreator.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroid/os/Bundle;", "saveState", "", "className", "", "add", "Landroidx/savedstate/SavedStateRegistry;", "registry", "<init>", "(Landroidx/savedstate/SavedStateRegistry;)V", "savedstate_release"}, k = 1, mv = {1, 8, 0})
    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkedHashSet f23401a;

        public SavedStateProvider(@NotNull SavedStateRegistry registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f23401a = new LinkedHashSet();
            registry.registerSavedStateProvider(Recreator.COMPONENT_KEY, this);
        }

        public final void add(@NotNull String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f23401a.add(className);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        @NotNull
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.CLASSES_KEY, new ArrayList<>(this.f23401a));
            return bundle;
        }
    }

    public Recreator(@NotNull SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f23400p0 = owner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        SavedStateRegistryOwner savedStateRegistryOwner = this.f23400p0;
        Bundle bundleConsumeRestoredStateForKey = savedStateRegistryOwner.getSavedStateRegistry().consumeRestoredStateForKey(COMPONENT_KEY);
        if (bundleConsumeRestoredStateForKey == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleConsumeRestoredStateForKey.getStringArrayList(CLASSES_KEY);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
                Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((SavedStateRegistry.AutoRecreated) objNewInstance).onRecreated(savedStateRegistryOwner);
                    } catch (Exception e5) {
                        throw new RuntimeException(f.d("Failed to instantiate ", str), e5);
                    }
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(h0.b("Class ", str, " wasn't found"), e10);
            }
        }
    }
}
