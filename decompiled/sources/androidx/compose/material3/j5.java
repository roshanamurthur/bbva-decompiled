package androidx.compose.material3;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j5 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Lifecycle.Event, Unit> f12951p0;

    /* JADX WARN: Multi-variable type inference failed */
    public j5(Function1<? super Lifecycle.Event, Unit> function1) {
        this.f12951p0 = function1;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f12951p0.invoke(event);
    }
}
