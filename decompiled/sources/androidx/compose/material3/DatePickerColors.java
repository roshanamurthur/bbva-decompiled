package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
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

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001B¤\u0001\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u00102\u001a\u00020\b\u0012\u0006\u00103\u001a\u00020\b\u0012\u0006\u00104\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u00105\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u00107\u001a\u00020\b\u0012\u0006\u00108\u001a\u00020\b\u0012\u0006\u00109\u001a\u00020\b\u0012\u0006\u0010:\u001a\u00020\b\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u0010;\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b<\u0010=J8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R#\u0010\u001f\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\"\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR#\u0010%\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR#\u0010(\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR#\u0010+\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR#\u0010.\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001eR#\u00101\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "", "isToday", "selected", "inRange", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "dayContentColor", "animate", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "dayContainerColor", "currentYear", "yearContentColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContentColor", "yearContainerColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContainerColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "J", "getContainerColor-0d7_KjU$material3_release", "()J", "containerColor", "b", "getTitleContentColor-0d7_KjU$material3_release", "titleContentColor", "c", "getHeadlineContentColor-0d7_KjU$material3_release", "headlineContentColor", "d", "getWeekdayContentColor-0d7_KjU$material3_release", "weekdayContentColor", "e", "getSubheadContentColor-0d7_KjU$material3_release", "subheadContentColor", "q", "getTodayDateBorderColor-0d7_KjU$material3_release", "todayDateBorderColor", "r", "getDayInSelectionRangeContainerColor-0d7_KjU$material3_release", "dayInSelectionRangeContainerColor", "currentYearContentColor", "selectedYearContentColor", "selectedYearContainerColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "dayInSelectionRangeContentColor", "<init>", "(JJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DatePickerColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long titleContentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long headlineContentColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long weekdayContentColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long subheadContentColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f9911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9913l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f9915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final long todayDateBorderColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final long dayInSelectionRangeContainerColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f9919s;

    public DatePickerColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, DefaultConstructorMarker defaultConstructorMarker) {
        this.containerColor = j10;
        this.titleContentColor = j11;
        this.headlineContentColor = j12;
        this.weekdayContentColor = j13;
        this.subheadContentColor = j14;
        this.f9907f = j15;
        this.f9908g = j16;
        this.f9909h = j17;
        this.f9910i = j18;
        this.f9911j = j19;
        this.f9912k = j20;
        this.f9913l = j21;
        this.m = j22;
        this.f9914n = j23;
        this.f9915o = j24;
        this.f9916p = j25;
        this.todayDateBorderColor = j26;
        this.dayInSelectionRangeContainerColor = j27;
        this.f9919s = j28;
    }

    @Composable
    @NotNull
    public final State<Color> dayContainerColor$material3_release(boolean z10, boolean z11, boolean z12, @Nullable Composer composer, int i10) {
        long jM2543getTransparent0d7_KjU;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceableGroup(-1240482658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i10, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:611)");
        }
        if (z10) {
            jM2543getTransparent0d7_KjU = z11 ? this.f9914n : this.f9915o;
        } else {
            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
        }
        long j10 = jM2543getTransparent0d7_KjU;
        if (z12) {
            composer.startReplaceableGroup(1577406023);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1577406187);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    @Composable
    @NotNull
    public final State<Color> dayContentColor$material3_release(boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Composer composer, int i10) {
        long j10;
        long j11;
        State<Color> stateM58animateColorAsStateeuL9pac;
        composer.startReplaceableGroup(-1233694918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i10, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:576)");
        }
        if (z11 && z13) {
            j11 = this.f9913l;
        } else if (z11 && !z13) {
            j11 = this.m;
        } else {
            if (!z12 || !z13) {
                j10 = this.f9912k;
                if (!z12 || z13) {
                    if (z10) {
                        j11 = this.f9916p;
                    } else if (z13) {
                        j11 = this.f9911j;
                    }
                }
                if (z12) {
                    composer.startReplaceableGroup(379006271);
                    stateM58animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(379006329);
                    stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return stateM58animateColorAsStateeuL9pac;
            }
            j11 = this.f9919s;
        }
        j10 = j11;
        if (z12) {
            composer.startReplaceableGroup(379006271);
            stateM58animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(379006329);
            stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) other;
        return Color.m2509equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m2509equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m2509equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m2509equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m2509equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m2509equalsimpl0(this.f9907f, datePickerColors.f9907f) && Color.m2509equalsimpl0(this.f9908g, datePickerColors.f9908g) && Color.m2509equalsimpl0(this.f9909h, datePickerColors.f9909h) && Color.m2509equalsimpl0(this.f9910i, datePickerColors.f9910i) && Color.m2509equalsimpl0(this.f9911j, datePickerColors.f9911j) && Color.m2509equalsimpl0(this.f9912k, datePickerColors.f9912k) && Color.m2509equalsimpl0(this.f9913l, datePickerColors.f9913l) && Color.m2509equalsimpl0(this.m, datePickerColors.m) && Color.m2509equalsimpl0(this.f9914n, datePickerColors.f9914n) && Color.m2509equalsimpl0(this.f9915o, datePickerColors.f9915o) && Color.m2509equalsimpl0(this.f9916p, datePickerColors.f9916p) && Color.m2509equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m2509equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m2509equalsimpl0(this.f9919s, datePickerColors.f9919s);
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getDayInSelectionRangeContainerColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getDayInSelectionRangeContainerColor() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* JADX INFO: renamed from: getHeadlineContentColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    /* JADX INFO: renamed from: getSubheadContentColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getSubheadContentColor() {
        return this.subheadContentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getTodayDateBorderColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    /* JADX INFO: renamed from: getWeekdayContentColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f9919s) + androidx.collection.j.a(this.dayInSelectionRangeContainerColor, androidx.collection.j.a(this.todayDateBorderColor, androidx.collection.j.a(this.f9916p, androidx.collection.j.a(this.f9915o, androidx.collection.j.a(this.f9914n, androidx.collection.j.a(this.m, androidx.collection.j.a(this.f9913l, androidx.collection.j.a(this.f9912k, androidx.collection.j.a(this.f9911j, androidx.collection.j.a(this.f9910i, androidx.collection.j.a(this.f9909h, androidx.collection.j.a(this.f9908g, androidx.collection.j.a(this.f9907f, androidx.collection.j.a(this.subheadContentColor, androidx.collection.j.a(this.weekdayContentColor, androidx.collection.j.a(this.headlineContentColor, androidx.collection.j.a(this.titleContentColor, Color.m2515hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> yearContainerColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(488208633);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(488208633, i10, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:659)");
        }
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(z10 ? this.f9910i : Color.INSTANCE.m2543getTransparent0d7_KjU(), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> yearContentColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-1749254827);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749254827, i10, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:638)");
        }
        if (z11) {
            j10 = this.f9909h;
        } else {
            j10 = z10 ? this.f9908g : this.f9907f;
        }
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }
}
