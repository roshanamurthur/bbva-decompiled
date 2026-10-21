package com.mastercard.sonic.hapticsmanager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HapticsManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J$\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/HapticsProvider;", "", "play", "", "completion", "Lkotlin/Function0;", "error", "prepare", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HapticsProvider {
    void play(@NotNull Function0<Unit> completion, @NotNull Function0<Unit> error);

    void prepare(@NotNull Function0<Unit> completion, @NotNull Function0<Unit> error);
}
