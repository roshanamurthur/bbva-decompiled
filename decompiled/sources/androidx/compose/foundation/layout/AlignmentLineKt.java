package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/Dp;", "before", "after", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "paddingFrom", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,366:1\n135#2:367\n135#2:368\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:367\n121#1:368\n*E\n"})
public final class AlignmentLineKt {
    /* JADX INFO: renamed from: access$alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m228access$alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, AlignmentLine alignmentLine, float f6, float f10, Measurable measurable, long j10) {
        boolean z10 = alignmentLine instanceof HorizontalAlignmentLine;
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(z10 ? Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null) : Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 14, null));
        int i10 = placeableMo3575measureBRTryo0.get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        int height = z10 ? placeableMo3575measureBRTryo0.getHeight() : placeableMo3575measureBRTryo0.getWidth();
        int iM4356getMaxHeightimpl = z10 ? Constraints.m4356getMaxHeightimpl(j10) : Constraints.m4357getMaxWidthimpl(j10);
        Dp.Companion companion = Dp.INSTANCE;
        int i11 = iM4356getMaxHeightimpl - height;
        int iCoerceIn = kotlin.ranges.c.coerceIn((!Dp.m4394equalsimpl0(f6, companion.m4409getUnspecifiedD9Ej5fM()) ? measureScope.mo413roundToPx0680j_4(f6) : 0) - i10, 0, i11);
        int iCoerceIn2 = kotlin.ranges.c.coerceIn(((!Dp.m4394equalsimpl0(f10, companion.m4409getUnspecifiedD9Ej5fM()) ? measureScope.mo413roundToPx0680j_4(f10) : 0) - height) + i10, 0, i11 - iCoerceIn);
        int width = z10 ? placeableMo3575measureBRTryo0.getWidth() : Math.max(placeableMo3575measureBRTryo0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.m4359getMinWidthimpl(j10));
        int iMax = z10 ? Math.max(placeableMo3575measureBRTryo0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.m4358getMinHeightimpl(j10)) : placeableMo3575measureBRTryo0.getHeight();
        return MeasureScope.CC.q(measureScope, width, iMax, null, new x.b(alignmentLine, f6, iCoerceIn, width, iCoerceIn2, placeableMo3575measureBRTryo0, iMax), 4, null);
    }

    public static final boolean access$getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m229paddingFrom4j6BHR0(@NotNull Modifier paddingFrom, @NotNull final AlignmentLine alignmentLine, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetDpElement(alignmentLine, f6, f10, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "paddingFrom").set("alignmentLine", alignmentLine);
                androidx.activity.a.b(f6, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "before", inspectorInfo).set("after", Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m230paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f6, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m229paddingFrom4j6BHR0(modifier, alignmentLine, f6, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m231paddingFromY_r0B1c(@NotNull Modifier paddingFrom, @NotNull final AlignmentLine alignmentLine, final long j10, final long j11) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetTextUnitElement(alignmentLine, j10, j11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "paddingFrom").set("alignmentLine", alignmentLine);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("before", TextUnit.m4560boximpl(j10));
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("after", TextUnit.m4560boximpl(j11));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m232paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE();
        }
        return m231paddingFromY_r0B1c(modifier, alignmentLine, j12, j11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m233paddingFromBaselineVpY3zN4(@NotNull Modifier paddingFromBaseline, float f6, float f10) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        Dp.Companion companion = Dp.INSTANCE;
        return paddingFromBaseline.then(!Dp.m4394equalsimpl0(f6, companion.m4409getUnspecifiedD9Ej5fM()) ? m230paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f6, 0.0f, 4, null) : Modifier.INSTANCE).then(!Dp.m4394equalsimpl0(f10, companion.m4409getUnspecifiedD9Ej5fM()) ? m230paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f10, 2, null) : Modifier.INSTANCE);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m234paddingFromBaselineVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m233paddingFromBaselineVpY3zN4(modifier, f6, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m235paddingFromBaselinewCyjxdI(@NotNull Modifier paddingFromBaseline, long j10, long j11) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        return paddingFromBaseline.then(!TextUnitKt.m4588isUnspecifiedR2X_6o(j10) ? m232paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j10, 0L, 4, null) : Modifier.INSTANCE).then(!TextUnitKt.m4588isUnspecifiedR2X_6o(j11) ? m232paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j11, 2, null) : Modifier.INSTANCE);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m236paddingFromBaselinewCyjxdI$default(Modifier modifier, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE();
        }
        if ((i10 & 2) != 0) {
            j11 = TextUnit.INSTANCE.m4581getUnspecifiedXSAIIZE();
        }
        return m235paddingFromBaselinewCyjxdI(modifier, j10, j11);
    }
}
