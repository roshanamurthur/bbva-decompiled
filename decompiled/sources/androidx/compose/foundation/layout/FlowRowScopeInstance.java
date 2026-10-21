package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J!\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0097\u0001J\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0097\u0001J\r\u0010\u000f\u001a\u00020\u0005*\u00020\u0005H\u0097\u0001J\u001f\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0097\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/foundation/layout/FlowRowScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FlowRowScopeInstance implements RowScope, FlowRowScope {

    @NotNull
    public static final FlowRowScopeInstance INSTANCE = new FlowRowScopeInstance();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RowScopeInstance f4272a = RowScopeInstance.INSTANCE;

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier, @NotNull Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.f4272a.align(modifier, alignment);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull HorizontalAlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return this.f4272a.alignBy(modifier, alignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignByBaseline(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f4272a.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier, float f6, boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f4272a.weight(modifier, f6, z10);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull Function1<? super Measured, Integer> alignmentLineBlock) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
        return this.f4272a.alignBy(modifier, alignmentLineBlock);
    }
}
