package com.bbva.cells.component.kit.datamanager.domain.usecase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VoidUseCase<Param> extends UseCase<Object, Param> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f26684d = new Object();

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    public Object call(Param param) throws Exception {
        execute(param);
        return f26684d;
    }

    public abstract void execute(Param param) throws Exception;
}
