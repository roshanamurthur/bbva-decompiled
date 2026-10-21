package j5;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$1;
import j5.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CarouselOfCards.kt */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCarouselOfCards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselOfCards.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselOfCardsKt$Carousel$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,121:1\n136#2,12:122\n*S KotlinDebug\n*F\n+ 1 CarouselOfCards.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselOfCardsKt$Carousel$2$1\n*L\n88#1:122,12\n*E\n"})
public final class f extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<CarouselCardItem> f78774p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<CarouselCardsContract.Event, Unit> f78775q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f78776r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(List<CarouselCardItem> list, Function1<? super CarouselCardsContract.Event, Unit> function1, int i10) {
        super(1);
        this.f78774p0 = list;
        this.f78775q0 = function1;
        this.f78776r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyRow = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final d dVar = d.f78771p0;
        final CarouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$1 carouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$1 = new Function1() { // from class: com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Void invoke(CarouselCardItem carouselCardItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CarouselCardItem) obj);
            }
        };
        final List<CarouselCardItem> list = this.f78774p0;
        int size = list.size();
        Function1<Integer, Object> function1 = dVar != null ? new Function1<Integer, Object>() { // from class: com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Object invoke(int i10) {
                return dVar.invoke(list.get(i10));
            }
        } : null;
        Function1<Integer, Object> function2 = new Function1<Integer, Object>() { // from class: com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            @Nullable
            public final Object invoke(int i10) {
                return carouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$1.invoke(list.get(i10));
            }
        };
        final Function1<CarouselCardsContract.Event, Unit> function3 = this.f78775q0;
        final int i10 = this.f78776r0;
        LazyRow.items(size, function1, function2, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>(list, function3, i10) { // from class: com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsKt$Carousel$2$1$invoke$$inlined$items$default$4

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ List f28320p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1 f28321q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope items, int i11, @Nullable Composer composer, int i12) {
                int i13;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i12 & 14) == 0) {
                    i13 = (composer.changed(items) ? 4 : 2) | i12;
                } else {
                    i13 = i12;
                }
                if ((i12 & 112) == 0) {
                    i13 |= composer.changed(i11) ? 32 : 16;
                }
                if ((i13 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                }
                int i14 = i13 & 14;
                CarouselCardItem carouselCardItem = (CarouselCardItem) this.f28320p0.get(i11);
                CarouselCardsContract.Event.CardSelected cardSelected = new CarouselCardsContract.Event.CardSelected(carouselCardItem.getId());
                composer.startReplaceableGroup(511388516);
                Function1 function4 = this.f28321q0;
                boolean zChanged = composer.changed(function4) | composer.changed(cardSelected);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new e(function4, cardSelected);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                CarouselCardKt.CarouselCard(carouselCardItem, (Function0) objRememberedValue, composer, (i14 >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
