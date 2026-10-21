package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class SerializationRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f46690d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends Serialization> f46695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bytes f46696b;

        public a(Class cls, Bytes bytes) {
            this.f46695a = cls;
            this.f46696b = bytes;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f46695a.equals(this.f46695a) && aVar.f46696b.equals(this.f46696b);
        }

        public final int hashCode() {
            return Objects.hash(this.f46695a, this.f46696b);
        }

        public final String toString() {
            return this.f46695a.getSimpleName() + ", object identifier: " + this.f46696b;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f46697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<? extends Serialization> f46698b;

        public b() {
            throw null;
        }

        public b(Class cls, Class cls2) {
            this.f46697a = cls;
            this.f46698b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f46697a.equals(this.f46697a) && bVar.f46698b.equals(this.f46698b);
        }

        public final int hashCode() {
            return Objects.hash(this.f46697a, this.f46698b);
        }

        public final String toString() {
            return this.f46697a.getSimpleName() + " with serialization type: " + this.f46698b.getSimpleName();
        }
    }

    public SerializationRegistry(Builder builder) {
        this.f46687a = new HashMap(builder.f46691a);
        this.f46688b = new HashMap(builder.f46692b);
        this.f46689c = new HashMap(builder.f46693c);
        this.f46690d = new HashMap(builder.f46694d);
    }

    public <SerializationT extends Serialization> boolean hasParserForKey(SerializationT serializationt) {
        return this.f46688b.containsKey(new a(serializationt.getClass(), serializationt.getObjectIdentifier()));
    }

    public <SerializationT extends Serialization> boolean hasParserForParameters(SerializationT serializationt) {
        return this.f46690d.containsKey(new a(serializationt.getClass(), serializationt.getObjectIdentifier()));
    }

    public <KeyT extends Key, SerializationT extends Serialization> boolean hasSerializerForKey(KeyT keyt, Class<SerializationT> cls) {
        return this.f46687a.containsKey(new b(keyt.getClass(), cls));
    }

    public <ParametersT extends Parameters, SerializationT extends Serialization> boolean hasSerializerForParameters(ParametersT parameterst, Class<SerializationT> cls) {
        return this.f46689c.containsKey(new b(parameterst.getClass(), cls));
    }

    public <SerializationT extends Serialization> Key parseKey(SerializationT serializationt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        a aVar = new a(serializationt.getClass(), serializationt.getObjectIdentifier());
        HashMap map = this.f46688b;
        if (map.containsKey(aVar)) {
            return ((KeyParser) map.get(aVar)).parseKey(serializationt, secretKeyAccess);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + aVar + " available");
    }

    public <SerializationT extends Serialization> Parameters parseParameters(SerializationT serializationt) throws GeneralSecurityException {
        a aVar = new a(serializationt.getClass(), serializationt.getObjectIdentifier());
        HashMap map = this.f46690d;
        if (map.containsKey(aVar)) {
            return ((ParametersParser) map.get(aVar)).parseParameters(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + aVar + " available");
    }

    public <KeyT extends Key, SerializationT extends Serialization> SerializationT serializeKey(KeyT keyt, Class<SerializationT> cls, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        b bVar = new b(keyt.getClass(), cls);
        HashMap map = this.f46687a;
        if (map.containsKey(bVar)) {
            return (SerializationT) ((KeySerializer) map.get(bVar)).serializeKey(keyt, secretKeyAccess);
        }
        throw new GeneralSecurityException("No Key serializer for " + bVar + " available");
    }

    public <ParametersT extends Parameters, SerializationT extends Serialization> SerializationT serializeParameters(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        b bVar = new b(parameterst.getClass(), cls);
        HashMap map = this.f46689c;
        if (map.containsKey(bVar)) {
            return (SerializationT) ((ParametersSerializer) map.get(bVar)).serializeParameters(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + bVar + " available");
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f46691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f46692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f46693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f46694d;

        public Builder() {
            this.f46691a = new HashMap();
            this.f46692b = new HashMap();
            this.f46693c = new HashMap();
            this.f46694d = new HashMap();
        }

        @CanIgnoreReturnValue
        public <SerializationT extends Serialization> Builder registerKeyParser(KeyParser<SerializationT> keyParser) throws GeneralSecurityException {
            a aVar = new a(keyParser.getSerializationClass(), keyParser.getObjectIdentifier());
            HashMap map = this.f46692b;
            if (map.containsKey(aVar)) {
                KeyParser keyParser2 = (KeyParser) map.get(aVar);
                if (!keyParser2.equals(keyParser) || !keyParser.equals(keyParser2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + aVar);
                }
            } else {
                map.put(aVar, keyParser);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public <KeyT extends Key, SerializationT extends Serialization> Builder registerKeySerializer(KeySerializer<KeyT, SerializationT> keySerializer) throws GeneralSecurityException {
            b bVar = new b(keySerializer.getKeyClass(), keySerializer.getSerializationClass());
            HashMap map = this.f46691a;
            if (map.containsKey(bVar)) {
                KeySerializer keySerializer2 = (KeySerializer) map.get(bVar);
                if (!keySerializer2.equals(keySerializer) || !keySerializer.equals(keySerializer2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + bVar);
                }
            } else {
                map.put(bVar, keySerializer);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public <SerializationT extends Serialization> Builder registerParametersParser(ParametersParser<SerializationT> parametersParser) throws GeneralSecurityException {
            a aVar = new a(parametersParser.getSerializationClass(), parametersParser.getObjectIdentifier());
            HashMap map = this.f46694d;
            if (map.containsKey(aVar)) {
                ParametersParser parametersParser2 = (ParametersParser) map.get(aVar);
                if (!parametersParser2.equals(parametersParser) || !parametersParser.equals(parametersParser2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + aVar);
                }
            } else {
                map.put(aVar, parametersParser);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public <ParametersT extends Parameters, SerializationT extends Serialization> Builder registerParametersSerializer(ParametersSerializer<ParametersT, SerializationT> parametersSerializer) throws GeneralSecurityException {
            b bVar = new b(parametersSerializer.getParametersClass(), parametersSerializer.getSerializationClass());
            HashMap map = this.f46693c;
            if (map.containsKey(bVar)) {
                ParametersSerializer parametersSerializer2 = (ParametersSerializer) map.get(bVar);
                if (!parametersSerializer2.equals(parametersSerializer) || !parametersSerializer.equals(parametersSerializer2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + bVar);
                }
            } else {
                map.put(bVar, parametersSerializer);
            }
            return this;
        }

        public Builder(SerializationRegistry serializationRegistry) {
            this.f46691a = new HashMap(serializationRegistry.f46687a);
            this.f46692b = new HashMap(serializationRegistry.f46688b);
            this.f46693c = new HashMap(serializationRegistry.f46689c);
            this.f46694d = new HashMap(serializationRegistry.f46690d);
        }
    }
}
