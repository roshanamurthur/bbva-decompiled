package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B|\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b,\u0010-J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0006J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\u0006J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016R#\u0010\u0018\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R#\u0010\u001e\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R#\u0010!\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "", "selected", "Landroidx/compose/ui/graphics/Color;", "periodSelectorContainerColor-vNxB06k$material3_release", "(Z)J", "periodSelectorContainerColor", "periodSelectorContentColor-vNxB06k$material3_release", "periodSelectorContentColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContentColor-vNxB06k$material3_release", "timeSelectorContentColor", "clockDialContentColor-vNxB06k$material3_release", "clockDialContentColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "J", "getClockDialColor-0d7_KjU$material3_release", "()J", "clockDialColor", "b", "getSelectorColor-0d7_KjU$material3_release", "selectorColor", "c", "getContainerColor-0d7_KjU$material3_release", "containerColor", "d", "getPeriodSelectorBorderColor-0d7_KjU$material3_release", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class TimePickerColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long clockDialColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long selectorColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long containerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long periodSelectorBorderColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f12340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12341l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f12342n;

    public TimePickerColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, DefaultConstructorMarker defaultConstructorMarker) {
        this.clockDialColor = j10;
        this.selectorColor = j11;
        this.containerColor = j12;
        this.periodSelectorBorderColor = j13;
        this.f12334e = j14;
        this.f12335f = j15;
        this.f12336g = j16;
        this.f12337h = j17;
        this.f12338i = j18;
        this.f12339j = j19;
        this.f12340k = j20;
        this.f12341l = j21;
        this.m = j22;
        this.f12342n = j23;
    }

    /* JADX INFO: renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1392clockDialContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.f12334e : this.f12335f;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TimePickerColors.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.material3.TimePickerColors");
        TimePickerColors timePickerColors = (TimePickerColors) other;
        return Color.m2509equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m2509equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m2509equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m2509equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m2509equalsimpl0(this.f12336g, timePickerColors.f12336g) && Color.m2509equalsimpl0(this.f12337h, timePickerColors.f12337h) && Color.m2509equalsimpl0(this.f12338i, timePickerColors.f12338i) && Color.m2509equalsimpl0(this.f12339j, timePickerColors.f12339j) && Color.m2509equalsimpl0(this.f12340k, timePickerColors.f12340k) && Color.m2509equalsimpl0(this.f12341l, timePickerColors.f12341l) && Color.m2509equalsimpl0(this.m, timePickerColors.m) && Color.m2509equalsimpl0(this.f12342n, timePickerColors.f12342n);
    }

    /* JADX INFO: renamed from: getClockDialColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getClockDialColor() {
        return this.clockDialColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorBorderColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }

    /* JADX INFO: renamed from: getSelectorColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getSelectorColor() {
        return this.selectorColor;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f12342n) + androidx.collection.j.a(this.m, androidx.collection.j.a(this.f12341l, androidx.collection.j.a(this.f12340k, androidx.collection.j.a(this.f12339j, androidx.collection.j.a(this.f12338i, androidx.collection.j.a(this.f12337h, androidx.collection.j.a(this.f12336g, androidx.collection.j.a(this.periodSelectorBorderColor, androidx.collection.j.a(this.containerColor, androidx.collection.j.a(this.selectorColor, Color.m2515hashCodeimpl(this.clockDialColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1397periodSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.f12336g : this.f12337h;
    }

    /* JADX INFO: renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1398periodSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.f12338i : this.f12339j;
    }

    /* JADX INFO: renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1399timeSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.f12340k : this.f12341l;
    }

    /* JADX INFO: renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1400timeSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.m : this.f12342n;
    }
}
