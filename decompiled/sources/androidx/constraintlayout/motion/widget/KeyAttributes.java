package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends Key {
    public static final int KEY_TYPE = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19304e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19305f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19306g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19307h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19308i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f19309j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19310k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19311l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19312n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f19313o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19314p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19315q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f19316r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f19317s = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19318a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19318a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            sparseIntArray.append(R.styleable.KeyAttribute_android_elevation, 2);
            sparseIntArray.append(R.styleable.KeyAttribute_android_rotation, 4);
            sparseIntArray.append(R.styleable.KeyAttribute_android_rotationX, 5);
            sparseIntArray.append(R.styleable.KeyAttribute_android_rotationY, 6);
            sparseIntArray.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            sparseIntArray.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            sparseIntArray.append(R.styleable.KeyAttribute_android_scaleX, 7);
            sparseIntArray.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            sparseIntArray.append(R.styleable.KeyAttribute_transitionEasing, 9);
            sparseIntArray.append(R.styleable.KeyAttribute_motionTarget, 10);
            sparseIntArray.append(R.styleable.KeyAttribute_framePosition, 12);
            sparseIntArray.append(R.styleable.KeyAttribute_curveFit, 13);
            sparseIntArray.append(R.styleable.KeyAttribute_android_scaleY, 14);
            sparseIntArray.append(R.styleable.KeyAttribute_android_translationX, 15);
            sparseIntArray.append(R.styleable.KeyAttribute_android_translationY, 16);
            sparseIntArray.append(R.styleable.KeyAttribute_android_translationZ, 17);
            sparseIntArray.append(R.styleable.KeyAttribute_motionProgress, 18);
        }
    }

    public KeyAttributes() {
        this.mType = 1;
        this.f19303d = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> map) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = map.get(str);
            if (viewSpline != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f19308i)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19308i);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f19309j)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19309j);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f19314p)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19314p);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f19315q)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19315q);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f19316r)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19316r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f19317s)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19317s);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f19312n)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19312n);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f19313o)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19313o);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f19308i)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19310k);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f19309j)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19311l);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f19307h)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19307h);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f19306g)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19306g);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.m);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f19305f)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.f19300a, this.f19305f);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f19303d.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewSpline.CustomSet) viewSpline).setPoint(this.f19300a, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyAttributes keyAttributes = (KeyAttributes) key;
        this.f19304e = keyAttributes.f19304e;
        this.f19305f = keyAttributes.f19305f;
        this.f19306g = keyAttributes.f19306g;
        this.f19307h = keyAttributes.f19307h;
        this.f19308i = keyAttributes.f19308i;
        this.f19309j = keyAttributes.f19309j;
        this.f19310k = keyAttributes.f19310k;
        this.f19311l = keyAttributes.f19311l;
        this.m = keyAttributes.m;
        this.f19312n = keyAttributes.f19312n;
        this.f19313o = keyAttributes.f19313o;
        this.f19314p = keyAttributes.f19314p;
        this.f19315q = keyAttributes.f19315q;
        this.f19316r = keyAttributes.f19316r;
        this.f19317s = keyAttributes.f19317s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f19305f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f19306g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f19307h)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f19308i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f19309j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f19310k)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (!Float.isNaN(this.f19311l)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (!Float.isNaN(this.f19314p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f19315q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f19316r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f19312n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f19313o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f19317s)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute);
        SparseIntArray sparseIntArray = a.f19318a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f19318a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f19305f = typedArrayObtainStyledAttributes.getFloat(index, this.f19305f);
                    break;
                case 2:
                    this.f19306g = typedArrayObtainStyledAttributes.getDimension(index, this.f19306g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f19307h = typedArrayObtainStyledAttributes.getFloat(index, this.f19307h);
                    break;
                case 5:
                    this.f19308i = typedArrayObtainStyledAttributes.getFloat(index, this.f19308i);
                    break;
                case 6:
                    this.f19309j = typedArrayObtainStyledAttributes.getFloat(index, this.f19309j);
                    break;
                case 7:
                    this.f19312n = typedArrayObtainStyledAttributes.getFloat(index, this.f19312n);
                    break;
                case 8:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
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
                    this.f19304e = typedArrayObtainStyledAttributes.getInteger(index, this.f19304e);
                    break;
                case 14:
                    this.f19313o = typedArrayObtainStyledAttributes.getFloat(index, this.f19313o);
                    break;
                case 15:
                    this.f19314p = typedArrayObtainStyledAttributes.getDimension(index, this.f19314p);
                    break;
                case 16:
                    this.f19315q = typedArrayObtainStyledAttributes.getDimension(index, this.f19315q);
                    break;
                case 17:
                    this.f19316r = typedArrayObtainStyledAttributes.getDimension(index, this.f19316r);
                    break;
                case 18:
                    this.f19317s = typedArrayObtainStyledAttributes.getFloat(index, this.f19317s);
                    break;
                case 19:
                    this.f19310k = typedArrayObtainStyledAttributes.getDimension(index, this.f19310k);
                    break;
                case 20:
                    this.f19311l = typedArrayObtainStyledAttributes.getDimension(index, this.f19311l);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> map) {
        if (this.f19304e == -1) {
            return;
        }
        if (!Float.isNaN(this.f19305f)) {
            map.put("alpha", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19306g)) {
            map.put("elevation", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19307h)) {
            map.put(Key.ROTATION, Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19308i)) {
            map.put("rotationX", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19309j)) {
            map.put("rotationY", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19310k)) {
            map.put(Key.PIVOT_X, Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19311l)) {
            map.put(Key.PIVOT_Y, Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19314p)) {
            map.put("translationX", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19315q)) {
            map.put("translationY", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19316r)) {
            map.put("translationZ", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19312n)) {
            map.put("scaleX", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19313o)) {
            map.put("scaleY", Integer.valueOf(this.f19304e));
        }
        if (!Float.isNaN(this.f19317s)) {
            map.put("progress", Integer.valueOf(this.f19304e));
        }
        if (this.f19303d.size() > 0) {
            Iterator<String> it = this.f19303d.keySet().iterator();
            while (it.hasNext()) {
                map.put(androidx.camera.core.processing.f.d("CUSTOM,", it.next()), Integer.valueOf(this.f19304e));
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
            case -760884510:
                if (str.equals(Key.PIVOT_X)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (str.equals(Key.PIVOT_Y)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    b10 = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 12;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b10 = 15;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f19317s = Key.a(obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.f19308i = Key.a(obj);
                break;
            case 3:
                this.f19309j = Key.a(obj);
                break;
            case 4:
                this.f19314p = Key.a(obj);
                break;
            case 5:
                this.f19315q = Key.a(obj);
                break;
            case 6:
                this.f19316r = Key.a(obj);
                break;
            case 7:
                this.f19312n = Key.a(obj);
                break;
            case 8:
                this.f19313o = Key.a(obj);
                break;
            case 9:
                this.f19310k = Key.a(obj);
                break;
            case 10:
                this.f19311l = Key.a(obj);
                break;
            case 11:
                this.f19307h = Key.a(obj);
                break;
            case 12:
                this.f19306g = Key.a(obj);
                break;
            case 13:
                this.m = Key.a(obj);
                break;
            case 14:
                this.f19305f = Key.a(obj);
                break;
            case 15:
                this.f19304e = Key.b(obj);
                break;
            case 16:
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                } else {
                    ((Boolean) obj).booleanValue();
                }
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo4634clone() {
        return new KeyAttributes().copy(this);
    }
}
