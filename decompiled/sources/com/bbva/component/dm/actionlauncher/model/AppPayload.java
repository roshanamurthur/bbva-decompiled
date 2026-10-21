package com.bbva.component.dm.actionlauncher.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Payload.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017B\u001f\b\u0016\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/AppPayload;", "", "", "component1", "", "component2", "packageName", "marketFallback", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "Z", "getMarketFallback", "()Z", "<init>", "(Ljava/lang/String;Z)V", "", "map", "(Ljava/util/Map;)V", "Companion", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AppPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean marketFallback;

    /* JADX INFO: compiled from: Payload.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/AppPayload$Companion;", "", "()V", "fromMap", "Lcom/bbva/component/dm/actionlauncher/model/AppPayload;", "map", "", "", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AppPayload fromMap(@NotNull Map<String, ? extends Object> map) {
            return new AppPayload(map);
        }
    }

    public AppPayload(@NotNull String str, boolean z10) {
        this.packageName = str;
        this.marketFallback = z10;
    }

    @NotNull
    public static /* synthetic */ AppPayload copy$default(AppPayload appPayload, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appPayload.packageName;
        }
        if ((i10 & 2) != 0) {
            z10 = appPayload.marketFallback;
        }
        return appPayload.copy(str, z10);
    }

    @JvmStatic
    @NotNull
    public static final AppPayload fromMap(@NotNull Map<String, ? extends Object> map) {
        return INSTANCE.fromMap(map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMarketFallback() {
        return this.marketFallback;
    }

    @NotNull
    public final AppPayload copy(@NotNull String packageName, boolean marketFallback) {
        return new AppPayload(packageName, marketFallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppPayload)) {
            return false;
        }
        AppPayload appPayload = (AppPayload) other;
        return Intrinsics.areEqual(this.packageName, appPayload.packageName) && this.marketFallback == appPayload.marketFallback;
    }

    public final boolean getMarketFallback() {
        return this.marketFallback;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        String str = this.packageName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z10 = this.marketFallback;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppPayload(packageName=");
        sb2.append(this.packageName);
        sb2.append(", marketFallback=");
        return i.c(sb2, this.marketFallback, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppPayload(@NotNull Map<String, ? extends Object> map) {
        Object obj = map.get("packageName");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) obj;
        Object obj2 = map.get("marketFallback");
        if (obj2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        }
        this(str, ((Boolean) obj2).booleanValue());
    }
}
