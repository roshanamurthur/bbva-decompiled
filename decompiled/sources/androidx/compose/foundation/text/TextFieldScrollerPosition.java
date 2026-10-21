package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\u0019\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u000b¢\u0006\u0004\b1\u00102B\t\b\u0016¢\u0006\u0004\b1\u00103J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J'\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010!\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR+\u0010(\u001a\u00020\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "", "update", "", "cursorStart", "cursorEnd", "coerceOffset$foundation_release", "(FFI)V", "coerceOffset", "Landroidx/compose/ui/text/TextRange;", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", "a", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "()F", "setOffset", "(F)V", TypedValues.CycleType.S_WAVE_OFFSET, "b", "getMaximum", "setMaximum", "maximum", "d", "J", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "previousSelection", "e", "Landroidx/compose/runtime/MutableState;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "initialOrientation", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,370:1\n75#2:371\n108#2,2:372\n75#2:374\n108#2,2:375\n81#3:377\n107#3,2:378\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n254#1:371\n254#1:372,2\n260#1:374\n260#1:375,2\n275#1:377\n275#1:378,2\n*E\n"})
public final class TextFieldScrollerPosition {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Saver<TextFieldScrollerPosition, Object> f6038f = ListSaverKt.listSaver(a.f6044p0, b.f6045p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableFloatState offset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableFloatState maximum;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Rect f6041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long previousSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState orientation;

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.f6038f;
        }
    }

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    public static final class a extends Lambda implements Function2<SaverScope, TextFieldScrollerPosition, List<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6044p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            SaverScope listSaver = saverScope;
            TextFieldScrollerPosition it = textFieldScrollerPosition;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(it.getOffset());
            objArr[1] = Boolean.valueOf(it.getOrientation() == Orientation.Vertical);
            return CollectionsKt__CollectionsKt.listOf(objArr);
        }
    }

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    public static final class b extends Lambda implements Function1<List<? extends Object>, TextFieldScrollerPosition> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f6045p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            List<? extends Object> restored = list;
            Intrinsics.checkNotNullParameter(restored, "restored");
            Object obj = restored.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = restored.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    }

    public TextFieldScrollerPosition(@NotNull Orientation initialOrientation, float f6) {
        Intrinsics.checkNotNullParameter(initialOrientation, "initialOrientation");
        this.offset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f6);
        this.maximum = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f6041c = Rect.INSTANCE.getZero();
        this.previousSelection = TextRange.INSTANCE.m3972getZerod9O1mEE();
        this.orientation = SnapshotStateKt.mutableStateOf(initialOrientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    public final void coerceOffset$foundation_release(float cursorStart, float cursorEnd, int containerSize) {
        float f6;
        float offset = getOffset();
        float f10 = containerSize;
        float f11 = offset + f10;
        if (cursorEnd <= f11 && (cursorStart >= offset || cursorEnd - cursorStart <= f10)) {
            f6 = (cursorStart >= offset || cursorEnd - cursorStart > f10) ? 0.0f : cursorStart - offset;
        } else {
            f6 = cursorEnd - f11;
        }
        setOffset(getOffset() + f6);
    }

    public final float getMaximum() {
        return this.maximum.getFloatValue();
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    /* JADX INFO: renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m552getOffsetToFollow5zctL8(long selection) {
        if (TextRange.m3967getStartimpl(selection) != TextRange.m3967getStartimpl(this.previousSelection)) {
            return TextRange.m3967getStartimpl(selection);
        }
        return TextRange.m3962getEndimpl(selection) != TextRange.m3962getEndimpl(this.previousSelection) ? TextRange.m3962getEndimpl(selection) : TextRange.m3965getMinimpl(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Orientation getOrientation() {
        return (Orientation) this.orientation.getValue();
    }

    /* JADX INFO: renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPreviousSelection() {
        return this.previousSelection;
    }

    public final void setOffset(float f6) {
        this.offset.setFloatValue(f6);
    }

    public final void setOrientation(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation.setValue(orientation);
    }

    /* JADX INFO: renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m554setPreviousSelection5zctL8(long j10) {
        this.previousSelection = j10;
    }

    public final void update(@NotNull Orientation orientation, @NotNull Rect cursorRect, int containerSize, int textFieldSize) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(cursorRect, "cursorRect");
        float f6 = textFieldSize - containerSize;
        this.maximum.setFloatValue(f6);
        if (cursorRect.getLeft() != this.f6041c.getLeft() || cursorRect.getTop() != this.f6041c.getTop()) {
            boolean z10 = orientation == Orientation.Vertical;
            coerceOffset$foundation_release(z10 ? cursorRect.getTop() : cursorRect.getLeft(), z10 ? cursorRect.getBottom() : cursorRect.getRight(), containerSize);
            this.f6041c = cursorRect;
        }
        setOffset(kotlin.ranges.c.coerceIn(getOffset(), 0.0f, f6));
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i10 & 2) != 0 ? 0.0f : f6);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
