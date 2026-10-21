package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f48602p0;

    public SendException(String str) {
        super(str);
        int i10 = 0;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "service_not_available":
                    i10 = 3;
                    break;
                case "toomanymessages":
                    i10 = 4;
                    break;
                case "invalid_parameters":
                case "missing_to":
                    i10 = 1;
                    break;
                case "messagetoobig":
                    i10 = 2;
                    break;
            }
        }
        this.f48602p0 = i10;
    }

    public int getErrorCode() {
        return this.f48602p0;
    }
}
