package e;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.ui.component.VisaBrandingComponentKt;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f68212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function1 function1, int i10) {
        super(2);
        this.f68212a = function1;
        this.f68213b = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        VisaBrandingComponentKt.VisaBrandingComponent(this.f68212a, (Composer) obj, this.f68213b | 1);
        return Unit.INSTANCE;
    }
}
