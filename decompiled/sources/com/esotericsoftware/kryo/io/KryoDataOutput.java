package com.esotericsoftware.kryo.io;

import java.io.DataOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class KryoDataOutput implements DataOutput, AutoCloseable {
    protected Output output;

    public KryoDataOutput(Output output) {
        this.output = output;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.output.close();
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    @Override // java.io.DataOutput
    public void write(int i10) throws IOException {
        this.output.write(i10);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z10) throws IOException {
        this.output.writeBoolean(z10);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i10) throws IOException {
        this.output.writeByte(i10);
    }

    @Override // java.io.DataOutput
    public void writeBytes(String str) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.output.write((byte) str.charAt(i10));
        }
    }

    @Override // java.io.DataOutput
    public void writeChar(int i10) throws IOException {
        this.output.writeChar((char) i10);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            this.output.write(cCharAt & 255);
            this.output.write((cCharAt >>> '\b') & 255);
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d2) throws IOException {
        this.output.writeDouble(d2);
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f6) throws IOException {
        this.output.writeFloat(f6);
    }

    @Override // java.io.DataOutput
    public void writeInt(int i10) throws IOException {
        this.output.writeInt(i10);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j10) throws IOException {
        this.output.writeLong(j10);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i10) throws IOException {
        this.output.writeShort(i10);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        this.output.writeString(str);
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
        this.output.write(bArr);
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.output.write(bArr, i10, i11);
    }
}
