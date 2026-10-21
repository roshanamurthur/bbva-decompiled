package net.minidev.json;

import ci.a;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minidev.json.parser.ContainerFactory;

/* JADX INFO: loaded from: classes12.dex */
public class JSONNavi<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final JSONStyle f85151j = new JSONStyle(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContainerFactory f85152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f85153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Stack<Object> f85154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack<Object> f85155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f85156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f85158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f85159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f85160i;

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
        this.f85157f = true;
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
        this.f85158g = sbD.toString();
    }

    public JSONNavi<T> add(Object... objArr) {
        array();
        if (this.f85157f) {
            return this;
        }
        List list = (List) this.f85156e;
        for (Object obj : objArr) {
            list.add(obj);
        }
        return this;
    }

    public JSONNavi<T> array() {
        if (this.f85157f) {
            return this;
        }
        if (this.f85156e == null && this.f85159h) {
            a(null, "Can not create Array child in readonly");
        }
        if (this.f85156e == null) {
            this.f85156e = this.f85152a.createArrayContainer();
        } else {
            if (isArray()) {
                return this;
            }
            if (isObject()) {
                a(null, "can not use Object feature on Array.");
            }
            a(null, "Can not use current possition as Object");
        }
        if (this.f85153b == null) {
            this.f85153b = (T) this.f85156e;
        } else {
            b();
        }
        return this;
    }

    public boolean asBoolean() {
        Object obj = this.f85156e;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public Boolean asBooleanObj() {
        Object obj = this.f85156e;
        if (obj != null && (obj instanceof Boolean)) {
            return (Boolean) obj;
        }
        return null;
    }

    public double asDouble() {
        Object obj = this.f85156e;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return Double.NaN;
    }

    public Double asDoubleObj() {
        Object obj = this.f85156e;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof Double ? (Double) obj : Double.valueOf(((Number) obj).doubleValue());
        }
        return Double.valueOf(Double.NaN);
    }

    public double asFloat() {
        Object obj = this.f85156e;
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        return Double.NaN;
    }

    public Float asFloatObj() {
        Object obj = this.f85156e;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof Float ? (Float) obj : Float.valueOf(((Number) obj).floatValue());
        }
        return Float.valueOf(Float.NaN);
    }

    public int asInt() {
        Object obj = this.f85156e;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    public Integer asIntegerObj() {
        Object obj = this.f85156e;
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
        Object obj = this.f85156e;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    public Long asLongObj() {
        Object obj = this.f85156e;
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
        Object obj = this.f85156e;
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> at(String str) {
        if (this.f85157f) {
            return this;
        }
        if (!isObject()) {
            object();
        }
        Object obj = this.f85156e;
        if (!(obj instanceof Map)) {
            a(str, "current node is not an Object");
            return this;
        }
        boolean zContainsKey = ((Map) obj).containsKey(str);
        Stack<Object> stack = this.f85155d;
        Stack<Object> stack2 = this.f85154c;
        if (zContainsKey) {
            Object obj2 = ((Map) this.f85156e).get(str);
            stack2.add(this.f85156e);
            stack.add(str);
            this.f85156e = obj2;
            return this;
        }
        if (this.f85159h) {
            a(str, "current Object have no key named " + str);
            return this;
        }
        stack2.add(this.f85156e);
        stack.add(str);
        this.f85156e = null;
        this.f85160i = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> atNext() {
        if (this.f85157f) {
            return this;
        }
        Object obj = this.f85156e;
        if (obj instanceof List) {
            return at(((List) obj).size());
        }
        a(null, "current node is not an Array");
        return this;
    }

    public final void b() {
        Object objPeek = this.f85154c.peek();
        if (objPeek != null && (objPeek instanceof Map)) {
            ((Map) objPeek).put((String) this.f85160i, this.f85156e);
            return;
        }
        if (objPeek != null && (objPeek instanceof List)) {
            int iIntValue = ((Number) this.f85160i).intValue();
            List list = (List) objPeek;
            while (list.size() <= iIntValue) {
                list.add(null);
            }
            list.set(iIntValue, this.f85156e);
        }
    }

    public Object get(String str) {
        if (this.f85157f) {
            return this;
        }
        if (!isObject()) {
            object();
        }
        Object obj = this.f85156e;
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        a(str, "current node is not an Object");
        return this;
    }

    public Object getCurrentObject() {
        return this.f85156e;
    }

    public String getJPath() {
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : this.f85155d) {
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
        Object obj = this.f85156e;
        if (obj instanceof Map) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    public T getRoot() {
        return this.f85153b;
    }

    public int getSize() {
        if (this.f85156e == null) {
            return 0;
        }
        if (isArray()) {
            return ((List) this.f85156e).size();
        }
        if (isObject()) {
            return ((Map) this.f85156e).size();
        }
        return 1;
    }

    public boolean hasFailure() {
        return this.f85157f;
    }

    public boolean isArray() {
        Object obj = this.f85156e;
        if (obj == null) {
            return false;
        }
        return obj instanceof List;
    }

    public boolean isObject() {
        Object obj = this.f85156e;
        if (obj == null) {
            return false;
        }
        return obj instanceof Map;
    }

    public JSONNavi<T> object() {
        if (this.f85157f) {
            return this;
        }
        if (this.f85156e == null && this.f85159h) {
            a(null, "Can not create Object child in readonly");
        }
        if (this.f85156e == null) {
            this.f85156e = this.f85152a.createObjectContainer();
        } else {
            if (isObject()) {
                return this;
            }
            if (isArray()) {
                a(null, "can not use Object feature on Array.");
            }
            a(null, "Can not use current possition as Object");
        }
        if (this.f85153b == null) {
            this.f85153b = (T) this.f85156e;
        } else {
            b();
        }
        return this;
    }

    public JSONNavi<T> root() {
        this.f85156e = this.f85153b;
        this.f85154c.clear();
        this.f85155d.clear();
        this.f85157f = false;
        this.f85160i = null;
        this.f85158g = null;
        return this;
    }

    public JSONNavi<T> set(String str, String str2) {
        object();
        if (this.f85157f) {
            return this;
        }
        ((Map) this.f85156e).put(str, str2);
        return this;
    }

    public String toString() {
        return this.f85157f ? JSONValue.toJSONString(this.f85158g, f85151j) : JSONValue.toJSONString(this.f85153b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> up(int i10) {
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            Stack<Object> stack = this.f85154c;
            if (stack.size() <= 0) {
                break;
            }
            this.f85156e = stack.pop();
            this.f85155d.pop();
            i10 = i11;
        }
        return this;
    }

    public JSONNavi(String str) {
        this.f85154c = new Stack<>();
        this.f85155d = new Stack<>();
        this.f85157f = false;
        this.f85159h = false;
        this.f85160i = null;
        T t10 = (T) JSONValue.parse(str);
        this.f85153b = t10;
        this.f85156e = t10;
        this.f85159h = true;
    }

    public String toString(JSONStyle jSONStyle) {
        if (this.f85157f) {
            return JSONValue.toJSONString(this.f85158g, jSONStyle);
        }
        return JSONValue.toJSONString(this.f85153b, jSONStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> up() {
        Stack<Object> stack = this.f85154c;
        if (stack.size() > 0) {
            this.f85156e = stack.pop();
            this.f85155d.pop();
        }
        return this;
    }

    public JSONNavi<T> set(String str, Number number) {
        object();
        if (this.f85157f) {
            return this;
        }
        ((Map) this.f85156e).put(str, number);
        return this;
    }

    public Object get(int i10) {
        if (this.f85157f) {
            return this;
        }
        if (!isArray()) {
            array();
        }
        Object obj = this.f85156e;
        if (!(obj instanceof List)) {
            a(Integer.valueOf(i10), "current node is not an List");
            return this;
        }
        return ((List) obj).get(i10);
    }

    public JSONNavi(ContainerFactory containerFactory) {
        this.f85154c = new Stack<>();
        this.f85155d = new Stack<>();
        this.f85157f = false;
        this.f85160i = null;
        this.f85152a = containerFactory;
        this.f85159h = false;
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
        if (this.f85157f) {
            return this;
        }
        this.f85156e = number;
        b();
        return this;
    }

    public JSONNavi<T> set(Boolean bool) {
        if (this.f85157f) {
            return this;
        }
        this.f85156e = bool;
        b();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> at(int i10) {
        if (this.f85157f) {
            return this;
        }
        Object obj = this.f85156e;
        if (!(obj instanceof List)) {
            a(Integer.valueOf(i10), "current node is not an Array");
            return this;
        }
        List list = (List) obj;
        if (i10 < 0 && (i10 = i10 + list.size()) < 0) {
            i10 = 0;
        }
        int size = list.size();
        Stack<Object> stack = this.f85155d;
        Stack<Object> stack2 = this.f85154c;
        if (i10 >= size) {
            if (this.f85159h) {
                a(Integer.valueOf(i10), "Out of bound exception for index");
                return this;
            }
            stack2.add(this.f85156e);
            stack.add(Integer.valueOf(i10));
            this.f85156e = null;
            this.f85160i = Integer.valueOf(i10);
            return this;
        }
        Object obj2 = list.get(i10);
        stack2.add(this.f85156e);
        stack.add(Integer.valueOf(i10));
        this.f85156e = obj2;
        return this;
    }

    public JSONNavi<T> set(String str) {
        if (this.f85157f) {
            return this;
        }
        this.f85156e = str;
        b();
        return this;
    }
}
