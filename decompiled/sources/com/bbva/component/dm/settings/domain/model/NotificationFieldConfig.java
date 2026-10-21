package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BK\u00122\u0010\n\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002j\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u0001`\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u0006\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002j\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u0001`\u0005HÆ\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003JQ\u0010\f\u001a\u00020\u000024\b\u0002\u0010\n\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002j\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u0001`\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003RC\u0010\n\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002j\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/NotificationFieldConfig;", "", "Ljava/util/ArrayList;", "", "", "Lkotlin/collections/ArrayList;", "component1", "", "Lcom/bbva/component/dm/settings/domain/model/Operative;", "component2", "functionalBlocks", "operatives", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/ArrayList;", "getFunctionalBlocks", "()Ljava/util/ArrayList;", "b", "Ljava/util/List;", "getOperatives", "()Ljava/util/List;", "<init>", "(Ljava/util/ArrayList;Ljava/util/List;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotificationFieldConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ArrayList<Map<String, String>> functionalBlocks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Operative> operatives;

    public NotificationFieldConfig(@Nullable ArrayList<Map<String, String>> arrayList, @Nullable List<Operative> list) {
        this.functionalBlocks = arrayList;
        this.operatives = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationFieldConfig copy$default(NotificationFieldConfig notificationFieldConfig, ArrayList arrayList, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = notificationFieldConfig.functionalBlocks;
        }
        if ((i10 & 2) != 0) {
            list = notificationFieldConfig.operatives;
        }
        return notificationFieldConfig.copy(arrayList, list);
    }

    @Nullable
    public final ArrayList<Map<String, String>> component1() {
        return this.functionalBlocks;
    }

    @Nullable
    public final List<Operative> component2() {
        return this.operatives;
    }

    @NotNull
    public final NotificationFieldConfig copy(@Nullable ArrayList<Map<String, String>> functionalBlocks, @Nullable List<Operative> operatives) {
        return new NotificationFieldConfig(functionalBlocks, operatives);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationFieldConfig)) {
            return false;
        }
        NotificationFieldConfig notificationFieldConfig = (NotificationFieldConfig) other;
        return Intrinsics.areEqual(this.functionalBlocks, notificationFieldConfig.functionalBlocks) && Intrinsics.areEqual(this.operatives, notificationFieldConfig.operatives);
    }

    @Nullable
    public final ArrayList<Map<String, String>> getFunctionalBlocks() {
        return this.functionalBlocks;
    }

    @Nullable
    public final List<Operative> getOperatives() {
        return this.operatives;
    }

    public int hashCode() {
        ArrayList<Map<String, String>> arrayList = this.functionalBlocks;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        List<Operative> list = this.operatives;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationFieldConfig(functionalBlocks=" + this.functionalBlocks + ", operatives=" + this.operatives + ")";
    }
}
