package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class UiExecutor implements Executor {
    private static final /* synthetic */ UiExecutor[] $VALUES;

    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler HANDLER;
    public static final UiExecutor INSTANCE;

    static {
        UiExecutor uiExecutor = new UiExecutor("INSTANCE", 0);
        INSTANCE = uiExecutor;
        $VALUES = new UiExecutor[]{uiExecutor};
        HANDLER = new Handler(Looper.getMainLooper());
    }

    public UiExecutor() {
        throw null;
    }

    public static UiExecutor valueOf(String str) {
        return (UiExecutor) Enum.valueOf(UiExecutor.class, str);
    }

    public static UiExecutor[] values() {
        return (UiExecutor[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}
