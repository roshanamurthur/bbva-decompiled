package com.bbva.ethermobilesdk.pinning.model.mapper;

import com.bbva.ethermobilesdk.pinning.data.catalog.CertificateDTO;
import com.bbva.ethermobilesdk.pinning.data.catalog.HostDTO;
import com.bbva.ethermobilesdk.pinning.data.catalog.SiteCatalogDTO;
import com.bbva.ethermobilesdk.pinning.data.catalog.SiteDTO;
import com.bbva.ethermobilesdk.pinning.model.catalog.Catalog;
import com.bbva.ethermobilesdk.pinning.model.catalog.Certificate;
import com.bbva.ethermobilesdk.pinning.model.catalog.Site;
import com.bbva.ethermobilesdk.pinning.model.catalog.SiteChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toModel", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Catalog;", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Site;", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteDTO;", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mapper.kt\ncom/bbva/ethermobilesdk/pinning/model/mapper/MapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1549#2:27\n1620#2,3:28\n1549#2:31\n1620#2,3:32\n1549#2:35\n1620#2,3:36\n*S KotlinDebug\n*F\n+ 1 Mapper.kt\ncom/bbva/ethermobilesdk/pinning/model/mapper/MapperKt\n*L\n16#1:27\n16#1:28,3\n21#1:31\n21#1:32,3\n24#1:35\n24#1:36,3\n*E\n"})
public final class MapperKt {
    @NotNull
    public static final Catalog toModel(@NotNull SiteCatalogDTO siteCatalogDTO) {
        Intrinsics.checkNotNullParameter(siteCatalogDTO, "<this>");
        List<SiteDTO> sites = siteCatalogDTO.getSites();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sites, 10));
        Iterator<T> it = sites.iterator();
        while (it.hasNext()) {
            arrayList.add(toModel((SiteDTO) it.next()));
        }
        return new Catalog(arrayList);
    }

    @NotNull
    public static final Site toModel(@NotNull SiteDTO siteDTO) {
        Intrinsics.checkNotNullParameter(siteDTO, "<this>");
        List<HostDTO> hostItems = siteDTO.getValidHost().getHostItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(hostItems, 10));
        Iterator<T> it = hostItems.iterator();
        while (it.hasNext()) {
            arrayList.add(((HostDTO) it.next()).getValue());
        }
        SiteChecker siteChecker = new SiteChecker(siteDTO.getCheckCertTrust(), siteDTO.getCheckCertDate(), siteDTO.getCheckHost(), false, 8, null);
        String id = siteDTO.getId();
        List<CertificateDTO> certItems = siteDTO.getValidCertificate().getCertItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(certItems, 10));
        for (CertificateDTO certificateDTO : certItems) {
            arrayList2.add(new Certificate(certificateDTO.getId(), certificateDTO.getValue()));
        }
        return new Site(id, arrayList, siteChecker, arrayList2);
    }
}
