package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TerminalCreationFailureCause;", "", "NETWORK_CONNECTION_ERROR", "DEVICE_STATE_FAILURE", "INTERNAL_ERROR", "UNSUPPORTED_ANDROID_OS_VERSION", "TERMINAL_NOT_INITIALISED_YET"}, k = 1, mv = {1, 8, 0})
public final class TerminalCreationFailureCause {
    public static final TerminalCreationFailureCause DEVICE_STATE_FAILURE;
    public static final TerminalCreationFailureCause INTERNAL_ERROR;
    public static final TerminalCreationFailureCause NETWORK_CONNECTION_ERROR;
    public static final TerminalCreationFailureCause TERMINAL_NOT_INITIALISED_YET;
    public static final TerminalCreationFailureCause UNSUPPORTED_ANDROID_OS_VERSION;
    private static int setOnFocusChangeListener = 1;
    private static int setX;
    private static final /* synthetic */ TerminalCreationFailureCause[] setY;

    static {
        TerminalCreationFailureCause terminalCreationFailureCause = new TerminalCreationFailureCause("NETWORK_CONNECTION_ERROR", 0);
        NETWORK_CONNECTION_ERROR = terminalCreationFailureCause;
        TerminalCreationFailureCause terminalCreationFailureCause2 = new TerminalCreationFailureCause("DEVICE_STATE_FAILURE", 1);
        DEVICE_STATE_FAILURE = terminalCreationFailureCause2;
        TerminalCreationFailureCause terminalCreationFailureCause3 = new TerminalCreationFailureCause("INTERNAL_ERROR", 2);
        INTERNAL_ERROR = terminalCreationFailureCause3;
        TerminalCreationFailureCause terminalCreationFailureCause4 = new TerminalCreationFailureCause("UNSUPPORTED_ANDROID_OS_VERSION", 3);
        UNSUPPORTED_ANDROID_OS_VERSION = terminalCreationFailureCause4;
        TerminalCreationFailureCause terminalCreationFailureCause5 = new TerminalCreationFailureCause("TERMINAL_NOT_INITIALISED_YET", 4);
        TERMINAL_NOT_INITIALISED_YET = terminalCreationFailureCause5;
        int i10 = 0 - (-97);
        int i11 = i10 % 128;
        setOnFocusChangeListener = i11;
        int i12 = i10 % 2;
        TerminalCreationFailureCause[] terminalCreationFailureCauseArr = {terminalCreationFailureCause, terminalCreationFailureCause2, terminalCreationFailureCause3, terminalCreationFailureCause4, terminalCreationFailureCause5};
        int i13 = i11 & 117;
        int i14 = ((i11 ^ 117) | i13) << 1;
        int i15 = -((~i13) & (i11 | 117));
        int i16 = (i14 & i15) + (i14 | i15);
        setX = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
        setY = terminalCreationFailureCauseArr;
        int i17 = i11 & 1;
        int i18 = ((i11 ^ 1) | i17) << 1;
        int i19 = -((~i17) & (i11 | 1));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        setX = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    public TerminalCreationFailureCause() {
        throw null;
    }

    public static TerminalCreationFailureCause valueOf(String str) {
        int i10 = setX;
        int i11 = i10 | 75;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 75)) & i11);
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        setOnFocusChangeListener = i14 % 128;
        if (i14 % 2 == 0) {
            Enum.valueOf(TerminalCreationFailureCause.class, str);
            throw null;
        }
        TerminalCreationFailureCause terminalCreationFailureCause = (TerminalCreationFailureCause) Enum.valueOf(TerminalCreationFailureCause.class, str);
        int i15 = setX;
        int i16 = i15 & 41;
        int i17 = i16 + ((i15 ^ 41) | i16);
        setOnFocusChangeListener = i17 % 128;
        int i18 = i17 % 2;
        return terminalCreationFailureCause;
    }

    public static TerminalCreationFailureCause[] values() {
        int i10 = setOnFocusChangeListener;
        int i11 = ((i10 ^ 114) + ((i10 & 114) << 1)) - 1;
        setX = i11 % 128;
        int i12 = i11 % 2;
        TerminalCreationFailureCause[] terminalCreationFailureCauseArr = (TerminalCreationFailureCause[]) setY.clone();
        int i13 = setOnFocusChangeListener;
        int i14 = ((i13 | 55) << 1) - (i13 ^ 55);
        setX = i14 % 128;
        int i15 = i14 % 2;
        return terminalCreationFailureCauseArr;
    }
}
