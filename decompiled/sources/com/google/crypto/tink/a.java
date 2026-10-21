package com.google.crypto.tink;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: Registry.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements Registry.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyTypeManager f46460a;

    public a(KeyTypeManager keyTypeManager) {
        this.f46460a = keyTypeManager;
    }

    @Override // com.google.crypto.tink.Registry.a
    public final KeyData a(ByteString byteString, InputStream inputStream) throws GeneralSecurityException {
        KeyTypeManager keyTypeManager = this.f46460a;
        KeyTypeManager.KeyFactory keyFactory = keyTypeManager.keyFactory();
        try {
            MessageLite keyFormat = keyFactory.parseKeyFormat(byteString);
            keyFactory.validateKeyFormat(keyFormat);
            return KeyData.newBuilder().setTypeUrl(keyTypeManager.getKeyType()).setValue(keyFactory.deriveKey(keyFormat, inputStream).toByteString()).setKeyMaterialType(keyTypeManager.keyMaterialType()).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("parsing key format failed in deriveKey", e5);
        }
    }
}
