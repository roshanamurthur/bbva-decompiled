package com.bbva.ethermobilesdk.ethercore;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.ethercore.EtherClient;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/ethercore/EtherApi;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/ethercore/EtherClient;", "", "createClient", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Lcom/bbva/ethermobilesdk/ethercore/EtherClient;", "ethercore_release"}, k = 1, mv = {1, 1, 16})
public interface EtherApi<T extends EtherClient> {
    @NotNull
    T createClient(@NotNull Context context);
}
