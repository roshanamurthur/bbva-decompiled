package com.bbva.cellswidgets.model;

import bk.i;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.nativesettings.common.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsEditTextConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u0000 52\u00020\u0001:\u000256B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b3\u00104J!\u0010\u0005\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R(\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\"0!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u0011\u00102\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/bbva/cellswidgets/model/CellsEditTextConfig;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "getHint", "()Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "hint", "value", "getInputType", "()Ljava/lang/String;", "setInputType", "(Ljava/lang/String;)V", "inputType", "getCustomCharactersRegex", "setCustomCharactersRegex", "customCharactersRegex", "getMask", "setMask", "mask", "getMaxLength", "()Ljava/lang/Integer;", "setMaxLength", "(Ljava/lang/Integer;)V", "maxLength", "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "getValidations", "()Ljava/util/List;", "setValidations", "(Ljava/util/List;)V", "validations", "getVisibility", "visibility", "Lcom/bbva/cellswidgets/model/Accessibility;", "getAccessibility", "()Lcom/bbva/cellswidgets/model/Accessibility;", Constants.ACCESSIBILITY, "getTag", LogKeysKt.TAG, "getShowLeftIcon", "()Z", "showLeftIcon", "<init>", "(Ljava/util/Map;)V", "Companion", "InputType", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsEditTextConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsEditTextConfig.kt\ncom/bbva/cellswidgets/model/CellsEditTextConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1549#2:120\n1620#2,3:121\n*S KotlinDebug\n*F\n+ 1 CellsEditTextConfig.kt\ncom/bbva/cellswidgets/model/CellsEditTextConfig\n*L\n75#1:120\n75#1:121,3\n*E\n"})
public final /* data */ class CellsEditTextConfig {

    @NotNull
    public static final String INPUT_TYPE_CUSTOM = "custom";

    @NotNull
    public static final String INPUT_TYPE_CUSTOM_PASSWORD = "customPassword";

    @NotNull
    public static final String INPUT_TYPE_DEFAULT = "default";

    @NotNull
    public static final String INPUT_TYPE_NUMBER = "number";

    @NotNull
    public static final String INPUT_TYPE_NUMBER_PASSWORD = "numberPassword";

    @NotNull
    public static final String INPUT_TYPE_PASSWORD = "password";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f27306a;

    /* JADX INFO: compiled from: CellsEditTextConfig.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/bbva/cellswidgets/model/CellsEditTextConfig$InputType;", "", "cells-widgets_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface InputType {
    }

    public CellsEditTextConfig(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f27306a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CellsEditTextConfig copy$default(CellsEditTextConfig cellsEditTextConfig, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = cellsEditTextConfig.f27306a;
        }
        return cellsEditTextConfig.copy(map);
    }

    @NotNull
    public final CellsEditTextConfig copy(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new CellsEditTextConfig(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CellsEditTextConfig) && Intrinsics.areEqual(this.f27306a, ((CellsEditTextConfig) other).f27306a);
    }

    @NotNull
    public final Accessibility getAccessibility() {
        Object obj = this.f27306a.get(Constants.ACCESSIBILITY);
        return new Accessibility(obj instanceof Map ? (Map) obj : null);
    }

    @Nullable
    public final String getCustomCharactersRegex() {
        Object obj = this.f27306a.get("customCharactersRegex");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public final PropertiesHelper.Property getHint() {
        Object obj = this.f27306a.get("hint");
        if (obj != null) {
            return CellsEditTextConfigKt.access$toProperty(obj);
        }
        return null;
    }

    @Nullable
    public final String getInputType() {
        Object obj = this.f27306a.get("inputType");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public final String getMask() {
        Object obj = this.f27306a.get("mask");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public final Integer getMaxLength() {
        Object obj = this.f27306a.get("maxLength");
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    public final boolean getShowLeftIcon() {
        Object obj = this.f27306a.get("showLeftIcon");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Nullable
    public final String getTag() {
        Object obj = this.f27306a.get(LogKeysKt.TAG);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<com.bbva.cellswidgets.model.ValidationRule>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @NotNull
    public final List<ValidationRule> getValidations() {
        Object obj = this.f27306a.get("validations");
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ?? FilterIsInstance = i.filterIsInstance(list, ValidationRule.class);
        if (!(!((Collection) FilterIsInstance).isEmpty())) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any?>>");
            List list2 = (List) obj;
            FilterIsInstance = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                FilterIsInstance.add(new ValidationRule((Map) it.next()));
            }
        }
        return FilterIsInstance;
    }

    @Nullable
    public final PropertiesHelper.Property getVisibility() {
        Object obj = this.f27306a.get("visibility");
        if (obj != null) {
            return CellsEditTextConfigKt.access$toProperty(obj);
        }
        return null;
    }

    public int hashCode() {
        return this.f27306a.hashCode();
    }

    public final void setCustomCharactersRegex(@Nullable String str) {
        this.f27306a.put("customCharactersRegex", str);
    }

    public final void setInputType(@Nullable String str) {
        if (str == null) {
            str = "default";
        }
        this.f27306a.put("inputType", str);
    }

    public final void setMask(@Nullable String str) {
        this.f27306a.put("mask", str);
    }

    public final void setMaxLength(@Nullable Integer num) {
        this.f27306a.put("maxLength", num);
    }

    public final void setValidations(@NotNull List<ValidationRule> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27306a.put("validations", value);
    }

    @NotNull
    public String toString() {
        return "CellsEditTextConfig(map=" + this.f27306a + ")";
    }
}
