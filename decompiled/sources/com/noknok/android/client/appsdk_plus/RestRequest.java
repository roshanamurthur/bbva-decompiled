package com.noknok.android.client.appsdk_plus;

import androidx.annotation.NonNull;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.OperationType;
import com.noknok.android.client.appsdk.ResultType;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class RestRequest implements Cloneable {

    @Expose
    public String additionalData;

    @Expose
    public App app;

    @Expose
    public String authenticatorName;

    @Expose
    public Device device;

    @Expose
    public String displayName;

    @Expose
    public String handle;
    public String id;

    @Expose
    public String message;

    @Expose
    public Integer needDetails;

    @Expose
    public String nnlData;

    @Expose
    public OobMode oobMode;

    @Expose
    public String oobRefId;

    @Expose
    public String oobStatusHandle;

    @Expose
    public OperationType operation;

    @Expose
    public JsonObject optionsData;

    @Expose
    public String protocolFamily;

    @Expose
    public JsonArray regData;

    @Expose
    public Map<String, String> sessionData;

    @Expose
    public Transaction transaction;

    @Expose
    public String userName;

    public static class App {

        @Expose
        public String name;
    }

    public static class Device {

        @Expose
        public String id;
    }

    public static class OobMode {

        @Expose
        public boolean qr;

        @Expose
        public AppSDKPlus.QRType qrType;

        @Expose
        public boolean rawData;

        @Expose
        public String webUrl;
    }

    public static class Transaction {

        @Expose
        public String id;
    }

    public static RestRequest fromJSON(JsonObject jsonObject) {
        try {
            return (RestRequest) new GsonBuilder().registerTypeAdapter(SessionData.class, new SessionDataDeserializer()).create().fromJson((JsonElement) jsonObject, RestRequest.class);
        } catch (JsonParseException e5) {
            throw new AppSDKException(ResultType.FAILURE, e5);
        }
    }

    public RestRequest setAdditionalData(String str) {
        this.additionalData = str;
        return this;
    }

    public RestRequest setAppName(String str) {
        if (str != null) {
            App app = new App();
            this.app = app;
            app.name = str;
        }
        return this;
    }

    public RestRequest setAuthenticatorName(String str) {
        this.authenticatorName = str;
        return this;
    }

    public RestRequest setCorrelationId(String str) {
        this.id = str;
        return this;
    }

    public RestRequest setDeviceId(String str) {
        if (str != null) {
            Device device = new Device();
            this.device = device;
            device.id = str;
        }
        return this;
    }

    public RestRequest setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public RestRequest setHandle(String str) {
        this.handle = str;
        return this;
    }

    public RestRequest setNeedDetails(Integer num) {
        this.needDetails = num;
        return this;
    }

    public RestRequest setNnlData(String str) {
        this.nnlData = str;
        return this;
    }

    public RestRequest setOobMode(boolean z10, AppSDKPlus.QRType qRType, String str, boolean z11) {
        OobMode oobMode = new OobMode();
        this.oobMode = oobMode;
        oobMode.qr = z10;
        oobMode.qrType = qRType;
        oobMode.webUrl = str;
        oobMode.rawData = z11;
        return this;
    }

    public RestRequest setOobRefId(String str) {
        this.oobRefId = str;
        return this;
    }

    public RestRequest setOobStatusHandle(String str) {
        this.oobStatusHandle = str;
        return this;
    }

    public RestRequest setOperation(OperationType operationType) {
        this.operation = operationType;
        return this;
    }

    public RestRequest setOptionsData(JsonObject jsonObject) {
        this.optionsData = jsonObject;
        return this;
    }

    public RestRequest setProtocolFamily(String str) {
        this.protocolFamily = str;
        return this;
    }

    public RestRequest setRegData(JsonArray jsonArray) {
        this.regData = jsonArray;
        return this;
    }

    public RestRequest setRequest(String str) {
        if (str == null) {
            throw new AppSDKException(ResultType.FAILURE);
        }
        this.message = str;
        return this;
    }

    public RestRequest setTransactionId(String str) {
        if (str != null) {
            Transaction transaction = new Transaction();
            this.transaction = transaction;
            transaction.id = str;
        }
        return this;
    }

    public JsonObject toJSON() {
        try {
            return new GsonBuilder().registerTypeAdapter(SessionData.class, new SessionDataSerializer()).create().toJsonTree(this, RestRequest.class).getAsJsonObject();
        } catch (JsonParseException e5) {
            throw new AppSDKException(ResultType.FAILURE, e5);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RestRequest m5298clone() {
        try {
            return (RestRequest) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AppSDKException(ResultType.FAILURE, e5);
        }
    }
}
