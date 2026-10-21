package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OverscrollConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001e\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getGlowColor-0d7_KjU", "()J", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "b", "Landroidx/compose/foundation/layout/PaddingValues;", "getDrawPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "drawPadding", "<init>", "(JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class OverscrollConfiguration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long glowColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PaddingValues drawPadding;

    public OverscrollConfiguration(long j10, PaddingValues drawPadding, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(drawPadding, "drawPadding");
        this.glowColor = j10;
        this.drawPadding = drawPadding;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(OverscrollConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) other;
        return Color.m2509equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && Intrinsics.areEqual(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    @NotNull
    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* JADX INFO: renamed from: getGlowColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public int hashCode() {
        return this.drawPadding.hashCode() + (Color.m2515hashCodeimpl(this.glowColor) * 31);
    }

    @NotNull
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m2516toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ OverscrollConfiguration(long j10, PaddingValues paddingValues, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ColorKt.Color(4284900966L) : j10, (i10 & 2) != 0 ? PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }
}
