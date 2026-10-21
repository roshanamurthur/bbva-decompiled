package com.bbva.cellscore.logger;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/cellscore/logger/LogModule;", "", "WebSender", "WebController", "PluginManager", "AppLifecycle", "ActivityLifeCycle", "PubSub", "Reactor", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class LogModule {
    private static final /* synthetic */ LogModule[] $VALUES;
    public static final LogModule ActivityLifeCycle;
    public static final LogModule AppLifecycle;
    public static final LogModule PluginManager;
    public static final LogModule PubSub;
    public static final LogModule Reactor;
    public static final LogModule WebController;
    public static final LogModule WebSender;

    static {
        LogModule logModule = new LogModule("WebSender", 0);
        WebSender = logModule;
        LogModule logModule2 = new LogModule("WebController", 1);
        WebController = logModule2;
        LogModule logModule3 = new LogModule("PluginManager", 2);
        PluginManager = logModule3;
        LogModule logModule4 = new LogModule("AppLifecycle", 3);
        AppLifecycle = logModule4;
        LogModule logModule5 = new LogModule("ActivityLifeCycle", 4);
        ActivityLifeCycle = logModule5;
        LogModule logModule6 = new LogModule("PubSub", 5);
        PubSub = logModule6;
        LogModule logModule7 = new LogModule("Reactor", 6);
        Reactor = logModule7;
        $VALUES = new LogModule[]{logModule, logModule2, logModule3, logModule4, logModule5, logModule6, logModule7};
    }

    public LogModule() {
        throw null;
    }

    public static LogModule valueOf(String str) {
        return (LogModule) Enum.valueOf(LogModule.class, str);
    }

    public static LogModule[] values() {
        return (LogModule[]) $VALUES.clone();
    }
}
