package com.adobe.marketing.mobile.services;

import androidx.webkit.ProxyConfig;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class NetworkService implements Networking {
    private static final String REQUEST_HEADER_KEY_LANGUAGE = "Accept-Language";
    private static final String REQUEST_HEADER_KEY_USER_AGENT = "User-Agent";
    private static final String TAG = "NetworkService";
    private static final int THREAD_POOL_CORE_SIZE = 0;
    private static final int THREAD_POOL_KEEP_ALIVE_TIME = 60;
    private static final int THREAD_POOL_MAXIMUM_SIZE = 32;
    private final ExecutorService executorService = new ThreadPoolExecutor(0, 32, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: Access modifiers changed from: private */
    public HttpConnecting doConnection(NetworkRequest networkRequest) {
        HttpConnecting httpConnectingConnect = null;
        if (networkRequest.getUrl() == null || !networkRequest.getUrl().contains(ProxyConfig.MATCH_HTTPS)) {
            MobileCore.log(LoggingMode.DEBUG, TAG, String.format("Invalid URL (%s), only HTTPS protocol is supported", networkRequest.getUrl()));
            return null;
        }
        Map<String, String> defaultHeaders = getDefaultHeaders();
        if (networkRequest.getHeaders() != null) {
            defaultHeaders.putAll(networkRequest.getHeaders());
        }
        try {
            URL url = new URL(networkRequest.getUrl());
            String protocol = url.getProtocol();
            if (protocol == null || !protocol.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                return null;
            }
            try {
                try {
                    HttpConnectionHandler httpConnectionHandler = new HttpConnectionHandler(url);
                    if (!httpConnectionHandler.setCommand(networkRequest.getMethod())) {
                        return null;
                    }
                    httpConnectionHandler.setRequestProperty(defaultHeaders);
                    httpConnectionHandler.setConnectTimeout(networkRequest.getConnectTimeout() * 1000);
                    httpConnectionHandler.setReadTimeout(networkRequest.getReadTimeout() * 1000);
                    httpConnectingConnect = httpConnectionHandler.connect(networkRequest.getBody());
                    return httpConnectingConnect;
                } catch (IOException e5) {
                    LoggingMode loggingMode = LoggingMode.DEBUG;
                    String str = TAG;
                    Object[] objArr = new Object[2];
                    objArr[0] = networkRequest.getUrl();
                    objArr[1] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    MobileCore.log(loggingMode, str, String.format("Could not create a connection to URL (%s) [%s]", objArr));
                    return null;
                }
            } catch (SecurityException e7) {
                LoggingMode loggingMode2 = LoggingMode.DEBUG;
                String str2 = TAG;
                Object[] objArr2 = new Object[2];
                objArr2[0] = networkRequest.getUrl();
                objArr2[1] = e7.getLocalizedMessage() != null ? e7.getLocalizedMessage() : e7.getMessage();
                MobileCore.log(loggingMode2, str2, String.format("Could not create a connection to URL (%s) [%s]", objArr2));
                return null;
            }
        } catch (MalformedURLException e10) {
            MobileCore.log(LoggingMode.DEBUG, TAG, String.format("Could not connect, invalid URL (%s) [%s]!!", networkRequest.getUrl(), e10));
            return httpConnectingConnect;
        }
    }

    private Map<String, String> getDefaultHeaders() {
        HashMap map = new HashMap();
        DeviceInforming deviceInfoService = ServiceProvider.getInstance().getDeviceInfoService();
        if (deviceInfoService == null) {
            return map;
        }
        String defaultUserAgent = deviceInfoService.getDefaultUserAgent();
        if (!isNullOrEmpty(defaultUserAgent)) {
            map.put(REQUEST_HEADER_KEY_USER_AGENT, defaultUserAgent);
        }
        String localeString = deviceInfoService.getLocaleString();
        if (!isNullOrEmpty(localeString)) {
            map.put(REQUEST_HEADER_KEY_LANGUAGE, localeString);
        }
        return map;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    @Override // com.adobe.marketing.mobile.services.Networking
    public void connectAsync(final NetworkRequest networkRequest, final NetworkCallback networkCallback) {
        try {
            this.executorService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.services.NetworkService.1
                @Override // java.lang.Runnable
                public void run() {
                    HttpConnecting httpConnectingDoConnection = NetworkService.this.doConnection(networkRequest);
                    NetworkCallback networkCallback2 = networkCallback;
                    if (networkCallback2 != null) {
                        networkCallback2.call(httpConnectingDoConnection);
                    } else if (httpConnectingDoConnection != null) {
                        httpConnectingDoConnection.close();
                    }
                }
            });
        } catch (Exception e5) {
            LoggingMode loggingMode = LoggingMode.WARNING;
            String str = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = networkRequest.getUrl();
            objArr[1] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
            MobileCore.log(loggingMode, str, String.format("Failed to send request for (%s) [%s]", objArr));
            if (networkCallback != null) {
                networkCallback.call(null);
            }
        }
    }
}
