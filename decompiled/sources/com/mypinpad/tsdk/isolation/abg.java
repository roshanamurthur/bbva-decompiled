package com.mypinpad.tsdk.isolation;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface abg {
    boolean setOnFocusChangeListener();

    boolean setOnFocusChangeListener(@NotNull SSLSocket sSLSocket);

    @Nullable
    String setX(@NotNull SSLSocket sSLSocket);

    void setY(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends yi> list);
}
