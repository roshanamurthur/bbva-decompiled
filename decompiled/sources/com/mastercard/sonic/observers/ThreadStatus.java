package com.mastercard.sonic.observers;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ThreadStatus.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mastercard/sonic/observers/ThreadStatus;", "", "NOT_INITIALIZED", "OPERATION_IN_PROGRESS", "INITIALIZED", "READY_FOR_SYNC", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class ThreadStatus {
    private static final /* synthetic */ ThreadStatus[] $VALUES;
    public static final ThreadStatus INITIALIZED;
    public static final ThreadStatus NOT_INITIALIZED;
    public static final ThreadStatus OPERATION_IN_PROGRESS;
    public static final ThreadStatus READY_FOR_SYNC;

    static {
        ThreadStatus threadStatus = new ThreadStatus("NOT_INITIALIZED", 0);
        NOT_INITIALIZED = threadStatus;
        ThreadStatus threadStatus2 = new ThreadStatus("OPERATION_IN_PROGRESS", 1);
        OPERATION_IN_PROGRESS = threadStatus2;
        ThreadStatus threadStatus3 = new ThreadStatus("INITIALIZED", 2);
        INITIALIZED = threadStatus3;
        ThreadStatus threadStatus4 = new ThreadStatus("READY_FOR_SYNC", 3);
        READY_FOR_SYNC = threadStatus4;
        $VALUES = new ThreadStatus[]{threadStatus, threadStatus2, threadStatus3, threadStatus4};
    }

    public ThreadStatus() {
        throw null;
    }

    public static ThreadStatus valueOf(String str) {
        return (ThreadStatus) Enum.valueOf(ThreadStatus.class, str);
    }

    public static ThreadStatus[] values() {
        return (ThreadStatus[]) $VALUES.clone();
    }
}
