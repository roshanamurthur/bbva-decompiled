package com.bbva.cellswidgets.edittext;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cellswidgets.CellsVisibility;
import com.bbva.cellswidgets.CellsVisibilityKt;
import com.bbva.cellswidgets.PropertyLoader;
import com.bbva.cellswidgets.model.Accessibility;
import com.bbva.cellswidgets.model.CellsEditTextConfig;
import com.bbva.cellswidgets.model.ValidationRule;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsEditTextViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0019J\u0014\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0010\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\bR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0!8F¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020'0!8F¢\u0006\u0006\u001a\u0004\b(\u0010#R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020)0!8F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0!8F¢\u0006\u0006\u001a\u0004\b,\u0010#R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0!8F¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060!8F¢\u0006\u0006\u001a\u0004\b/\u0010#R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060!8F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u00102\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002040!8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0!8F¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060!8F¢\u0006\u0006\u001a\u0004\b8\u0010#¨\u0006>"}, d2 = {"Lcom/bbva/cellswidgets/edittext/CellsEditTextViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bbva/cellswidgets/model/CellsEditTextConfig;", "config", "", "setConfig", "", "hasError", "", "text", "onlyOnType", "hasFocus", "validate", "actionButtonClicked", "actionLeftButtonClicked", ClearCommand.ID, "isPasswordVisible", "", "maxLength", "setMaxLength", "(Ljava/lang/Integer;)V", "mask", "setMask", "inputType", "setInputType", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "validations", "changeValidations", LogKeysKt.TAG, "setTag", "Landroidx/lifecycle/LiveData;", "getHint", "()Landroidx/lifecycle/LiveData;", "hint", "getMaxLength", "getMask", "Lcom/bbva/cellswidgets/edittext/CellsInputType;", "getInputType", "Lcom/bbva/cellswidgets/CellsVisibility;", "getVisibility", "visibility", "getValidations", "getUnfilledValidation", "unfilledValidation", "getHidden", BaseMenuItem.STATE_HIDDEN, "getClear", "isPassword", "()Z", "Lcom/bbva/cellswidgets/model/Accessibility;", "getAccessibility", Constants.ACCESSIBILITY, "getTag", "getShowLeftIcon", "showLeftIcon", "Lcom/bbva/cellswidgets/PropertyLoader;", "propertyLoader", "<init>", "(Lcom/bbva/cellswidgets/PropertyLoader;)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsEditTextViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsEditTextViewModel.kt\ncom/bbva/cellswidgets/edittext/CellsEditTextViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1#2:171\n1726#3,3:172\n766#3:175\n857#3,2:176\n766#3:178\n857#3,2:179\n*S KotlinDebug\n*F\n+ 1 CellsEditTextViewModel.kt\ncom/bbva/cellswidgets/edittext/CellsEditTextViewModel\n*L\n143#1:172,3\n162#1:175\n162#1:176,2\n163#1:178\n163#1:179,2\n*E\n"})
public final class CellsEditTextViewModel extends ViewModel {

    @NotNull
    public final MutableLiveData<Boolean> E0;

    @NotNull
    public final MutableLiveData<String> F0;

    @NotNull
    public final MutableLiveData<Boolean> G0;
    public boolean H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PropertyLoader f27282p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f27283q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f27284r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f27285s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CellsInputType> f27286t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CellsVisibility> f27287u0;

    @NotNull
    public final MutableLiveData<Accessibility> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<ValidationRule>> f27288w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ValidationRule> f27289x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f27290y0;

    public CellsEditTextViewModel(@NotNull PropertyLoader propertyLoader) {
        Intrinsics.checkNotNullParameter(propertyLoader, "propertyLoader");
        this.f27282p0 = propertyLoader;
        this.f27283q0 = new MutableLiveData<>();
        this.f27284r0 = new MutableLiveData<>();
        this.f27285s0 = new MutableLiveData<>();
        this.f27286t0 = new MutableLiveData<>();
        this.f27287u0 = new MutableLiveData<>();
        this.v0 = new MutableLiveData<>();
        this.f27288w0 = new MutableLiveData<>();
        this.f27289x0 = new MutableLiveData<>();
        this.f27290y0 = new MutableLiveData<>();
        this.E0 = new MutableLiveData<>();
        this.F0 = new MutableLiveData<>();
        this.G0 = new MutableLiveData<>();
    }

    public static /* synthetic */ void validate$default(CellsEditTextViewModel cellsEditTextViewModel, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        cellsEditTextViewModel.validate(str, z10, z11);
    }

    public final void actionButtonClicked() {
        if (!isPassword()) {
            this.E0.setValue(Boolean.TRUE);
            return;
        }
        MutableLiveData<Boolean> mutableLiveData = this.f27290y0;
        mutableLiveData.setValue(Boolean.valueOf(!Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE)));
        MutableLiveData<Accessibility> mutableLiveData2 = this.v0;
        mutableLiveData2.setValue(mutableLiveData2.getValue());
    }

    public final void actionLeftButtonClicked() {
        this.E0.setValue(Boolean.TRUE);
    }

    public final void changeValidations(@NotNull List<ValidationRule> validations) {
        Intrinsics.checkNotNullParameter(validations, "validations");
        this.f27288w0.setValue(validations);
    }

    public final boolean clear() {
        Boolean bool = (!isPassword() || Intrinsics.areEqual(getHidden().getValue(), Boolean.FALSE)) ? null : Boolean.TRUE;
        this.E0.setValue(bool);
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    @NotNull
    public final LiveData<Accessibility> getAccessibility() {
        return this.v0;
    }

    @NotNull
    public final LiveData<Boolean> getClear() {
        return this.E0;
    }

    @NotNull
    public final LiveData<Boolean> getHidden() {
        return this.f27290y0;
    }

    @NotNull
    public final LiveData<String> getHint() {
        return this.f27283q0;
    }

    @NotNull
    public final LiveData<CellsInputType> getInputType() {
        return this.f27286t0;
    }

    @NotNull
    public final LiveData<String> getMask() {
        return this.f27285s0;
    }

    @NotNull
    public final LiveData<Integer> getMaxLength() {
        return this.f27284r0;
    }

    @NotNull
    public final LiveData<Boolean> getShowLeftIcon() {
        return this.G0;
    }

    @NotNull
    public final LiveData<String> getTag() {
        return this.F0;
    }

    @NotNull
    public final LiveData<ValidationRule> getUnfilledValidation() {
        return this.f27289x0;
    }

    @NotNull
    public final LiveData<List<ValidationRule>> getValidations() {
        return this.f27288w0;
    }

    @NotNull
    public final LiveData<CellsVisibility> getVisibility() {
        return this.f27287u0;
    }

    public final boolean hasError() {
        return getUnfilledValidation().getValue() != null;
    }

    public final boolean isPassword() {
        return getInputType().getValue() == CellsInputType.PASSWORD || getInputType().getValue() == CellsInputType.PASSWORD_NUMBER || getInputType().getValue() == CellsInputType.PASSWORD_CUSTOM;
    }

    public final boolean isPasswordVisible() {
        return isPassword() && Intrinsics.areEqual(getHidden().getValue(), Boolean.FALSE);
    }

    public final boolean isValid(@NotNull CharSequence text) {
        List<ValidationRule> value;
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0 || (value = getValidations().getValue()) == null) {
            return true;
        }
        List<ValidationRule> list = value;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((ValidationRule) it.next()).isValid(text.toString())) {
                return false;
            }
        }
        return true;
    }

    public final void setConfig(@NotNull CellsEditTextConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f27283q0.setValue(this.f27282p0.getString(config.getHint()));
        MutableLiveData<Integer> mutableLiveData = this.f27284r0;
        Integer maxLength = config.getMaxLength();
        String mask = config.getMask();
        Integer numValueOf = mask != null ? Integer.valueOf(mask.length()) : null;
        if (numValueOf != null) {
            maxLength = numValueOf;
        }
        mutableLiveData.setValue(maxLength);
        this.f27285s0.setValue(config.getMask());
        MutableLiveData<CellsVisibility> mutableLiveData2 = this.f27287u0;
        PropertiesHelper.Property visibility = config.getVisibility();
        mutableLiveData2.setValue(CellsVisibilityKt.toCellsVisibility(visibility != null ? visibility.getValue() : null));
        this.f27288w0.setValue(config.getValidations());
        CellsInputType cellsInputType = CellsInputTypeKt.toCellsInputType(config.getInputType());
        this.f27286t0.setValue(cellsInputType);
        this.f27290y0.setValue(Boolean.valueOf(cellsInputType == CellsInputType.PASSWORD_NUMBER || cellsInputType == CellsInputType.PASSWORD || cellsInputType == CellsInputType.PASSWORD_CUSTOM));
        this.H0 = config.getShowLeftIcon();
        this.v0.setValue(config.getAccessibility());
        this.F0.setValue(config.getTag());
    }

    public final void setInputType(@Nullable String inputType) {
        this.f27286t0.setValue(CellsInputTypeKt.toCellsInputType(inputType));
    }

    public final void setMask(@Nullable String mask) {
        this.f27285s0.setValue(mask);
        MutableLiveData<Integer> mutableLiveData = this.f27284r0;
        Integer value = mutableLiveData.getValue();
        Integer numValueOf = mask != null ? Integer.valueOf(mask.length()) : null;
        if (numValueOf != null) {
            value = numValueOf;
        }
        mutableLiveData.setValue(value);
    }

    public final void setMaxLength(@Nullable Integer maxLength) {
        MutableLiveData<Integer> mutableLiveData = this.f27284r0;
        String value = this.f27285s0.getValue();
        Integer numValueOf = value != null ? Integer.valueOf(value.length()) : null;
        if (numValueOf != null) {
            maxLength = numValueOf;
        }
        mutableLiveData.setValue(maxLength);
    }

    public final void setTag(@Nullable String tag) {
        this.F0.setValue(tag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final void validate(@NotNull String text, boolean onlyOnType, boolean hasFocus) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(text, "text");
        List<ValidationRule> value = getValidations().getValue();
        if (value == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                ValidationRule validationRule = (ValidationRule) obj;
                if (!hasFocus || !onlyOnType || validationRule.getValidateOnType()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!((ValidationRule) obj2).isValid(text)) {
                    arrayList.add(obj2);
                }
            }
        }
        MutableLiveData<ValidationRule> mutableLiveData = this.f27289x0;
        boolean z10 = !((Collection) arrayList).isEmpty();
        ?? r10 = arrayList;
        if (!z10) {
            r10 = 0;
        }
        mutableLiveData.setValue(r10 != 0 ? (ValidationRule) CollectionsKt___CollectionsKt.first((List) r10) : null);
        this.G0.setValue(Boolean.valueOf(!Intrinsics.areEqual(text, "") && this.H0));
    }
}
