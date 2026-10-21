package okhttp3.internal.platform.android;

import android.util.Log;
import bk.q;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes12.dex */
@SuppressSignatureCheck
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\r\u001a\u00020\t¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "", "loggerName", "", "logLevel", "message", "", "t", "", "androidLog$okhttp", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "androidLog", EnableHandler.ID, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class AndroidLog {

    @NotNull
    public static final AndroidLog INSTANCE = new AndroidLog();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArraySet<Logger> f86061a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f86062b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r3 = OkHttpClient.class.getPackage();
        String name = r3 != null ? r3.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f86062b = q.toMap(linkedHashMap);
    }

    public final void androidLog$okhttp(@NotNull String loggerName, int logLevel, @NotNull String message, @Nullable Throwable t10) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strTake = f86062b.get(loggerName);
        if (strTake == null) {
            strTake = StringsKt___StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(strTake, logLevel)) {
            if (t10 != null) {
                message = message + '\n' + Log.getStackTraceString(t10);
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i10, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i10 + WearableStatusCodes.TARGET_NODE_NOT_CONNECTED);
                    String strSubstring = message.substring(i10, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(logLevel, strTake, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : f86062b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f86061a.add(logger)) {
                logger.setUseParentHandlers(false);
                logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                logger.addHandler(AndroidLogHandler.INSTANCE);
            }
        }
    }
}
