package com.google.crypto.tink.tinkkey.internal;

import com.google.crypto.tink.internal.KeyStatusTypeProtoConverter;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.tinkkey.KeyHandle;
import com.google.crypto.tink.tinkkey.TinkKey;

/* JADX INFO: loaded from: classes10.dex */
public final class InternalKeyHandle extends KeyHandle {
    public InternalKeyHandle(TinkKey tinkKey, KeyStatusType keyStatusType, int i10) {
        super(tinkKey, KeyStatusTypeProtoConverter.fromProto(keyStatusType), i10);
    }
}
