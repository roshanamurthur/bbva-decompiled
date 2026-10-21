package com.veridas.resource.database.factory;

import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.resource.database.IResourcesDatabase;
import com.veridas.resource.database.ResourcesDatabase;
import com.veridas.resource.database.assetsprovider.AndroidDatabaseAssetsProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidResourcesDatabaseFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/veridas/resource/database/factory/AndroidResourcesDatabaseFactory;", "Lcom/veridas/resource/database/factory/IResourcesDatabaseFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "create", "Lcom/veridas/resource/database/IResourcesDatabase;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidResourcesDatabaseFactory implements IResourcesDatabaseFactory {

    @NotNull
    private final Context context;

    public AndroidResourcesDatabaseFactory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.veridas.resource.database.factory.IResourcesDatabaseFactory
    @NotNull
    public IResourcesDatabase create() {
        return new ResourcesDatabase(new AndroidDatabaseAssetsProvider(this.context), null, 2, null);
    }
}
