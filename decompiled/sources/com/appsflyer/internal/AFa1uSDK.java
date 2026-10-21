package com.appsflyer.internal;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.ConstantsKt;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class AFa1uSDK {
    private final AFb1wSDK AFInAppEventParameterName;
    private final AFe1fSDK values;

    public interface AFa1xSDK {
        void AFInAppEventParameterName(String str);

        void AFInAppEventType(@Nullable String str, @Nullable String str2, @Nullable String str3);
    }

    public AFa1uSDK() {
    }

    public AFa1uSDK(AFe1fSDK aFe1fSDK, AFb1wSDK aFb1wSDK) {
        this.values = aFe1fSDK;
        this.AFInAppEventParameterName = aFb1wSDK;
    }

    public final HttpURLConnection AFInAppEventType(String str) {
        HttpURLConnection httpURLConnection;
        AFe1fSDK aFe1fSDK = this.values;
        String str2 = aFe1fSDK.afInfoLog;
        String string = AFa1rSDK.values((Map<String, ?>) aFe1fSDK.AFInAppEventType()).toString();
        boolean zAfWarnLog = this.values.afWarnLog();
        boolean zAFVersionDeclaration = this.values.AFVersionDeclaration();
        boolean level = this.values.getLevel();
        boolean zAFKeystoreWrapper = this.values.AFKeystoreWrapper();
        String strAFInAppEventType = "";
        byte[] bytes = string.getBytes(Charset.defaultCharset());
        HttpURLConnection httpURLConnection2 = null;
        if (zAfWarnLog) {
            return null;
        }
        boolean z10 = true;
        try {
            URL url = new URL(str2);
            if (level) {
                this.AFInAppEventParameterName.valueOf(url.toString(), string);
                int length = string.getBytes(Charset.defaultCharset()).length;
                StringBuilder sb2 = new StringBuilder("call = ");
                sb2.append(url);
                sb2.append("; size = ");
                sb2.append(length);
                sb2.append(" byte");
                sb2.append(length > 1 ? "s" : "");
                sb2.append("; body = ");
                sb2.append(string);
                AFc1pSDK.AFKeystoreWrapper(sb2.toString());
            }
            TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, zAFKeystoreWrapper ? ConstantsKt.DEFAULT_MEDIATYPE : "application/json");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                if (zAFKeystoreWrapper) {
                    try {
                        try {
                            bytes = (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(36 - View.MeasureSpec.getMode(0), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'))).getDeclaredMethod(DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, byte[].class).invoke(((Class) AFa1wSDK.AFKeystoreWrapper(37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 37 - TextUtils.getCapsMode("", 0, 0), (char) ('0' - AndroidCharacter.getMirror('0')))).getMethod("AFInAppEventType", String.class).invoke(null, str), bytes);
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
                outputStream.write(bytes);
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                strAFInAppEventType = zAFVersionDeclaration ? AFa1dSDK.AFInAppEventType(httpURLConnection) : "";
                if (level) {
                    this.AFInAppEventParameterName.values(url.toString(), responseCode, strAFInAppEventType);
                }
                if (responseCode == 200) {
                    AFLogger.afInfoLog("Status 200 ok");
                    z10 = false;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection2 = httpURLConnection;
                AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(str2)), th);
                httpURLConnection = httpURLConnection2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        StringBuilder sb3 = new StringBuilder("Connection ");
        sb3.append(z10 ? "error" : "call succeeded");
        sb3.append(": ");
        sb3.append(strAFInAppEventType);
        AFLogger.afInfoLog(sb3.toString());
        return httpURLConnection;
    }
}
