package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
/* JADX INFO: loaded from: classes13.dex */
@IgnoreJRERequirement
public final class b extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f93046a = new b();

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class a<R> implements CallAdapter<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f93047a;

        /* JADX INFO: renamed from: retrofit2.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class C0486a implements Callback<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f93048a;

            public C0486a(C0487b c0487b) {
                this.f93048a = c0487b;
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call<R> call, Throwable th2) {
                this.f93048a.completeExceptionally(th2);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<R> call, Response<R> response) {
                boolean zIsSuccessful = response.isSuccessful();
                CompletableFuture<R> completableFuture = this.f93048a;
                if (zIsSuccessful) {
                    completableFuture.complete(response.body());
                } else {
                    completableFuture.completeExceptionally(new HttpException(response));
                }
            }
        }

        public a(Type type) {
            this.f93047a = type;
        }

        @Override // retrofit2.CallAdapter
        public final Object adapt(Call call) {
            C0487b c0487b = new C0487b(call);
            call.enqueue(new C0486a(c0487b));
            return c0487b;
        }

        @Override // retrofit2.CallAdapter
        public final Type responseType() {
            return this.f93047a;
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class C0487b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Call<?> f93049p0;

        public C0487b(Call<?> call) {
            this.f93049p0 = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f93049p0.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class c<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f93050a;

        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class a implements Callback<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<Response<R>> f93051a;

            public a(C0487b c0487b) {
                this.f93051a = c0487b;
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call<R> call, Throwable th2) {
                this.f93051a.completeExceptionally(th2);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<R> call, Response<R> response) {
                this.f93051a.complete(response);
            }
        }

        public c(Type type) {
            this.f93050a = type;
        }

        @Override // retrofit2.CallAdapter
        public final Object adapt(Call call) {
            C0487b c0487b = new C0487b(call);
            call.enqueue(new a(c0487b));
            return c0487b;
        }

        @Override // retrofit2.CallAdapter
        public final Type responseType() {
            return this.f93050a;
        }
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public final CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != pl.a.a()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        if (CallAdapter.Factory.getRawType(parameterUpperBound) != Response.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
