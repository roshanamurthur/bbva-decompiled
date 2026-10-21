package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class MotionSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap<String, MotionTiming> f43904a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap<String, PropertyValuesHolder[]> f43905b = new SimpleArrayMap<>();

    @NonNull
    public static MotionSpec a(@NonNull ArrayList arrayList) {
        MotionSpec motionSpec = new MotionSpec();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            }
            MotionTiming motionTiming = new MotionTiming(startDelay, duration, interpolator);
            motionTiming.f43909d = objectAnimator.getRepeatCount();
            motionTiming.f43910e = objectAnimator.getRepeatMode();
            motionSpec.setTiming(propertyName, motionTiming);
        }
        return motionSpec;
    }

    @Nullable
    public static MotionSpec createFromAttribute(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    @Nullable
    public static MotionSpec createFromResource(@NonNull Context context, @AnimatorRes int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return a(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return a(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e5);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.f43904a.equals(((MotionSpec) obj).f43904a);
        }
        return false;
    }

    @NonNull
    public <T> ObjectAnimator getAnimator(@NonNull String str, @NonNull T t10, @NonNull Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t10, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @NonNull
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (!hasPropertyValues(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = this.f43905b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i10 = 0; i10 < propertyValuesHolderArr.length; i10++) {
            propertyValuesHolderArr2[i10] = propertyValuesHolderArr[i10].clone();
        }
        return propertyValuesHolderArr2;
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.f43904a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        SimpleArrayMap<String, MotionTiming> simpleArrayMap = this.f43904a;
        int size = simpleArrayMap.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            MotionTiming motionTimingValueAt = simpleArrayMap.valueAt(i10);
            jMax = Math.max(jMax, motionTimingValueAt.getDuration() + motionTimingValueAt.getDelay());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.f43905b.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.f43904a.get(str) != null;
    }

    public int hashCode() {
        return this.f43904a.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f43905b.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @Nullable MotionTiming motionTiming) {
        this.f43904a.put(str, motionTiming);
    }

    @NonNull
    public String toString() {
        return RootService.LINE_BREAK + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f43904a + "}\n";
    }
}
