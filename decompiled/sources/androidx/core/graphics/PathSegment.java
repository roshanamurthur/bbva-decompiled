package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class PathSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f19879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f19881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f19882d;

    public PathSegment(@NonNull PointF pointF, float f6, @NonNull PointF pointF2, float f10) {
        this.f19879a = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.f19880b = f6;
        this.f19881c = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.f19882d = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.f19880b, pathSegment.f19880b) == 0 && Float.compare(this.f19882d, pathSegment.f19882d) == 0 && this.f19879a.equals(pathSegment.f19879a) && this.f19881c.equals(pathSegment.f19881c);
    }

    @NonNull
    public PointF getEnd() {
        return this.f19881c;
    }

    public float getEndFraction() {
        return this.f19882d;
    }

    @NonNull
    public PointF getStart() {
        return this.f19879a;
    }

    public float getStartFraction() {
        return this.f19880b;
    }

    public int hashCode() {
        int iHashCode = this.f19879a.hashCode() * 31;
        float f6 = this.f19880b;
        int iHashCode2 = (this.f19881c.hashCode() + ((iHashCode + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31)) * 31;
        float f10 = this.f19882d;
        return iHashCode2 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PathSegment{start=");
        sb2.append(this.f19879a);
        sb2.append(", startFraction=");
        sb2.append(this.f19880b);
        sb2.append(", end=");
        sb2.append(this.f19881c);
        sb2.append(", endFraction=");
        return androidx.camera.camera2.internal.compat.u.i(sb2, this.f19882d, AbstractJsonLexerKt.END_OBJ);
    }
}
