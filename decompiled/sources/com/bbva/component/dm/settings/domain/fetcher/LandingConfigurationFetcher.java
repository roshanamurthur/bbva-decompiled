package com.bbva.component.dm.settings.domain.fetcher;

import com.bbva.component.dm.settings.AppSettingsResultExtensionsKt;
import com.bbva.component.dm.settings.domain.AppSettingsConstants;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.Contact;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.google.android.gms.common.Scopes;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dk.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingConfigurationFetcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher;", "", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;", "fetchConfiguration", "Lcom/bbva/component/dm/settings/domain/model/Contact;", "fetchContact", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "repository", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;Lcom/bbva/glomo/storage/MainStorage;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingConfigurationFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingConfigurationFetcher.kt\ncom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n766#2:58\n857#2,2:59\n1045#2:61\n1#3:62\n*S KotlinDebug\n*F\n+ 1 LandingConfigurationFetcher.kt\ncom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher\n*L\n38#1:58\n38#1:59,2\n39#1:61\n*E\n"})
public final class LandingConfigurationFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f27906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f27907b;

    public LandingConfigurationFetcher(@NotNull AppSettingsRepository repository, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f27906a = repository;
        this.f27907b = storage;
    }

    public final AppSettingsResult a() {
        AppSettingsResult settings = this.f27906a.getSettings(SettingsPolicy.Local);
        if ((settings instanceof AppSettingsResult.FreshResult) || (settings instanceof AppSettingsResult.CachedResult)) {
            return settings;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    @Nullable
    public final LandingConfiguration fetchConfiguration(@NotNull UserProfileConfiguration profile) {
        LandingConfiguration landingConfiguration;
        Object next;
        JsonObject json$default;
        JsonElement jsonElement;
        AppSettings data;
        Intrinsics.checkNotNullParameter(profile, "profile");
        LandingConfiguration landingConfigurationBy = null;
        if (profile.getRememberedUser() != null) {
            String value = UserType.PERSONAL.getValue();
            AppSettingsResult appSettingsResultA = a();
            List<LandingConfiguration> landing = (appSettingsResultA == null || (data = appSettingsResultA.getData()) == null) ? null : data.getLanding();
            if (landing != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : landing) {
                    if (Intrinsics.areEqual(((LandingConfiguration) obj).getProfile(), value)) {
                        arrayList.add(obj);
                    }
                }
                List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher$fetchSegmentedConfigurationBy$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return e.compareValues(Integer.valueOf(((LandingConfiguration) t10).getPriority()), Integer.valueOf(((LandingConfiguration) t11).getPriority()));
                    }
                });
                if (listSortedWith != null) {
                    Iterator it = listSortedWith.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        String condition = ((LandingConfiguration) next).getCondition();
                        if (condition != null && (json$default = MainStorage.getJson$default(this.f27907b, condition, false, null, 6, null)) != null && (jsonElement = json$default.get("value")) != null && jsonElement.getAsBoolean()) {
                            break;
                        }
                    }
                    landingConfiguration = (LandingConfiguration) next;
                } else {
                    landingConfiguration = null;
                }
            } else {
                landingConfiguration = null;
            }
            if (landingConfiguration != null) {
                return landingConfiguration;
            }
            AppSettingsResult appSettingsResultA2 = a();
            if (appSettingsResultA2 != null) {
                landingConfigurationBy = AppSettingsResultExtensionsKt.getLandingConfigurationBy(appSettingsResultA2, value);
            }
        } else {
            AppSettingsResult appSettingsResultA3 = a();
            if (appSettingsResultA3 != null) {
                landingConfigurationBy = AppSettingsResultExtensionsKt.getLandingConfigurationBy(appSettingsResultA3, AppSettingsConstants.LANDING_SEGMENT_NO_USER);
            }
        }
        return landingConfigurationBy;
    }

    @Nullable
    public final Contact fetchContact() {
        AppSettings data;
        AppSettingsResult appSettingsResultA = a();
        if (appSettingsResultA == null || (data = appSettingsResultA.getData()) == null) {
            return null;
        }
        return data.getContact();
    }
}
