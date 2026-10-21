package com.bbva.cells.pluginkit.command.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/Serializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "serializer", "Lkotlinx/serialization/KSerializer;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public interface Serializer<T> {
    @NotNull
    KSerializer<T> getSerializer();
}
