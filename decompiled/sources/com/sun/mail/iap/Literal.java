package com.sun.mail.iap;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public interface Literal {
    int size();

    void writeTo(OutputStream outputStream) throws IOException;
}
