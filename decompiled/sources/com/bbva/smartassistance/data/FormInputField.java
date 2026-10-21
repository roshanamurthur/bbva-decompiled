package com.bbva.smartassistance.data;

import androidx.annotation.Keep;
import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FormInputField.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B-\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/bbva/smartassistance/data/FormInputField;", "", "inputField", "Lnet/ipsoft/amelia/sdk/FormInputField;", "(Lnet/ipsoft/amelia/sdk/FormInputField;)V", "name", "", "fieldType", "options", "", "Lcom/bbva/smartassistance/data/FormInputFieldOptions;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFieldType", "()Ljava/lang/String;", "setFieldType", "(Ljava/lang/String;)V", "getName", "setName", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFormInputField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormInputField.kt\ncom/bbva/smartassistance/data/FormInputField\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n*S KotlinDebug\n*F\n+ 1 FormInputField.kt\ncom/bbva/smartassistance/data/FormInputField\n*L\n16#1:21\n16#1:22,3\n*E\n"})
public final /* data */ class FormInputField {

    @Nullable
    private String fieldType;

    @Nullable
    private String name;

    @NotNull
    private List<FormInputFieldOptions> options;

    public FormInputField() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormInputField copy$default(FormInputField formInputField, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = formInputField.name;
        }
        if ((i10 & 2) != 0) {
            str2 = formInputField.fieldType;
        }
        if ((i10 & 4) != 0) {
            list = formInputField.options;
        }
        return formInputField.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFieldType() {
        return this.fieldType;
    }

    @NotNull
    public final List<FormInputFieldOptions> component3() {
        return this.options;
    }

    @NotNull
    public final FormInputField copy(@Nullable String name, @Nullable String fieldType, @NotNull List<FormInputFieldOptions> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new FormInputField(name, fieldType, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormInputField)) {
            return false;
        }
        FormInputField formInputField = (FormInputField) other;
        return Intrinsics.areEqual(this.name, formInputField.name) && Intrinsics.areEqual(this.fieldType, formInputField.fieldType) && Intrinsics.areEqual(this.options, formInputField.options);
    }

    @Nullable
    public final String getFieldType() {
        return this.fieldType;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<FormInputFieldOptions> getOptions() {
        return this.options;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fieldType;
        return this.options.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void setFieldType(@Nullable String str) {
        this.fieldType = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOptions(@NotNull List<FormInputFieldOptions> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.options = list;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.fieldType;
        return a.c(androidx.constraintlayout.core.parser.a.c("FormInputField(name=", str, ", fieldType=", str2, ", options="), this.options, ")");
    }

    public FormInputField(@Nullable String str, @Nullable String str2, @NotNull List<FormInputFieldOptions> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = str;
        this.fieldType = str2;
        this.options = options;
    }

    public /* synthetic */ FormInputField(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? new ArrayList() : list);
    }

    public FormInputField(@Nullable net.ipsoft.amelia.sdk.FormInputField formInputField) {
        List listEmptyList;
        ArrayList<net.ipsoft.amelia.sdk.FormInputFieldOptions> options;
        this(formInputField != null ? formInputField.getName() : null, formInputField != null ? formInputField.getFieldType() : null, null, 4, null);
        List<FormInputFieldOptions> list = this.options;
        if (formInputField != null && (options = formInputField.getOptions()) != null) {
            listEmptyList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                listEmptyList.add(new FormInputFieldOptions((net.ipsoft.amelia.sdk.FormInputFieldOptions) it.next()));
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        list.addAll(listEmptyList);
    }
}
