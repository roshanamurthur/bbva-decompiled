package com.dasnano.vddocumentcapture.other;

import com.dasnano.vddocumentcapture.VDDocumentCapture;
import com.veridas.lib.entities.resources.Document;
import com.veridas.log.Log;
import com.veridas.resource.LegacyIdUtil;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.bouncycastle.asn1.ASN1Encoding;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u0010"}, d2 = {"Lcom/dasnano/vddocumentcapture/other/DocumentUtils;", "", "()V", "filterDocumentsThatMustBePassedAlone", "", "", "documentIds", "resourcesDatabase", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "parseEnumToIdlist", "documentsEnums", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDDocumentType;", "parseIdsToEnumList", "documentsIDs", "parseIdsToVDDocumentList", "Lcom/dasnano/vddocumentcapture/other/VDDocument;", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentUtils {

    @NotNull
    public static final DocumentUtils INSTANCE = new DocumentUtils();

    @JvmStatic
    @NotNull
    public static final List<String> filterDocumentsThatMustBePassedAlone(@NotNull List<String> documentIds, @NotNull IBlockingResourcesDatabase resourcesDatabase) {
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        if (documentIds.size() <= 1) {
            return documentIds;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : documentIds) {
            Document documentById = resourcesDatabase.getDocumentById(str);
            if (documentById == null || !documentById.getMustBePasseAlone()) {
                arrayList.add(str);
            } else {
                Log.e(VDDocumentCapture.TAG, "Document %s must be passed alone and it will be removed", str);
            }
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final List<String> parseEnumToIdlist(@NotNull List<? extends VDEnums.VDDocumentType> documentsEnums) {
        Intrinsics.checkNotNullParameter(documentsEnums, "documentsEnums");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends VDEnums.VDDocumentType> it = documentsEnums.iterator();
        while (it.hasNext()) {
            String documentIdFromLegacyId = LegacyIdUtil.getDocumentIdFromLegacyId(it.next().getOrdinal());
            if (documentIdFromLegacyId != null) {
                arrayList.add(documentIdFromLegacyId);
            }
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final List<VDEnums.VDDocumentType> parseIdsToEnumList(@NotNull List<String> documentsIDs) {
        Intrinsics.checkNotNullParameter(documentsIDs, "documentsIDs");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = documentsIDs.iterator();
        while (it.hasNext()) {
            Integer legacyIdFromDocumentId = LegacyIdUtil.getLegacyIdFromDocumentId(it.next());
            if (legacyIdFromDocumentId != null) {
                VDEnums.VDDocumentType vDDocumentTypeFromInt = VDEnums.VDDocumentType.fromInt(legacyIdFromDocumentId.intValue());
                Intrinsics.checkNotNullExpressionValue(vDDocumentTypeFromInt, "fromInt(...)");
                arrayList.add(vDDocumentTypeFromInt);
            } else {
                arrayList.add(VDEnums.VDDocumentType.VD_ERROR_DOCUMENT);
            }
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final List<VDDocument> parseIdsToVDDocumentList(@NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull List<String> documentsIDs) {
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(documentsIDs, "documentsIDs");
        ArrayList arrayList = new ArrayList();
        for (String str : documentsIDs) {
            Document documentById = resourcesDatabase.getDocumentById(str);
            VDDocument vDDocument = new VDDocument();
            vDDocument.setDocumentType(VDEnums.VDDocumentTypeTravel.TD1);
            if (documentById != null) {
                vDDocument.setGroup(VDGroup.VDGroupFromIsoCode(documentById.getCountryIsoCode()));
                vDDocument.setObverse(Boolean.valueOf(documentById.getObverse() != null));
                vDDocument.setReverse(Boolean.valueOf(documentById.getReverse() != null));
                Integer legacyIdFromDocumentId = LegacyIdUtil.getLegacyIdFromDocumentId(str);
                if (legacyIdFromDocumentId != null) {
                    vDDocument.setDocumentEnum(VDEnums.VDDocumentType.fromInt(legacyIdFromDocumentId.intValue()));
                }
                vDDocument.setName(new Regex("ResidencePermit").replace(new Regex("IdCard").replace(new Regex("DrivingLicense").replace(documentById.getId(), ASN1Encoding.DL), "ID"), "RP"));
            } else {
                vDDocument.setGroup(VDGroup.VDGroupFromIsoCode(null));
                Boolean bool = Boolean.TRUE;
                vDDocument.setObverse(bool);
                vDDocument.setReverse(bool);
                vDDocument.setDocumentEnum(VDEnums.VDDocumentType.VD_ERROR_DOCUMENT);
            }
            vDDocument.setID(str);
            arrayList.add(vDDocument);
        }
        return arrayList;
    }
}
