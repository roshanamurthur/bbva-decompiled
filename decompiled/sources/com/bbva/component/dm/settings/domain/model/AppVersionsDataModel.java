package com.bbva.component.dm.settings.domain.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppVersionConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppVersionsDataModel;", "", "Lcom/bbva/component/dm/settings/domain/model/VersionDataModel;", "a", "Lcom/bbva/component/dm/settings/domain/model/VersionDataModel;", "getAndroid", "()Lcom/bbva/component/dm/settings/domain/model/VersionDataModel;", "android", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/VersionDataModel;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final class AppVersionsDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final VersionDataModel android;

    public AppVersionsDataModel(@Nullable VersionDataModel versionDataModel) {
        this.android = versionDataModel;
    }

    @Nullable
    public final VersionDataModel getAndroid() {
        return this.android;
    }
}
