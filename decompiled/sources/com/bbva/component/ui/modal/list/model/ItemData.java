package com.bbva.component.ui.modal.list.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListModalState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$BC\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006+"}, d2 = {"Lcom/bbva/component/ui/modal/list/model/ItemData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", LogKeysKt.TAG, "text", "accessibleText", "accessibleTextOnClick", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "getText", "c", "getAccessibleText", "d", "getAccessibleTextOnClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class ItemData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String accessibleText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String accessibleTextOnClick;

    /* JADX INFO: compiled from: ListModalState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/modal/list/model/ItemData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/modal/list/model/ItemData;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ItemData> serializer() {
            return ItemData$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ItemData(int i10, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, ItemData$$serializer.INSTANCE.getDescriptor());
        }
        this.tag = str;
        this.text = str2;
        if ((i10 & 4) == 0) {
            this.accessibleText = null;
        } else {
            this.accessibleText = str3;
        }
        if ((i10 & 8) == 0) {
            this.accessibleTextOnClick = null;
        } else {
            this.accessibleTextOnClick = str4;
        }
    }

    public static /* synthetic */ ItemData copy$default(ItemData itemData, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = itemData.tag;
        }
        if ((i10 & 2) != 0) {
            str2 = itemData.text;
        }
        if ((i10 & 4) != 0) {
            str3 = itemData.accessibleText;
        }
        if ((i10 & 8) != 0) {
            str4 = itemData.accessibleTextOnClick;
        }
        return itemData.copy(str, str2, str3, str4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ItemData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.tag);
        output.encodeStringElement(serialDesc, 1, self.text);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        String str = self.accessibleText;
        if (zShouldEncodeElementDefault || str != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 3);
        String str2 = self.accessibleTextOnClick;
        if (!zShouldEncodeElementDefault2 && str2 == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str2);
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
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccessibleText() {
        return this.accessibleText;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccessibleTextOnClick() {
        return this.accessibleTextOnClick;
    }

    @NotNull
    public final ItemData copy(@NotNull String tag, @NotNull String text, @Nullable String accessibleText, @Nullable String accessibleTextOnClick) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ItemData(tag, text, accessibleText, accessibleTextOnClick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemData)) {
            return false;
        }
        ItemData itemData = (ItemData) other;
        return Intrinsics.areEqual(this.tag, itemData.tag) && Intrinsics.areEqual(this.text, itemData.text) && Intrinsics.areEqual(this.accessibleText, itemData.accessibleText) && Intrinsics.areEqual(this.accessibleTextOnClick, itemData.accessibleTextOnClick);
    }

    @Nullable
    public final String getAccessibleText() {
        return this.accessibleText;
    }

    @Nullable
    public final String getAccessibleTextOnClick() {
        return this.accessibleTextOnClick;
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
        String str = this.accessibleText;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessibleTextOnClick;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ItemData(tag=");
        sb2.append(this.tag);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", accessibleText=");
        sb2.append(this.accessibleText);
        sb2.append(", accessibleTextOnClick=");
        return d.f(sb2, this.accessibleTextOnClick, ")");
    }

    public ItemData(@NotNull String tag, @NotNull String text, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.tag = tag;
        this.text = text;
        this.accessibleText = str;
        this.accessibleTextOnClick = str2;
    }

    public /* synthetic */ ItemData(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
