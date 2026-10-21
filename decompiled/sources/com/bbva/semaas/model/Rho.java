package com.bbva.semaas.model;

import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Map;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Events.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002#$Bg\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BK\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u0011J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006%"}, d2 = {"Lcom/bbva/semaas/model/Rho;", "Lcom/bbva/semaas/model/Span;", "seen1", "", "mrId", "", "spanId", "traceId", LogKeysKt.PROPERTIES, "", "name", LogKeysKt.START_DATE, "", "finishDate", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;JJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V", "getFinishDate", "()J", "getMrId", "()Ljava/lang/String;", "getName", "getProperties", "()Ljava/util/Map;", "getSpanId", "getStartDate", "getTraceId", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class Rho extends Span {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long finishDate;

    @NotNull
    private final String mrId;

    @NotNull
    private final String name;

    @Nullable
    private final Map<String, String> properties;

    @NotNull
    private final String spanId;
    private final long startDate;

    @NotNull
    private final String traceId;

    /* JADX INFO: compiled from: Events.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/semaas/model/Rho$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/semaas/model/Rho;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Rho> serializer() {
            return Rho$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Rho(int i10, String str, String str2, String str3, Map map, String str4, long j10, long j11, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if (127 != (i10 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 127, Rho$$serializer.INSTANCE.getDescriptor());
        }
        this.mrId = str;
        this.spanId = str2;
        this.traceId = str3;
        this.properties = map;
        this.name = str4;
        this.startDate = j10;
        this.finishDate = j11;
    }

    @JvmStatic
    public static final void write$Self(@NotNull Rho self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        Span.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.getMrId());
        output.encodeStringElement(serialDesc, 1, self.getSpanId());
        output.encodeStringElement(serialDesc, 2, self.getTraceId());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.getProperties());
        output.encodeStringElement(serialDesc, 4, self.name);
        output.encodeLongElement(serialDesc, 5, self.startDate);
        output.encodeLongElement(serialDesc, 6, self.finishDate);
    }

    public final long getFinishDate() {
        return this.finishDate;
    }

    @Override // com.bbva.semaas.model.Span
    @NotNull
    public String getMrId() {
        return this.mrId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.bbva.semaas.model.Span
    @Nullable
    public Map<String, String> getProperties() {
        return this.properties;
    }

    @Override // com.bbva.semaas.model.Span
    @NotNull
    public String getSpanId() {
        return this.spanId;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    @Override // com.bbva.semaas.model.Span
    @NotNull
    public String getTraceId() {
        return this.traceId;
    }

    public Rho(@NotNull String mrId, @NotNull String spanId, @NotNull String traceId, @Nullable Map<String, String> map, @NotNull String name, long j10, long j11) {
        Intrinsics.checkNotNullParameter(mrId, "mrId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.mrId = mrId;
        this.spanId = spanId;
        this.traceId = traceId;
        this.properties = map;
        this.name = name;
        this.startDate = j10;
        this.finishDate = j11;
    }
}
