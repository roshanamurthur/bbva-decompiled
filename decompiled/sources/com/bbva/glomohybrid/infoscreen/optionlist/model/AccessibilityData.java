package com.bbva.glomohybrid.infoscreen.optionlist.model;

import androidx.annotation.StringRes;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J4\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "titleDescription", "description", "imageDescription", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AccessibilityData;", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Integer;", "getTitleDescription", "b", "getDescription", "c", "getImageDescription", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AccessibilityData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer titleDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer imageDescription;

    public AccessibilityData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AccessibilityData copy$default(AccessibilityData accessibilityData, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = accessibilityData.titleDescription;
        }
        if ((i10 & 2) != 0) {
            num2 = accessibilityData.description;
        }
        if ((i10 & 4) != 0) {
            num3 = accessibilityData.imageDescription;
        }
        return accessibilityData.copy(num, num2, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTitleDescription() {
        return this.titleDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getImageDescription() {
        return this.imageDescription;
    }

    @NotNull
    public final AccessibilityData copy(@StringRes @Nullable Integer titleDescription, @StringRes @Nullable Integer description, @StringRes @Nullable Integer imageDescription) {
        return new AccessibilityData(titleDescription, description, imageDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibilityData)) {
            return false;
        }
        AccessibilityData accessibilityData = (AccessibilityData) other;
        return Intrinsics.areEqual(this.titleDescription, accessibilityData.titleDescription) && Intrinsics.areEqual(this.description, accessibilityData.description) && Intrinsics.areEqual(this.imageDescription, accessibilityData.imageDescription);
    }

    @Nullable
    public final Integer getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getImageDescription() {
        return this.imageDescription;
    }

    @Nullable
    public final Integer getTitleDescription() {
        return this.titleDescription;
    }

    public int hashCode() {
        Integer num = this.titleDescription;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.description;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.imageDescription;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessibilityData(titleDescription=" + this.titleDescription + ", description=" + this.description + ", imageDescription=" + this.imageDescription + ")";
    }

    public AccessibilityData(@StringRes @Nullable Integer num, @StringRes @Nullable Integer num2, @StringRes @Nullable Integer num3) {
        this.titleDescription = num;
        this.description = num2;
        this.imageDescription = num3;
    }

    public /* synthetic */ AccessibilityData(Integer num, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3);
    }
}
