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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B-\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fB\u001f\b\u0016\u0012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\u001e\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J3\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/ShareFilePayload;", "", "", "component1", "component2", "component3", "", "component4", "title", "uri", "mimeType", "flags", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getUri", "c", "getMimeType", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFlags", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "map", "(Ljava/util/Map;)V", "Companion", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ShareFilePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String uri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mimeType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int flags;

    /* JADX INFO: compiled from: Payload.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/ShareFilePayload$Companion;", "", "()V", "fromMap", "Lcom/bbva/component/dm/actionlauncher/model/ShareFilePayload;", "map", "", "", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ShareFilePayload fromMap(@NotNull Map<String, ? extends Object> map) {
            return new ShareFilePayload(map);
        }
    }

    public ShareFilePayload(@Nullable String str, @NotNull String str2, @NotNull String str3, int i10) {
        this.title = str;
        this.uri = str2;
        this.mimeType = str3;
        this.flags = i10;
    }

    @NotNull
    public static /* synthetic */ ShareFilePayload copy$default(ShareFilePayload shareFilePayload, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareFilePayload.title;
        }
        if ((i11 & 2) != 0) {
            str2 = shareFilePayload.uri;
        }
        if ((i11 & 4) != 0) {
            str3 = shareFilePayload.mimeType;
        }
        if ((i11 & 8) != 0) {
            i10 = shareFilePayload.flags;
        }
        return shareFilePayload.copy(str, str2, str3, i10);
    }

    @JvmStatic
    @NotNull
    public static final ShareFilePayload fromMap(@NotNull Map<String, ? extends Object> map) {
        return INSTANCE.fromMap(map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    public final ShareFilePayload copy(@Nullable String title, @NotNull String uri, @NotNull String mimeType, int flags) {
        return new ShareFilePayload(title, uri, mimeType, flags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareFilePayload)) {
            return false;
        }
        ShareFilePayload shareFilePayload = (ShareFilePayload) other;
        return Intrinsics.areEqual(this.title, shareFilePayload.title) && Intrinsics.areEqual(this.uri, shareFilePayload.uri) && Intrinsics.areEqual(this.mimeType, shareFilePayload.mimeType) && this.flags == shareFilePayload.flags;
    }

    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uri;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.flags;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShareFilePayload(title=");
        sb2.append(this.title);
        sb2.append(", uri=");
        sb2.append(this.uri);
        sb2.append(", mimeType=");
        sb2.append(this.mimeType);
        sb2.append(", flags=");
        return a.c(sb2, this.flags, ")");
    }

    public /* synthetic */ ShareFilePayload(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, str3, (i11 & 8) != 0 ? 0 : i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareFilePayload(@NotNull Map<String, ? extends Object> map) {
        Object obj = map.get("title");
        String str = (String) (obj instanceof String ? obj : null);
        Object obj2 = map.get("uri");
        if (obj2 != null) {
            String str2 = (String) obj2;
            Object obj3 = map.get("mime");
            if (obj3 != null) {
                String str3 = (String) obj3;
                Object obj4 = map.get("flags");
                Integer num = (Integer) (obj4 instanceof Integer ? obj4 : null);
                this(str, str2, str3, num != null ? num.intValue() : 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
