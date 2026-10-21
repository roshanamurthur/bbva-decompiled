package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f17399p0;

    public e1(AbstractComposeView abstractComposeView) {
        this.f17399p0 = abstractComposeView;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f17399p0.disposeComposition();
        }
    }
}
