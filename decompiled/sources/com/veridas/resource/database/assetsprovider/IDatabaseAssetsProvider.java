package com.veridas.resource.database.assetsprovider;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IDatabaseAssetsProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/veridas/resource/database/assetsprovider/IDatabaseAssetsProvider;", "", "getDataBaseBytes", "", "getStencilBytes", "stencilFileName", "", "getTemplateBytes", "templateFileName", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IDatabaseAssetsProvider {
    @NotNull
    byte[] getDataBaseBytes();

    @Nullable
    byte[] getStencilBytes(@NotNull String stencilFileName);

    @Nullable
    byte[] getTemplateBytes(@NotNull String templateFileName);
}
