package flexjson;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import flexjson.transformer.Transformer;
import flexjson.transformer.TypeTransformerMap;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public class JSONContext {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f68470n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f68471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OutputHandler f68472b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypeTransformerMap f68476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<Path, Transformer> f68477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<PathExpression> f68478h;
    public boolean m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68473c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack<TypeContext> f68474d = new Stack<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68475e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SerializationType f68479i = SerializationType.SHALLOW;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ChainedSet f68480j = new ChainedSet(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedList<Object> f68481k = new LinkedList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Path f68482l = new Path();

    public static class a extends ThreadLocal<JSONContext> {
        @Override // java.lang.ThreadLocal
        public final JSONContext initialValue() {
            return new JSONContext();
        }
    }

    public static void cleanup() {
        f68470n.remove();
    }

    public static JSONContext get() {
        return f68470n.get();
    }

    public final void a() {
        if (this.m) {
            this.f68472b.write(",");
            if (this.f68473c) {
                this.f68472b.write(RootService.LINE_BREAK);
            }
            this.m = false;
        }
    }

    public LinkedList<Object> getObjectStack() {
        return this.f68481k;
    }

    public OutputHandler getOut() {
        return this.f68472b;
    }

    public Path getPath() {
        return this.f68482l;
    }

    public String getRootName() {
        return this.f68471a;
    }

    public Transformer getTransformer(BeanProperty beanProperty, Object obj) throws IllegalAccessException, InstantiationException {
        Transformer transformer = this.f68477g.get(this.f68482l);
        if (transformer != null) {
            return transformer;
        }
        if (beanProperty != null) {
            transformer = beanProperty.getTransformer();
        }
        return transformer == null ? this.f68476f.getTransformer(obj) : transformer;
    }

    public ChainedSet getVisits() {
        return this.f68480j;
    }

    public boolean isIncluded(BeanProperty beanProperty) {
        PathExpression pathExpressionMatches = matches(this.f68478h);
        if (pathExpressionMatches != null) {
            return pathExpressionMatches.isIncluded();
        }
        Boolean boolIsIncluded = beanProperty.isIncluded();
        if (boolIsIncluded != null) {
            return boolIsIncluded.booleanValue();
        }
        if (beanProperty.isTransient().booleanValue()) {
            return false;
        }
        if (this.f68479i != SerializationType.SHALLOW) {
            return true;
        }
        Class propertyType = beanProperty.getPropertyType();
        return (propertyType.isArray() || Iterable.class.isAssignableFrom(propertyType) || Map.class.isAssignableFrom(propertyType)) ? false : true;
    }

    public PathExpression matches(List<PathExpression> list) {
        for (PathExpression pathExpression : list) {
            if (pathExpression.matches(this.f68482l)) {
                return pathExpression;
            }
        }
        return null;
    }

    public TypeContext peekTypeContext() {
        Stack<TypeContext> stack = this.f68474d;
        if (stack.isEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public void popTypeContext() {
        this.f68474d.pop();
    }

    public void pushTypeContext(TypeContext typeContext) {
        this.f68474d.push(typeContext);
    }

    public void serializationType(SerializationType serializationType) {
        this.f68479i = serializationType;
    }

    public void setOut(OutputHandler outputHandler) {
        this.f68472b = outputHandler;
    }

    public void setPathExpressions(List<PathExpression> list) {
        this.f68478h = list;
    }

    public void setPathTransformers(Map<Path, Transformer> map) {
        this.f68477g = map;
    }

    public void setPrettyPrint(boolean z10) {
        this.f68473c = z10;
    }

    public void setRootName(String str) {
        this.f68471a = str;
    }

    public void setTypeTransformers(TypeTransformerMap typeTransformerMap) {
        this.f68476f = typeTransformerMap;
    }

    public void setVisits(ChainedSet chainedSet) {
        this.f68480j = chainedSet;
    }

    public void transform(Object obj) {
        Transformer transformer = this.f68477g.get(this.f68482l);
        if (transformer == null) {
            transformer = this.f68476f.getTransformer(obj);
        }
        transformer.transform(obj);
    }

    public void write(String str) {
        a();
        TypeContext typeContextPeekTypeContext = peekTypeContext();
        if (typeContextPeekTypeContext != null && typeContextPeekTypeContext.getBasicType() == BasicType.ARRAY) {
            writeIndent();
        }
        this.f68472b.write(str);
    }

    public void writeCloseArray() {
        this.m = false;
        if (this.f68473c) {
            this.f68472b.write(RootService.LINE_BREAK);
            this.f68475e -= 4;
            writeIndent();
        }
        this.f68472b.write(Constant.BRACKET_CLOSE);
        popTypeContext();
    }

    public void writeCloseObject() {
        this.m = false;
        if (this.f68473c) {
            this.f68472b.write(RootService.LINE_BREAK);
            this.f68475e -= 4;
            writeIndent();
        }
        this.f68472b.write("}");
        popTypeContext();
    }

    public void writeComma() {
        this.m = true;
    }

    public void writeIndent() {
        for (int i10 = 0; i10 < this.f68475e; i10++) {
            this.f68472b.write(" ");
        }
    }

    public void writeName(String str) {
        a();
        if (this.f68473c) {
            writeIndent();
        }
        if (str != null) {
            writeQuoted(str);
        } else {
            write(AbstractJsonLexerKt.NULL);
        }
        this.f68472b.write(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        if (this.f68473c) {
            this.f68472b.write(" ");
        }
    }

    public TypeContext writeOpenArray() {
        TypeContext typeContextPeekTypeContext;
        a();
        if (this.f68473c && (typeContextPeekTypeContext = peekTypeContext()) != null && typeContextPeekTypeContext.getBasicType() == BasicType.ARRAY) {
            writeIndent();
        }
        TypeContext typeContext = new TypeContext(BasicType.ARRAY);
        pushTypeContext(typeContext);
        this.f68472b.write(Constant.BRACKET_OPEN);
        if (this.f68473c) {
            this.f68475e += 4;
            this.f68472b.write(RootService.LINE_BREAK);
        }
        return typeContext;
    }

    public TypeContext writeOpenObject() {
        TypeContext typeContextPeekTypeContext;
        a();
        if (this.f68473c && (typeContextPeekTypeContext = peekTypeContext()) != null && typeContextPeekTypeContext.getBasicType() == BasicType.ARRAY) {
            writeIndent();
        }
        TypeContext typeContext = new TypeContext(BasicType.OBJECT);
        pushTypeContext(typeContext);
        this.f68472b.write("{");
        if (this.f68473c) {
            this.f68475e += 4;
            this.f68472b.write(RootService.LINE_BREAK);
        }
        return typeContext;
    }

    public void writeQuoted(String str) {
        TypeContext typeContextPeekTypeContext;
        a();
        if (this.f68473c && (typeContextPeekTypeContext = peekTypeContext()) != null && typeContextPeekTypeContext.getBasicType() == BasicType.ARRAY) {
            writeIndent();
        }
        this.f68472b.write("\"");
        int length = str.length();
        int iWrite = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\u0022");
            } else if (cCharAt == '&') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\u0026");
            } else if (cCharAt == '\'') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\u0027");
            } else if (cCharAt == '<') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\u003c");
            } else if (cCharAt == '>') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\u003e");
            } else if (cCharAt == '\\') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\\\");
            } else if (cCharAt == '\b') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\b");
            } else if (cCharAt == '\f') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\f");
            } else if (cCharAt == '\n') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\n");
            } else if (cCharAt == '\r') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\r");
            } else if (cCharAt == '\t') {
                iWrite = this.f68472b.write(str, iWrite, i10, "\\t");
            } else if (Character.isISOControl(cCharAt)) {
                iWrite = this.f68472b.write(str, iWrite, i10) + 1;
                this.f68472b.write("\\u");
                int i11 = 0;
                int i12 = cCharAt;
                while (i11 < 4) {
                    this.f68472b.write(String.valueOf(JSONSerializer.HEX[(61440 & i12) >> 12]));
                    i11++;
                    i12 <<= 4;
                }
            }
        }
        if (iWrite < str.length()) {
            this.f68472b.write(str, iWrite, str.length());
        }
        this.f68472b.write("\"");
    }

    public boolean isIncluded(String str, Object obj) {
        PathExpression pathExpressionMatches = matches(this.f68478h);
        if (pathExpressionMatches != null) {
            return pathExpressionMatches.isIncluded();
        }
        String rootName = f68470n.get().getRootName();
        if (obj == null) {
            return true;
        }
        SerializationType serializationType = this.f68479i;
        SerializationType serializationType2 = SerializationType.SHALLOW;
        if ((serializationType != serializationType2 || rootName == null || this.f68482l.length() <= 1) && !(this.f68479i == serializationType2 && rootName == null)) {
            return true;
        }
        Class<?> cls = obj.getClass();
        return (cls.isArray() || Iterable.class.isAssignableFrom(cls)) ? false : true;
    }
}
