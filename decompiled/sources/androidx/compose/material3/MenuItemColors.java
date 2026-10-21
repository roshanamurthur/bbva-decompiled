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

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/MenuItemColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "textColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "textColor", "leadingIconColor$material3_release", "leadingIconColor", "trailingIconColor$material3_release", "trailingIconColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class MenuItemColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10610f;

    public MenuItemColors(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10605a = j10;
        this.f10606b = j11;
        this.f10607c = j12;
        this.f10608d = j13;
        this.f10609e = j14;
        this.f10610f = j15;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) other;
        return Color.m2509equalsimpl0(this.f10605a, menuItemColors.f10605a) && Color.m2509equalsimpl0(this.f10606b, menuItemColors.f10606b) && Color.m2509equalsimpl0(this.f10607c, menuItemColors.f10607c) && Color.m2509equalsimpl0(this.f10608d, menuItemColors.f10608d) && Color.m2509equalsimpl0(this.f10609e, menuItemColors.f10609e) && Color.m2509equalsimpl0(this.f10610f, menuItemColors.f10610f);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f10610f) + androidx.collection.j.a(this.f10609e, androidx.collection.j.a(this.f10608d, androidx.collection.j.a(this.f10607c, androidx.collection.j.a(this.f10606b, Color.m2515hashCodeimpl(this.f10605a) * 31, 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> leadingIconColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1521013607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1521013607, i10, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:393)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10606b : this.f10609e), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> textColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1023108655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1023108655, i10, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:383)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10605a : this.f10608d), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trailingIconColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1024062809);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1024062809, i10, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:403)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f10607c : this.f10610f), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
