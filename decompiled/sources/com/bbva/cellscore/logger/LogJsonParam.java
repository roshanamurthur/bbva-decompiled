package com.bbva.cellscore.logger;

import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/cellscore/logger/LogJsonParam;", "Lcom/bbva/cellscore/logger/LogParam;", "Lcom/bbva/cellscore/logger/LogSerializer;", "serializer", "", "serialize", "component1", "", "component2", "name", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LogJsonParam implements LogParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object value;

    public LogJsonParam(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = obj;
    }

    public static /* synthetic */ LogJsonParam copy$default(LogJsonParam logJsonParam, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = logJsonParam.name;
        }
        if ((i10 & 2) != 0) {
            obj = logJsonParam.value;
        }
        return logJsonParam.copy(str, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final LogJsonParam copy(@NotNull String name, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LogJsonParam(name, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogJsonParam)) {
            return false;
        }
        LogJsonParam logJsonParam = (LogJsonParam) other;
        return Intrinsics.areEqual(this.name, logJsonParam.name) && Intrinsics.areEqual(this.value, logJsonParam.value);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @Override // com.bbva.cellscore.logger.LogParam
    @NotNull
    public String serialize(@NotNull LogSerializer serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return Constant.BRACKET_OPEN + this.name + '=' + serializer.serialize(this.value) + AbstractJsonLexerKt.END_LIST;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LogJsonParam(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        return v.d(sb2, this.value, RootService.CLOSE_BRACKET);
    }
}
