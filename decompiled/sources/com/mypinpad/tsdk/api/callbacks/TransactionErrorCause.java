package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionErrorCause;", "", "NETWORK_CONNECTION_ERROR", "MICROPHONE_USAGE_DETECTED", "CAMERA_USAGE_DETECTED", "EXTERNAL_CAMERA_DETECTED", "TOTAL_ELAPSED_TIMEOUT", "DISCOVERY_TIMEOUT", "PIN_ENTRY_ACCUMULATED_TIMEOUT", "PIN_ENTRY_TIMEOUT", "AUTHORIZATION_IN_PROGRESS_TIMEOUT", "INTERNAL_ERROR", "HOST_CALLBACK_ERROR", "PIN_PAD_OBSCURED_ERROR", "PIN_PAD_DETACHED_ERROR", "PIN_PAD_LAUNCH_TIMEOUT", "NFC_ERROR", "APP_IN_BACKGROUND"}, k = 1, mv = {1, 8, 0})
public final class TransactionErrorCause {
    public static final TransactionErrorCause APP_IN_BACKGROUND;
    public static final TransactionErrorCause AUTHORIZATION_IN_PROGRESS_TIMEOUT;
    public static final TransactionErrorCause CAMERA_USAGE_DETECTED;
    public static final TransactionErrorCause DISCOVERY_TIMEOUT;
    public static final TransactionErrorCause EXTERNAL_CAMERA_DETECTED;
    public static final TransactionErrorCause HOST_CALLBACK_ERROR;
    public static final TransactionErrorCause INTERNAL_ERROR;
    public static final TransactionErrorCause MICROPHONE_USAGE_DETECTED;
    public static final TransactionErrorCause NETWORK_CONNECTION_ERROR;
    public static final TransactionErrorCause NFC_ERROR;
    public static final TransactionErrorCause PIN_ENTRY_ACCUMULATED_TIMEOUT;
    public static final TransactionErrorCause PIN_ENTRY_TIMEOUT;
    public static final TransactionErrorCause PIN_PAD_DETACHED_ERROR;
    public static final TransactionErrorCause PIN_PAD_LAUNCH_TIMEOUT;
    public static final TransactionErrorCause PIN_PAD_OBSCURED_ERROR;
    public static final TransactionErrorCause TOTAL_ELAPSED_TIMEOUT;
    private static int setDividerPadding = 0;
    private static final /* synthetic */ TransactionErrorCause[] setOnFocusChangeListener;
    private static int setY = 1;

    static {
        TransactionErrorCause transactionErrorCause = new TransactionErrorCause("NETWORK_CONNECTION_ERROR", 0);
        NETWORK_CONNECTION_ERROR = transactionErrorCause;
        TransactionErrorCause transactionErrorCause2 = new TransactionErrorCause("MICROPHONE_USAGE_DETECTED", 1);
        MICROPHONE_USAGE_DETECTED = transactionErrorCause2;
        TransactionErrorCause transactionErrorCause3 = new TransactionErrorCause("CAMERA_USAGE_DETECTED", 2);
        CAMERA_USAGE_DETECTED = transactionErrorCause3;
        TransactionErrorCause transactionErrorCause4 = new TransactionErrorCause("EXTERNAL_CAMERA_DETECTED", 3);
        EXTERNAL_CAMERA_DETECTED = transactionErrorCause4;
        TransactionErrorCause transactionErrorCause5 = new TransactionErrorCause("TOTAL_ELAPSED_TIMEOUT", 4);
        TOTAL_ELAPSED_TIMEOUT = transactionErrorCause5;
        TransactionErrorCause transactionErrorCause6 = new TransactionErrorCause("DISCOVERY_TIMEOUT", 5);
        DISCOVERY_TIMEOUT = transactionErrorCause6;
        TransactionErrorCause transactionErrorCause7 = new TransactionErrorCause("PIN_ENTRY_ACCUMULATED_TIMEOUT", 6);
        PIN_ENTRY_ACCUMULATED_TIMEOUT = transactionErrorCause7;
        TransactionErrorCause transactionErrorCause8 = new TransactionErrorCause("PIN_ENTRY_TIMEOUT", 7);
        PIN_ENTRY_TIMEOUT = transactionErrorCause8;
        TransactionErrorCause transactionErrorCause9 = new TransactionErrorCause("AUTHORIZATION_IN_PROGRESS_TIMEOUT", 8);
        AUTHORIZATION_IN_PROGRESS_TIMEOUT = transactionErrorCause9;
        TransactionErrorCause transactionErrorCause10 = new TransactionErrorCause("INTERNAL_ERROR", 9);
        INTERNAL_ERROR = transactionErrorCause10;
        TransactionErrorCause transactionErrorCause11 = new TransactionErrorCause("HOST_CALLBACK_ERROR", 10);
        HOST_CALLBACK_ERROR = transactionErrorCause11;
        TransactionErrorCause transactionErrorCause12 = new TransactionErrorCause("PIN_PAD_OBSCURED_ERROR", 11);
        PIN_PAD_OBSCURED_ERROR = transactionErrorCause12;
        TransactionErrorCause transactionErrorCause13 = new TransactionErrorCause("PIN_PAD_DETACHED_ERROR", 12);
        PIN_PAD_DETACHED_ERROR = transactionErrorCause13;
        TransactionErrorCause transactionErrorCause14 = new TransactionErrorCause("PIN_PAD_LAUNCH_TIMEOUT", 13);
        PIN_PAD_LAUNCH_TIMEOUT = transactionErrorCause14;
        TransactionErrorCause transactionErrorCause15 = new TransactionErrorCause("NFC_ERROR", 14);
        NFC_ERROR = transactionErrorCause15;
        TransactionErrorCause transactionErrorCause16 = new TransactionErrorCause("APP_IN_BACKGROUND", 15);
        APP_IN_BACKGROUND = transactionErrorCause16;
        int i10 = (119 << 1) - ((~0) & 119);
        setY = i10 % 128;
        int i11 = i10 % 2;
        TransactionErrorCause[] transactionErrorCauseArr = {transactionErrorCause, transactionErrorCause2, transactionErrorCause3, transactionErrorCause4, transactionErrorCause5, transactionErrorCause6, transactionErrorCause7, transactionErrorCause8, transactionErrorCause9, transactionErrorCause10, transactionErrorCause11, transactionErrorCause12, transactionErrorCause13, transactionErrorCause14, transactionErrorCause15, transactionErrorCause16};
        setY = 119 % 128;
        if (119 % 2 == 0) {
            throw null;
        }
        setOnFocusChangeListener = transactionErrorCauseArr;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i12 = ~iCurrentTimeMillis;
        int i13 = ((~i12) & (-105155725)) | (105155724 & i12);
        int i14 = (-105155725) & i12;
        int i15 = (i13 & i14) | (i13 ^ i14);
        int i16 = (i15 | (~i15)) & (~i15);
        int i17 = (-1552567392) & iCurrentTimeMillis;
        int i18 = ((-1552567392) | iCurrentTimeMillis) & (~i17);
        int i19 = ~((i18 & i17) | (i18 ^ i17));
        int i20 = ((~i19) & i16) | ((~i16) & i19);
        int i21 = i16 & i19;
        int i22 = ((i21 & i20) | (i20 ^ i21)) * (-370);
        int i23 = ((834952337 ^ i22) | (834952337 & i22)) << 1;
        int i24 = -((i22 & (-834952338)) | (834952337 & (~i22)));
        int i25 = (i23 & i24) + (i24 | i23);
        int i26 = (~iCurrentTimeMillis) & (i12 | iCurrentTimeMillis);
        int i27 = ~((i26 & (-1552567392)) | ((-1552567392) ^ i26));
        int i28 = (i12 & (-105155725)) | (105155724 & iCurrentTimeMillis);
        int i29 = iCurrentTimeMillis & (-105155725);
        int i30 = ~((i29 & i28) | (i28 ^ i29));
        int i31 = i27 ^ i30;
        int i32 = i30 & i27;
        int i33 = (i32 & i31) | (i31 ^ i32);
        int i34 = ((i33 & (-1590611168)) | (i33 ^ (-1590611168))) * (-370);
        int i35 = i25 | i34;
        int i36 = i35 << 1;
        int i37 = -((~(i34 & i25)) & i35);
        int i38 = (((i36 | i37) << 1) - (i37 ^ i36)) - 115612607;
        int i39 = (i38 ^ (-1)) + (i38 << 1);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i40 = ~(((-930093991) ^ iCurrentTimeMillis2) | ((-930093991) & iCurrentTimeMillis2));
        int i41 = 554702850 ^ i40;
        int i42 = i40 & 554702850;
        int i43 = -(-(((i42 & i41) | (i41 ^ i42)) * (-280)));
        int i44 = ((-519211929) & i43) + (i43 | (-519211929));
        int i45 = (-930093991) & iCurrentTimeMillis2;
        int i46 = (~i45) & ((-930093991) | iCurrentTimeMillis2);
        int i47 = ~iCurrentTimeMillis2;
        int i48 = (i45 & i46) | (i46 ^ i45);
        int i49 = (i48 | (~i48)) & (~i48);
        int i50 = 1771904010 & iCurrentTimeMillis2;
        int i51 = (~i50) & (1771904010 | iCurrentTimeMillis2);
        int i52 = (i50 & i51) | (i51 ^ i50);
        int i53 = (i52 | (~i52)) & (~i52);
        int i54 = ((~i53) & i49) | ((~i49) & i53);
        int i55 = i49 & i53;
        int i56 = ((i55 & i54) | (i54 ^ i55)) * 140;
        int i57 = ((i44 | i56) << 1) - (i56 ^ i44);
        int i58 = (-375391141) & iCurrentTimeMillis2;
        int i59 = ((-375391141) | iCurrentTimeMillis2) & (~i58);
        int i60 = ~((i59 & i58) | (i59 ^ i58));
        int i61 = (-930093991) & i47;
        int i62 = ((-930093991) | i47) & (~i61);
        int i63 = (i62 & i61) | (i62 ^ i61);
        int i64 = (i63 & 1771904010) | ((~i63) & (-1771904011));
        int i65 = i63 & (-1771904011);
        int i66 = ~((i65 & i64) | (i64 ^ i65));
        int i67 = i60 & i66;
        int i68 = (i66 | i60) & (~i67);
        int i69 = (i68 & i67) | (i68 ^ i67);
        int i70 = ~iCurrentTimeMillis2;
        int i71 = (i70 & 1771904010) | (1771904010 ^ i70);
        int i72 = ~((i71 & 930093990) | (i71 ^ 930093990));
        int i73 = i69 ^ i72;
        int i74 = i72 & i69;
        int i75 = -(-(((i74 & i73) | (i73 ^ i74)) * 140));
        if (i39 <= (i57 ^ i75) + ((i75 & i57) << 1)) {
            throw null;
        }
    }

    public TransactionErrorCause() {
        throw null;
    }

    public static TransactionErrorCause valueOf(String str) {
        int i10 = setY;
        int i11 = i10 & 9;
        int i12 = ((i10 ^ 9) | i11) << 1;
        int i13 = -((i10 | 9) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        setDividerPadding = i14 % 128;
        int i15 = i14 % 2;
        TransactionErrorCause transactionErrorCause = (TransactionErrorCause) Enum.valueOf(TransactionErrorCause.class, str);
        int i16 = setY;
        int i17 = (i16 ^ 87) + ((i16 & 87) << 1);
        setDividerPadding = i17 % 128;
        if (i17 % 2 == 0) {
            return transactionErrorCause;
        }
        throw null;
    }

    public static TransactionErrorCause[] values() {
        int i10 = setDividerPadding;
        int i11 = i10 & 77;
        int i12 = (i10 ^ 77) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setY = i13 % 128;
        int i14 = i13 % 2;
        TransactionErrorCause[] transactionErrorCauseArr = (TransactionErrorCause[]) setOnFocusChangeListener.clone();
        int i15 = setY;
        int i16 = ((i15 & (-12)) | ((~i15) & 11)) + ((i15 & 11) << 1);
        setDividerPadding = i16 % 128;
        int i17 = i16 % 2;
        return transactionErrorCauseArr;
    }
}
