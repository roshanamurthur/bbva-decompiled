package com.bbva.showinfo.nativemodal.modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeListModalConfiguration.kt */
/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"J\u0019\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006)"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "Landroid/os/Parcelable;", "seen1", "", "selected", "", "values", "", "Lcom/bbva/showinfo/nativemodal/modal/Item;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;)V", "getSelected", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$showinfo_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
public final /* data */ class NativeListModalConfiguration implements Parcelable {

    @Nullable
    private final String selected;

    @Nullable
    private final List<Item> values;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<NativeListModalConfiguration> CREATOR = new Creator();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(Item$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: NativeListModalConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<NativeListModalConfiguration> serializer() {
            return NativeListModalConfiguration$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NativeListModalConfiguration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NativeListModalConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NativeListModalConfiguration createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(Item.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new NativeListModalConfiguration(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NativeListModalConfiguration[] newArray(int i10) {
            return new NativeListModalConfiguration[i10];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ NativeListModalConfiguration(int i10, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, NativeListModalConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.selected = str;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeListModalConfiguration copy$default(NativeListModalConfiguration nativeListModalConfiguration, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nativeListModalConfiguration.selected;
        }
        if ((i10 & 2) != 0) {
            list = nativeListModalConfiguration.values;
        }
        return nativeListModalConfiguration.copy(str, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$showinfo_release(NativeListModalConfiguration self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.selected);
        output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.values);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelected() {
        return this.selected;
    }

    @Nullable
    public final List<Item> component2() {
        return this.values;
    }

    @NotNull
    public final NativeListModalConfiguration copy(@Nullable String selected, @Nullable List<Item> values) {
        return new NativeListModalConfiguration(selected, values);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeListModalConfiguration)) {
            return false;
        }
        NativeListModalConfiguration nativeListModalConfiguration = (NativeListModalConfiguration) other;
        return Intrinsics.areEqual(this.selected, nativeListModalConfiguration.selected) && Intrinsics.areEqual(this.values, nativeListModalConfiguration.values);
    }

    @Nullable
    public final String getSelected() {
        return this.selected;
    }

    @Nullable
    public final List<Item> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.selected;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Item> list = this.values;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeListModalConfiguration(selected=" + this.selected + ", values=" + this.values + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.selected);
        List<Item> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Item> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public NativeListModalConfiguration(@Nullable String str, @Nullable List<Item> list) {
        this.selected = str;
        this.values = list;
    }
}
