package com.bbva.showinfo.nativemodal.modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeListModalConfiguration.kt */
/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J?\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J&\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÁ\u0001¢\u0006\u0002\b,J\u0019\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u00063"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/Item;", "Landroid/os/Parcelable;", "seen1", "", LogKeysKt.TAG, "", "text", "_accessibleText", "accessibleTextOnClick", "selected", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "accessibleText", "getAccessibleText", "()Ljava/lang/String;", "getAccessibleTextOnClick", "getSelected", "()Z", "setSelected", "(Z)V", "getTag", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$showinfo_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
public final /* data */ class Item implements Parcelable {

    @Nullable
    private final String _accessibleText;

    @Nullable
    private final String accessibleTextOnClick;
    private boolean selected;

    @NotNull
    private final String tag;

    @NotNull
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Item> CREATOR = new Creator();

    /* JADX INFO: compiled from: NativeListModalConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/showinfo/nativemodal/modal/Item$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/showinfo/nativemodal/modal/Item;", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Item> serializer() {
            return Item$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NativeListModalConfiguration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Item> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Item createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Item(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Item[] newArray(int i10) {
            return new Item[i10];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Item(int i10, String str, String str2, String str3, String str4, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 15, Item$$serializer.INSTANCE.getDescriptor());
        }
        this.tag = str;
        this.text = str2;
        this._accessibleText = str3;
        this.accessibleTextOnClick = str4;
        if ((i10 & 16) == 0) {
            this.selected = false;
        } else {
            this.selected = z10;
        }
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String get_accessibleText() {
        return this._accessibleText;
    }

    public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = item.tag;
        }
        if ((i10 & 2) != 0) {
            str2 = item.text;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = item._accessibleText;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = item.accessibleTextOnClick;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = item.selected;
        }
        return item.copy(str, str5, str6, str7, z10);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$showinfo_release(Item self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.tag);
        output.encodeStringElement(serialDesc, 1, self.text);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self._accessibleText);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.accessibleTextOnClick);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.selected) {
            output.encodeBooleanElement(serialDesc, 4, self.selected);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccessibleTextOnClick() {
        return this.accessibleTextOnClick;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final Item copy(@NotNull String tag, @NotNull String text, @Nullable String _accessibleText, @Nullable String accessibleTextOnClick, boolean selected) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        return new Item(tag, text, _accessibleText, accessibleTextOnClick, selected);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Intrinsics.areEqual(this.tag, item.tag) && Intrinsics.areEqual(this.text, item.text) && Intrinsics.areEqual(this._accessibleText, item._accessibleText) && Intrinsics.areEqual(this.accessibleTextOnClick, item.accessibleTextOnClick) && this.selected == item.selected;
    }

    @NotNull
    public final String getAccessibleText() {
        String str = this._accessibleText;
        return str == null ? this.text : str;
    }

    @Nullable
    public final String getAccessibleTextOnClick() {
        return this.accessibleTextOnClick;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iC = n1.c(this.text, this.tag.hashCode() * 31, 31);
        String str = this._accessibleText;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessibleTextOnClick;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.selected ? 1231 : 1237);
    }

    public final void setSelected(boolean z10) {
        this.selected = z10;
    }

    @NotNull
    public String toString() {
        String str = this.tag;
        String str2 = this.text;
        String str3 = this._accessibleText;
        String str4 = this.accessibleTextOnClick;
        boolean z10 = this.selected;
        StringBuilder sbC = a.c("Item(tag=", str, ", text=", str2, ", _accessibleText=");
        k.e(sbC, str3, ", accessibleTextOnClick=", str4, ", selected=");
        return i.c(sbC, z10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.tag);
        parcel.writeString(this.text);
        parcel.writeString(this._accessibleText);
        parcel.writeString(this.accessibleTextOnClick);
        parcel.writeInt(this.selected ? 1 : 0);
    }

    public Item(@NotNull String tag, @NotNull String text, @Nullable String str, @Nullable String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.tag = tag;
        this.text = text;
        this._accessibleText = str;
        this.accessibleTextOnClick = str2;
        this.selected = z10;
    }

    public /* synthetic */ Item(String str, String str2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? false : z10);
    }
}
