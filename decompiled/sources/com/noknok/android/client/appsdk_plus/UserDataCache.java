package com.noknok.android.client.appsdk_plus;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.common.DeviceIDUtil;
import com.noknok.android.client.appsdk.jsonapi.QuickData;
import com.noknok.android.client.utils.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class UserDataCache implements IOperationResultListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static UserDataCache f62964d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f62965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, UserData> f62966b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62967c;

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk_plus.UserDataCache$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62968a;

        static {
            int[] iArr = new int[OperationResultListener.ListenerOperationType.values().length];
            f62968a = iArr;
            try {
                iArr[OperationResultListener.ListenerOperationType.REG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62968a[OperationResultListener.ListenerOperationType.AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62968a[OperationResultListener.ListenerOperationType.LIST_REG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62968a[OperationResultListener.ListenerOperationType.DELETE_REG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum AuthenticatorAttachment {
        CROSS_PLATFORM,
        PLATFORM,
        UNKNOWN;

        public final String name = name().toLowerCase();

        AuthenticatorAttachment() {
        }

        public static String a(String str) {
            for (AuthenticatorAttachment authenticatorAttachment : Arrays.asList(CROSS_PLATFORM, PLATFORM)) {
                if (authenticatorAttachment.name.equals(str)) {
                    return authenticatorAttachment.name;
                }
            }
            return UNKNOWN.name;
        }
    }

    public static class Fido2Credential {
        public final String authenticatorAttachment;
        public final String handle;

        public Fido2Credential(String str, String str2) {
            this.handle = str;
            this.authenticatorAttachment = str2;
        }
    }

    public static class UserData {
        public String pushHandle;
        public JsonObject quickAuth;
        public String secondDeviceId;
        public ArrayList<Fido2Credential> fido2CredentialIds = new ArrayList<>();
        public HashSet<String> uafKeyIds = new HashSet<>();
    }

    private UserDataCache(Context context) {
        this.f62965a = context.getSharedPreferences("nnl.userDataCache", 0);
        this.f62967c = new DeviceIDUtil(context).getDeviceId();
    }

    private String a(String str) {
        Charset charset = Charsets.utf8Charset;
        JsonArray jsonArray = (JsonArray) new Gson().fromJson(new String(Base64.decode(str.getBytes(charset), 8), charset), JsonArray.class);
        if (jsonArray == null || jsonArray.size() != 3) {
            return null;
        }
        return jsonArray.get(2).getAsString();
    }

    private String b(String str) {
        if (str == null || str.isEmpty()) {
            str = AppSDKPlus.getActiveUser();
        }
        return String.format("%s.%s", "nnl.userDataCache", str);
    }

    private UserData c(String str) {
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        UserData userData = new UserData();
        Iterator<JsonElement> it = asJsonObject.getAsJsonArray("fido2CredentialIds").iterator();
        while (it.hasNext()) {
            userData.fido2CredentialIds.add(new Fido2Credential(it.next().getAsString(), AuthenticatorAttachment.UNKNOWN.name));
        }
        Iterator<JsonElement> it2 = asJsonObject.getAsJsonArray("uafKeyIds").iterator();
        while (it2.hasNext()) {
            userData.uafKeyIds.add(it2.next().getAsString());
        }
        if (asJsonObject.get("secondDevice") != null) {
            userData.secondDeviceId = asJsonObject.get("secondDevice").getAsString();
        }
        if (asJsonObject.get("pushHandle") != null) {
            userData.pushHandle = asJsonObject.get("pushHandle").getAsString();
        }
        if (asJsonObject.get("quickAuth") != null) {
            userData.quickAuth = asJsonObject.get("quickAuth").getAsJsonObject();
        }
        return userData;
    }

    public static synchronized UserDataCache getInstance(Context context) {
        try {
            if (f62964d == null) {
                f62964d = new UserDataCache(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f62964d;
    }

    public String getQuickAuthData(String str, String str2) {
        UserData userDataC;
        String string = this.f62965a.getString(b(str), null);
        if (string == null) {
            return null;
        }
        try {
            userDataC = (UserData) new Gson().fromJson(string, UserData.class);
        } catch (JsonSyntaxException unused) {
            userDataC = c(string);
        }
        JsonObject jsonObject = userDataC.quickAuth;
        if (str2 == null) {
            str2 = "data";
        }
        if (jsonObject == null || !jsonObject.has(str2)) {
            return null;
        }
        return jsonObject.get(str2).getAsString();
    }

    public UserData getUserData(String str) {
        UserData userDataC;
        String strB = b(str);
        if (!this.f62966b.containsKey(strB)) {
            String string = this.f62965a.getString(strB, null);
            if (string == null) {
                userDataC = new UserData();
            } else {
                try {
                    userDataC = (UserData) new Gson().fromJson(string, UserData.class);
                } catch (JsonSyntaxException unused) {
                    userDataC = c(string);
                }
            }
            this.f62966b.put(strB, userDataC);
        }
        return this.f62966b.get(strB);
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onComplete(OperationResultListener.ListenerOperationType listenerOperationType, IOperationResultListener.OperationData operationData, HashMap<String, String> map) {
        String str;
        String strA;
        int i10 = AnonymousClass1.f62968a[listenerOperationType.ordinal()];
        if (i10 == 1) {
            String str2 = operationData.username;
            if (operationData.additionalInfo != null) {
                UserData userData = getUserData(str2);
                JsonArray asJsonArray = operationData.additionalInfo.getAsJsonArray("authenticatorsResult");
                if (asJsonArray != null) {
                    for (JsonElement jsonElement : asJsonArray) {
                        String str3 = operationData.protocolFamily;
                        if (str3 == null || !str3.equals(ProtocolType.FIDO2.protocolName())) {
                            userData.uafKeyIds.add(jsonElement.getAsJsonObject().get("handle").getAsString());
                        } else {
                            userData.fido2CredentialIds.add(new Fido2Credential(jsonElement.getAsJsonObject().get("handle").getAsString(), AuthenticatorAttachment.a(operationData.authenticatorAttachment)));
                        }
                    }
                }
                if (operationData.additionalInfo.get("secondDevice") != null) {
                    userData.secondDeviceId = operationData.additionalInfo.get("secondDevice").getAsString();
                }
                if (operationData.additionalInfo.get("pushHandle") != null) {
                    userData.pushHandle = operationData.additionalInfo.get("pushHandle").getAsString();
                }
                setUserData(str2, userData);
            }
        } else if (i10 == 2) {
            String str4 = operationData.username;
            if (operationData.additionalInfo != null && (str = operationData.protocolFamily) != null && str.equals(ProtocolType.FIDO2.protocolName())) {
                UserData userData2 = getUserData(str4);
                JsonArray asJsonArray2 = operationData.additionalInfo.getAsJsonArray("authenticatorsResult");
                if (asJsonArray2 != null) {
                    Iterator<JsonElement> it = asJsonArray2.iterator();
                    while (it.hasNext()) {
                        String asString = it.next().getAsJsonObject().get("handle").getAsString();
                        for (Fido2Credential fido2Credential : userData2.fido2CredentialIds) {
                            if (fido2Credential.handle.equals(asString)) {
                                userData2.fido2CredentialIds.remove(fido2Credential);
                                break;
                            }
                        }
                        userData2.fido2CredentialIds.add(new Fido2Credential(asString, AuthenticatorAttachment.a(operationData.authenticatorAttachment)));
                    }
                }
                setUserData(str4, userData2);
            }
        } else if (i10 == 3) {
            String str5 = operationData.username;
            if (operationData.registrations != null) {
                UserData userData3 = getUserData(str5);
                String str6 = operationData.protocolFamily;
                if (str6 == null || !str6.equals(ProtocolType.FIDO2.protocolName())) {
                    userData3.uafKeyIds = new HashSet<>();
                    for (int i11 = 0; i11 < operationData.registrations.length(); i11++) {
                        try {
                            JSONObject jSONObject = (JSONObject) operationData.registrations.get(i11);
                            try {
                                if (this.f62967c.equals(jSONObject.getString("id"))) {
                                    userData3.uafKeyIds.add(jSONObject.getString("handle"));
                                }
                            } catch (JSONException e5) {
                                throw new AppSDKException(ResultType.FAILURE, "Failed to cache user authenticators data", e5);
                            }
                        } catch (JSONException unused) {
                            throw new AppSDKException(ResultType.FAILURE, "Failed to cache user authenticators data");
                        }
                    }
                } else {
                    ArrayList<Fido2Credential> arrayList = new ArrayList<>();
                    for (int i12 = 0; i12 < operationData.registrations.length(); i12++) {
                        try {
                            JSONObject jSONObject2 = (JSONObject) operationData.registrations.get(i12);
                            try {
                                if (this.f62967c.equals(jSONObject2.getString("id"))) {
                                    Iterator<Fido2Credential> it2 = userData3.fido2CredentialIds.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            arrayList.add(new Fido2Credential(jSONObject2.getString("handle"), AuthenticatorAttachment.UNKNOWN.name));
                                            break;
                                        }
                                        Fido2Credential next = it2.next();
                                        if (next.handle.equals(jSONObject2.getString("handle"))) {
                                            arrayList.add(next);
                                            break;
                                        }
                                    }
                                }
                            } catch (JSONException e7) {
                                throw new AppSDKException(ResultType.FAILURE, "Failed to cache user authenticators data", e7);
                            }
                        } catch (JSONException unused2) {
                            throw new AppSDKException(ResultType.FAILURE, "Failed to cache user authenticators data");
                        }
                    }
                    userData3.fido2CredentialIds = arrayList;
                }
                setUserData(str5, userData3);
            }
        } else if (i10 == 4) {
            String str7 = operationData.username;
            UserData userData4 = getUserData(str7);
            String str8 = operationData.handle;
            if (str8 != null && !str8.isEmpty()) {
                for (Fido2Credential fido2Credential2 : userData4.fido2CredentialIds) {
                    if (fido2Credential2.handle.equals(operationData.handle)) {
                        userData4.fido2CredentialIds.remove(fido2Credential2);
                    }
                }
                userData4.uafKeyIds.remove(operationData.handle);
                strA = a(operationData.handle);
            } else if (operationData.quickData != null) {
                strA = ((QuickData) new Gson().fromJson(operationData.quickData, QuickData.class)).keyID;
            } else {
                userData4.fido2CredentialIds.clear();
                userData4.uafKeyIds.clear();
                strA = null;
            }
            JsonObject jsonObject = userData4.quickAuth;
            if (jsonObject != null) {
                if (strA != null) {
                    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                        if (((QuickData) new Gson().fromJson(entry.getValue().getAsString(), QuickData.class)).keyID.equals(strA)) {
                            userData4.quickAuth.remove(entry.getKey());
                            break;
                        }
                    }
                } else {
                    userData4.quickAuth = null;
                }
            }
            JsonObject jsonObject2 = userData4.quickAuth;
            operationData.quickData = jsonObject2 != null ? jsonObject2.toString() : null;
            setUserData(str7, userData4);
        }
        String json = operationData.quickData;
        if (json != null) {
            String str9 = operationData.username;
            String str10 = map.get(IAppSDKPlus.EXTRA_KEY_QUICK_AUTH_DATA_KEY_NAME);
            JsonObject jsonObject3 = operationData.additionalInfo;
            QuickData quickDataFromJson = QuickData.fromJson(json);
            if (quickDataFromJson == null || !quickDataFromJson.isNotEmpty()) {
                return;
            }
            UserData userData5 = getUserData(str9);
            if (userData5.quickAuth == null) {
                userData5.quickAuth = new JsonObject();
            }
            if (quickDataFromJson.aaid == null && quickDataFromJson.keyID == null && jsonObject3 != null && jsonObject3.has("authenticatorsResult") && jsonObject3.get("authenticatorsResult").getAsJsonArray().size() > 0) {
                quickDataFromJson.keyID = a(jsonObject3.get("authenticatorsResult").getAsJsonArray().get(0).getAsJsonObject().get("handle").getAsString());
                json = quickDataFromJson.toJson();
            }
            JsonObject jsonObject4 = userData5.quickAuth;
            if (str10 == null) {
                str10 = "data";
            }
            jsonObject4.addProperty(str10, json);
            setUserData(str9, userData5);
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public final /* synthetic */ void onSessionDataUpdated(SessionData sessionData) {
        a.a(this, sessionData);
    }

    public void setUserData(String str, UserData userData) {
        String strB = b(str);
        if (userData != null) {
            this.f62966b.put(strB, userData);
            this.f62965a.edit().putString(strB, new Gson().toJson(userData)).apply();
        } else {
            this.f62966b.remove(strB);
            this.f62965a.edit().remove(strB).apply();
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onFailure(OperationResultListener.ListenerOperationType listenerOperationType, RuntimeException runtimeException, HashMap<String, String> map) {
    }
}
