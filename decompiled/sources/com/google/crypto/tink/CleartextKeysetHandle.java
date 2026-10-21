package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.monitoring.MonitoringAnnotations;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class CleartextKeysetHandle {
    public static KeysetHandle fromKeyset(Keyset keyset) throws GeneralSecurityException {
        return KeysetHandle.d(keyset);
    }

    public static Keyset getKeyset(KeysetHandle keysetHandle) {
        return keysetHandle.f46415a;
    }

    @Deprecated
    public static final KeysetHandle parseFrom(byte[] bArr) throws GeneralSecurityException {
        try {
            return KeysetHandle.d(Keyset.parseFrom(bArr, ExtensionRegistryLite.getEmptyRegistry()));
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static KeysetHandle read(KeysetReader keysetReader) throws GeneralSecurityException, IOException {
        return KeysetHandle.d(keysetReader.read());
    }

    public static void write(KeysetHandle keysetHandle, KeysetWriter keysetWriter) throws IOException {
        keysetWriter.write(keysetHandle.f46415a);
    }

    @Alpha
    public static KeysetHandle read(KeysetReader keysetReader, Map<String, String> map) throws GeneralSecurityException, IOException {
        Keyset keyset = keysetReader.read();
        MonitoringAnnotations monitoringAnnotationsBuild = MonitoringAnnotations.newBuilder().addAll(map).build();
        if (keyset == null || keyset.getKeyCount() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new KeysetHandle(keyset, KeysetHandle.e(keyset), monitoringAnnotationsBuild);
    }
}
