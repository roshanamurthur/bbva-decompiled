package com.nimbusds.jose.shaded.json;

import ci.a;
import com.fasterxml.jackson.core.JsonPointer;
import com.nimbusds.jose.shaded.json.parser.ContainerFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class JSONNavi<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final JSONStyle f62748j = new JSONStyle(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContainerFactory f62749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f62750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Stack<Object> f62751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack<Object> f62752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f62753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f62755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f62757i;

    public JSONNavi() {
        this(ContainerFactory.FACTORY_ORDERED);
    }

    public static JSONNavi<JSONAwareEx> newInstance() {
        return new JSONNavi<>(ContainerFactory.FACTORY_SIMPLE);
    }

    public static JSONNavi<JSONArray> newInstanceArray() {
        JSONNavi<JSONArray> jSONNavi = new JSONNavi<>(ContainerFactory.FACTORY_SIMPLE);
        jSONNavi.array();
        return jSONNavi;
    }

    public static JSONNavi<JSONObject> newInstanceObject() {
        JSONNavi<JSONObject> jSONNavi = new JSONNavi<>(ContainerFactory.FACTORY_SIMPLE);
        jSONNavi.object();
        return jSONNavi;
    }

    public static JSONNavi<Collection<?>> newInstanceOrdered() {
        return new JSONNavi<>(ContainerFactory.FACTORY_ORDERED);
    }

    public final void a(Object obj, String str) {
        this.f62754f = true;
        StringBuilder sbD = a.d("Error: ", str, " at ");
        sbD.append(getJPath());
        if (obj != null) {
            if (obj instanceof Integer) {
                sbD.append(AbstractJsonLexerKt.BEGIN_LIST);
                sbD.append(obj);
                sbD.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sbD.append(JsonPointer.SEPARATOR);
                sbD.append(obj);
            }
        }
        this.f62755g = sbD.toString();
    }

    public JSONNavi<T> add(Object... objArr) {
        array();
        if (this.f62754f) {
            return this;
        }
        List list = (List) this.f62753e;
        for (Object obj : objArr) {
            list.add(obj);
        }
        return this;
    }

    public JSONNavi<T> array() {
        if (this.f62754f) {
            return this;
        }
        if (this.f62753e == null && this.f62756h) {
            a(null, "Can not create Array child in readonly");
        }
        if (this.f62753e == null) {
            this.f62753e = this.f62749a.createArrayContainer();
        } else {
            if (isArray()) {
                return this;
            }
            if (isObject()) {
                a(null, "can not use Object feature on Array.");
            }
            a(null, "Can not use current possition as Object");
        }
        if (this.f62750b == null) {
            this.f62750b = (T) this.f62753e;
        } else {
            b();
        }
        return this;
    }

    public boolean asBoolean() {
        Object obj = this.f62753e;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public Boolean asBooleanObj() {
        Object obj = this.f62753e;
        if (obj != null && (obj instanceof Boolean)) {
            return (Boolean) obj;
        }
        return null;
    }

    public double asDouble() {
        Object obj = this.f62753e;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return Double.NaN;
    }

    public Double asDoubleObj() {
        Object obj = this.f62753e;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof Double ? (Double) obj : Double.valueOf(((Number) obj).doubleValue());
        }
        return Double.valueOf(Double.NaN);
    }

    public double asFloat() {
        Object obj = this.f62753e;
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        return Double.NaN;
    }

    public Float asFloatObj() {
        Object obj = this.f62753e;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof Float ? (Float) obj : Float.valueOf(((Number) obj).floatValue());
        }
        return Float.valueOf(Float.NaN);
    }

    public int asInt() {
        Object obj = this.f62753e;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    public Integer asIntegerObj() {
        Object obj = this.f62753e;
        if (obj != null && (obj instanceof Number)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (obj instanceof Long) {
                Long l6 = (Long) obj;
                if (l6.longValue() == l6.intValue()) {
                    return Integer.valueOf(l6.intValue());
                }
            }
        }
        return null;
    }

    public long asLong() {
        Object obj = this.f62753e;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    public Long asLongObj() {
        Object obj = this.f62753e;
        if (obj != null && (obj instanceof Number)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Number) obj).longValue());
            }
        }
        return null;
    }

    public String asString() {
        Object obj = this.f62753e;
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> at(String str) {
        if (this.f62754f) {
            return this;
        }
        if (!isObject()) {
            object();
        }
        Object obj = this.f62753e;
        if (!(obj instanceof Map)) {
            a(str, "current node is not an Object");
            return this;
        }
        boolean zContainsKey = ((Map) obj).containsKey(str);
        Stack<Object> stack = this.f62752d;
        Stack<Object> stack2 = this.f62751c;
        if (zContainsKey) {
            Object obj2 = ((Map) this.f62753e).get(str);
            stack2.add(this.f62753e);
            stack.add(str);
            this.f62753e = obj2;
            return this;
        }
        if (this.f62756h) {
            a(str, "current Object have no key named " + str);
            return this;
        }
        stack2.add(this.f62753e);
        stack.add(str);
        this.f62753e = null;
        this.f62757i = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> atNext() {
        if (this.f62754f) {
            return this;
        }
        Object obj = this.f62753e;
        if (obj instanceof List) {
            return at(((List) obj).size());
        }
        a(null, "current node is not an Array");
        return this;
    }

    public final void b() {
        Object objPeek = this.f62751c.peek();
        if (objPeek != null && (objPeek instanceof Map)) {
            ((Map) objPeek).put((String) this.f62757i, this.f62753e);
            return;
        }
        if (objPeek != null && (objPeek instanceof List)) {
            int iIntValue = ((Number) this.f62757i).intValue();
            List list = (List) objPeek;
            while (list.size() <= iIntValue) {
                list.add(null);
            }
            list.set(iIntValue, this.f62753e);
        }
    }

    public Object get(String str) {
        if (this.f62754f) {
            return this;
        }
        if (!isObject()) {
            object();
        }
        Object obj = this.f62753e;
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        a(str, "current node is not an Object");
        return this;
    }

    public Object getCurrentObject() {
        return this.f62753e;
    }

    public String getJPath() {
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : this.f62752d) {
            if (obj instanceof String) {
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append(obj.toString());
            } else {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(obj.toString());
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
        }
        return sb2.toString();
    }

    public Collection<String> getKeys() {
        Object obj = this.f62753e;
        if (obj instanceof Map) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    public T getRoot() {
        return this.f62750b;
    }

    public int getSize() {
        if (this.f62753e == null) {
            return 0;
        }
        if (isArray()) {
            return ((List) this.f62753e).size();
        }
        if (isObject()) {
            return ((Map) this.f62753e).size();
        }
        return 1;
    }

    public boolean hasFailure() {
        return this.f62754f;
    }

    public boolean isArray() {
        Object obj = this.f62753e;
        if (obj == null) {
            return false;
        }
        return obj instanceof List;
    }

    public boolean isObject() {
        Object obj = this.f62753e;
        if (obj == null) {
            return false;
        }
        return obj instanceof Map;
    }

    public JSONNavi<T> object() {
        if (this.f62754f) {
            return this;
        }
        if (this.f62753e == null && this.f62756h) {
            a(null, "Can not create Object child in readonly");
        }
        if (this.f62753e == null) {
            this.f62753e = this.f62749a.createObjectContainer();
        } else {
            if (isObject()) {
                return this;
            }
            if (isArray()) {
                a(null, "can not use Object feature on Array.");
            }
            a(null, "Can not use current possition as Object");
        }
        if (this.f62750b == null) {
            this.f62750b = (T) this.f62753e;
        } else {
            b();
        }
        return this;
    }

    public JSONNavi<T> root() {
        this.f62753e = this.f62750b;
        this.f62751c.clear();
        this.f62752d.clear();
        this.f62754f = false;
        this.f62757i = null;
        this.f62755g = null;
        return this;
    }

    public JSONNavi<T> set(String str, String str2) {
        object();
        if (this.f62754f) {
            return this;
        }
        ((Map) this.f62753e).put(str, str2);
        return this;
    }

    public String toString() {
        return this.f62754f ? JSONValue.toJSONString(this.f62755g, f62748j) : JSONValue.toJSONString(this.f62750b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> up(int i10) {
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            Stack<Object> stack = this.f62751c;
            if (stack.size() <= 0) {
                break;
            }
            this.f62753e = stack.pop();
            this.f62752d.pop();
            i10 = i11;
        }
        return this;
    }

    public JSONNavi(String str) {
        this.f62751c = new Stack<>();
        this.f62752d = new Stack<>();
        this.f62754f = false;
        this.f62756h = false;
        this.f62757i = null;
        T t10 = (T) JSONValue.parse(str);
        this.f62750b = t10;
        this.f62753e = t10;
        this.f62756h = true;
    }

    public String toString(JSONStyle jSONStyle) {
        if (this.f62754f) {
            return JSONValue.toJSONString(this.f62755g, jSONStyle);
        }
        return JSONValue.toJSONString(this.f62750b, jSONStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> up() {
        Stack<Object> stack = this.f62751c;
        if (stack.size() > 0) {
            this.f62753e = stack.pop();
            this.f62752d.pop();
        }
        return this;
    }

    public JSONNavi<T> set(String str, Number number) {
        object();
        if (this.f62754f) {
            return this;
        }
        ((Map) this.f62753e).put(str, number);
        return this;
    }

    public Object get(int i10) {
        if (this.f62754f) {
            return this;
        }
        if (!isArray()) {
            array();
        }
        Object obj = this.f62753e;
        if (!(obj instanceof List)) {
            a(Integer.valueOf(i10), "current node is not an List");
            return this;
        }
        return ((List) obj).get(i10);
    }

    public JSONNavi(ContainerFactory containerFactory) {
        this.f62751c = new Stack<>();
        this.f62752d = new Stack<>();
        this.f62754f = false;
        this.f62757i = null;
        this.f62749a = containerFactory;
        this.f62756h = false;
    }

    public JSONNavi<T> set(String str, long j10) {
        return set(str, Long.valueOf(j10));
    }

    public JSONNavi<T> set(String str, int i10) {
        return set(str, Integer.valueOf(i10));
    }

    public JSONNavi<T> set(String str, double d2) {
        return set(str, Double.valueOf(d2));
    }

    public JSONNavi<T> set(String str, float f6) {
        return set(str, Float.valueOf(f6));
    }

    public JSONNavi<T> set(Number number) {
        if (this.f62754f) {
            return this;
        }
        this.f62753e = number;
        b();
        return this;
    }

    public JSONNavi<T> set(Boolean bool) {
        if (this.f62754f) {
            return this;
        }
        this.f62753e = bool;
        b();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> at(int i10) {
        if (this.f62754f) {
            return this;
        }
        Object obj = this.f62753e;
        if (!(obj instanceof List)) {
            a(Integer.valueOf(i10), "current node is not an Array");
            return this;
        }
        List list = (List) obj;
        if (i10 < 0 && (i10 = i10 + list.size()) < 0) {
            i10 = 0;
        }
        int size = list.size();
        Stack<Object> stack = this.f62752d;
        Stack<Object> stack2 = this.f62751c;
        if (i10 >= size) {
            if (this.f62756h) {
                a(Integer.valueOf(i10), "Out of bound exception for index");
                return this;
            }
            stack2.add(this.f62753e);
            stack.add(Integer.valueOf(i10));
            this.f62753e = null;
            this.f62757i = Integer.valueOf(i10);
            return this;
        }
        Object obj2 = list.get(i10);
        stack2.add(this.f62753e);
        stack.add(Integer.valueOf(i10));
        this.f62753e = obj2;
        return this;
    }

    public JSONNavi<T> set(String str) {
        if (this.f62754f) {
            return this;
        }
        this.f62753e = str;
        b();
        return this;
    }
}
