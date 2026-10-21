package com.bbva.component.ui.carousel.cards.view.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bbva.component.ui.carousel.cards.view.compose.defaults.CardImageDefaults;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CarouselCardImage.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$CarouselCardImageKt {

    @NotNull
    public static final ComposableSingletons$CarouselCardImageKt INSTANCE = new ComposableSingletons$CarouselCardImageKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f56lambda1 = ComposableLambdaKt.composableLambdaInstance(-27427839, false, a.f28336p0);

    /* JADX INFO: compiled from: CarouselCardImage.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28336p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-27427839, iIntValue, -1, "com.bbva.component.ui.carousel.cards.view.compose.ComposableSingletons$CarouselCardImageKt.lambda-1.<anonymous> (CarouselCardImage.kt:141)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                CardImageDefaults cardImageDefaults = CardImageDefaults.INSTANCE;
                CarouselCardImageKt.CarouselCardImage("0000", null, SizeKt.m340width3ABfNKs(SizeKt.m321height3ABfNKs(companion, cardImageDefaults.m4856getHeightD9Ej5fM()), cardImageDefaults.m4857getWidthD9Ej5fM()), null, null, composer2, 438, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$component_ui_carousel_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m4853getLambda1$component_ui_carousel_release() {
        return f56lambda1;
    }
}
