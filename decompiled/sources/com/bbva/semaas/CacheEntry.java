package com.bbva.semaas;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileCache.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001b\u001cB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ;\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0001\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00130\u001aHÇ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/bbva/semaas/CacheEntry;", ExifInterface.GPS_DIRECTION_TRUE, "", "seen1", "", "id", "", "value", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "$serializer", "Companion", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class CacheEntry<T> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String id;
    private final T value;

    /* JADX INFO: compiled from: FileCache.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/bbva/semaas/CacheEntry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/semaas/CacheEntry;", "T0", "typeSerial0", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ SerialDescriptor get$cachedDescriptor() {
            return CacheEntry.$cachedDescriptor;
        }

        @NotNull
        public final <T0> KSerializer<CacheEntry<T0>> serializer(@NotNull KSerializer<T0> typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return new CacheEntry$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.semaas.CacheEntry", null, 2);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CacheEntry(int i10, String str, Object obj, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, $cachedDescriptor);
        }
        this.id = str;
        this.value = obj;
    }

    @JvmStatic
    public static final <T0> void write$Self(@NotNull CacheEntry<T0> self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc, @NotNull KSerializer<T0> typeSerial0) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        output.encodeStringElement(serialDesc, 0, ((CacheEntry) self).id);
        output.encodeSerializableElement(serialDesc, 1, typeSerial0, ((CacheEntry) self).value);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final T getValue() {
        return this.value;
    }

    public CacheEntry(@NotNull String id, T t10) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.value = t10;
    }
}
