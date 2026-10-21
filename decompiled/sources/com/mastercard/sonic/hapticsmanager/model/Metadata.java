package com.mastercard.sonic.hapticsmanager.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Metadata.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/model/Metadata;", "", "", "component1", "component2", "component3", "component4", "component5", "description", "created", "project", "title", k.a.f65040g, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "b", "getCreated", "c", "getProject", "d", "getTitle", "e", "getTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Metadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Created")
    @NotNull
    private final String created;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Project")
    @NotNull
    private final String project;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Tags")
    @NotNull
    private final String tags;

    public Metadata(@NotNull String description, @NotNull String created, @NotNull String project, @NotNull String title, @NotNull String tags) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(created, "created");
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.description = description;
        this.created = created;
        this.project = project;
        this.title = title;
        this.tags = tags;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metadata.description;
        }
        if ((i10 & 2) != 0) {
            str2 = metadata.created;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = metadata.project;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = metadata.title;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = metadata.tags;
        }
        return metadata.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreated() {
        return this.created;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProject() {
        return this.project;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTags() {
        return this.tags;
    }

    @NotNull
    public final Metadata copy(@NotNull String description, @NotNull String created, @NotNull String project, @NotNull String title, @NotNull String tags) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(created, "created");
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new Metadata(description, created, project, title, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) other;
        return Intrinsics.areEqual(this.description, metadata.description) && Intrinsics.areEqual(this.created, metadata.created) && Intrinsics.areEqual(this.project, metadata.project) && Intrinsics.areEqual(this.title, metadata.title) && Intrinsics.areEqual(this.tags, metadata.tags);
    }

    @NotNull
    public final String getCreated() {
        return this.created;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getProject() {
        return this.project;
    }

    @NotNull
    public final String getTags() {
        return this.tags;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tags.hashCode() + n1.c(this.title, n1.c(this.project, n1.c(this.created, this.description.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.description;
        String str2 = this.created;
        String str3 = this.project;
        String str4 = this.title;
        String str5 = this.tags;
        StringBuilder sbC = a.c("Metadata(description=", str, ", created=", str2, ", project=");
        androidx.collection.k.e(sbC, str3, ", title=", str4, ", tags=");
        return d.f(sbC, str5, ")");
    }
}
