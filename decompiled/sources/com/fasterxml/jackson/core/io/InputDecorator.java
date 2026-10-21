package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class InputDecorator implements Serializable {
    public DataInput decorate(IOContext iOContext, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream decorate(IOContext iOContext, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(IOContext iOContext, byte[] bArr, int i10, int i11) throws IOException;

    public abstract Reader decorate(IOContext iOContext, Reader reader) throws IOException;
}
