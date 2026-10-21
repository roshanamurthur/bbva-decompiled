package com.veridas.resource.database;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.veridas.lib.entities.resources.Document;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IBlockingResourcesDatabase.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0004H&J\u001a\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0010H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0012\u001a\u00020\u0004H&J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0004H&J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020!H&¨\u0006#"}, d2 = {"Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "", "getAllCountryIds", "", "", "getAllDocumentIds", "getAllDocuments", "Lcom/veridas/lib/entities/resources/Document;", "getAllGroupIds", "getCascadeBytes", "", "name", "getCascadeString", "getDocumentById", "id", "getDocumentIdsByCountryMap", "", "getDocumentsByCountryId", "countryId", "getDocumentsByIdList", RelayedService.KEY_IDS, "getObverseCascadeBytes", "documentId", "getObverseCascadeString", "getObverseStencilBytes", "getObverseTemplateBytes", "getReverseCascadeBytes", "getReverseCascadeString", "getReverseStencilBytes", "getReverseTemplateBytes", "getStencilBytes", "getTemplateBytes", "init", "", "releaseResources", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IBlockingResourcesDatabase {
    @NotNull
    List<String> getAllCountryIds();

    @NotNull
    List<String> getAllDocumentIds();

    @NotNull
    List<Document> getAllDocuments();

    @NotNull
    List<String> getAllGroupIds();

    @Nullable
    byte[] getCascadeBytes(@NotNull String name);

    @Nullable
    String getCascadeString(@NotNull String name);

    @Nullable
    Document getDocumentById(@NotNull String id);

    @NotNull
    Map<String, List<String>> getDocumentIdsByCountryMap();

    @NotNull
    List<Document> getDocumentsByCountryId(@NotNull String countryId);

    @NotNull
    List<Document> getDocumentsByIdList(@NotNull List<String> ids);

    @Nullable
    byte[] getObverseCascadeBytes(@NotNull String documentId);

    @Nullable
    String getObverseCascadeString(@NotNull String documentId);

    @Nullable
    byte[] getObverseStencilBytes(@NotNull String documentId);

    @Nullable
    byte[] getObverseTemplateBytes(@NotNull String documentId);

    @Nullable
    byte[] getReverseCascadeBytes(@NotNull String documentId);

    @Nullable
    String getReverseCascadeString(@NotNull String documentId);

    @Nullable
    byte[] getReverseStencilBytes(@NotNull String documentId);

    @Nullable
    byte[] getReverseTemplateBytes(@NotNull String documentId);

    @Nullable
    byte[] getStencilBytes(@NotNull String name);

    @Nullable
    byte[] getTemplateBytes(@NotNull String name);

    void init();

    void releaseResources();
}
