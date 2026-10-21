package com.bbva.ethermobilesdk.token.storage.data.mapper;

import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.model.Token;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.model.TokenRSA;
import com.bbva.ethermobilesdk.token.storage.data.StorageOcraSuite;
import com.bbva.ethermobilesdk.token.storage.data.StorageToken;
import com.bbva.ethermobilesdk.token.storage.data.StorageTokenActivation;
import com.bbva.ethermobilesdk.token.storage.data.StorageTokenRSA;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/data/mapper/TokenMapper;", "Lcom/bbva/ethermobilesdk/token/storage/data/mapper/Mapper;", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageToken;", "Lcom/bbva/ethermobilesdk/token/model/Token;", "data", "toModel", "model", "toData", "<init>", "()V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mapper.kt\ncom/bbva/ethermobilesdk/token/storage/data/mapper/TokenMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class TokenMapper implements Mapper<StorageToken, Token> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TokenRSAMapper f30245a = new TokenRSAMapper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenActivationMapper f30246b = new TokenActivationMapper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OcraSuiteMapper f30247c = new OcraSuiteMapper();

    @Override // com.bbva.ethermobilesdk.token.storage.data.mapper.Mapper
    @NotNull
    public StorageToken toData(@NotNull Token model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String id = model.getId();
        StorageTokenRSA data = this.f30245a.toData(model.getRsa());
        TokenActivation activation = model.getActivation();
        StorageTokenActivation data2 = activation != null ? this.f30246b.toData(activation) : null;
        OcraSuite ocraSuite = model.getOcraSuite();
        return new StorageToken(id, data, data2, ocraSuite != null ? this.f30247c.toData(ocraSuite) : null);
    }

    @Override // com.bbva.ethermobilesdk.token.storage.data.mapper.Mapper
    @NotNull
    public Token toModel(@NotNull StorageToken data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String id = data.getId();
        TokenRSA model = this.f30245a.toModel(data.getRsa());
        StorageTokenActivation activation = data.getActivation();
        TokenActivation model2 = activation != null ? this.f30246b.toModel(activation) : null;
        StorageOcraSuite ocraSuite = data.getOcraSuite();
        return new Token(id, model, model2, ocraSuite != null ? this.f30247c.toModel(ocraSuite) : null);
    }
}
