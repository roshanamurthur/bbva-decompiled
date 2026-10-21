package androidx.constraintlayout.core.motion;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.e;
import com.mypinpad.tsdk.isolation.y2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class CustomVariable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18721f;

    public CustomVariable(CustomVariable customVariable) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18719d = Float.NaN;
        this.f18720e = null;
        this.f18716a = customVariable.f18716a;
        this.f18717b = customVariable.f18717b;
        this.f18718c = customVariable.f18718c;
        this.f18719d = customVariable.f18719d;
        this.f18720e = customVariable.f18720e;
        this.f18721f = customVariable.f18721f;
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String colorString(int i10) {
        String str = "00000000" + Integer.toHexString(i10);
        return "#" + str.substring(str.length() - 8);
    }

    public static int hsvToRgb(float f6, float f10, float f11) {
        float f12 = f6 * 6.0f;
        int i10 = (int) f12;
        float f13 = f12 - i10;
        float f14 = f11 * 255.0f;
        int iA = (int) e.a(1.0f, f10, f14, 0.5f);
        int i11 = (int) (((1.0f - (f13 * f10)) * f14) + 0.5f);
        int i12 = (int) (((1.0f - ((1.0f - f13) * f10)) * f14) + 0.5f);
        int i13 = (int) (f14 + 0.5f);
        if (i10 == 0) {
            return ((i13 << 16) + (i12 << 8) + iA) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i10 == 1) {
            return ((i11 << 16) + (i13 << 8) + iA) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i10 == 2) {
            return ((iA << 16) + (i13 << 8) + i12) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i10 == 3) {
            return ((iA << 16) + (i11 << 8) + i13) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i10 == 4) {
            return ((i12 << 16) + (iA << 8) + i13) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i10 != 5) {
            return 0;
        }
        return ((i13 << 16) + (iA << 8) + i11) | ViewCompat.MEASURED_STATE_MASK;
    }

    public static int rgbaTocColor(float f6, float f10, float f11, float f12) {
        int iA = a((int) (f6 * 255.0f));
        int iA2 = a((int) (f10 * 255.0f));
        return (iA << 16) | (a((int) (f12 * 255.0f)) << 24) | (iA2 << 8) | a((int) (f11 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        String str = this.f18716a;
        int i10 = this.f18717b;
        switch (i10) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
            case 902:
            case 906:
                motionWidget.setCustomAttribute(str, i10, this.f18718c);
                break;
            case 901:
            case 905:
                motionWidget.setCustomAttribute(str, i10, this.f18719d);
                break;
            case 903:
                motionWidget.setCustomAttribute(str, i10, this.f18720e);
                break;
            case 904:
                motionWidget.setCustomAttribute(str, i10, this.f18721f);
                break;
        }
    }

    public CustomVariable copy() {
        return new CustomVariable(this);
    }

    public boolean diff(CustomVariable customVariable) {
        if (customVariable == null) {
            return false;
        }
        int i10 = customVariable.f18717b;
        int i11 = this.f18717b;
        if (i11 != i10) {
            return false;
        }
        switch (i11) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
            case 906:
                return this.f18718c == customVariable.f18718c;
            case 901:
                return this.f18719d == customVariable.f18719d;
            case 902:
                return this.f18718c == customVariable.f18718c;
            case 903:
                return this.f18718c == customVariable.f18718c;
            case 904:
                return this.f18721f == customVariable.f18721f;
            case 905:
                return this.f18719d == customVariable.f18719d;
            default:
                return false;
        }
    }

    public boolean getBooleanValue() {
        return this.f18721f;
    }

    public int getColorValue() {
        return this.f18718c;
    }

    public float getFloatValue() {
        return this.f18719d;
    }

    public int getIntegerValue() {
        return this.f18718c;
    }

    public int getInterpolatedColor(float[] fArr) {
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.f18716a;
    }

    public String getStringValue() {
        return this.f18720e;
    }

    public int getType() {
        return this.f18717b;
    }

    public float getValueToInterpolate() {
        switch (this.f18717b) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                return this.f18718c;
            case 901:
                return this.f18719d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                return this.f18721f ? 1.0f : 0.0f;
            case 905:
                return this.f18719d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.f18717b) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                fArr[0] = this.f18718c;
                return;
            case 901:
                fArr[0] = this.f18719d;
                return;
            case 902:
                int i10 = this.f18718c;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                fArr[0] = this.f18721f ? 1.0f : 0.0f;
                return;
            case 905:
                fArr[0] = this.f18719d;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i10 = this.f18717b;
        return (i10 == 903 || i10 == 904 || i10 == 906) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        return this.f18717b != 902 ? 1 : 4;
    }

    public void setBooleanValue(boolean z10) {
        this.f18721f = z10;
    }

    public void setFloatValue(float f6) {
        this.f18719d = f6;
    }

    public void setIntValue(int i10) {
        this.f18718c = i10;
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        String str = this.f18716a;
        int i10 = this.f18717b;
        switch (i10) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                motionWidget.setCustomAttribute(str, i10, (int) fArr[0]);
                return;
            case 901:
            case 905:
                motionWidget.setCustomAttribute(str, i10, fArr[0]);
                return;
            case 902:
                motionWidget.setCustomAttribute(str, i10, (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case 903:
            case 906:
                throw new RuntimeException("unable to interpolate " + str);
            case 904:
                motionWidget.setCustomAttribute(str, i10, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void setStringValue(String str) {
        this.f18720e = str;
    }

    public void setValue(float[] fArr) {
        switch (this.f18717b) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
            case 906:
                this.f18718c = (int) fArr[0];
                return;
            case 901:
            case 905:
                this.f18719d = fArr[0];
                return;
            case 902:
                this.f18718c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                this.f18721f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public String toString() {
        String strB = y2.b(new StringBuilder(), this.f18716a, AbstractJsonLexerKt.COLON);
        switch (this.f18717b) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
                StringBuilder sbD = c.d(strB);
                sbD.append(this.f18718c);
                return sbD.toString();
            case 901:
                StringBuilder sbD2 = c.d(strB);
                sbD2.append(this.f18719d);
                return sbD2.toString();
            case 902:
                StringBuilder sbD3 = c.d(strB);
                sbD3.append(colorString(this.f18718c));
                return sbD3.toString();
            case 903:
                StringBuilder sbD4 = c.d(strB);
                sbD4.append(this.f18720e);
                return sbD4.toString();
            case 904:
                StringBuilder sbD5 = c.d(strB);
                sbD5.append(Boolean.valueOf(this.f18721f));
                return sbD5.toString();
            case 905:
                StringBuilder sbD6 = c.d(strB);
                sbD6.append(this.f18719d);
                return sbD6.toString();
            default:
                return u.f(strB, "????");
        }
    }

    public CustomVariable(String str, int i10, String str2) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18719d = Float.NaN;
        this.f18716a = str;
        this.f18717b = i10;
        this.f18720e = str2;
    }

    public void setValue(Object obj) {
        switch (this.f18717b) {
            case TypedValues.Custom.TYPE_INT /* 900 */:
            case 906:
                this.f18718c = ((Integer) obj).intValue();
                break;
            case 901:
                this.f18719d = ((Float) obj).floatValue();
                break;
            case 902:
                this.f18718c = ((Integer) obj).intValue();
                break;
            case 903:
                this.f18720e = (String) obj;
                break;
            case 904:
                this.f18721f = ((Boolean) obj).booleanValue();
                break;
            case 905:
                this.f18719d = ((Float) obj).floatValue();
                break;
        }
    }

    public CustomVariable(String str, int i10, int i11) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18719d = Float.NaN;
        this.f18720e = null;
        this.f18716a = str;
        this.f18717b = i10;
        if (i10 == 901) {
            this.f18719d = i11;
        } else {
            this.f18718c = i11;
        }
    }

    public CustomVariable(String str, int i10, float f6) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18720e = null;
        this.f18716a = str;
        this.f18717b = i10;
        this.f18719d = f6;
    }

    public CustomVariable(String str, int i10, boolean z10) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18719d = Float.NaN;
        this.f18720e = null;
        this.f18716a = str;
        this.f18717b = i10;
        this.f18721f = z10;
    }

    public CustomVariable(String str, int i10) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18719d = Float.NaN;
        this.f18720e = null;
        this.f18716a = str;
        this.f18717b = i10;
    }

    public CustomVariable(String str, int i10, Object obj) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18719d = Float.NaN;
        this.f18720e = null;
        this.f18716a = str;
        this.f18717b = i10;
        setValue(obj);
    }

    public CustomVariable(CustomVariable customVariable, Object obj) {
        this.f18718c = Integer.MIN_VALUE;
        this.f18719d = Float.NaN;
        this.f18720e = null;
        this.f18716a = customVariable.f18716a;
        this.f18717b = customVariable.f18717b;
        setValue(obj);
    }
}
