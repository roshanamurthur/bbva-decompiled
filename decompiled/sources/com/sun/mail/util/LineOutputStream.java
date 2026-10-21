package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
public class LineOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final byte[] f65552q0 = {13, 10};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f65553p0;

    public LineOutputStream(OutputStream outputStream) {
        this(outputStream, false);
    }

    public void writeln(String str) throws IOException {
        ((FilterOutputStream) this).out.write(this.f65553p0 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str));
        ((FilterOutputStream) this).out.write(f65552q0);
    }

    public LineOutputStream(OutputStream outputStream, boolean z10) {
        super(outputStream);
        this.f65553p0 = z10;
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(f65552q0);
    }
}
