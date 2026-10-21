package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class KeyParser<SerializationT extends Serialization> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f46633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<SerializationT> f46634b;

    public interface KeyParsingFunction<SerializationT extends Serialization> {
        Key parseKey(SerializationT serializationt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException;
    }

    public class a extends KeyParser<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KeyParsingFunction f46635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KeyParsingFunction keyParsingFunction, Bytes bytes, Class cls) {
            super(bytes, cls);
            this.f46635c = keyParsingFunction;
        }

        @Override // com.google.crypto.tink.internal.KeyParser
        public final Key parseKey(SerializationT serializationt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
            return this.f46635c.parseKey(serializationt, secretKeyAccess);
        }
    }

    public KeyParser() {
        throw null;
    }

    public KeyParser(Bytes bytes, Class cls) {
        this.f46633a = bytes;
        this.f46634b = cls;
    }

    public static <SerializationT extends Serialization> KeyParser<SerializationT> create(KeyParsingFunction<SerializationT> keyParsingFunction, Bytes bytes, Class<SerializationT> cls) {
        return new a(keyParsingFunction, bytes, cls);
    }

    public final Bytes getObjectIdentifier() {
        return this.f46633a;
    }

    public final Class<SerializationT> getSerializationClass() {
        return this.f46634b;
    }

    public abstract Key parseKey(SerializationT serializationt, @Nullable SecretKeyAccess secretKeyAccess) throws GeneralSecurityException;
}
