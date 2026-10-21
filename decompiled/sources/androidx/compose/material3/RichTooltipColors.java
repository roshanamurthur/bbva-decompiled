package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR \u0010\u0012\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR \u0010\u0015\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/RichTooltipColors;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/graphics/Color;", "a", "J", "getContainerColor-0d7_KjU", "()J", "containerColor", "b", "getContentColor-0d7_KjU", "contentColor", "c", "getTitleContentColor-0d7_KjU", "titleContentColor", "d", "getActionContentColor-0d7_KjU", "actionContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@Immutable
public final class RichTooltipColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long titleContentColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long actionContentColor;

    public RichTooltipColors(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.titleContentColor = j12;
        this.actionContentColor = j13;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) other;
        return Color.m2509equalsimpl0(this.containerColor, richTooltipColors.containerColor) && Color.m2509equalsimpl0(this.contentColor, richTooltipColors.contentColor) && Color.m2509equalsimpl0(this.titleContentColor, richTooltipColors.titleContentColor) && Color.m2509equalsimpl0(this.actionContentColor, richTooltipColors.actionContentColor);
    }

    /* JADX INFO: renamed from: getActionContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActionContentColor() {
        return this.actionContentColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.actionContentColor) + androidx.collection.j.a(this.titleContentColor, androidx.collection.j.a(this.contentColor, Color.m2515hashCodeimpl(this.containerColor) * 31, 31), 31);
    }
}
