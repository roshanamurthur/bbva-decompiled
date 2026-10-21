package com.noknok.android.client.appsdk_plus.registration;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ExtensionList;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AuthenticationData;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.noknok.android.client.appsdk_plus.R;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.BaseTask;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class AddFidoRegistrationTask extends BaseTask<ActivityProxy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FidoRegistrationController f63062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IFidoRegistrationLiveData f63063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FidoMethod f63064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IAppSDKPlus f63065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SessionData f63066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, String> f63067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IFidoRegistrationListener f63068g;

    public AddFidoRegistrationTask(SessionData sessionData, IAppSDKPlus iAppSDKPlus, FidoRegistrationController fidoRegistrationController, IFidoRegistrationLiveData iFidoRegistrationLiveData, FidoMethod fidoMethod, HashMap<String, String> map, IFidoRegistrationListener iFidoRegistrationListener) {
        this.f63065d = iAppSDKPlus;
        this.f63066e = sessionData;
        this.f63062a = fidoRegistrationController;
        this.f63063b = iFidoRegistrationLiveData;
        this.f63064c = fidoMethod;
        this.f63067f = map == null ? new HashMap<>() : map;
        this.f63068g = iFidoRegistrationListener;
    }

    private JsonObject a() {
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        String str = this.f63064c.mAaid;
        if (str != null) {
            jsonArray.add(str);
            jsonObject.add("criteria", jsonArray);
            jsonObject2.addProperty("id", ExtensionManager.FILTER_CHAIN_EXT_ID);
        }
        if (this.f63064c.isFido2()) {
            jsonArray.add(this.f63064c.mAuthenticatorAttachment);
            jsonObject.add("authenticatorAttachment", jsonArray);
            jsonObject2.addProperty("id", ExtensionManager.FILTER_CHAIN_FIDO2_EXT_ID);
        }
        jsonObject2.addProperty("data", jsonObject.toString());
        jsonObject2.addProperty(ExtensionList.EXTENSION_FAIL_IF_UNKNOWN_KEY, Boolean.FALSE);
        return jsonObject2;
    }

    private HashMap<String, String> b() {
        JsonArray jsonArray = new JsonArray();
        HashMap<String, String> map = new HashMap<>();
        if (this.f63067f.size() == 0) {
            jsonArray.add(a());
            map.put(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, jsonArray.toString());
            return map;
        }
        boolean z10 = false;
        for (String str : this.f63067f.keySet()) {
            if (str.equals(IAppSDKPlus.EXTRA_KEY_EXTENSIONS)) {
                String str2 = this.f63067f.get(IAppSDKPlus.EXTRA_KEY_EXTENSIONS);
                if (str2 != null) {
                    JsonArray jsonArray2 = (JsonArray) JsonParser.parseString(str2);
                    for (int i10 = 0; i10 < jsonArray2.size(); i10++) {
                        String asString = jsonArray2.get(i10).getAsJsonObject().get("id").getAsString();
                        if (asString != null && asString.equals(ExtensionManager.FILTER_CHAIN_EXT_ID)) {
                            jsonArray2.set(i10, a());
                            z10 = true;
                        }
                        jsonArray.add(jsonArray2.get(i10));
                    }
                    if (!z10) {
                        jsonArray2.add(a());
                        z10 = true;
                    }
                }
                map.put(str, jsonArray.toString());
            } else {
                map.put(str, this.f63067f.get(str));
            }
        }
        if (!z10) {
            jsonArray.add(a());
            map.put(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, jsonArray.toString());
        }
        return map;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        try {
            try {
                if (activityProxyArr.length == 0 || !activityProxy.hasActivity()) {
                    throw new AppSDKException(ResultType.FAILURE, "Activity does not provided");
                }
                AuthenticationData authenticationDataRegister = this.f63065d.register(activityProxy, this.f63066e, b());
                if (!authenticationDataRegister.isPlatformAuthenticator && "true".equals(this.f63067f.get(IAppSDKPlus.EXTRA_KEY_ASK_CREDENTIAL_NAME))) {
                    Iterator<JsonElement> it = authenticationDataRegister.additionalInfo.get("authenticatorsResult").getAsJsonArray().iterator();
                    this.f63063b.askCredentialName(it.hasNext() ? it.next().getAsJsonObject().get("handle").getAsString() : null, UiConfig.getText(activityProxy.getApplicationContext(), UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_REGISTER_SECURITY_KEY_TITLE, R.string.nnl_register_security_key_title));
                }
                FidoRegistrationController fidoRegistrationController = this.f63062a;
                IFidoRegistrationLiveData iFidoRegistrationLiveData = this.f63063b;
                fidoRegistrationController.getClass();
                iFidoRegistrationLiveData.onOperationCompleted(ResultType.SUCCESS, null);
                IFidoRegistrationListener iFidoRegistrationListener = this.f63068g;
                if (iFidoRegistrationListener != null) {
                    iFidoRegistrationListener.onRegisterCompleted(authenticationDataRegister);
                }
                activityProxy.finish();
            } catch (AppSDKException e5) {
                FidoRegistrationController fidoRegistrationController2 = this.f63062a;
                IFidoRegistrationLiveData iFidoRegistrationLiveData2 = this.f63063b;
                fidoRegistrationController2.getClass();
                iFidoRegistrationLiveData2.onOperationCompleted(e5.getResultType(), e5.getResultType().getRegErrorMessage(activityProxy.getApplicationContext()));
                IFidoRegistrationListener iFidoRegistrationListener2 = this.f63068g;
                if (iFidoRegistrationListener2 != null) {
                    iFidoRegistrationListener2.onRegisterFailed(e5.getResultType());
                }
            }
        } catch (Throwable th2) {
            activityProxy.finish();
            throw th2;
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        FidoRegistrationController fidoRegistrationController = this.f63062a;
        IFidoRegistrationLiveData iFidoRegistrationLiveData = this.f63063b;
        ResultType resultType = ResultType.FAILURE;
        AppSDKException appSDKException = new AppSDKException(resultType, runtimeException);
        fidoRegistrationController.getClass();
        iFidoRegistrationLiveData.onOperationCompleted(appSDKException.getResultType(), appSDKException.getResultType().getRegErrorMessage(activityProxy.getApplicationContext()));
        IFidoRegistrationListener iFidoRegistrationListener = this.f63068g;
        if (iFidoRegistrationListener != null) {
            iFidoRegistrationListener.onRegisterFailed(resultType);
        }
    }
}
