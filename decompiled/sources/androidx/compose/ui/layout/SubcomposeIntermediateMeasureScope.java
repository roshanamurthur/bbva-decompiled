package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\r8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR.\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u00148&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\u00020\u00128&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f\u0082\u0001\u0001\u001aø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "", "slotId", "", "Landroidx/compose/ui/layout/Measurable;", "measurablesForSlot", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "subcompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "()J", "lookaheadSize", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "getLookaheadMeasurePolicy", "()Lkotlin/jvm/functions/Function2;", "lookaheadMeasurePolicy", "getLookaheadConstraints-msEJaDk", "lookaheadConstraints", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "ui_release"}, k = 1, mv = {1, 8, 0})
public interface SubcomposeIntermediateMeasureScope extends SubcomposeMeasureScope {
    /* JADX INFO: renamed from: getLookaheadConstraints-msEJaDk */
    long mo3588getLookaheadConstraintsmsEJaDk();

    @NotNull
    Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getLookaheadMeasurePolicy();

    /* JADX INFO: renamed from: getLookaheadSize-YbymL2g */
    long mo3589getLookaheadSizeYbymL2g();

    @NotNull
    List<Measurable> measurablesForSlot(@Nullable Object slotId);

    @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
    @NotNull
    List<Measurable> subcompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content);
}
