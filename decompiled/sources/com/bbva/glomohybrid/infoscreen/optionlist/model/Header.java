package com.bbva.glomohybrid.infoscreen.optionlist.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Header;", "", "", "component1", "component2", "component3", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "component4", "title", "description", AuthConstants.IMAGE, "accessibilityData", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTitle", "()I", "b", "getDescription", "c", "getImage", "d", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "getAccessibilityData", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "<init>", "(IIILcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Header {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int image;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AccessibilityData accessibilityData;

    public Header(@StringRes int i10, @StringRes int i11, @DrawableRes int i12, @Nullable AccessibilityData accessibilityData) {
        this.title = i10;
        this.description = i11;
        this.image = i12;
        this.accessibilityData = accessibilityData;
    }

    public static /* synthetic */ Header copy$default(Header header, int i10, int i11, int i12, AccessibilityData accessibilityData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = header.title;
        }
        if ((i13 & 2) != 0) {
            i11 = header.description;
        }
        if ((i13 & 4) != 0) {
            i12 = header.image;
        }
        if ((i13 & 8) != 0) {
            accessibilityData = header.accessibilityData;
        }
        return header.copy(i10, i11, i12, accessibilityData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AccessibilityData getAccessibilityData() {
        return this.accessibilityData;
    }

    @NotNull
    public final Header copy(@StringRes int title, @StringRes int description, @DrawableRes int image, @Nullable AccessibilityData accessibilityData) {
        return new Header(title, description, image, accessibilityData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return this.title == header.title && this.description == header.description && this.image == header.image && Intrinsics.areEqual(this.accessibilityData, header.accessibilityData);
    }

    @Nullable
    public final AccessibilityData getAccessibilityData() {
        return this.accessibilityData;
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getImage() {
        return this.image;
    }

    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i10 = ((((this.title * 31) + this.description) * 31) + this.image) * 31;
        AccessibilityData accessibilityData = this.accessibilityData;
        return i10 + (accessibilityData == null ? 0 : accessibilityData.hashCode());
    }

    @NotNull
    public String toString() {
        return "Header(title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", accessibilityData=" + this.accessibilityData + ")";
    }

    public /* synthetic */ Header(int i10, int i11, int i12, AccessibilityData accessibilityData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, (i13 & 8) != 0 ? null : accessibilityData);
    }
}
