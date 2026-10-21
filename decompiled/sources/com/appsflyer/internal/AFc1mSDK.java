package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.ConstantsKt;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1mSDK {
    private final int AFInAppEventType;

    public AFc1mSDK(int i10) {
        this.AFInAppEventType = i10;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x023b  */
    public final AFc1gSDK<String> AFInAppEventType(AFb1ySDK aFb1ySDK) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrValues = aFb1ySDK.values();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFb1ySDK.values);
            sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            sb2.append(aFb1ySDK.AFInAppEventParameterName);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] bArrValues2 = aFb1ySDK.values();
            if (aFb1ySDK.valueOf() && bArrValues2 != null) {
                try {
                    String str = aFb1ySDK.AFInAppEventType() ? "<encrypted>" : new String(bArrValues2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Exception e5) {
                    e = e5;
                    httpURLConnection = null;
                    try {
                        AFc1lSDK aFc1lSDK = new AFc1lSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(e);
                        sb4.append("\n took ");
                        sb4.append(aFc1lSDK.AFInAppEventType);
                        sb4.append("ms");
                        String string = sb4.toString();
                        StringBuilder sb5 = new StringBuilder("HTTP: [");
                        sb5.append(aFb1ySDK.hashCode());
                        sb5.append("] ");
                        sb5.append(string);
                        AFLogger.afErrorLog(sb5.toString(), e, false, false);
                        throw new HttpException(e, aFc1lSDK);
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
            for (Map.Entry<String, String> entry : aFb1ySDK.AFInAppEventType.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("HTTP: [");
            sb6.append(aFb1ySDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.afDebugLog(sb6.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFb1ySDK.AFInAppEventParameterName).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFb1ySDK.values);
                if (aFb1ySDK.AFInAppEventParameterName()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFb1ySDK.afDebugLog()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i10 = this.AFInAppEventType;
                    int i11 = aFb1ySDK.afDebugLog;
                    if (i11 != -1) {
                        i10 = i11;
                    }
                    httpURLConnection2.setConnectTimeout(i10);
                    httpURLConnection2.setReadTimeout(i10);
                    httpURLConnection2.addRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, aFb1ySDK.AFInAppEventType() ? ConstantsKt.DEFAULT_MEDIATYPE : "application/json");
                    for (Map.Entry<String, String> entry2 : aFb1ySDK.AFInAppEventType.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    boolean z10 = true;
                    if (bArrValues != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(bArrValues.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(bArrValues);
                                bufferedOutputStream2.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream = null;
                        }
                    }
                    if (httpURLConnection2.getResponseCode() / 100 != 2) {
                        z10 = false;
                    }
                    String strAFInAppEventType = aFb1ySDK.AFKeystoreWrapper() ? AFInAppEventType(httpURLConnection2, z10) : "";
                    AFc1lSDK aFc1lSDK2 = new AFc1lSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb8 = new StringBuilder("response code:");
                    sb8.append(httpURLConnection2.getResponseCode());
                    sb8.append(" ");
                    sb8.append(httpURLConnection2.getResponseMessage());
                    sb8.append("\n body:");
                    sb8.append(strAFInAppEventType);
                    sb8.append("\n took ");
                    sb8.append(aFc1lSDK2.AFInAppEventType);
                    sb8.append("ms");
                    String string2 = sb8.toString();
                    StringBuilder sb9 = new StringBuilder("HTTP: [");
                    sb9.append(aFb1ySDK.hashCode());
                    sb9.append("] ");
                    sb9.append(string2);
                    AFLogger.afDebugLog(sb9.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFc1gSDK<String> aFc1gSDK = new AFc1gSDK<>(strAFInAppEventType, httpURLConnection2.getResponseCode(), z10, map, aFc1lSDK2);
                    httpURLConnection2.disconnect();
                    return aFc1gSDK;
                } catch (Exception e7) {
                    e = e7;
                    httpURLConnection = httpURLConnection2;
                    AFc1lSDK aFc1lSDK3 = new AFc1lSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb10 = new StringBuilder("error: ");
                    sb10.append(e);
                    sb10.append("\n took ");
                    sb10.append(aFc1lSDK3.AFInAppEventType);
                    sb10.append("ms");
                    String string3 = sb10.toString();
                    StringBuilder sb11 = new StringBuilder("HTTP: [");
                    sb11.append(aFb1ySDK.hashCode());
                    sb11.append("] ");
                    sb11.append(string3);
                    AFLogger.afErrorLog(sb11.toString(), e, false, false);
                    throw new HttpException(e, aFc1lSDK3);
                } catch (Throwable th6) {
                    th = th6;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e11) {
            e = e11;
            httpURLConnection = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }

    @NonNull
    private static String AFInAppEventType(HttpURLConnection httpURLConnection, boolean z10) throws Throwable {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            if (z10) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z11 = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            if (!z11) {
                                sb2.append('\n');
                            }
                            sb2.append(line);
                            z11 = false;
                        } else {
                            String string = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                    } catch (Throwable th2) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        throw th;
    }
}
