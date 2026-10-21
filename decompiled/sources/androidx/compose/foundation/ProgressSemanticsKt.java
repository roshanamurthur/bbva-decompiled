package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProgressSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"progressSemantics", "Landroidx/compose/ui/Modifier;", "value", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProgressSemanticsKt {

    /* JADX INFO: compiled from: ProgressSemantics.kt */
    public static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f3455p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f3456q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f3457r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10) {
            super(1);
            this.f3455p0 = f6;
            this.f3456q0 = closedFloatingPointRange;
            this.f3457r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            Float fValueOf = Float.valueOf(this.f3455p0);
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f3456q0;
            SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, new ProgressBarRangeInfo(((Number) kotlin.ranges.c.coerceIn(fValueOf, closedFloatingPointRange)).floatValue(), closedFloatingPointRange, this.f3457r0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressSemantics.kt */
    public static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f3458p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, ProgressBarRangeInfo.INSTANCE.getIndeterminate());
            return Unit.INSTANCE;
        }
    }

    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier, float f6, @NotNull ClosedFloatingPointRange<Float> valueRange, int i10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(valueRange, "valueRange");
        return SemanticsModifierKt.semantics(modifier, true, new a(f6, valueRange, i10));
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f6, ClosedFloatingPointRange closedFloatingPointRange, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            closedFloatingPointRange = ok.e.rangeTo(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return progressSemantics(modifier, f6, closedFloatingPointRange, i10);
    }

    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, b.f3458p0);
    }
}
