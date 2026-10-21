package com.bbva.component.dm.settings.domain.model;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\t\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/GlomoContinuityUseCaseModel;", "", "", "component1", "component2", "", "component3", "id", "name", "isCodified", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getName", "c", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class GlomoContinuityUseCaseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isCodified;

    public GlomoContinuityUseCaseModel(@NotNull String id, @NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.isCodified = z10;
    }

    public static /* synthetic */ GlomoContinuityUseCaseModel copy$default(GlomoContinuityUseCaseModel glomoContinuityUseCaseModel, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = glomoContinuityUseCaseModel.id;
        }
        if ((i10 & 2) != 0) {
            str2 = glomoContinuityUseCaseModel.name;
        }
        if ((i10 & 4) != 0) {
            z10 = glomoContinuityUseCaseModel.isCodified;
        }
        return glomoContinuityUseCaseModel.copy(str, str2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCodified() {
        return this.isCodified;
    }

    @NotNull
    public final GlomoContinuityUseCaseModel copy(@NotNull String id, @NotNull String name, boolean isCodified) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new GlomoContinuityUseCaseModel(id, name, isCodified);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlomoContinuityUseCaseModel)) {
            return false;
        }
        GlomoContinuityUseCaseModel glomoContinuityUseCaseModel = (GlomoContinuityUseCaseModel) other;
        return Intrinsics.areEqual(this.id, glomoContinuityUseCaseModel.id) && Intrinsics.areEqual(this.name, glomoContinuityUseCaseModel.name) && this.isCodified == glomoContinuityUseCaseModel.isCodified;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.name, this.id.hashCode() * 31, 31);
        boolean z10 = this.isCodified;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iC + r1;
    }

    public final boolean isCodified() {
        return this.isCodified;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GlomoContinuityUseCaseModel(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", isCodified=");
        return i.c(sb2, this.isCodified, ")");
    }
}
