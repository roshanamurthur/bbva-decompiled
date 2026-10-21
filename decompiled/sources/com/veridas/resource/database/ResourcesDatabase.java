package com.veridas.resource.database;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.veridas.lib.encryption.ResourcesCipher;
import com.veridas.lib.entities.resources.DetectionParameters;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lib.entities.resources.DocumentFace;
import com.veridas.resource.database.assetsprovider.IDatabaseAssetsProvider;
import com.veridas.resource.zip.ZippedBytesReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourcesDatabase.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0002\u0010\u001eJ.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bH\u0082@¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0096@¢\u0006\u0002\u0010\u001eJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0002\u0010\u001eJ\u0018\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u0010)\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J \u0010*\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bH\u0096@¢\u0006\u0002\u0010\u001eJ\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010,\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0002\u0010/J \u00100\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\tH\u0082@¢\u0006\u0002\u00102J\u0018\u00103\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u00105\u001a\u0004\u0018\u00010\t2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u00106\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u00107\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u00108\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u00109\u001a\u0004\u0018\u00010\t2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u0010:\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u0010;\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u0010<\u001a\u0004\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u0018\u0010=\u001a\u0004\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010&J\u001e\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010@J\u000e\u0010A\u001a\u00020BH\u0096@¢\u0006\u0002\u0010\u001eJ(\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010DJ(\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010DJ\u000e\u0010F\u001a\u00020BH\u0096@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bX\u0082.¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/veridas/resource/database/ResourcesDatabase;", "Lcom/veridas/resource/database/IResourcesDatabase;", "assetsProvider", "Lcom/veridas/resource/database/assetsprovider/IDatabaseAssetsProvider;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/veridas/resource/database/assetsprovider/IDatabaseAssetsProvider;Lkotlinx/coroutines/CoroutineDispatcher;)V", "docIds", "", "", "docIdsByCountryMap", "", "docIdsByGroupMap", "documentsMapByIdCache", "", "Lcom/veridas/lib/entities/resources/Document;", "resourcesFileCipher", "Lcom/veridas/lib/encryption/ResourcesCipher;", "getResourcesFileCipher", "()Lcom/veridas/lib/encryption/ResourcesCipher;", "resourcesFileCipher$delegate", "Lkotlin/Lazy;", "rootFileCipher", "getRootFileCipher", "rootFileCipher$delegate", "rootZipReader", "Lcom/veridas/resource/zip/ZippedBytesReader;", "zippedFileBytes", "", "getAllCountryIds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDocumentIds", "docsByCountryMap", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDocuments", "getAllGroupIds", "getCascadeBytes", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCascadeString", "getDocumentById", "id", "getDocumentIdsByCountryMap", "getDocumentsByCountryId", "countryId", "getDocumentsByIdList", RelayedService.KEY_IDS, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEntryBytes", "entryName", "(Lcom/veridas/resource/zip/ZippedBytesReader;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getObverseCascadeBytes", "documentId", "getObverseCascadeString", "getObverseStencilBytes", "getObverseTemplateBytes", "getReverseCascadeBytes", "getReverseCascadeString", "getReverseStencilBytes", "getReverseTemplateBytes", "getStencilBytes", "getTemplateBytes", "getZippedFileBytes", "encryptedFileBytes", "([BLcom/veridas/lib/encryption/ResourcesCipher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "", "parseDocIdsByCountryMap", "(Lcom/veridas/resource/zip/ZippedBytesReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseDocIdsByGroupMap", "releaseResources", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourcesDatabase implements IResourcesDatabase {

    @NotNull
    private static final String DOCS_BY_COUNTRY_PATH = "resources/serialized_docs_by_country.json.zip.data";

    @NotNull
    private static final String DOCS_BY_GROUP_PATH = "resources/serialized_docs_by_group.json.zip.data";

    @NotNull
    private static final String RESOURCES_ARCHIVE_SECRET = "A14pt7Mnw6q";

    @NotNull
    private static final String ROOT_ARCHIVE_SECRET = "c98TrsX3j6yE";

    @NotNull
    private final IDatabaseAssetsProvider assetsProvider;
    private List<String> docIds;
    private Map<String, ? extends List<String>> docIdsByCountryMap;
    private Map<String, ? extends List<String>> docIdsByGroupMap;

    @NotNull
    private final Map<String, Document> documentsMapByIdCache;

    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    /* JADX INFO: renamed from: resourcesFileCipher$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resourcesFileCipher;

    /* JADX INFO: renamed from: rootFileCipher$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rootFileCipher;
    private ZippedBytesReader rootZipReader;
    private byte[] zippedFileBytes;

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getAllCountryIds$2", f = "ResourcesDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Map map = ResourcesDatabase.this.docIdsByCountryMap;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("docIdsByCountryMap");
                map = null;
            }
            return CollectionsKt___CollectionsKt.sorted(map.keySet());
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getAllDocumentIds$2", f = "ResourcesDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map<String, List<String>> f67340p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<String, ? extends List<String>> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f67340p0 = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f67340p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.distinct(CollectionsKt__IterablesKt.flatten(this.f67340p0.values())));
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getAllDocuments$2", f = "ResourcesDatabase.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Document>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67341p0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Document>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67341p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
                List<String> list = resourcesDatabase.docIds;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("docIds");
                    list = null;
                }
                this.f67341p0 = 1;
                obj = resourcesDatabase.getDocumentsByIdList(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getAllGroupIds$2", f = "ResourcesDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Map map = ResourcesDatabase.this.docIdsByGroupMap;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("docIdsByGroupMap");
                map = null;
            }
            return CollectionsKt___CollectionsKt.sorted(map.keySet());
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getCascadeBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67344p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67346r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f67346r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new e(this.f67346r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67344p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
                ZippedBytesReader zippedBytesReader = resourcesDatabase.rootZipReader;
                if (zippedBytesReader == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootZipReader");
                    zippedBytesReader = null;
                }
                String strF = ad.d.f(new StringBuilder("resources/cascades/"), this.f67346r0, ".zip.data");
                this.f67344p0 = 1;
                obj = resourcesDatabase.getEntryBytes(zippedBytesReader, strF, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getCascadeString$2", f = "ResourcesDatabase.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67347p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67349r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f67349r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new f(this.f67349r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67347p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f67347p0 = 1;
                obj = ResourcesDatabase.this.getCascadeBytes(this.f67349r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getDocumentById$2", f = "ResourcesDatabase.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nResourcesDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$getDocumentById$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,231:1\n96#2:232\n*S KotlinDebug\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$getDocumentById$2\n*L\n109#1:232\n*E\n"})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Document>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67350p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67352r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f67352r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new g(this.f67352r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Document> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67350p0;
            String str = this.f67352r0;
            ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                List list = resourcesDatabase.docIds;
                ZippedBytesReader zippedBytesReader = null;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("docIds");
                    list = null;
                }
                if (!list.contains(str)) {
                    return null;
                }
                if (resourcesDatabase.documentsMapByIdCache.containsKey(str)) {
                    return (Document) resourcesDatabase.documentsMapByIdCache.get(str);
                }
                ZippedBytesReader zippedBytesReader2 = resourcesDatabase.rootZipReader;
                if (zippedBytesReader2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootZipReader");
                } else {
                    zippedBytesReader = zippedBytesReader2;
                }
                String strB = h0.b("resources/documents/", str, ".json.zip.data");
                this.f67350p0 = 1;
                obj = resourcesDatabase.getEntryBytes(zippedBytesReader, strB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Json.Companion companion = Json.INSTANCE;
            String str2 = new String(bArr, Charsets.UTF_8);
            SerializersModule serializersModule = companion.getSerializersModule();
            KType kTypeTypeOf = Reflection.typeOf(Document.class);
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            Document document = (Document) companion.decodeFromString(SerializersKt.serializer(serializersModule, kTypeTypeOf), str2);
            resourcesDatabase.documentsMapByIdCache.put(str, document);
            return document;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getDocumentsByCountryId$2", f = "ResourcesDatabase.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Document>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67353p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67355r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f67355r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new h(this.f67355r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Document>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67353p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
                Map map = resourcesDatabase.docIdsByCountryMap;
                if (map == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("docIdsByCountryMap");
                    map = null;
                }
                Object obj2 = map.get(this.f67355r0);
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                this.f67353p0 = 1;
                obj = resourcesDatabase.getDocumentsByIdList((List) obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getDocumentsByIdList$2", f = "ResourcesDatabase.kt", i = {0}, l = {127}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
    @SourceDebugExtension({"SMAP\nResourcesDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$getDocumentsByIdList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n1603#2,9:232\n1855#2:241\n1856#2:243\n1612#2:244\n1#3:242\n*S KotlinDebug\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$getDocumentsByIdList$2\n*L\n127#1:232,9\n127#1:241\n127#1:243\n127#1:244\n127#1:242\n*E\n"})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Document>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ResourcesDatabase f67356p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Collection f67357q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator f67358r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f67359s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ List<String> f67360t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ ResourcesDatabase f67361u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<String> list, ResourcesDatabase resourcesDatabase, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f67360t0 = list;
            this.f67361u0 = resourcesDatabase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.f67360t0, this.f67361u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Document>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040  */
        /* JADX WARN: Code duplicated, block: B:13:0x0057 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0058  */
        /* JADX WARN: Code duplicated, block: B:17:0x0063  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0058 -> B:15:0x005f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r8.f67359s0
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                java.util.Iterator r1 = r8.f67358r0
                java.util.Collection r3 = r8.f67357q0
                java.util.Collection r3 = (java.util.Collection) r3
                com.veridas.resource.database.ResourcesDatabase r4 = r8.f67356p0
                kotlin.ResultKt.throwOnFailure(r9)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L5f
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                kotlin.ResultKt.throwOnFailure(r9)
                java.util.List<java.lang.String> r9 = r8.f67360t0
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r9 = r9.iterator()
                com.veridas.resource.database.ResourcesDatabase r3 = r8.f67361u0
                r4 = r3
                r3 = r1
                r1 = r9
                r9 = r8
            L3a:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6c
                java.lang.Object r5 = r1.next()
                java.lang.String r5 = (java.lang.String) r5
                r9.f67356p0 = r4
                r6 = r3
                java.util.Collection r6 = (java.util.Collection) r6
                r9.f67357q0 = r6
                r9.f67358r0 = r1
                r9.f67359s0 = r2
                java.lang.Object r5 = r4.getDocumentById(r5, r9)
                if (r5 != r0) goto L58
                return r0
            L58:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L5f:
                com.veridas.lib.entities.resources.Document r9 = (com.veridas.lib.entities.resources.Document) r9
                if (r9 == 0) goto L66
                r4.add(r9)
            L66:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3a
            L6c:
                java.util.List r3 = (java.util.List) r3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veridas.resource.database.ResourcesDatabase.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getEntryBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ZippedBytesReader f67362p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f67363q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ResourcesDatabase f67364r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ResourcesDatabase resourcesDatabase, ZippedBytesReader zippedBytesReader, String str, Continuation continuation) {
            super(2, continuation);
            this.f67362p0 = zippedBytesReader;
            this.f67363q0 = str;
            this.f67364r0 = resourcesDatabase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.f67364r0, this.f67362p0, this.f67363q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            byte[] entryBytes = this.f67362p0.getEntryBytes(this.f67363q0);
            if (entryBytes == null) {
                return null;
            }
            return new ZippedBytesReader(this.f67364r0.getResourcesFileCipher().decrypt(entryBytes)).getFirstEntryBytes();
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getObverseCascadeBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {190, Opcodes.ATHROW}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67365p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67367r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f67367r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new k(this.f67367r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            DocumentFace obverse;
            DetectionParameters detectionParameters;
            String cascadeName;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67365p0;
            ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            this.f67365p0 = 1;
            obj = resourcesDatabase.getDocumentById(this.f67367r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Document document = (Document) obj;
            if (document == null || (obverse = document.getObverse()) == null || (detectionParameters = obverse.getDetectionParameters()) == null || (cascadeName = detectionParameters.getCascadeName()) == null) {
                return null;
            }
            this.f67365p0 = 2;
            obj = resourcesDatabase.getCascadeBytes(cascadeName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getObverseCascadeString$2", f = "ResourcesDatabase.kt", i = {}, l = {ErrorCodes.ERR_CRY_IO_PROPERTIES}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67368p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67370r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f67370r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new l(this.f67370r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67368p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f67368p0 = 1;
                obj = ResourcesDatabase.this.getObverseCascadeBytes(this.f67370r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getObverseStencilBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {148, 149}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67371p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67373r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f67373r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new m(this.f67373r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            DocumentFace obverse;
            String stencilName;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67371p0;
            ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            this.f67371p0 = 1;
            obj = resourcesDatabase.getDocumentById(this.f67373r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Document document = (Document) obj;
            if (document == null || (obverse = document.getObverse()) == null || (stencilName = obverse.getStencilName()) == null) {
                return null;
            }
            this.f67371p0 = 2;
            obj = resourcesDatabase.getStencilBytes(stencilName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getObverseTemplateBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {168, 169}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67374p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67376r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f67376r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new n(this.f67376r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            DocumentFace obverse;
            DetectionParameters detectionParameters;
            String templateName;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67374p0;
            ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            this.f67374p0 = 1;
            obj = resourcesDatabase.getDocumentById(this.f67376r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Document document = (Document) obj;
            if (document == null || (obverse = document.getObverse()) == null || (detectionParameters = obverse.getDetectionParameters()) == null || (templateName = detectionParameters.getTemplateName()) == null) {
                return null;
            }
            this.f67374p0 = 2;
            obj = resourcesDatabase.getTemplateBytes(templateName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getReverseCascadeBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {Opcodes.IFNULL, Opcodes.IFNONNULL}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67377p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67379r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f67379r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new o(this.f67379r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            DocumentFace reverse;
            DetectionParameters detectionParameters;
            String cascadeName;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67377p0;
            ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            this.f67377p0 = 1;
            obj = resourcesDatabase.getDocumentById(this.f67379r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Document document = (Document) obj;
            if (document == null || (reverse = document.getReverse()) == null || (detectionParameters = reverse.getDetectionParameters()) == null || (cascadeName = detectionParameters.getCascadeName()) == null) {
                return null;
            }
            this.f67377p0 = 2;
            obj = resourcesDatabase.getCascadeBytes(cascadeName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getReverseCascadeString$2", f = "ResourcesDatabase.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67380p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67382r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f67382r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new p(this.f67382r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67380p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f67380p0 = 1;
                obj = ResourcesDatabase.this.getReverseCascadeBytes(this.f67382r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getReverseStencilBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {156, 157}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67383p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67385r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f67385r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new q(this.f67385r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            DocumentFace reverse;
            String stencilName;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67383p0;
            ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            this.f67383p0 = 1;
            obj = resourcesDatabase.getDocumentById(this.f67385r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Document document = (Document) obj;
            if (document == null || (reverse = document.getReverse()) == null || (stencilName = reverse.getStencilName()) == null) {
                return null;
            }
            this.f67383p0 = 2;
            obj = resourcesDatabase.getStencilBytes(stencilName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getReverseTemplateBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {176, 177}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67386p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67388r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f67388r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new r(this.f67388r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            DocumentFace reverse;
            DetectionParameters detectionParameters;
            String templateName;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67386p0;
            ResourcesDatabase resourcesDatabase = ResourcesDatabase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            this.f67386p0 = 1;
            obj = resourcesDatabase.getDocumentById(this.f67388r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Document document = (Document) obj;
            if (document == null || (reverse = document.getReverse()) == null || (detectionParameters = reverse.getDetectionParameters()) == null || (templateName = detectionParameters.getTemplateName()) == null) {
                return null;
            }
            this.f67386p0 = 2;
            obj = resourcesDatabase.getTemplateBytes(templateName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getStencilBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f67390q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f67390q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new s(this.f67390q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return ResourcesDatabase.this.assetsProvider.getStencilBytes(this.f67390q0 + ".webp");
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getTemplateBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f67392q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f67392q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new t(this.f67392q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return ResourcesDatabase.this.assetsProvider.getTemplateBytes(this.f67392q0);
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$getZippedFileBytes$2", f = "ResourcesDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ResourcesCipher f67393p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ byte[] f67394q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(byte[] bArr, ResourcesCipher resourcesCipher, Continuation continuation) {
            super(2, continuation);
            this.f67393p0 = resourcesCipher;
            this.f67394q0 = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new u(this.f67394q0, this.f67393p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f67393p0.decrypt(new ByteArrayInputStream(this.f67394q0), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray != null) {
                return byteArray;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase", f = "ResourcesDatabase.kt", i = {0, 1, 2}, l = {49, 51, 52, 53}, m = "init", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    public static final class v extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ResourcesDatabase f67395p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ResourcesDatabase f67396q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f67397r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f67399t0;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f67397r0 = obj;
            this.f67399t0 |= Integer.MIN_VALUE;
            return ResourcesDatabase.this.init(this);
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$parseDocIdsByCountryMap$2", f = "ResourcesDatabase.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nResourcesDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$parseDocIdsByCountryMap$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,231:1\n96#2:232\n*S KotlinDebug\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$parseDocIdsByCountryMap$2\n*L\n76#1:232\n*E\n"})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends List<? extends String>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67400p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ZippedBytesReader f67402r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ZippedBytesReader zippedBytesReader, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f67402r0 = zippedBytesReader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new w(this.f67402r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<? extends String>>> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67400p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f67400p0 = 1;
                obj = ResourcesDatabase.this.getEntryBytes(this.f67402r0, ResourcesDatabase.DOCS_BY_COUNTRY_PATH, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Json.Companion companion = Json.INSTANCE;
            String str = new String((byte[]) obj, Charsets.UTF_8);
            SerializersModule serializersModule = companion.getSerializersModule();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KType kTypeTypeOf = Reflection.typeOf(Map.class, companion2.invariant(Reflection.typeOf(String.class)), companion2.invariant(Reflection.typeOf(List.class, companion2.invariant(Reflection.typeOf(String.class)))));
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return companion.decodeFromString(SerializersKt.serializer(serializersModule, kTypeTypeOf), str);
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.ResourcesDatabase$parseDocIdsByGroupMap$2", f = "ResourcesDatabase.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nResourcesDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$parseDocIdsByGroupMap$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,231:1\n96#2:232\n*S KotlinDebug\n*F\n+ 1 ResourcesDatabase.kt\ncom/veridas/resource/database/ResourcesDatabase$parseDocIdsByGroupMap$2\n*L\n69#1:232\n*E\n"})
    public static final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends List<? extends String>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67403p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ZippedBytesReader f67405r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ZippedBytesReader zippedBytesReader, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f67405r0 = zippedBytesReader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ResourcesDatabase.this.new x(this.f67405r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<? extends String>>> continuation) {
            return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67403p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f67403p0 = 1;
                obj = ResourcesDatabase.this.getEntryBytes(this.f67405r0, ResourcesDatabase.DOCS_BY_GROUP_PATH, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Json.Companion companion = Json.INSTANCE;
            String str = new String((byte[]) obj, Charsets.UTF_8);
            SerializersModule serializersModule = companion.getSerializersModule();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KType kTypeTypeOf = Reflection.typeOf(Map.class, companion2.invariant(Reflection.typeOf(String.class)), companion2.invariant(Reflection.typeOf(List.class, companion2.invariant(Reflection.typeOf(String.class)))));
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return companion.decodeFromString(SerializersKt.serializer(serializersModule, kTypeTypeOf), str);
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    public static final class y extends Lambda implements Function0<ResourcesCipher> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final y f67406p0 = new y(0);

        @Override // kotlin.jvm.functions.Function0
        public final ResourcesCipher invoke() {
            return new ResourcesCipher(ResourcesDatabase.RESOURCES_ARCHIVE_SECRET, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: ResourcesDatabase.kt */
    public static final class z extends Lambda implements Function0<ResourcesCipher> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final z f67407p0 = new z(0);

        @Override // kotlin.jvm.functions.Function0
        public final ResourcesCipher invoke() {
            return new ResourcesCipher(ResourcesDatabase.ROOT_ARCHIVE_SECRET, null, 2, null);
        }
    }

    public ResourcesDatabase(@NotNull IDatabaseAssetsProvider assetsProvider, @NotNull CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.assetsProvider = assetsProvider;
        this.ioDispatcher = ioDispatcher;
        this.documentsMapByIdCache = new LinkedHashMap();
        this.rootFileCipher = LazyKt__LazyJVMKt.lazy(z.f67407p0);
        this.resourcesFileCipher = LazyKt__LazyJVMKt.lazy(y.f67406p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAllDocumentIds(Map<String, ? extends List<String>> map, Continuation<? super List<String>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new b(map, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getEntryBytes(ZippedBytesReader zippedBytesReader, String str, Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new j(this, zippedBytesReader, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResourcesCipher getResourcesFileCipher() {
        return (ResourcesCipher) this.resourcesFileCipher.getValue();
    }

    private final ResourcesCipher getRootFileCipher() {
        return (ResourcesCipher) this.rootFileCipher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getZippedFileBytes(byte[] bArr, ResourcesCipher resourcesCipher, Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new u(bArr, resourcesCipher, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseDocIdsByCountryMap(ZippedBytesReader zippedBytesReader, Continuation<? super Map<String, ? extends List<String>>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new w(zippedBytesReader, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseDocIdsByGroupMap(ZippedBytesReader zippedBytesReader, Continuation<? super Map<String, ? extends List<String>>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new x(zippedBytesReader, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getAllCountryIds(@NotNull Continuation<? super List<String>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new a(null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getAllDocuments(@NotNull Continuation<? super List<Document>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new c(null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getAllGroupIds(@NotNull Continuation<? super List<String>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new d(null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getCascadeBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new e(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getCascadeString(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new f(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getDocumentById(@NotNull String str, @NotNull Continuation<? super Document> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new g(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getDocumentIdsByCountryMap(@NotNull Continuation<? super Map<String, ? extends List<String>>> continuation) {
        Map<String, ? extends List<String>> map = this.docIdsByCountryMap;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("docIdsByCountryMap");
        return null;
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getDocumentsByCountryId(@NotNull String str, @NotNull Continuation<? super List<Document>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new h(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getDocumentsByIdList(@NotNull List<String> list, @NotNull Continuation<? super List<Document>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new i(list, this, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getObverseCascadeBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new k(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getObverseCascadeString(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new l(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getObverseStencilBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new m(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getObverseTemplateBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new n(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getReverseCascadeBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new o(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getReverseCascadeString(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new p(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getReverseStencilBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new q(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getReverseTemplateBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new r(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getStencilBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new s(str, null), continuation);
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getTemplateBytes(@NotNull String str, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new t(str, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object init(@NotNull Continuation<? super Unit> continuation) {
        v vVar;
        ResourcesDatabase resourcesDatabase;
        ResourcesDatabase resourcesDatabase2;
        ResourcesDatabase resourcesDatabase3;
        ResourcesDatabase resourcesDatabase4;
        ZippedBytesReader zippedBytesReader;
        ResourcesDatabase resourcesDatabase5;
        ResourcesDatabase resourcesDatabase6;
        Map<String, ? extends List<String>> map;
        ResourcesDatabase resourcesDatabase7;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i10 = vVar.f67399t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f67399t0 = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        Object zippedFileBytes = vVar.f67397r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = vVar.f67399t0;
        if (i11 != 0) {
            if (i11 == 1) {
                resourcesDatabase = vVar.f67396q0;
                resourcesDatabase2 = vVar.f67395p0;
                ResultKt.throwOnFailure(zippedFileBytes);
            } else if (i11 == 2) {
                resourcesDatabase3 = vVar.f67396q0;
                resourcesDatabase4 = vVar.f67395p0;
                ResultKt.throwOnFailure(zippedFileBytes);
                resourcesDatabase3.docIdsByCountryMap = (Map) zippedFileBytes;
                zippedBytesReader = resourcesDatabase4.rootZipReader;
                if (zippedBytesReader == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootZipReader");
                    zippedBytesReader = null;
                }
                vVar.f67395p0 = resourcesDatabase4;
                vVar.f67396q0 = resourcesDatabase4;
                vVar.f67399t0 = 3;
                zippedFileBytes = resourcesDatabase4.parseDocIdsByGroupMap(zippedBytesReader, vVar);
                if (zippedFileBytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                resourcesDatabase5 = resourcesDatabase4;
                resourcesDatabase6 = resourcesDatabase5;
                resourcesDatabase5.docIdsByGroupMap = (Map) zippedFileBytes;
                map = resourcesDatabase6.docIdsByCountryMap;
                if (map == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("docIdsByCountryMap");
                    map = null;
                }
                vVar.f67395p0 = resourcesDatabase6;
                vVar.f67396q0 = null;
                vVar.f67399t0 = 4;
                zippedFileBytes = resourcesDatabase6.getAllDocumentIds(map, vVar);
                if (zippedFileBytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                resourcesDatabase7 = resourcesDatabase6;
            } else if (i11 == 3) {
                resourcesDatabase5 = vVar.f67396q0;
                resourcesDatabase6 = vVar.f67395p0;
                ResultKt.throwOnFailure(zippedFileBytes);
                resourcesDatabase5.docIdsByGroupMap = (Map) zippedFileBytes;
                map = resourcesDatabase6.docIdsByCountryMap;
                if (map == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("docIdsByCountryMap");
                    map = null;
                }
                vVar.f67395p0 = resourcesDatabase6;
                vVar.f67396q0 = null;
                vVar.f67399t0 = 4;
                zippedFileBytes = resourcesDatabase6.getAllDocumentIds(map, vVar);
                if (zippedFileBytes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                resourcesDatabase7 = resourcesDatabase6;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resourcesDatabase7 = vVar.f67395p0;
                ResultKt.throwOnFailure(zippedFileBytes);
            }
            resourcesDatabase7.docIds = (List) zippedFileBytes;
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(zippedFileBytes);
        byte[] dataBaseBytes = this.assetsProvider.getDataBaseBytes();
        ResourcesCipher rootFileCipher = getRootFileCipher();
        vVar.f67395p0 = this;
        vVar.f67396q0 = this;
        vVar.f67399t0 = 1;
        zippedFileBytes = getZippedFileBytes(dataBaseBytes, rootFileCipher, vVar);
        if (zippedFileBytes == coroutine_suspended) {
            return coroutine_suspended;
        }
        resourcesDatabase = this;
        resourcesDatabase2 = resourcesDatabase;
        resourcesDatabase.zippedFileBytes = (byte[]) zippedFileBytes;
        byte[] bArr = resourcesDatabase2.zippedFileBytes;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zippedFileBytes");
            bArr = null;
        }
        ZippedBytesReader zippedBytesReader2 = new ZippedBytesReader(bArr);
        resourcesDatabase2.rootZipReader = zippedBytesReader2;
        vVar.f67395p0 = resourcesDatabase2;
        vVar.f67396q0 = resourcesDatabase2;
        vVar.f67399t0 = 2;
        zippedFileBytes = resourcesDatabase2.parseDocIdsByCountryMap(zippedBytesReader2, vVar);
        if (zippedFileBytes == coroutine_suspended) {
            return coroutine_suspended;
        }
        resourcesDatabase3 = resourcesDatabase2;
        resourcesDatabase4 = resourcesDatabase3;
        resourcesDatabase3.docIdsByCountryMap = (Map) zippedFileBytes;
        zippedBytesReader = resourcesDatabase4.rootZipReader;
        if (zippedBytesReader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootZipReader");
            zippedBytesReader = null;
        }
        vVar.f67395p0 = resourcesDatabase4;
        vVar.f67396q0 = resourcesDatabase4;
        vVar.f67399t0 = 3;
        zippedFileBytes = resourcesDatabase4.parseDocIdsByGroupMap(zippedBytesReader, vVar);
        if (zippedFileBytes == coroutine_suspended) {
            return coroutine_suspended;
        }
        resourcesDatabase5 = resourcesDatabase4;
        resourcesDatabase6 = resourcesDatabase5;
        resourcesDatabase5.docIdsByGroupMap = (Map) zippedFileBytes;
        map = resourcesDatabase6.docIdsByCountryMap;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("docIdsByCountryMap");
            map = null;
        }
        vVar.f67395p0 = resourcesDatabase6;
        vVar.f67396q0 = null;
        vVar.f67399t0 = 4;
        zippedFileBytes = resourcesDatabase6.getAllDocumentIds(map, vVar);
        if (zippedFileBytes == coroutine_suspended) {
            return coroutine_suspended;
        }
        resourcesDatabase7 = resourcesDatabase6;
        resourcesDatabase7.docIds = (List) zippedFileBytes;
        return Unit.INSTANCE;
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object releaseResources(@NotNull Continuation<? super Unit> continuation) {
        this.documentsMapByIdCache.clear();
        return Unit.INSTANCE;
    }

    @Override // com.veridas.resource.database.IResourcesDatabase
    @Nullable
    public Object getAllDocumentIds(@NotNull Continuation<? super List<String>> continuation) {
        List<String> list = this.docIds;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("docIds");
        return null;
    }

    public /* synthetic */ ResourcesDatabase(IDatabaseAssetsProvider iDatabaseAssetsProvider, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iDatabaseAssetsProvider, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
