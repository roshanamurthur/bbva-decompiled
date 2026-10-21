package j5;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CarouselOfCards.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CarouselCardsContract.State.Header f78787p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<CarouselCardsContract.Event, Unit> f78788q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f78789r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f78790s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(CarouselCardsContract.State.Header header, Function1<? super CarouselCardsContract.Event, Unit> function1, int i10, int i11) {
        super(2);
        this.f78787p0 = header;
        this.f78788q0 = function1;
        this.f78789r0 = i10;
        this.f78790s0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78789r0 | 1);
        CarouselOfCardsKt.access$Header(this.f78787p0, this.f78788q0, composer, iUpdateChangedFlags, this.f78790s0);
        return Unit.INSTANCE;
    }
}
