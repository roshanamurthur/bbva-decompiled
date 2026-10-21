package kotlinx.serialization.internal;

import androidx.camera.core.impl.v;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003:\u0001\u0014B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\bJ)\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/serialization/internal/KeyValueSerializer;", "", "keySerializer", "Lkotlinx/serialization/KSerializer;", "valueSerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "key", "getKey", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "value", "getValue", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "MapEntry", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {

    @NotNull
    private final SerialDescriptor descriptor;

    /* JADX INFO: compiled from: Tuples.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00028\u0002\u0012\u0006\u0010\u0010\u001a\u00028\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001a\u0010\f\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "value", "getValue", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {
        private final K key;
        private final V value;

        public MapEntry(K k10, V v3) {
            this.key = k10;
            this.value = v3;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) other;
            return Intrinsics.areEqual(this.key, mapEntry.key) && Intrinsics.areEqual(this.value, mapEntry.value);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.key;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v3 = this.value;
            return iHashCode + (v3 != null ? v3.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MapEntry(key=");
            sb2.append(this.key);
            sb2.append(", value=");
            return v.d(sb2, this.value, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(@NotNull final KSerializer<K> keySerializer, @NotNull final KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", StructureKind.MAP.INSTANCE, new SerialDescriptor[0], new Function1<ClassSerialDescriptorBuilder, Unit>() { // from class: kotlinx.serialization.internal.MapEntrySerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                invoke2(classSerialDescriptorBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ClassSerialDescriptorBuilder buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "key", keySerializer.getDescriptor(), null, false, 12, null);
                ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", valueSerializer.getDescriptor(), null, false, 12, null);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    @NotNull
    public Map.Entry<K, V> toResult(K key, V value) {
        return new MapEntry(key, value);
    }
}
