package com.veridas.resource.database;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.veridas.lib.entities.resources.Document;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IResourcesDatabase.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0012H¦@¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0014\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\rJ\u000e\u0010#\u001a\u00020$H¦@¢\u0006\u0002\u0010\u0005J\u000e\u0010%\u001a\u00020$H¦@¢\u0006\u0002\u0010\u0005¨\u0006&"}, d2 = {"Lcom/veridas/resource/database/IResourcesDatabase;", "", "getAllCountryIds", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDocumentIds", "getAllDocuments", "Lcom/veridas/lib/entities/resources/Document;", "getAllGroupIds", "getCascadeBytes", "", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCascadeString", "getDocumentById", "id", "getDocumentIdsByCountryMap", "", "getDocumentsByCountryId", "countryId", "getDocumentsByIdList", RelayedService.KEY_IDS, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getObverseCascadeBytes", "documentId", "getObverseCascadeString", "getObverseStencilBytes", "getObverseTemplateBytes", "getReverseCascadeBytes", "getReverseCascadeString", "getReverseStencilBytes", "getReverseTemplateBytes", "getStencilBytes", "getTemplateBytes", "init", "", "releaseResources", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IResourcesDatabase {
    @Nullable
    Object getAllCountryIds(@NotNull Continuation<? super List<String>> continuation);

    @Nullable
    Object getAllDocumentIds(@NotNull Continuation<? super List<String>> continuation);

    @Nullable
    Object getAllDocuments(@NotNull Continuation<? super List<Document>> continuation);

    @Nullable
    Object getAllGroupIds(@NotNull Continuation<? super List<String>> continuation);

    @Nullable
    Object getCascadeBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getCascadeString(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getDocumentById(@NotNull String str, @NotNull Continuation<? super Document> continuation);

    @Nullable
    Object getDocumentIdsByCountryMap(@NotNull Continuation<? super Map<String, ? extends List<String>>> continuation);

    @Nullable
    Object getDocumentsByCountryId(@NotNull String str, @NotNull Continuation<? super List<Document>> continuation);

    @Nullable
    Object getDocumentsByIdList(@NotNull List<String> list, @NotNull Continuation<? super List<Document>> continuation);

    @Nullable
    Object getObverseCascadeBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getObverseCascadeString(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getObverseStencilBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getObverseTemplateBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getReverseCascadeBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getReverseCascadeString(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getReverseStencilBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getReverseTemplateBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getStencilBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getTemplateBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object init(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object releaseResources(@NotNull Continuation<? super Unit> continuation);
}
