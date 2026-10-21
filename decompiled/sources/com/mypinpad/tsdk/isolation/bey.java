package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public interface bey {
    int setDividerPadding(int i10);

    int setDividerPadding(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException;

    int setY(String str, OutputStream outputStream) throws IOException;
}
