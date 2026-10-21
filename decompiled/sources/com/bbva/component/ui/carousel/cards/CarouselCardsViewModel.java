package com.bbva.component.ui.carousel.cards;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CarouselCardsViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event;", "event", "", "notify$component_ui_carousel_release", "(Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event;)V", "notify", "Lkotlinx/coroutines/flow/Flow;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "<init>", "()V", "Companion", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
public final class CarouselCardsViewModel extends ViewModel<CarouselCardsContract.State> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<CarouselCardsContract.Event> events;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<CarouselCardsContract.Event> f28259x0 = new ActionSpec<>("carousel-cards-event");

    /* JADX INFO: compiled from: CarouselCardsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsViewModel$Companion;", "", "()V", "onEvent", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event;", "getOnEvent", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<CarouselCardsContract.Event> getOnEvent() {
            return CarouselCardsViewModel.f28259x0;
        }
    }

    public CarouselCardsViewModel() {
        super(new JsonDeserializer(CarouselCardsContract.State.INSTANCE.serializer()));
        this.events = events(f28259x0);
    }

    @NotNull
    public final Flow<CarouselCardsContract.Event> getEvents() {
        return this.events;
    }

    public final void notify$component_ui_carousel_release(@NotNull CarouselCardsContract.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        fire(f28259x0, event);
    }
}
