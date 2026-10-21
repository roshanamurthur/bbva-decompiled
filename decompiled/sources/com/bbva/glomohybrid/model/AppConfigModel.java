package com.bbva.glomohybrid.model;

import androidx.camera.core.imagecapture.a;
import bk.d;
import bk.p;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfigModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/model/AppConfigModel;", "", "", "Lcom/bbva/glomohybrid/model/AppConfigModel$AppConfigEnvironmentModel;", "component1", "environments", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getEnvironments", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "AppConfigEnvironmentModel", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AppConfigModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<AppConfigEnvironmentModel> environments;

    /* JADX INFO: compiled from: AppConfigModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J)\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/model/AppConfigModel$AppConfigEnvironmentModel;", "", "", "component1", "", "component2", "id", "web", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getWeb", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class AppConfigEnvironmentModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, String> web;

        public AppConfigEnvironmentModel(@NotNull String id, @NotNull Map<String, String> web) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(web, "web");
            this.id = id;
            this.web = web;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AppConfigEnvironmentModel copy$default(AppConfigEnvironmentModel appConfigEnvironmentModel, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = appConfigEnvironmentModel.id;
            }
            if ((i10 & 2) != 0) {
                map = appConfigEnvironmentModel.web;
            }
            return appConfigEnvironmentModel.copy(str, map);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, String> component2() {
            return this.web;
        }

        @NotNull
        public final AppConfigEnvironmentModel copy(@NotNull String id, @NotNull Map<String, String> web) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(web, "web");
            return new AppConfigEnvironmentModel(id, web);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppConfigEnvironmentModel)) {
                return false;
            }
            AppConfigEnvironmentModel appConfigEnvironmentModel = (AppConfigEnvironmentModel) other;
            return Intrinsics.areEqual(this.id, appConfigEnvironmentModel.id) && Intrinsics.areEqual(this.web, appConfigEnvironmentModel.web);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, String> getWeb() {
            return this.web;
        }

        public int hashCode() {
            return this.web.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AppConfigEnvironmentModel(id=" + this.id + ", web=" + this.web + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppConfigModel copy$default(AppConfigModel appConfigModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = appConfigModel.environments;
        }
        return appConfigModel.copy(list);
    }

    @Nullable
    public final List<AppConfigEnvironmentModel> component1() {
        return this.environments;
    }

    @NotNull
    public final AppConfigModel copy(@Nullable List<AppConfigEnvironmentModel> environments) {
        return new AppConfigModel(environments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppConfigModel) && Intrinsics.areEqual(this.environments, ((AppConfigModel) other).environments);
    }

    @Nullable
    public final List<AppConfigEnvironmentModel> getEnvironments() {
        return this.environments;
    }

    public int hashCode() {
        List<AppConfigEnvironmentModel> list = this.environments;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("AppConfigModel(environments="), this.environments, ")");
    }

    public AppConfigModel(@Nullable List<AppConfigEnvironmentModel> list) {
        this.environments = list;
    }

    public /* synthetic */ AppConfigModel(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d.listOf(new AppConfigEnvironmentModel(BuildConfig.FLAVOR, p.mapOf(TuplesKt.to("glomo", "https://appassets.androidplatform.net/assets/www/index.html")))) : list);
    }
}
