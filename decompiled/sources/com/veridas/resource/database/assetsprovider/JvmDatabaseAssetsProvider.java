package com.veridas.resource.database.assetsprovider;

import androidx.annotation.Keep;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JvmDatabaseAssetsProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/veridas/resource/database/assetsprovider/JvmDatabaseAssetsProvider;", "Lcom/veridas/resource/database/assetsprovider/IDatabaseAssetsProvider;", "()V", "getDataBaseBytes", "", "getJvmAssetAsBytes", "name", "", "getStencilBytes", "stencilFileName", "getTemplateBytes", "templateFileName", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JvmDatabaseAssetsProvider implements IDatabaseAssetsProvider {
    private final byte[] getJvmAssetAsBytes(String name) {
        InputStream resourceAsStream = JvmDatabaseAssetsProvider.class.getResourceAsStream(name);
        if (resourceAsStream != null) {
            return ByteStreamsKt.readBytes(resourceAsStream);
        }
        return null;
    }

    @Override // com.veridas.resource.database.assetsprovider.IDatabaseAssetsProvider
    @NotNull
    public byte[] getDataBaseBytes() {
        byte[] jvmAssetAsBytes = getJvmAssetAsBytes("/assets/resources/resources.data");
        if (jvmAssetAsBytes != null) {
            return jvmAssetAsBytes;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.veridas.resource.database.assetsprovider.IDatabaseAssetsProvider
    @Nullable
    public byte[] getStencilBytes(@NotNull String stencilFileName) {
        Intrinsics.checkNotNullParameter(stencilFileName, "stencilFileName");
        return getJvmAssetAsBytes("/assets/resources/stencils/" + stencilFileName);
    }

    @Override // com.veridas.resource.database.assetsprovider.IDatabaseAssetsProvider
    @Nullable
    public byte[] getTemplateBytes(@NotNull String templateFileName) {
        Intrinsics.checkNotNullParameter(templateFileName, "templateFileName");
        return getJvmAssetAsBytes("/assets/resources/templates/" + templateFileName);
    }
}
