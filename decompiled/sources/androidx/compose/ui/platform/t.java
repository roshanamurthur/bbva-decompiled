package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Lambda implements Function1<Pair<? extends Rect, ? extends List<SemanticsNode>>, Comparable<?>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t f17451p0 = new t(1);

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(Pair<? extends Rect, ? extends List<SemanticsNode>> pair) {
        Pair<? extends Rect, ? extends List<SemanticsNode>> it = pair;
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.valueOf(it.getFirst().getTop());
    }
}
