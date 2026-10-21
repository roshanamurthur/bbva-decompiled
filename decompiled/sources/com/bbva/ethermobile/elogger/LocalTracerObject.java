package com.bbva.ethermobile.elogger;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003J!\u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, d2 = {"Lcom/bbva/ethermobile/elogger/LocalTracerObject;", "", "", "", "component1", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLevel", "()I", "level", "c", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", LogKeysKt.TAG, "d", "getMessage", "message", "<init>", "(Ljava/util/Map;)V", "elogger_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LocalTracerObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> map;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int level;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String tag;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    public LocalTracerObject(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        Object obj = map.get("level");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        this.level = ((Integer) obj).intValue();
        this.tag = (String) map.get(LogKeysKt.TAG);
        Object obj2 = map.get("message");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        this.message = (String) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalTracerObject copy$default(LocalTracerObject localTracerObject, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = localTracerObject.map;
        }
        return localTracerObject.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.map;
    }

    @NotNull
    public final LocalTracerObject copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new LocalTracerObject(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalTracerObject) && Intrinsics.areEqual(this.map, ((LocalTracerObject) other).map);
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final Map<String, Object> getMap() {
        return this.map;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocalTracerObject(map=" + this.map + ")";
    }
}
