package com.noknok.android.client.appsdk_plus;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.OperationType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.Logger;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class QRCodeSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SessionData f62939a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f62941c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppSDKPlus f62946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RestResponse.ModeResult f62947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppSDK2.Operation f62948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f62949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f62950l;
    private final IRestClient m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap<String, String> f62951n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthenticationData f62940b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Semaphore f62942d = new Semaphore(0, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppSDKException f62943e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f62944f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62945g = false;

    public interface IOnQRPendingListener {
        boolean isCanceled();

        void onPending(JsonObject jsonObject);
    }

    public QRCodeSession(AppSDKPlus appSDKPlus, SessionData sessionData, RestResponse.ModeResult modeResult, AppSDK2.Operation operation, String str, String str2, IRestClient iRestClient, HashMap<String, String> map) {
        this.f62946h = appSDKPlus;
        this.f62947i = modeResult;
        this.f62948j = operation;
        this.f62939a = sessionData;
        this.f62950l = str2;
        this.f62949k = str;
        this.m = iRestClient;
        this.f62951n = map;
    }

    public void cancelWait() {
        try {
            if (this.f62941c != null) {
                this.f62944f = true;
                RestResponse.fromJSON(this.m.sendRequest(new RestRequest().setOperation(OperationType.valueOf("CANCEL_STATUS_" + this.f62948j.name())).setOobStatusHandle(this.f62949k).toJSON(), new RestParams().setServerUrl(this.f62950l).setSessionData(this.f62939a).setSessionKeys(this.f62946h.mSessionKeys)));
            }
        } catch (AppSDKException e5) {
            Logger.e("QRCodeSession", "Server Error", e5);
        }
    }

    public AuthenticationData getAuthenticationData() {
        return this.f62940b;
    }

    public Bitmap getBitmap() {
        byte[] bArrDecode = Base64.decode(this.f62947i.qrCode.qrImage, 0);
        if (bArrDecode == null) {
            throw new AppSDKException(ResultType.INVALID_QR);
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        if (bitmapDecodeByteArray != null) {
            return Bitmap.createScaledBitmap(bitmapDecodeByteArray, 600, 600, false);
        }
        throw new AppSDKException(ResultType.INVALID_QR, "Failed to create bitmap");
    }

    public RestResponse.ModeResult getModeResult() {
        return this.f62947i;
    }

    public void waitForResult(final IOnQRPendingListener iOnQRPendingListener) {
        final OperationResultListener.ListenerOperationType listenerOperationType = this.f62948j.equals(AppSDK2.Operation.OOB_AUTH) ? OperationResultListener.ListenerOperationType.AUTH : OperationResultListener.ListenerOperationType.REG;
        Timer timer = new Timer();
        this.f62941c = timer;
        timer.schedule(new TimerTask() { // from class: com.noknok.android.client.appsdk_plus.QRCodeSession.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    try {
                        if (iOnQRPendingListener.isCanceled()) {
                            QRCodeSession.this.cancelWait();
                        }
                        QRCodeSession qRCodeSession = QRCodeSession.this;
                        if (qRCodeSession.f62944f) {
                            qRCodeSession.f62944f = false;
                            throw new AppSDKException(ResultType.CANCELED);
                        }
                        RestResponse restResponseFromJSON = RestResponse.fromJSON(QRCodeSession.this.m.sendRequest(new RestRequest().setOperation(OperationType.valueOf("STATUS_" + QRCodeSession.this.f62948j.name())).setOobStatusHandle(QRCodeSession.this.f62949k).toJSON(), new RestParams().setServerUrl(QRCodeSession.this.f62950l).setSessionData(QRCodeSession.this.f62939a).setSessionKeys(QRCodeSession.this.f62946h.mSessionKeys)));
                        if (restResponseFromJSON.statusCode == null) {
                            Logger.e("QRCodeSession", "Server Error");
                            throw new AppSDKException(ResultType.SERVER_ERROR);
                        }
                        String str = restResponseFromJSON.id;
                        if (str != null && str.startsWith("CANCEL_STATUS")) {
                            throw new AppSDKException(ResultType.CANCELED);
                        }
                        ResultType resultType = restResponseFromJSON.getResultType();
                        if (resultType != ResultType.SUCCESS) {
                            Logger.e("QRCodeSession", "Server Error: " + restResponseFromJSON.statusCode);
                            throw new AppSDKException(resultType);
                        }
                        if (restResponseFromJSON.statusCode.equals(RestResponse.UAF_IN_PROGRESS_STATUS_CODE)) {
                            QRCodeSession qRCodeSession2 = QRCodeSession.this;
                            if (qRCodeSession2.f62945g) {
                                return;
                            }
                            qRCodeSession2.f62945g = true;
                            iOnQRPendingListener.onPending(restResponseFromJSON.additionalInfo);
                            return;
                        }
                        if (restResponseFromJSON.statusCode.equals(RestResponse.UAF_PENDING_STATUS_CODE)) {
                            return;
                        }
                        QRCodeSession.this.f62940b = new AuthenticationData();
                        AuthenticationData authenticationData = QRCodeSession.this.f62940b;
                        authenticationData.sessionData = restResponseFromJSON.sessionData;
                        authenticationData.additionalInfo = restResponseFromJSON.additionalInfo;
                        IOperationResultListener.OperationData operationData = new IOperationResultListener.OperationData();
                        if (restResponseFromJSON.userName != null) {
                            QRCodeSession.this.f62940b.profileData = new HashMap<>();
                            QRCodeSession.this.f62940b.profileData.put("userName", restResponseFromJSON.userName);
                            operationData.username = restResponseFromJSON.userName;
                        }
                        operationData.additionalInfo = new JsonObject();
                        JsonObject jsonObject = restResponseFromJSON.push;
                        if (jsonObject != null && jsonObject.get("pushHandle") != null) {
                            operationData.additionalInfo.add("pushHandle", restResponseFromJSON.push.get("pushHandle"));
                        }
                        JsonObject jsonObject2 = restResponseFromJSON.additionalInfo;
                        if (jsonObject2 != null && jsonObject2.get(Constants.device) != null && restResponseFromJSON.additionalInfo.get(Constants.device).getAsJsonObject().get("id") != null) {
                            operationData.additionalInfo.add("secondDevice", restResponseFromJSON.additionalInfo.get(Constants.device).getAsJsonObject().get("id"));
                        }
                        OperationResultListener.getInstance(QRCodeSession.this.f62946h.mContext).onComplete(listenerOperationType, operationData, QRCodeSession.this.f62951n);
                        QRCodeSession.this.f62941c.cancel();
                        QRCodeSession.this.f62942d.release();
                    } catch (AppSDKException e5) {
                        JsonObject additionalData = e5.getAdditionalData();
                        if (additionalData == null) {
                            additionalData = new JsonObject();
                        }
                        additionalData.addProperty(AppSDKException.KEY_OPERATION_TYPE, QRCodeSession.this.f62948j.name());
                        e5.setAdditionalData(additionalData);
                        OperationResultListener.getInstance(QRCodeSession.this.f62946h.mContext).onFailure(listenerOperationType, e5, QRCodeSession.this.f62951n);
                        if (e5.getMessage() != null) {
                            Logger.e("QRCodeSession", e5.getMessage(), e5);
                        }
                        QRCodeSession qRCodeSession3 = QRCodeSession.this;
                        qRCodeSession3.f62943e = e5;
                        qRCodeSession3.f62941c.cancel();
                        QRCodeSession.this.f62942d.release();
                    }
                } catch (Throwable th2) {
                    QRCodeSession.this.f62941c.cancel();
                    QRCodeSession.this.f62942d.release();
                    throw th2;
                }
            }
        }, 0L, 2000L);
        try {
            if (!this.f62942d.tryAcquire(150L, TimeUnit.SECONDS)) {
                this.f62941c.cancel();
                Logger.e("QRCodeSession", "QR Code scanning timed out.");
                throw new AppSDKException(ResultType.CANCELED);
            }
        } catch (InterruptedException e5) {
            Logger.e("QRCodeSession", "Failed to try acquire a semaphore ", e5);
        }
        AppSDKException appSDKException = this.f62943e;
        if (appSDKException != null) {
            throw appSDKException;
        }
    }
}
