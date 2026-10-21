package com.bbva.bridge.webcontroller;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: WebState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/bridge/webcontroller/WebState;", "", "IDLE", "READY", "cells-bridge_release"}, k = 1, mv = {1, 9, 0})
public final class WebState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WebState[] $VALUES;
    public static final WebState IDLE;
    public static final WebState READY;

    static {
        WebState webState = new WebState("IDLE", 0);
        IDLE = webState;
        WebState webState2 = new WebState("READY", 1);
        READY = webState2;
        WebState[] webStateArr = {webState, webState2};
        $VALUES = webStateArr;
        $ENTRIES = EnumEntriesKt.enumEntries(webStateArr);
    }

    public WebState() {
        throw null;
    }

    @NotNull
    public static EnumEntries<WebState> getEntries() {
        return $ENTRIES;
    }

    public static WebState valueOf(String str) {
        return (WebState) Enum.valueOf(WebState.class, str);
    }

    public static WebState[] values() {
        return (WebState[]) $VALUES.clone();
    }
}
