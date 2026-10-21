package com.noknok.android.client.appsdk_plus;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;

/* JADX INFO: loaded from: classes11.dex */
public class RestResponse {
    public static final String RULESET_VERIFICATION_EXCEPTION = "4403";
    public static final String SERVER_CANCELED = "4450";
    public static final String SERVER_REG_NOT_FOUND = "4400";
    public static final String SERVER_SECURITY_EXCEPTION = "4402";
    public static final String SERVER_SUCCESS = "4000";
    public static final String SERVER_SUCCESS_OPTIONAL_CHECK = "4002";
    public static final String SERVER_USER_NOT_FOUND = "4430";
    public static final String SERVER_UVI_NOT_MATCH = "4001";
    public static final String UAF_IN_PROGRESS_STATUS_CODE = "4005";
    public static final String UAF_PENDING_STATUS_CODE = "4004";

    @Expose
    public String additionalData;

    @Expose
    public JsonObject additionalErrorInfo;

    @Expose
    public JsonObject additionalInfo;

    @Expose
    public String id;

    @Expose
    public String message;

    @Expose
    public ModeResult modeResult;

    @Expose
    public String oobStatusHandle;

    @Expose
    public JsonArray pendingAuths;

    @Expose
    public JsonObject push;

    @Expose
    public JsonArray registrations;

    @Expose
    public String returnURL;

    @Expose
    public SessionData sessionData;

    @Expose
    public String statusCode;

    @Expose
    public String userName;

    public static class ModeResult {

        @Expose
        public QrCode qrCode;

        @Expose
        public String rawData;
    }

    public static class QrCode {

        @Expose
        public String qrImage;
    }

    public static RestResponse fromJSON(String str) {
        if (str.isEmpty()) {
            return new RestResponse();
        }
        try {
            return fromJSON(JsonParser.parseString(str).getAsJsonObject());
        } catch (JsonParseException e5) {
            throw new AppSDKException(ResultType.SERVER_ERROR, e5);
        }
    }

    public ResultType getResultType() {
        String str = this.statusCode;
        if (str != null) {
            switch (str) {
                case "4000":
                case "4002":
                case "4004":
                case "4005":
                    return ResultType.SUCCESS;
                case "4001":
                    return ResultType.SERVER_UVI_NOT_MATCH;
                case "4400":
                    return ResultType.SERVER_REG_NOT_FOUND;
                case "4403":
                    return ResultType.SERVER_VERIFICATION_ERROR;
                case "4430":
                    return ResultType.SERVER_USER_NOT_FOUND;
                case "4450":
                    return ResultType.CANCELED;
            }
        }
        return ResultType.SERVER_ERROR;
    }

    public JsonObject toJSON() {
        try {
            return new GsonBuilder().registerTypeAdapter(SessionData.class, new SessionDataSerializer()).create().toJsonTree(this, RestResponse.class).getAsJsonObject();
        } catch (JsonParseException e5) {
            throw new AppSDKException(ResultType.SERVER_ERROR, e5);
        }
    }

    public static RestResponse fromJSON(JsonObject jsonObject) {
        try {
            return (RestResponse) new GsonBuilder().registerTypeAdapter(SessionData.class, new SessionDataDeserializer()).create().fromJson((JsonElement) jsonObject, RestResponse.class);
        } catch (JsonParseException e5) {
            throw new AppSDKException(ResultType.INVALID_SERVER_RESPONSE, e5);
        }
    }
}
