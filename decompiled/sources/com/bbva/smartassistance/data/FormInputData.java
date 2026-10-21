package com.bbva.smartassistance.data;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FormInputData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004BE\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, d2 = {"Lcom/bbva/smartassistance/data/FormInputData;", "", "formInputData", "Lnet/ipsoft/amelia/sdk/FormInputData;", "(Lnet/ipsoft/amelia/sdk/FormInputData;)V", "name", "", "formType", "nameForDisplay", "allowedUserInputs", "fields", "", "Lcom/bbva/smartassistance/data/FormInputField;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAllowedUserInputs", "()Ljava/lang/String;", "getFields", "()Ljava/util/List;", "setFields", "(Ljava/util/List;)V", "getFormType", "getName", "getNameForDisplay", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFormInputData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormInputData.kt\ncom/bbva/smartassistance/data/FormInputData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n*S KotlinDebug\n*F\n+ 1 FormInputData.kt\ncom/bbva/smartassistance/data/FormInputData\n*L\n21#1:25\n21#1:26,3\n*E\n"})
public final /* data */ class FormInputData {

    @Nullable
    private final String allowedUserInputs;

    @NotNull
    private List<FormInputField> fields;

    @Nullable
    private final String formType;

    @Nullable
    private final String name;

    @Nullable
    private final String nameForDisplay;

    public FormInputData() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormInputData copy$default(FormInputData formInputData, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = formInputData.name;
        }
        if ((i10 & 2) != 0) {
            str2 = formInputData.formType;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = formInputData.nameForDisplay;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = formInputData.allowedUserInputs;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            list = formInputData.fields;
        }
        return formInputData.copy(str, str5, str6, str7, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFormType() {
        return this.formType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNameForDisplay() {
        return this.nameForDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAllowedUserInputs() {
        return this.allowedUserInputs;
    }

    @NotNull
    public final List<FormInputField> component5() {
        return this.fields;
    }

    @NotNull
    public final FormInputData copy(@Nullable String name, @Nullable String formType, @Nullable String nameForDisplay, @Nullable String allowedUserInputs, @NotNull List<FormInputField> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new FormInputData(name, formType, nameForDisplay, allowedUserInputs, fields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormInputData)) {
            return false;
        }
        FormInputData formInputData = (FormInputData) other;
        return Intrinsics.areEqual(this.name, formInputData.name) && Intrinsics.areEqual(this.formType, formInputData.formType) && Intrinsics.areEqual(this.nameForDisplay, formInputData.nameForDisplay) && Intrinsics.areEqual(this.allowedUserInputs, formInputData.allowedUserInputs) && Intrinsics.areEqual(this.fields, formInputData.fields);
    }

    @Nullable
    public final String getAllowedUserInputs() {
        return this.allowedUserInputs;
    }

    @NotNull
    public final List<FormInputField> getFields() {
        return this.fields;
    }

    @Nullable
    public final String getFormType() {
        return this.formType;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameForDisplay() {
        return this.nameForDisplay;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.formType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameForDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.allowedUserInputs;
        return this.fields.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setFields(@NotNull List<FormInputField> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.fields = list;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.formType;
        String str3 = this.nameForDisplay;
        String str4 = this.allowedUserInputs;
        List<FormInputField> list = this.fields;
        StringBuilder sbC = a.c("FormInputData(name=", str, ", formType=", str2, ", nameForDisplay=");
        k.e(sbC, str3, ", allowedUserInputs=", str4, ", fields=");
        return androidx.camera.core.imagecapture.a.c(sbC, list, ")");
    }

    public FormInputData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<FormInputField> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.name = str;
        this.formType = str2;
        this.nameForDisplay = str3;
        this.allowedUserInputs = str4;
        this.fields = fields;
    }

    public /* synthetic */ FormInputData(String str, String str2, String str3, String str4, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) == 0 ? str4 : null, (i10 & 16) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    public FormInputData(@Nullable net.ipsoft.amelia.sdk.FormInputData formInputData) {
        List<FormInputField> arrayList;
        ArrayList<net.ipsoft.amelia.sdk.FormInputField> fields;
        this(formInputData != null ? formInputData.getName() : null, formInputData != null ? formInputData.getFormType() : null, formInputData != null ? formInputData.getNameForDisplay() : null, formInputData != null ? formInputData.getAllowedUserInputs() : null, null, 16, null);
        if (formInputData != null && (fields = formInputData.getFields()) != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(fields, 10));
            Iterator<T> it = fields.iterator();
            while (it.hasNext()) {
                arrayList2.add(new FormInputField((net.ipsoft.amelia.sdk.FormInputField) it.next()));
            }
            arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            arrayList = arrayList == null ? new ArrayList<>() : arrayList;
        }
        this.fields = arrayList;
    }
}
