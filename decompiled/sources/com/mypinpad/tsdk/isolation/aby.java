package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface aby extends acp, ReadableByteChannel {
    byte getNavBarTitleString() throws IOException;

    @NotNull
    String setAlwaysDrawnWithCacheEnabled() throws IOException;

    @NotNull
    String setCompoundDrawableTintBlendMode(@NotNull Charset charset) throws IOException;

    void setCompoundDrawableTintBlendMode(long j10) throws IOException;

    int setLayoutAnimation() throws IOException;

    @NotNull
    String setLayoutAnimation(long j10) throws IOException;

    short setNavigationOnClickListener() throws IOException;

    void setNavigationOnClickListener(long j10) throws IOException;

    @NotNull
    byte[] setOnDragListener(long j10) throws IOException;

    @NotNull
    abx setOnFocusChangeListener();

    boolean setOnFocusChangeListener(long j10) throws IOException;

    boolean setX() throws IOException;

    int setY(@NotNull aci aciVar) throws IOException;

    @NotNull
    abw setY(long j10) throws IOException;

    long setZ() throws IOException;
}
