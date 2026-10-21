package com.bbva.tohu.android.core.impl;

import android.content.Context;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import com.bbva.network.impl.OkHttpNetworkWorker;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Armadillo401Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu400Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu403Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu404Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu406Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu409Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu412Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu423Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu428Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu429Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu500Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu503Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.managers.NetworkManagerUtil;
import com.bbva.tohu.android.core.response.backend.aso.AsoErrorResponse;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.core.utils.Serializer;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes6.dex */
public class HttpClientBbvaNetworkImpl {
    private static final String ASO_HEADER_AUTHENTICATION_DATA = "authenticationdata";
    private static final String ASO_HEADER_AUTHENTICATION_STATE = "authenticationstate";
    private static final String ASO_HEADER_AUTHENTICATION_TYPE = "authenticationtype";
    private static final long CONNECT_TIMEOUT_IN_MINUTES = 1;
    private static final long READ_TIMEOUT_IN_MINUTES = 1;
    private static final String TAG = "com.bbva.tohu.android.core.impl.HttpClientBbvaNetworkImpl";
    private static final long WRITE_TIMEOUT_IN_MINUTES = 1;
    private NetworkManagerUtil networkManagerUtil;
    private NetworkWorker networkWorker;
    private Serializer serializer;

    public HttpClientBbvaNetworkImpl(NetworkManagerUtil networkManagerUtil, Serializer serializer, Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.networkWorker = new OkHttpNetworkWorker(context, builder.connectTimeout(1L, timeUnit).readTimeout(1L, timeUnit).writeTimeout(1L, timeUnit).retryOnConnectionFailure(false).build());
        this.networkManagerUtil = networkManagerUtil;
        this.serializer = serializer;
    }

    private NetworkResponse doCall(NetworkRequest networkRequest) throws NetworkNotPresentException {
        if (!this.networkManagerUtil.isOnline()) {
            throw new NetworkNotPresentException();
        }
        try {
            LogTohu.d(TAG, "Call to: %s", networkRequest.getUrl());
            return this.networkWorker.execute(networkRequest);
        } catch (ConnectionException e5) {
            return e5.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
        } catch (NotConnectionAvailable e7) {
            e7.printStackTrace();
            throw new NetworkNotPresentException();
        }
    }

    private AsoErrorResponse getAsoErrorResponse(String str) {
        return (AsoErrorResponse) this.serializer.deserialize(str, AsoErrorResponse.class);
    }

    private boolean isAsoError(String str) {
        return str != null && str.contains("http-status") && str.contains("error-code");
    }

    private void validateArmadilloResponse(NetworkResponse networkResponse) throws TohuBackendException {
        LogTohu.d(TAG, "Armadillo return code: %d", Integer.valueOf(networkResponse.getCode()));
        if (isSuccessful(networkResponse.getCode())) {
            return;
        }
        int code = networkResponse.getCode();
        if (code == 401) {
            throw new Armadillo401Exception();
        }
        if (code == 404) {
            throw new Tohu404Exception();
        }
        throw new TohuBackendException("Unexpected status code from backend: " + networkResponse.getCode());
    }

    public NetworkResponse callArmadillo(NetworkRequest networkRequest) throws TohuBackendException, NetworkNotPresentException {
        NetworkResponse networkResponseDoCall = doCall(networkRequest);
        validateArmadilloResponse(networkResponseDoCall);
        return networkResponseDoCall;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> AsoResponse<T> callAso(NetworkRequest networkRequest, Type type) throws TohuBackendException, NetworkNotPresentException {
        try {
            NetworkResponse networkResponseDoCall = doCall(networkRequest);
            AsoResponse<T> asoResponse = (AsoResponse<T>) new AsoResponse();
            asoResponse.setResponseStatus(Integer.valueOf(networkResponseDoCall.getCode()));
            if (isSuccessful(networkResponseDoCall.getCode())) {
                asoResponse.setTohuResponse(this.serializer.deserialize(networkResponseDoCall.getBody().string(), type));
            } else {
                String strString = networkResponseDoCall.getBody().string();
                if (isAsoError(strString)) {
                    asoResponse.setAsoError(getAsoErrorResponse(strString));
                    asoResponse.setAuthenticationState(networkResponseDoCall.getHeader().get("authenticationstate"));
                    asoResponse.setAuthenticationData(networkResponseDoCall.getHeader().get("authenticationdata"));
                    asoResponse.setAuthenticationType(networkResponseDoCall.getHeader().get("authenticationtype"));
                } else {
                    validateResponse(networkResponseDoCall);
                }
            }
            return asoResponse;
        } catch (IOException e5) {
            throw new TohuBackendException(e5);
        }
    }

    public NetworkResponse callBackend(NetworkRequest networkRequest) throws TohuBackendException, NetworkNotPresentException, CryptoInitException {
        try {
            NetworkResponse networkResponseDoCall = doCall(networkRequest);
            validateResponse(networkResponseDoCall);
            return networkResponseDoCall;
        } catch (Tohu409Exception e5) {
            throw new CryptoInitException(e5);
        }
    }

    public boolean isSuccessful(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    public void validateResponse(NetworkResponse networkResponse) throws TohuBackendException {
        LogTohu.d(TAG, "Backend return code: %s", Integer.valueOf(networkResponse.getCode()));
        if (isSuccessful(networkResponse.getCode())) {
            return;
        }
        int code = networkResponse.getCode();
        if (code == 400) {
            throw new Tohu400Exception();
        }
        if (code == 401) {
            throw new Armadillo401Exception();
        }
        if (code == 403) {
            throw new Tohu403Exception();
        }
        if (code == 404) {
            throw new Tohu404Exception();
        }
        if (code == 406) {
            throw new Tohu406Exception();
        }
        if (code == 409) {
            throw new Tohu409Exception();
        }
        if (code == 412) {
            throw new Tohu412Exception();
        }
        if (code == 423) {
            throw new Tohu423Exception();
        }
        if (code == 500) {
            throw new Tohu500Exception();
        }
        if (code == 503) {
            throw new Tohu503Exception();
        }
        if (code == 428) {
            throw new Tohu428Exception(networkResponse.getHeader().get(IAppSDKPlus.EXTRA_KEY_NONCE));
        }
        if (code == 429) {
            throw new Tohu429Exception();
        }
        throw new TohuBackendException("Unexpected status code from backend: " + networkResponse.getCode());
    }
}
