package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import tn.a;
import tn.b;

/* JADX INFO: loaded from: classes13.dex */
public final class GsonConverterFactory extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f93059a;

    public GsonConverterFactory(Gson gson) {
        this.f93059a = gson;
    }

    public static GsonConverterFactory create() {
        return create(new Gson());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f93059a;
        return new a(gson, gson.getAdapter(typeToken));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f93059a;
        return new b(gson, gson.getAdapter(typeToken));
    }

    public static GsonConverterFactory create(Gson gson) {
        if (gson != null) {
            return new GsonConverterFactory(gson);
        }
        throw new NullPointerException("gson == null");
    }
}
