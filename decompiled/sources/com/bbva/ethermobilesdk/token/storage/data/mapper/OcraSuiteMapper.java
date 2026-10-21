package com.bbva.ethermobilesdk.token.storage.data.mapper;

import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.storage.data.StorageOcraSuite;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/data/mapper/OcraSuiteMapper;", "Lcom/bbva/ethermobilesdk/token/storage/data/mapper/Mapper;", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageOcraSuite;", "Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "()V", "toData", "model", "toModel", "data", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OcraSuiteMapper implements Mapper<StorageOcraSuite, OcraSuite> {
    @Override // com.bbva.ethermobilesdk.token.storage.data.mapper.Mapper
    @NotNull
    public StorageOcraSuite toData(@NotNull OcraSuite model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new StorageOcraSuite(model.getVersion(), model.getFunction(), model.getOtpLength(), model.getTimeStep(), model.getChallengeType(), model.getChallengeLength(), model.getHasCounter());
    }

    @Override // com.bbva.ethermobilesdk.token.storage.data.mapper.Mapper
    @NotNull
    public OcraSuite toModel(@NotNull StorageOcraSuite data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new OcraSuite(data.getVersion(), data.getFunction(), data.getOtpLength(), data.getTimeStep(), data.getChallengeType(), data.getChallengeLength(), data.getHasCounter());
    }
}
