package androidx.constraintlayout.core.motion.key;

import androidx.camera.core.processing.f;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.a;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyAttributes extends MotionKey {
    public static final int KEY_TYPE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18761a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18762b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18763c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18764d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18765e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18766f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18767g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18768h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18769i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18770j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18771k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18772l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18773n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18774o = Float.NaN;

    public MotionKeyAttributes() {
        this.mType = 1;
        this.mCustom = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
        for (String str : map.keySet()) {
            SplineSet splineSet = map.get(str);
            if (splineSet != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f18765e)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18765e);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f18766f)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18766f);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.f18764d)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18764d);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f18772l)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18772l);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.m);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f18773n)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18773n);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f18774o)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18774o);
                                break;
                            }
                            break;
                        case "pivotX":
                            if (Float.isNaN(this.f18765e)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18767g);
                                break;
                            }
                            break;
                        case "pivotY":
                            if (Float.isNaN(this.f18766f)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18768h);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f18770j)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18770j);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f18771k)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18771k);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f18763c)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18763c);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f18762b)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18762b);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.f18769i)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.f18769i);
                                break;
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes ".concat(str));
                            break;
                    }
                } else {
                    CustomVariable customVariable = this.mCustom.get(str.substring(7));
                    if (customVariable != null) {
                        ((SplineSet.CustomSpline) splineSet).setPoint(this.mFramePosition, customVariable);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public MotionKey mo4632clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f18762b)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f18763c)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f18764d)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f18765e)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f18766f)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f18767g)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f18768h)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f18772l)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f18773n)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f18769i)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f18770j)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f18771k)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f18774o)) {
            hashSet.add("progress");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public int getCurveFit() {
        return this.f18761a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return a.a(str);
    }

    public void printAttributes() {
        float f6;
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        System.out.println(" ------------- " + this.mFramePosition + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int iA = a.a(strArr[i10]);
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr[i10]);
            sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            if (iA != 100) {
                switch (iA) {
                    case 303:
                        f6 = this.f18762b;
                        break;
                    case 304:
                        f6 = this.f18772l;
                        break;
                    case 305:
                        f6 = this.m;
                        break;
                    case 306:
                        f6 = this.f18773n;
                        break;
                    case 307:
                        f6 = this.f18763c;
                        break;
                    case 308:
                        f6 = this.f18765e;
                        break;
                    case 309:
                        f6 = this.f18766f;
                        break;
                    case 310:
                        f6 = this.f18764d;
                        break;
                    case 311:
                        f6 = this.f18770j;
                        break;
                    case 312:
                        f6 = this.f18771k;
                        break;
                    case 313:
                        f6 = this.f18767g;
                        break;
                    case 314:
                        f6 = this.f18768h;
                        break;
                    case 315:
                        f6 = this.f18774o;
                        break;
                    case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                        f6 = this.f18769i;
                        break;
                    default:
                        f6 = Float.NaN;
                        break;
                }
            } else {
                f6 = this.mFramePosition;
            }
            sb2.append(f6);
            printStream.println(sb2.toString());
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.f18762b)) {
            map.put("alpha", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18763c)) {
            map.put("elevation", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18764d)) {
            map.put("rotationZ", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18765e)) {
            map.put("rotationX", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18766f)) {
            map.put("rotationY", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18767g)) {
            map.put("pivotX", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18768h)) {
            map.put("pivotY", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18772l)) {
            map.put("translationX", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.m)) {
            map.put("translationY", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18773n)) {
            map.put("translationZ", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18769i)) {
            map.put("pathRotate", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18770j)) {
            map.put("scaleX", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18771k)) {
            map.put("scaleY", Integer.valueOf(this.f18761a));
        }
        if (!Float.isNaN(this.f18774o)) {
            map.put("progress", Integer.valueOf(this.f18761a));
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                map.put(f.d("CUSTOM,", it.next()), Integer.valueOf(this.f18761a));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 == 100) {
            this.mFramePosition = i11;
            return true;
        }
        if (i10 == 301) {
            this.f18761a = i11;
            return true;
        }
        if (i10 == 302 || setValue(i10, i11)) {
            return true;
        }
        return super.setValue(i10, i11);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f6) {
        if (i10 != 100) {
            switch (i10) {
                case 303:
                    this.f18762b = f6;
                    return true;
                case 304:
                    this.f18772l = f6;
                    return true;
                case 305:
                    this.m = f6;
                    return true;
                case 306:
                    this.f18773n = f6;
                    return true;
                case 307:
                    this.f18763c = f6;
                    return true;
                case 308:
                    this.f18765e = f6;
                    return true;
                case 309:
                    this.f18766f = f6;
                    return true;
                case 310:
                    this.f18764d = f6;
                    return true;
                case 311:
                    this.f18770j = f6;
                    return true;
                case 312:
                    this.f18771k = f6;
                    return true;
                case 313:
                    this.f18767g = f6;
                    return true;
                case 314:
                    this.f18768h = f6;
                    return true;
                case 315:
                    this.f18774o = f6;
                    return true;
                case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                    this.f18769i = f6;
                    return true;
                default:
                    return super.setValue(i10, f6);
            }
        }
        this.f18769i = f6;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 == 101 || i10 == 317) {
            return true;
        }
        return super.setValue(i10, str);
    }
}
