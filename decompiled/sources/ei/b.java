package ei;

import com.mypinpad.android.hapticslibrary.SchemeHapticsAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SchemeHapticsAnimationView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends Lambda implements Function1<Error, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<SchemeHapticsAnimationView, Unit> f68363p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SchemeHapticsAnimationView f68364q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function1<? super SchemeHapticsAnimationView, Unit> function1, SchemeHapticsAnimationView schemeHapticsAnimationView) {
        super(1);
        this.f68363p0 = function1;
        this.f68364q0 = schemeHapticsAnimationView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Error error) {
        Function1<SchemeHapticsAnimationView, Unit> function1 = this.f68363p0;
        if (function1 != null) {
            function1.invoke(this.f68364q0);
        }
        return Unit.INSTANCE;
    }
}
