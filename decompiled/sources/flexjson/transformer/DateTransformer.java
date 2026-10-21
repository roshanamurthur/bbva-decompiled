package flexjson.transformer;

import flexjson.JSONContext;
import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class DateTransformer extends AbstractTransformer implements ObjectFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal<SimpleDateFormat> f68523b = new ThreadLocal<>();

    public DateTransformer(String str) {
        this.f68522a = str;
    }

    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        try {
            ThreadLocal<SimpleDateFormat> threadLocal = this.f68523b;
            if (threadLocal.get() == null) {
                threadLocal.set(new SimpleDateFormat(this.f68522a));
            }
            return threadLocal.get().parse(obj.toString());
        } catch (ParseException e5) {
            throw new JSONException(String.format("%s: Failed to parse %s with %s pattern.", objectBinder.getCurrentPath(), obj, this.f68522a), e5);
        }
    }

    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        if (obj == null) {
            getContext().write(AbstractJsonLexerKt.NULL);
            return;
        }
        JSONContext context = getContext();
        ThreadLocal<SimpleDateFormat> threadLocal = this.f68523b;
        if (threadLocal.get() == null) {
            threadLocal.set(new SimpleDateFormat(this.f68522a));
        }
        context.writeQuoted(threadLocal.get().format(obj));
    }
}
