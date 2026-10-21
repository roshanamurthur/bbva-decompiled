package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface abv extends aco, WritableByteChannel {
    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    abv getAmountFieldTextColor() throws IOException;

    @NotNull
    abv getNavBarTitleString(int i10) throws IOException;

    @NotNull
    abv setCompoundDrawableTintBlendMode(@NotNull abw abwVar) throws IOException;

    @NotNull
    abv setCompoundDrawableTintBlendMode(@NotNull String str) throws IOException;

    @NotNull
    abv setDividerPadding(@NotNull byte[] bArr) throws IOException;

    @NotNull
    abv setIncludeFontPadding(long j10) throws IOException;

    @NotNull
    abv setLayoutAnimation(int i10) throws IOException;

    @NotNull
    abv setNavigationOnClickListener(int i10) throws IOException;

    @NotNull
    abx setOnFocusChangeListener();

    @NotNull
    abv setTextAlignment(long j10) throws IOException;

    @NotNull
    abv setX(@NotNull byte[] bArr, int i10, int i11) throws IOException;
}
