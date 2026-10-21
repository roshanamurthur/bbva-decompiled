package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B,\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/IconButtonColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "containerColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "contentColor$material3_release", "contentColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class IconButtonColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10364d;

    public IconButtonColors(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10361a = j10;
        this.f10362b = j11;
        this.f10363c = j12;
        this.f10364d = j13;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1876083926);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1876083926, i10, -1, "androidx.compose.material3.IconButtonColors.containerColor (IconButton.kt:822)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10361a : this.f10363c), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> contentColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(613133646);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(613133646, i10, -1, "androidx.compose.material3.IconButtonColors.contentColor (IconButton.kt:832)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10362b : this.f10364d), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) other;
        return Color.m2509equalsimpl0(this.f10361a, iconButtonColors.f10361a) && Color.m2509equalsimpl0(this.f10362b, iconButtonColors.f10362b) && Color.m2509equalsimpl0(this.f10363c, iconButtonColors.f10363c) && Color.m2509equalsimpl0(this.f10364d, iconButtonColors.f10364d);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f10364d) + androidx.collection.j.a(this.f10363c, androidx.collection.j.a(this.f10362b, Color.m2515hashCodeimpl(this.f10361a) * 31, 31), 31);
    }
}
