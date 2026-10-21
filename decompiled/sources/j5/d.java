package j5;

import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CarouselOfCards.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Lambda implements Function1<CarouselCardItem, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f78771p0 = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(CarouselCardItem carouselCardItem) {
        CarouselCardItem card = carouselCardItem;
        Intrinsics.checkNotNullParameter(card, "card");
        return Integer.valueOf(card.hashCode());
    }
}
