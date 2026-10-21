package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "updateTextLayout", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "updateGlobalPosition", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "draw", "Landroidx/compose/ui/Modifier;", "u0", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/ui/graphics/Color;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "params", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,360:1\n214#2,8:361\n261#2,11:369\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n149#1:361,8\n149#1:369,11\n*E\n"})
public final class SelectionController implements RememberObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SelectionRegistrar f6214p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f6215q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public StaticTextSelectionParams f6216r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Selectable f6217s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f6218t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Modifier modifier;

    /* JADX INFO: compiled from: SelectionController.kt */
    public static final class a extends Lambda implements Function0<LayoutCoordinates> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutCoordinates invoke() {
            return SelectionController.this.f6216r0.getLayoutCoordinates();
        }
    }

    /* JADX INFO: compiled from: SelectionController.kt */
    public static final class b extends Lambda implements Function0<TextLayoutResult> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextLayoutResult invoke() {
            return SelectionController.this.f6216r0.getTextLayoutResult();
        }
    }

    public SelectionController(SelectionRegistrar selectionRegistrar, long j10, StaticTextSelectionParams params, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f6214p0 = selectionRegistrar;
        this.f6215q0 = j10;
        this.f6216r0 = params;
        long jNextSelectableId = selectionRegistrar.nextSelectableId();
        this.f6218t0 = jNextSelectableId;
        this.modifier = BasicText_androidKt.textPointerHoverIcon(SelectionControllerKt.access$makeSelectionModifier(selectionRegistrar, jNextSelectableId, new f0.a(this), new f0.b(this), TouchMode_androidKt.isInTouchMode()), selectionRegistrar);
    }

    public final void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "drawScope");
        Selection selection = this.f6214p0.getSubselections().get(Long.valueOf(this.f6218t0));
        if (selection == null) {
            return;
        }
        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.f6217s0;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        Path pathForRange = this.f6216r0.getPathForRange(c.coerceAtMost(offset, lastVisibleOffset), c.coerceAtMost(offset2, lastVisibleOffset));
        if (pathForRange == null) {
            return;
        }
        if (!this.f6216r0.getShouldClip()) {
            a1.b.G(drawScope, pathForRange, this.f6215q0, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc());
        float fM2341getHeightimpl = Size.m2341getHeightimpl(drawScope.mo2909getSizeNHjbRc());
        int iM2497getIntersectrtfAjoo = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2918clipRectN_I0leg(0.0f, 0.0f, fM2344getWidthimpl, fM2341getHeightimpl, iM2497getIntersectrtfAjoo);
        a1.b.G(drawScope, pathForRange, this.f6215q0, 0.0f, null, null, 0, 60, null);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.f6217s0;
        if (selectable != null) {
            this.f6214p0.unsubscribe(selectable);
            this.f6217s0 = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.f6217s0;
        if (selectable != null) {
            this.f6214p0.unsubscribe(selectable);
            this.f6217s0 = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.f6217s0 = this.f6214p0.subscribe(new MultiWidgetSelectionDelegate(this.f6218t0, new a(), new b()));
    }

    public final void updateGlobalPosition(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f6216r0 = StaticTextSelectionParams.copy$default(this.f6216r0, coordinates, null, 2, null);
    }

    public final void updateTextLayout(@NotNull TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        this.f6216r0 = StaticTextSelectionParams.copy$default(this.f6216r0, null, textLayoutResult, 1, null);
    }

    public /* synthetic */ SelectionController(SelectionRegistrar selectionRegistrar, long j10, StaticTextSelectionParams staticTextSelectionParams, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectionRegistrar, j10, (i10 & 4) != 0 ? StaticTextSelectionParams.INSTANCE.getEmpty() : staticTextSelectionParams, null);
    }
}
