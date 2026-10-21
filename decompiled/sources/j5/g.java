package j5;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import com.bbva.component.ui.carousel.cards.view.compose.constants.TestTag;
import com.bbva.component.ui.carousel.view.compose.theme.Dimension;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CarouselOfCards.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<CarouselCardItem> f78777p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<CarouselCardsContract.Event, Unit> f78778q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f78779r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<CarouselCardItem> list, Function1<? super CarouselCardsContract.Event, Unit> function1, int i10) {
        super(2);
        this.f78777p0 = list;
        this.f78778q0 = function1;
        this.f78779r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1809050828, iIntValue, -1, "com.bbva.component.ui.carousel.cards.view.compose.Carousel.<anonymous> (CarouselOfCards.kt:81)");
            }
            Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, TestTag.Carousel.Container);
            Dimension.Padding padding = Dimension.Padding.INSTANCE;
            LazyDslKt.LazyRow(modifierTestTag, null, PaddingKt.m291PaddingValuesYgX7TsA$default(padding.m4860getMediumD9Ej5fM(), 0.0f, 2, null), false, Arrangement.INSTANCE.m246spacedBy0680j_4(padding.m4861getSmallD9Ej5fM()), null, null, false, new f(this.f78777p0, this.f78778q0, this.f78779r0), composer2, 24966, 234);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
