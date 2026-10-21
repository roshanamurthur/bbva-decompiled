package com.bbva.cellscore.reactor;

import com.bbva.cellscore.featureflag.FeatureFlagManagerKt;
import com.bbva.component.dm.filefetcher.datamanager.FileFetcherDataManager;
import com.bbva.glomohybrid.App;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f27041p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f27042q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f27041p0 = i10;
        this.f27042q0 = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f27041p0;
        Object obj2 = this.f27042q0;
        switch (i10) {
            case 0:
                GlobalReaction globalReaction = (GlobalReaction) obj2;
                globalReaction.f27031s0.readRoute(globalReaction.mTag);
                globalReaction.d(true);
                FeatureFlagManagerKt.applyFeatureFlags(globalReaction.f27033u0);
                break;
            case 1:
                ((FileFetcherDataManager) obj2).folderName = (String) obj;
                break;
            case 2:
                Function1 tmp0 = (Function1) obj2;
                App.Companion companion = App.Companion;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            default:
                ((InfoScreenComponent) obj2).setStyle((String) obj);
                break;
        }
    }
}
