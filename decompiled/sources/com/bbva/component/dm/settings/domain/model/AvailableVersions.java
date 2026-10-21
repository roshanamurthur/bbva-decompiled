package com.bbva.component.dm.settings.domain.model;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AvailableVersions;", "", "", "", "component1", "android", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getAndroid", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AvailableVersions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Integer> android;

    public AvailableVersions(@Nullable List<Integer> list) {
        this.android = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableVersions copy$default(AvailableVersions availableVersions, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = availableVersions.android;
        }
        return availableVersions.copy(list);
    }

    @Nullable
    public final List<Integer> component1() {
        return this.android;
    }

    @NotNull
    public final AvailableVersions copy(@Nullable List<Integer> android2) {
        return new AvailableVersions(android2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AvailableVersions) && Intrinsics.areEqual(this.android, ((AvailableVersions) other).android);
    }

    @Nullable
    public final List<Integer> getAndroid() {
        return this.android;
    }

    public int hashCode() {
        List<Integer> list = this.android;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("AvailableVersions(android="), this.android, ")");
    }
}
