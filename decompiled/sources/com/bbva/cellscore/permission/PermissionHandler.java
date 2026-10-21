package com.bbva.cellscore.permission;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.permission.PermissionManager;
import com.bbva.androidtoolkit.plugin.permission.PermissionReport;
import com.bbva.androidtoolkit.plugin.permission.PermissionResultListener;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.pubsub.PubSubMessage;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/* JADX INFO: loaded from: classes2.dex */
public class PermissionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublishSubject<PermissionResult> f27010a = PublishSubject.create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublishSubject<PermissionResult> f27011b = PublishSubject.create();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PermissionResult f27012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27013d;

    public class a implements PermissionResultListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Reaction f27014p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PubSubMessage f27015q0;

        public a(Reaction reaction, PubSubMessage pubSubMessage) {
            this.f27014p0 = reaction;
            this.f27015q0 = pubSubMessage;
        }

        @Override // com.bbva.androidtoolkit.plugin.permission.PermissionResultListener
        public final void onRequestPermissionFinish(PermissionReport permissionReport) {
            PermissionHandler permissionHandler = PermissionHandler.this;
            permissionHandler.getClass();
            PermissionResult permissionResult = new PermissionResult(permissionReport.getGranted(), permissionReport.getDenied());
            permissionResult.f27019c = permissionReport.hasPermanentlyDeniedAnyPermission();
            permissionResult.setReaction(this.f27014p0);
            permissionResult.setPubSubMessage(this.f27015q0);
            if (!permissionHandler.f27013d) {
                permissionHandler.f27012c = permissionResult;
            } else if (permissionResult.areAllGranted()) {
                permissionHandler.f27010a.onNext(permissionResult);
            } else {
                permissionHandler.f27011b.onNext(permissionResult);
            }
        }
    }

    public Observable<PermissionResult> denied() {
        return this.f27011b;
    }

    public void disable() {
        this.f27013d = false;
    }

    public void enable() {
        this.f27013d = true;
        PermissionResult permissionResult = this.f27012c;
        if (permissionResult != null) {
            if (permissionResult.areAllGranted()) {
                this.f27010a.onNext(permissionResult);
            } else {
                this.f27011b.onNext(permissionResult);
            }
            this.f27012c = null;
        }
    }

    public Observable<PermissionResult> granted() {
        return this.f27010a;
    }

    public void request(Activity activity, Reaction reaction, PubSubMessage pubSubMessage) {
        PermissionManager.request(activity, reaction.getPermissionsNeeded(), new a(reaction, pubSubMessage));
    }
}
