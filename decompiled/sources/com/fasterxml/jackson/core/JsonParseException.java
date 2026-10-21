package com.fasterxml.jackson.core;

import androidx.camera.core.processing.f;
import com.fasterxml.jackson.core.util.RequestPayload;

/* JADX INFO: loaded from: classes9.dex */
public class JsonParseException extends JsonProcessingException {
    protected transient JsonParser _processor;
    protected RequestPayload _requestPayload;

    @Deprecated
    public JsonParseException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        StringBuilder sbE = f.e(message, "\nRequest payload : ");
        sbE.append(this._requestPayload.toString());
        return sbE.toString();
    }

    public RequestPayload getRequestPayload() {
        return this._requestPayload;
    }

    public String getRequestPayloadAsString() {
        RequestPayload requestPayload = this._requestPayload;
        if (requestPayload != null) {
            return requestPayload.toString();
        }
        return null;
    }

    public JsonParseException withParser(JsonParser jsonParser) {
        this._processor = jsonParser;
        return this;
    }

    public JsonParseException withRequestPayload(RequestPayload requestPayload) {
        this._requestPayload = requestPayload;
        return this;
    }

    @Deprecated
    public JsonParseException(String str, JsonLocation jsonLocation, Throwable th2) {
        super(str, jsonLocation, th2);
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public JsonParser getProcessor() {
        return this._processor;
    }

    public JsonParseException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation());
        this._processor = jsonParser;
    }

    public JsonParseException(JsonParser jsonParser, String str, Throwable th2) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation(), th2);
        this._processor = jsonParser;
    }

    public JsonParseException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = jsonParser;
    }

    public JsonParseException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Throwable th2) {
        super(str, jsonLocation, th2);
        this._processor = jsonParser;
    }
}
