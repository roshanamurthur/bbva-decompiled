package j5;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bbva.component.ui.carousel.cards.view.compose.CarouselCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CarouselCard.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f78769p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10) {
        super(2);
        this.f78769p0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        CarouselCardKt.access$CarouselCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(this.f78769p0 | 1));
        return Unit.INSTANCE;
    }
}
