package retrofit2.converter.scalars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import un.a;
import un.b;
import un.c;
import un.d;
import un.e;
import un.f;
import un.g;
import un.h;
import un.i;
import un.j;

/* JADX INFO: loaded from: classes13.dex */
public final class ScalarsConverterFactory extends Converter.Factory {
    public static ScalarsConverterFactory create() {
        return new ScalarsConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return a.f93899a;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == String.class) {
            return j.f93909a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return b.f93901a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return c.f93902a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return d.f93903a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return e.f93904a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return f.f93905a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return g.f93906a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return h.f93907a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return i.f93908a;
        }
        return null;
    }
}
