package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class MotionTiming {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TimeInterpolator f43908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43910e;

    public MotionTiming(long j10, long j11) {
        this.f43908c = null;
        this.f43909d = 0;
        this.f43910e = 1;
        this.f43906a = j10;
        this.f43907b = j11;
    }

    public void apply(@NonNull Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (getDelay() == motionTiming.getDelay() && getDuration() == motionTiming.getDuration() && getRepeatCount() == motionTiming.getRepeatCount() && getRepeatMode() == motionTiming.getRepeatMode()) {
            return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.f43906a;
    }

    public long getDuration() {
        return this.f43907b;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.f43908c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.f43909d;
    }

    public int getRepeatMode() {
        return this.f43910e;
    }

    public int hashCode() {
        return getRepeatMode() + ((getRepeatCount() + ((getInterpolator().getClass().hashCode() + (((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31)) * 31)) * 31);
    }

    @NonNull
    public String toString() {
        return RootService.LINE_BREAK + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }

    public MotionTiming(long j10, long j11, @NonNull TimeInterpolator timeInterpolator) {
        this.f43909d = 0;
        this.f43910e = 1;
        this.f43906a = j10;
        this.f43907b = j11;
        this.f43908c = timeInterpolator;
    }
}
