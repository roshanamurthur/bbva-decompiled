package com.bbva.cellscore.logger;

import androidx.datastore.preferences.protobuf.e;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0005\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/bbva/cellscore/logger/Trace;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Lcom/bbva/cellscore/logger/LogModule;", "b", "Lcom/bbva/cellscore/logger/LogModule;", "getModule", "()Lcom/bbva/cellscore/logger/LogModule;", "module", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "c", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "getLevel", "()Lcom/bbva/ethermobile/elogger/LoggerLevel;", "level", "d", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/util/Map;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Trace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f27006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LogModule module;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoggerLevel level;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    public Trace(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f27006a = map;
        Object obj = map.get("module");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bbva.cellscore.logger.LogModule");
        }
        this.module = (LogModule) obj;
        Object obj2 = map.get("level");
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bbva.ethermobile.elogger.LoggerLevel");
        }
        this.level = (LoggerLevel) obj2;
        Object obj3 = map.get("message");
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.message = (String) obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Trace copy$default(Trace trace, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = trace.f27006a;
        }
        return trace.copy(map);
    }

    @NotNull
    public final Trace copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new Trace(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Trace) && Intrinsics.areEqual(this.f27006a, ((Trace) other).f27006a);
    }

    @NotNull
    public final LoggerLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final LogModule getModule() {
        return this.module;
    }

    public int hashCode() {
        return this.f27006a.hashCode();
    }

    @NotNull
    public String toString() {
        return e.g(new StringBuilder("Trace(map="), this.f27006a, RootService.CLOSE_BRACKET);
    }
}
