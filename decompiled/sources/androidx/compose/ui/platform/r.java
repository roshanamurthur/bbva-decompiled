package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r extends Lambda implements Function1<SemanticsNode, Comparable<?>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r f17438p0 = new r(1);

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(SemanticsNode semanticsNode) {
        SemanticsNode it = semanticsNode;
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.valueOf(it.getBoundsInWindow().getRight());
    }
}
