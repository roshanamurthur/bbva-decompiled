package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJH\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0096\u0001J\u001a\u0010\u0013\u001a\u00020\u0003*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u0003*\u00020\u0014H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u0017*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u0017*\u00020\u0014H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0097\u0001J+\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u0010*\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001c\u0010)\u001a\u00020\u0010*\u00020\u0003H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001c\u0010)\u001a\u00020\u0010*\u00020\u0017H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u0019J\u001c\u0010.\u001a\u00020\u0014*\u00020\u0017H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020\u0014*\u00020\u0003H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010/J\u0019\u0010.\u001a\u00020\u0014*\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010-J\u0019\u00105\u001a\u000202*\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u000201*\u000202H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00104R\u0014\u0010:\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010>\u001a\u00020=8WX\u0097\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", PluginUtils.IDENTIFIER_LAYOUT, "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "", "toPx-0680j_4", "(F)F", "toPx", "toPx--R2X_6o", "(J)F", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "measure", "toDp-GaN1DYA", "toDp", "toDp-u2uoSUM", "(I)F", "toSp-kPz2Gy4", "(F)J", "toSp", "(I)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LazyLayoutItemContentFactory f5000p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SubcomposeMeasureScope f5001q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LazyLayoutItemProvider f5002r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, List<Placeable>> f5003s0;

    public LazyLayoutMeasureScopeImpl(@NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull SubcomposeMeasureScope subcomposeMeasureScope) {
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.f5000p0 = itemContentFactory;
        this.f5001q0 = subcomposeMeasureScope;
        this.f5002r0 = itemContentFactory.getItemProvider().invoke();
        this.f5003s0 = new HashMap<>();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.f5001q0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.f5001q0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f5001q0.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @ExperimentalComposeUiApi
    public boolean isLookingAhead() {
        return this.f5001q0.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return this.f5001q0.layout(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @NotNull
    /* JADX INFO: renamed from: measure-0kLqBqw */
    public List<Placeable> mo403measure0kLqBqw(int index, long constraints) {
        HashMap<Integer, List<Placeable>> map = this.f5003s0;
        List<Placeable> list = map.get(Integer.valueOf(index));
        if (list != null) {
            return list;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = this.f5002r0;
        Object key = lazyLayoutItemProvider.getKey(index);
        List<Measurable> listSubcompose = this.f5001q0.subcompose(key, this.f5000p0.getContent(index, key, lazyLayoutItemProvider.getContentType(index)));
        int size = listSubcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(listSubcompose.get(i10).mo3575measureBRTryo0(constraints));
        }
        map.put(Integer.valueOf(index), arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
    public int mo412roundToPxR2X_6o(long j10) {
        return this.f5001q0.mo412roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
    public int mo413roundToPx0680j_4(float f6) {
        return this.f5001q0.mo413roundToPx0680j_4(f6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo404toDpGaN1DYA(long j10) {
        return this.f5001q0.mo404toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo406toDpu2uoSUM(int i10) {
        return this.f5001q0.mo406toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo407toDpSizekrfVVM(long j10) {
        return this.f5001q0.mo407toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
    public float mo414toPxR2X_6o(long j10) {
        return this.f5001q0.mo414toPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
    public float mo415toPx0680j_4(float f6) {
        return this.f5001q0.mo415toPx0680j_4(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f5001q0.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo408toSizeXkaWNTQ(long j10) {
        return this.f5001q0.mo408toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo409toSp0xMU5do(float f6) {
        return this.f5001q0.mo409toSp0xMU5do(f6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo410toSpkPz2Gy4(float f6) {
        return this.f5001q0.mo410toSpkPz2Gy4(f6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo405toDpu2uoSUM(float f6) {
        return this.f5001q0.mo405toDpu2uoSUM(f6);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo411toSpkPz2Gy4(int i10) {
        return this.f5001q0.mo411toSpkPz2Gy4(i10);
    }
}
