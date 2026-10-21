package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.Serialization;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class KeySerializer<KeyT extends Key, SerializationT extends Serialization> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyT> f46636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<SerializationT> f46637b;

    public interface KeySerializationFunction<KeyT extends Key, SerializationT extends Serialization> {
        SerializationT serializeKey(KeyT keyt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException;
    }

    public class a extends KeySerializer<KeyT, SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KeySerializationFunction f46638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KeySerializationFunction keySerializationFunction, Class cls, Class cls2) {
            super(cls, cls2);
            this.f46638c = keySerializationFunction;
        }

        @Override // com.google.crypto.tink.internal.KeySerializer
        public final SerializationT serializeKey(KeyT keyt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
            return (SerializationT) this.f46638c.serializeKey(keyt, secretKeyAccess);
        }
    }

    public KeySerializer() {
        throw null;
    }

    public KeySerializer(Class cls, Class cls2) {
        this.f46636a = cls;
        this.f46637b = cls2;
    }

    public static <KeyT extends Key, SerializationT extends Serialization> KeySerializer<KeyT, SerializationT> create(KeySerializationFunction<KeyT, SerializationT> keySerializationFunction, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(keySerializationFunction, cls, cls2);
    }

    public Class<KeyT> getKeyClass() {
        return this.f46636a;
    }

    public Class<SerializationT> getSerializationClass() {
        return this.f46637b;
    }

    public abstract SerializationT serializeKey(KeyT keyt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException;
}
