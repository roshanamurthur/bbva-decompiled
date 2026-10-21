package w8;

import com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: InfoScreenNoCellsActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ InfoScreenNoCellsActivity f94187p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InfoScreenNoCellsActivity infoScreenNoCellsActivity) {
        super(1);
        this.f94187p0 = infoScreenNoCellsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        InfoScreenNoCellsActivity infoScreenNoCellsActivity = this.f94187p0;
        if (zBooleanValue) {
            infoScreenNoCellsActivity.getBinding().infoScreenSpinner.showSpinner();
        } else {
            infoScreenNoCellsActivity.getBinding().infoScreenSpinner.hideSpinner();
        }
        return Unit.INSTANCE;
    }
}
