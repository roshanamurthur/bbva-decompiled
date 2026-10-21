package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: loaded from: classes2.dex */
public class PathKeyframe extends Keyframe<PointF> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Path f25854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Keyframe<PointF> f25855i;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.startValue, keyframe.endValue, keyframe.interpolator, keyframe.xInterpolator, keyframe.yInterpolator, keyframe.startFrame, keyframe.endFrame);
        this.f25855i = keyframe;
        createPath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void createPath() {
        T t10;
        T t11;
        T t12 = this.endValue;
        boolean z10 = (t12 == 0 || (t11 = this.startValue) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.startValue;
        if (t13 == 0 || (t10 = this.endValue) == 0 || z10) {
            return;
        }
        Keyframe<PointF> keyframe = this.f25855i;
        this.f25854h = Utils.createPath((PointF) t13, (PointF) t10, keyframe.pathCp1, keyframe.pathCp2);
    }
}
