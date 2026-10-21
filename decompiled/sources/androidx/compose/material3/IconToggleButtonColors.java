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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "contentColor$material3_release", "contentColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class IconToggleButtonColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10475f;

    public IconToggleButtonColors(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10470a = j10;
        this.f10471b = j11;
        this.f10472c = j12;
        this.f10473d = j13;
        this.f10474e = j14;
        this.f10475f = j15;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(1175394478);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i10, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:884)");
        }
        if (z10) {
            j10 = !z11 ? this.f10470a : this.f10474e;
        } else {
            j10 = this.f10472c;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> contentColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(1340854054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i10, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:900)");
        }
        if (z10) {
            j10 = !z11 ? this.f10471b : this.f10475f;
        } else {
            j10 = this.f10473d;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
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
        if (other == null || !(other instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) other;
        return Color.m2509equalsimpl0(this.f10470a, iconToggleButtonColors.f10470a) && Color.m2509equalsimpl0(this.f10471b, iconToggleButtonColors.f10471b) && Color.m2509equalsimpl0(this.f10472c, iconToggleButtonColors.f10472c) && Color.m2509equalsimpl0(this.f10473d, iconToggleButtonColors.f10473d) && Color.m2509equalsimpl0(this.f10474e, iconToggleButtonColors.f10474e) && Color.m2509equalsimpl0(this.f10475f, iconToggleButtonColors.f10475f);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f10475f) + androidx.collection.j.a(this.f10474e, androidx.collection.j.a(this.f10473d, androidx.collection.j.a(this.f10472c, androidx.collection.j.a(this.f10471b, Color.m2515hashCodeimpl(this.f10470a) * 31, 31), 31), 31), 31);
    }
}
