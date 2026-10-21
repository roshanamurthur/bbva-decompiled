package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyCycle extends MotionKey {
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18775a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18776b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18777c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18778d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18779e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18780f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18781g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18782h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18783i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18784j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18785k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18786l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18787n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18788o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18789p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18790q = Float.NaN;

    public MotionKeyCycle() {
        this.mType = 4;
        this.mCustom = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> map) {
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                CustomVariable customVariable = this.mCustom.get(str.substring(7));
                if (customVariable != null && customVariable.getType() == 901 && (keyCycleOscillator = map.get(str)) != null) {
                    keyCycleOscillator.setPoint(this.mFramePosition, this.f18775a, this.f18776b, -1, this.f18777c, this.f18778d, this.f18779e / 360.0f, customVariable.getValueToInterpolate(), customVariable);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (keyCycleOscillator2 = map.get(str)) != null) {
                    keyCycleOscillator2.setPoint(this.mFramePosition, this.f18775a, this.f18776b, -1, this.f18777c, this.f18778d, this.f18779e / 360.0f, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public MotionKey mo4632clone() {
        return null;
    }

    public void dump() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.f18775a + ", mWavePeriod=" + this.f18777c + ", mWaveOffset=" + this.f18778d + ", mWavePhase=" + this.f18779e + ", mRotation=" + this.f18783i + AbstractJsonLexerKt.END_OBJ);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f18781g)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f18782h)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f18783i)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f18785k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f18786l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f18787n)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f18784j)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f18788o)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f18789p)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f18790q)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -1581616630:
                b10 = !str.equals(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE) ? (byte) -1 : (byte) 0;
                break;
            case -1310311125:
                b10 = !str.equals("easing") ? (byte) -1 : (byte) 1;
                break;
            case -1249320806:
                b10 = !str.equals("rotationX") ? (byte) -1 : (byte) 2;
                break;
            case -1249320805:
                b10 = !str.equals("rotationY") ? (byte) -1 : (byte) 3;
                break;
            case -1249320804:
                b10 = !str.equals("rotationZ") ? (byte) -1 : (byte) 4;
                break;
            case -1225497657:
                b10 = !str.equals("translationX") ? (byte) -1 : (byte) 5;
                break;
            case -1225497656:
                b10 = !str.equals("translationY") ? (byte) -1 : (byte) 6;
                break;
            case -1225497655:
                b10 = !str.equals("translationZ") ? (byte) -1 : (byte) 7;
                break;
            case -1019779949:
                b10 = !str.equals(TypedValues.CycleType.S_WAVE_OFFSET) ? (byte) -1 : (byte) 8;
                break;
            case -1001078227:
                b10 = !str.equals("progress") ? (byte) -1 : (byte) 9;
                break;
            case -991726143:
                b10 = !str.equals(TypedValues.CycleType.S_WAVE_PERIOD) ? (byte) -1 : (byte) 10;
                break;
            case -987906986:
                b10 = !str.equals("pivotX") ? (byte) -1 : (byte) 11;
                break;
            case -987906985:
                b10 = !str.equals("pivotY") ? (byte) -1 : (byte) 12;
                break;
            case -908189618:
                b10 = !str.equals("scaleX") ? (byte) -1 : (byte) 13;
                break;
            case -908189617:
                b10 = !str.equals("scaleY") ? (byte) -1 : Constants.CVR_B1b41_1110_ONLINE_PIN;
                break;
            case 92909918:
                b10 = !str.equals("alpha") ? (byte) -1 : (byte) 15;
                break;
            case 106629499:
                b10 = !str.equals(TypedValues.CycleType.S_WAVE_PHASE) ? (byte) -1 : (byte) 16;
                break;
            case 579057826:
                b10 = !str.equals("curveFit") ? (byte) -1 : (byte) 17;
                break;
            case 803192288:
                b10 = !str.equals("pathRotate") ? (byte) -1 : MessageUtils.MESSAGE_18_DC2;
                break;
            case 1532805160:
                b10 = !str.equals("waveShape") ? (byte) -1 : (byte) 19;
                break;
            case 1941332754:
                b10 = !str.equals("visibility") ? (byte) -1 : (byte) 20;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE;
            case 1:
                return TypedValues.CycleType.TYPE_EASING;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case 8:
                return TypedValues.CycleType.TYPE_WAVE_OFFSET;
            case 9:
                return 315;
            case 10:
                return TypedValues.CycleType.TYPE_WAVE_PERIOD;
            case 11:
                return 313;
            case 12:
                return 314;
            case 13:
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return TypedValues.CycleType.TYPE_WAVE_PHASE;
            case 17:
                return 401;
            case 18:
                return TypedValues.CycleType.TYPE_PATH_ROTATE;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    public float getValue(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f18785k;
            case "rotationY":
                return this.f18786l;
            case "rotationZ":
                return this.f18783i;
            case "translationX":
                return this.f18788o;
            case "translationY":
                return this.f18789p;
            case "translationZ":
                return this.f18790q;
            case "offset":
                return this.f18778d;
            case "progress":
                return this.f18780f;
            case "scaleX":
                return this.m;
            case "scaleY":
                return this.f18787n;
            case "elevation":
                return this.f18782h;
            case "alpha":
                return this.f18781g;
            case "phase":
                return this.f18779e;
            case "pathRotate":
                return this.f18784j;
            default:
                return Float.NaN;
        }
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        Utils.log(" ------------- " + this.mFramePosition + " -------------");
        Utils.log("MotionKeyCycle{Shape=" + this.f18775a + ", Period=" + this.f18777c + ", Offset=" + this.f18778d + ", Phase=" + this.f18779e + AbstractJsonLexerKt.END_OBJ);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Utils.log(strArr[i10] + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + getValue(strArr[i10]));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 != 401) {
            if (i10 != 421) {
                if (setValue(i10, i11)) {
                    return true;
                }
                return super.setValue(i10, i11);
            }
            this.f18775a = i11;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 != 420) {
            if (i10 != 422) {
                return super.setValue(i10, str);
            }
            this.f18776b = str;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f6) {
        if (i10 == 315) {
            this.f18780f = f6;
            return true;
        }
        if (i10 == 403) {
            this.f18781g = f6;
            return true;
        }
        if (i10 != 416) {
            switch (i10) {
                case 304:
                    this.f18788o = f6;
                    return true;
                case 305:
                    this.f18789p = f6;
                    return true;
                case 306:
                    this.f18790q = f6;
                    return true;
                case 307:
                    this.f18782h = f6;
                    return true;
                case 308:
                    this.f18785k = f6;
                    return true;
                case 309:
                    this.f18786l = f6;
                    return true;
                case 310:
                    this.f18783i = f6;
                    return true;
                case 311:
                    this.m = f6;
                    return true;
                case 312:
                    this.f18787n = f6;
                    return true;
                default:
                    switch (i10) {
                        case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                            this.f18777c = f6;
                            return true;
                        case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                            this.f18778d = f6;
                            return true;
                        case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                            this.f18779e = f6;
                            return true;
                        default:
                            return super.setValue(i10, f6);
                    }
            }
        }
        this.f18784j = f6;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
    }
}
