package com.bbva.glomohybrid.login.data.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.model.Sector;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Classification.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/login/data/model/Classification;", "", "", "component1", "", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "component2", "Lcom/bbva/glomohybrid/login/domain/model/Sector;", "component3", "id", "segments", "sector", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getSegments", "()Ljava/util/List;", "c", "Lcom/bbva/glomohybrid/login/domain/model/Sector;", "getSector", "()Lcom/bbva/glomohybrid/login/domain/model/Sector;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/bbva/glomohybrid/login/domain/model/Sector;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Classification {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<NameIdEntity> segments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Sector sector;

    public Classification(@Nullable String str, @Nullable List<NameIdEntity> list, @Nullable Sector sector) {
        this.id = str;
        this.segments = list;
        this.sector = sector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Classification copy$default(Classification classification, String str, List list, Sector sector, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = classification.id;
        }
        if ((i10 & 2) != 0) {
            list = classification.segments;
        }
        if ((i10 & 4) != 0) {
            sector = classification.sector;
        }
        return classification.copy(str, list, sector);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<NameIdEntity> component2() {
        return this.segments;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Sector getSector() {
        return this.sector;
    }

    @NotNull
    public final Classification copy(@Nullable String id, @Nullable List<NameIdEntity> segments, @Nullable Sector sector) {
        return new Classification(id, segments, sector);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Classification)) {
            return false;
        }
        Classification classification = (Classification) other;
        return Intrinsics.areEqual(this.id, classification.id) && Intrinsics.areEqual(this.segments, classification.segments) && Intrinsics.areEqual(this.sector, classification.sector);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Sector getSector() {
        return this.sector;
    }

    @Nullable
    public final List<NameIdEntity> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NameIdEntity> list = this.segments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Sector sector = this.sector;
        return iHashCode2 + (sector != null ? sector.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Classification(id=" + this.id + ", segments=" + this.segments + ", sector=" + this.sector + ")";
    }
}
