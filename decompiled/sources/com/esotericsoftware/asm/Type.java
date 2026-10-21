package com.esotericsoftware.asm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final int BYTE = 3;
    public static final int CHAR = 2;
    public static final int DOUBLE = 8;
    public static final int FLOAT = 6;
    public static final int INT = 5;
    public static final int LONG = 7;
    public static final int METHOD = 11;
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final int VOID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f39934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39936d;
    public static final Type VOID_TYPE = new Type(0, 1443168256, null, 1);
    public static final Type BOOLEAN_TYPE = new Type(1, 1509950721, null, 1);
    public static final Type CHAR_TYPE = new Type(2, 1124075009, null, 1);
    public static final Type BYTE_TYPE = new Type(3, 1107297537, null, 1);
    public static final Type SHORT_TYPE = new Type(4, 1392510721, null, 1);
    public static final Type INT_TYPE = new Type(5, 1224736769, null, 1);
    public static final Type FLOAT_TYPE = new Type(6, 1174536705, null, 1);
    public static final Type LONG_TYPE = new Type(7, 1241579778, null, 1);
    public static final Type DOUBLE_TYPE = new Type(8, 1141048066, null, 1);

    public Type(int i10, int i11, char[] cArr, int i12) {
        this.f39933a = i10;
        this.f39934b = cArr;
        this.f39935c = i11;
        this.f39936d = i12;
    }

    public static Type a(int i10, char[] cArr) {
        char c10;
        char c11 = cArr[i10];
        if (c11 == 'F') {
            return FLOAT_TYPE;
        }
        if (c11 == 'L') {
            int i11 = 1;
            while (cArr[i10 + i11] != ';') {
                i11++;
            }
            return new Type(10, i10 + 1, cArr, i11 - 1);
        }
        if (c11 == 'S') {
            return SHORT_TYPE;
        }
        if (c11 == 'V') {
            return VOID_TYPE;
        }
        if (c11 == 'I') {
            return INT_TYPE;
        }
        if (c11 == 'J') {
            return LONG_TYPE;
        }
        if (c11 == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (c11 != '[') {
            switch (c11) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    return new Type(11, i10, cArr, cArr.length - i10);
            }
        }
        int i12 = 1;
        while (true) {
            c10 = cArr[i10 + i12];
            if (c10 != '[') {
                break;
            }
            i12++;
        }
        if (c10 == 'L') {
            do {
                i12++;
            } while (cArr[i10 + i12] != ';');
        }
        return new Type(9, i10, cArr, i12 + 1);
    }

    public static void c(StringBuffer stringBuffer, Class cls) {
        char c10;
        while (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                stringBuffer.append(Matrix.MATRIX_TYPE_RANDOM_LT);
                String name = cls.getName();
                int length = name.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = name.charAt(i10);
                    if (cCharAt == '.') {
                        cCharAt = JsonPointer.SEPARATOR;
                    }
                    stringBuffer.append(cCharAt);
                }
                stringBuffer.append(';');
                return;
            }
            stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
            cls = cls.getComponentType();
        }
        if (cls == Integer.TYPE) {
            c10 = 'I';
        } else if (cls == Void.TYPE) {
            c10 = 'V';
        } else if (cls == Boolean.TYPE) {
            c10 = Matrix.MATRIX_TYPE_ZERO;
        } else if (cls == Byte.TYPE) {
            c10 = 'B';
        } else if (cls == Character.TYPE) {
            c10 = 'C';
        } else if (cls == Short.TYPE) {
            c10 = 'S';
        } else if (cls == Double.TYPE) {
            c10 = 'D';
        } else {
            c10 = cls == Float.TYPE ? 'F' : 'J';
        }
        stringBuffer.append(c10);
    }

    public static String getConstructorDescriptor(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(RootService.OPEN_BRACKET);
        for (Class<?> cls : parameterTypes) {
            c(stringBuffer, cls);
        }
        stringBuffer.append(")V");
        return stringBuffer.toString();
    }

    public static String getMethodDescriptor(Type type, Type... typeArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(RootService.OPEN_BRACKET);
        for (Type type2 : typeArr) {
            type2.b(stringBuffer);
        }
        stringBuffer.append(RootService.CLOSE_BRACKET);
        type.b(stringBuffer);
        return stringBuffer.toString();
    }

    public static Type getMethodType(Type type, Type... typeArr) {
        return getType(getMethodDescriptor(type, typeArr));
    }

    public static Type getObjectType(String str) {
        char[] charArray = str.toCharArray();
        return new Type(charArray[0] == '[' ? 9 : 10, 0, charArray, charArray.length);
    }

    public static Type getType(Class cls) {
        if (!cls.isPrimitive()) {
            return getType(getDescriptor(cls));
        }
        if (cls == Integer.TYPE) {
            return INT_TYPE;
        }
        if (cls == Void.TYPE) {
            return VOID_TYPE;
        }
        if (cls == Boolean.TYPE) {
            return BOOLEAN_TYPE;
        }
        if (cls == Byte.TYPE) {
            return BYTE_TYPE;
        }
        if (cls == Character.TYPE) {
            return CHAR_TYPE;
        }
        if (cls == Short.TYPE) {
            return SHORT_TYPE;
        }
        if (cls == Double.TYPE) {
            return DOUBLE_TYPE;
        }
        return cls == Float.TYPE ? FLOAT_TYPE : LONG_TYPE;
    }

    public final void b(StringBuffer stringBuffer) {
        char c10;
        int i10 = this.f39935c;
        char[] cArr = this.f39934b;
        if (cArr == null) {
            c10 = (char) ((i10 & ViewCompat.MEASURED_STATE_MASK) >>> 24);
        } else {
            int i11 = this.f39933a;
            int i12 = this.f39936d;
            if (i11 != 10) {
                stringBuffer.append(cArr, i10, i12);
                return;
            } else {
                stringBuffer.append(Matrix.MATRIX_TYPE_RANDOM_LT);
                stringBuffer.append(cArr, i10, i12);
                c10 = ';';
            }
        }
        stringBuffer.append(c10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        int i10 = type.f39933a;
        int i11 = this.f39933a;
        if (i11 != i10) {
            return false;
        }
        if (i11 >= 9) {
            int i12 = type.f39936d;
            int i13 = this.f39936d;
            if (i13 != i12) {
                return false;
            }
            int i14 = this.f39935c;
            int i15 = i13 + i14;
            int i16 = type.f39935c;
            while (i14 < i15) {
                if (this.f39934b[i14] != type.f39934b[i16]) {
                    return false;
                }
                i14++;
                i16++;
            }
        }
        return true;
    }

    public Type[] getArgumentTypes() {
        return getArgumentTypes(getDescriptor());
    }

    public int getArgumentsAndReturnSizes() {
        return getArgumentsAndReturnSizes(getDescriptor());
    }

    public String getClassName() {
        switch (this.f39933a) {
            case 0:
                return "void";
            case 1:
                return TypedValues.Custom.S_BOOLEAN;
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return TypedValues.Custom.S_FLOAT;
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuffer stringBuffer = new StringBuffer(getElementType().getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    stringBuffer.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                }
                return stringBuffer.toString();
            case 10:
                return new String(this.f39934b, this.f39935c, this.f39936d).replace(JsonPointer.SEPARATOR, '.');
            default:
                return null;
        }
    }

    public String getDescriptor() {
        StringBuffer stringBuffer = new StringBuffer();
        b(stringBuffer);
        return stringBuffer.toString();
    }

    public int getDimensions() {
        int i10 = 1;
        while (this.f39934b[this.f39935c + i10] == '[') {
            i10++;
        }
        return i10;
    }

    public Type getElementType() {
        return a(getDimensions() + this.f39935c, this.f39934b);
    }

    public String getInternalName() {
        return new String(this.f39934b, this.f39935c, this.f39936d);
    }

    public int getOpcode(int i10) {
        int i11 = this.f39935c;
        char[] cArr = this.f39934b;
        if (i10 == 46 || i10 == 79) {
            return i10 + (cArr == null ? (65280 & i11) >> 8 : 4);
        }
        return i10 + (cArr == null ? (16711680 & i11) >> 16 : 4);
    }

    public Type getReturnType() {
        return getReturnType(getDescriptor());
    }

    public int getSize() {
        if (this.f39934b == null) {
            return this.f39935c & 255;
        }
        return 1;
    }

    public int getSort() {
        return this.f39933a;
    }

    public int hashCode() {
        int i10 = this.f39933a;
        int i11 = i10 * 13;
        if (i10 >= 9) {
            int i12 = this.f39936d;
            int i13 = this.f39935c;
            int i14 = i12 + i13;
            while (i13 < i14) {
                i11 = (i11 + this.f39934b[i13]) * 17;
                i13++;
            }
        }
        return i11;
    }

    public String toString() {
        return getDescriptor();
    }

    public static Type[] getArgumentTypes(String str) {
        char[] charArray = str.toCharArray();
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 1;
            char c10 = charArray[i11];
            if (c10 == ')') {
                break;
            }
            if (c10 == 'L') {
                while (true) {
                    i11 = i13 + 1;
                    if (charArray[i13] == ';') {
                        break;
                    }
                    i13 = i11;
                }
                i12++;
            } else {
                if (c10 != '[') {
                    i12++;
                }
                i11 = i13;
            }
        }
        Type[] typeArr = new Type[i12];
        int i14 = 0;
        while (charArray[i10] != ')') {
            Type typeA = a(i10, charArray);
            typeArr[i14] = typeA;
            i10 += typeA.f39936d + (typeA.f39933a == 10 ? 2 : 0);
            i14++;
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        int i10;
        char cCharAt;
        int i11 = 1;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            i10 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 == ')') {
                break;
            }
            if (cCharAt2 == 'L') {
                while (true) {
                    i12 = i10 + 1;
                    if (str.charAt(i10) == ';') {
                        break;
                    }
                    i10 = i12;
                }
                i13++;
            } else {
                if (cCharAt2 == '[') {
                    while (true) {
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '[') {
                            break;
                        }
                        i10++;
                    }
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i13--;
                    }
                } else {
                    i13 = (cCharAt2 == 'D' || cCharAt2 == 'J') ? i13 + 2 : i13 + 1;
                }
                i12 = i10;
            }
        }
        char cCharAt3 = str.charAt(i10);
        int i14 = i13 << 2;
        if (cCharAt3 == 'V') {
            i11 = 0;
        } else if (cCharAt3 == 'D' || cCharAt3 == 'J') {
            i11 = 2;
        }
        return i14 | i11;
    }

    public static String getDescriptor(Class cls) {
        StringBuffer stringBuffer = new StringBuffer();
        c(stringBuffer, cls);
        return stringBuffer.toString();
    }

    public static String getInternalName(Class cls) {
        return cls.getName().replace('.', JsonPointer.SEPARATOR);
    }

    public static String getMethodDescriptor(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(RootService.OPEN_BRACKET);
        for (Class<?> cls : parameterTypes) {
            c(stringBuffer, cls);
        }
        stringBuffer.append(RootService.CLOSE_BRACKET);
        c(stringBuffer, method.getReturnType());
        return stringBuffer.toString();
    }

    public static Type getMethodType(String str) {
        return a(0, str.toCharArray());
    }

    public static Type getReturnType(String str) {
        return a(str.indexOf(41) + 1, str.toCharArray());
    }

    public static Type getType(String str) {
        return a(0, str.toCharArray());
    }

    public static Type[] getArgumentTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Type[] typeArr = new Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }

    public static Type getReturnType(Method method) {
        return getType(method.getReturnType());
    }

    public static Type getType(Constructor constructor) {
        return getType(getConstructorDescriptor(constructor));
    }

    public static Type getType(Method method) {
        return getType(getMethodDescriptor(method));
    }
}
