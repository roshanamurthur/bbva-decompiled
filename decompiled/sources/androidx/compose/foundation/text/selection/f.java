package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function0<Offset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Offset> f6475p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(State<Offset> state) {
        super(0);
        this.f6475p0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Offset invoke() {
        return Offset.m2264boximpl(this.f6475p0.getValue().getF15533a());
    }
}
