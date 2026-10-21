package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<AlignmentLinesOwner, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f16944p0 = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
        AlignmentLinesOwner child = alignmentLinesOwner;
        Intrinsics.checkNotNullParameter(child, "child");
        child.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
        return Unit.INSTANCE;
    }
}
