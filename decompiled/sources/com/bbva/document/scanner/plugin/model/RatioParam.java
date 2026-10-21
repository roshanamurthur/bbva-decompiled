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

/* JADX INFO: compiled from: RatioParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/RatioParam;", "", "type", "", "parameters", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getParameters", "()Ljava/util/Map;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RatioParam {

    @NotNull
    private final Map<String, Object> parameters;

    @NotNull
    private final String type;

    public RatioParam(@NotNull String type, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.type = type;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatioParam copy$default(RatioParam ratioParam, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ratioParam.type;
        }
        if ((i10 & 2) != 0) {
            map = ratioParam.parameters;
        }
        return ratioParam.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.parameters;
    }

    @NotNull
    public final RatioParam copy(@NotNull String type, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new RatioParam(type, parameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatioParam)) {
            return false;
        }
        RatioParam ratioParam = (RatioParam) other;
        return Intrinsics.areEqual(this.type, ratioParam.type) && Intrinsics.areEqual(this.parameters, ratioParam.parameters);
    }

    @NotNull
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RatioParam(type=" + this.type + ", parameters=" + this.parameters + ")";
    }

    public /* synthetic */ RatioParam(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? q.emptyMap() : map);
    }
}
