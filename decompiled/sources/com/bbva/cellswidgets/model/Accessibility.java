package com.bbva.cellswidgets.model;

import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsEditTextConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"B!\b\u0016\u0012\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010#¢\u0006\u0004\b!\u0010%J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JE\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006&"}, d2 = {"Lcom/bbva/cellswidgets/model/Accessibility;", "", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "component1", "component2", "component3", "component4", "component5", "description", "rightIcon", "passwordIconShow", "passwordIconHide", "showLeftIcon", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "getDescription", "()Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "b", "getRightIcon", "c", "getPasswordIconShow", "d", "getPasswordIconHide", "e", "getShowLeftIcon", "<init>", "(Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", "", "map", "(Ljava/util/Map;)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Accessibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property rightIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property passwordIconShow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property passwordIconHide;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property showLeftIcon;

    public Accessibility(@Nullable PropertiesHelper.Property property, @Nullable PropertiesHelper.Property property2, @Nullable PropertiesHelper.Property property3, @Nullable PropertiesHelper.Property property4, @Nullable PropertiesHelper.Property property5) {
        this.description = property;
        this.rightIcon = property2;
        this.passwordIconShow = property3;
        this.passwordIconHide = property4;
        this.showLeftIcon = property5;
    }

    public static /* synthetic */ Accessibility copy$default(Accessibility accessibility, PropertiesHelper.Property property, PropertiesHelper.Property property2, PropertiesHelper.Property property3, PropertiesHelper.Property property4, PropertiesHelper.Property property5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            property = accessibility.description;
        }
        if ((i10 & 2) != 0) {
            property2 = accessibility.rightIcon;
        }
        PropertiesHelper.Property property6 = property2;
        if ((i10 & 4) != 0) {
            property3 = accessibility.passwordIconShow;
        }
        PropertiesHelper.Property property7 = property3;
        if ((i10 & 8) != 0) {
            property4 = accessibility.passwordIconHide;
        }
        PropertiesHelper.Property property8 = property4;
        if ((i10 & 16) != 0) {
            property5 = accessibility.showLeftIcon;
        }
        return accessibility.copy(property, property6, property7, property8, property5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PropertiesHelper.Property getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PropertiesHelper.Property getRightIcon() {
        return this.rightIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PropertiesHelper.Property getPasswordIconShow() {
        return this.passwordIconShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PropertiesHelper.Property getPasswordIconHide() {
        return this.passwordIconHide;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PropertiesHelper.Property getShowLeftIcon() {
        return this.showLeftIcon;
    }

    @NotNull
    public final Accessibility copy(@Nullable PropertiesHelper.Property description, @Nullable PropertiesHelper.Property rightIcon, @Nullable PropertiesHelper.Property passwordIconShow, @Nullable PropertiesHelper.Property passwordIconHide, @Nullable PropertiesHelper.Property showLeftIcon) {
        return new Accessibility(description, rightIcon, passwordIconShow, passwordIconHide, showLeftIcon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Accessibility)) {
            return false;
        }
        Accessibility accessibility = (Accessibility) other;
        return Intrinsics.areEqual(this.description, accessibility.description) && Intrinsics.areEqual(this.rightIcon, accessibility.rightIcon) && Intrinsics.areEqual(this.passwordIconShow, accessibility.passwordIconShow) && Intrinsics.areEqual(this.passwordIconHide, accessibility.passwordIconHide) && Intrinsics.areEqual(this.showLeftIcon, accessibility.showLeftIcon);
    }

    @Nullable
    public final PropertiesHelper.Property getDescription() {
        return this.description;
    }

    @Nullable
    public final PropertiesHelper.Property getPasswordIconHide() {
        return this.passwordIconHide;
    }

    @Nullable
    public final PropertiesHelper.Property getPasswordIconShow() {
        return this.passwordIconShow;
    }

    @Nullable
    public final PropertiesHelper.Property getRightIcon() {
        return this.rightIcon;
    }

    @Nullable
    public final PropertiesHelper.Property getShowLeftIcon() {
        return this.showLeftIcon;
    }

    public int hashCode() {
        PropertiesHelper.Property property = this.description;
        int iHashCode = (property == null ? 0 : property.hashCode()) * 31;
        PropertiesHelper.Property property2 = this.rightIcon;
        int iHashCode2 = (iHashCode + (property2 == null ? 0 : property2.hashCode())) * 31;
        PropertiesHelper.Property property3 = this.passwordIconShow;
        int iHashCode3 = (iHashCode2 + (property3 == null ? 0 : property3.hashCode())) * 31;
        PropertiesHelper.Property property4 = this.passwordIconHide;
        int iHashCode4 = (iHashCode3 + (property4 == null ? 0 : property4.hashCode())) * 31;
        PropertiesHelper.Property property5 = this.showLeftIcon;
        return iHashCode4 + (property5 != null ? property5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Accessibility(description=" + this.description + ", rightIcon=" + this.rightIcon + ", passwordIconShow=" + this.passwordIconShow + ", passwordIconHide=" + this.passwordIconHide + ", showLeftIcon=" + this.showLeftIcon + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Accessibility(@Nullable Map<String, ? extends Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        PropertiesHelper.Property propertyAccess$toProperty = null;
        PropertiesHelper.Property propertyAccess$toProperty2 = (map == null || (obj5 = map.get("description")) == null) ? null : CellsEditTextConfigKt.access$toProperty(obj5);
        PropertiesHelper.Property propertyAccess$toProperty3 = (map == null || (obj4 = map.get("rightIcon")) == null) ? null : CellsEditTextConfigKt.access$toProperty(obj4);
        PropertiesHelper.Property propertyAccess$toProperty4 = (map == null || (obj3 = map.get("passwordIconShow")) == null) ? null : CellsEditTextConfigKt.access$toProperty(obj3);
        PropertiesHelper.Property propertyAccess$toProperty5 = (map == null || (obj2 = map.get("passwordIconHide")) == null) ? null : CellsEditTextConfigKt.access$toProperty(obj2);
        if (map != null && (obj = map.get("showleftIcon")) != null) {
            propertyAccess$toProperty = CellsEditTextConfigKt.access$toProperty(obj);
        }
        this(propertyAccess$toProperty2, propertyAccess$toProperty3, propertyAccess$toProperty4, propertyAccess$toProperty5, propertyAccess$toProperty);
    }
}
