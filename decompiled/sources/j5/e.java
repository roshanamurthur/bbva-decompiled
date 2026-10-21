package j5;

import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CarouselOfCards.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<CarouselCardsContract.Event, Unit> f78772p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CarouselCardsContract.Event.CardSelected f78773q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function1<? super CarouselCardsContract.Event, Unit> function1, CarouselCardsContract.Event.CardSelected cardSelected) {
        super(0);
        this.f78772p0 = function1;
        this.f78773q0 = cardSelected;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f78772p0.invoke(this.f78773q0);
        return Unit.INSTANCE;
    }
}
