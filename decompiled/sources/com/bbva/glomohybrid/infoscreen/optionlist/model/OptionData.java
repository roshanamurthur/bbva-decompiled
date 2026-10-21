package com.bbva.glomohybrid.infoscreen.optionlist.model;

import androidx.annotation.StringRes;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001:\u00018BQ\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003JU\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u0011\u0010#\"\u0004\b$\u0010%R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "", "", "component1", "component2", "", "component3", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData$Type;", "component4", "", "component5", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "component6", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/ButtonLink;", "component7", "title", "description", "isExpanded", "type", "route", "accessibilityData", "buttonLink", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTitle", "()I", "b", "getDescription", "c", "Z", "()Z", "setExpanded", "(Z)V", "d", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData$Type;", "getType", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData$Type;", "e", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "f", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "getAccessibilityData", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "g", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/ButtonLink;", "getButtonLink", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/ButtonLink;", "<init>", "(IIZLcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData$Type;Ljava/lang/String;Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;Lcom/bbva/glomohybrid/infoscreen/optionlist/model/ButtonLink;)V", UUIDPreferences.TYPE_KEY, "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class OptionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isExpanded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String route;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AccessibilityData accessibilityData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ButtonLink buttonLink;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: OptionData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData$Type;", "", ExpectedUserActionOnPoiTypes.NONE, "NAVIGATION", "NAVIGATION_BUNDLE", "APP", "CLOSE", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type APP;
        public static final Type CLOSE;
        public static final Type NAVIGATION;
        public static final Type NAVIGATION_BUNDLE;
        public static final Type NONE;

        static {
            Type type = new Type(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = type;
            Type type2 = new Type("NAVIGATION", 1);
            NAVIGATION = type2;
            Type type3 = new Type("NAVIGATION_BUNDLE", 2);
            NAVIGATION_BUNDLE = type3;
            Type type4 = new Type("APP", 3);
            APP = type4;
            Type type5 = new Type("CLOSE", 4);
            CLOSE = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr);
        }

        public Type() {
            throw null;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public OptionData(@StringRes int i10, @StringRes int i11, boolean z10, @NotNull Type type, @Nullable String str, @Nullable AccessibilityData accessibilityData, @Nullable ButtonLink buttonLink) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.title = i10;
        this.description = i11;
        this.isExpanded = z10;
        this.type = type;
        this.route = str;
        this.accessibilityData = accessibilityData;
        this.buttonLink = buttonLink;
    }

    public static /* synthetic */ OptionData copy$default(OptionData optionData, int i10, int i11, boolean z10, Type type, String str, AccessibilityData accessibilityData, ButtonLink buttonLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = optionData.title;
        }
        if ((i12 & 2) != 0) {
            i11 = optionData.description;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            z10 = optionData.isExpanded;
        }
        boolean z11 = z10;
        if ((i12 & 8) != 0) {
            type = optionData.type;
        }
        Type type2 = type;
        if ((i12 & 16) != 0) {
            str = optionData.route;
        }
        String str2 = str;
        if ((i12 & 32) != 0) {
            accessibilityData = optionData.accessibilityData;
        }
        AccessibilityData accessibilityData2 = accessibilityData;
        if ((i12 & 64) != 0) {
            buttonLink = optionData.buttonLink;
        }
        return optionData.copy(i10, i13, z11, type2, str2, accessibilityData2, buttonLink);
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
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AccessibilityData getAccessibilityData() {
        return this.accessibilityData;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ButtonLink getButtonLink() {
        return this.buttonLink;
    }

    @NotNull
    public final OptionData copy(@StringRes int title, @StringRes int description, boolean isExpanded, @NotNull Type type, @Nullable String route, @Nullable AccessibilityData accessibilityData, @Nullable ButtonLink buttonLink) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new OptionData(title, description, isExpanded, type, route, accessibilityData, buttonLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionData)) {
            return false;
        }
        OptionData optionData = (OptionData) other;
        return this.title == optionData.title && this.description == optionData.description && this.isExpanded == optionData.isExpanded && this.type == optionData.type && Intrinsics.areEqual(this.route, optionData.route) && Intrinsics.areEqual(this.accessibilityData, optionData.accessibilityData) && Intrinsics.areEqual(this.buttonLink, optionData.buttonLink);
    }

    @Nullable
    public final AccessibilityData getAccessibilityData() {
        return this.accessibilityData;
    }

    @Nullable
    public final ButtonLink getButtonLink() {
        return this.buttonLink;
    }

    public final int getDescription() {
        return this.description;
    }

    @Nullable
    public final String getRoute() {
        return this.route;
    }

    public final int getTitle() {
        return this.title;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public int hashCode() {
        int i10 = ((this.title * 31) + this.description) * 31;
        boolean z10 = this.isExpanded;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int iHashCode = (this.type.hashCode() + ((i10 + r1) * 31)) * 31;
        String str = this.route;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AccessibilityData accessibilityData = this.accessibilityData;
        int iHashCode3 = (iHashCode2 + (accessibilityData == null ? 0 : accessibilityData.hashCode())) * 31;
        ButtonLink buttonLink = this.buttonLink;
        return iHashCode3 + (buttonLink != null ? buttonLink.hashCode() : 0);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z10) {
        this.isExpanded = z10;
    }

    @NotNull
    public String toString() {
        return "OptionData(title=" + this.title + ", description=" + this.description + ", isExpanded=" + this.isExpanded + ", type=" + this.type + ", route=" + this.route + ", accessibilityData=" + this.accessibilityData + ", buttonLink=" + this.buttonLink + ")";
    }

    public /* synthetic */ OptionData(int i10, int i11, boolean z10, Type type, String str, AccessibilityData accessibilityData, ButtonLink buttonLink, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? false : z10, type, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : accessibilityData, (i12 & 64) != 0 ? null : buttonLink);
    }
}
