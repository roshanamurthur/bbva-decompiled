package com.bbva.ethermobilesdk.token.storage.data.mapper;

import com.bbva.ethermobilesdk.token.model.TokenRSA;
import com.bbva.ethermobilesdk.token.storage.data.StorageTokenRSA;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/data/mapper/TokenRSAMapper;", "Lcom/bbva/ethermobilesdk/token/storage/data/mapper/Mapper;", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenRSA;", "Lcom/bbva/ethermobilesdk/token/model/TokenRSA;", "()V", "toData", "model", "toModel", "data", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TokenRSAMapper implements Mapper<StorageTokenRSA, TokenRSA> {
    @Override // com.bbva.ethermobilesdk.token.storage.data.mapper.Mapper
    @NotNull
    public StorageTokenRSA toData(@NotNull TokenRSA model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new StorageTokenRSA(model.getPrivateKey(), model.getAuthCode(), model.getDeviceId(), model.getProtocolVersion());
    }

    @Override // com.bbva.ethermobilesdk.token.storage.data.mapper.Mapper
    @NotNull
    public TokenRSA toModel(@NotNull StorageTokenRSA data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TokenRSA(data.getPrivateKey(), data.getAuthCode(), data.getDeviceId(), data.getProtocolVersion());
    }
}
