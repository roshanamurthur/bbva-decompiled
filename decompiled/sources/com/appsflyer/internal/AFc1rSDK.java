package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u0000 \u00012\u00020\u0013:\u0001\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0003\u0010\rR\u0012\u0010\u0003\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\u0007\u001a\u00020\nX\u0007¢\u0006\u0006\n\u0004\b\t\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFc1rSDK;", "AFa1ySDK", "", "AFInAppEventType", "[B", "", "", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "Ljava/util/Map;", "values", "", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "()Z", "p0", "p1", "p2", "<init>", "([BLjava/util/Map;I)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFc1rSDK {

    @NotNull
    public byte[] AFInAppEventType;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> values;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    public int AFKeystoreWrapper;

    @NotNull
    public static String AFInAppEventParameterName = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    public AFc1rSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = bArr;
        this.values = map;
        this.AFKeystoreWrapper = i10;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0188  */
    @WorkerThread
    public final boolean AFInAppEventType() {
        String strJoinToString$default;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zAFKeystoreWrapper = false;
        HttpURLConnection httpURLConnection = null;
        try {
            String str = String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName());
            Intrinsics.checkNotNullExpressionValue(str, "");
            Intrinsics.checkNotNullParameter(str, "");
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection2.setRequestMethod("POST");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(httpURLConnection2.getRequestMethod());
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(httpURLConnection2.getURL());
                StringBuilder sb3 = new StringBuilder(sb2.toString());
                sb3.append("\n length: ");
                sb3.append(new String(this.AFInAppEventType, Charsets.UTF_8).length());
                Map<String, String> map = this.values;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        sb3.append("\n ");
                        sb3.append(entry.getKey());
                        sb3.append(": ");
                        sb3.append(entry.getValue());
                    }
                }
                StringBuilder sb4 = new StringBuilder("HTTP: [");
                sb4.append(httpURLConnection2.hashCode());
                sb4.append("] ");
                sb4.append((Object) sb3);
                String string = sb4.toString();
                Intrinsics.checkNotNullParameter(string, "");
                AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(string)));
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setReadTimeout(this.AFKeystoreWrapper);
                httpURLConnection2.setConnectTimeout(this.AFKeystoreWrapper);
                httpURLConnection2.addRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json");
                Map<String, String> map2 = this.values;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        httpURLConnection2.addRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                }
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(this.AFInAppEventType.length));
                try {
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    Intrinsics.checkNotNullExpressionValue(outputStream, "");
                    BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
                    bufferedOutputStream.write(this.AFInAppEventType);
                    bufferedOutputStream.close();
                    InputStream inputStream = AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(httpURLConnection2) ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                    if (inputStream != null) {
                        Intrinsics.checkNotNullExpressionValue(inputStream, "");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                        strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), null, null, null, 0, null, null, 63, null);
                        bufferedReader.close();
                        if (strJoinToString$default == null) {
                            strJoinToString$default = "";
                        }
                    } else {
                        strJoinToString$default = "";
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sb5 = new StringBuilder("response code:");
                    sb5.append(httpURLConnection2.getResponseCode());
                    sb5.append(' ');
                    sb5.append(httpURLConnection2.getResponseMessage());
                    sb5.append("\n\tbody:");
                    sb5.append(strJoinToString$default);
                    sb5.append("\n\ttook ");
                    sb5.append(jCurrentTimeMillis2);
                    sb5.append("ms");
                    String string2 = sb5.toString();
                    StringBuilder sb6 = new StringBuilder("HTTP: [");
                    sb6.append(httpURLConnection2.hashCode());
                    sb6.append("] ");
                    sb6.append(string2);
                    String string3 = sb6.toString();
                    Intrinsics.checkNotNullParameter(string3, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(string3)));
                    zAFKeystoreWrapper = AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(httpURLConnection2);
                    httpURLConnection2.disconnect();
                    return zAFKeystoreWrapper;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                try {
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sb7 = new StringBuilder("error: ");
                    sb7.append(th);
                    sb7.append("\n\ttook ");
                    sb7.append(jCurrentTimeMillis3);
                    sb7.append("ms\n\t");
                    sb7.append(th.getMessage());
                    String string4 = sb7.toString();
                    StringBuilder sb8 = new StringBuilder("HTTP: [");
                    sb8.append(httpURLConnection != null ? httpURLConnection.hashCode() : 0);
                    sb8.append("] ");
                    sb8.append(string4);
                    String string5 = sb8.toString();
                    Intrinsics.checkNotNullParameter(string5, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(string5)));
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
