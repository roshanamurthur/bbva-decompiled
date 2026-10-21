package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class ViewCompositionStrategy_androidKt {
    public static final Function0 access$installForLifecycle(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.getF21906d().compareTo(Lifecycle.State.DESTROYED) > 0) {
            e1 e1Var = new e1(abstractComposeView);
            lifecycle.addObserver(e1Var);
            return new d1(lifecycle, e1Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
