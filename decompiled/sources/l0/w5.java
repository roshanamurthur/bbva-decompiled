package l0;

import androidx.compose.material3.RichTooltipState;
import androidx.compose.material3.TooltipState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TooltipState f83028p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(TooltipState tooltipState) {
        super(0);
        this.f83028p0 = tooltipState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((RichTooltipState) this.f83028p0).setVisible$material3_release(false);
        return Unit.INSTANCE;
    }
}
