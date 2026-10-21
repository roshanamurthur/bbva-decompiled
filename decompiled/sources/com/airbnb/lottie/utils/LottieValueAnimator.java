package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.os.Build;
import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {

    @Nullable
    public LottieComposition F0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f26206s0 = 1.0f;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f26207t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f26208u0 = 0;
    public float v0 = 0.0f;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f26209w0 = 0.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f26210x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f26211y0 = -2.1474836E9f;
    public float E0 = 2.1474836E9f;

    @VisibleForTesting
    protected boolean running = false;
    public boolean G0 = false;

    public final boolean c() {
        return getSpeed() < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        Iterator it = this.f26194q0.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(c());
        removeFrameCallback();
    }

    public void clearComposition() {
        this.F0 = null;
        this.f26211y0 = -2.1474836E9f;
        this.E0 = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        postFrameCallback();
        if (this.F0 == null || !isRunning()) {
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("LottieValueAnimator#doFrame");
        }
        long j11 = this.f26208u0;
        long j12 = j11 != 0 ? j10 - j11 : 0L;
        LottieComposition lottieComposition = this.F0;
        float frameRate = j12 / (lottieComposition == null ? Float.MAX_VALUE : (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.f26206s0));
        float f6 = this.v0;
        if (c()) {
            frameRate = -frameRate;
        }
        float f10 = f6 + frameRate;
        boolean z10 = !MiscUtils.contains(f10, getMinFrame(), getMaxFrame());
        float f11 = this.v0;
        float fClamp = MiscUtils.clamp(f10, getMinFrame(), getMaxFrame());
        this.v0 = fClamp;
        if (this.G0) {
            fClamp = (float) Math.floor(fClamp);
        }
        this.f26209w0 = fClamp;
        this.f26208u0 = j10;
        if (!this.G0 || this.v0 != f11) {
            b();
        }
        if (z10) {
            if (getRepeatCount() == -1 || this.f26210x0 < getRepeatCount()) {
                Iterator it = this.f26194q0.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f26210x0++;
                if (getRepeatMode() == 2) {
                    this.f26207t0 = !this.f26207t0;
                    reverseAnimationSpeed();
                } else {
                    float maxFrame = c() ? getMaxFrame() : getMinFrame();
                    this.v0 = maxFrame;
                    this.f26209w0 = maxFrame;
                }
                this.f26208u0 = j10;
            } else {
                float minFrame = this.f26206s0 < 0.0f ? getMinFrame() : getMaxFrame();
                this.v0 = minFrame;
                this.f26209w0 = minFrame;
                removeFrameCallback();
                a(c());
            }
        }
        if (this.F0 != null) {
            float f12 = this.f26209w0;
            if (f12 < this.f26211y0 || f12 > this.E0) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f26211y0), Float.valueOf(this.E0), Float.valueOf(this.f26209w0)));
            }
        }
        if (L.isTraceEnabled()) {
            L.endSection("LottieValueAnimator#doFrame");
        }
    }

    @MainThread
    public void endAnimation() {
        removeFrameCallback();
        a(c());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.F0 == null) {
            return 0.0f;
        }
        if (c()) {
            minFrame = getMaxFrame() - this.f26209w0;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.f26209w0 - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.F0;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.f26209w0 - lottieComposition.getStartFrame()) / (this.F0.getEndFrame() - this.F0.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.F0;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.f26209w0;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.F0;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f6 = this.E0;
        return f6 == 2.1474836E9f ? lottieComposition.getEndFrame() : f6;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.F0;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f6 = this.f26211y0;
        return f6 == -2.1474836E9f ? lottieComposition.getStartFrame() : f6;
    }

    public float getSpeed() {
        return this.f26206s0;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    @MainThread
    public void pauseAnimation() {
        removeFrameCallback();
        Iterator it = this.f26195r0.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(this);
        }
    }

    @MainThread
    public void playAnimation() {
        this.running = true;
        boolean zC = c();
        for (Animator.AnimatorListener animatorListener : this.f26194q0) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, zC);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
        setFrame((int) (c() ? getMaxFrame() : getMinFrame()));
        this.f26208u0 = 0L;
        this.f26210x0 = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void removeFrameCallback() {
        removeFrameCallback(true);
    }

    @MainThread
    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.f26208u0 = 0L;
        if (c() && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (!c() && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        Iterator it = this.f26195r0.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(this);
        }
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(LottieComposition lottieComposition) {
        boolean z10 = this.F0 == null;
        this.F0 = lottieComposition;
        if (z10) {
            setMinAndMaxFrames(Math.max(this.f26211y0, lottieComposition.getStartFrame()), Math.min(this.E0, lottieComposition.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        float f6 = this.f26209w0;
        this.f26209w0 = 0.0f;
        this.v0 = 0.0f;
        setFrame((int) f6);
        b();
    }

    public void setFrame(float f6) {
        if (this.v0 == f6) {
            return;
        }
        float fClamp = MiscUtils.clamp(f6, getMinFrame(), getMaxFrame());
        this.v0 = fClamp;
        if (this.G0) {
            fClamp = (float) Math.floor(fClamp);
        }
        this.f26209w0 = fClamp;
        this.f26208u0 = 0L;
        b();
    }

    public void setMaxFrame(float f6) {
        setMinAndMaxFrames(this.f26211y0, f6);
    }

    public void setMinAndMaxFrames(float f6, float f10) {
        if (f6 > f10) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f6), Float.valueOf(f10)));
        }
        LottieComposition lottieComposition = this.F0;
        float startFrame = lottieComposition == null ? -3.4028235E38f : lottieComposition.getStartFrame();
        LottieComposition lottieComposition2 = this.F0;
        float endFrame = lottieComposition2 == null ? Float.MAX_VALUE : lottieComposition2.getEndFrame();
        float fClamp = MiscUtils.clamp(f6, startFrame, endFrame);
        float fClamp2 = MiscUtils.clamp(f10, startFrame, endFrame);
        if (fClamp == this.f26211y0 && fClamp2 == this.E0) {
            return;
        }
        this.f26211y0 = fClamp;
        this.E0 = fClamp2;
        setFrame((int) MiscUtils.clamp(this.f26209w0, fClamp, fClamp2));
    }

    public void setMinFrame(int i10) {
        setMinAndMaxFrames(i10, (int) this.E0);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f26207t0) {
            return;
        }
        this.f26207t0 = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f6) {
        this.f26206s0 = f6;
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.G0 = z10;
    }

    @MainThread
    public void removeFrameCallback(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.running = false;
        }
    }
}
