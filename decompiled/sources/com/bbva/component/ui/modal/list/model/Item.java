package com.bbva.component.ui.modal.list.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Item.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003JI\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/bbva/component/ui/modal/list/model/Item;", "", "", "component1", "component2", "component4", "", "component5", "", "component6", LogKeysKt.TAG, "text", "_accessibleText", "accessibleTextOnClick", "position", "selected", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "getText", "d", "getAccessibleTextOnClick", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPosition", "()I", "f", "Z", "getSelected", "()Z", "setSelected", "(Z)V", "getAccessibleText", "accessibleText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Item {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f28725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String accessibleTextOnClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int position;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean selected;

    public Item(@NotNull String tag, @NotNull String text, @Nullable String str, @Nullable String str2, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.tag = tag;
        this.text = text;
        this.f28725c = str;
        this.accessibleTextOnClick = str2;
        this.position = i10;
        this.selected = z10;
    }

    public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = item.tag;
        }
        if ((i11 & 2) != 0) {
            str2 = item.text;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = item.f28725c;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = item.accessibleTextOnClick;
        }
        String str7 = str4;
        if ((i11 & 16) != 0) {
            i10 = item.position;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            z10 = item.selected;
        }
        return item.copy(str, str5, str6, str7, i12, z10);
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
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final Item copy(@NotNull String tag, @NotNull String text, @Nullable String _accessibleText, @Nullable String accessibleTextOnClick, int position, boolean selected) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        return new Item(tag, text, _accessibleText, accessibleTextOnClick, position, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Intrinsics.areEqual(this.tag, item.tag) && Intrinsics.areEqual(this.text, item.text) && Intrinsics.areEqual(this.f28725c, item.f28725c) && Intrinsics.areEqual(this.accessibleTextOnClick, item.accessibleTextOnClick) && this.position == item.position && this.selected == item.selected;
    }

    @NotNull
    public final String getAccessibleText() {
        String str = this.f28725c;
        return str == null ? this.text : str;
    }

    @Nullable
    public final String getAccessibleTextOnClick() {
        return this.accessibleTextOnClick;
    }

    public final int getPosition() {
        return this.position;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.text, this.tag.hashCode() * 31, 31);
        String str = this.f28725c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessibleTextOnClick;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.position) * 31;
        boolean z10 = this.selected;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final void setSelected(boolean z10) {
        this.selected = z10;
    }

    @NotNull
    public String toString() {
        return "Item(tag=" + this.tag + ", text=" + this.text + ", _accessibleText=" + this.f28725c + ", accessibleTextOnClick=" + this.accessibleTextOnClick + ", position=" + this.position + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ Item(String str, String str2, String str3, String str4, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i10, (i11 & 32) != 0 ? false : z10);
    }
}
