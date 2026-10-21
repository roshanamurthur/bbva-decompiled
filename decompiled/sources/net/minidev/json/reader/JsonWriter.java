package net.minidev.json.reader;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minidev.json.JSONAware;
import net.minidev.json.JSONAwareEx;
import net.minidev.json.JSONStreamAware;
import net.minidev.json.JSONStreamAwareEx;
import net.minidev.json.JSONStyle;
import net.minidev.json.JSONUtil;
import net.minidev.json.JSONValue;

/* JADX INFO: loaded from: classes12.dex */
public class JsonWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Class<?>, JsonWriterI<?>> f85215a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList<x> f85216b = new LinkedList<>();
    public static final JsonWriterI<JSONStreamAwareEx> JSONStreamAwareWriter = new k();
    public static final JsonWriterI<JSONStreamAwareEx> JSONStreamAwareExWriter = new p();
    public static final JsonWriterI<JSONAwareEx> JSONJSONAwareExWriter = new q();
    public static final JsonWriterI<JSONAware> JSONJSONAwareWriter = new r();
    public static final JsonWriterI<Iterable<? extends Object>> JSONIterableWriter = new s();
    public static final JsonWriterI<Enum<?>> EnumWriter = new t();
    public static final JsonWriterI<Map<String, ? extends Object>> JSONMapWriter = new u();
    public static final JsonWriterI<Object> beansWriter = new v();
    public static final JsonWriterI<Object> arrayWriter = new w();

    public class a implements JsonWriterI<String> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.writeString(appendable, (String) obj);
        }
    }

    public class b implements JsonWriterI<Boolean> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((Boolean) obj).toString());
        }
    }

    public class c implements JsonWriterI<Double> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            Double d2 = (Double) obj;
            if (d2.isInfinite()) {
                appendable.append(AbstractJsonLexerKt.NULL);
            } else {
                appendable.append(d2.toString());
            }
        }
    }

    public class d implements JsonWriterI<Date> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append('\"');
            JSONValue.escape(((Date) obj).toString(), appendable, jSONStyle);
            appendable.append('\"');
        }
    }

    public class e implements JsonWriterI<Float> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            Float f6 = (Float) obj;
            if (f6.isInfinite()) {
                appendable.append(AbstractJsonLexerKt.NULL);
            } else {
                appendable.append(f6.toString());
            }
        }
    }

    public class f implements JsonWriterI<Number> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((Number) obj).toString());
        }
    }

    public class g implements JsonWriterI<Boolean> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((Boolean) obj).toString());
        }
    }

    public class h implements JsonWriterI<Boolean> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((Boolean) obj).toString());
        }
    }

    public class i implements JsonWriterI<int[]> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = false;
            for (int i10 : (int[]) obj) {
                if (z10) {
                    jSONStyle.objectNext(appendable);
                } else {
                    z10 = true;
                }
                appendable.append(Integer.toString(i10));
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public class j implements JsonWriterI<short[]> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = false;
            for (short s4 : (short[]) obj) {
                if (z10) {
                    jSONStyle.objectNext(appendable);
                } else {
                    z10 = true;
                }
                appendable.append(Short.toString(s4));
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public static class k implements JsonWriterI<JSONStreamAwareEx> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            ((JSONStreamAwareEx) obj).writeJSONString(appendable);
        }
    }

    public class l implements JsonWriterI<long[]> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = false;
            for (long j10 : (long[]) obj) {
                if (z10) {
                    jSONStyle.objectNext(appendable);
                } else {
                    z10 = true;
                }
                appendable.append(Long.toString(j10));
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public class m implements JsonWriterI<float[]> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = false;
            for (float f6 : (float[]) obj) {
                if (z10) {
                    jSONStyle.objectNext(appendable);
                } else {
                    z10 = true;
                }
                appendable.append(Float.toString(f6));
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public class n implements JsonWriterI<double[]> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = false;
            for (double d2 : (double[]) obj) {
                if (z10) {
                    jSONStyle.objectNext(appendable);
                } else {
                    z10 = true;
                }
                appendable.append(Double.toString(d2));
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public class o implements JsonWriterI<boolean[]> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = false;
            for (boolean z11 : (boolean[]) obj) {
                if (z10) {
                    jSONStyle.objectNext(appendable);
                } else {
                    z10 = true;
                }
                appendable.append(Boolean.toString(z11));
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public static class p implements JsonWriterI<JSONStreamAwareEx> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            ((JSONStreamAwareEx) obj).writeJSONString(appendable, jSONStyle);
        }
    }

    public static class q implements JsonWriterI<JSONAwareEx> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((JSONAwareEx) obj).toJSONString(jSONStyle));
        }
    }

    public static class r implements JsonWriterI<JSONAware> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((JSONAware) obj).toJSONString());
        }
    }

    public static class s implements JsonWriterI<Iterable<? extends Object>> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = true;
            for (Object obj2 : (Iterable) obj) {
                if (z10) {
                    jSONStyle.arrayfirstObject(appendable);
                    z10 = false;
                } else {
                    jSONStyle.arrayNextElm(appendable);
                }
                if (obj2 == null) {
                    appendable.append(AbstractJsonLexerKt.NULL);
                } else {
                    JSONValue.writeJSONString(obj2, appendable, jSONStyle);
                }
                jSONStyle.arrayObjectEnd(appendable);
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public static class t implements JsonWriterI<Enum<?>> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.writeString(appendable, ((Enum) obj).name());
        }
    }

    public static class u implements JsonWriterI<Map<String, ? extends Object>> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.objectStart(appendable);
            boolean z10 = true;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null || !jSONStyle.ignoreNull()) {
                    if (z10) {
                        jSONStyle.objectFirstStart(appendable);
                        z10 = false;
                    } else {
                        jSONStyle.objectNext(appendable);
                    }
                    JsonWriter.writeJSONKV(entry.getKey().toString(), value, appendable, jSONStyle);
                }
            }
            jSONStyle.objectStop(appendable);
        }
    }

    public static class v implements JsonWriterI<Object> {
        @Override // net.minidev.json.reader.JsonWriterI
        public final <E> void writeJSONString(E e5, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            Method declaredMethod;
            Object objInvoke;
            Class<?> type;
            try {
                jSONStyle.objectStart(appendable);
                boolean z10 = false;
                for (Class<?> superclass = e5.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        int modifiers = field.getModifiers();
                        if ((modifiers & 152) <= 0) {
                            if ((modifiers & 1) > 0) {
                                objInvoke = field.get(e5);
                            } else {
                                try {
                                    declaredMethod = superclass.getDeclaredMethod(JSONUtil.getGetterName(field.getName()), new Class[0]);
                                } catch (Exception unused) {
                                    declaredMethod = null;
                                }
                                if (declaredMethod == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                    declaredMethod = superclass.getDeclaredMethod(JSONUtil.getIsName(field.getName()), new Class[0]);
                                }
                                if (declaredMethod != null) {
                                    objInvoke = declaredMethod.invoke(e5, new Object[0]);
                                }
                            }
                            if (objInvoke != null || !jSONStyle.ignoreNull()) {
                                if (z10) {
                                    jSONStyle.objectNext(appendable);
                                } else {
                                    z10 = true;
                                }
                                JsonWriter.writeJSONKV(field.getName(), objInvoke, appendable, jSONStyle);
                            }
                        }
                    }
                }
                jSONStyle.objectStop(appendable);
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public static class w implements JsonWriterI<Object> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.minidev.json.reader.JsonWriterI
        public final <E> void writeJSONString(E e5, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z10 = false;
            for (Object obj : (Object[]) e5) {
                if (z10) {
                    jSONStyle.objectNext(appendable);
                } else {
                    z10 = true;
                }
                JSONValue.writeJSONString(obj, appendable, jSONStyle);
            }
            jSONStyle.arrayStop(appendable);
        }
    }

    public static class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f85217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JsonWriterI<?> f85218b;

        public x(Class<?> cls, JsonWriterI<?> jsonWriterI) {
            this.f85217a = cls;
            this.f85218b = jsonWriterI;
        }
    }

    public JsonWriter() {
        init();
    }

    public static void writeJSONKV(String str, Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (str == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else if (jSONStyle.mustProtectKey(str)) {
            appendable.append('\"');
            JSONValue.escape(str, appendable, jSONStyle);
            appendable.append('\"');
        } else {
            appendable.append(str);
        }
        jSONStyle.objectEndOfKey(appendable);
        if (obj instanceof String) {
            jSONStyle.writeString(appendable, (String) obj);
        } else {
            JSONValue.writeJSONString(obj, appendable, jSONStyle);
        }
        jSONStyle.objectElmStop(appendable);
    }

    public void addInterfaceWriterFirst(Class<?> cls, JsonWriterI<?> jsonWriterI) {
        this.f85216b.addFirst(new x(cls, jsonWriterI));
    }

    public void addInterfaceWriterLast(Class<?> cls, JsonWriterI<?> jsonWriterI) {
        this.f85216b.addLast(new x(cls, jsonWriterI));
    }

    public JsonWriterI getWrite(Class cls) {
        return this.f85215a.get(cls);
    }

    public JsonWriterI getWriterByInterface(Class<?> cls) {
        for (x xVar : this.f85216b) {
            if (xVar.f85217a.isAssignableFrom(cls)) {
                return xVar.f85218b;
            }
        }
        return null;
    }

    public void init() {
        registerWriter(new a(), String.class);
        registerWriter(new b(), Boolean.class);
        registerWriter(new c(), Double.class);
        registerWriter(new d(), Date.class);
        registerWriter(new e(), Float.class);
        registerWriter(new f(), Integer.class, Long.class, Byte.class, Short.class, BigInteger.class);
        registerWriter(new g(), Boolean.class);
        registerWriter(new h(), Boolean.class);
        registerWriter(new i(), int[].class);
        registerWriter(new j(), short[].class);
        registerWriter(new l(), long[].class);
        registerWriter(new m(), float[].class);
        registerWriter(new n(), double[].class);
        registerWriter(new o(), boolean[].class);
        addInterfaceWriterLast(JSONStreamAwareEx.class, JSONStreamAwareExWriter);
        addInterfaceWriterLast(JSONStreamAware.class, JSONStreamAwareWriter);
        addInterfaceWriterLast(JSONAwareEx.class, JSONJSONAwareExWriter);
        addInterfaceWriterLast(JSONAware.class, JSONJSONAwareWriter);
        addInterfaceWriterLast(Map.class, JSONMapWriter);
        addInterfaceWriterLast(Iterable.class, JSONIterableWriter);
        addInterfaceWriterLast(Enum.class, EnumWriter);
    }

    public <T> void registerWriter(JsonWriterI<T> jsonWriterI, Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f85215a.put(cls, jsonWriterI);
        }
    }
}
