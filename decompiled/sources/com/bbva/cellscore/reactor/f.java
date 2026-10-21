package com.bbva.cellscore.reactor;

import com.bbva.cellscore.permission.PermissionResult;
import com.bbva.component.dm.headers.EtagDataManager;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f27051p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f27052q0;

    public /* synthetic */ f(Object obj, int i10) {
        this.f27051p0 = i10;
        this.f27052q0 = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f27051p0;
        Object obj2 = this.f27052q0;
        switch (i10) {
            case 0:
                ((PageReaction) obj2).onPermissionDenied((PermissionResult) obj);
                break;
            case 1:
                ((EtagDataManager) obj2).whiteList = (Map) obj;
                break;
            default:
                ((TermsDataManager) obj2).path = (String) obj;
                break;
        }
    }
}
