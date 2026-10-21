package com.bbva.plugin.socialsharing.model.request;

import ad.d;
import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShareRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/bbva/plugin/socialsharing/model/request/ShareRequest;", "", "", "component1", "", "Lcom/bbva/plugin/socialsharing/model/request/ShareRequest$Content;", "component2", "title", "contents", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getContents", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Content", "socialsharing-plugin_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ShareRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareTitle")
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareContent")
    @NotNull
    private final List<Content> contents;

    /* JADX INFO: compiled from: ShareRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/plugin/socialsharing/model/request/ShareRequest$Content;", "", "", "component1", "component2", "component3", "source", "filename", "content", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "b", "getFilename", "c", "getContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "socialsharing-plugin_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Content {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("source")
        @NotNull
        private final String source;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("filename")
        @Nullable
        private final String filename;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("content")
        @Nullable
        private final String content;

        public Content(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            this.source = str;
            this.filename = str2;
            this.content = str3;
        }

        @NotNull
        public static /* bridge */ /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = content.source;
            }
            if ((i10 & 2) != 0) {
                str2 = content.filename;
            }
            if ((i10 & 4) != 0) {
                str3 = content.content;
            }
            return content.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final Content copy(@NotNull String source, @Nullable String filename, @Nullable String content) {
            return new Content(source, filename, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.source, content.source) && Intrinsics.areEqual(this.filename, content.filename) && Intrinsics.areEqual(this.content, content.content);
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.filename;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.content;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Content(source=");
            sb2.append(this.source);
            sb2.append(", filename=");
            sb2.append(this.filename);
            sb2.append(", content=");
            return d.f(sb2, this.content, ")");
        }
    }

    public ShareRequest(@Nullable String str, @NotNull List<Content> list) {
        this.title = str;
        this.contents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* bridge */ /* synthetic */ ShareRequest copy$default(ShareRequest shareRequest, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shareRequest.title;
        }
        if ((i10 & 2) != 0) {
            list = shareRequest.contents;
        }
        return shareRequest.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Content> component2() {
        return this.contents;
    }

    @NotNull
    public final ShareRequest copy(@Nullable String title, @NotNull List<Content> contents) {
        return new ShareRequest(title, contents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareRequest)) {
            return false;
        }
        ShareRequest shareRequest = (ShareRequest) other;
        return Intrinsics.areEqual(this.title, shareRequest.title) && Intrinsics.areEqual(this.contents, shareRequest.contents);
    }

    @NotNull
    public final List<Content> getContents() {
        return this.contents;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Content> list = this.contents;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShareRequest(title=");
        sb2.append(this.title);
        sb2.append(", contents=");
        return a.c(sb2, this.contents, ")");
    }
}
