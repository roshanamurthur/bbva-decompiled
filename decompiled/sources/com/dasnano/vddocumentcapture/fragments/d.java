package com.dasnano.vddocumentcapture.fragments;

import com.mypinpad.tsdk.isolation.getDiscretionaryTagData;
import com.mypinpad.tsdk.isolation.setLastBaselineToBottomHeight;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f39362p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f39363q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f39364r0;

    public /* synthetic */ d(Object obj, int i10, int i11) {
        this.f39362p0 = i11;
        this.f39364r0 = obj;
        this.f39363q0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f39362p0) {
            case 0:
                DocumentFragment documentFragment = (DocumentFragment) this.f39364r0;
                int i10 = this.f39363q0;
                if (documentFragment.isRunning.get() && documentFragment.getGenericDocumentState().isSearching) {
                    documentFragment.mProgress = i10;
                    documentFragment.userVisualHelpManager.changeRectangleColor(documentFragment.getActivity(), i10, documentFragment.mReferenceRect, documentFragment.R0);
                    documentFragment.runOnUiThread(new k(documentFragment, i10));
                }
                break;
            default:
                setLastBaselineToBottomHeight setlastbaselinetobottomheight = (setLastBaselineToBottomHeight) this.f39364r0;
                int i11 = this.f39363q0;
                getDiscretionaryTagData.setY(new Object[]{setlastbaselinetobottomheight, Integer.valueOf(i11)}, -419522597, 419522607, i11);
                break;
        }
    }
}
