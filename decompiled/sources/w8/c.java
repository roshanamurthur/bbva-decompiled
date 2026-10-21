package w8;

import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: InfoScreenActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ InfoScreenActivity f94182p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InfoScreenActivity infoScreenActivity) {
        super(1);
        this.f94182p0 = infoScreenActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        InfoScreenActivity.access$getLoaderSpinnerViewModel(this.f94182p0).showSpinner(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
