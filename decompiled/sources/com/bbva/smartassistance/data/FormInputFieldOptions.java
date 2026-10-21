package com.bbva.smartassistance.data;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FormInputFieldOptions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004BA\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006("}, d2 = {"Lcom/bbva/smartassistance/data/FormInputFieldOptions;", "", "fieldOptions", "Lnet/ipsoft/amelia/sdk/FormInputFieldOptions;", "(Lnet/ipsoft/amelia/sdk/FormInputFieldOptions;)V", "selected", "", BaseMenuItem.STATE_DISABLED, BaseMenuItem.STATE_HIDDEN, "name", "", "value", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getDisabled", "()Ljava/lang/Boolean;", "setDisabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getHidden", "setHidden", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSelected", "setSelected", "getValue", "setValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/bbva/smartassistance/data/FormInputFieldOptions;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FormInputFieldOptions {

    @Nullable
    private Boolean disabled;

    @Nullable
    private Boolean hidden;

    @Nullable
    private String name;

    @Nullable
    private Boolean selected;

    @Nullable
    private String value;

    public FormInputFieldOptions() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FormInputFieldOptions copy$default(FormInputFieldOptions formInputFieldOptions, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = formInputFieldOptions.selected;
        }
        if ((i10 & 2) != 0) {
            bool2 = formInputFieldOptions.disabled;
        }
        Boolean bool4 = bool2;
        if ((i10 & 4) != 0) {
            bool3 = formInputFieldOptions.hidden;
        }
        Boolean bool5 = bool3;
        if ((i10 & 8) != 0) {
            str = formInputFieldOptions.name;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = formInputFieldOptions.value;
        }
        return formInputFieldOptions.copy(bool, bool4, bool5, str3, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final FormInputFieldOptions copy(@Nullable Boolean selected, @Nullable Boolean disabled, @Nullable Boolean hidden, @Nullable String name, @Nullable String value) {
        return new FormInputFieldOptions(selected, disabled, hidden, name, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormInputFieldOptions)) {
            return false;
        }
        FormInputFieldOptions formInputFieldOptions = (FormInputFieldOptions) other;
        return Intrinsics.areEqual(this.selected, formInputFieldOptions.selected) && Intrinsics.areEqual(this.disabled, formInputFieldOptions.disabled) && Intrinsics.areEqual(this.hidden, formInputFieldOptions.hidden) && Intrinsics.areEqual(this.name, formInputFieldOptions.name) && Intrinsics.areEqual(this.value, formInputFieldOptions.value);
    }

    @Nullable
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Boolean bool = this.selected;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.disabled;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hidden;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.name;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDisabled(@Nullable Boolean bool) {
        this.disabled = bool;
    }

    public final void setHidden(@Nullable Boolean bool) {
        this.hidden = bool;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.selected = bool;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.selected;
        Boolean bool2 = this.disabled;
        Boolean bool3 = this.hidden;
        String str = this.name;
        String str2 = this.value;
        StringBuilder sb2 = new StringBuilder("FormInputFieldOptions(selected=");
        sb2.append(bool);
        sb2.append(", disabled=");
        sb2.append(bool2);
        sb2.append(", hidden=");
        sb2.append(bool3);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", value=");
        return d.f(sb2, str2, ")");
    }

    public FormInputFieldOptions(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable String str2) {
        this.selected = bool;
        this.disabled = bool2;
        this.hidden = bool3;
        this.name = str;
        this.value = str2;
    }

    public /* synthetic */ FormInputFieldOptions(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2, (i10 & 4) != 0 ? Boolean.FALSE : bool3, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2);
    }

    public FormInputFieldOptions(@Nullable net.ipsoft.amelia.sdk.FormInputFieldOptions formInputFieldOptions) {
        this(formInputFieldOptions != null ? Boolean.valueOf(formInputFieldOptions.getSelected()) : null, formInputFieldOptions != null ? Boolean.valueOf(formInputFieldOptions.getDisabled()) : null, formInputFieldOptions != null ? Boolean.valueOf(formInputFieldOptions.getHidden()) : null, formInputFieldOptions != null ? formInputFieldOptions.getName() : null, formInputFieldOptions != null ? formInputFieldOptions.getValue() : null);
    }
}
