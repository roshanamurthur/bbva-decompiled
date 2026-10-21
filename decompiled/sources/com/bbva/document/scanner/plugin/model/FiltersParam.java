package com.bbva.document.scanner.plugin.model;

import androidx.annotation.Keep;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FiltersParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/FiltersParam;", "", "id", "", "params", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FiltersParam {

    @NotNull
    private final String id;

    @Nullable
    private final Map<String, Object> params;

    public FiltersParam(@NotNull String id, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiltersParam copy$default(FiltersParam filtersParam, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = filtersParam.id;
        }
        if ((i10 & 2) != 0) {
            map = filtersParam.params;
        }
        return filtersParam.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.params;
    }

    @NotNull
    public final FiltersParam copy(@NotNull String id, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new FiltersParam(id, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersParam)) {
            return false;
        }
        FiltersParam filtersParam = (FiltersParam) other;
        return Intrinsics.areEqual(this.id, filtersParam.id) && Intrinsics.areEqual(this.params, filtersParam.params);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, Object> getParams() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Object> map = this.params;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "FiltersParam(id=" + this.id + ", params=" + this.params + ")";
    }

    public /* synthetic */ FiltersParam(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? q.emptyMap() : map);
    }
}
