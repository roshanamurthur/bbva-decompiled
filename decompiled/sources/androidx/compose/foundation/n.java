package androidx.compose.foundation;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Offset> f5338p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(State<Offset> state) {
        super(0);
        this.f5338p0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(OffsetKt.m2294isSpecifiedk4lQ0M(this.f5338p0.getValue().getF15533a()));
    }
}
