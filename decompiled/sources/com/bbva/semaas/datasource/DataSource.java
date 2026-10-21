package com.bbva.semaas.datasource;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/semaas/datasource/DataSource;", ExifInterface.GPS_DIRECTION_TRUE, "", "execute", "Lcom/bbva/semaas/datasource/RequestResult;", FirebaseAnalytics.Param.ITEMS, "", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DataSource<T> {
    @NotNull
    RequestResult execute(@NotNull List<? extends T> items);
}
