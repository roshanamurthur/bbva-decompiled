package com.bbva.glomohybrid.interceptors;

import androidx.camera.camera2.internal.compat.u;
import bk.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoggingInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/interceptors/LoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "interceptorName", "<init>", "(Ljava/lang/String;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoggingInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggingInterceptor.kt\ncom/bbva/glomohybrid/interceptors/LoggingInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1#2:131\n1747#3,3:132\n*S KotlinDebug\n*F\n+ 1 LoggingInterceptor.kt\ncom/bbva/glomohybrid/interceptors/LoggingInterceptor\n*L\n127#1:132,3\n*E\n"})
public final class LoggingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32513a = "LoggingInterceptor";

    /* JADX WARN: Multi-variable type inference failed */
    public LoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static void a(Request request, String str, Response response, String str2, double d2) {
        boolean z10;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(String.format(u.f(request.method(), " %s in %.1fms %n------ Request ---------------------------------- %n%s"), Arrays.copyOf(new Object[]{request.url(), Double.valueOf(d2), request.headers()}, 3)), "format(...)");
        if (str != null) {
            String f85562i = request.url().getF85562i();
            List<String> exclude_info_service = LoggingInterceptorConstants.INSTANCE.getEXCLUDE_INFO_SERVICE();
            if (!(exclude_info_service instanceof Collection) || !exclude_info_service.isEmpty()) {
                Iterator<T> it = exclude_info_service.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    } else if (StringsKt__StringsKt.contains$default((CharSequence) f85562i, (CharSequence) it.next(), false, 2, (Object) null)) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            if (!z10) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("Body request content: %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            }
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(String.format("------ Response -------------------------------- %nResponse: %d %n%s", Arrays.copyOf(new Object[]{Integer.valueOf(response.code()), response.headers()}, 2)), "format(...)");
        if (str2 != null) {
            Intrinsics.checkNotNullExpressionValue(String.format("Body response content: %s", Arrays.copyOf(new Object[]{str2}, 1)), "format(...)");
        }
    }

    public static String b(Request request) {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Request requestBuild = request.newBuilder().build();
            Buffer buffer = new Buffer();
            RequestBody requestBodyBody = requestBuild.body();
            if (requestBodyBody != null) {
                requestBodyBody.writeTo(buffer);
            }
            objM5535constructorimpl = Result.m5535constructorimpl(buffer.readUtf8());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = "There was a problem obtaining the request body.";
        }
        return (String) objM5535constructorimpl;
    }

    public static String c(LoggingInterceptor loggingInterceptor, Response response) {
        String strType;
        Object objM5535constructorimpl;
        BufferedSource f85884s0;
        MediaType f85678q0;
        List listListOf = d.listOf("multipart");
        loggingInterceptor.getClass();
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null || (f85678q0 = responseBodyBody.getF85678q0()) == null || (strType = f85678q0.type()) == null) {
            strType = "";
        }
        boolean zContains = listListOf.contains(strType);
        String utf8 = null;
        if (zContains) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ResponseBody responseBodyBody2 = response.body();
            if (responseBodyBody2 != null && (f85884s0 = responseBodyBody2.getF85884s0()) != null) {
                f85884s0.request(Long.MAX_VALUE);
                utf8 = f85884s0.getBuffer().clone().readUtf8();
            }
            objM5535constructorimpl = Result.m5535constructorimpl(utf8);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = "There was a problem obtaining the response body.";
        }
        return (String) objM5535constructorimpl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        long jNanoTime = System.nanoTime();
        Response responseProceed = chain.proceed(request);
        double dNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0d;
        String strMethod = request.method();
        switch (strMethod) {
            case "GET":
                a(request, null, responseProceed, c(this, responseProceed), dNanoTime);
            case "PUT":
            case "POST":
                a(request, b(request), responseProceed, c(this, responseProceed), dNanoTime);
            case "DELETE":
                a(request, b(request), responseProceed, null, dNanoTime);
            default:
                if (strMethod.equals("GET")) {
                    a(request, null, responseProceed, c(this, responseProceed), dNanoTime);
                }
                return responseProceed;
        }
    }

    public LoggingInterceptor(@NotNull String interceptorName) {
        Intrinsics.checkNotNullParameter(interceptorName, "interceptorName");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoggingInterceptor(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            String TAG = f32513a;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            str = TAG;
        }
        this(str);
    }
}
