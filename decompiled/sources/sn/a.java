package sn;

import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.ResponseBody;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.KotlinExtensions;

/* JADX INFO: compiled from: HttpServiceMethod.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class a<ResponseT, ReturnT> extends g<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f93237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f93238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Converter<ResponseBody, ResponseT> f93239c;

    /* JADX INFO: renamed from: sn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class C0492a<ResponseT, ReturnT> extends a<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CallAdapter<ResponseT, ReturnT> f93240d;

        public C0492a(f fVar, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(fVar, factory, converter);
            this.f93240d = callAdapter;
        }

        @Override // sn.a
        public final Object c(retrofit2.d dVar, Object[] objArr) {
            return this.f93240d.adapt(dVar);
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class b<ResponseT> extends a<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CallAdapter<ResponseT, retrofit2.Call<ResponseT>> f93241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f93242e;

        public b(f fVar, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(fVar, factory, converter);
            this.f93241d = callAdapter;
            this.f93242e = false;
        }

        @Override // sn.a
        public final Object c(retrofit2.d dVar, Object[] objArr) {
            retrofit2.Call<ResponseT> callAdapt = this.f93241d.adapt(dVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f93242e ? KotlinExtensions.awaitNullable(callAdapt, continuation) : KotlinExtensions.await(callAdapt, continuation);
            } catch (Exception e5) {
                return KotlinExtensions.suspendAndThrow(e5, continuation);
            }
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class c<ResponseT> extends a<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CallAdapter<ResponseT, retrofit2.Call<ResponseT>> f93243d;

        public c(f fVar, Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, retrofit2.Call<ResponseT>> callAdapter) {
            super(fVar, factory, converter);
            this.f93243d = callAdapter;
        }

        @Override // sn.a
        public final Object c(retrofit2.d dVar, Object[] objArr) {
            retrofit2.Call<ResponseT> callAdapt = this.f93243d.adapt(dVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(callAdapt, continuation);
            } catch (Exception e5) {
                return KotlinExtensions.suspendAndThrow(e5, continuation);
            }
        }
    }

    public a(f fVar, Call.Factory factory, Converter<ResponseBody, ResponseT> converter) {
        this.f93237a = fVar;
        this.f93238b = factory;
        this.f93239c = converter;
    }

    @Override // sn.g
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new retrofit2.d(this.f93237a, objArr, this.f93238b, this.f93239c), objArr);
    }

    @Nullable
    public abstract Object c(retrofit2.d dVar, Object[] objArr);
}
