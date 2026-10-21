package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: OptionalConverterFactory.java */
/* JADX INFO: loaded from: classes13.dex */
@IgnoreJRERequirement
public final class e extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f93075a = new e();

    /* JADX INFO: compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    public static final class a<T> implements Converter<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Converter<ResponseBody, T> f93076a;

        public a(Converter<ResponseBody, T> converter) {
            this.f93076a = converter;
        }

        @Override // retrofit2.Converter
        public final Object convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f93076a.convert(responseBody));
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public final Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != com.esotericsoftware.kryo.serializers.c.a()) {
            return null;
        }
        return new a(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
