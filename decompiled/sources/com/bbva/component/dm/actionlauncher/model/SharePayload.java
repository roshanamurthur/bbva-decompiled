package com.bbva.component.dm.actionlauncher.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Payload.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B=\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 B\u001f\b\u0016\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010!¢\u0006\u0004\b\u001f\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J?\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006%"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/SharePayload;", "", "", "component1", "component2", "", "component3", "component4", "title", "text", "email", "subject", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getText", "c", "Ljava/util/List;", "getEmail", "()Ljava/util/List;", "d", "getSubject", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "map", "(Ljava/util/Map;)V", "Companion", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SharePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<String> email;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String subject;

    /* JADX INFO: compiled from: Payload.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/SharePayload$Companion;", "", "()V", "fromMap", "Lcom/bbva/component/dm/actionlauncher/model/SharePayload;", "map", "", "", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SharePayload fromMap(@NotNull Map<String, ? extends Object> map) {
            return new SharePayload(map);
        }
    }

    public SharePayload() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ SharePayload copy$default(SharePayload sharePayload, String str, String str2, List list, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharePayload.title;
        }
        if ((i10 & 2) != 0) {
            str2 = sharePayload.text;
        }
        if ((i10 & 4) != 0) {
            list = sharePayload.email;
        }
        if ((i10 & 8) != 0) {
            str3 = sharePayload.subject;
        }
        return sharePayload.copy(str, str2, list, str3);
    }

    @JvmStatic
    @NotNull
    public static final SharePayload fromMap(@NotNull Map<String, ? extends Object> map) {
        return INSTANCE.fromMap(map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final List<String> component3() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @NotNull
    public final SharePayload copy(@Nullable String title, @Nullable String text, @Nullable List<String> email, @Nullable String subject) {
        return new SharePayload(title, text, email, subject);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharePayload)) {
            return false;
        }
        SharePayload sharePayload = (SharePayload) other;
        return Intrinsics.areEqual(this.title, sharePayload.title) && Intrinsics.areEqual(this.text, sharePayload.text) && Intrinsics.areEqual(this.email, sharePayload.email) && Intrinsics.areEqual(this.subject, sharePayload.subject);
    }

    @Nullable
    public final List<String> getEmail() {
        return this.email;
    }

    @Nullable
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.email;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.subject;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SharePayload(title=");
        sb2.append(this.title);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", subject=");
        return d.f(sb2, this.subject, ")");
    }

    public SharePayload(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3) {
        this.title = str;
        this.text = str2;
        this.email = list;
        this.subject = str3;
    }

    public /* synthetic */ SharePayload(String str, String str2, List list, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SharePayload(@NotNull Map<String, ? extends Object> map) {
        Object obj = map.get("title");
        String str = (String) (obj instanceof String ? obj : null);
        Object obj2 = map.get("text");
        String str2 = (String) (obj2 instanceof String ? obj2 : null);
        Object obj3 = map.get("email");
        List list = (List) (obj3 instanceof List ? obj3 : null);
        Object obj4 = map.get("subject");
        this(str, str2, list, (String) (obj4 instanceof String ? obj4 : null));
    }
}
