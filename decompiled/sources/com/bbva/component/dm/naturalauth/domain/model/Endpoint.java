package com.bbva.component.dm.naturalauth.domain.model;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import ci.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Endpoint.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "", "", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "host", "b", "getPath", "path", "getUrl", "url", "Delete", "Get", "Post", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint$Delete;", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint$Get;", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint$Post;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public abstract class Endpoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String host;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint$Delete;", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "", "component1", "component2", "host", "path", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "d", "getPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Delete extends Endpoint {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String host;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Delete(@NotNull String host, @NotNull String path) {
            super(host, path, null);
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(path, "path");
            this.host = host;
            this.path = path;
        }

        public static /* synthetic */ Delete copy$default(Delete delete, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = delete.host;
            }
            if ((i10 & 2) != 0) {
                str2 = delete.path;
            }
            return delete.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final Delete copy(@NotNull String host, @NotNull String path) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(path, "path");
            return new Delete(host, path);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Delete)) {
                return false;
            }
            Delete delete = (Delete) other;
            return Intrinsics.areEqual(this.host, delete.host) && Intrinsics.areEqual(this.path, delete.path);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        @NotNull
        public String getHost() {
            return this.host;
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        @NotNull
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode() + (this.host.hashCode() * 31);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        public void setHost(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.host = str;
        }

        @NotNull
        public String toString() {
            return d.f(a.d("Delete(host=", this.host, ", path="), this.path, ")");
        }
    }

    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint$Get;", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "", "component1", "component2", "host", "path", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "d", "getPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Get extends Endpoint {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String host;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get(@NotNull String host, @NotNull String path) {
            super(host, path, null);
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(path, "path");
            this.host = host;
            this.path = path;
        }

        public static /* synthetic */ Get copy$default(Get get, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = get.host;
            }
            if ((i10 & 2) != 0) {
                str2 = get.path;
            }
            return get.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final Get copy(@NotNull String host, @NotNull String path) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(path, "path");
            return new Get(host, path);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Get)) {
                return false;
            }
            Get get = (Get) other;
            return Intrinsics.areEqual(this.host, get.host) && Intrinsics.areEqual(this.path, get.path);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        @NotNull
        public String getHost() {
            return this.host;
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        @NotNull
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode() + (this.host.hashCode() * 31);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        public void setHost(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.host = str;
        }

        @NotNull
        public String toString() {
            return d.f(a.d("Get(host=", this.host, ", path="), this.path, ")");
        }
    }

    /* JADX INFO: compiled from: Endpoint.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint$Post;", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "", "component1", "component2", "host", "path", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "d", "getPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Post extends Endpoint {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String host;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Post(@NotNull String host, @NotNull String path) {
            super(host, path, null);
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(path, "path");
            this.host = host;
            this.path = path;
        }

        public static /* synthetic */ Post copy$default(Post post, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = post.host;
            }
            if ((i10 & 2) != 0) {
                str2 = post.path;
            }
            return post.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final Post copy(@NotNull String host, @NotNull String path) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(path, "path");
            return new Post(host, path);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Post)) {
                return false;
            }
            Post post = (Post) other;
            return Intrinsics.areEqual(this.host, post.host) && Intrinsics.areEqual(this.path, post.path);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        @NotNull
        public String getHost() {
            return this.host;
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        @NotNull
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode() + (this.host.hashCode() * 31);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.Endpoint
        public void setHost(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.host = str;
        }

        @NotNull
        public String toString() {
            return d.f(a.d("Post(host=", this.host, ", path="), this.path, ")");
        }
    }

    public Endpoint(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.host = str;
        this.path = str2;
    }

    @NotNull
    public String getHost() {
        return this.host;
    }

    @NotNull
    public String getPath() {
        return this.path;
    }

    @NotNull
    public final String getUrl() {
        return u.f(getHost(), getPath());
    }

    public void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }
}
