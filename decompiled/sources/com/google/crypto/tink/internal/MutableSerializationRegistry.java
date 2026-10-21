package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class MutableSerializationRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MutableSerializationRegistry f46660b = new MutableSerializationRegistry();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<SerializationRegistry> f46661a = new AtomicReference<>(new SerializationRegistry(new SerializationRegistry.Builder()));

    public static MutableSerializationRegistry globalInstance() {
        return f46660b;
    }

    public <SerializationT extends Serialization> boolean hasParserForKey(SerializationT serializationt) {
        return this.f46661a.get().hasParserForKey(serializationt);
    }

    public <SerializationT extends Serialization> boolean hasParserForParameters(SerializationT serializationt) {
        return this.f46661a.get().hasParserForParameters(serializationt);
    }

    public <KeyT extends Key, SerializationT extends Serialization> boolean hasSerializerForKey(KeyT keyt, Class<SerializationT> cls) {
        return this.f46661a.get().hasSerializerForKey(keyt, cls);
    }

    public <ParametersT extends Parameters, SerializationT extends Serialization> boolean hasSerializerForParameters(ParametersT parameterst, Class<SerializationT> cls) {
        return this.f46661a.get().hasSerializerForParameters(parameterst, cls);
    }

    public <SerializationT extends Serialization> Key parseKey(SerializationT serializationt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        return this.f46661a.get().parseKey(serializationt, secretKeyAccess);
    }

    public Key parseKeyWithLegacyFallback(ProtoKeySerialization protoKeySerialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        if (secretKeyAccess == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (hasParserForKey(protoKeySerialization)) {
            return parseKey(protoKeySerialization, secretKeyAccess);
        }
        try {
            return new LegacyProtoKey(protoKeySerialization, secretKeyAccess);
        } catch (GeneralSecurityException e5) {
            throw new TinkBugException("Creating a LegacyProtoKey failed", e5);
        }
    }

    public <SerializationT extends Serialization> Parameters parseParameters(SerializationT serializationt) throws GeneralSecurityException {
        return this.f46661a.get().parseParameters(serializationt);
    }

    public Parameters parseParametersWithLegacyFallback(ProtoParametersSerialization protoParametersSerialization) {
        try {
            return parseParameters(protoParametersSerialization);
        } catch (GeneralSecurityException unused) {
            return new LegacyProtoParameters(protoParametersSerialization);
        }
    }

    public synchronized <SerializationT extends Serialization> void registerKeyParser(KeyParser<SerializationT> keyParser) throws GeneralSecurityException {
        SerializationRegistry.Builder builderRegisterKeyParser = new SerializationRegistry.Builder(this.f46661a.get()).registerKeyParser(keyParser);
        builderRegisterKeyParser.getClass();
        this.f46661a.set(new SerializationRegistry(builderRegisterKeyParser));
    }

    public synchronized <KeyT extends Key, SerializationT extends Serialization> void registerKeySerializer(KeySerializer<KeyT, SerializationT> keySerializer) throws GeneralSecurityException {
        SerializationRegistry.Builder builderRegisterKeySerializer = new SerializationRegistry.Builder(this.f46661a.get()).registerKeySerializer(keySerializer);
        builderRegisterKeySerializer.getClass();
        this.f46661a.set(new SerializationRegistry(builderRegisterKeySerializer));
    }

    public synchronized <SerializationT extends Serialization> void registerParametersParser(ParametersParser<SerializationT> parametersParser) throws GeneralSecurityException {
        SerializationRegistry.Builder builderRegisterParametersParser = new SerializationRegistry.Builder(this.f46661a.get()).registerParametersParser(parametersParser);
        builderRegisterParametersParser.getClass();
        this.f46661a.set(new SerializationRegistry(builderRegisterParametersParser));
    }

    public synchronized <ParametersT extends Parameters, SerializationT extends Serialization> void registerParametersSerializer(ParametersSerializer<ParametersT, SerializationT> parametersSerializer) throws GeneralSecurityException {
        SerializationRegistry.Builder builderRegisterParametersSerializer = new SerializationRegistry.Builder(this.f46661a.get()).registerParametersSerializer(parametersSerializer);
        builderRegisterParametersSerializer.getClass();
        this.f46661a.set(new SerializationRegistry(builderRegisterParametersSerializer));
    }

    public <KeyT extends Key, SerializationT extends Serialization> SerializationT serializeKey(KeyT keyt, Class<SerializationT> cls, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        return (SerializationT) this.f46661a.get().serializeKey(keyt, cls, secretKeyAccess);
    }

    public <ParametersT extends Parameters, SerializationT extends Serialization> SerializationT serializeParameters(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        return (SerializationT) this.f46661a.get().serializeParameters(parameterst, cls);
    }
}
