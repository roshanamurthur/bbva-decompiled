package okhttp3.logging;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import bk.g;
import bk.w;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.l;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\n\"\u0004\b\u0007\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "", "name", "", "redactHeader", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "<set-?>", "c", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
public final class HttpLoggingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Logger f86154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public volatile Set<String> f86155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile Level level;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", ExpectedUserActionOnPoiTypes.NONE, "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
    public static final class Level {
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level BASIC;
        public static final Level BODY;
        public static final Level HEADERS;
        public static final Level NONE;

        static {
            Level level = new Level(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = level;
            Level level2 = new Level("BASIC", 1);
            BASIC = level2;
            Level level3 = new Level("HEADERS", 2);
            HEADERS = level3;
            Level level4 = new Level("BODY", 3);
            BODY = level4;
            $VALUES = new Level[]{level, level2, level3, level4};
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", LogKeysKt.LOG, "", "message", "", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f86157a;

        @JvmField
        @NotNull
        public static final Logger DEFAULT = new Companion.a();

        /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f86157a = new Companion();

            /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
            public static final class a implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void log(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }
        }

        void log(@NotNull String message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to var", replaceWith = @ReplaceWith(expression = "level", imports = {}))
    @JvmName(name = "-deprecated_level")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    public final void a(Headers headers, int i10) {
        String strValue = this.f86155b.contains(headers.name(i10)) ? "██" : headers.value(i10);
        this.f86154a.log(headers.name(i10) + ": " + strValue);
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0103 A[LOOP:0: B:43:0x0101->B:44:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws Exception {
        boolean z10;
        String str;
        String str2;
        Charset UTF_8;
        int size;
        int i10;
        Charset UTF_9;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z11 = level == Level.BODY;
        boolean z12 = z11 || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(request.url());
        String strD = "";
        sb2.append(connection != null ? " " + connection.protocol() : "");
        String string = sb2.toString();
        if (!z12 && requestBodyBody != null) {
            StringBuilder sbE = f.e(string, " (");
            sbE.append(requestBodyBody.contentLength());
            sbE.append("-byte body)");
            string = sbE.toString();
        }
        this.f86154a.log(string);
        String str3 = "-byte body omitted)";
        if (z12) {
            Headers headers = request.headers();
            z10 = z12;
            if (requestBodyBody != null) {
                MediaType f85648a = requestBodyBody.getF85648a();
                if (f85648a != null) {
                    str2 = " ";
                    if (headers.get(DigipassManagerConstants.KEY_CONTENT_TYPE) == null) {
                        this.f86154a.log("Content-Type: " + f85648a);
                    }
                } else {
                    str2 = " ";
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.f86154a.log("Content-Length: " + requestBodyBody.contentLength());
                }
                size = headers.size();
                for (i10 = 0; i10 < size; i10++) {
                    a(headers, i10);
                }
                if (z11 || requestBodyBody == null) {
                    str = str3;
                    this.f86154a.log("--> END " + request.method());
                } else {
                    String str4 = request.headers().get("Content-Encoding");
                    if (str4 != null && !l.equals(str4, "identity", true) && !l.equals(str4, "gzip", true)) {
                        this.f86154a.log("--> END " + request.method() + " (encoded body omitted)");
                    } else if (requestBodyBody.isDuplex()) {
                        this.f86154a.log("--> END " + request.method() + " (duplex request body omitted)");
                    } else if (requestBodyBody.isOneShot()) {
                        this.f86154a.log("--> END " + request.method() + " (one-shot body omitted)");
                    } else {
                        Buffer buffer = new Buffer();
                        requestBodyBody.writeTo(buffer);
                        MediaType f85648a2 = requestBodyBody.getF85648a();
                        if (f85648a2 == null || (UTF_9 = f85648a2.charset(StandardCharsets.UTF_8)) == null) {
                            UTF_9 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                        }
                        this.f86154a.log(strD);
                        if (Utf8Kt.isProbablyUtf8(buffer)) {
                            this.f86154a.log(buffer.readString(UTF_9));
                            this.f86154a.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                        } else {
                            Logger logger = this.f86154a;
                            StringBuilder sb3 = new StringBuilder("--> END ");
                            sb3.append(request.method());
                            sb3.append(" (binary ");
                            sb3.append(requestBodyBody.contentLength());
                            str = str3;
                            sb3.append(str);
                            logger.log(sb3.toString());
                        }
                    }
                    str = str3;
                }
            } else {
                str3 = "-byte body omitted)";
                str2 = " ";
            }
            size = headers.size();
            while (i10 < size) {
                a(headers, i10);
            }
            if (z11) {
                str = str3;
                this.f86154a.log("--> END " + request.method());
            } else {
                str = str3;
                this.f86154a.log("--> END " + request.method());
            }
        } else {
            z10 = z12;
            str = "-byte body omitted)";
            str2 = " ";
            strD = "";
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            Intrinsics.checkNotNull(responseBodyBody);
            long f85883r0 = responseBodyBody.getF85883r0();
            String str5 = f85883r0 != -1 ? f85883r0 + "-byte" : "unknown-length";
            Logger logger2 = this.f86154a;
            String str6 = str;
            StringBuilder sb4 = new StringBuilder("<-- ");
            sb4.append(responseProceed.code());
            if (responseProceed.message().length() != 0) {
                strD = f.d(str2, responseProceed.message());
            }
            sb4.append(strD);
            sb4.append(' ');
            sb4.append(responseProceed.request().url());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(!z10 ? h0.b(", ", str5, " body") : strD);
            sb4.append(RootService.CLOSE_BRACKET);
            logger2.log(sb4.toString());
            if (z10) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    a(headers2, i11);
                }
                if (z11 && HttpHeaders.promisesBody(responseProceed)) {
                    String str7 = responseProceed.headers().get("Content-Encoding");
                    if (str7 == null || l.equals(str7, "identity", true) || l.equals(str7, "gzip", true)) {
                        BufferedSource f85884s0 = responseBodyBody.getF85884s0();
                        f85884s0.request(Long.MAX_VALUE);
                        Buffer buffer2 = f85884s0.getBuffer();
                        Long l6 = null;
                        if (l.equals("gzip", headers2.get("Content-Encoding"), true)) {
                            Long lValueOf = Long.valueOf(buffer2.size());
                            GzipSource gzipSource = new GzipSource(buffer2.clone());
                            try {
                                buffer2 = new Buffer();
                                buffer2.writeAll(gzipSource);
                                CloseableKt.closeFinally(gzipSource, null);
                                l6 = lValueOf;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(gzipSource, th2);
                                    throw th3;
                                }
                            }
                        }
                        MediaType f85678q0 = responseBodyBody.getF85678q0();
                        if (f85678q0 == null || (UTF_8 = f85678q0.charset(StandardCharsets.UTF_8)) == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                        }
                        if (!Utf8Kt.isProbablyUtf8(buffer2)) {
                            this.f86154a.log(strD);
                            this.f86154a.log("<-- END HTTP (binary " + buffer2.size() + str6);
                            return responseProceed;
                        }
                        String str8 = strD;
                        if (f85883r0 != 0) {
                            this.f86154a.log(str8);
                            this.f86154a.log(buffer2.clone().readString(UTF_8));
                        }
                        if (l6 != null) {
                            this.f86154a.log("<-- END HTTP (" + buffer2.size() + "-byte, " + l6 + "-gzipped-byte body)");
                        } else {
                            this.f86154a.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                        }
                    } else {
                        this.f86154a.log("<-- END HTTP (encoded body omitted)");
                    }
                } else {
                    this.f86154a.log("<-- END HTTP");
                }
            }
            return responseProceed;
        } catch (Exception e5) {
            this.f86154a.log("<-- HTTP FAILED: " + e5);
            throw e5;
        }
    }

    @JvmName(name = "level")
    public final void level(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TreeSet treeSet = new TreeSet(l.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        g.addAll(treeSet, this.f86155b);
        treeSet.add(name);
        this.f86155b = treeSet;
    }

    @NotNull
    public final HttpLoggingInterceptor setLevel(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
        return this;
    }

    @JvmOverloads
    public HttpLoggingInterceptor(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f86154a = logger;
        this.f86155b = w.emptySet();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
