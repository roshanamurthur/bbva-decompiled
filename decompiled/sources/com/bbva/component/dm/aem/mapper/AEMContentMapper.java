package com.bbva.component.dm.aem.mapper;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.aem.data.model.AEMContent;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AEMContentMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/aem/mapper/AEMContentMapper;", ExifInterface.GPS_DIRECTION_TRUE, "", "map", "content", "Lcom/bbva/component/dm/aem/data/model/AEMContent;", "(Lcom/bbva/component/dm/aem/data/model/AEMContent;)Ljava/lang/Object;", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AEMContentMapper<T> {
    @Nullable
    T map(@Nullable AEMContent content);
}
