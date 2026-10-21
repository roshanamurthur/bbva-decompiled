package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_SHAPE = "waveShape";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19352e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19353f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19354g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19355h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19356i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f19357j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19358k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19359l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19360n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f19361o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19362p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19363q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19364r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f19365s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f19366t = 0.0f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19367a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19367a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            sparseIntArray.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            sparseIntArray.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            sparseIntArray.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            sparseIntArray.append(R.styleable.KeyTimeCycle_framePosition, 12);
            sparseIntArray.append(R.styleable.KeyTimeCycle_curveFit, 13);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            sparseIntArray.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            sparseIntArray.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            sparseIntArray.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            sparseIntArray.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }
    }

    public KeyTimeCycle() {
        this.mType = 3;
        this.f19303d = new HashMap<>();
    }

    public void addTimeValues(HashMap<String, ViewTimeCycle> map) {
        for (String str : map.keySet()) {
            ViewTimeCycle viewTimeCycle = map.get(str);
            if (viewTimeCycle != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f19356i)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19356i, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f19357j)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19357j, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f19360n)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19360n, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f19361o)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19361o, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f19362p)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19362p, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f19363q)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19363q, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f19359l)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19359l, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.m, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f19355h)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19355h, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f19354g)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19354g, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f19358k)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19358k, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f19353f)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.f19300a, this.f19353f, this.f19365s, this.f19364r, this.f19366t);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f19303d.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewTimeCycle.CustomSet) viewTimeCycle).setPoint(this.f19300a, constraintAttribute, this.f19365s, this.f19364r, this.f19366t);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyTimeCycle keyTimeCycle = (KeyTimeCycle) key;
        keyTimeCycle.getClass();
        this.f19352e = keyTimeCycle.f19352e;
        this.f19364r = keyTimeCycle.f19364r;
        this.f19365s = keyTimeCycle.f19365s;
        this.f19366t = keyTimeCycle.f19366t;
        this.f19363q = keyTimeCycle.f19363q;
        this.f19353f = keyTimeCycle.f19353f;
        this.f19354g = keyTimeCycle.f19354g;
        this.f19355h = keyTimeCycle.f19355h;
        this.f19358k = keyTimeCycle.f19358k;
        this.f19356i = keyTimeCycle.f19356i;
        this.f19357j = keyTimeCycle.f19357j;
        this.f19359l = keyTimeCycle.f19359l;
        this.m = keyTimeCycle.m;
        this.f19360n = keyTimeCycle.f19360n;
        this.f19361o = keyTimeCycle.f19361o;
        this.f19362p = keyTimeCycle.f19362p;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f19353f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f19354g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f19355h)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f19356i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f19357j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f19360n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f19361o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f19362p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f19358k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f19359l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f19363q)) {
            hashSet.add("progress");
        }
        if (this.f19303d.size() > 0) {
            Iterator<String> it = this.f19303d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle);
        SparseIntArray sparseIntArray = a.f19367a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f19367a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f19353f = typedArrayObtainStyledAttributes.getFloat(index, this.f19353f);
                    break;
                case 2:
                    this.f19354g = typedArrayObtainStyledAttributes.getDimension(index, this.f19354g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f19355h = typedArrayObtainStyledAttributes.getFloat(index, this.f19355h);
                    break;
                case 5:
                    this.f19356i = typedArrayObtainStyledAttributes.getFloat(index, this.f19356i);
                    break;
                case 6:
                    this.f19357j = typedArrayObtainStyledAttributes.getFloat(index, this.f19357j);
                    break;
                case 7:
                    this.f19359l = typedArrayObtainStyledAttributes.getFloat(index, this.f19359l);
                    break;
                case 8:
                    this.f19358k = typedArrayObtainStyledAttributes.getFloat(index, this.f19358k);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f19300a = typedArrayObtainStyledAttributes.getInt(index, this.f19300a);
                    break;
                case 13:
                    this.f19352e = typedArrayObtainStyledAttributes.getInteger(index, this.f19352e);
                    break;
                case 14:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.f19360n = typedArrayObtainStyledAttributes.getDimension(index, this.f19360n);
                    break;
                case 16:
                    this.f19361o = typedArrayObtainStyledAttributes.getDimension(index, this.f19361o);
                    break;
                case 17:
                    this.f19362p = typedArrayObtainStyledAttributes.getDimension(index, this.f19362p);
                    break;
                case 18:
                    this.f19363q = typedArrayObtainStyledAttributes.getFloat(index, this.f19363q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f19364r = 7;
                    } else {
                        this.f19364r = typedArrayObtainStyledAttributes.getInt(index, this.f19364r);
                    }
                    break;
                case 20:
                    this.f19365s = typedArrayObtainStyledAttributes.getFloat(index, this.f19365s);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f19366t = typedArrayObtainStyledAttributes.getDimension(index, this.f19366t);
                    } else {
                        this.f19366t = typedArrayObtainStyledAttributes.getFloat(index, this.f19366t);
                    }
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> map) {
        if (this.f19352e == -1) {
            return;
        }
        if (!Float.isNaN(this.f19353f)) {
            map.put("alpha", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19354g)) {
            map.put("elevation", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19355h)) {
            map.put(Key.ROTATION, Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19356i)) {
            map.put("rotationX", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19357j)) {
            map.put("rotationY", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19360n)) {
            map.put("translationX", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19361o)) {
            map.put("translationY", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19362p)) {
            map.put("translationZ", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19358k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19359l)) {
            map.put("scaleX", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19359l)) {
            map.put("scaleY", Integer.valueOf(this.f19352e));
        }
        if (!Float.isNaN(this.f19363q)) {
            map.put("progress", Integer.valueOf(this.f19352e));
        }
        if (this.f19303d.size() > 0) {
            Iterator<String> it = this.f19303d.keySet().iterator();
            while (it.hasNext()) {
                map.put(androidx.camera.core.processing.f.d("CUSTOM,", it.next()), Integer.valueOf(this.f19352e));
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
            case 1532805160:
                if (str.equals("waveShape")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f19363q = Key.a(obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.f19356i = Key.a(obj);
                break;
            case 3:
                this.f19357j = Key.a(obj);
                break;
            case 4:
                this.f19360n = Key.a(obj);
                break;
            case 5:
                this.f19361o = Key.a(obj);
                break;
            case 6:
                this.f19362p = Key.a(obj);
                break;
            case 7:
                this.f19359l = Key.a(obj);
                break;
            case 8:
                this.m = Key.a(obj);
                break;
            case 9:
                this.f19355h = Key.a(obj);
                break;
            case 10:
                this.f19354g = Key.a(obj);
                break;
            case 11:
                this.f19358k = Key.a(obj);
                break;
            case 12:
                this.f19353f = Key.a(obj);
                break;
            case 13:
                this.f19366t = Key.a(obj);
                break;
            case 14:
                this.f19365s = Key.a(obj);
                break;
            case 15:
                this.f19352e = Key.b(obj);
                break;
            case 16:
                if (!(obj instanceof Integer)) {
                    this.f19364r = 7;
                    obj.toString();
                } else {
                    this.f19364r = Key.b(obj);
                }
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo4634clone() {
        return new KeyTimeCycle().copy(this);
    }
}
