package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SavedStateHandleController.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/io/Closeable;", "Landroidx/savedstate/SavedStateRegistry;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "attachToLifecycle", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroidx/lifecycle/SavedStateHandle;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "handle", "", "<set-?>", "r0", "Z", "isAttached", "()Z", "", "key", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class SavedStateHandleController implements LifecycleEventObserver, Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f21989p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SavedStateHandle handle;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public boolean isAttached;

    public SavedStateHandleController(@NotNull String key, @NotNull SavedStateHandle handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f21989p0 = key;
        this.handle = handle;
    }

    public final void attachToLifecycle(@NotNull SavedStateRegistry registry, @NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!this.isAttached)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.isAttached = true;
        lifecycle.addObserver(this);
        registry.registerSavedStateProvider(this.f21989p0, this.handle.getF21985e());
    }

    @NotNull
    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().removeObserver(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
