package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001e\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "copy", "a", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "b", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "", "getShouldClip", "()Z", "shouldClip", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public class StaticTextSelectionParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final StaticTextSelectionParams f6232c = new StaticTextSelectionParams(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LayoutCoordinates layoutCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextLayoutResult textLayoutResult;

    /* JADX INFO: compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;", "", "()V", "Empty", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "getEmpty", "()Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StaticTextSelectionParams getEmpty() {
            return StaticTextSelectionParams.f6232c;
        }
    }

    public StaticTextSelectionParams(@Nullable LayoutCoordinates layoutCoordinates, @Nullable TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            layoutCoordinates = staticTextSelectionParams.layoutCoordinates;
        }
        if ((i10 & 2) != 0) {
            textLayoutResult = staticTextSelectionParams.textLayoutResult;
        }
        return staticTextSelectionParams.copy(layoutCoordinates, textLayoutResult);
    }

    @NotNull
    public final StaticTextSelectionParams copy(@Nullable LayoutCoordinates layoutCoordinates, @Nullable TextLayoutResult textLayoutResult) {
        return new StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @Nullable
    public Path getPathForRange(int start, int end) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(start, end);
        }
        return null;
    }

    public boolean getShouldClip() {
        TextLayoutInput layoutInput;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        TextOverflow textOverflowM4333boximpl = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null) ? null : TextOverflow.m4333boximpl(layoutInput.getOverflow());
        int iM4345getVisiblegIe3tQ8 = TextOverflow.INSTANCE.m4345getVisiblegIe3tQ8();
        if (textOverflowM4333boximpl == null) {
            return false;
        }
        return TextOverflow.m4336equalsimpl0(textOverflowM4333boximpl.getF18287a(), iM4345getVisiblegIe3tQ8);
    }

    @Nullable
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
