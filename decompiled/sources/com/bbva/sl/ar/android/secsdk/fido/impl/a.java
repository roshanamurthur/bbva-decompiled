package com.bbva.sl.ar.android.secsdk.fido.impl;

import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f36585p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f36586q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f36587r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f36588s0;

    public /* synthetic */ a(Object obj, Object obj2, int i10, Object obj3) {
        this.f36585p0 = i10;
        this.f36586q0 = obj;
        this.f36587r0 = obj2;
        this.f36588s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f36585p0;
        Object obj = this.f36588s0;
        Object obj2 = this.f36587r0;
        Object obj3 = this.f36586q0;
        switch (i10) {
            case 0:
                ((FidoSdkImpl) obj3).lambda$quickAuthData$0((FidoSdk.FidoQuickAuthDataCallback) obj2, (FidoSession) obj);
                break;
            default:
                DocumentFragment.l((DocumentFragment) obj3, (List) obj2, (GenericDocumentState) obj);
                break;
        }
    }
}
