package com.bbva.component.dm.actionlauncher.model;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bB\u001f\b\u0016\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/ViewPayload;", "", "", "component1", "component2", "", "component3", "value", "mime", "flags", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "getMime", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFlags", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "", "map", "(Ljava/util/Map;)V", "Companion", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ViewPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String mime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int flags;

    /* JADX INFO: compiled from: Payload.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/ViewPayload$Companion;", "", "()V", "fromMap", "Lcom/bbva/component/dm/actionlauncher/model/ViewPayload;", "value", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ViewPayload fromMap(@NotNull Object value) {
            return value instanceof Map ? new ViewPayload((Map) value) : new ViewPayload((String) value, null, 0, 6, null);
        }
    }

    public ViewPayload(@NotNull String str, @Nullable String str2, int i10) {
        this.value = str;
        this.mime = str2;
        this.flags = i10;
    }

    @NotNull
    public static /* synthetic */ ViewPayload copy$default(ViewPayload viewPayload, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = viewPayload.value;
        }
        if ((i11 & 2) != 0) {
            str2 = viewPayload.mime;
        }
        if ((i11 & 4) != 0) {
            i10 = viewPayload.flags;
        }
        return viewPayload.copy(str, str2, i10);
    }

    @JvmStatic
    @NotNull
    public static final ViewPayload fromMap(@NotNull Object obj) {
        return INSTANCE.fromMap(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMime() {
        return this.mime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    public final ViewPayload copy(@NotNull String value, @Nullable String mime, int flags) {
        return new ViewPayload(value, mime, flags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewPayload)) {
            return false;
        }
        ViewPayload viewPayload = (ViewPayload) other;
        return Intrinsics.areEqual(this.value, viewPayload.value) && Intrinsics.areEqual(this.mime, viewPayload.mime) && this.flags == viewPayload.flags;
    }

    public final int getFlags() {
        return this.flags;
    }

    @Nullable
    public final String getMime() {
        return this.mime;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mime;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.flags;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewPayload(value=");
        sb2.append(this.value);
        sb2.append(", mime=");
        sb2.append(this.mime);
        sb2.append(", flags=");
        return a.c(sb2, this.flags, ")");
    }

    public /* synthetic */ ViewPayload(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewPayload(@NotNull Map<String, ? extends Object> map) {
        Object obj = map.get("value");
        if (obj != null) {
            String str = (String) obj;
            Object obj2 = map.get("mime");
            String str2 = (String) (obj2 instanceof String ? obj2 : null);
            Object obj3 = map.get("flags");
            Integer num = (Integer) (obj3 instanceof Integer ? obj3 : null);
            this(str, str2, num != null ? num.intValue() : 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
