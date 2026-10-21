package com.bbva.glomohybrid.landing.data.repository;

import com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.glomohybrid.landing.data.datasource.LandingSectionsDeletedDataSource;
import com.bbva.glomohybrid.landing.data.model.LandingSectionDeletedDataModel;
import com.bbva.glomohybrid.landing.data.model.LandingSectionItemDeletedDataModel;
import com.bbva.glomoutils.StringDateExtensionsKt;
import com.bbva.glomoutils.time.DateComparison;
import com.bbva.glomoutils.time.StringDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionsDeletedRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository;", "", "", "key", "Lcom/bbva/glomohybrid/landing/data/model/LandingSectionDeletedDataModel;", "getDeletedSectionData", HashCommand.ID, "", "addItemRemoved", "", "Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "sectionsConfiguration", "removeExpiredSectionsFingerprint", "Lcom/bbva/glomohybrid/landing/data/datasource/LandingSectionsDeletedDataSource;", "dataSource", "<init>", "(Lcom/bbva/glomohybrid/landing/data/datasource/LandingSectionsDeletedDataSource;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSectionsDeletedRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsDeletedRepository.kt\ncom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1855#2,2:101\n1855#2,2:103\n1855#2,2:106\n1#3:105\n*S KotlinDebug\n*F\n+ 1 LandingSectionsDeletedRepository.kt\ncom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository\n*L\n29#1:101,2\n38#1:103,2\n76#1:106,2\n*E\n"})
public final class LandingSectionsDeletedRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingSectionsDeletedDataSource f32544a;

    /* JADX INFO: compiled from: LandingSectionsDeletedRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DateComparison.values().length];
            try {
                iArr[DateComparison.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DateComparison.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DateComparison.HIGHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LandingSectionsDeletedRepository(@NotNull LandingSectionsDeletedDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f32544a = dataSource;
    }

    public final void addItemRemoved(@NotNull String key, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.f32544a.add(key, new LandingSectionItemDeletedDataModel(hash, StringDate.getToday$default(StringDate.INSTANCE, null, 1, null)));
    }

    @Nullable
    public final LandingSectionDeletedDataModel getDeletedSectionData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f32544a.get(key);
    }

    public final void removeExpiredSectionsFingerprint(@NotNull List<LandingSectionConfiguration> sectionsConfiguration) {
        LandingSectionsDeletedDataSource landingSectionsDeletedDataSource;
        List<LandingSectionItemDeletedDataModel> items;
        String cleanCacheDate;
        DateComparison dateComparisonCompareDateWith$default;
        LandingSectionDeletedDataModel landingSectionDeletedDataModel;
        Intrinsics.checkNotNullParameter(sectionsConfiguration, "sectionsConfiguration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<LandingSectionConfiguration> list = sectionsConfiguration;
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            landingSectionsDeletedDataSource = this.f32544a;
            if (!zHasNext) {
                break;
            }
            String url = ((LandingSectionConfiguration) it.next()).getUrl();
            if (url != null && (landingSectionDeletedDataModel = landingSectionsDeletedDataSource.get(url)) != null) {
                linkedHashMap.put(url, landingSectionDeletedDataModel);
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        for (LandingSectionConfiguration landingSectionConfiguration : list) {
            LandingSectionDeletedDataModel landingSectionDeletedDataModel2 = linkedHashMap != null ? (LandingSectionDeletedDataModel) linkedHashMap.get(landingSectionConfiguration.getUrl()) : null;
            String today$default = StringDate.getToday$default(StringDate.INSTANCE, null, 1, null);
            String url2 = landingSectionConfiguration.getUrl();
            if (url2 != null && (cleanCacheDate = landingSectionConfiguration.getCleanCacheDate()) != null) {
                DateComparison dateComparisonCompareDateWith$default2 = StringDateExtensionsKt.compareDateWith$default(cleanCacheDate, today$default, null, 2, null);
                int i10 = dateComparisonCompareDateWith$default2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[dateComparisonCompareDateWith$default2.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    if ((landingSectionDeletedDataModel2 != null ? landingSectionDeletedDataModel2.getCacheDeletedDate() : null) == null || ((dateComparisonCompareDateWith$default = StringDateExtensionsKt.compareDateWith$default(cleanCacheDate, landingSectionDeletedDataModel2.getCacheDeletedDate(), null, 2, null)) != null && WhenMappings.$EnumSwitchMapping$0[dateComparisonCompareDateWith$default.ordinal()] == 3)) {
                        landingSectionsDeletedDataSource.clear(url2, today$default);
                    }
                }
            }
            String url3 = landingSectionConfiguration.getUrl();
            if (url3 != null && landingSectionDeletedDataModel2 != null && (items = landingSectionDeletedDataModel2.getItems()) != null) {
                for (LandingSectionItemDeletedDataModel landingSectionItemDeletedDataModel : items) {
                    Integer reactivateInDays = landingSectionConfiguration.getReactivateInDays();
                    if (reactivateInDays == null) {
                        break;
                    } else if (StringDateExtensionsKt.isTimeElapseUpperOrEqualsTo$default(landingSectionItemDeletedDataModel.getDeletedDate(), reactivateInDays.intValue(), today$default, null, 4, null)) {
                        landingSectionsDeletedDataSource.remove(url3, landingSectionItemDeletedDataModel.getHash());
                    }
                }
            }
        }
    }
}
