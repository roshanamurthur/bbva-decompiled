package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import okio.Timeout;
import sn.i;

/* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
/* JADX INFO: loaded from: classes13.dex */
public final class c extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Executor f93052a;

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public class a implements CallAdapter<Object, Call<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f93053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f93054b;

        public a(Type type, Executor executor) {
            this.f93053a = type;
            this.f93054b = executor;
        }

        @Override // retrofit2.CallAdapter
        public final Call<?> adapt(Call<Object> call) {
            Executor executor = this.f93054b;
            return executor == null ? call : new b(executor, call);
        }

        @Override // retrofit2.CallAdapter
        public final Type responseType() {
            return this.f93053a;
        }
    }

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public static final class b<T> implements Call<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Executor f93055p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Call<T> f93056q0;

        /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
        public class a implements Callback<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Callback f93057a;

            public a(Callback callback) {
                this.f93057a = callback;
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call<T> call, Throwable th2) {
                b.this.f93055p0.execute(new v2.e(this, this.f93057a, 3, th2));
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<T> call, Response<T> response) {
                b.this.f93055p0.execute(new com.appsflyer.internal.b(this, this.f93057a, 1, response));
            }
        }

        public b(Executor executor, Call<T> call) {
            this.f93055p0 = executor;
            this.f93056q0 = call;
        }

        @Override // retrofit2.Call
        public final void cancel() {
            this.f93056q0.cancel();
        }

        @Override // retrofit2.Call
        public final void enqueue(Callback<T> callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.f93056q0.enqueue(new a(callback));
        }

        @Override // retrofit2.Call
        public final Response<T> execute() throws IOException {
            return this.f93056q0.execute();
        }

        @Override // retrofit2.Call
        public final boolean isCanceled() {
            return this.f93056q0.isCanceled();
        }

        @Override // retrofit2.Call
        public final boolean isExecuted() {
            return this.f93056q0.isExecuted();
        }

        @Override // retrofit2.Call
        public final Request request() {
            return this.f93056q0.request();
        }

        @Override // retrofit2.Call
        public final Timeout timeout() {
            return this.f93056q0.timeout();
        }

        @Override // retrofit2.Call
        public final Call<T> clone() {
            return new b(this.f93055p0, this.f93056q0.clone());
        }
    }

    public c(@Nullable Executor executor) {
        this.f93052a = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public final CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(i.d(0, (ParameterizedType) type), i.h(SkipCallbackExecutor.class, annotationArr) ? null : this.f93052a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
