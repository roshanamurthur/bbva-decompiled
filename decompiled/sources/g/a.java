package g;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.ui.component.VisaBrandingComponentKt;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f68528a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(mx.openpay.library.ui.taponphone.charge.e eVar) {
        super(2);
        this.f68528a = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-125700393, iIntValue, -1, "mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeActivity.configureVisaBrandingView.<anonymous>.<anonymous> (TapOnPhoneCreateChargeActivity.kt:201)");
            }
            VisaBrandingComponentKt.VisaBrandingComponent(this.f68528a, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
