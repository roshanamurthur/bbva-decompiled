package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import sn.g;

/* JADX INFO: loaded from: classes13.dex */
public final class Retrofit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f93021a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okhttp3.Call.Factory f93022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f93023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Converter.Factory> f93024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<CallAdapter.Factory> f93025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Executor f93026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f93027g;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f93035a = f.f93077c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f93036b = new Object[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f93037c;

        public a(Class cls) {
            this.f93037c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f93036b;
            }
            f fVar = this.f93035a;
            return (fVar.f93078a && method.isDefault()) ? fVar.b(method, this.f93037c, obj, objArr) : Retrofit.this.a(method).a(objArr);
        }
    }

    public Retrofit(okhttp3.Call.Factory factory, HttpUrl httpUrl, List<Converter.Factory> list, List<CallAdapter.Factory> list2, @Nullable Executor executor, boolean z10) {
        this.f93022b = factory;
        this.f93023c = httpUrl;
        this.f93024d = list;
        this.f93025e = list2;
        this.f93026f = executor;
        this.f93027g = z10;
    }

    public final g<?> a(Method method) {
        g<?> gVarB;
        g<?> gVar = (g) this.f93021a.get(method);
        if (gVar != null) {
            return gVar;
        }
        synchronized (this.f93021a) {
            try {
                gVarB = (g) this.f93021a.get(method);
                if (gVarB == null) {
                    gVarB = g.b(this, method);
                    this.f93021a.put(method, gVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVarB;
    }

    public HttpUrl baseUrl() {
        return this.f93023c;
    }

    public CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.f93025e;
    }

    public okhttp3.Call.Factory callFactory() {
        return this.f93022b;
    }

    @Nullable
    public Executor callbackExecutor() {
        return this.f93026f;
    }

    public List<Converter.Factory> converterFactories() {
        return this.f93024d;
    }

    public <T> T create(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f93027g) {
            f fVar = f.f93077c;
            for (Method method : cls.getDeclaredMethods()) {
                if ((!fVar.f93078a || !method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    a(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public CallAdapter<?, ?> nextCallAdapter(@Nullable CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<CallAdapter.Factory> list = this.f93025e;
        int iIndexOf = list.indexOf(factory) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            CallAdapter<?, ?> callAdapter = list.get(i10).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(list.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<T, RequestBody> nextRequestBodyConverter(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<Converter.Factory> list = this.f93024d;
        int iIndexOf = list.indexOf(factory) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) list.get(i10).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(list.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<ResponseBody, T> nextResponseBodyConverter(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<Converter.Factory> list = this.f93024d;
        int iIndexOf = list.indexOf(factory) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) list.get(i10).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (factory != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(list.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> Converter<T, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<ResponseBody, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<Converter.Factory> list = this.f93024d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Converter<T, String> converter = (Converter<T, String>) list.get(i10).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return retrofit2.a.d.f93043a;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f93028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public okhttp3.Call.Factory f93029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public HttpUrl f93030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f93031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f93032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Executor f93033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f93034g;

        public Builder() {
            f fVar = f.f93077c;
            this.f93031d = new ArrayList();
            this.f93032e = new ArrayList();
            this.f93028a = fVar;
        }

        public Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f93032e.add(factory);
            return this;
        }

        public Builder addConverterFactory(Converter.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f93031d.add(factory);
            return this;
        }

        public Builder baseUrl(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return baseUrl(HttpUrl.get(url.toString()));
        }

        public Retrofit build() {
            if (this.f93030c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            okhttp3.Call.Factory okHttpClient = this.f93029b;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            okhttp3.Call.Factory factory = okHttpClient;
            Executor executorA = this.f93033f;
            f fVar = this.f93028a;
            if (executorA == null) {
                executorA = fVar.a();
            }
            Executor executor = executorA;
            ArrayList arrayList = new ArrayList(this.f93032e);
            fVar.getClass();
            c cVar = new c(executor);
            boolean z10 = fVar.f93078a;
            arrayList.addAll(z10 ? Arrays.asList(b.f93046a, cVar) : Collections.singletonList(cVar));
            ArrayList arrayList2 = this.f93031d;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z10 ? 1 : 0));
            arrayList3.add(new retrofit2.a());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(z10 ? Collections.singletonList(e.f93075a) : Collections.emptyList());
            return new Retrofit(factory, this.f93030c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executor, this.f93034g);
        }

        public List<CallAdapter.Factory> callAdapterFactories() {
            return this.f93032e;
        }

        public Builder callFactory(okhttp3.Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f93029b = factory;
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f93033f = executor;
            return this;
        }

        public Builder client(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return callFactory(okHttpClient);
        }

        public List<Converter.Factory> converterFactories() {
            return this.f93031d;
        }

        public Builder validateEagerly(boolean z10) {
            this.f93034g = z10;
            return this;
        }

        public Builder baseUrl(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return baseUrl(HttpUrl.get(str));
        }

        public Builder baseUrl(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> listPathSegments = httpUrl.pathSegments();
            if ("".equals(listPathSegments.get(listPathSegments.size() - 1))) {
                this.f93030c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public Builder(Retrofit retrofit) {
            this.f93031d = new ArrayList();
            this.f93032e = new ArrayList();
            f fVar = f.f93077c;
            this.f93028a = fVar;
            this.f93029b = retrofit.f93022b;
            this.f93030c = retrofit.f93023c;
            List<Converter.Factory> list = retrofit.f93024d;
            int size = list.size() - (fVar.f93078a ? 1 : 0);
            for (int i10 = 1; i10 < size; i10++) {
                this.f93031d.add(list.get(i10));
            }
            List<CallAdapter.Factory> list2 = retrofit.f93025e;
            int size2 = list2.size() - (this.f93028a.f93078a ? 2 : 1);
            for (int i11 = 0; i11 < size2; i11++) {
                this.f93032e.add(list2.get(i11));
            }
            this.f93033f = retrofit.f93026f;
            this.f93034g = retrofit.f93027g;
        }
    }
}
