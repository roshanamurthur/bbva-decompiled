package com.noknok.android.passportsdksvc;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.AppSdkPlusConfig;
import com.noknok.android.client.appsdk_plus.AppSdkPlusJson;
import com.noknok.android.client.appsdk_plus.AuthenticationData;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.ActivityTracker;
import com.noknok.android.client.utils.IntentQueue;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.util.List;
import org.fidoalliance.intent.api.UAFAppIntentExtras;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PassportSDKIntentActivity extends Activity {
    public static final String ADDITIONAL_DATA = "additionalData";
    public static final String INFO_LIST = "infoList";
    public static final String PASSPORT_SDK_PARAMS = "passportsdkparams";
    public static final String PROFILE_DATA = "profileData";
    public static final String RESULT_TYPE = "ResultType";
    public static final String SESSION_DATA = "sessionData";
    public static final String UAF_PROTOCOL_MESSAGE = "uafProtocolMessage";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63514a;

    /* JADX INFO: renamed from: com.noknok.android.passportsdksvc.PassportSDKIntentActivity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63515a;

        static {
            int[] iArr = new int[AppSdkPlusJson.Method.values().length];
            f63515a = iArr;
            try {
                iArr[AppSdkPlusJson.Method.register.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.checkRegPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.authenticate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.checkAuthPossible.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.transact.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.checkTransPossible.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.deregister.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.update.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.clearLocalRegistrations.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63515a[AppSdkPlusJson.Method.hasPlatformAuthenticator.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class PassportAPIProcessorTask extends AsyncTask<ActivityProxy, Void, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f63516a;

        public PassportAPIProcessorTask(int i10) {
            String str = PassportSDKIntentActivity.PASSPORT_SDK_PARAMS;
            Logger.i("PassportSDKIntentActivity", "PassportAPIProcessorTask: PassportAPIProcessorTask");
            this.f63516a = i10;
        }

        @Override // android.os.AsyncTask
        public String doInBackground(ActivityProxy... activityProxyArr) {
            ResultType resultType;
            SessionData sessionData;
            JsonObject jsonObject;
            String str = PassportSDKIntentActivity.PASSPORT_SDK_PARAMS;
            Logger.i("PassportSDKIntentActivity", "PassportAPIProcessorTask: doInBackground");
            ActivityProxy activityProxy = activityProxyArr[0];
            JSONObject jSONObject = new JSONObject();
            ResultType resultType2 = ResultType.SUCCESS;
            try {
                try {
                    String stringExtra = activityProxy.getIntent().getStringExtra("passportsdkparams");
                    Logger.i("PassportSDKIntentActivity", String.format("Incoming passport JSON: %s", stringExtra));
                    AppSdkPlusJson appSdkPlusJsonDeserialize = AppSdkPlusJson.deserialize(stringExtra);
                    if (appSdkPlusJsonDeserialize.method == null) {
                        throw new AppSDKException(ResultType.PROTOCOL_ERROR, "Unsupported method name provided");
                    }
                    AppSDKPlus appSDKPlus = new AppSDKPlus(new AppSdkPlusConfig(appSdkPlusJsonDeserialize.regServerURL, appSdkPlusJsonDeserialize.authServerURL, appSdkPlusJsonDeserialize.serverAdapter, true).setRemote(true).setProtocolType(appSdkPlusJsonDeserialize.protocolType), activityProxy.getApplicationContext());
                    List<String> list = appSdkPlusJsonDeserialize.sessionKeys;
                    if (list != null) {
                        appSDKPlus.setSessionKeys(list);
                    }
                    appSDKPlus.setSendDiscoveryInfo(appSdkPlusJsonDeserialize.sendDiscoveryInfo);
                    switch (AnonymousClass1.f63515a[appSdkPlusJsonDeserialize.method.ordinal()]) {
                        case 1:
                            AuthenticationData authenticationDataRegister = appSDKPlus.register(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.extras);
                            if (authenticationDataRegister != null && (sessionData = authenticationDataRegister.sessionData) != null) {
                                jSONObject.put(PassportSDKIntentActivity.SESSION_DATA, sessionData.getMap());
                            }
                            break;
                        case 2:
                            AuthenticationData authenticationDataCheckRegPossible = appSDKPlus.checkRegPossible(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.extras);
                            if (authenticationDataCheckRegPossible != null && (jsonObject = authenticationDataCheckRegPossible.additionalInfo) != null) {
                                jSONObject.put(PassportSDKIntentActivity.ADDITIONAL_DATA, jsonObject);
                            }
                            break;
                        case 3:
                            AuthenticationData authenticationDataAuthenticate = appSDKPlus.authenticate(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.extras);
                            jSONObject.put(PassportSDKIntentActivity.SESSION_DATA, new JSONObject(authenticationDataAuthenticate.sessionData.getMap()));
                            if (authenticationDataAuthenticate.profileData != null) {
                                jSONObject.put(PassportSDKIntentActivity.PROFILE_DATA, new JSONObject(authenticationDataAuthenticate.profileData));
                            }
                            break;
                        case 4:
                            String str2 = appSdkPlusJsonDeserialize.appIDUrl;
                            if (str2 != null) {
                                appSDKPlus.checkAuthPossible(activityProxy, str2, appSdkPlusJsonDeserialize.policy);
                            } else {
                                appSDKPlus.checkAuthPossible(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.extras);
                            }
                            break;
                        case 5:
                            AuthenticationData authenticationDataTransact = appSDKPlus.transact(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.transactionID, appSdkPlusJsonDeserialize.extras);
                            jSONObject.put(PassportSDKIntentActivity.SESSION_DATA, new JSONObject(authenticationDataTransact.sessionData.getMap()));
                            if (authenticationDataTransact.profileData != null) {
                                jSONObject.put(PassportSDKIntentActivity.PROFILE_DATA, new JSONObject(authenticationDataTransact.profileData));
                            }
                            break;
                        case 6:
                            appSDKPlus.checkTransPossible(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.transactionID, appSdkPlusJsonDeserialize.extras);
                            break;
                        case 7:
                            appSDKPlus.deleteRegistration(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.jsonRegAuthrInfo.getString("handle"), appSdkPlusJsonDeserialize.extras);
                            break;
                        case 8:
                            appSDKPlus.updateRegistration(activityProxy, appSdkPlusJsonDeserialize.sessionData, appSdkPlusJsonDeserialize.jsonRegAuthrInfo.getString("handle"), appSdkPlusJsonDeserialize.regData, appSdkPlusJsonDeserialize.extras);
                            break;
                        case 9:
                            appSDKPlus.clearLocalRegistrations(activityProxy, appSdkPlusJsonDeserialize.appIDUrl, appSdkPlusJsonDeserialize.aaid);
                            break;
                        case 10:
                            appSDKPlus.hasPlatformAuthenticator(activityProxy);
                            break;
                        default:
                            resultType2 = ResultType.PROTOCOL_ERROR;
                            break;
                    }
                    activityProxy.finish();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject.put(PassportSDKIntentActivity.RESULT_TYPE, resultType2.toString());
                        jSONObject2.put(PassportSDKIntentActivity.UAF_PROTOCOL_MESSAGE, jSONObject.toString());
                        jSONObject2.put(PassportSDKIntentActivity.ADDITIONAL_DATA, "");
                        return jSONObject2.toString();
                    } catch (JSONException e5) {
                        String str3 = PassportSDKIntentActivity.PASSPORT_SDK_PARAMS;
                        Logger.e("PassportSDKIntentActivity", "Exception during PassportAPIProcessorTask JSON encoding", e5);
                        return "";
                    }
                } catch (AppSDKException e7) {
                    String str4 = PassportSDKIntentActivity.PASSPORT_SDK_PARAMS;
                    Logger.e("PassportSDKIntentActivity", "Problem during passport message processing", e7);
                    resultType = e7.getResultType();
                    resultType2 = resultType;
                    activityProxy.finish();
                } catch (RuntimeException e10) {
                    String str5 = PassportSDKIntentActivity.PASSPORT_SDK_PARAMS;
                    Logger.e("PassportSDKIntentActivity", "passport message processing failed due to RuntimeException", e10);
                    resultType = ResultType.FAILURE;
                    resultType2 = resultType;
                    activityProxy.finish();
                } catch (JSONException e11) {
                    String str6 = PassportSDKIntentActivity.PASSPORT_SDK_PARAMS;
                    Logger.e("PassportSDKIntentActivity", "Problem parsing passport message", e11);
                    resultType = ResultType.FAILURE;
                    resultType2 = resultType;
                    activityProxy.finish();
                }
            } catch (Throwable th2) {
                activityProxy.finish();
                throw th2;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            String str2 = PassportSDKIntentActivity.PASSPORT_SDK_PARAMS;
            Logger.i("PassportSDKIntentActivity", "PassportAPIProcessorTask: onPostExecute");
            IntentQueue.finishRequest();
            Intent intent = new Intent();
            intent.putExtra("message", str);
            intent.putExtra(UAFAppIntentExtras.IEN_COMPONENT_NAME, "com.noknok.android.passport2");
            intent.putExtra("errorCode", Outcome.SUCCESS.getUafErrorCode());
            intent.putExtra(UAFAppIntentExtras.IEN_UAF_INTENT_TYPE, "UAF_OPERATION_RESULT");
            ActivityTracker.getActivityTracker().updateActivity(this.f63516a, new ActivityTracker.SetResultUpdater(-1, intent));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Logger.i("PassportSDKIntentActivity", "onCreate");
        super.onCreate(bundle);
        if (bundle != null) {
            this.f63514a = bundle.getInt("activityId");
            ActivityTracker.getActivityTracker().onCreateActivity(this.f63514a, this);
        } else {
            this.f63514a = ActivityTracker.getActivityTracker().generateActivityId();
            ActivityTracker.getActivityTracker().onCreateActivity(this.f63514a, this);
            IntentQueue.startRequest();
            new PassportAPIProcessorTask(this.f63514a).executeOnExecutor(IntentQueue.getExecutor(), ActivityProxy.createFromActivity(this));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityTracker.getActivityTracker().onDestroyActivity(this.f63514a);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activityId", this.f63514a);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
