package com.esotericsoftware.kryo.util;

import androidx.camera.core.impl.utils.b;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.serializers.ClosureSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;
import org.objenesis.strategy.PlatformDescription;

/* JADX INFO: loaded from: classes9.dex */
public class Util {
    public static final boolean isAndroid = PlatformDescription.DALVIK.equals(System.getProperty(Sys.VM_NAME));
    public static final int maxArraySize = 2147483639;
    private static final Map<Class<?>, Class<?>> primitiveWrappers;
    public static final boolean unsafe;

    static {
        boolean z10 = false;
        if (!"false".equals(System.getProperty("kryo.unsafe"))) {
            try {
                if (Class.forName("com.esotericsoftware.kryo.unsafe.UnsafeUtil", true, FieldSerializer.class.getClassLoader()).getField("unsafe").get(null) != null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Unsafe is unavailable.", th2);
                }
            }
        } else if (Log.TRACE) {
            Log.trace("kryo", "Unsafe is disabled.");
        }
        unsafe = z10;
        HashMap map = new HashMap();
        primitiveWrappers = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Short.TYPE, Short.class);
    }

    public static String canonicalName(Class cls) {
        if (cls == null) {
            return AbstractJsonLexerKt.NULL;
        }
        String canonicalName = cls.getCanonicalName();
        return canonicalName != null ? canonicalName : className(cls);
    }

    public static String className(Class cls) {
        if (cls == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (!cls.isArray()) {
            return (cls.isPrimitive() || cls == Object.class || cls == Boolean.class || cls == Byte.class || cls == Character.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class) ? cls.getSimpleName() : cls.getName();
        }
        Class elementClass = getElementClass(cls);
        StringBuilder sb2 = new StringBuilder(16);
        int dimensionCount = getDimensionCount(cls);
        for (int i10 = 0; i10 < dimensionCount; i10++) {
            sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return className(elementClass) + ((Object) sb2);
    }

    public static String classNames(Class[] clsArr) {
        StringBuilder sb2 = new StringBuilder(32);
        int length = clsArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(className(clsArr[i10]));
        }
        return sb2.toString();
    }

    public static int getDimensionCount(Class cls) {
        int i10 = 0;
        for (Class<?> componentType = cls.getComponentType(); componentType != null; componentType = componentType.getComponentType()) {
            i10++;
        }
        return i10;
    }

    public static Class getElementClass(Class cls) {
        while (cls.getComponentType() != null) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    public static Class getPrimitiveClass(Class cls) {
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        return cls == Void.class ? Void.TYPE : cls;
    }

    public static Class getWrapperClass(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        return cls == Short.TYPE ? Short.class : cls;
    }

    public static boolean isAscii(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAssignableTo(Class<?> cls, Class<?> cls2) {
        if (cls2 == Object.class || cls2.isAssignableFrom(cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            return isPrimitiveWrapperOf(cls2, cls);
        }
        if (cls2.isPrimitive()) {
            return isPrimitiveWrapperOf(cls, cls2);
        }
        if (cls == ClosureSerializer.Closure.class) {
            return cls2.isInterface();
        }
        return false;
    }

    public static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            Log.debug("kryo", "Class not available: " + str);
            return false;
        }
    }

    public static boolean isEnum(Class cls) {
        return Enum.class.isAssignableFrom(cls) && cls != Enum.class;
    }

    private static boolean isPrimitiveWrapperOf(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return primitiveWrappers.get(cls2) == cls;
        }
        throw new IllegalArgumentException("First argument has to be primitive type");
    }

    public static boolean isWrapperClass(Class cls) {
        return cls == Integer.class || cls == Float.class || cls == Boolean.class || cls == Byte.class || cls == Long.class || cls == Character.class || cls == Double.class || cls == Short.class;
    }

    public static void log(String str, Object obj, int i10) {
        if (obj == null) {
            if (Log.TRACE) {
                StringBuilder sbE = f.e(str, ": null");
                sbE.append(pos(i10));
                Log.trace("kryo", sbE.toString());
                return;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive() && !isWrapperClass(cls) && cls != String.class) {
            StringBuilder sbE2 = f.e(str, ": ");
            sbE2.append(string(obj));
            sbE2.append(pos(i10));
            Log.debug("kryo", sbE2.toString());
            return;
        }
        if (Log.TRACE) {
            StringBuilder sbE3 = f.e(str, ": ");
            sbE3.append(string(obj));
            sbE3.append(pos(i10));
            Log.trace("kryo", sbE3.toString());
        }
    }

    public static <T extends SerializerFactory> T newFactory(Class<T> cls, Class<? extends Serializer> cls2) {
        if (cls2 != null) {
            try {
                try {
                    return cls.getConstructor(Class.class).newInstance(cls2);
                } catch (NoSuchMethodException unused) {
                    return cls.newInstance();
                }
            } catch (Exception e5) {
                if (cls2 == null) {
                    throw new IllegalArgumentException("Unable to create serializer factory: ".concat(cls.getName()), e5);
                }
                throw new IllegalArgumentException("Unable to create serializer factory \"" + cls.getName() + "\" for serializer class: " + className(cls2), e5);
            }
        }
        return cls.newInstance();
    }

    public static String pos(int i10) {
        return i10 == -1 ? "" : b.a(" [", i10, Constant.BRACKET_CLOSE);
    }

    public static String simpleName(Type type) {
        return type instanceof Class ? ((Class) type).getSimpleName() : type.toString();
    }

    public static String string(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            return className(cls);
        }
        String strClassName = Log.TRACE ? className(cls) : cls.getSimpleName();
        try {
            if (cls.getMethod("toString", new Class[0]).getDeclaringClass() == Object.class) {
                return strClassName;
            }
        } catch (Exception unused) {
        }
        try {
            String str = String.valueOf(obj) + " (" + strClassName + ")";
            if (str.length() <= 97) {
                return str;
            }
            return str.substring(0, 97) + "...";
        } catch (Throwable th2) {
            return strClassName + " (toString exception: " + th2 + ")";
        }
    }

    public static String simpleName(Class cls, Generics.GenericType genericType) {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append((cls.isArray() ? getElementClass(cls) : cls).getSimpleName());
        if (genericType.arguments != null) {
            sb2.append(Typography.less);
            int length = genericType.arguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(genericType.arguments[i10].toString());
            }
            sb2.append(Typography.greater);
        }
        if (cls.isArray()) {
            int dimensionCount = getDimensionCount(cls);
            for (int i11 = 0; i11 < dimensionCount; i11++) {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
        }
        return sb2.toString();
    }
}
