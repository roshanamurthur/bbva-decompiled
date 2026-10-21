package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ View f9137p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref<LayoutCoordinates> f9138q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f9139r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9140s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(View view, Ref<LayoutCoordinates> ref, int i10, MutableIntState mutableIntState) {
        super(0);
        this.f9137p0 = view;
        this.f9138q0 = ref;
        this.f9139r0 = i10;
        this.f9140s0 = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View rootView = this.f9137p0.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
        ExposedDropdownMenuKt.access$updateHeight(rootView, this.f9138q0.getValue(), this.f9139r0, new y0(this.f9140s0));
        return Unit.INSTANCE;
    }
}
