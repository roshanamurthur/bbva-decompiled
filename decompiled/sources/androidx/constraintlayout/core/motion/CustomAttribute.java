package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: classes.dex */
public class CustomAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AttributeType f18711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18715f;

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

    public CustomAttribute(String str, AttributeType attributeType) {
        this.f18710a = str;
        this.f18711b = attributeType;
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

    public boolean diff(CustomAttribute customAttribute) {
        if (customAttribute == null) {
            return false;
        }
        AttributeType attributeType = customAttribute.f18711b;
        AttributeType attributeType2 = this.f18711b;
        if (attributeType2 != attributeType) {
            return false;
        }
        switch (attributeType2.ordinal()) {
            case 0:
            case 7:
                return this.f18712c == customAttribute.f18712c;
            case 1:
                return this.f18713d == customAttribute.f18713d;
            case 2:
            case 3:
                return this.f18715f == customAttribute.f18715f;
            case 4:
                return this.f18712c == customAttribute.f18712c;
            case 5:
                return this.f18714e == customAttribute.f18714e;
            case 6:
                return this.f18713d == customAttribute.f18713d;
            default:
                return false;
        }
    }

    public AttributeType getType() {
        return this.f18711b;
    }

    public float getValueToInterpolate() {
        switch (this.f18711b.ordinal()) {
            case 0:
                return this.f18712c;
            case 1:
                return this.f18713d;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f18714e ? 1.0f : 0.0f;
            case 6:
                return this.f18713d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.f18711b.ordinal()) {
            case 0:
                fArr[0] = this.f18712c;
                return;
            case 1:
                fArr[0] = this.f18713d;
                return;
            case 2:
            case 3:
                int i10 = this.f18715f;
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
                fArr[0] = this.f18714e ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f18713d;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int iOrdinal = this.f18711b.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int iOrdinal = this.f18711b.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i10) {
        this.f18715f = i10;
    }

    public void setFloatValue(float f6) {
        this.f18713d = f6;
    }

    public void setIntValue(int i10) {
        this.f18712c = i10;
    }

    public void setValue(float[] fArr) {
        switch (this.f18711b.ordinal()) {
            case 0:
            case 7:
                this.f18712c = (int) fArr[0];
                return;
            case 1:
                this.f18713d = fArr[0];
                return;
            case 2:
            case 3:
                int iHsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]) & ViewCompat.MEASURED_SIZE_MASK;
                int i10 = (int) (fArr[3] * 255.0f);
                int i11 = (i10 & (~(i10 >> 31))) - 255;
                this.f18715f = (((i11 & (i11 >> 31)) + 255) << 24) | iHsvToRgb;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                this.f18714e = ((double) fArr[0]) > 0.5d;
                return;
            case 6:
                this.f18713d = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f18710a = str;
        this.f18711b = attributeType;
        setValue(obj);
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.f18710a = customAttribute.f18710a;
        this.f18711b = customAttribute.f18711b;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.f18711b.ordinal()) {
            case 0:
            case 7:
                this.f18712c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f18713d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f18715f = ((Integer) obj).intValue();
                break;
            case 4:
                break;
            case 5:
                this.f18714e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f18713d = ((Float) obj).floatValue();
                break;
        }
    }

    public void setStringValue(String str) {
    }
}
