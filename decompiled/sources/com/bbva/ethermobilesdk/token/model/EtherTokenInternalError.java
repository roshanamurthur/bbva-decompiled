package com.bbva.ethermobilesdk.token.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Exception.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J5\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/EtherTokenInternalError;", "", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;", "component1", "component2", "", "", "component3", "type", "ex", "extras", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;", "getType", "()Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;", "q0", "Ljava/lang/Throwable;", "getEx", "()Ljava/lang/Throwable;", "r0", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "<init>", "(Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;Ljava/lang/Throwable;Ljava/util/Map;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EtherTokenInternalError extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EtherTokenErrorType type;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Throwable ex;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> extras;

    public EtherTokenInternalError() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EtherTokenInternalError copy$default(EtherTokenInternalError etherTokenInternalError, EtherTokenErrorType etherTokenErrorType, Throwable th2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            etherTokenErrorType = etherTokenInternalError.type;
        }
        if ((i10 & 2) != 0) {
            th2 = etherTokenInternalError.ex;
        }
        if ((i10 & 4) != 0) {
            map = etherTokenInternalError.extras;
        }
        return etherTokenInternalError.copy(etherTokenErrorType, th2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EtherTokenErrorType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getEx() {
        return this.ex;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.extras;
    }

    @NotNull
    public final EtherTokenInternalError copy(@NotNull EtherTokenErrorType type, @Nullable Throwable ex, @NotNull Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new EtherTokenInternalError(type, ex, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EtherTokenInternalError)) {
            return false;
        }
        EtherTokenInternalError etherTokenInternalError = (EtherTokenInternalError) other;
        return this.type == etherTokenInternalError.type && Intrinsics.areEqual(this.ex, etherTokenInternalError.ex) && Intrinsics.areEqual(this.extras, etherTokenInternalError.extras);
    }

    @Nullable
    public final Throwable getEx() {
        return this.ex;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @NotNull
    public final EtherTokenErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Throwable th2 = this.ex;
        return this.extras.hashCode() + ((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "EtherTokenInternalError(type=" + this.type + ", ex=" + this.ex + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ EtherTokenInternalError(EtherTokenErrorType etherTokenErrorType, Throwable th2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EtherTokenErrorType.UNKNOWN : etherTokenErrorType, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? new LinkedHashMap() : map);
    }

    public EtherTokenInternalError(@NotNull EtherTokenErrorType type, @Nullable Throwable th2, @NotNull Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.type = type;
        this.ex = th2;
        this.extras = extras;
    }
}
