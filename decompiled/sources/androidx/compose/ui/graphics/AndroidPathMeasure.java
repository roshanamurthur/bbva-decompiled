package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPathMeasure.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/Path;", "destination", "", "startWithMoveTo", "getSegment", "path", "forceClosed", "", "setPath", "distance", "Landroidx/compose/ui/geometry/Offset;", "getPosition-tuRUvjQ", "(F)J", "getPosition", "getTangent-tuRUvjQ", "getTangent", "getLength", "()F", "length", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
public final class AndroidPathMeasure implements PathMeasure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final android.graphics.PathMeasure f15567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public float[] f15568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public float[] f15569c;

    public AndroidPathMeasure(@NotNull android.graphics.PathMeasure internalPathMeasure) {
        Intrinsics.checkNotNullParameter(internalPathMeasure, "internalPathMeasure");
        this.f15567a = internalPathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.f15567a.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* JADX INFO: renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo2415getPositiontuRUvjQ(float distance) {
        if (this.f15568b == null) {
            this.f15568b = new float[2];
        }
        if (this.f15569c == null) {
            this.f15569c = new float[2];
        }
        if (!this.f15567a.getPosTan(distance, this.f15568b, this.f15569c)) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.f15568b;
        Intrinsics.checkNotNull(fArr);
        float f6 = fArr[0];
        float[] fArr2 = this.f15568b;
        Intrinsics.checkNotNull(fArr2);
        return OffsetKt.Offset(f6, fArr2[1]);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float startDistance, float stopDistance, @NotNull Path destination, boolean startWithMoveTo) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!(destination instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f15567a.getSegment(startDistance, stopDistance, ((AndroidPath) destination).getInternalPath(), startWithMoveTo);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* JADX INFO: renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo2416getTangenttuRUvjQ(float distance) {
        if (this.f15568b == null) {
            this.f15568b = new float[2];
        }
        if (this.f15569c == null) {
            this.f15569c = new float[2];
        }
        if (!this.f15567a.getPosTan(distance, this.f15568b, this.f15569c)) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.f15569c;
        Intrinsics.checkNotNull(fArr);
        float f6 = fArr[0];
        float[] fArr2 = this.f15569c;
        Intrinsics.checkNotNull(fArr2);
        return OffsetKt.Offset(f6, fArr2[1]);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(@Nullable Path path, boolean forceClosed) {
        android.graphics.Path internalPath;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((AndroidPath) path).getInternalPath();
        }
        this.f15567a.setPath(internalPath, forceClosed);
    }
}
