package tg;

import androidx.camera.camera2.internal.l0;
import com.google.mlkit.vision.common.PointF3D;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends PointF3D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f93596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f93597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f93598c;

    public a(float f6, float f10, float f11) {
        this.f93596a = f6;
        this.f93597b = f10;
        this.f93598c = f11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PointF3D) {
            PointF3D pointF3D = (PointF3D) obj;
            if (Float.floatToIntBits(this.f93596a) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.f93597b) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.f93598c) == Float.floatToIntBits(pointF3D.getZ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.f93596a;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.f93597b;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.f93598c;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f93596a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f93597b)) * 1000003) ^ Float.floatToIntBits(this.f93598c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointF3D{x=");
        sb2.append(this.f93596a);
        sb2.append(", y=");
        sb2.append(this.f93597b);
        sb2.append(", z=");
        return l0.a(sb2, this.f93598c, "}");
    }
}
