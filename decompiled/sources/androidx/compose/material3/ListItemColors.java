package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BT\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0005J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/ListItemColors;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "containerColor$material3_release", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "", "enabled", "headlineColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "headlineColor", "leadingIconColor$material3_release", "leadingIconColor", "overlineColor$material3_release", "overlineColor", "supportingColor$material3_release", "supportingColor", "trailingIconColor$material3_release", "trailingIconColor", "supportingTextColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ListItemColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f10519i;

    public ListItemColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10511a = j10;
        this.f10512b = j11;
        this.f10513c = j12;
        this.f10514d = j13;
        this.f10515e = j14;
        this.f10516f = j15;
        this.f10517g = j16;
        this.f10518h = j17;
        this.f10519i = j18;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-380363090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-380363090, i10, -1, "androidx.compose.material3.ListItemColors.containerColor (ListItem.kt:347)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(this.f10511a), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> headlineColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1254314043);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1254314043, i10, -1, "androidx.compose.material3.ListItemColors.headlineColor (ListItem.kt:353)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10512b : this.f10517g), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> leadingIconColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(694213044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(694213044, i10, -1, "androidx.compose.material3.ListItemColors.leadingIconColor (ListItem.kt:361)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10513c : this.f10518h), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> overlineColor$material3_release(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1467587733);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1467587733, i10, -1, "androidx.compose.material3.ListItemColors.overlineColor (ListItem.kt:369)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(this.f10514d), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> supportingColor$material3_release(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1251828896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1251828896, i10, -1, "androidx.compose.material3.ListItemColors.supportingColor (ListItem.kt:375)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(this.f10515e), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trailingIconColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-778325338);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778325338, i10, -1, "androidx.compose.material3.ListItemColors.trailingIconColor (ListItem.kt:381)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10516f : this.f10519i), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
