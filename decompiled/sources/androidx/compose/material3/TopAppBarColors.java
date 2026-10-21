package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R#\u0010\u0011\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0014\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R#\u0010\u0017\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "", "colorTransitionFraction", "Landroidx/compose/ui/graphics/Color;", "containerColor-XeAY9LY$material3_release", "(FLandroidx/compose/runtime/Composer;I)J", "containerColor", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "c", "J", "getNavigationIconContentColor-0d7_KjU$material3_release", "()J", "navigationIconContentColor", "d", "getTitleContentColor-0d7_KjU$material3_release", "titleContentColor", "e", "getActionIconContentColor-0d7_KjU$material3_release", "actionIconContentColor", "scrolledContainerColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class TopAppBarColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long navigationIconContentColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long titleContentColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long actionIconContentColor;

    public TopAppBarColors(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this.f12606a = j10;
        this.f12607b = j11;
        this.navigationIconContentColor = j12;
        this.titleContentColor = j13;
        this.actionIconContentColor = j14;
    }

    @Composable
    /* JADX INFO: renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m1492containerColorXeAY9LY$material3_release(float f6, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1456204135);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1456204135, i10, -1, "androidx.compose.material3.TopAppBarColors.containerColor (AppBar.kt:936)");
        }
        long jM2558lerpjxsXWHM = ColorKt.m2558lerpjxsXWHM(this.f12606a, this.f12607b, EasingKt.getFastOutLinearInEasing().transform(f6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM2558lerpjxsXWHM;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) other;
        return Color.m2509equalsimpl0(this.f12606a, topAppBarColors.f12606a) && Color.m2509equalsimpl0(this.f12607b, topAppBarColors.f12607b) && Color.m2509equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m2509equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m2509equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor);
    }

    /* JADX INFO: renamed from: getActionIconContentColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* JADX INFO: renamed from: getNavigationIconContentColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.actionIconContentColor) + androidx.collection.j.a(this.titleContentColor, androidx.collection.j.a(this.navigationIconContentColor, androidx.collection.j.a(this.f12607b, Color.m2515hashCodeimpl(this.f12606a) * 31, 31), 31), 31);
    }
}
