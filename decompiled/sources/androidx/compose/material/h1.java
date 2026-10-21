package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f8492p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> f8493q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f8494r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(ModalBottomSheetState modalBottomSheetState, AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback, float f6) {
        super(1);
        this.f8492p0 = modalBottomSheetState;
        this.f8493q0 = anchorChangedCallback;
        this.f8494r0 = f6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        long f18319a = intSize.getF18319a();
        Map mapCreateMapBuilder = bk.p.createMapBuilder();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        float f6 = this.f8494r0;
        mapCreateMapBuilder.put(modalBottomSheetValue, Float.valueOf(f6));
        float f10 = f6 / 2.0f;
        ModalBottomSheetState modalBottomSheetState = this.f8492p0;
        if (!modalBottomSheetState.getIsSkipHalfExpanded() && IntSize.m4548getHeightimpl(f18319a) > f10) {
            mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f10));
        }
        if (IntSize.m4548getHeightimpl(f18319a) != 0) {
            mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f6 - IntSize.m4548getHeightimpl(f18319a))));
        }
        modalBottomSheetState.getAnchoredDraggableState$material_release().updateAnchors$material_release(bk.p.build(mapCreateMapBuilder), this.f8493q0);
        return Unit.INSTANCE;
    }
}
