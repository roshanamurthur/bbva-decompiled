package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class StopLogic extends MotionInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopLogicEngine f19279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SpringStopEngine f19280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StopEngine f19281c;

    public StopLogic() {
        StopLogicEngine stopLogicEngine = new StopLogicEngine();
        this.f19279a = stopLogicEngine;
        this.f19281c = stopLogicEngine;
    }

    public void config(float f6, float f10, float f11, float f12, float f13, float f14) {
        StopLogicEngine stopLogicEngine = this.f19279a;
        this.f19281c = stopLogicEngine;
        stopLogicEngine.config(f6, f10, f11, f12, f13, f14);
    }

    public String debug(String str, float f6) {
        return this.f19281c.debug(str, f6);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        return this.f19281c.getInterpolation(f6);
    }

    public float getVelocity(float f6) {
        return this.f19281c.getVelocity(f6);
    }

    public boolean isStopped() {
        return this.f19281c.isStopped();
    }

    public void springConfig(float f6, float f10, float f11, float f12, float f13, float f14, float f15, int i10) {
        if (this.f19280b == null) {
            this.f19280b = new SpringStopEngine();
        }
        SpringStopEngine springStopEngine = this.f19280b;
        this.f19281c = springStopEngine;
        springStopEngine.springConfig(f6, f10, f11, f12, f13, f14, f15, i10);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.f19281c.getVelocity();
    }
}
