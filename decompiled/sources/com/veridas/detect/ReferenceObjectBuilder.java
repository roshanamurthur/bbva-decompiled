package com.veridas.detect;

import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReferenceObjectBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/veridas/detect/ReferenceObjectBuilder;", "", "", "value", "aspectRatio", "Lcom/veridas/math/geometry/Rectangle;", "containee", "container", ImageScaleTypeHandler.ID, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "(Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;DD)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class ReferenceObjectBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Rectangle f66772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Rectangle f66773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f66774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f66775d;

    public ReferenceObjectBuilder() {
        this(null, null, 0.0d, 0.0d, 15, null);
    }

    @NotNull
    public final ReferenceObjectBuilder aspectRatio(double value) {
        this.f66774c = value;
        return this;
    }

    @NotNull
    public final Rectangle build() {
        Vector2 vector2;
        Vector2 vector3;
        Rectangle rectangle = this.f66772a;
        Rectangle rectangle2 = this.f66773b;
        double d2 = this.f66774c;
        if (d2 == Double.NaN || d2 <= 0.0d) {
            throw new IllegalArgumentException("Aspect ratio must be a positive number".toString());
        }
        if (this.f66775d <= 0.0d) {
            throw new IllegalArgumentException("Scale must be a positive number".toString());
        }
        if (rectangle2 == null) {
            throw new IllegalArgumentException("Container can't be null".toString());
        }
        Vector2 dimensions = rectangle2.getDimensions();
        double x4 = dimensions.getX() / 1280.0d;
        double x6 = dimensions.getX() / dimensions.getY();
        if (this.f66774c > x6) {
            double d3 = x6 * 60.0d * x4;
            double x7 = dimensions.getX() - (d3 * 2.0d);
            double d7 = x7 / this.f66774c;
            vector2 = new Vector2(d3, (dimensions.getY() - d7) / 2.0d);
            vector3 = new Vector2(x7, d7);
        } else {
            double d10 = x4 * 30.0d;
            double y7 = dimensions.getY() - (d10 * 2.0d);
            double d11 = this.f66774c * y7;
            vector2 = new Vector2((dimensions.getX() - d11) / 2.0d, d10);
            vector3 = new Vector2(d11, y7);
        }
        double d12 = this.f66775d;
        if (d12 != 1.0d) {
            vector3 = vector3.times(d12);
            vector2 = dimensions.div(2.0d).minus(vector3.div(2.0d));
        }
        if (rectangle != null) {
            vector2 = vector2.minus(rectangle.getPosition());
        }
        return new Rectangle(c.roundToInt(vector2.getX()), c.roundToInt(vector2.getY()), c.roundToInt(vector3.getX()), c.roundToInt(vector3.getY()));
    }

    @NotNull
    public final ReferenceObjectBuilder containee(@NotNull Rectangle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66772a = value;
        return this;
    }

    @NotNull
    public final ReferenceObjectBuilder container(@NotNull Rectangle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66773b = value;
        return this;
    }

    @NotNull
    public final ReferenceObjectBuilder scale(double value) {
        this.f66775d = value;
        return this;
    }

    public ReferenceObjectBuilder(@Nullable Rectangle rectangle, @Nullable Rectangle rectangle2, double d2, double d3) {
        this.f66772a = rectangle;
        this.f66773b = rectangle2;
        this.f66774c = d2;
        this.f66775d = d3;
    }

    public /* synthetic */ ReferenceObjectBuilder(Rectangle rectangle, Rectangle rectangle2, double d2, double d3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : rectangle, (i10 & 2) == 0 ? rectangle2 : null, (i10 & 4) != 0 ? Double.NaN : d2, (i10 & 8) != 0 ? 1.0d : d3);
    }
}
