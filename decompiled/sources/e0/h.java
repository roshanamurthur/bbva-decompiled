package e0;

import androidx.compose.foundation.text.TextDragObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f68233p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TextDragObserver textDragObserver) {
        super(0);
        this.f68233p0 = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f68233p0.onCancel();
        return Unit.INSTANCE;
    }
}
