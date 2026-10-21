package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1lSDK extends AFd1uSDK<Map<String, Object>> {
    private static final int afRDLog = (int) TimeUnit.SECONDS.toMillis(2);
    private final Map<String, Object> AFLogger;
    private final List<String> AFVersionDeclaration;
    private final Context afDebugLog;
    private Map<String, Object> afErrorLog;
    private final Uri afInfoLog;

    public AFd1lSDK(@NonNull Context context, @NonNull Map<String, Object> map, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFd1vSDK.RESOLVE_ESP, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "ResolveEsp");
        this.afDebugLog = context;
        this.AFLogger = map;
        this.afInfoLog = uri;
        this.AFVersionDeclaration = list;
    }

    private static Map<String, Object> AFInAppEventParameterName(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i10 = afRDLog;
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.12.1");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th2) {
            map.put("error", th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
        return map;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    @NonNull
    public final AFd1ySDK values() throws Exception {
        if (!AFKeystoreWrapper(this.afInfoLog.toString())) {
            AFa1dSDK.valueOf().values(this.afDebugLog, this.AFLogger, this.afInfoLog);
            return AFd1ySDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.afInfoLog.toString();
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        int i10 = 0;
        String str = null;
        while (i10 < 5) {
            Map<String, Object> mapAFInAppEventParameterName = AFInAppEventParameterName(Uri.parse(string));
            String str2 = (String) mapAFInAppEventParameterName.get("res");
            Integer num2 = (Integer) mapAFInAppEventParameterName.get("status");
            String str3 = (String) mapAFInAppEventParameterName.get("error");
            if (str2 == null || !AFKeystoreWrapper(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i10 < 4) {
                arrayList.add(str2);
            }
            i10++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.AFLogger) {
            this.AFLogger.put("af_deeplink_r", map);
            this.AFLogger.put("af_deeplink", this.afInfoLog.toString());
        }
        AFa1dSDK.valueOf().values(this.afDebugLog, this.AFLogger, string != null ? Uri.parse(string) : this.afInfoLog);
        this.afErrorLog = map;
        return AFd1ySDK.SUCCESS;
    }

    private boolean AFKeystoreWrapper(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbD = ci.a.d("Validate if link ", str, " belongs to ESP domains: ");
        sbD.append(this.AFVersionDeclaration);
        AFLogger.afRDLog(sbD.toString());
        try {
            return this.AFVersionDeclaration.contains(new URL(str).getHost());
        } catch (MalformedURLException e5) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e5);
            return false;
        }
    }
}
