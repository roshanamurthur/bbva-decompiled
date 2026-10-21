package retrofit2;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\b\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\tH\u0086\b¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00060\rj\u0002`\u000eH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"await", ExifInterface.GPS_DIRECTION_TRUE, "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 1, 15})
@JvmName(name = "KotlinExtensions")
public final class KotlinExtensions {

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Call f93008p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Call call) {
            super(1);
            this.f93008p0 = call;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f93008p0.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Call f93012p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Call call) {
            super(1);
            this.f93012p0 = call;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f93012p0.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    public static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Call f93013p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Call call) {
            super(1);
            this.f93013p0 = call;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f93013p0.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation f93014p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Exception f93015q0;

        public d(Exception exc, e eVar) {
            this.f93014p0 = eVar;
            this.f93015q0 = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f93014p0);
            Result.Companion companion = Result.INSTANCE;
            continuationIntercepted.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(this.f93015q0)));
        }
    }

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f93016p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f93017q0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f93016p0 = obj;
            this.f93017q0 |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    @Nullable
    public static final <T> Object await(@NotNull Call<T> call, @NotNull Continuation<? super T> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new a(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t10) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                boolean zIsSuccessful = response.isSuccessful();
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                if (!zIsSuccessful) {
                    HttpException httpException = new HttpException(response);
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(httpException)));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    cancellableContinuation.resumeWith(Result.m5535constructorimpl(tBody));
                    return;
                }
                Object objTag = call2.request().tag(Invocation.class);
                if (objTag == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(objTag, "call.request().tag(Invocation::class.java)!!");
                Method method = ((Invocation) objTag).method();
                StringBuilder sb2 = new StringBuilder("Response from ");
                Intrinsics.checkExpressionValueIsNotNull(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                sb2.append(declaringClass.getName());
                sb2.append('.');
                sb2.append(method.getName());
                sb2.append(" was null but response body type was declared as non-null");
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @JvmName(name = "awaitNullable")
    @Nullable
    public static final <T> Object awaitNullable(@NotNull Call<T> call, @NotNull Continuation<? super T> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new b(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t10) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                boolean zIsSuccessful = response.isSuccessful();
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                if (zIsSuccessful) {
                    cancellableContinuation.resumeWith(Result.m5535constructorimpl(response.body()));
                    return;
                }
                HttpException httpException = new HttpException(response);
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(httpException)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public static final <T> Object awaitResponse(@NotNull Call<T> call, @NotNull Continuation<? super Response<T>> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new c(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t10) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(response));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ <T> T create(@NotNull Retrofit retrofit) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) retrofit.create(Object.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object suspendAndThrow(@NotNull Exception exc, @NotNull Continuation<?> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f93017q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f93017q0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f93016p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f93017q0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            eVar.getClass();
            eVar.f93017q0 = 1;
            Dispatchers.getDefault().mo6007dispatch(eVar.getContext(), new d(exc, eVar));
            Object coroutine_suspended2 = ek.a.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended2 == ek.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(eVar);
            }
            if (coroutine_suspended2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
