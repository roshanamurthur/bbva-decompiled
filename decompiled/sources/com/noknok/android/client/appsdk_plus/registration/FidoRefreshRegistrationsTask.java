package com.noknok.android.client.appsdk_plus.registration;

import android.content.Context;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.AuthenticationData;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.noknok.android.client.appsdk_plus.SessionData;
import com.noknok.android.client.appsdk_plus.UserDataCache;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.BaseTask;
import com.noknok.android.client.utils.Logger;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FidoRefreshRegistrationsTask extends BaseTask<ActivityProxy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IFidoRegistrationLiveData f63076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IAppSDKPlus f63077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SessionData f63078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, String> f63079d;

    public FidoRefreshRegistrationsTask(SessionData sessionData, IAppSDKPlus iAppSDKPlus, IFidoRegistrationLiveData iFidoRegistrationLiveData, HashMap<String, String> map) {
        this.f63077b = iAppSDKPlus;
        this.f63078c = sessionData;
        this.f63076a = iFidoRegistrationLiveData;
        this.f63079d = map == null ? new HashMap<>() : map;
    }

    private List<FidoMethod> a(Context context, JsonObject jsonObject) {
        if (!jsonObject.has(Constants.authenticators)) {
            return null;
        }
        JsonArray asJsonArray = jsonObject.getAsJsonArray(Constants.authenticators);
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : asJsonArray) {
            FidoMethod fidoMethod = new FidoMethod();
            if (jsonElement.getAsJsonObject().has("authenticatorAttachment")) {
                fidoMethod.mTitle = jsonElement.getAsJsonObject().get("description").getAsString();
                String asString = jsonElement.getAsJsonObject().get("authenticatorAttachment").getAsString();
                fidoMethod.mAuthenticatorAttachment = asString;
                fidoMethod.mIsRegPossible = true;
                if (asString.equals(k.a.f65035b)) {
                    for (UserDataCache.Fido2Credential fido2Credential : UserDataCache.getInstance(context).getUserData(AppSDKPlus.getActiveUser()).fido2CredentialIds) {
                        if (fido2Credential.authenticatorAttachment.equals(k.a.f65035b)) {
                            fidoMethod.mFido2CredentialId = fido2Credential.handle;
                            fidoMethod.mIsRegPossible = false;
                            break;
                        }
                    }
                }
            } else {
                fidoMethod.mTitle = jsonElement.getAsJsonObject().get("title").getAsString();
                fidoMethod.mAaid = jsonElement.getAsJsonObject().get("aaid").getAsString();
                fidoMethod.mIcon = jsonElement.getAsJsonObject().get("icon").getAsString();
                fidoMethod.mIsRegPossible = jsonElement.getAsJsonObject().get("isAllowed").getAsBoolean();
            }
            arrayList.add(fidoMethod);
        }
        return arrayList;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(ActivityProxy... activityProxyArr) {
        ActivityProxy activityProxy = activityProxyArr[0];
        try {
            try {
                AuthenticationData authenticationDataCheckRegPossible = this.f63077b.checkRegPossible(activityProxy, this.f63078c, this.f63079d);
                if (authenticationDataCheckRegPossible != null && authenticationDataCheckRegPossible.additionalInfo != null) {
                    this.f63076a.setMethods(a(activityProxy.getApplicationContext(), new Gson().toJsonTree(authenticationDataCheckRegPossible.additionalInfo).getAsJsonObject()), ResultType.SUCCESS, null);
                    activityProxy.finish();
                    return;
                }
            } catch (AppSDKException e5) {
                JsonObject additionalData = e5.getAdditionalData();
                if (additionalData != null) {
                    this.f63076a.setMethods(a(activityProxy.getApplicationContext(), additionalData), e5.getResultType(), e5.getResultType().getErrorMessage(activityProxy.getApplicationContext()));
                    activityProxy.finish();
                    return;
                }
            }
            activityProxy.finish();
            this.f63076a.setMethods(new ArrayList(), ResultType.SUCCESS, null);
        } catch (Throwable th2) {
            activityProxy.finish();
            throw th2;
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, ActivityProxy... activityProxyArr) {
        Logger.w("FidoRefreshRegistrationsTask", "Failed to get available Fido methods list", runtimeException);
    }
}
