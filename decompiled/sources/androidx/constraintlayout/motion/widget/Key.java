package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class Key {
    public static final String ALPHA = "alpha";
    public static final String CURVEFIT = "curveFit";
    public static final String CUSTOM = "CUSTOM";
    public static final String ELEVATION = "elevation";
    public static final String MOTIONPROGRESS = "motionProgress";
    public static final String PIVOT_X = "transformPivotX";
    public static final String PIVOT_Y = "transformPivotY";
    public static final String PROGRESS = "progress";
    public static final String ROTATION = "rotation";
    public static final String ROTATION_X = "rotationX";
    public static final String ROTATION_Y = "rotationY";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRANSITIONEASING = "transitionEasing";
    public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final String TRANSLATION_X = "translationX";
    public static final String TRANSLATION_Y = "translationY";
    public static final String TRANSLATION_Z = "translationZ";
    public static int UNSET = -1;
    public static final String VISIBILITY = "visibility";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_VARIES_BY = "waveVariesBy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f19303d;
    protected int mType;

    public Key() {
        int i10 = UNSET;
        this.f19300a = i10;
        this.f19301b = i10;
        this.f19302c = null;
    }

    public static float a(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public static int b(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public abstract void addValues(HashMap<String, ViewSpline> map);

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract Key mo4634clone();

    public Key copy(Key key) {
        this.f19300a = key.f19300a;
        this.f19301b = key.f19301b;
        this.f19302c = key.f19302c;
        this.mType = key.mType;
        this.f19303d = key.f19303d;
        return this;
    }

    public abstract void getAttributeNames(HashSet<String> hashSet);

    public int getFramePosition() {
        return this.f19300a;
    }

    public abstract void load(Context context, AttributeSet attributeSet);

    public void setFramePosition(int i10) {
        this.f19300a = i10;
    }

    public abstract void setValue(String str, Object obj);

    public Key setViewId(int i10) {
        this.f19301b = i10;
        return this;
    }

    public void setInterpolation(HashMap<String, Integer> map) {
    }
}
