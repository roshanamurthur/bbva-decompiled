package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyTimeCycle extends MotionKey {
    public static final int KEY_TYPE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18793a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18794b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18795c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18796d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18797e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18798f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18799g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18800h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18801i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18802j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18803k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18804l = Float.NaN;
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18805n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18806o = 0.0f;

    public MotionKeyTimeCycle() {
        this.mType = 3;
        this.mCustom = new HashMap<>();
    }

    public void addTimeValues(HashMap<String, TimeCycleSplineSet> map) {
        for (String str : map.keySet()) {
            TimeCycleSplineSet timeCycleSplineSet = map.get(str);
            if (timeCycleSplineSet != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f18796d)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18796d, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f18797e)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18797e, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.f18795c)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18795c, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f18801i)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18801i, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f18802j)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18802j, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f18803k)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18803k, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f18804l)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18804l, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f18799g)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18799g, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f18800h)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18800h, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f18803k)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18803k, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f18793a)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18793a, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.f18798f)) {
                                break;
                            } else {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f18798f, this.f18805n, this.m, this.f18806o);
                                break;
                            }
                            break;
                        default:
                            Utils.loge("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    CustomVariable customVariable = this.mCustom.get(str.substring(7));
                    if (customVariable != null) {
                        ((TimeCycleSplineSet.CustomVarSet) timeCycleSplineSet).setPoint(this.mFramePosition, customVariable, this.f18805n, this.m, this.f18806o);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f18793a)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f18794b)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f18795c)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f18796d)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f18797e)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f18799g)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f18800h)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f18798f)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f18801i)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f18802j)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f18803k)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return c.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 == 100) {
            this.mFramePosition = i11;
            return true;
        }
        if (i10 != 421) {
            return super.setValue(i10, i11);
        }
        this.m = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public MotionKey mo4632clone() {
        return new MotionKeyTimeCycle().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTimeCycle copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyTimeCycle motionKeyTimeCycle = (MotionKeyTimeCycle) motionKey;
        motionKeyTimeCycle.getClass();
        this.m = motionKeyTimeCycle.m;
        this.f18805n = motionKeyTimeCycle.f18805n;
        this.f18806o = motionKeyTimeCycle.f18806o;
        this.f18804l = motionKeyTimeCycle.f18804l;
        this.f18793a = motionKeyTimeCycle.f18793a;
        this.f18794b = motionKeyTimeCycle.f18794b;
        this.f18795c = motionKeyTimeCycle.f18795c;
        this.f18798f = motionKeyTimeCycle.f18798f;
        this.f18796d = motionKeyTimeCycle.f18796d;
        this.f18797e = motionKeyTimeCycle.f18797e;
        this.f18799g = motionKeyTimeCycle.f18799g;
        this.f18800h = motionKeyTimeCycle.f18800h;
        this.f18801i = motionKeyTimeCycle.f18801i;
        this.f18802j = motionKeyTimeCycle.f18802j;
        this.f18803k = motionKeyTimeCycle.f18803k;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f6) {
        if (i10 == 315) {
            this.f18804l = MotionKey.a(Float.valueOf(f6));
            return true;
        }
        if (i10 == 401) {
            Object objValueOf = Float.valueOf(f6);
            if (objValueOf instanceof Integer) {
                ((Integer) objValueOf).intValue();
                return true;
            }
            Integer.parseInt(objValueOf.toString());
            return true;
        }
        if (i10 == 403) {
            this.f18793a = f6;
            return true;
        }
        if (i10 == 416) {
            this.f18798f = MotionKey.a(Float.valueOf(f6));
            return true;
        }
        if (i10 == 423) {
            this.f18805n = MotionKey.a(Float.valueOf(f6));
            return true;
        }
        if (i10 != 424) {
            switch (i10) {
                case 304:
                    this.f18801i = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 305:
                    this.f18802j = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 306:
                    this.f18803k = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 307:
                    this.f18794b = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 308:
                    this.f18796d = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 309:
                    this.f18797e = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 310:
                    this.f18795c = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 311:
                    this.f18799g = MotionKey.a(Float.valueOf(f6));
                    return true;
                case 312:
                    this.f18800h = MotionKey.a(Float.valueOf(f6));
                    return true;
                default:
                    return super.setValue(i10, f6);
            }
        }
        this.f18806o = MotionKey.a(Float.valueOf(f6));
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 == 420) {
            return true;
        }
        if (i10 != 421) {
            return super.setValue(i10, str);
        }
        this.m = 7;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, boolean z10) {
        return super.setValue(i10, z10);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
    }
}
