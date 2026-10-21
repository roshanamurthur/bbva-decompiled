package com.bbva.slidemenuview.domain.usecase;

import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.usecase.UseCase;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.bbva.slidemenuview.repository.MenuRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetFeaturedMenuUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/slidemenuview/domain/usecase/GetFeaturedMenuUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "Lcom/bbva/glomoutils/Either;", "", "Lcom/bbva/slidemenuview/domain/model/MenuItems;", "execute", "Lcom/bbva/slidemenuview/repository/MenuRepository;", "repository", "<init>", "(Lcom/bbva/slidemenuview/repository/MenuRepository;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGetFeaturedMenuUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetFeaturedMenuUseCase.kt\ncom/bbva/slidemenuview/domain/usecase/GetFeaturedMenuUseCase\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n67#2:17\n1#3:18\n*S KotlinDebug\n*F\n+ 1 GetFeaturedMenuUseCase.kt\ncom/bbva/slidemenuview/domain/usecase/GetFeaturedMenuUseCase\n*L\n13#1:17\n13#1:18\n*E\n"})
public final class GetFeaturedMenuUseCase implements UseCase<Either<? extends Throwable, ? extends MenuItems>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MenuRepository f36726a;

    public GetFeaturedMenuUseCase(@NotNull MenuRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f36726a = repository;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Either<? extends Throwable, ? extends MenuItems> execute() {
        Either<? extends Throwable, ? extends MenuItems> eitherRight;
        MenuItems menuItems = this.f36726a.get();
        return (menuItems == null || (eitherRight = EitherKt.right(menuItems)) == null) ? EitherKt.left(new Exception("Menu not found")) : eitherRight;
    }
}
