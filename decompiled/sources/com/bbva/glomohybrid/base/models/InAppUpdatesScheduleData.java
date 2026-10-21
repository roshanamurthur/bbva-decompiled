package com.bbva.glomohybrid.base.models;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomoutils.time.StringDate;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppUpdatesScheduleData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b!\u0010\"B5\b\u0017\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/bbva/glomohybrid/base/models/InAppUpdatesScheduleData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "version", "times", "dateShown", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getVersion", "()I", "b", "getTimes", "c", "Ljava/lang/String;", "getDateShown", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Base_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class InAppUpdatesScheduleData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int times;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String dateShown;

    /* JADX INFO: compiled from: InAppUpdatesScheduleData.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/models/InAppUpdatesScheduleData$Companion;", "", "()V", "create", "Lcom/bbva/glomohybrid/base/models/InAppUpdatesScheduleData;", "version", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InAppUpdatesScheduleData create(int version) {
            return new InAppUpdatesScheduleData(version, 1, StringDate.getToday$default(StringDate.INSTANCE, null, 1, null));
        }

        @NotNull
        public final KSerializer<InAppUpdatesScheduleData> serializer() {
            return InAppUpdatesScheduleData$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InAppUpdatesScheduleData(int i10, int i11, int i12, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, InAppUpdatesScheduleData$$serializer.INSTANCE.getDescriptor());
        }
        this.version = i11;
        this.times = i12;
        this.dateShown = str;
    }

    public static /* synthetic */ InAppUpdatesScheduleData copy$default(InAppUpdatesScheduleData inAppUpdatesScheduleData, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = inAppUpdatesScheduleData.version;
        }
        if ((i12 & 2) != 0) {
            i11 = inAppUpdatesScheduleData.times;
        }
        if ((i12 & 4) != 0) {
            str = inAppUpdatesScheduleData.dateShown;
        }
        return inAppUpdatesScheduleData.copy(i10, i11, str);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(InAppUpdatesScheduleData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.version);
        output.encodeIntElement(serialDesc, 1, self.times);
        output.encodeStringElement(serialDesc, 2, self.dateShown);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimes() {
        return this.times;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDateShown() {
        return this.dateShown;
    }

    @NotNull
    public final InAppUpdatesScheduleData copy(int version, int times, @NotNull String dateShown) {
        Intrinsics.checkNotNullParameter(dateShown, "dateShown");
        return new InAppUpdatesScheduleData(version, times, dateShown);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppUpdatesScheduleData)) {
            return false;
        }
        InAppUpdatesScheduleData inAppUpdatesScheduleData = (InAppUpdatesScheduleData) other;
        return this.version == inAppUpdatesScheduleData.version && this.times == inAppUpdatesScheduleData.times && Intrinsics.areEqual(this.dateShown, inAppUpdatesScheduleData.dateShown);
    }

    @NotNull
    public final String getDateShown() {
        return this.dateShown;
    }

    public final int getTimes() {
        return this.times;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.dateShown.hashCode() + (((this.version * 31) + this.times) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InAppUpdatesScheduleData(version=");
        sb2.append(this.version);
        sb2.append(", times=");
        sb2.append(this.times);
        sb2.append(", dateShown=");
        return d.f(sb2, this.dateShown, ")");
    }

    public InAppUpdatesScheduleData(int i10, int i11, @NotNull String dateShown) {
        Intrinsics.checkNotNullParameter(dateShown, "dateShown");
        this.version = i10;
        this.times = i11;
        this.dateShown = dateShown;
    }
}
