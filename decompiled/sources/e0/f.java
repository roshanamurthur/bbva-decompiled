package e0;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function1<Offset, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f68231p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TextDragObserver textDragObserver) {
        super(1);
        this.f68231p0 = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Offset offset) {
        this.f68231p0.mo540onStartk4lQ0M(offset.getF15533a());
        return Unit.INSTANCE;
    }
}
