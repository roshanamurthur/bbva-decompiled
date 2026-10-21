package com.bbva.component.dm.singlesignon.mapper;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SSOContentMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/singlesignon/mapper/SSOContentMapper;", ExifInterface.GPS_DIRECTION_TRUE, "", "map", "content", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnResponse;", "(Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnResponse;)Ljava/lang/Object;", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SSOContentMapper<T> {
    @Nullable
    T map(@Nullable SingleSignOnResponse content);
}
