package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface KeysetInfoOrBuilder extends MessageLiteOrBuilder {
    KeysetInfo.KeyInfo getKeyInfo(int i10);

    int getKeyInfoCount();

    List<KeysetInfo.KeyInfo> getKeyInfoList();

    int getPrimaryKeyId();
}
