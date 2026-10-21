package e0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n implements LayoutModifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextFieldScrollerPosition f68250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TransformedText f68252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<TextLayoutResultProxy> f68253d;

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f68254p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ n f68255q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68256r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f68257s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MeasureScope measureScope, n nVar, Placeable placeable, int i10) {
            super(1);
            this.f68254p0 = measureScope;
            this.f68255q0 = nVar;
            this.f68256r0 = placeable;
            this.f68257s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            MeasureScope measureScope = this.f68254p0;
            n nVar = this.f68255q0;
            int i10 = nVar.f68251b;
            TransformedText transformedText = nVar.f68252c;
            TextLayoutResultProxy textLayoutResultProxyInvoke = nVar.f68253d.invoke();
            TextLayoutResult value = textLayoutResultProxyInvoke != null ? textLayoutResultProxyInvoke.getValue() : null;
            Placeable placeable = this.f68256r0;
            Rect rectAccess$getCursorRectInScroller = TextFieldScrollKt.access$getCursorRectInScroller(measureScope, i10, transformedText, value, false, placeable.getWidth());
            Orientation orientation = Orientation.Vertical;
            int i11 = this.f68257s0;
            int height = placeable.getHeight();
            TextFieldScrollerPosition textFieldScrollerPosition = nVar.f68250a;
            textFieldScrollerPosition.update(orientation, rectAccess$getCursorRectInScroller, i11, height);
            Placeable.PlacementScope.placeRelative$default(layout, this.f68256r0, 0, mk.c.roundToInt(-textFieldScrollerPosition.getOffset()), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public n(@NotNull TextFieldScrollerPosition scrollerPosition, int i10, @NotNull TransformedText transformedText, @NotNull Function0<TextLayoutResultProxy> textLayoutResultProvider) {
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(transformedText, "transformedText");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        this.f68250a = scrollerPosition;
        this.f68251b = i10;
        this.f68252c = transformedText;
        this.f68253d = textLayoutResultProvider;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f68250a, nVar.f68250a) && this.f68251b == nVar.f68251b && Intrinsics.areEqual(this.f68252c, nVar.f68252c) && Intrinsics.areEqual(this.f68253d, nVar.f68253d);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    public final int hashCode() {
        return this.f68253d.hashCode() + ((this.f68252c.hashCode() + (((this.f68250a.hashCode() * 31) + this.f68251b) * 31)) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = Math.min(placeableMo3575measureBRTryo0.getHeight(), Constraints.m4356getMaxHeightimpl(j10));
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), iMin, null, new a(measure, this, placeableMo3575measureBRTryo0, iMin), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return g1.e.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }

    @NotNull
    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f68250a + ", cursorOffset=" + this.f68251b + ", transformedText=" + this.f68252c + ", textLayoutResultProvider=" + this.f68253d + RootService.CLOSE_BRACKET;
    }
}
