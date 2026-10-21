package com.bbva.glomohybrid.documents.component;

import androidx.activity.a;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.reactor.e;
import com.bbva.cellscore.reactor.f;
import com.bbva.glomohybrid.documents.common.GetTermsUrlByNameUseCase;
import com.bbva.glomohybrid.documents.common.SaveTermsUseCase;
import com.bbva.glomohybrid.documents.common.model.TermsDataModel;
import com.bbva.glomohybrid.documents.common.repository.TermsRepository;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TermsDataManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\b\u0010\f\u001a\u00020\u0005H\u0016R\"\u0010\r\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/documents/component/TermsDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "termsName", "", "getTerms", "", "Lcom/bbva/glomohybrid/documents/common/model/TermsDataModel;", "terms", "saveTerms", "onPropertiesBound", "dispose", "host", "Ljava/lang/String;", "getHost$gl_documents_release", "()Ljava/lang/String;", "setHost$gl_documents_release", "(Ljava/lang/String;)V", "path", "getPath$gl_documents_release", "setPath$gl_documents_release", "Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;", "repository", "<init>", "(Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;)V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTermsDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TermsDataManager.kt\ncom/bbva/glomohybrid/documents/component/TermsDataManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,68:1\n13309#2,2:69\n*S KotlinDebug\n*F\n+ 1 TermsDataManager.kt\ncom/bbva/glomohybrid/documents/component/TermsDataManager\n*L\n65#1:69,2\n*E\n"})
public final class TermsDataManager extends DataManager {
    public String host;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final TermsRepository f32093p0;
    public String path;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GetTermsUrlByNameUseCase f32094q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SaveTermsUseCase f32095r0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final String f32092s0 = "component-dm-terms";

    @JvmField
    @NotNull
    public static final ActionSpec<Result<String>> ACTION_URL_SUCCESS = new ActionSpec<>("action-terms-url-complete");

    /* JADX INFO: compiled from: TermsDataManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/documents/component/TermsDataManager$Companion;", "", "()V", "ACTION_URL_SUCCESS", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lkotlin/Result;", "", "ID", "getID", "()Ljava/lang/String;", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getID() {
            return TermsDataManager.f32092s0;
        }
    }

    public TermsDataManager(@NotNull TermsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f32093p0 = repository;
        newProperty("host", new e(this, 2));
        newProperty("path", new f(this, 2));
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        UseCase[] useCaseArr = new UseCase[2];
        GetTermsUrlByNameUseCase getTermsUrlByNameUseCase = this.f32094q0;
        SaveTermsUseCase saveTermsUseCase = null;
        if (getTermsUrlByNameUseCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getTermsUrlUseCase");
            getTermsUrlByNameUseCase = null;
        }
        useCaseArr[0] = getTermsUrlByNameUseCase;
        SaveTermsUseCase saveTermsUseCase2 = this.f32095r0;
        if (saveTermsUseCase2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveTermsUseCase");
        } else {
            saveTermsUseCase = saveTermsUseCase2;
        }
        useCaseArr[1] = saveTermsUseCase;
        for (int i10 = 0; i10 < 2; i10++) {
            useCaseArr[i10].dispose();
        }
    }

    @NotNull
    public final String getHost$gl_documents_release() {
        String str = this.host;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("host");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return f32092s0;
    }

    @NotNull
    public final String getPath$gl_documents_release() {
        String str = this.path;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("path");
        return null;
    }

    @Deprecated(message = "Should be migrated to plugin")
    public final void getTerms(@NotNull String termsName) {
        Intrinsics.checkNotNullParameter(termsName, "termsName");
        GetTermsUrlByNameUseCase getTermsUrlByNameUseCase = this.f32094q0;
        if (getTermsUrlByNameUseCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getTermsUrlUseCase");
            getTermsUrlByNameUseCase = null;
        }
        getTermsUrlByNameUseCase.execute(termsName, new UseCase.UseCaseSuccessCallback() { // from class: p8.a
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                TermsDataManager.Companion companion = TermsDataManager.INSTANCE;
                TermsDataManager this$0 = this.f92582a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(TermsDataManager.ACTION_URL_SUCCESS, Result.m5534boximpl(Result.m5535constructorimpl((String) obj)));
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: p8.b
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                TermsDataManager.Companion companion = TermsDataManager.INSTANCE;
                TermsDataManager this$0 = this.f92583a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ActionSpec<Result<String>> actionSpec = TermsDataManager.ACTION_URL_SUCCESS;
                Result.Companion companion2 = Result.INSTANCE;
                Intrinsics.checkNotNull(th2);
                this$0.fire(actionSpec, Result.m5534boximpl(Result.m5535constructorimpl(ResultKt.createFailure(th2))));
            }
        });
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        super.onPropertiesBound();
        String strF = u.f(getHost$gl_documents_release(), getPath$gl_documents_release());
        TermsRepository termsRepository = this.f32093p0;
        this.f32094q0 = new GetTermsUrlByNameUseCase(strF, termsRepository);
        this.f32095r0 = new SaveTermsUseCase(termsRepository);
    }

    public final void saveTerms(@NotNull List<TermsDataModel> terms) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        SaveTermsUseCase saveTermsUseCase = this.f32095r0;
        if (saveTermsUseCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveTermsUseCase");
            saveTermsUseCase = null;
        }
        saveTermsUseCase.execute(terms, new a(), new ci.a());
    }

    public final void setHost$gl_documents_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void setPath$gl_documents_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }
}
