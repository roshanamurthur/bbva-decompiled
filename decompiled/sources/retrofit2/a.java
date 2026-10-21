package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import retrofit2.http.Streaming;
import sn.i;

/* JADX INFO: compiled from: BuiltInConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f93039a = true;

    /* JADX INFO: renamed from: retrofit2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class C0485a implements Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0485a f93040a = new C0485a();

        @Override // retrofit2.Converter
        public final ResponseBody convert(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                Buffer buffer = new Buffer();
                responseBody2.getF85884s0().readAll(buffer);
                return ResponseBody.create(responseBody2.getF85678q0(), responseBody2.getF85883r0(), buffer);
            } finally {
                responseBody2.close();
            }
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class b implements Converter<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f93041a = new b();

        @Override // retrofit2.Converter
        public final RequestBody convert(RequestBody requestBody) throws IOException {
            return requestBody;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class c implements Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f93042a = new c();

        @Override // retrofit2.Converter
        public final ResponseBody convert(ResponseBody responseBody) throws IOException {
            return responseBody;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class d implements Converter<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f93043a = new d();

        @Override // retrofit2.Converter
        public final String convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class e implements Converter<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f93044a = new e();

        @Override // retrofit2.Converter
        public final Unit convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class f implements Converter<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f93045a = new f();

        @Override // retrofit2.Converter
        public final Void convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public final Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(i.e(type))) {
            return b.f93041a;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public final Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            return i.h(Streaming.class, annotationArr) ? c.f93042a : C0485a.f93040a;
        }
        if (type == Void.class) {
            return f.f93045a;
        }
        if (!this.f93039a || type != Unit.class) {
            return null;
        }
        try {
            return e.f93044a;
        } catch (NoClassDefFoundError unused) {
            this.f93039a = false;
            return null;
        }
    }
}
