package com.veridas.math.geometry;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Rectangle.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\b\u0012\u0006\u0010\u0006\u001a\u00020\b¢\u0006\u0002\u0010\tB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0002\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\f\u0012\u0006\u0010\u0005\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\f¢\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fB\u0017\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0002\u0010\u0012B\u001d\u0012\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015\u0012\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0002\u0010\u0017J\n\u0010\u001b\u001a\u00060\u0014j\u0002`\u0015J\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0000J\u0006\u0010\u001f\u001a\u00020\u0003J\u0015\u0010 \u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150!¢\u0006\u0002\u0010\"J\n\u0010#\u001a\u00060\u0014j\u0002`\u0015J\u0015\u0010$\u001a\u00020%2\n\u0010&\u001a\u00060\u0014j\u0002`\u0015H\u0086\u0002J\u000e\u0010'\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u0000J\u0013\u0010(\u001a\u00020%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010)\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010*\u001a\u00020\nH\u0086\u0002J\b\u0010+\u001a\u00020\nH\u0016J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010,\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u0000J\u0006\u0010-\u001a\u00020%J\u0006\u0010.\u001a\u00020%J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u00100\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u0000J\u0011\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u000203H\u0086\u0002J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000207H\u0016J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u00108\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u0000R\u0015\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006:"}, d2 = {"Lcom/veridas/math/geometry/Rectangle;", "", "x", "", "y", "width", "height", "(DDDD)V", "", "(FFFF)V", "", "(IIII)V", "", "(JJJJ)V", "value", "(I)V", "positionValue", "sizeValue", "(II)V", "position", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "dimensions", "(Lcom/veridas/math/geometry/Vector2;Lcom/veridas/math/geometry/Vector2;)V", "getDimensions", "()Lcom/veridas/math/geometry/Vector2;", "getPosition", "absoluteCenter", "area", "areaDelta", "other", "aspectRatio", "boundaries", "", "()[Lcom/veridas/math/geometry/Vector2;", "center", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "p", "envelops", "equals", "get", FirebaseAnalytics.Param.INDEX, GenerateActivationFormCommand.HASH_CODE, "intersects", "isEmpty", "isNotEmpty", "merge", "overlays", "times", "matrix", "Lcom/veridas/math/geometry/Matrix;", "toRect", "Landroid/graphics/Rect;", "toString", "", "within", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Rectangle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Rectangle EMPTY = new Rectangle(0, 0, 0, 0);

    @NotNull
    private final Vector2 dimensions;

    @NotNull
    private final Vector2 position;

    /* JADX INFO: compiled from: Rectangle.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u00060\u000fj\u0002`\u0012H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/veridas/math/geometry/Rectangle$Companion;", "", "()V", "EMPTY", "Lcom/veridas/math/geometry/Rectangle;", "getEMPTY", "()Lcom/veridas/math/geometry/Rectangle;", "fit", "", "rectangle", "onto", "from", "point", "Landroid/graphics/Point;", "parent", "Lcom/veridas/math/geometry/Vector2;", "rect", "Landroid/graphics/Rect;", "Lcom/veridas/math/geometry/Point;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final double fit(@NotNull Rectangle rectangle, @NotNull Rectangle onto) {
            double x4;
            double x6;
            Intrinsics.checkNotNullParameter(rectangle, "rectangle");
            Intrinsics.checkNotNullParameter(onto, "onto");
            if (onto.aspectRatio() >= 1.0d) {
                if (rectangle.aspectRatio() > 1.0d) {
                    x4 = onto.getDimensions().getX();
                    x6 = rectangle.getDimensions().getX();
                } else {
                    x4 = onto.getDimensions().getY();
                    x6 = rectangle.getDimensions().getY();
                }
            } else if (rectangle.aspectRatio() < 1.0d) {
                x4 = onto.getDimensions().getY();
                x6 = rectangle.getDimensions().getY();
            } else {
                x4 = onto.getDimensions().getX();
                x6 = rectangle.getDimensions().getX();
            }
            return x4 / x6;
        }

        @JvmStatic
        @NotNull
        public final Rectangle from(@NotNull Point point) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new Rectangle(0, 0, point.x, point.y);
        }

        @NotNull
        public final Rectangle getEMPTY() {
            return Rectangle.EMPTY;
        }

        @JvmStatic
        @NotNull
        public final Rectangle from(@NotNull Vector2 point) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new Rectangle(Vector2.INSTANCE.getZERO(), point);
        }

        @JvmStatic
        @NotNull
        public final Rectangle from(@NotNull Point point, @NotNull Rectangle parent) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Vector2 vector2From = Vector2.INSTANCE.from(point);
            Vector2 vector2Plus = parent.getPosition().plus(parent.getDimensions().minus(vector2From).div(2.0d));
            return new Rectangle(vector2Plus.getX(), vector2Plus.getY(), vector2From.getX(), vector2From.getY());
        }

        @JvmStatic
        @NotNull
        public final Rectangle from(@NotNull Point point, @NotNull Vector2 parent) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Vector2 vector2From = Vector2.INSTANCE.from(point);
            Vector2 vector2Div = parent.minus(vector2From).div(2.0d);
            return new Rectangle(vector2Div.getX(), vector2Div.getY(), vector2From.getX(), vector2From.getY());
        }

        @JvmStatic
        @NotNull
        public final Rectangle from(@NotNull Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return new Rectangle(rect.left, rect.top, rect.width(), rect.height());
        }
    }

    public Rectangle(@NotNull Vector2 position, @NotNull Vector2 dimensions) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.position = position;
        this.dimensions = dimensions;
    }

    @JvmStatic
    public static final double fit(@NotNull Rectangle rectangle, @NotNull Rectangle rectangle2) {
        return INSTANCE.fit(rectangle, rectangle2);
    }

    @JvmStatic
    @NotNull
    public static final Rectangle from(@NotNull Point point) {
        return INSTANCE.from(point);
    }

    @NotNull
    public final Vector2 absoluteCenter() {
        return this.position.plus(center());
    }

    public final double area() {
        return this.dimensions.area();
    }

    public final double areaDelta(@NotNull Rectangle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return area() / other.area();
    }

    public final double aspectRatio() {
        return width() / height();
    }

    @NotNull
    public final Vector2[] boundaries() {
        return new Vector2[]{get(0), get(1), get(2), get(3)};
    }

    @NotNull
    public final Vector2 center() {
        return this.dimensions.div(2);
    }

    public final boolean contains(@NotNull Vector2 p4) {
        Intrinsics.checkNotNullParameter(p4, "p");
        Vector2 vector2 = this.position;
        Vector2 vector2Plus = vector2.plus(this.dimensions);
        return p4.getX() >= vector2.getX() && p4.getX() <= vector2Plus.getX() && p4.getY() >= vector2.getY() && p4.getY() <= vector2Plus.getY();
    }

    public final boolean envelops(@NotNull Rectangle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2[] vector2ArrBoundaries = boundaries();
        Vector2 vector2 = vector2ArrBoundaries[0];
        Vector2 vector3 = vector2ArrBoundaries[1];
        Vector2 vector4 = vector2ArrBoundaries[2];
        Vector2 vector5 = vector2ArrBoundaries[3];
        Vector2[] vector2ArrBoundaries2 = other.boundaries();
        Vector2 vector6 = vector2ArrBoundaries2[0];
        Vector2 vector7 = vector2ArrBoundaries2[1];
        Vector2 vector8 = vector2ArrBoundaries2[2];
        Vector2 vector9 = vector2ArrBoundaries2[3];
        return vector2.getX() <= vector6.getX() && vector2.getY() <= vector6.getY() && vector3.getX() >= vector7.getX() && vector3.getY() <= vector7.getY() && vector4.getX() >= vector8.getX() && vector4.getY() >= vector8.getY() && vector5.getX() <= vector9.getX() && vector5.getY() >= vector9.getY();
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) other;
        return Intrinsics.areEqual(this.position, rectangle.position) && Intrinsics.areEqual(this.dimensions, rectangle.dimensions);
    }

    @NotNull
    public final Vector2 get(int index) {
        if (index == 0) {
            return this.position;
        }
        if (index == 1) {
            return new Vector2(this.position.plus(this.dimensions).getX(), this.position.getY());
        }
        if (index == 2) {
            return this.position.plus(this.dimensions);
        }
        if (index == 3) {
            return new Vector2(this.position.getX(), this.position.plus(this.dimensions).getY());
        }
        throw new IndexOutOfBoundsException(b.a("Index ", index, " is out of bounds."));
    }

    @NotNull
    public final Vector2 getDimensions() {
        return this.dimensions;
    }

    @NotNull
    public final Vector2 getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.dimensions.hashCode() + (this.position.hashCode() * 31);
    }

    public final double height() {
        return this.dimensions.getY();
    }

    public final boolean intersects(@NotNull Rectangle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2[] vector2ArrBoundaries = boundaries();
        Vector2 vector2 = vector2ArrBoundaries[0];
        Vector2 vector3 = vector2ArrBoundaries[1];
        Vector2 vector4 = vector2ArrBoundaries[3];
        Vector2[] vector2ArrBoundaries2 = other.boundaries();
        Vector2 vector5 = vector2ArrBoundaries2[0];
        return vector2.getX() < vector2ArrBoundaries2[1].getX() && vector3.getX() > vector5.getX() && vector2.getY() < vector2ArrBoundaries2[3].getY() && vector4.getY() > vector5.getY();
    }

    public final boolean isEmpty() {
        Vector2 vector2 = this.position;
        if (vector2.dot(vector2) == 0.0d) {
            Vector2 vector3 = this.dimensions;
            if (vector3.dot(vector3) == 0.0d) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final Rectangle merge(@NotNull Rectangle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2 vector2 = this.position;
        Vector2 vector2Plus = vector2.plus(this.dimensions);
        Vector2 vector3 = other.position;
        Vector2 vector2Plus2 = vector3.plus(other.dimensions);
        Vector2 vector4 = new Vector2(Math.min(vector2.getX(), vector3.getX()), Math.min(vector2.getY(), vector3.getY()));
        return new Rectangle(vector4, new Vector2(Math.max(vector2Plus.getX(), vector2Plus2.getX()) - vector4.getX(), Math.max(vector2Plus.getY(), vector2Plus2.getY()) - vector4.getY()));
    }

    public final boolean overlays(@NotNull Rectangle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2[] vector2ArrBoundaries = boundaries();
        Vector2 vector2 = vector2ArrBoundaries[0];
        Vector2 vector3 = vector2ArrBoundaries[1];
        Vector2 vector4 = vector2ArrBoundaries[2];
        Vector2 vector5 = vector2ArrBoundaries[3];
        Vector2[] vector2ArrBoundaries2 = other.boundaries();
        Vector2 vector6 = vector2ArrBoundaries2[0];
        Vector2 vector7 = vector2ArrBoundaries2[1];
        Vector2 vector8 = vector2ArrBoundaries2[2];
        Vector2 vector9 = vector2ArrBoundaries2[3];
        return vector2.getX() >= vector6.getX() && vector2.getY() >= vector6.getY() && vector3.getX() <= vector7.getX() && vector3.getY() >= vector7.getY() && vector4.getX() <= vector8.getX() && vector4.getY() <= vector8.getY() && vector5.getX() >= vector9.getX() && vector5.getY() <= vector9.getY();
    }

    @NotNull
    public final Rectangle times(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Vector2[] vector2ArrBoundaries = boundaries();
        Vector2 vector2Times = matrix.times(vector2ArrBoundaries[3]);
        Vector2 vector2Times2 = matrix.times(vector2ArrBoundaries[0]);
        return new Rectangle(vector2Times2, new Vector2(matrix.times(vector2ArrBoundaries[1]).getX() - vector2Times2.getX(), vector2Times.getY() - vector2Times2.getY()));
    }

    @NotNull
    public final Rect toRect() {
        return new Rect((int) this.position.getX(), (int) this.position.getY(), (int) (this.dimensions.getX() + this.position.getX()), (int) (this.dimensions.getY() + this.position.getY()));
    }

    @NotNull
    public String toString() {
        return Reflection.getOrCreateKotlinClass(Rectangle.class).getQualifiedName() + "[position=" + this.position + ", dimensions=" + this.dimensions + Constant.BRACKET_CLOSE;
    }

    public final double width() {
        return this.dimensions.getX();
    }

    public final boolean within(@NotNull Rectangle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2 vector2 = this.position;
        return other.contains(vector2) && other.contains(vector2.plus(this.dimensions));
    }

    @JvmStatic
    @NotNull
    public static final Rectangle from(@NotNull Point point, @NotNull Rectangle rectangle) {
        return INSTANCE.from(point, rectangle);
    }

    @JvmStatic
    @NotNull
    public static final Rectangle from(@NotNull Point point, @NotNull Vector2 vector2) {
        return INSTANCE.from(point, vector2);
    }

    public Rectangle(double d2, double d3, double d7, double d10) {
        this(new Vector2(d2, d3), new Vector2(d7, d10));
    }

    @JvmStatic
    @NotNull
    public static final Rectangle from(@NotNull Rect rect) {
        return INSTANCE.from(rect);
    }

    @JvmStatic
    @NotNull
    public static final Rectangle from(@NotNull Vector2 vector2) {
        return INSTANCE.from(vector2);
    }

    public Rectangle(float f6, float f10, float f11, float f12) {
        this(new Vector2(f6, f10), new Vector2(f11, f12));
    }

    public Rectangle(int i10, int i11, int i12, int i13) {
        this(new Vector2(i10, i11), new Vector2(i12, i13));
    }

    public Rectangle(long j10, long j11, long j12, long j13) {
        this(new Vector2(j10, j11), new Vector2(j12, j13));
    }

    public Rectangle(int i10) {
        this(new Vector2(i10, i10), new Vector2(i10, i10));
    }

    public Rectangle(int i10, int i11) {
        this(new Vector2(i10, i10), new Vector2(i11, i11));
    }
}
