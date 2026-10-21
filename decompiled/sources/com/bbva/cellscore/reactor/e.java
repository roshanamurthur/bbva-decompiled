package com.bbva.cellscore.reactor;

import com.bbva.cellscore.permission.PermissionResult;
import com.bbva.component.dm.header.customers.CustomerInterceptorDataManager;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import io.reactivex.functions.Consumer;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f27049p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f27050q0;

    public /* synthetic */ e(Object obj, int i10) {
        this.f27049p0 = i10;
        this.f27050q0 = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f27049p0;
        Object obj2 = this.f27050q0;
        switch (i10) {
            case 0:
                PageReaction pageReaction = (PageReaction) obj2;
                PermissionResult permissionResult = (PermissionResult) obj;
                pageReaction.getClass();
                pageReaction.b(permissionResult.getReaction(), permissionResult.getPubSubMessage());
                break;
            case 1:
                ((CustomerInterceptorDataManager) obj2).cleanList = (List) obj;
                break;
            default:
                ((TermsDataManager) obj2).host = (String) obj;
                break;
        }
    }
}
