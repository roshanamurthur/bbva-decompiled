package com.veridas.bidicode.dependencies;

import com.veridas.bidicode.entities.BidiCodePlacement;
import com.veridas.bidicode.entities.BidiCodeRegion;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lib.entities.resources.DocumentFace;
import com.veridas.lib.entities.resources.Side;
import com.veridas.lib.entities.resources.bidicode.BidiCode;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResourcesBidiCodePlacementsProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/veridas/bidicode/dependencies/ResourcesBidiCodePlacementsProvider;", "Lcom/veridas/bidicode/dependencies/IBidiCodePlacementsProvider;", "", "", "documents", "", "Lcom/veridas/bidicode/entities/BidiCodePlacement;", "getPlacementsForDocuments", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "resourcesDatabase", "<init>", "(Lcom/veridas/resource/database/IBlockingResourcesDatabase;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nResourcesBidiCodePlacementsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcesBidiCodePlacementsProvider.kt\ncom/veridas/bidicode/dependencies/ResourcesBidiCodePlacementsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1789#2,2:58\n1855#2,2:60\n1791#2:62\n1549#2:63\n1620#2,3:64\n*S KotlinDebug\n*F\n+ 1 ResourcesBidiCodePlacementsProvider.kt\ncom/veridas/bidicode/dependencies/ResourcesBidiCodePlacementsProvider\n*L\n19#1:58,2\n29#1:60,2\n19#1:62\n41#1:63\n41#1:64,3\n*E\n"})
public final class ResourcesBidiCodePlacementsProvider implements IBidiCodePlacementsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IBlockingResourcesDatabase f66554a;

    /* JADX INFO: compiled from: ResourcesBidiCodePlacementsProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.OBVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ResourcesBidiCodePlacementsProvider(@NotNull IBlockingResourcesDatabase resourcesDatabase) {
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        this.f66554a = resourcesDatabase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // com.veridas.bidicode.dependencies.IBidiCodePlacementsProvider
    @NotNull
    public Map<String, List<BidiCodePlacement>> getPlacementsForDocuments(@NotNull List<String> documents) {
        ?? EmptyList;
        int id;
        Intrinsics.checkNotNullParameter(documents, "documents");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : documents) {
            Document documentById = this.f66554a.getDocumentById(str);
            ArrayList arrayList = new ArrayList();
            if (documentById == null) {
                linkedHashMap.put(str, arrayList);
            } else {
                for (DocumentFace documentFace : documentById.getDocumentFaces()) {
                    List<BidiCode> bidiCodes = documentFace.getBidiCodes();
                    if (bidiCodes != null) {
                        List<BidiCode> list = bidiCodes;
                        EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (BidiCode bidiCode : list) {
                            Side side = documentFace.getSide();
                            BidiCodeRegion bidiCodeRegion = new BidiCodeRegion(bidiCode);
                            int i10 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                            if (i10 == 1) {
                                id = side.getId();
                            } else {
                                if (i10 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                id = side.getId();
                            }
                            EmptyList.add(new BidiCodePlacement(bidiCodeRegion, id, bidiCode.getType().ordinal()));
                        }
                    } else {
                        EmptyList = 0;
                    }
                    if (EmptyList == 0) {
                        EmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    arrayList.addAll((Collection) EmptyList);
                }
                linkedHashMap.put(str, arrayList);
            }
        }
        return linkedHashMap;
    }
}
