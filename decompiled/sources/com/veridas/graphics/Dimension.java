package com.veridas.graphics;

import androidx.annotation.Keep;
import com.veridas.math.geometry.Vector2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Dimension.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0007J\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/veridas/graphics/Dimension;", "", "p", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "(Lcom/veridas/math/geometry/Vector2;)V", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "aspectRatio", "", "flipAxis", "surface", "toPoint", "toString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Dimension {
    private final int height;
    private final int width;

    public Dimension(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public final double aspectRatio() {
        return ((double) this.height) / ((double) this.width);
    }

    @NotNull
    public final Dimension flipAxis() {
        return new Dimension(this.height, this.width);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int surface() {
        return this.width * this.height;
    }

    @NotNull
    public final Vector2 toPoint() {
        return new Vector2(this.width, this.height);
    }

    @NotNull
    public String toString() {
        return Reflection.getOrCreateKotlinClass(Dimension.class).getQualifiedName() + "[width=" + this.width + ", height=" + this.height + Constant.BRACKET_CLOSE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dimension(@NotNull Vector2 p4) {
        this((int) Math.rint(p4.getX()), (int) Math.rint(p4.getY()));
        Intrinsics.checkNotNullParameter(p4, "p");
    }
}
