package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/ScreenDimensions;", "", "width", "", "height", "density", "", "scaleFactor", "", "(FFDLjava/lang/String;)V", "getDensity", "()D", "getHeight", "()F", "getScaleFactor", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScreenDimensions {
    private final double density;
    private final float height;

    @NotNull
    private final String scaleFactor;
    private final float width;

    public ScreenDimensions(float f6, float f10, double d2, @NotNull String scaleFactor) {
        Intrinsics.checkNotNullParameter(scaleFactor, "scaleFactor");
        this.width = f6;
        this.height = f10;
        this.density = d2;
        this.scaleFactor = scaleFactor;
    }

    public static /* synthetic */ ScreenDimensions copy$default(ScreenDimensions screenDimensions, float f6, float f10, double d2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = screenDimensions.width;
        }
        if ((i10 & 2) != 0) {
            f10 = screenDimensions.height;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            d2 = screenDimensions.density;
        }
        double d3 = d2;
        if ((i10 & 8) != 0) {
            str = screenDimensions.scaleFactor;
        }
        return screenDimensions.copy(f6, f11, d3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getDensity() {
        return this.density;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScaleFactor() {
        return this.scaleFactor;
    }

    @NotNull
    public final ScreenDimensions copy(float width, float height, double density, @NotNull String scaleFactor) {
        Intrinsics.checkNotNullParameter(scaleFactor, "scaleFactor");
        return new ScreenDimensions(width, height, density, scaleFactor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenDimensions)) {
            return false;
        }
        ScreenDimensions screenDimensions = (ScreenDimensions) other;
        return Float.compare(this.width, screenDimensions.width) == 0 && Float.compare(this.height, screenDimensions.height) == 0 && Double.compare(this.density, screenDimensions.density) == 0 && Intrinsics.areEqual(this.scaleFactor, screenDimensions.scaleFactor);
    }

    public final double getDensity() {
        return this.density;
    }

    public final float getHeight() {
        return this.height;
    }

    @NotNull
    public final String getScaleFactor() {
        return this.scaleFactor;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iA = z1.a(this.height, Float.floatToIntBits(this.width) * 31, 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.density);
        return this.scaleFactor.hashCode() + ((iA + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31);
    }

    @NotNull
    public String toString() {
        return "ScreenDimensions(width=" + this.width + ", height=" + this.height + ", density=" + this.density + ", scaleFactor=" + this.scaleFactor + ")";
    }
}
