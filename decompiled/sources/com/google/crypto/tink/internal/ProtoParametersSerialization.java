package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class ProtoParametersSerialization implements Serialization {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f46685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyTemplate f46686b;

    public ProtoParametersSerialization(KeyTemplate keyTemplate) {
        this.f46686b = keyTemplate;
        this.f46685a = Util.toBytesFromPrintableAscii(keyTemplate.getTypeUrl());
    }

    public static ProtoParametersSerialization create(String str, OutputPrefixType outputPrefixType, MessageLite messageLite) {
        return create(KeyTemplate.newBuilder().setTypeUrl(str).setOutputPrefixType(outputPrefixType).setValue(messageLite.toByteString()).build());
    }

    public KeyTemplate getKeyTemplate() {
        return this.f46686b;
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public Bytes getObjectIdentifier() {
        return this.f46685a;
    }

    public static ProtoParametersSerialization create(KeyTemplate keyTemplate) {
        return new ProtoParametersSerialization(keyTemplate);
    }
}
