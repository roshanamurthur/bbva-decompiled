package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/MarqueeSpacing;", "", "calculateSpacing", "", "Landroidx/compose/ui/unit/Density;", "contentWidth", "containerWidth", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MarqueeSpacing {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f3426a;

    /* JADX INFO: compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/MarqueeSpacing$Companion;", "", "()V", "fractionOfContainer", "Landroidx/compose/foundation/MarqueeSpacing;", "fraction", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f3426a = new Companion();

        /* JADX INFO: compiled from: BasicMarquee.kt */
        public static final class a implements MarqueeSpacing {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f3427a;

            public a(float f6) {
                this.f3427a = f6;
            }

            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(@NotNull Density MarqueeSpacing, int i10, int i11) {
                Intrinsics.checkNotNullParameter(MarqueeSpacing, "$this$MarqueeSpacing");
                return mk.c.roundToInt(this.f3427a * i11);
            }
        }

        @ExperimentalFoundationApi
        @NotNull
        public final MarqueeSpacing fractionOfContainer(float fraction) {
            return new a(fraction);
        }
    }

    @ExperimentalFoundationApi
    int calculateSpacing(@NotNull Density density, int i10, int i11);
}
