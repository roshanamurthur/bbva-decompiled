package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.services.DeviceInforming;
import com.adobe.marketing.mobile.services.HttpMethod;
import com.adobe.marketing.mobile.services.NetworkCallback;
import com.adobe.marketing.mobile.services.NetworkRequest;
import com.adobe.marketing.mobile.services.Networking;
import com.adobe.marketing.mobile.services.ServiceProvider;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidNetworkServiceOverrider {
    private static final Map<HttpMethod, String> HTTP_COMMAND_MAP;
    private static final String LOG_TAG = "AndroidNetworkServiceOverrider";
    private static final Networking defaultNetworkService;

    public interface Connecting extends NetworkService.HttpConnection {
    }

    public static abstract class HTTPConnectionPerformer {
        protected static final Connecting CONNECTION_ERROR_IO = new Connecting() { // from class: com.adobe.marketing.mobile.AndroidNetworkServiceOverrider.HTTPConnectionPerformer.1
            @Override // com.adobe.marketing.mobile.services.HttpConnecting
            public InputStream getErrorStream() {
                return null;
            }

            @Override // com.adobe.marketing.mobile.services.HttpConnecting
            public InputStream getInputStream() {
                return null;
            }

            @Override // com.adobe.marketing.mobile.services.HttpConnecting
            public int getResponseCode() {
                return -1;
            }

            @Override // com.adobe.marketing.mobile.services.HttpConnecting
            public String getResponseMessage() {
                return null;
            }

            @Override // com.adobe.marketing.mobile.services.HttpConnecting
            public String getResponsePropertyValue(String str) {
                return null;
            }

            @Override // com.adobe.marketing.mobile.services.HttpConnecting
            public void close() {
            }
        };
        protected static final Connecting CONNECTION_ERROR_URL = null;

        public abstract Connecting connect(String str, String str2, byte[] bArr, Map<String, String> map, int i10, int i11);

        public NetworkService.HttpConnection doConnection(String str, NetworkService.HttpCommand httpCommand, byte[] bArr, Map<String, String> map, int i10, int i11) {
            return connect(str, (String) AndroidNetworkServiceOverrider.HTTP_COMMAND_MAP.get(httpCommand), bArr, map, i10, i11);
        }

        public boolean shouldOverride(String str, String str2) {
            return true;
        }

        public final boolean shouldOverrideInternal(String str, NetworkService.HttpCommand httpCommand) {
            return shouldOverride(str, (String) AndroidNetworkServiceOverrider.HTTP_COMMAND_MAP.get(httpCommand));
        }
    }

    public static class NetworkServiceWrapper implements Networking {
        private static final String REQUEST_HEADER_KEY_LANGUAGE = "Accept-Language";
        private static final String REQUEST_HEADER_KEY_USER_AGENT = "User-Agent";
        private final Networking defaultNetworkService;
        private final ExecutorService executorService = Executors.newCachedThreadPool();
        private final HTTPConnectionPerformer performer;

        public NetworkServiceWrapper(HTTPConnectionPerformer hTTPConnectionPerformer, Networking networking) {
            this.performer = hTTPConnectionPerformer;
            this.defaultNetworkService = networking;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getDefaultHeaders() {
            DeviceInforming deviceInfoService = ServiceProvider.getInstance().getDeviceInfoService();
            HashMap map = new HashMap();
            if (deviceInfoService == null) {
                return map;
            }
            String defaultUserAgent = deviceInfoService.getDefaultUserAgent();
            if (!StringUtils.isNullOrEmpty(defaultUserAgent)) {
                map.put(REQUEST_HEADER_KEY_USER_AGENT, defaultUserAgent);
            }
            String localeString = deviceInfoService.getLocaleString();
            if (!StringUtils.isNullOrEmpty(localeString)) {
                map.put(REQUEST_HEADER_KEY_LANGUAGE, localeString);
            }
            return map;
        }

        @Override // com.adobe.marketing.mobile.services.Networking
        public void connectAsync(final NetworkRequest networkRequest, final NetworkCallback networkCallback) {
            HTTPConnectionPerformer hTTPConnectionPerformer = this.performer;
            if (hTTPConnectionPerformer != null && hTTPConnectionPerformer.shouldOverride(networkRequest.getUrl(), (String) AndroidNetworkServiceOverrider.HTTP_COMMAND_MAP.get(networkRequest.getMethod()))) {
                Log.trace(AndroidNetworkServiceOverrider.LOG_TAG, "Using network stack override for request to %s.", networkRequest.getUrl());
                this.executorService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.AndroidNetworkServiceOverrider.NetworkServiceWrapper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Map<String, String> defaultHeaders = NetworkServiceWrapper.this.getDefaultHeaders();
                        if (networkRequest.getHeaders() != null) {
                            defaultHeaders.putAll(networkRequest.getHeaders());
                        }
                        Connecting connectingConnect = NetworkServiceWrapper.this.performer.connect(networkRequest.getUrl(), (String) AndroidNetworkServiceOverrider.HTTP_COMMAND_MAP.get(networkRequest.getMethod()), networkRequest.getBody(), defaultHeaders, networkRequest.getConnectTimeout(), networkRequest.getReadTimeout());
                        NetworkCallback networkCallback2 = networkCallback;
                        if (networkCallback2 != null) {
                            networkCallback2.call(connectingConnect);
                        }
                    }
                });
            } else {
                Networking networking = this.defaultNetworkService;
                if (networking != null) {
                    networking.connectAsync(networkRequest, networkCallback);
                }
            }
        }
    }

    static {
        HashMap map = new HashMap();
        HTTP_COMMAND_MAP = map;
        map.put(HttpMethod.GET, "GET");
        map.put(HttpMethod.POST, "POST");
        defaultNetworkService = ServiceProvider.getInstance().getNetworkService();
    }

    public static void setHTTPConnectionPerformer(HTTPConnectionPerformer hTTPConnectionPerformer) {
        if (hTTPConnectionPerformer != null) {
            Log.debug(LOG_TAG, "Enabling network override provided by class: %s", hTTPConnectionPerformer.getClass().getName());
        } else {
            Log.debug(LOG_TAG, "Network override disabled, default connection interface restored.", new Object[0]);
        }
        ServiceProvider.getInstance().setNetworkService(new NetworkServiceWrapper(hTTPConnectionPerformer, defaultNetworkService));
    }
}
