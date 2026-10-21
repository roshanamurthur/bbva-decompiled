package flexjson;

import flexjson.transformer.Transformer;
import flexjson.transformer.TransformerWrapper;
import flexjson.transformer.TypeTransformerMap;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class JSONSerializer {
    public static final char[] HEX = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeTransformerMap f68487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f68488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f68489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f68490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f68491e;

    public JSONSerializer() {
        this.f68488b = new HashMap();
        this.f68489c = new ArrayList();
        this.f68487a = new TypeTransformerMap(TransformerUtil.getDefaultTypeTransformers());
    }

    public void addExclude(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        ArrayList arrayList = this.f68489c;
        if (iLastIndexOf > 0) {
            PathExpression pathExpression = new PathExpression(str.substring(0, iLastIndexOf), true);
            if (!pathExpression.isWildcard()) {
                arrayList.add(pathExpression);
            }
        }
        arrayList.add(new PathExpression(str, false));
    }

    public void addInclude(String str) {
        this.f68489c.add(new PathExpression(str, true));
    }

    public String deepSerialize(Object obj) {
        return serialize(obj, SerializationType.DEEP, new StringBuilderOutputHandler(new StringBuilder()));
    }

    public JSONSerializer exclude(String... strArr) {
        for (String str : strArr) {
            addExclude(str);
        }
        return this;
    }

    public List<PathExpression> getExcludes() {
        ArrayList arrayList = new ArrayList();
        for (PathExpression pathExpression : this.f68489c) {
            if (!pathExpression.isIncluded()) {
                arrayList.add(pathExpression);
            }
        }
        return arrayList;
    }

    public List<PathExpression> getIncludes() {
        ArrayList arrayList = new ArrayList();
        for (PathExpression pathExpression : this.f68489c) {
            if (pathExpression.isIncluded()) {
                arrayList.add(pathExpression);
            }
        }
        return arrayList;
    }

    public JSONSerializer include(String... strArr) {
        for (String str : strArr) {
            addInclude(str);
        }
        return this;
    }

    public JSONSerializer prettyPrint(boolean z10) {
        this.f68490d = z10;
        return this;
    }

    public JSONSerializer rootName(String str) {
        this.f68491e = str;
        return this;
    }

    public String serialize(Object obj) {
        return serialize(obj, SerializationType.SHALLOW, new StringBuilderOutputHandler(new StringBuilder()));
    }

    public void setExcludes(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            addExclude(it.next());
        }
    }

    public void setIncludes(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f68489c.add(new PathExpression(it.next(), true));
        }
    }

    public JSONSerializer transform(Transformer transformer, String... strArr) {
        TransformerWrapper transformerWrapper = new TransformerWrapper(transformer);
        for (String str : strArr) {
            int length = str.length();
            HashMap map = this.f68488b;
            if (length == 0) {
                map.put(new Path(), transformerWrapper);
            } else {
                map.put(new Path(str.split("\\.")), transformerWrapper);
            }
        }
        return this;
    }

    public void deepSerialize(Object obj, Writer writer) {
        serialize(obj, SerializationType.DEEP, new WriterOutputHandler(writer));
    }

    public void serialize(Object obj, Writer writer) {
        serialize(obj, SerializationType.SHALLOW, new WriterOutputHandler(writer));
    }

    public String deepSerialize(Object obj, StringBuilder sb2) {
        return serialize(obj, SerializationType.DEEP, new StringBuilderOutputHandler(sb2));
    }

    public String serialize(Object obj, StringBuilder sb2) {
        return serialize(obj, SerializationType.SHALLOW, new StringBuilderOutputHandler(sb2));
    }

    public String deepSerialize(Object obj, StringBuffer stringBuffer) {
        return serialize(obj, SerializationType.DEEP, new StringBufferOutputHandler(stringBuffer));
    }

    public String serialize(Object obj, StringBuffer stringBuffer) {
        return serialize(obj, SerializationType.SHALLOW, new StringBufferOutputHandler(stringBuffer));
    }

    public JSONSerializer(TypeTransformerMap typeTransformerMap) {
        this.f68488b = new HashMap();
        this.f68489c = new ArrayList();
        this.f68487a = new TypeTransformerMap(typeTransformerMap);
    }

    public String deepSerialize(Object obj, OutputHandler outputHandler) {
        return serialize(obj, SerializationType.DEEP, outputHandler);
    }

    public String serialize(Object obj, OutputHandler outputHandler) {
        return serialize(obj, SerializationType.SHALLOW, outputHandler);
    }

    public String serialize(Object obj, SerializationType serializationType, OutputHandler outputHandler) {
        JSONContext jSONContext = JSONContext.get();
        jSONContext.setRootName(this.f68491e);
        jSONContext.setPrettyPrint(this.f68490d);
        jSONContext.setOut(outputHandler);
        jSONContext.serializationType(serializationType);
        jSONContext.setTypeTransformers(this.f68487a);
        jSONContext.setPathTransformers(this.f68488b);
        jSONContext.setPathExpressions(this.f68489c);
        try {
            String rootName = jSONContext.getRootName();
            if (rootName != null && !rootName.trim().equals("")) {
                jSONContext.writeOpenObject();
                jSONContext.writeName(rootName);
                jSONContext.transform(obj);
                jSONContext.writeCloseObject();
            } else {
                jSONContext.transform(obj);
            }
            return jSONContext.getOut().toString();
        } finally {
            JSONContext.cleanup();
        }
    }

    public JSONSerializer transform(Transformer transformer, Class... clsArr) {
        TransformerWrapper transformerWrapper = new TransformerWrapper(transformer);
        for (Class cls : clsArr) {
            this.f68487a.putTransformer(cls, transformerWrapper);
        }
        return this;
    }
}
