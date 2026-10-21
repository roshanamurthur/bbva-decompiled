package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import com.google.errorprone.annotations.InlineMe;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class BinaryKeysetWriter implements KeysetWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f46404a;

    public BinaryKeysetWriter(OutputStream outputStream) {
        this.f46404a = outputStream;
    }

    @InlineMe(imports = {"com.google.crypto.tink.BinaryKeysetWriter", "java.io.FileOutputStream"}, replacement = "BinaryKeysetWriter.withOutputStream(new FileOutputStream(file))")
    @Deprecated
    public static KeysetWriter withFile(File file) throws IOException {
        return withOutputStream(new FileOutputStream(file));
    }

    public static KeysetWriter withOutputStream(OutputStream outputStream) {
        return new BinaryKeysetWriter(outputStream);
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        OutputStream outputStream = this.f46404a;
        try {
            keyset.writeTo(outputStream);
        } finally {
            outputStream.close();
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset encryptedKeyset) throws IOException {
        OutputStream outputStream = this.f46404a;
        try {
            encryptedKeyset.writeTo(outputStream);
        } finally {
            outputStream.close();
        }
    }
}
