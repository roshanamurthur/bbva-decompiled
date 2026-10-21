package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public final class SegmentedStringWriter extends Writer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TextBuffer f43067p0;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this.f43067p0 = new TextBuffer(bufferRecycler);
    }

    public String getAndClear() {
        TextBuffer textBuffer = this.f43067p0;
        String strContentsAsString = textBuffer.contentsAsString();
        textBuffer.releaseBuffers();
        return strContentsAsString;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f43067p0.append(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        this.f43067p0.append(cArr, i10, i11);
    }

    @Override // java.io.Writer
    public void write(int i10) {
        this.f43067p0.append((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f43067p0.append(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f43067p0.append(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        this.f43067p0.append(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        String string = charSequence.subSequence(i10, i11).toString();
        this.f43067p0.append(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
