package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19368e = 0.1f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f19372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f19373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap<String, Method> f19374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f19375l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f19376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f19377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f19380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f19384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f19385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19386x;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19387a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19387a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            sparseIntArray.append(R.styleable.KeyTrigger_onCross, 4);
            sparseIntArray.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            sparseIntArray.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            sparseIntArray.append(R.styleable.KeyTrigger_motionTarget, 7);
            sparseIntArray.append(R.styleable.KeyTrigger_triggerId, 6);
            sparseIntArray.append(R.styleable.KeyTrigger_triggerSlack, 5);
            sparseIntArray.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            sparseIntArray.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            sparseIntArray.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            sparseIntArray.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            sparseIntArray.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            sparseIntArray.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }
    }

    public KeyTrigger() {
        int i10 = Key.UNSET;
        this.f19369f = i10;
        this.f19370g = i10;
        this.f19371h = i10;
        this.f19372i = new RectF();
        this.f19373j = new RectF();
        this.f19374k = new HashMap<>();
        this.f19375l = null;
        int i11 = Key.UNSET;
        this.m = i11;
        this.f19376n = null;
        this.f19377o = null;
        this.f19378p = i11;
        this.f19379q = i11;
        this.f19380r = null;
        this.f19381s = true;
        this.f19382t = true;
        this.f19383u = true;
        this.f19384v = Float.NaN;
        this.f19386x = false;
        this.mType = 5;
        this.f19303d = new HashMap<>();
    }

    public static void d(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public final void c(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(Constant.DOT_STRING)) {
            boolean z10 = str.length() == 1;
            if (!z10) {
                str = str.substring(1).toLowerCase(Locale.ROOT);
            }
            for (String str2 : this.f19303d.keySet()) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (z10 || lowerCase.matches(str)) {
                    ConstraintAttribute constraintAttribute = this.f19303d.get(str2);
                    if (constraintAttribute != null) {
                        constraintAttribute.applyCustom(view);
                    }
                }
            }
            return;
        }
        if (this.f19374k.containsKey(str)) {
            method = this.f19374k.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.f19374k.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f19374k.put(str, null);
                view.getClass();
                Debug.getName(view);
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            view.getClass();
            Debug.getName(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    public void conditionallyFire(float f6, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        boolean z13;
        boolean z14;
        float f12;
        float f13;
        boolean z15;
        if (this.f19379q != Key.UNSET) {
            if (this.f19380r == null) {
                this.f19380r = ((ViewGroup) view.getParent()).findViewById(this.f19379q);
            }
            d(this.f19372i, this.f19380r, this.f19386x);
            d(this.f19373j, view, this.f19386x);
            if (this.f19372i.intersect(this.f19373j)) {
                if (this.f19381s) {
                    this.f19381s = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f19383u) {
                    this.f19383u = false;
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f19382t = true;
                z14 = z15;
                z12 = false;
            } else {
                if (this.f19381s) {
                    z10 = false;
                } else {
                    this.f19381s = true;
                    z10 = true;
                }
                if (this.f19382t) {
                    this.f19382t = false;
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f19383u = true;
                z14 = false;
            }
        } else {
            if (this.f19381s) {
                float f14 = this.f19384v;
                if ((this.f19385w - f14) * (f6 - f14) < 0.0f) {
                    this.f19381s = false;
                    z10 = true;
                }
                if (this.f19382t) {
                    f12 = this.f19384v;
                    f13 = f6 - f12;
                    if ((this.f19385w - f12) * f13 >= 0.0f && f13 < 0.0f) {
                        this.f19382t = false;
                        z11 = true;
                    }
                    if (this.f19383u) {
                        f10 = this.f19384v;
                        f11 = f6 - f10;
                        if ((this.f19385w - f10) * f11 < 0.0f || f11 <= 0.0f) {
                            z13 = false;
                        } else {
                            this.f19383u = false;
                            z13 = true;
                        }
                        boolean z16 = z11;
                        z14 = z13;
                        z12 = z16;
                    } else {
                        if (Math.abs(f6 - this.f19384v) > this.f19368e) {
                            this.f19383u = true;
                        }
                        z12 = z11;
                        z14 = false;
                    }
                } else if (Math.abs(f6 - this.f19384v) > this.f19368e) {
                    this.f19382t = true;
                }
                z11 = false;
                if (this.f19383u) {
                    f10 = this.f19384v;
                    f11 = f6 - f10;
                    if ((this.f19385w - f10) * f11 < 0.0f) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    boolean z17 = z11;
                    z14 = z13;
                    z12 = z17;
                } else {
                    if (Math.abs(f6 - this.f19384v) > this.f19368e) {
                        this.f19383u = true;
                    }
                    z12 = z11;
                    z14 = false;
                }
            } else if (Math.abs(f6 - this.f19384v) > this.f19368e) {
                this.f19381s = true;
            }
            z10 = false;
            if (this.f19382t) {
                f12 = this.f19384v;
                f13 = f6 - f12;
                if ((this.f19385w - f12) * f13 >= 0.0f) {
                }
                if (this.f19383u) {
                    f10 = this.f19384v;
                    f11 = f6 - f10;
                    if ((this.f19385w - f10) * f11 < 0.0f) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z11;
                    z14 = z13;
                    z12 = z18;
                } else {
                    if (Math.abs(f6 - this.f19384v) > this.f19368e) {
                        this.f19383u = true;
                    }
                    z12 = z11;
                    z14 = false;
                }
            } else if (Math.abs(f6 - this.f19384v) > this.f19368e) {
                this.f19382t = true;
            }
            z11 = false;
            if (this.f19383u) {
                f10 = this.f19384v;
                f11 = f6 - f10;
                if ((this.f19385w - f10) * f11 < 0.0f) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                boolean z19 = z11;
                z14 = z13;
                z12 = z19;
            } else {
                if (Math.abs(f6 - this.f19384v) > this.f19368e) {
                    this.f19383u = true;
                }
                z12 = z11;
                z14 = false;
            }
        }
        this.f19385w = f6;
        if (z12 || z10 || z14) {
            ((MotionLayout) view.getParent()).fireTrigger(this.f19378p, z14, f6);
        }
        View viewFindViewById = this.m == Key.UNSET ? view : ((MotionLayout) view.getParent()).findViewById(this.m);
        if (z12) {
            String str = this.f19376n;
            if (str != null) {
                c(viewFindViewById, str);
            }
            if (this.f19369f != Key.UNSET) {
                ((MotionLayout) view.getParent()).viewTransition(this.f19369f, viewFindViewById);
            }
        }
        if (z14) {
            String str2 = this.f19377o;
            if (str2 != null) {
                c(viewFindViewById, str2);
            }
            if (this.f19370g != Key.UNSET) {
                ((MotionLayout) view.getParent()).viewTransition(this.f19370g, viewFindViewById);
            }
        }
        if (z10) {
            String str3 = this.f19375l;
            if (str3 != null) {
                c(viewFindViewById, str3);
            }
            if (this.f19371h != Key.UNSET) {
                ((MotionLayout) view.getParent()).viewTransition(this.f19371h, viewFindViewById);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyTrigger keyTrigger = (KeyTrigger) key;
        keyTrigger.getClass();
        this.f19375l = keyTrigger.f19375l;
        this.m = keyTrigger.m;
        this.f19376n = keyTrigger.f19376n;
        this.f19377o = keyTrigger.f19377o;
        this.f19378p = keyTrigger.f19378p;
        this.f19379q = keyTrigger.f19379q;
        this.f19380r = keyTrigger.f19380r;
        this.f19368e = keyTrigger.f19368e;
        this.f19381s = keyTrigger.f19381s;
        this.f19382t = keyTrigger.f19382t;
        this.f19383u = keyTrigger.f19383u;
        this.f19384v = keyTrigger.f19384v;
        this.f19385w = keyTrigger.f19385w;
        this.f19386x = keyTrigger.f19386x;
        this.f19372i = keyTrigger.f19372i;
        this.f19373j = keyTrigger.f19373j;
        this.f19374k = keyTrigger.f19374k;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger);
        SparseIntArray sparseIntArray = a.f19387a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f19387a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f19376n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f19377o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f19375l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f19368e = typedArrayObtainStyledAttributes.getFloat(index, this.f19368e);
                    break;
                case 6:
                    this.f19378p = typedArrayObtainStyledAttributes.getResourceId(index, this.f19378p);
                    break;
                case 7:
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
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f19300a);
                    this.f19300a = integer;
                    this.f19384v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f19379q = typedArrayObtainStyledAttributes.getResourceId(index, this.f19379q);
                    break;
                case 10:
                    this.f19386x = typedArrayObtainStyledAttributes.getBoolean(index, this.f19386x);
                    break;
                case 11:
                    this.m = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case 12:
                    this.f19371h = typedArrayObtainStyledAttributes.getResourceId(index, this.f19371h);
                    break;
                case 13:
                    this.f19369f = typedArrayObtainStyledAttributes.getResourceId(index, this.f19369f);
                    break;
                case 14:
                    this.f19370g = typedArrayObtainStyledAttributes.getResourceId(index, this.f19370g);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                this.f19377o = obj.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.f19370g = Key.b(obj);
                break;
            case "triggerCollisionId":
                this.f19379q = Key.b(obj);
                break;
            case "triggerID":
                this.f19378p = Key.b(obj);
                break;
            case "negativeCross":
                this.f19376n = obj.toString();
                break;
            case "triggerCollisionView":
                this.f19380r = (View) obj;
                break;
            case "viewTransitionOnNegativeCross":
                this.f19369f = Key.b(obj);
                break;
            case "CROSS":
                this.f19375l = obj.toString();
                break;
            case "triggerSlack":
                this.f19368e = Key.a(obj);
                break;
            case "viewTransitionOnCross":
                this.f19371h = Key.b(obj);
                break;
            case "postLayout":
                this.f19386x = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
                break;
            case "triggerReceiver":
                this.m = Key.b(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo4634clone() {
        return new KeyTrigger().copy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
