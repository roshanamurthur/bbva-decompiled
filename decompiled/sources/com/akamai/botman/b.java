package com.akamai.botman;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.akamai.botman.d.a;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f26314a = new b();

    public interface a {
        void a();

        void a(JSONObject jSONObject);
    }

    public static b a() {
        return f26314a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public static void a(Application application, String str, int i10, a aVar) {
        String str2;
        try {
            f fVar = new f(application, null);
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendPath("_bm");
            builderBuildUpon.appendPath("get_params");
            StringBuilder sb2 = new StringBuilder("type=");
            if (i10 == 0) {
                str2 = "sdk-pow";
            } else if (i10 == 1) {
                str2 = "sdk-cca";
            } else if (i10 == 2) {
                str2 = "sdk-dci";
            } else if (i10 == 3) {
                str2 = "sdk-pow,sdk-dci";
            } else if (i10 == 4) {
                str2 = "sdk-cca,sdk-dci";
            } else {
                str2 = "sdk-pow";
            }
            sb2.append(str2);
            builderBuildUpon.encodedQuery(sb2.toString());
            builderBuildUpon.appendQueryParameter("starttime", fVar.startTime());
            builderBuildUpon.appendQueryParameter("systemVersion", fVar.systemVersion());
            builderBuildUpon.appendQueryParameter("model", fVar.model());
            builderBuildUpon.appendQueryParameter("deviceHardwareType", fVar.hardWareType());
            builderBuildUpon.appendQueryParameter("appIdentifier", fVar.appIdentifier());
            builderBuildUpon.appendQueryParameter("deviceId", fVar.androidId());
            String string = builderBuildUpon.toString();
            d dVar = new d();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            dVar.f26318b = executorServiceNewSingleThreadExecutor;
            dVar.f26319c = new Handler(Looper.getMainLooper());
            dVar.f26317a = aVar;
            try {
                executorServiceNewSingleThreadExecutor.execute(dVar.new a(new URL(string)));
            } catch (Exception e5) {
                ap.c("CYFNetworkServiceTask", "Exception:".concat(String.valueOf(e5)), new Throwable[0]);
                dVar.a(null);
            }
        } catch (Exception unused) {
            aVar.a();
        }
    }
}
