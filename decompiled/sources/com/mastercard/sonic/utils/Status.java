package com.mastercard.sonic.utils;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/utils/Status;", "", "NOT_REQUIRED", "ERROR", "NOT_READY", "READY", "PLAYED", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class Status {
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status ERROR;
    public static final Status NOT_READY;
    public static final Status NOT_REQUIRED;
    public static final Status PLAYED;
    public static final Status READY;

    static {
        Status status = new Status("NOT_REQUIRED", 0);
        NOT_REQUIRED = status;
        Status status2 = new Status("ERROR", 1);
        ERROR = status2;
        Status status3 = new Status("NOT_READY", 2);
        NOT_READY = status3;
        Status status4 = new Status("READY", 3);
        READY = status4;
        Status status5 = new Status("PLAYED", 4);
        PLAYED = status5;
        $VALUES = new Status[]{status, status2, status3, status4, status5};
    }

    public Status() {
        throw null;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
