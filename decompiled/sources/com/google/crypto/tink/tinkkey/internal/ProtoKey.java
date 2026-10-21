package com.google.crypto.tink.tinkkey.internal;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.tinkkey.TinkKey;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class ProtoKey implements TinkKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyData f47521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KeyTemplate.OutputPrefixType f47523c;

    public ProtoKey(KeyData keyData, KeyTemplate.OutputPrefixType outputPrefixType) {
        this.f47522b = keyData.getKeyMaterialType() == KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || keyData.getKeyMaterialType() == KeyData.KeyMaterialType.SYMMETRIC || keyData.getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
        this.f47521a = keyData;
        this.f47523c = outputPrefixType;
    }

    @Override // com.google.crypto.tink.tinkkey.TinkKey
    public KeyTemplate getKeyTemplate() {
        throw new UnsupportedOperationException();
    }

    public KeyTemplate.OutputPrefixType getOutputPrefixType() {
        return this.f47523c;
    }

    public KeyData getProtoKey() {
        return this.f47521a;
    }

    @Override // com.google.crypto.tink.tinkkey.TinkKey
    public boolean hasSecret() {
        return this.f47522b;
    }
}
