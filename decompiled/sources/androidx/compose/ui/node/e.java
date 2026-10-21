package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function1<AlignmentLinesOwner, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e f16947p0 = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
        AlignmentLinesOwner it = alignmentLinesOwner;
        Intrinsics.checkNotNullParameter(it, "it");
        it.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(it.getAlignmentLines().getUsedDuringParentLayout());
        return Unit.INSTANCE;
    }
}
