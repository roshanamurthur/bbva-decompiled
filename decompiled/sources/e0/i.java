package e0;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f68234p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TextDragObserver textDragObserver) {
        super(2);
        this.f68234p0 = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
        long f15533a = offset.getF15533a();
        Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
        this.f68234p0.mo539onDragk4lQ0M(f15533a);
        return Unit.INSTANCE;
    }
}
