package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ View f12848p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref<LayoutCoordinates> f12849q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f12850r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f12851s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(View view, Ref<LayoutCoordinates> ref, int i10, MutableState<Integer> mutableState) {
        super(0);
        this.f12848p0 = view;
        this.f12849q0 = ref;
        this.f12850r0 = i10;
        this.f12851s0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View rootView = this.f12848p0.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
        ExposedDropdownMenuKt.access$updateHeight(rootView, this.f12849q0.getValue(), this.f12850r0, new f1(this.f12851s0));
        return Unit.INSTANCE;
    }
}
