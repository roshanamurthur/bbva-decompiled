package com.bbva.component.ui.carousel.cards.view.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CarouselCard.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$CarouselCardKt {

    @NotNull
    public static final ComposableSingletons$CarouselCardKt INSTANCE = new ComposableSingletons$CarouselCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f57lambda1 = ComposableLambdaKt.composableLambdaInstance(-430332101, false, a.f28337p0);

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28337p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-430332101, iIntValue, -1, "com.bbva.component.ui.carousel.cards.view.compose.ComposableSingletons$CarouselCardKt.lambda-1.<anonymous> (CarouselCard.kt:67)");
                }
                CarouselCardKt.CarouselCard(new CarouselCardItem("id", "0000", null, "Ver datos y CVV", "Tarjeta acabada en 00"), null, composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$component_ui_carousel_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m4854getLambda1$component_ui_carousel_release() {
        return f57lambda1;
    }
}
