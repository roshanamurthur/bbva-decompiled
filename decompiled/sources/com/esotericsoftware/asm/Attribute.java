package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public class Attribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f39884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Attribute f39885b;
    public final String type;

    public Attribute(String str) {
        this.type = str;
    }

    public final int a(ClassWriter classWriter, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (Attribute attribute = this; attribute != null; attribute = attribute.f39885b) {
            classWriter.newUTF8(attribute.type);
            i13 += attribute.write(classWriter, bArr, i10, i11, i12).f39887b + 6;
        }
        return i13;
    }

    public final void b(ClassWriter classWriter, byte[] bArr, int i10, int i11, int i12, ByteVector byteVector) {
        for (Attribute attribute = this; attribute != null; attribute = attribute.f39885b) {
            ByteVector byteVectorWrite = attribute.write(classWriter, bArr, i10, i11, i12);
            byteVector.putShort(classWriter.newUTF8(attribute.type)).putInt(byteVectorWrite.f39887b);
            byteVector.putByteArray(byteVectorWrite.f39886a, 0, byteVectorWrite.f39887b);
        }
    }

    public Label[] getLabels() {
        return null;
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    public Attribute read(ClassReader classReader, int i10, int i11, char[] cArr, int i12, Label[] labelArr) {
        Attribute attribute = new Attribute(this.type);
        byte[] bArr = new byte[i11];
        attribute.f39884a = bArr;
        System.arraycopy(classReader.f39889b, i10, bArr, 0, i11);
        return attribute;
    }

    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i10, int i11, int i12) {
        ByteVector byteVector = new ByteVector();
        byte[] bArr2 = this.f39884a;
        byteVector.f39886a = bArr2;
        byteVector.f39887b = bArr2.length;
        return byteVector;
    }
}
