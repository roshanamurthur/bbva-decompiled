package bg;

import android.text.TextUtils;
import androidx.appcompat.widget.g0;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: DefaultSettingsSpiCall.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpRequestFactory f25205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f25206c;

    public a(String str, HttpRequestFactory httpRequestFactory) {
        Logger logger = Logger.getLogger();
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f25206c = logger;
        this.f25205b = httpRequestFactory;
        this.f25204a = str;
    }

    public static void a(HttpGetRequest httpGetRequest, d dVar) {
        b(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", dVar.f25207a);
        b(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        b(httpGetRequest, "Accept", "application/json");
        b(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", dVar.f25208b);
        b(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", dVar.f25209c);
        b(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", dVar.f25210d);
        b(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", dVar.f25211e.getInstallIds().getCrashlyticsInstallId());
    }

    public static void b(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }

    public static HashMap c(d dVar) {
        HashMap map = new HashMap();
        map.put("build_version", dVar.f25214h);
        map.put("display_version", dVar.f25213g);
        map.put("source", Integer.toString(dVar.f25215i));
        String str = dVar.f25212f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public final JSONObject d(HttpResponse httpResponse) {
        int iCode = httpResponse.code();
        String strC = g0.c("Settings response code was: ", iCode);
        Logger logger = this.f25206c;
        logger.v(strC);
        String str = this.f25204a;
        if (iCode != 200 && iCode != 201 && iCode != 202 && iCode != 203) {
            logger.e("Settings request failed; (status: " + iCode + ") from " + str);
            return null;
        }
        String strBody = httpResponse.body();
        try {
            return new JSONObject(strBody);
        } catch (Exception e5) {
            logger.w("Failed to parse settings JSON from " + str, e5);
            logger.w("Settings response " + strBody);
            return null;
        }
    }
}
