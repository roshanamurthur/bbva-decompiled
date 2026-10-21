package com.bbva.plugin.push.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: compiled from: Converter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/push/utils/Converter;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "convert", "from", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/bbva/plugin/push/utils/MapConverter;", "Lcom/bbva/plugin/push/utils/StringConverter;", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Converter<T, R> {
    R convert(T from);
}
