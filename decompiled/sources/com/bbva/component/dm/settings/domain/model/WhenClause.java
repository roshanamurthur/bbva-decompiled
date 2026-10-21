package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J)\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/WhenClause;", "", "", "", "component1", "component2", "includes", "inClause", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getIncludes", "()Ljava/util/List;", "b", "getInClause", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class WhenClause {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> includes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> inClause;

    /* JADX WARN: Multi-variable type inference failed */
    public WhenClause() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhenClause copy$default(WhenClause whenClause, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = whenClause.includes;
        }
        if ((i10 & 2) != 0) {
            list2 = whenClause.inClause;
        }
        return whenClause.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.includes;
    }

    @NotNull
    public final List<String> component2() {
        return this.inClause;
    }

    @NotNull
    public final WhenClause copy(@NotNull List<String> includes, @NotNull List<String> inClause) {
        Intrinsics.checkNotNullParameter(includes, "includes");
        Intrinsics.checkNotNullParameter(inClause, "inClause");
        return new WhenClause(includes, inClause);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhenClause)) {
            return false;
        }
        WhenClause whenClause = (WhenClause) other;
        return Intrinsics.areEqual(this.includes, whenClause.includes) && Intrinsics.areEqual(this.inClause, whenClause.inClause);
    }

    @NotNull
    public final List<String> getInClause() {
        return this.inClause;
    }

    @NotNull
    public final List<String> getIncludes() {
        return this.includes;
    }

    public int hashCode() {
        return this.inClause.hashCode() + (this.includes.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WhenClause(includes=" + this.includes + ", inClause=" + this.inClause + ")";
    }

    public WhenClause(@NotNull List<String> includes, @NotNull List<String> inClause) {
        Intrinsics.checkNotNullParameter(includes, "includes");
        Intrinsics.checkNotNullParameter(inClause, "inClause");
        this.includes = includes;
        this.inClause = inClause;
    }

    public /* synthetic */ WhenClause(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
