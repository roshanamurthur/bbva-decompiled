package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.camera.core.processing.f;
import androidx.core.view.ViewCompat;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AttributeType f19702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19707h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttributeType {
        private static final /* synthetic */ AttributeType[] $VALUES;
        public static final AttributeType BOOLEAN_TYPE;
        public static final AttributeType COLOR_DRAWABLE_TYPE;
        public static final AttributeType COLOR_TYPE;
        public static final AttributeType DIMENSION_TYPE;
        public static final AttributeType FLOAT_TYPE;
        public static final AttributeType INT_TYPE;
        public static final AttributeType REFERENCE_TYPE;
        public static final AttributeType STRING_TYPE;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            INT_TYPE = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            FLOAT_TYPE = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            COLOR_TYPE = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            COLOR_DRAWABLE_TYPE = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            STRING_TYPE = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            BOOLEAN_TYPE = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            DIMENSION_TYPE = attributeType7;
            AttributeType attributeType8 = new AttributeType("REFERENCE_TYPE", 7);
            REFERENCE_TYPE = attributeType8;
            $VALUES = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8};
        }

        public AttributeType() {
            throw null;
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) $VALUES.clone();
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
        this.f19700a = false;
        this.f19701b = str;
        this.f19702c = attributeType;
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> map, View view) {
        HashMap<String, ConstraintAttribute> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return map2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == R.styleable.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == R.styleable.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new ConstraintAttribute(string, attributeType2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ConstraintAttribute constraintAttribute = map.get(next);
            if (!constraintAttribute.f19700a) {
                next = f.d(SetCommand.ID, next);
            }
            try {
                switch (constraintAttribute.f19702c.ordinal()) {
                    case 0:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f19703d));
                        break;
                    case 1:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f19704e));
                        break;
                    case 2:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f19707h));
                        break;
                    case 3:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f19707h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(next, CharSequence.class).invoke(view, constraintAttribute.f19705f);
                        break;
                    case 5:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f19706g));
                        break;
                    case 6:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f19704e));
                        break;
                    case 7:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f19703d));
                        break;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    public void applyCustom(View view) {
        Class<?> cls = view.getClass();
        boolean z10 = this.f19700a;
        String strD = this.f19701b;
        if (!z10) {
            strD = f.d(SetCommand.ID, strD);
        }
        try {
            switch (this.f19702c.ordinal()) {
                case 0:
                case 7:
                    cls.getMethod(strD, Integer.TYPE).invoke(view, Integer.valueOf(this.f19703d));
                    break;
                case 1:
                    cls.getMethod(strD, Float.TYPE).invoke(view, Float.valueOf(this.f19704e));
                    break;
                case 2:
                    cls.getMethod(strD, Integer.TYPE).invoke(view, Integer.valueOf(this.f19707h));
                    break;
                case 3:
                    Method method = cls.getMethod(strD, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f19707h);
                    method.invoke(view, colorDrawable);
                    break;
                case 4:
                    cls.getMethod(strD, CharSequence.class).invoke(view, this.f19705f);
                    break;
                case 5:
                    cls.getMethod(strD, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f19706g));
                    break;
                case 6:
                    cls.getMethod(strD, Float.TYPE).invoke(view, Float.valueOf(this.f19704e));
                    break;
                default:
                    break;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
        if (constraintAttribute == null) {
            return false;
        }
        AttributeType attributeType = constraintAttribute.f19702c;
        AttributeType attributeType2 = this.f19702c;
        if (attributeType2 != attributeType) {
            return false;
        }
        switch (attributeType2.ordinal()) {
            case 0:
            case 7:
                return this.f19703d == constraintAttribute.f19703d;
            case 1:
                return this.f19704e == constraintAttribute.f19704e;
            case 2:
            case 3:
                return this.f19707h == constraintAttribute.f19707h;
            case 4:
                return this.f19703d == constraintAttribute.f19703d;
            case 5:
                return this.f19706g == constraintAttribute.f19706g;
            case 6:
                return this.f19704e == constraintAttribute.f19704e;
            default:
                return false;
        }
    }

    public int getColorValue() {
        return this.f19707h;
    }

    public float getFloatValue() {
        return this.f19704e;
    }

    public int getIntegerValue() {
        return this.f19703d;
    }

    public String getName() {
        return this.f19701b;
    }

    public String getStringValue() {
        return this.f19705f;
    }

    public AttributeType getType() {
        return this.f19702c;
    }

    public float getValueToInterpolate() {
        switch (this.f19702c.ordinal()) {
            case 0:
                return this.f19703d;
            case 1:
            case 6:
                return this.f19704e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f19706g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.f19702c.ordinal()) {
            case 0:
                fArr[0] = this.f19703d;
                return;
            case 1:
                fArr[0] = this.f19704e;
                return;
            case 2:
            case 3:
                int i10 = this.f19707h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f19706g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f19704e;
                return;
            default:
                return;
        }
    }

    public boolean isBooleanValue() {
        return this.f19706g;
    }

    public boolean isContinuous() {
        int iOrdinal = this.f19702c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public boolean isMethod() {
        return this.f19700a;
    }

    public int numberOfInterpolatedValues() {
        int iOrdinal = this.f19702c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i10) {
        this.f19707h = i10;
    }

    public void setFloatValue(float f6) {
        this.f19704e = f6;
    }

    public void setIntValue(int i10) {
        this.f19703d = i10;
    }

    public void setStringValue(String str) {
        this.f19705f = str;
    }

    public void setValue(float[] fArr) {
        switch (this.f19702c.ordinal()) {
            case 0:
            case 7:
                this.f19703d = (int) fArr[0];
                return;
            case 1:
                this.f19704e = fArr[0];
                return;
            case 2:
            case 3:
                int iHSVToColor = Color.HSVToColor(fArr) & ViewCompat.MEASURED_SIZE_MASK;
                int i10 = (int) (fArr[3] * 255.0f);
                int i11 = (i10 & (~(i10 >> 31))) - 255;
                this.f19707h = (((i11 & (i11 >> 31)) + 255) << 24) | iHSVToColor;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                this.f19706g = ((double) fArr[0]) > 0.5d;
                return;
            case 6:
                this.f19704e = fArr[0];
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f19701b = str;
        this.f19702c = attributeType;
        this.f19700a = z10;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.f19702c.ordinal()) {
            case 0:
            case 7:
                this.f19703d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f19704e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f19707h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f19705f = (String) obj;
                break;
            case 5:
                this.f19706g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f19704e = ((Float) obj).floatValue();
                break;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f19700a = false;
        this.f19701b = constraintAttribute.f19701b;
        this.f19702c = constraintAttribute.f19702c;
        setValue(obj);
    }
}
