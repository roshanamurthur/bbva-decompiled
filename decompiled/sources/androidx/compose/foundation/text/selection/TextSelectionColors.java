package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextSelectionColors.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getHandleColor-0d7_KjU", "()J", "handleColor", "b", "getBackgroundColor-0d7_KjU", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class TextSelectionColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long handleColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long backgroundColor;

    public TextSelectionColors(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this.handleColor = j10;
        this.backgroundColor = j11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) other;
        return Color.m2509equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m2509equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getHandleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getHandleColor() {
        return this.handleColor;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.backgroundColor) + (Color.m2515hashCodeimpl(this.handleColor) * 31);
    }

    @NotNull
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m2516toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m2516toStringimpl(this.backgroundColor)) + RootService.CLOSE_BRACKET;
    }
}
