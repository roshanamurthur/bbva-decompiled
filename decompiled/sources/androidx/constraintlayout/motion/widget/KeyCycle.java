package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class KeyCycle extends Key {
    public static final int KEY_TYPE = 4;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_SHAPE = "waveShape";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19319e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19320f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19321g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19322h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19323i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f19324j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19325k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19326l = -1;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19327n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f19328o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19329p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19330q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f19331r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f19332s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f19333t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f19334u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f19335v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f19336w = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19337a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19337a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            sparseIntArray.append(R.styleable.KeyCycle_framePosition, 2);
            sparseIntArray.append(R.styleable.KeyCycle_transitionEasing, 3);
            sparseIntArray.append(R.styleable.KeyCycle_curveFit, 4);
            sparseIntArray.append(R.styleable.KeyCycle_waveShape, 5);
            sparseIntArray.append(R.styleable.KeyCycle_wavePeriod, 6);
            sparseIntArray.append(R.styleable.KeyCycle_waveOffset, 7);
            sparseIntArray.append(R.styleable.KeyCycle_waveVariesBy, 8);
            sparseIntArray.append(R.styleable.KeyCycle_android_alpha, 9);
            sparseIntArray.append(R.styleable.KeyCycle_android_elevation, 10);
            sparseIntArray.append(R.styleable.KeyCycle_android_rotation, 11);
            sparseIntArray.append(R.styleable.KeyCycle_android_rotationX, 12);
            sparseIntArray.append(R.styleable.KeyCycle_android_rotationY, 13);
            sparseIntArray.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            sparseIntArray.append(R.styleable.KeyCycle_android_scaleX, 15);
            sparseIntArray.append(R.styleable.KeyCycle_android_scaleY, 16);
            sparseIntArray.append(R.styleable.KeyCycle_android_translationX, 17);
            sparseIntArray.append(R.styleable.KeyCycle_android_translationY, 18);
            sparseIntArray.append(R.styleable.KeyCycle_android_translationZ, 19);
            sparseIntArray.append(R.styleable.KeyCycle_motionProgress, 20);
            sparseIntArray.append(R.styleable.KeyCycle_wavePhase, 21);
        }
    }

    public KeyCycle() {
        this.mType = 4;
        this.f19303d = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, ViewOscillator> map) {
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f19303d.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.getType() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (viewOscillator = map.get(str)) != null) {
                    viewOscillator.setPoint(this.f19300a, this.f19320f, this.f19321g, this.f19326l, this.f19322h, this.f19323i, this.f19324j, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (viewOscillator2 = map.get(str)) != null) {
                    viewOscillator2.setPoint(this.f19300a, this.f19320f, this.f19321g, this.f19326l, this.f19322h, this.f19323i, this.f19324j, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> map) {
        Debug.logStack(TypedValues.CycleType.NAME, "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            ViewSpline viewSpline = map.get(str);
            if (viewSpline != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        viewSpline.setPoint(this.f19300a, this.f19330q);
                        break;
                    case "rotationY":
                        viewSpline.setPoint(this.f19300a, this.f19331r);
                        break;
                    case "translationX":
                        viewSpline.setPoint(this.f19300a, this.f19334u);
                        break;
                    case "translationY":
                        viewSpline.setPoint(this.f19300a, this.f19335v);
                        break;
                    case "translationZ":
                        viewSpline.setPoint(this.f19300a, this.f19336w);
                        break;
                    case "progress":
                        viewSpline.setPoint(this.f19300a, this.f19325k);
                        break;
                    case "scaleX":
                        viewSpline.setPoint(this.f19300a, this.f19332s);
                        break;
                    case "scaleY":
                        viewSpline.setPoint(this.f19300a, this.f19333t);
                        break;
                    case "rotation":
                        viewSpline.setPoint(this.f19300a, this.f19328o);
                        break;
                    case "elevation":
                        viewSpline.setPoint(this.f19300a, this.f19327n);
                        break;
                    case "transitionPathRotate":
                        viewSpline.setPoint(this.f19300a, this.f19329p);
                        break;
                    case "alpha":
                        viewSpline.setPoint(this.f19300a, this.m);
                        break;
                    case "waveOffset":
                        viewSpline.setPoint(this.f19300a, this.f19323i);
                        break;
                    case "wavePhase":
                        viewSpline.setPoint(this.f19300a, this.f19324j);
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyCycle keyCycle = (KeyCycle) key;
        keyCycle.getClass();
        this.f19319e = keyCycle.f19319e;
        this.f19320f = keyCycle.f19320f;
        this.f19321g = keyCycle.f19321g;
        this.f19322h = keyCycle.f19322h;
        this.f19323i = keyCycle.f19323i;
        this.f19324j = keyCycle.f19324j;
        this.f19325k = keyCycle.f19325k;
        this.f19326l = keyCycle.f19326l;
        this.m = keyCycle.m;
        this.f19327n = keyCycle.f19327n;
        this.f19328o = keyCycle.f19328o;
        this.f19329p = keyCycle.f19329p;
        this.f19330q = keyCycle.f19330q;
        this.f19331r = keyCycle.f19331r;
        this.f19332s = keyCycle.f19332s;
        this.f19333t = keyCycle.f19333t;
        this.f19334u = keyCycle.f19334u;
        this.f19335v = keyCycle.f19335v;
        this.f19336w = keyCycle.f19336w;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f19327n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f19328o)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f19330q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f19331r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f19332s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f19333t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f19329p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f19334u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f19335v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f19336w)) {
            hashSet.add("translationZ");
        }
        if (this.f19303d.size() > 0) {
            Iterator<String> it = this.f19303d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public float getValue(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f19330q;
            case "rotationY":
                return this.f19331r;
            case "translationX":
                return this.f19334u;
            case "translationY":
                return this.f19335v;
            case "translationZ":
                return this.f19336w;
            case "progress":
                return this.f19325k;
            case "scaleX":
                return this.f19332s;
            case "scaleY":
                return this.f19333t;
            case "rotation":
                return this.f19328o;
            case "elevation":
                return this.f19327n;
            case "transitionPathRotate":
                return this.f19329p;
            case "alpha":
                return this.m;
            case "waveOffset":
                return this.f19323i;
            case "wavePhase":
                return this.f19324j;
            default:
                str.startsWith("CUSTOM");
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle);
        SparseIntArray sparseIntArray = a.f19337a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f19337a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19301b);
                        this.f19301b = resourceId;
                        if (resourceId == -1) {
                            this.f19302c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f19302c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f19301b = typedArrayObtainStyledAttributes.getResourceId(index, this.f19301b);
                    }
                    break;
                case 2:
                    this.f19300a = typedArrayObtainStyledAttributes.getInt(index, this.f19300a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f19319e = typedArrayObtainStyledAttributes.getInteger(index, this.f19319e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f19321g = typedArrayObtainStyledAttributes.getString(index);
                        this.f19320f = 7;
                    } else {
                        this.f19320f = typedArrayObtainStyledAttributes.getInt(index, this.f19320f);
                    }
                    break;
                case 6:
                    this.f19322h = typedArrayObtainStyledAttributes.getFloat(index, this.f19322h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f19323i = typedArrayObtainStyledAttributes.getDimension(index, this.f19323i);
                    } else {
                        this.f19323i = typedArrayObtainStyledAttributes.getFloat(index, this.f19323i);
                    }
                    break;
                case 8:
                    this.f19326l = typedArrayObtainStyledAttributes.getInt(index, this.f19326l);
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.f19327n = typedArrayObtainStyledAttributes.getDimension(index, this.f19327n);
                    break;
                case 11:
                    this.f19328o = typedArrayObtainStyledAttributes.getFloat(index, this.f19328o);
                    break;
                case 12:
                    this.f19330q = typedArrayObtainStyledAttributes.getFloat(index, this.f19330q);
                    break;
                case 13:
                    this.f19331r = typedArrayObtainStyledAttributes.getFloat(index, this.f19331r);
                    break;
                case 14:
                    this.f19329p = typedArrayObtainStyledAttributes.getFloat(index, this.f19329p);
                    break;
                case 15:
                    this.f19332s = typedArrayObtainStyledAttributes.getFloat(index, this.f19332s);
                    break;
                case 16:
                    this.f19333t = typedArrayObtainStyledAttributes.getFloat(index, this.f19333t);
                    break;
                case 17:
                    this.f19334u = typedArrayObtainStyledAttributes.getDimension(index, this.f19334u);
                    break;
                case 18:
                    this.f19335v = typedArrayObtainStyledAttributes.getDimension(index, this.f19335v);
                    break;
                case 19:
                    this.f19336w = typedArrayObtainStyledAttributes.getDimension(index, this.f19336w);
                    break;
                case 20:
                    this.f19325k = typedArrayObtainStyledAttributes.getFloat(index, this.f19325k);
                    break;
                case 21:
                    this.f19324j = typedArrayObtainStyledAttributes.getFloat(index, this.f19324j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(Key.MOTIONPROGRESS)) {
                    b10 = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b10 = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 6;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 7;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 8;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    b10 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 10;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 11;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = 12;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = 13;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b10 = 15;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    b10 = 16;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    b10 = 17;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f19325k = Key.a(obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.f19330q = Key.a(obj);
                break;
            case 3:
                this.f19331r = Key.a(obj);
                break;
            case 4:
                this.f19334u = Key.a(obj);
                break;
            case 5:
                this.f19335v = Key.a(obj);
                break;
            case 6:
                this.f19336w = Key.a(obj);
                break;
            case 7:
                this.f19332s = Key.a(obj);
                break;
            case 8:
                this.f19333t = Key.a(obj);
                break;
            case 9:
                this.f19328o = Key.a(obj);
                break;
            case 10:
                this.f19327n = Key.a(obj);
                break;
            case 11:
                this.f19329p = Key.a(obj);
                break;
            case 12:
                this.m = Key.a(obj);
                break;
            case 13:
                this.f19323i = Key.a(obj);
                break;
            case 14:
                this.f19322h = Key.a(obj);
                break;
            case 15:
                this.f19319e = Key.b(obj);
                break;
            case 16:
                this.f19324j = Key.a(obj);
                break;
            case 17:
                if (!(obj instanceof Integer)) {
                    this.f19320f = 7;
                    this.f19321g = obj.toString();
                } else {
                    this.f19320f = Key.b(obj);
                }
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo4634clone() {
        return new KeyCycle().copy(this);
    }
}
