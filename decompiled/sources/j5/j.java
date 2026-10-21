package j5;

import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CarouselOfCards.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends Lambda implements Function1<CarouselCardsContract.Event, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j f78785p0 = new j(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CarouselCardsContract.Event event) {
        CarouselCardsContract.Event it = event;
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
