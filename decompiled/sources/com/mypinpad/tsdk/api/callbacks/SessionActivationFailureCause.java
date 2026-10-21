package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/SessionActivationFailureCause;", "", "NETWORK_CONNECTION_ERROR", "DEVICE_STATE_FAILURE", "NFC_ERROR", "CONFIGURATION_VALIDATION_HASH_FAILURE", "DEACTIVATED", "INTERNAL_ERROR"}, k = 1, mv = {1, 8, 0})
public final class SessionActivationFailureCause {
    public static final SessionActivationFailureCause CONFIGURATION_VALIDATION_HASH_FAILURE;
    public static final SessionActivationFailureCause DEACTIVATED;
    public static final SessionActivationFailureCause DEVICE_STATE_FAILURE;
    public static final SessionActivationFailureCause INTERNAL_ERROR;
    public static final SessionActivationFailureCause NETWORK_CONNECTION_ERROR;
    public static final SessionActivationFailureCause NFC_ERROR;
    private static final /* synthetic */ SessionActivationFailureCause[] setDividerPadding;
    private static int setX = 1;
    private static int setY;

    static {
        SessionActivationFailureCause sessionActivationFailureCause = new SessionActivationFailureCause("NETWORK_CONNECTION_ERROR", 0);
        NETWORK_CONNECTION_ERROR = sessionActivationFailureCause;
        SessionActivationFailureCause sessionActivationFailureCause2 = new SessionActivationFailureCause("DEVICE_STATE_FAILURE", 1);
        DEVICE_STATE_FAILURE = sessionActivationFailureCause2;
        SessionActivationFailureCause sessionActivationFailureCause3 = new SessionActivationFailureCause("NFC_ERROR", 2);
        NFC_ERROR = sessionActivationFailureCause3;
        SessionActivationFailureCause sessionActivationFailureCause4 = new SessionActivationFailureCause("CONFIGURATION_VALIDATION_HASH_FAILURE", 3);
        CONFIGURATION_VALIDATION_HASH_FAILURE = sessionActivationFailureCause4;
        SessionActivationFailureCause sessionActivationFailureCause5 = new SessionActivationFailureCause("DEACTIVATED", 4);
        DEACTIVATED = sessionActivationFailureCause5;
        SessionActivationFailureCause sessionActivationFailureCause6 = new SessionActivationFailureCause("INTERNAL_ERROR", 5);
        INTERNAL_ERROR = sessionActivationFailureCause6;
        int i10 = ~0;
        int i11 = ((27 & i10) - (~0)) - 1;
        setX = i11 % 128;
        int i12 = i11 % 2;
        SessionActivationFailureCause[] sessionActivationFailureCauseArr = {sessionActivationFailureCause, sessionActivationFailureCause2, sessionActivationFailureCause3, sessionActivationFailureCause4, sessionActivationFailureCause5, sessionActivationFailureCause6};
        int i13 = 31 & i10;
        int i14 = -(-0);
        int i15 = (i13 & i14) + (i13 | i14);
        setX = i15 % 128;
        int i16 = i15 % 2;
        setDividerPadding = sessionActivationFailureCauseArr;
        int i17 = (((~0) & 55) - (~0)) - 1;
        setX = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public SessionActivationFailureCause() {
        throw null;
    }

    public static SessionActivationFailureCause valueOf(String str) {
        int i10 = setX + 3;
        setY = i10 % 128;
        int i11 = i10 % 2;
        SessionActivationFailureCause sessionActivationFailureCause = (SessionActivationFailureCause) Enum.valueOf(SessionActivationFailureCause.class, str);
        if (i11 != 0) {
            int i12 = 96 / 0;
        }
        return sessionActivationFailureCause;
    }

    public static SessionActivationFailureCause[] values() {
        int i10 = setY;
        int i11 = (i10 & (-20)) | ((~i10) & 19);
        int i12 = -(-((i10 & 19) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setX = i13 % 128;
        int i14 = i13 % 2;
        SessionActivationFailureCause[] sessionActivationFailureCauseArr = (SessionActivationFailureCause[]) setDividerPadding.clone();
        int i15 = setY;
        int i16 = ((i15 | 37) << 1) - (i15 ^ 37);
        setX = i16 % 128;
        if (i16 % 2 != 0) {
            return sessionActivationFailureCauseArr;
        }
        throw null;
    }
}
