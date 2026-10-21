package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SavedStateRegistryController.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "", "performAttach", "Landroid/os/Bundle;", "savedState", "performRestore", "outBundle", "performSave", "Landroidx/savedstate/SavedStateRegistry;", "b", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateRegistryController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SavedStateRegistryOwner f23408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SavedStateRegistry savedStateRegistry = new SavedStateRegistry();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23410c;

    /* JADX INFO: compiled from: SavedStateRegistryController.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "()V", "create", "Landroidx/savedstate/SavedStateRegistryController;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SavedStateRegistryController create(@NotNull SavedStateRegistryOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new SavedStateRegistryController(owner, null);
        }
    }

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner, DefaultConstructorMarker defaultConstructorMarker) {
        this.f23408a = savedStateRegistryOwner;
    }

    @JvmStatic
    @NotNull
    public static final SavedStateRegistryController create(@NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
        return INSTANCE.create(savedStateRegistryOwner);
    }

    @NotNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @MainThread
    public final void performAttach() {
        SavedStateRegistryOwner savedStateRegistryOwner = this.f23408a;
        Lifecycle lifecycle = savedStateRegistryOwner.getLifecycle();
        if (lifecycle.getF21906d() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.addObserver(new Recreator(savedStateRegistryOwner));
        this.savedStateRegistry.performAttach$savedstate_release(lifecycle);
        this.f23410c = true;
    }

    @MainThread
    public final void performRestore(@Nullable Bundle savedState) {
        if (!this.f23410c) {
            performAttach();
        }
        Lifecycle lifecycle = this.f23408a.getLifecycle();
        if (!lifecycle.getF21906d().isAtLeast(Lifecycle.State.STARTED)) {
            this.savedStateRegistry.performRestore$savedstate_release(savedState);
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getF21906d()).toString());
        }
    }

    @MainThread
    public final void performSave(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.savedStateRegistry.performSave(outBundle);
    }
}
