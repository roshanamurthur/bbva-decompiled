package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
@JacksonStdImpl
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_BYTE = 2;
    public static final int TYPE_BYTE_ARRAY = 17;
    public static final int TYPE_CALENDAR = 11;
    public static final int TYPE_CHAR = 4;
    public static final int TYPE_CLASS = 15;
    public static final int TYPE_CURRENCY = 16;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_DOUBLE = 8;
    public static final int TYPE_FLOAT = 7;
    public static final int TYPE_INT = 5;
    public static final int TYPE_LOCALE = 9;
    public static final int TYPE_LONG = 6;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_URI = 13;
    public static final int TYPE_URL = 14;
    public static final int TYPE_UUID = 12;
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    public static final class a extends KeyDeserializer implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<?> f43286p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final JsonDeserializer<?> f43287q0;

        public a(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this.f43286p0 = cls;
            this.f43287q0 = jsonDeserializer;
        }

        @Override // com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            Class<?> cls = this.f43286p0;
            if (str == null) {
                return null;
            }
            TokenBuffer tokenBuffer = new TokenBuffer(deserializationContext.getParser(), deserializationContext);
            tokenBuffer.writeString(str);
            try {
                JsonParser jsonParserAsParser = tokenBuffer.asParser();
                jsonParserAsParser.nextToken();
                Object objDeserialize = this.f43287q0.deserialize(jsonParserAsParser, deserializationContext);
                return objDeserialize != null ? objDeserialize : deserializationContext.handleWeirdKey(cls, str, "not a valid representation", new Object[0]);
            } catch (Exception e5) {
                return deserializationContext.handleWeirdKey(cls, str, "not a valid representation: %s", e5.getMessage());
            }
        }
    }

    @JacksonStdImpl
    public static final class b extends StdKeyDeserializer {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final EnumResolver f43288p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AnnotatedMethod f43289q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public EnumResolver f43290r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Enum<?> f43291s0;

        public b(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this.f43288p0 = enumResolver;
            this.f43289q0 = annotatedMethod;
            this.f43291s0 = enumResolver.getDefaultValue();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            EnumResolver enumResolverConstructUnsafeUsingToString;
            AnnotatedMethod annotatedMethod = this.f43289q0;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e5) {
                    ClassUtil.unwrapAndThrowAsIAE(e5);
                }
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
                enumResolverConstructUnsafeUsingToString = this.f43290r0;
                if (enumResolverConstructUnsafeUsingToString == null) {
                    synchronized (this) {
                        enumResolverConstructUnsafeUsingToString = EnumResolver.constructUnsafeUsingToString(this.f43288p0.getEnumClass(), deserializationContext.getAnnotationIntrospector());
                        this.f43290r0 = enumResolverConstructUnsafeUsingToString;
                    }
                }
            } else {
                enumResolverConstructUnsafeUsingToString = this.f43288p0;
            }
            Enum<?> enumFindEnum = enumResolverConstructUnsafeUsingToString.findEnum(str);
            if (enumFindEnum != null) {
                return enumFindEnum;
            }
            if (this.f43291s0 == null || !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? deserializationContext.handleWeirdKey(this._keyClass, str, "not one of values excepted for Enum class: %s", enumResolverConstructUnsafeUsingToString.getEnumIds()) : enumFindEnum;
            }
            return this.f43291s0;
        }
    }

    public static final class c extends StdKeyDeserializer {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Constructor<?> f43292p0;

        public c(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.f43292p0 = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this.f43292p0.newInstance(str);
        }
    }

    public static final class d extends StdKeyDeserializer {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Method f43293p0;

        public d(Method method) {
            super(-1, method.getDeclaringClass());
            this.f43293p0 = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this.f43293p0.invoke(null, str);
        }
    }

    public StdKeyDeserializer(int i10, Class<?> cls) {
        this(i10, cls, null);
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i10;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class) {
            if (cls == String.class) {
                return e.f43294p0;
            }
            return cls == Object.class ? e.f43295q0 : new e(-1, cls);
        }
        if (cls == UUID.class) {
            i10 = 12;
        } else if (cls == Integer.class) {
            i10 = 5;
        } else if (cls == Long.class) {
            i10 = 6;
        } else if (cls == Date.class) {
            i10 = 10;
        } else if (cls == Calendar.class) {
            i10 = 11;
        } else if (cls == Boolean.class) {
            i10 = 1;
        } else if (cls == Byte.class) {
            i10 = 2;
        } else if (cls == Character.class) {
            i10 = 4;
        } else if (cls == Short.class) {
            i10 = 3;
        } else if (cls == Float.class) {
            i10 = 7;
        } else if (cls == Double.class) {
            i10 = 8;
        } else if (cls == URI.class) {
            i10 = 13;
        } else if (cls == URL.class) {
            i10 = 14;
        } else if (cls == Class.class) {
            i10 = 15;
        } else {
            if (cls == Locale.class) {
                return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i10 = 17;
        }
        return new StdKeyDeserializer(i10, cls);
    }

    public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                return "false".equals(str) ? Boolean.FALSE : deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int i_parseInt = _parseInt(str);
                return (i_parseInt < -128 || i_parseInt > 255) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i_parseInt);
            case 3:
                int i_parseInt2 = _parseInt(str);
                return (i_parseInt2 < -32768 || i_parseInt2 > 32767) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i_parseInt2);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e5) {
                    return _weirdKey(deserializationContext, str, e5);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e7) {
                    return _weirdKey(deserializationContext, str, e7);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e10) {
                    return _weirdKey(deserializationContext, str, e10);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e11) {
                    return _weirdKey(deserializationContext, str, e11);
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e12) {
                    return _weirdKey(deserializationContext, str, e12);
                }
            case 17:
                try {
                    return deserializationContext.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e13) {
                    return _weirdKey(deserializationContext, str, e13);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    public double _parseDouble(String str) throws IllegalArgumentException {
        return NumberInput.parseDouble(str);
    }

    public int _parseInt(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

    public long _parseLong(String str) throws IllegalArgumentException {
        return Long.parseLong(str);
    }

    public Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", ClassUtil.exceptionMessage(exc));
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object obj_parse = _parse(str, deserializationContext);
            if (obj_parse != null) {
                return obj_parse;
            }
            if (this._keyClass.isEnum() && deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
        } catch (Exception e5) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e5.getClass().getName(), ClassUtil.exceptionMessage(e5));
        }
    }

    public Class<?> getKeyClass() {
        return this._keyClass;
    }

    public StdKeyDeserializer(int i10, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i10;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }

    @JacksonStdImpl
    public static final class e extends StdKeyDeserializer {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f43294p0 = new e(-1, String.class);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final e f43295q0 = new e(-1, Object.class);

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }
    }
}
