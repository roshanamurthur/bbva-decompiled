package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "", "Landroidx/lifecycle/GeneratedAdapter;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/GeneratedAdapter;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final GeneratedAdapter[] f21823p0;

    public CompositeGeneratedAdaptersObserver(@NotNull GeneratedAdapter[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f21823p0 = generatedAdapters;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        GeneratedAdapter[] generatedAdapterArr = this.f21823p0;
        for (GeneratedAdapter generatedAdapter : generatedAdapterArr) {
            generatedAdapter.callMethods(source, event, false, methodCallsLogger);
        }
        for (GeneratedAdapter generatedAdapter2 : generatedAdapterArr) {
            generatedAdapter2.callMethods(source, event, true, methodCallsLogger);
        }
    }
}
