package com.bbva.glomohybrid.documents.common;

import com.bbva.glomohybrid.documents.common.model.Document;
import com.bbva.glomohybrid.documents.common.model.LocalFile;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import com.bbva.network.NetworkWorker;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: FileUseCaseFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002J\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002J\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002J\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0002¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/FileUseCaseFactory;", "Lorg/koin/core/component/KoinComponent;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/documents/common/model/Document;", "Lcom/bbva/glomoutils/Either;", "", "Ljava/io/File;", "getTermsUseCase", "getDocumentUseCase", "getFileUseCase", "Lcom/bbva/glomohybrid/documents/common/model/LocalFile;", "", "openFileUseCase", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFileUseCaseFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUseCaseFactory.kt\ncom/bbva/glomohybrid/documents/common/FileUseCaseFactory\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,37:1\n41#2,6:38\n47#2:45\n41#2,6:47\n47#2:54\n41#2,6:56\n47#2:63\n41#2,6:65\n47#2:72\n133#3:44\n133#3:53\n133#3:62\n133#3:71\n107#4:46\n107#4:55\n107#4:64\n107#4:73\n*S KotlinDebug\n*F\n+ 1 FileUseCaseFactory.kt\ncom/bbva/glomohybrid/documents/common/FileUseCaseFactory\n*L\n16#1:38,6\n16#1:45\n22#1:47,6\n22#1:54\n28#1:56,6\n28#1:63\n34#1:65,6\n34#1:72\n16#1:44\n22#1:53\n28#1:62\n34#1:71\n16#1:46\n22#1:55\n28#1:64\n34#1:73\n*E\n"})
public final class FileUseCaseFactory implements KoinComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f32049p0;

    /* JADX INFO: compiled from: FileUseCaseFactory.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(FileUseCaseFactory.this.f32049p0);
        }
    }

    /* JADX INFO: compiled from: FileUseCaseFactory.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(FileUseCaseFactory.this.f32049p0);
        }
    }

    /* JADX INFO: compiled from: FileUseCaseFactory.kt */
    public static final class c extends Lambda implements Function0<ParametersHolder> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(FileUseCaseFactory.this.f32049p0);
        }
    }

    public FileUseCaseFactory(@NotNull NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        this.f32049p0 = networkWorker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final UseCaseWithParams<Document, Either<Throwable, File>> getDocumentUseCase() {
        return (UseCaseWithParams) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FetchDocumentUseCase.class), null, new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final UseCaseWithParams<Document, Either<Throwable, File>> getFileUseCase() {
        return (UseCaseWithParams) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FetchFileUseCase.class), null, new b());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final UseCaseWithParams<Document, Either<Throwable, File>> getTermsUseCase() {
        return (UseCaseWithParams) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FetchTermsByNameUseCase.class), null, new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final UseCaseWithParams<LocalFile, Boolean> openFileUseCase() {
        return (UseCaseWithParams) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(OpenFileUseCase.class), null, null);
    }
}
