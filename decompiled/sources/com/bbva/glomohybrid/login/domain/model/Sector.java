package com.bbva.glomohybrid.login.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.data.model.NameIdEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerIndicatorsLogins.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/Sector;", "", "", "component1", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "component2", "id", "subSector", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "getSubSector", "()Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Sector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NameIdEntity subSector;

    public Sector(@NotNull String id, @NotNull NameIdEntity subSector) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subSector, "subSector");
        this.id = id;
        this.subSector = subSector;
    }

    public static /* synthetic */ Sector copy$default(Sector sector, String str, NameIdEntity nameIdEntity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sector.id;
        }
        if ((i10 & 2) != 0) {
            nameIdEntity = sector.subSector;
        }
        return sector.copy(str, nameIdEntity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NameIdEntity getSubSector() {
        return this.subSector;
    }

    @NotNull
    public final Sector copy(@NotNull String id, @NotNull NameIdEntity subSector) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subSector, "subSector");
        return new Sector(id, subSector);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sector)) {
            return false;
        }
        Sector sector = (Sector) other;
        return Intrinsics.areEqual(this.id, sector.id) && Intrinsics.areEqual(this.subSector, sector.subSector);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final NameIdEntity getSubSector() {
        return this.subSector;
    }

    public int hashCode() {
        return this.subSector.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Sector(id=" + this.id + ", subSector=" + this.subSector + ")";
    }
}
