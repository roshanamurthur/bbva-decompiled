package com.veridas.obj;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectCropProviderFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/veridas/obj/ObjectCropProviderFactory;", "", "create", "Lcom/veridas/obj/ObjectCropProvider;", "context", "Landroid/content/Context;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ObjectCropProviderFactory {
    @NotNull
    ObjectCropProvider create(@NotNull Context context);
}
