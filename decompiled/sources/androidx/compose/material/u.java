package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f9030p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<IntSize, Map<BottomSheetValue, Float>> f9031q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue> f9032r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(BottomSheetState bottomSheetState, Function1<? super IntSize, ? extends Map<BottomSheetValue, Float>> function1, AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue> anchorChangedCallback) {
        super(1);
        this.f9030p0 = bottomSheetState;
        this.f9031q0 = function1;
        this.f9032r0 = anchorChangedCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        this.f9030p0.getAnchoredDraggableState$material_release().updateAnchors$material_release(this.f9031q0.invoke(IntSize.m4541boximpl(intSize.getF18319a())), this.f9032r0);
        return Unit.INSTANCE;
    }
}
