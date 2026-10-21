package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0014\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u0004\u0018\u00010\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "", "", "toString-impl", "(Landroidx/compose/ui/graphics/Shape;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/ui/graphics/Shape;)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(Landroidx/compose/ui/graphics/Shape;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/ui/graphics/Shape;", "a", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "shape", "constructor-impl", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/graphics/Shape;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class BlurredEdgeTreatment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Shape f15438b = m2191constructorimpl(RectangleShapeKt.getRectangleShape());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Shape f15439c = m2191constructorimpl(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Shape shape;

    /* JADX INFO: compiled from: Blur.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment$Companion;", "", "()V", "Rectangle", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "getRectangle---Goahg", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Shape;", "Unbounded", "getUnbounded---Goahg", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m2197getRectangleGoahg() {
            return BlurredEdgeTreatment.f15438b;
        }

        @NotNull
        /* JADX INFO: renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m2198getUnboundedGoahg() {
            return BlurredEdgeTreatment.f15439c;
        }
    }

    public /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m2190boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2192equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && Intrinsics.areEqual(shape, ((BlurredEdgeTreatment) obj).m2196unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2193equalsimpl0(Shape shape, Shape shape2) {
        return Intrinsics.areEqual(shape, shape2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2194hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2195toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m2192equalsimpl(this.shape, obj);
    }

    @Nullable
    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m2194hashCodeimpl(this.shape);
    }

    public String toString() {
        return m2195toStringimpl(this.shape);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m2196unboximpl() {
        return this.shape;
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Shape m2191constructorimpl(@Nullable Shape shape) {
        return shape;
    }
}
