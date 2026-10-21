package com.veridas.resource.database.factory;

import androidx.annotation.Keep;
import com.veridas.resource.database.IResourcesDatabase;
import com.veridas.resource.database.ResourcesDatabase;
import com.veridas.resource.database.assetsprovider.JvmDatabaseAssetsProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmResourcesDatabaseFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/veridas/resource/database/factory/JvmResourcesDatabaseFactory;", "Lcom/veridas/resource/database/factory/IResourcesDatabaseFactory;", "()V", "create", "Lcom/veridas/resource/database/IResourcesDatabase;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JvmResourcesDatabaseFactory implements IResourcesDatabaseFactory {
    @Override // com.veridas.resource.database.factory.IResourcesDatabaseFactory
    @NotNull
    public IResourcesDatabase create() {
        return new ResourcesDatabase(new JvmDatabaseAssetsProvider(), null, 2, null);
    }
}
