package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ParametersParser<SerializationT extends Serialization> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f46662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<SerializationT> f46663b;

    public interface ParametersParsingFunction<SerializationT extends Serialization> {
        Parameters parseParameters(SerializationT serializationt) throws GeneralSecurityException;
    }

    public class a extends ParametersParser<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ParametersParsingFunction f46664c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParametersParsingFunction parametersParsingFunction, Bytes bytes, Class cls) {
            super(bytes, cls);
            this.f46664c = parametersParsingFunction;
        }

        @Override // com.google.crypto.tink.internal.ParametersParser
        public final Parameters parseParameters(SerializationT serializationt) throws GeneralSecurityException {
            return this.f46664c.parseParameters(serializationt);
        }
    }

    public ParametersParser() {
        throw null;
    }

    public ParametersParser(Bytes bytes, Class cls) {
        this.f46662a = bytes;
        this.f46663b = cls;
    }

    public static <SerializationT extends Serialization> ParametersParser<SerializationT> create(ParametersParsingFunction<SerializationT> parametersParsingFunction, Bytes bytes, Class<SerializationT> cls) {
        return new a(parametersParsingFunction, bytes, cls);
    }

    public final Bytes getObjectIdentifier() {
        return this.f46662a;
    }

    public final Class<SerializationT> getSerializationClass() {
        return this.f46663b;
    }

    public abstract Parameters parseParameters(SerializationT serializationt) throws GeneralSecurityException;
}
