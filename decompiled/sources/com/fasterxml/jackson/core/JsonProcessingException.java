package com.fasterxml.jackson.core;

import androidx.fragment.app.a;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class JsonProcessingException extends IOException {
    static final long serialVersionUID = 123;
    protected JsonLocation _location;

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
        this._location = jsonLocation;
    }

    public void clearLocation() {
        this._location = null;
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sbA = a.a(100, message);
        if (messageSuffix != null) {
            sbA.append(messageSuffix);
        }
        if (location != null) {
            sbA.append("\n at ");
            sbA.append(location.toString());
        }
        return sbA.toString();
    }

    public String getMessageSuffix() {
        return null;
    }

    public String getOriginalMessage() {
        return super.getMessage();
    }

    public Object getProcessor() {
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public JsonProcessingException(String str, Throwable th2) {
        this(str, null, th2);
    }

    public JsonProcessingException(Throwable th2) {
        this(null, null, th2);
    }
}
