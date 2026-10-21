package com.bbva.component.ui.login.handler;

import com.bbva.component.ui.login.model.InputFieldData;
import com.bbva.component.ui.login.model.InputFieldIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FormValidatorHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u0004R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/ui/login/handler/FormValidatorHandler;", "", "Lcom/bbva/component/ui/login/model/InputFieldData;", "formFieldData", "", "addFormFieldData", "", "newValue", "onDocumentListSelectorChange", "newInputData", "onEditTextChange", "", "dataResult", "initialize", "Lkotlinx/coroutines/flow/StateFlow;", "", "c", "Lkotlinx/coroutines/flow/StateFlow;", "isFormValid", "()Lkotlinx/coroutines/flow/StateFlow;", "<init>", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFormValidatorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormValidatorHandler.kt\ncom/bbva/component/ui/login/handler/FormValidatorHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n766#2:54\n857#2,2:55\n2634#2:57\n766#2:59\n857#2,2:60\n2634#2:62\n1549#2:64\n1620#2,3:65\n819#2:68\n847#2,2:69\n1#3:58\n1#3:63\n*S KotlinDebug\n*F\n+ 1 FormValidatorHandler.kt\ncom/bbva/component/ui/login/handler/FormValidatorHandler\n*L\n21#1:54\n21#1:55,2\n22#1:57\n29#1:59\n29#1:60,2\n30#1:62\n37#1:64\n37#1:65,3\n38#1:68\n38#1:69,2\n22#1:58\n30#1:63\n*E\n"})
public final class FormValidatorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f28505a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f28506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StateFlow<Boolean> isFormValid;

    public FormValidatorHandler() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f28506b = MutableStateFlow;
        this.isFormValid = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void a() {
        ArrayList arrayList = this.f28505a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boolean.valueOf(((InputFieldData) it.next()).validate()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!((Boolean) obj).booleanValue()) {
                arrayList3.add(obj);
            }
        }
        this.f28506b.setValue(Boolean.valueOf(arrayList3.isEmpty()));
    }

    public final void addFormFieldData(@NotNull InputFieldData formFieldData) {
        Intrinsics.checkNotNullParameter(formFieldData, "formFieldData");
        this.f28505a.add(formFieldData);
    }

    @NotNull
    public final List<InputFieldData> dataResult() {
        return this.f28505a;
    }

    public final void initialize() {
        this.f28505a.clear();
        this.f28506b.setValue(Boolean.FALSE);
    }

    @NotNull
    public final StateFlow<Boolean> isFormValid() {
        return this.isFormValid;
    }

    public final void onDocumentListSelectorChange(@NotNull String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        ArrayList arrayList = this.f28505a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InputFieldData) obj).getInputFieldIdentifier() == InputFieldIdentifier.DOCUMENT_TYPE) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((InputFieldData) it.next()).setInputText(newValue);
        }
        a();
    }

    public final void onEditTextChange(@NotNull InputFieldData newInputData) {
        Intrinsics.checkNotNullParameter(newInputData, "newInputData");
        ArrayList arrayList = this.f28505a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InputFieldData) obj).getId() == newInputData.getId()) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((InputFieldData) it.next()).setInputText(newInputData.getNewTextValue());
        }
        a();
    }
}
