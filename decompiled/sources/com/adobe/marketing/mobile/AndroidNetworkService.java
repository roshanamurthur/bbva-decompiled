package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.services.HttpConnecting;
import com.adobe.marketing.mobile.services.HttpMethod;
import com.adobe.marketing.mobile.services.NetworkCallback;
import com.adobe.marketing.mobile.services.NetworkRequest;
import com.adobe.marketing.mobile.services.Networking;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
class AndroidNetworkService implements NetworkService {
    private static final String TAG = "AndroidNetworkService";
    private final Networking newNetworkService;

    public AndroidNetworkService(Networking networking) {
        this.newNetworkService = networking;
    }

    private HttpMethod convert(NetworkService.HttpCommand httpCommand) {
        return httpCommand == NetworkService.HttpCommand.POST ? HttpMethod.POST : HttpMethod.GET;
    }

    @Override // com.adobe.marketing.mobile.NetworkService
    public NetworkService.HttpConnection connectUrl(String str, NetworkService.HttpCommand httpCommand, byte[] bArr, Map<String, String> map, int i10, int i11) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HttpConnecting[] httpConnectingArr = new HttpConnecting[1];
        this.newNetworkService.connectAsync(new NetworkRequest(str, convert(httpCommand), bArr, map, i10, i11), new NetworkCallback() { // from class: com.adobe.marketing.mobile.AndroidNetworkService.1
            @Override // com.adobe.marketing.mobile.services.NetworkCallback
            public void call(HttpConnecting httpConnecting) {
                httpConnectingArr[0] = httpConnecting;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            return new AndroidHttpConnection(httpConnectingArr[0]);
        } catch (IllegalArgumentException e5) {
            Log.warning(TAG, "Connection failure (%s)", e5);
            return null;
        } catch (InterruptedException e7) {
            Log.warning(TAG, "Connection failure (%s)", e7);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.NetworkService
    public void connectUrlAsync(final String str, final NetworkService.HttpCommand httpCommand, final byte[] bArr, final Map<String, String> map, final int i10, final int i11, final NetworkService.Callback callback) {
        new Thread(new Runnable() { // from class: com.adobe.marketing.mobile.AndroidNetworkService.2
            @Override // java.lang.Runnable
            public void run() {
                NetworkService.HttpConnection httpConnectionConnectUrl = AndroidNetworkService.this.connectUrl(str, httpCommand, bArr, map, i10, i11);
                NetworkService.Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.call(httpConnectionConnectUrl);
                } else if (httpConnectionConnectUrl != null) {
                    httpConnectionConnectUrl.close();
                }
            }
        }).start();
    }
}
