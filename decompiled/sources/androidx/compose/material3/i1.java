package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Ref<LayoutCoordinates> f12880p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ View f12881q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f12882r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f12883s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f12884t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Ref<LayoutCoordinates> ref, View view, int i10, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(1);
        this.f12880p0 = ref;
        this.f12881q0 = view;
        this.f12882r0 = i10;
        this.f12883s0 = mutableState;
        this.f12884t0 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f12883s0.setValue(Integer.valueOf(IntSize.m4549getWidthimpl(it.mo3581getSizeYbymL2g())));
        Ref<LayoutCoordinates> ref = this.f12880p0;
        ref.setValue(it);
        View rootView = this.f12881q0.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
        ExposedDropdownMenuKt.access$updateHeight(rootView, ref.getValue(), this.f12882r0, new h1(this.f12884t0));
        return Unit.INSTANCE;
    }
}
