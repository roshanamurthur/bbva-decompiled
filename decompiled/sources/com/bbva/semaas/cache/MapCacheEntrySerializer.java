package com.bbva.semaas.cache;

import androidx.exifinterface.media.ExifInterface;
import bk.p;
import com.bbva.semaas.CacheEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapCacheEntrySerializer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u00030\u0002B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003H\u0016R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bbva/semaas/cache/MapCacheEntrySerializer;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/KSerializer;", "", "", "Lcom/bbva/semaas/CacheEntry;", "innerSerializer", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapCacheEntrySerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapCacheEntrySerializer.kt\ncom/bbva/semaas/cache/MapCacheEntrySerializer\n+ 2 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n153#2:45\n453#3:46\n403#3:47\n453#3:52\n403#3:53\n1238#4,4:48\n1238#4,4:54\n*S KotlinDebug\n*F\n+ 1 MapCacheEntrySerializer.kt\ncom/bbva/semaas/cache/MapCacheEntrySerializer\n*L\n17#1:45\n21#1:46\n21#1:47\n32#1:52\n32#1:53\n21#1:48,4\n32#1:54,4\n*E\n"})
public final class MapCacheEntrySerializer<T> implements KSerializer<Map<String, ? extends CacheEntry<T>>> {

    @NotNull
    private final KSerializer<T> innerSerializer;

    public MapCacheEntrySerializer(@NotNull KSerializer<T> innerSerializer) {
        Intrinsics.checkNotNullParameter(innerSerializer, "innerSerializer");
        this.innerSerializer = innerSerializer;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElementSerializer.INSTANCE).getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Map<String, CacheEntry<T>> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Map map = (Map) decoder.decodeSerializableValue(new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElementSerializer.INSTANCE));
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), (CacheEntry) Json.INSTANCE.decodeFromJsonElement(CacheEntry.INSTANCE.serializer(this.innerSerializer), (JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Map<String, CacheEntry<T>> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElementSerializer.INSTANCE);
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(value.size()));
        Iterator<T> it = value.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Json.INSTANCE.encodeToJsonElement(CacheEntry.INSTANCE.serializer(this.innerSerializer), entry.getValue()));
        }
        encoder.encodeSerializableValue(linkedHashMapSerializer, linkedHashMap);
    }
}
