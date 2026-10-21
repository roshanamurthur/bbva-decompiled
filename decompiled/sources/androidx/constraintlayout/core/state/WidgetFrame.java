package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class WidgetFrame {
    public static float phone_orientation = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, CustomVariable> f19088a;
    public float alpha;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedBundle f19089b;
    public int bottom;
    public float interpolatedPos;
    public int left;
    public String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public ConstraintWidget widget;

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.f19088a = new HashMap<>();
        this.name = null;
    }

    public static void a(StringBuilder sb2, String str, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f6);
        sb2.append(",\n");
    }

    public static void b(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static float c(float f6, float f10, float f11, float f12) {
        boolean zIsNaN = Float.isNaN(f6);
        boolean zIsNaN2 = Float.isNaN(f10);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f6 = f11;
        }
        if (zIsNaN2) {
            f10 = f11;
        }
        return e.a(f10, f6, f12, f6);
    }

    public static void interpolate(int i10, int i11, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, WidgetFrame widgetFrame3, Transition transition, float f6) {
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f12 = 100.0f * f6;
        int i21 = (int) f12;
        int i22 = widgetFrame2.left;
        int i23 = widgetFrame2.top;
        int i24 = widgetFrame3.left;
        int i25 = widgetFrame3.top;
        int i26 = widgetFrame2.right - i22;
        int i27 = widgetFrame2.bottom - i23;
        int i28 = widgetFrame3.right - i24;
        int i29 = widgetFrame3.bottom - i25;
        float f13 = widgetFrame2.alpha;
        float f14 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            i23 -= (int) (i29 / 2.0f);
            i14 = i22 - ((int) (i28 / 2.0f));
            if (Float.isNaN(f13)) {
                i13 = i29;
                i12 = i28;
                f10 = 0.0f;
            } else {
                f10 = f13;
                i12 = i28;
                i13 = i29;
            }
        } else {
            i12 = i26;
            f10 = f13;
            i13 = i27;
            i14 = i22;
        }
        if (widgetFrame3.visibility == 8) {
            i24 -= (int) (i12 / 2.0f);
            i25 -= (int) (i13 / 2.0f);
            i28 = i12;
            i29 = i13;
            if (Float.isNaN(f14)) {
                f14 = 0.0f;
            }
        }
        if (Float.isNaN(f10) && !Float.isNaN(f14)) {
            f10 = 1.0f;
        }
        if (!Float.isNaN(f10) && Float.isNaN(f14)) {
            f14 = 1.0f;
        }
        float f15 = widgetFrame2.visibility == 4 ? 0.0f : f10;
        float f16 = widgetFrame3.visibility == 4 ? 0.0f : f14;
        if (widgetFrame.widget == null || !transition.hasPositionKeyframes()) {
            i15 = i23;
            f11 = f6;
            i16 = i14;
            i17 = i24;
        } else {
            Transition.a aVarFindPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i21);
            i15 = i23;
            Transition.a aVarFindNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i21);
            if (aVarFindPreviousPosition == aVarFindNextPosition) {
                aVarFindNextPosition = null;
            }
            if (aVarFindPreviousPosition != null) {
                i14 = (int) (aVarFindPreviousPosition.f19063b * i10);
                i18 = i11;
                i15 = (int) (aVarFindPreviousPosition.f19064c * i18);
                i19 = aVarFindPreviousPosition.f19062a;
            } else {
                i18 = i11;
                i19 = 0;
            }
            i16 = i14;
            if (aVarFindNextPosition != null) {
                i17 = (int) (aVarFindNextPosition.f19063b * i10);
                i25 = (int) (aVarFindNextPosition.f19064c * i18);
                i20 = aVarFindNextPosition.f19062a;
            } else {
                i20 = 100;
                i17 = i24;
            }
            f11 = (f12 - i19) / (i20 - i19);
        }
        int i30 = i15;
        widgetFrame.widget = widgetFrame2.widget;
        int i31 = (int) (((i17 - i16) * f11) + i16);
        widgetFrame.left = i31;
        int i32 = (int) ((f11 * (i25 - i30)) + i30);
        widgetFrame.top = i32;
        float f17 = 1.0f - f6;
        widgetFrame.right = i31 + ((int) ((i28 * f6) + (i12 * f17)));
        widgetFrame.bottom = i32 + ((int) ((i29 * f6) + (f17 * i13)));
        widgetFrame.pivotX = c(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f6);
        widgetFrame.pivotY = c(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f6);
        widgetFrame.rotationX = c(widgetFrame2.rotationX, widgetFrame3.rotationX, 0.0f, f6);
        widgetFrame.rotationY = c(widgetFrame2.rotationY, widgetFrame3.rotationY, 0.0f, f6);
        widgetFrame.rotationZ = c(widgetFrame2.rotationZ, widgetFrame3.rotationZ, 0.0f, f6);
        widgetFrame.scaleX = c(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f6);
        widgetFrame.scaleY = c(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f6);
        widgetFrame.translationX = c(widgetFrame2.translationX, widgetFrame3.translationX, 0.0f, f6);
        widgetFrame.translationY = c(widgetFrame2.translationY, widgetFrame3.translationY, 0.0f, f6);
        widgetFrame.translationZ = c(widgetFrame2.translationZ, widgetFrame3.translationZ, 0.0f, f6);
        widgetFrame.alpha = c(f15, f16, 1.0f, f6);
        HashMap<String, CustomVariable> map = widgetFrame3.f19088a;
        Set<String> setKeySet = map.keySet();
        HashMap<String, CustomVariable> map2 = widgetFrame.f19088a;
        map2.clear();
        for (String str : setKeySet) {
            HashMap<String, CustomVariable> map3 = widgetFrame2.f19088a;
            if (map3.containsKey(str)) {
                CustomVariable customVariable = map3.get(str);
                CustomVariable customVariable2 = map.get(str);
                CustomVariable customVariable3 = new CustomVariable(customVariable);
                map2.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(Float.valueOf(c(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), 0.0f, f6)));
                } else {
                    int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[iNumberOfInterpolatedValues];
                    float[] fArr2 = new float[iNumberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i33 = 0; i33 < iNumberOfInterpolatedValues; i33++) {
                        fArr[i33] = c(fArr[i33], fArr2[i33], 0.0f, f6);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    public void addCustomColor(String str, int i10) {
        setCustomAttribute(str, 902, i10);
    }

    public void addCustomFloat(String str, float f6) {
        setCustomAttribute(str, 901, f6);
    }

    public float centerX() {
        int i10 = this.left;
        return ((this.right - i10) / 2.0f) + i10;
    }

    public float centerY() {
        int i10 = this.top;
        return ((this.bottom - i10) / 2.0f) + i10;
    }

    public boolean containsCustom(@NonNull String str) {
        return this.f19088a.containsKey(str);
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.f19088a.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.f19088a.keySet();
    }

    public int getCustomColor(String str) {
        HashMap<String, CustomVariable> map = this.f19088a;
        if (map.containsKey(str)) {
            return map.get(str).getColorValue();
        }
        return -21880;
    }

    public float getCustomFloat(String str) {
        HashMap<String, CustomVariable> map = this.f19088a;
        if (map.containsKey(str)) {
            return map.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public String getId() {
        ConstraintWidget constraintWidget = this.widget;
        return constraintWidget == null ? "unknown" : constraintWidget.stringId;
    }

    public TypedBundle getMotionProperties() {
        return this.f19089b;
    }

    public int height() {
        return Math.max(0, this.bottom - this.top);
    }

    public boolean isDefaultTransform() {
        return Float.isNaN(this.rotationX) && Float.isNaN(this.rotationY) && Float.isNaN(this.rotationZ) && Float.isNaN(this.translationX) && Float.isNaN(this.translationY) && Float.isNaN(this.translationZ) && Float.isNaN(this.scaleX) && Float.isNaN(this.scaleY) && Float.isNaN(this.alpha);
    }

    public StringBuilder serialize(StringBuilder sb2) {
        return serialize(sb2, false);
    }

    public void setCustomAttribute(String str, int i10, float f6) {
        HashMap<String, CustomVariable> map = this.f19088a;
        if (map.containsKey(str)) {
            map.get(str).setFloatValue(f6);
        } else {
            map.put(str, new CustomVariable(str, i10, f6));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean setValue(String str, CLElement cLElement) throws CLParsingException {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    b10 = 0;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    b10 = 1;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    b10 = 2;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 3;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 4;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    b10 = 5;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 6;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 7;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 8;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    b10 = 9;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    b10 = 10;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 11;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 12;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    b10 = 13;
                }
                break;
            case 3317767:
                if (str.equals(Parameters.DIRECTION.LEFT)) {
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = 15;
                }
                break;
            case 108511772:
                if (str.equals(Parameters.DIRECTION.RIGHT)) {
                    b10 = 16;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    b10 = 17;
                }
                break;
        }
        switch (b10) {
            case 0:
                phone_orientation = cLElement.getFloat();
                return true;
            case 1:
                this.bottom = cLElement.getInt();
                return true;
            case 2:
                CLObject cLObject = (CLObject) cLElement;
                int size = cLObject.size();
                for (int i10 = 0; i10 < size; i10++) {
                    CLElement value = ((CLKey) cLObject.get(i10)).getValue();
                    String strContent = value.content();
                    if (strContent.matches("#[0-9a-fA-F]+")) {
                        setCustomAttribute(this.name, 902, Integer.parseInt(strContent.substring(1), 16));
                    } else if (value instanceof CLNumber) {
                        setCustomAttribute(this.name, 901, value.getFloat());
                    } else {
                        setCustomAttribute(this.name, 903, strContent);
                    }
                }
                return true;
            case 3:
                this.rotationX = cLElement.getFloat();
                return true;
            case 4:
                this.rotationY = cLElement.getFloat();
                return true;
            case 5:
                this.rotationZ = cLElement.getFloat();
                return true;
            case 6:
                this.translationX = cLElement.getFloat();
                return true;
            case 7:
                this.translationY = cLElement.getFloat();
                return true;
            case 8:
                this.translationZ = cLElement.getFloat();
                return true;
            case 9:
                this.pivotX = cLElement.getFloat();
                return true;
            case 10:
                this.pivotY = cLElement.getFloat();
                return true;
            case 11:
                this.scaleX = cLElement.getFloat();
                return true;
            case 12:
                this.scaleY = cLElement.getFloat();
                return true;
            case 13:
                this.top = cLElement.getInt();
                return true;
            case 14:
                this.left = cLElement.getInt();
                return true;
            case 15:
                this.alpha = cLElement.getFloat();
                return true;
            case 16:
                this.right = cLElement.getInt();
                return true;
            case 17:
                this.interpolatedPos = cLElement.getFloat();
                return true;
            default:
                return false;
        }
    }

    public WidgetFrame update() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public void updateAttributes(WidgetFrame widgetFrame) {
        if (widgetFrame == null) {
            return;
        }
        this.pivotX = widgetFrame.pivotX;
        this.pivotY = widgetFrame.pivotY;
        this.rotationX = widgetFrame.rotationX;
        this.rotationY = widgetFrame.rotationY;
        this.rotationZ = widgetFrame.rotationZ;
        this.translationX = widgetFrame.translationX;
        this.translationY = widgetFrame.translationY;
        this.translationZ = widgetFrame.translationZ;
        this.scaleX = widgetFrame.scaleX;
        this.scaleY = widgetFrame.scaleY;
        this.alpha = widgetFrame.alpha;
        this.visibility = widgetFrame.visibility;
        this.f19089b = widgetFrame.f19089b;
        HashMap<String, CustomVariable> map = this.f19088a;
        map.clear();
        for (CustomVariable customVariable : widgetFrame.f19088a.values()) {
            map.put(customVariable.getName(), customVariable.copy());
        }
    }

    public int width() {
        return Math.max(0, this.right - this.left);
    }

    public StringBuilder serialize(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, Parameters.DIRECTION.LEFT, this.left);
        b(sb2, "top", this.top);
        b(sb2, Parameters.DIRECTION.RIGHT, this.right);
        b(sb2, "bottom", this.bottom);
        a(sb2, "pivotX", this.pivotX);
        a(sb2, "pivotY", this.pivotY);
        a(sb2, "rotationX", this.rotationX);
        a(sb2, "rotationY", this.rotationY);
        a(sb2, "rotationZ", this.rotationZ);
        a(sb2, "translationX", this.translationX);
        a(sb2, "translationY", this.translationY);
        a(sb2, "translationZ", this.translationZ);
        a(sb2, "scaleX", this.scaleX);
        a(sb2, "scaleY", this.scaleY);
        a(sb2, "alpha", this.alpha);
        b(sb2, "visibility", this.visibility);
        a(sb2, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                ConstraintAnchor anchor = this.widget.getAnchor(type);
                if (anchor != null && anchor.mTarget != null) {
                    sb2.append("Anchor");
                    sb2.append(type.name());
                    sb2.append(": ['");
                    String str = anchor.mTarget.getOwner().stringId;
                    if (str == null) {
                        str = "#PARENT";
                    }
                    sb2.append(str);
                    sb2.append("', '");
                    sb2.append(anchor.mTarget.getType().name());
                    sb2.append("', '");
                    sb2.append(anchor.mMargin);
                    sb2.append("'],\n");
                }
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", phone_orientation);
        }
        if (z10) {
            a(sb2, "phone_orientation", phone_orientation);
        }
        HashMap<String, CustomVariable> map = this.f19088a;
        if (map.size() != 0) {
            sb2.append("custom : {\n");
            for (String str2 : map.keySet()) {
                CustomVariable customVariable = map.get(str2);
                sb2.append(str2);
                sb2.append(": ");
                switch (customVariable.getType()) {
                    case TypedValues.Custom.TYPE_INT /* 900 */:
                        sb2.append(customVariable.getIntegerValue());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(customVariable.getFloatValue());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(customVariable.getStringValue());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(customVariable.getBooleanValue());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void setCustomAttribute(String str, int i10, int i11) {
        HashMap<String, CustomVariable> map = this.f19088a;
        if (map.containsKey(str)) {
            map.get(str).setIntValue(i11);
        } else {
            map.put(str, new CustomVariable(str, i10, i11));
        }
    }

    public void setCustomAttribute(String str, int i10, boolean z10) {
        HashMap<String, CustomVariable> map = this.f19088a;
        if (map.containsKey(str)) {
            map.get(str).setBooleanValue(z10);
        } else {
            map.put(str, new CustomVariable(str, i10, z10));
        }
    }

    public WidgetFrame update(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public void setCustomAttribute(String str, int i10, String str2) {
        HashMap<String, CustomVariable> map = this.f19088a;
        if (map.containsKey(str)) {
            map.get(str).setStringValue(str2);
        } else {
            map.put(str, new CustomVariable(str, i10, str2));
        }
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.f19088a = new HashMap<>();
        this.name = null;
        this.widget = constraintWidget;
    }

    public void setCustomValue(CustomAttribute customAttribute, float[] fArr) {
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.f19088a = new HashMap<>();
        this.name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }
}
