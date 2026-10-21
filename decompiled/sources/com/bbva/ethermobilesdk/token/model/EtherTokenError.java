package com.bbva.ethermobilesdk.token.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Exception.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;", "component1", "component2", "type", "ex", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;", "getType", "()Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;", "q0", "Ljava/lang/Throwable;", "getEx", "()Ljava/lang/Throwable;", "<init>", "(Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;Ljava/lang/Throwable;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EtherTokenError extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EtherTokenErrorType type;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Throwable ex;

    /* JADX WARN: Multi-variable type inference failed */
    public EtherTokenError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EtherTokenError copy$default(EtherTokenError etherTokenError, EtherTokenErrorType etherTokenErrorType, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            etherTokenErrorType = etherTokenError.type;
        }
        if ((i10 & 2) != 0) {
            th2 = etherTokenError.ex;
        }
        return etherTokenError.copy(etherTokenErrorType, th2);
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
    public final EtherTokenError copy(@NotNull EtherTokenErrorType type, @Nullable Throwable ex) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new EtherTokenError(type, ex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EtherTokenError)) {
            return false;
        }
        EtherTokenError etherTokenError = (EtherTokenError) other;
        return this.type == etherTokenError.type && Intrinsics.areEqual(this.ex, etherTokenError.ex);
    }

    @Nullable
    public final Throwable getEx() {
        return this.ex;
    }

    @NotNull
    public final EtherTokenErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Throwable th2 = this.ex;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "EtherTokenError(type=" + this.type + ", ex=" + this.ex + ")";
    }

    public /* synthetic */ EtherTokenError(EtherTokenErrorType etherTokenErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EtherTokenErrorType.UNKNOWN : etherTokenErrorType, (i10 & 2) != 0 ? null : th2);
    }

    public EtherTokenError(@NotNull EtherTokenErrorType type, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.ex = th2;
    }
}
