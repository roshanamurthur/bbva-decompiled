package com.google.crypto.tink;

import bf.e;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class PrivilegedRegistry {
    public static KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream inputStream) throws GeneralSecurityException {
        KeyData keyDataA;
        Logger logger = Registry.f46453a;
        synchronized (Registry.class) {
            String typeUrl = keyTemplate.getTypeUrl();
            ConcurrentHashMap concurrentHashMap = Registry.f46455c;
            if (!concurrentHashMap.containsKey(typeUrl)) {
                throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
            }
            keyDataA = ((Registry.a) concurrentHashMap.get(typeUrl)).a(keyTemplate.getValue(), inputStream);
        }
        return keyDataA;
    }

    public static MessageLite parseKeyData(KeyData keyData) throws InvalidProtocolBufferException, GeneralSecurityException {
        e eVar = Registry.f46454b.get();
        eVar.getClass();
        return eVar.a(keyData.getTypeUrl()).d(keyData.getValue());
    }
}
