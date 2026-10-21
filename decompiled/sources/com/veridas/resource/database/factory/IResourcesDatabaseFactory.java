package com.veridas.resource.database.factory;

import androidx.annotation.Keep;
import com.veridas.resource.database.IResourcesDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IResourcesDatabaseFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/veridas/resource/database/factory/IResourcesDatabaseFactory;", "", "create", "Lcom/veridas/resource/database/IResourcesDatabase;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IResourcesDatabaseFactory {
    @NotNull
    IResourcesDatabase create();
}
