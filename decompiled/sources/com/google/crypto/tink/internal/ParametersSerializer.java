package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.Serialization;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ParametersSerializer<ParametersT extends Parameters, SerializationT extends Serialization> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<ParametersT> f46665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<SerializationT> f46666b;

    public interface ParametersSerializationFunction<ParametersT extends Parameters, SerializationT extends Serialization> {
        SerializationT serializeParameters(ParametersT parameterst) throws GeneralSecurityException;
    }

    public class a extends ParametersSerializer<ParametersT, SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ParametersSerializationFunction f46667c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParametersSerializationFunction parametersSerializationFunction, Class cls, Class cls2) {
            super(cls, cls2);
            this.f46667c = parametersSerializationFunction;
        }

        @Override // com.google.crypto.tink.internal.ParametersSerializer
        public final SerializationT serializeParameters(ParametersT parameterst) throws GeneralSecurityException {
            return (SerializationT) this.f46667c.serializeParameters(parameterst);
        }
    }

    public ParametersSerializer() {
        throw null;
    }

    public ParametersSerializer(Class cls, Class cls2) {
        this.f46665a = cls;
        this.f46666b = cls2;
    }

    public static <ParametersT extends Parameters, SerializationT extends Serialization> ParametersSerializer<ParametersT, SerializationT> create(ParametersSerializationFunction<ParametersT, SerializationT> parametersSerializationFunction, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(parametersSerializationFunction, cls, cls2);
    }

    public Class<ParametersT> getParametersClass() {
        return this.f46665a;
    }

    public Class<SerializationT> getSerializationClass() {
        return this.f46666b;
    }

    public abstract SerializationT serializeParameters(ParametersT parameterst) throws GeneralSecurityException;
}
