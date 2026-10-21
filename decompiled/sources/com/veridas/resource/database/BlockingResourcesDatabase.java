package com.veridas.resource.database;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.veridas.lib.entities.resources.Document;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u001a\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/veridas/resource/database/BlockingResourcesDatabase;", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "resourcesDatabase", "Lcom/veridas/resource/database/IResourcesDatabase;", "(Lcom/veridas/resource/database/IResourcesDatabase;)V", "getAllCountryIds", "", "", "getAllDocumentIds", "getAllDocuments", "Lcom/veridas/lib/entities/resources/Document;", "getAllGroupIds", "getCascadeBytes", "", "name", "getCascadeString", "getDocumentById", "id", "getDocumentIdsByCountryMap", "", "getDocumentsByCountryId", "countryId", "getDocumentsByIdList", RelayedService.KEY_IDS, "getObverseCascadeBytes", "documentId", "getObverseCascadeString", "getObverseStencilBytes", "getObverseTemplateBytes", "getReverseCascadeBytes", "getReverseCascadeString", "getReverseStencilBytes", "getReverseTemplateBytes", "getStencilBytes", "getTemplateBytes", "init", "", "releaseResources", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BlockingResourcesDatabase implements IBlockingResourcesDatabase {

    @NotNull
    private final IResourcesDatabase resourcesDatabase;

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getAllCountryIds$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67280p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67280p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67280p0 = 1;
                obj = iResourcesDatabase.getAllCountryIds(this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getAllDocumentIds$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67282p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67282p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67282p0 = 1;
                obj = iResourcesDatabase.getAllDocumentIds(this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getAllDocuments$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Document>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67284p0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Document>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67284p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67284p0 = 1;
                obj = iResourcesDatabase.getAllDocuments(this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getAllGroupIds$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67286p0;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67286p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67286p0 = 1;
                obj = iResourcesDatabase.getAllGroupIds(this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getCascadeBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67288p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67290r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f67290r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new e(this.f67290r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67288p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67288p0 = 1;
                obj = iResourcesDatabase.getCascadeBytes(this.f67290r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getCascadeString$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67291p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67293r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f67293r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new f(this.f67293r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67291p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67291p0 = 1;
                obj = iResourcesDatabase.getCascadeString(this.f67293r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getDocumentById$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Document>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67294p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67296r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f67296r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new g(this.f67296r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Document> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67294p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67294p0 = 1;
                obj = iResourcesDatabase.getDocumentById(this.f67296r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getDocumentIdsByCountryMap$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends List<? extends String>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67297p0;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends List<? extends String>>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67297p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67297p0 = 1;
                obj = iResourcesDatabase.getDocumentIdsByCountryMap(this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getDocumentsByCountryId$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Document>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67299p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67301r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f67301r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new i(this.f67301r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Document>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67299p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67299p0 = 1;
                obj = iResourcesDatabase.getDocumentsByCountryId(this.f67301r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getDocumentsByIdList$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Document>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67302p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ List<String> f67304r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<String> list, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f67304r0 = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new j(this.f67304r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Document>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67302p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67302p0 = 1;
                obj = iResourcesDatabase.getDocumentsByIdList(this.f67304r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getObverseCascadeBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67305p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67307r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f67307r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new k(this.f67307r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67305p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67305p0 = 1;
                obj = iResourcesDatabase.getObverseCascadeBytes(this.f67307r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getObverseCascadeString$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67308p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67310r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f67310r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new l(this.f67310r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67308p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67308p0 = 1;
                obj = iResourcesDatabase.getObverseCascadeString(this.f67310r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getObverseStencilBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67311p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67313r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f67313r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new m(this.f67313r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67311p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67311p0 = 1;
                obj = iResourcesDatabase.getObverseStencilBytes(this.f67313r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getObverseTemplateBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67314p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67316r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f67316r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new n(this.f67316r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67314p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67314p0 = 1;
                obj = iResourcesDatabase.getObverseTemplateBytes(this.f67316r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getReverseCascadeBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67317p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67319r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f67319r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new o(this.f67319r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67317p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67317p0 = 1;
                obj = iResourcesDatabase.getReverseCascadeBytes(this.f67319r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getReverseCascadeString$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67320p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67322r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f67322r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new p(this.f67322r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67320p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67320p0 = 1;
                obj = iResourcesDatabase.getReverseCascadeString(this.f67322r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getReverseStencilBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67323p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67325r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f67325r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new q(this.f67325r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67323p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67323p0 = 1;
                obj = iResourcesDatabase.getReverseStencilBytes(this.f67325r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getReverseTemplateBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67326p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67328r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f67328r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new r(this.f67328r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67326p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67326p0 = 1;
                obj = iResourcesDatabase.getReverseTemplateBytes(this.f67328r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getStencilBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67329p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67331r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f67331r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new s(this.f67331r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67329p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67329p0 = 1;
                obj = iResourcesDatabase.getStencilBytes(this.f67331r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$getTemplateBytes$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67332p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f67334r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f67334r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new t(this.f67334r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67332p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67332p0 = 1;
                obj = iResourcesDatabase.getTemplateBytes(this.f67334r0, this);
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

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$init$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67335p0;

        public u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67335p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67335p0 = 1;
                if (iResourcesDatabase.init(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BlockingResourcesDatabase.kt */
    @DebugMetadata(c = "com.veridas.resource.database.BlockingResourcesDatabase$releaseResources$1", f = "BlockingResourcesDatabase.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67337p0;

        public v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlockingResourcesDatabase.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67337p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                IResourcesDatabase iResourcesDatabase = BlockingResourcesDatabase.this.resourcesDatabase;
                this.f67337p0 = 1;
                if (iResourcesDatabase.releaseResources(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public BlockingResourcesDatabase(@NotNull IResourcesDatabase resourcesDatabase) {
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        this.resourcesDatabase = resourcesDatabase;
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @NotNull
    public List<String> getAllCountryIds() {
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @NotNull
    public List<String> getAllDocumentIds() {
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new b(null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @NotNull
    public List<Document> getAllDocuments() {
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new c(null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @NotNull
    public List<String> getAllGroupIds() {
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new d(null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getCascadeBytes(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new e(name, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public String getCascadeString(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new f(name, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public Document getDocumentById(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (Document) BuildersKt__BuildersKt.runBlocking$default(null, new g(id, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @NotNull
    public Map<String, List<String>> getDocumentIdsByCountryMap() {
        return (Map) BuildersKt__BuildersKt.runBlocking$default(null, new h(null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @NotNull
    public List<Document> getDocumentsByCountryId(@NotNull String countryId) {
        Intrinsics.checkNotNullParameter(countryId, "countryId");
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new i(countryId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @NotNull
    public List<Document> getDocumentsByIdList(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new j(ids, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getObverseCascadeBytes(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new k(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public String getObverseCascadeString(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new l(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getObverseStencilBytes(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new m(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getObverseTemplateBytes(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new n(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getReverseCascadeBytes(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new o(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public String getReverseCascadeString(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new p(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getReverseStencilBytes(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new q(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getReverseTemplateBytes(@NotNull String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new r(documentId, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getStencilBytes(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new s(name, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    @Nullable
    public byte[] getTemplateBytes(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new t(name, null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    public void init() throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new u(null), 1, null);
    }

    @Override // com.veridas.resource.database.IBlockingResourcesDatabase
    public void releaseResources() throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new v(null), 1, null);
    }
}
