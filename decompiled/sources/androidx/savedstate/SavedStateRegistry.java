package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002()B\t\b\u0000¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007R$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010$¨\u0006*"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "", "key", "Landroid/os/Bundle;", "consumeRestoredStateForKey", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "provider", "", "registerSavedStateProvider", "getSavedStateProvider", "unregisterSavedStateProvider", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "clazz", "runOnNextRecreation", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "performAttach$savedstate_release", "(Landroidx/lifecycle/Lifecycle;)V", "performAttach", "savedState", "performRestore$savedstate_release", "(Landroid/os/Bundle;)V", "performRestore", "outBundle", "performSave", "", "<set-?>", "d", "Z", "isRestored", "()Z", "f", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "<init>", "()V", "AutoRecreated", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
@SourceDebugExtension({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Bundle f23404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isRestored;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Recreator.SavedStateProvider f23406e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SafeIterableMap<String, SavedStateProvider> f23402a = new SafeIterableMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isAllowingSavingState = true;

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface AutoRecreated {
        void onRecreated(@NotNull SavedStateRegistryOwner owner);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SavedStateProvider {
        @NotNull
        Bundle saveState();
    }

    @MainThread
    @Nullable
    public final Bundle consumeRestoredStateForKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f23404c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f23404c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f23404c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f23404c = null;
        }
        return bundle2;
    }

    @Nullable
    public final SavedStateProvider getSavedStateProvider(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (Map.Entry<String, SavedStateProvider> components : this.f23402a) {
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String key2 = components.getKey();
            SavedStateProvider value = components.getValue();
            if (Intrinsics.areEqual(key2, key)) {
                return value;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: isAllowingSavingState$savedstate_release, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    @MainThread
    /* JADX INFO: renamed from: isRestored, reason: from getter */
    public final boolean getIsRestored() {
        return this.isRestored;
    }

    @MainThread
    public final void performAttach$savedstate_release(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!this.f23403b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: c3.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistry this$0 = this.f25345p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_START) {
                    this$0.isAllowingSavingState = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    this$0.isAllowingSavingState = false;
                }
            }
        });
        this.f23403b = true;
    }

    @MainThread
    public final void performRestore$savedstate_release(@Nullable Bundle savedState) {
        if (!this.f23403b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.isRestored)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f23404c = savedState != null ? savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.isRestored = true;
    }

    @MainThread
    public final void performSave(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f23404c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions = this.f23402a.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry next = iteratorWithAdditions.next();
            bundle.putBundle((String) next.getKey(), ((SavedStateProvider) next.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    @MainThread
    public final void registerSavedStateProvider(@NotNull String key, @NotNull SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.f23402a.putIfAbsent(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @MainThread
    public final void runOnNextRecreation(@NotNull Class<? extends AutoRecreated> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.SavedStateProvider savedStateProvider = this.f23406e;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.f23406e = savedStateProvider;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.SavedStateProvider savedStateProvider2 = this.f23406e;
            if (savedStateProvider2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                savedStateProvider2.add(name);
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z10) {
        this.isAllowingSavingState = z10;
    }

    @MainThread
    public final void unregisterSavedStateProvider(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f23402a.remove(key);
    }
}
