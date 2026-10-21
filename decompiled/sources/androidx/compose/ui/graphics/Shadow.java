package androidx.compose.ui.graphics;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B(\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R)\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R)\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "", "blurRadius", "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "copy", "a", "J", "getColor-0d7_KjU", "()J", "getColor-0d7_KjU$annotations", "()V", "b", "getOffset-F1C5BW0", "getOffset-F1C5BW0$annotations", "c", "F", "getBlurRadius", "()F", "getBlurRadius$annotations", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class Shadow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Shadow f15720d = new Shadow(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float blurRadius;

    public Shadow(long j10, long j11, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this.color = j10;
        this.offset = j11;
        this.blurRadius = f6;
    }

    /* JADX INFO: renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m2784copyqcb84PM$default(Shadow shadow, long j10, long j11, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = shadow.color;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = shadow.offset;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f6 = shadow.blurRadius;
        }
        return shadow.m2787copyqcb84PM(j12, j13, f6);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m2787copyqcb84PM(long color, long offset, float blurRadius) {
        return new Shadow(color, offset, blurRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        return Color.m2509equalsimpl0(this.color, shadow.color) && Offset.m2272equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.blurRadius) + ((Offset.m2277hashCodeimpl(this.offset) + (Color.m2515hashCodeimpl(this.color) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        sb2.append((Object) Color.m2516toStringimpl(this.color));
        sb2.append(", offset=");
        sb2.append((Object) Offset.m2283toStringimpl(this.offset));
        sb2.append(", blurRadius=");
        return u.i(sb2, this.blurRadius, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ Shadow(long j10, long j11, float f6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ColorKt.Color(4278190080L) : j10, (i10 & 2) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j11, (i10 & 4) != 0 ? 0.0f : f6, null);
    }

    /* JADX INFO: compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "()V", "None", "Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Shadow getNone() {
            return Shadow.f15720d;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m2785getColor0d7_KjU$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m2786getOffsetF1C5BW0$annotations() {
    }
}
