package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%B>\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001dø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "a", "F", "getWidth", "()F", "width", "b", "getMiter", "miter", "Landroidx/compose/ui/graphics/StrokeCap;", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCap-KaPHkGw", "()I", "cap", "Landroidx/compose/ui/graphics/StrokeJoin;", "d", "getJoin-LxFBmk8", "join", "Landroidx/compose/ui/graphics/PathEffect;", "e", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "<init>", "(FFIILandroidx/compose/ui/graphics/PathEffect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class Stroke extends DrawStyle {
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float miter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int cap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int join;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PathEffect pathEffect;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15864f = StrokeCap.INSTANCE.m2808getButtKaPHkGw();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f15865g = StrokeJoin.INSTANCE.m2819getMiterLxFBmk8();

    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "()V", "DefaultCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getDefaultCap-KaPHkGw", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "DefaultJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getDefaultJoin-LxFBmk8", "DefaultMiter", "", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m2998getDefaultCapKaPHkGw() {
            return Stroke.f15864f;
        }

        /* JADX INFO: renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m2999getDefaultJoinLxFBmk8() {
            return Stroke.f15865g;
        }
    }

    public /* synthetic */ Stroke(float f6, float f10, int i10, int i11, PathEffect pathEffect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f6, (i12 & 2) != 0 ? 4.0f : f10, (i12 & 4) != 0 ? f15864f : i10, (i12 & 8) != 0 ? f15865g : i11, (i12 & 16) != 0 ? null : pathEffect, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m2804equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m2814equalsimpl0(this.join, stroke.join) && Intrinsics.areEqual(this.pathEffect, stroke.pathEffect);
    }

    /* JADX INFO: renamed from: getCap-KaPHkGw, reason: not valid java name and from getter */
    public final int getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: getJoin-LxFBmk8, reason: not valid java name and from getter */
    public final int getJoin() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    @Nullable
    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iM2815hashCodeimpl = (StrokeJoin.m2815hashCodeimpl(this.join) + ((StrokeCap.m2805hashCodeimpl(this.cap) + z1.a(this.miter, Float.floatToIntBits(this.width) * 31, 31)) * 31)) * 31;
        PathEffect pathEffect = this.pathEffect;
        return iM2815hashCodeimpl + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m2806toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m2816toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + RootService.CLOSE_BRACKET;
    }

    public Stroke(float f6, float f10, int i10, int i11, PathEffect pathEffect, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        this.width = f6;
        this.miter = f10;
        this.cap = i10;
        this.join = i11;
        this.pathEffect = pathEffect;
    }
}
