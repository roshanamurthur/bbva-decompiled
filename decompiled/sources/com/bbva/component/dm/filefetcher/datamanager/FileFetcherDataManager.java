package com.bbva.component.dm.filefetcher.datamanager;

import android.content.Context;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.filefetcher.data.model.FileFetchErrorResponse;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.FileResponse;
import com.bbva.component.dm.filefetcher.data.model.StoreParams;
import com.bbva.component.dm.filefetcher.datamanager.provider.UseCaseDependency;
import com.bbva.component.dm.filefetcher.datamanager.provider.UseCaseProvider;
import com.bbva.network.NetworkWorker;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileFetcherDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0006H\u0016R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR>\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/bbva/component/dm/filefetcher/datamanager/FileFetcherDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "fileRequest", "", "fetchFile", "dispose", "folderName", "Ljava/lang/String;", "getFolderName$component_dm_filefetcher_release", "()Ljava/lang/String;", "setFolderName$component_dm_filefetcher_release", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headers", "Ljava/util/HashMap;", "getHeaders$component_dm_filefetcher_release", "()Ljava/util/HashMap;", "setHeaders$component_dm_filefetcher_release", "(Ljava/util/HashMap;)V", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Landroid/content/Context;", "context", "Lcom/bbva/component/dm/filefetcher/datamanager/provider/UseCaseProvider;", "useCaseProvider", "<init>", "(Lcom/bbva/network/NetworkWorker;Landroid/content/Context;Lcom/bbva/component/dm/filefetcher/datamanager/provider/UseCaseProvider;)V", "Companion", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final class FileFetcherDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-filefetcher";

    @NotNull
    public String folderName;

    @NotNull
    public HashMap<String, String> headers;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Lazy f27633p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final NetworkWorker f27634q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final UseCaseProvider f27635r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f27632s0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FileFetcherDataManager.class), "useCase", "getUseCase()Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;"))};

    @JvmField
    @NotNull
    public static final ActionSpec<FileResponse> ON_FETCH_SUCCESS = new ActionSpec<>("on-fetch-success");

    @JvmField
    @NotNull
    public static final ActionSpec<FileFetchErrorResponse> ON_FETCH_ERROR = new ActionSpec<>("on-fetch-error");

    /* JADX INFO: compiled from: FileFetcherDataManager.kt */
    public static final class a<T> implements UseCase.UseCaseSuccessCallback<FileResponse> {
        public a() {
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(FileResponse fileResponse) {
            FileFetcherDataManager.this.fire(FileFetcherDataManager.ON_FETCH_SUCCESS, fileResponse);
        }
    }

    /* JADX INFO: compiled from: FileFetcherDataManager.kt */
    public static final class b implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FileRequest f27638b;

        public b(FileRequest fileRequest) {
            this.f27638b = fileRequest;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable th2) {
            FileFetcherDataManager.this.fire(FileFetcherDataManager.ON_FETCH_ERROR, new FileFetchErrorResponse(this.f27638b.getActionResult(), th2.getMessage()));
        }
    }

    /* JADX INFO: compiled from: FileFetcherDataManager.kt */
    public static final class c extends Lambda implements Function0<UseCase<FileResponse, FileRequest>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UseCase<FileResponse, FileRequest> invoke() {
            FileFetcherDataManager fileFetcherDataManager = FileFetcherDataManager.this;
            return fileFetcherDataManager.f27635r0.provide(new StoreParams(fileFetcherDataManager.getFolderName$component_dm_filefetcher_release(), ""));
        }
    }

    public /* synthetic */ FileFetcherDataManager(NetworkWorker networkWorker, Context context, UseCaseProvider useCaseProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkWorker, context, (i10 & 4) != 0 ? new UseCaseDependency(networkWorker, context) : useCaseProvider);
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        KProperty kProperty = f27632s0[0];
        ((UseCase) this.f27633p0.getValue()).dispose();
    }

    public final void fetchFile(@NotNull FileRequest fileRequest) {
        KProperty kProperty = f27632s0[0];
        UseCase useCase = (UseCase) this.f27633p0.getValue();
        HashMap<String, String> map = this.headers;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headers");
        }
        useCase.execute(fileRequest.withAppendedHeaders(map), new a(), new b(fileRequest));
    }

    @NotNull
    public final String getFolderName$component_dm_filefetcher_release() {
        String str = this.folderName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("folderName");
        }
        return str;
    }

    @NotNull
    public final HashMap<String, String> getHeaders$component_dm_filefetcher_release() {
        HashMap<String, String> map = this.headers;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headers");
        }
        return map;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF28076q0() {
        return ID;
    }

    public final void setFolderName$component_dm_filefetcher_release(@NotNull String str) {
        this.folderName = str;
    }

    public final void setHeaders$component_dm_filefetcher_release(@NotNull HashMap<String, String> map) {
        this.headers = map;
    }

    public FileFetcherDataManager(@NotNull NetworkWorker networkWorker, @NotNull Context context, @NotNull UseCaseProvider useCaseProvider) {
        this.f27634q0 = networkWorker;
        this.f27635r0 = useCaseProvider;
        this.f27633p0 = LazyKt__LazyJVMKt.lazy(new c());
        newProperty("folder", new com.bbva.cellscore.reactor.a(this, 1));
        newProperty("headers", new u4.a(this, 1));
    }
}
