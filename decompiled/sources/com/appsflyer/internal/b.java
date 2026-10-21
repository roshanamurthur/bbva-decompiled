package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.IOException;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f26394p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f26395q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f26396r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f26397s0;

    public /* synthetic */ b(Object obj, Object obj2, int i10, Object obj3) {
        this.f26394p0 = i10;
        this.f26395q0 = obj;
        this.f26396r0 = obj2;
        this.f26397s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26394p0;
        Object obj = this.f26397s0;
        Object obj2 = this.f26396r0;
        Object obj3 = this.f26395q0;
        switch (i10) {
            case 0:
                ((AFa1dSDK) obj3).AFInAppEventParameterName((Context) obj2, (Intent) obj);
                break;
            default:
                Callback callback = (Callback) obj2;
                Response response = (Response) obj;
                retrofit2.c.b bVar = ((retrofit2.c.b.a) obj3).f93058b;
                if (!bVar.f93056q0.isCanceled()) {
                    callback.onResponse(bVar, response);
                } else {
                    callback.onFailure(bVar, new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED));
                }
                break;
        }
    }
}
