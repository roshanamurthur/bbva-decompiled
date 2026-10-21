package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0012\u001a\u00020\u00068@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/NavigationBarItemColors;", "", "", "selected", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "iconColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "iconColor", "textColor$material3_release", "textColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "getIndicatorColor-0d7_KjU$material3_release", "()J", "indicatorColor", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class NavigationBarItemColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10709g;

    public NavigationBarItemColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10703a = j10;
        this.f10704b = j11;
        this.f10705c = j12;
        this.f10706d = j13;
        this.f10707e = j14;
        this.f10708f = j15;
        this.f10709g = j16;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) other;
        return Color.m2509equalsimpl0(this.f10703a, navigationBarItemColors.f10703a) && Color.m2509equalsimpl0(this.f10706d, navigationBarItemColors.f10706d) && Color.m2509equalsimpl0(this.f10704b, navigationBarItemColors.f10704b) && Color.m2509equalsimpl0(this.f10707e, navigationBarItemColors.f10707e) && Color.m2509equalsimpl0(this.f10705c, navigationBarItemColors.f10705c) && Color.m2509equalsimpl0(this.f10708f, navigationBarItemColors.f10708f) && Color.m2509equalsimpl0(this.f10709g, navigationBarItemColors.f10709g);
    }

    /* JADX INFO: renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getF10705c() {
        return this.f10705c;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f10709g) + androidx.collection.j.a(this.f10708f, androidx.collection.j.a(this.f10705c, androidx.collection.j.a(this.f10707e, androidx.collection.j.a(this.f10704b, androidx.collection.j.a(this.f10706d, Color.m2515hashCodeimpl(this.f10703a) * 31, 31), 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> iconColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-1012982249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1012982249, i10, -1, "androidx.compose.material3.NavigationBarItemColors.iconColor (NavigationBar.kt:350)");
        }
        if (z11) {
            j10 = z10 ? this.f10703a : this.f10706d;
        } else {
            j10 = this.f10708f;
        }
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> textColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-1833866293);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1833866293, i10, -1, "androidx.compose.material3.NavigationBarItemColors.textColor (NavigationBar.kt:369)");
        }
        if (z11) {
            j10 = z10 ? this.f10704b : this.f10707e;
        } else {
            j10 = this.f10709g;
        }
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }
}
