package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.errorprone.annotations.InlineMe;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class BinaryKeysetReader implements KeysetReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f46403a;

    public BinaryKeysetReader(InputStream inputStream) {
        this.f46403a = inputStream;
    }

    public static KeysetReader withBytes(byte[] bArr) {
        return new BinaryKeysetReader(new ByteArrayInputStream(bArr));
    }

    @InlineMe(imports = {"com.google.crypto.tink.BinaryKeysetReader", "java.io.FileInputStream"}, replacement = "BinaryKeysetReader.withInputStream(new FileInputStream(file))")
    @Deprecated
    public static KeysetReader withFile(File file) throws IOException {
        return withInputStream(new FileInputStream(file));
    }

    public static KeysetReader withInputStream(InputStream inputStream) {
        return new BinaryKeysetReader(inputStream);
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        InputStream inputStream = this.f46403a;
        try {
            return Keyset.parseFrom(inputStream, ExtensionRegistryLite.getEmptyRegistry());
        } finally {
            inputStream.close();
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        InputStream inputStream = this.f46403a;
        try {
            return EncryptedKeyset.parseFrom(inputStream, ExtensionRegistryLite.getEmptyRegistry());
        } finally {
            inputStream.close();
        }
    }
}
