package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SingleGeneratedAdapterObserver.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "Landroidx/lifecycle/GeneratedAdapter;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/GeneratedAdapter;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final GeneratedAdapter f22011p0;

    public SingleGeneratedAdapterObserver(@NotNull GeneratedAdapter generatedAdapter) {
        Intrinsics.checkNotNullParameter(generatedAdapter, "generatedAdapter");
        this.f22011p0 = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        GeneratedAdapter generatedAdapter = this.f22011p0;
        generatedAdapter.callMethods(source, event, false, null);
        generatedAdapter.callMethods(source, event, true, null);
    }
}
