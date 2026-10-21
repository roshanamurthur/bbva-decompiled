package com.vierge.pinpadsdk.error;

/* JADX INFO: loaded from: classes6.dex */
public enum ERROR_CODE {
    ErrorWhileReadingFile(-2),
    ErrorBothScriptsCannotBeEmpty(-3),
    ParameterError(-4),
    InvalidParameterLength(-5),
    InvalidParameterFormat(-6);

    private final int value;

    ERROR_CODE(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
