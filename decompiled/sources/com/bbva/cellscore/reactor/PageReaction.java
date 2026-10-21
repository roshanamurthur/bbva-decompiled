package com.bbva.cellscore.reactor;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.logger.LogParam;
import com.bbva.cellscore.permission.PermissionHandler;
import com.bbva.cellscore.permission.PermissionResult;
import com.bbva.cellscore.pubsub.PubSubMessage;
import io.reactivex.disposables.CompositeDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PageReaction extends GlobalReaction {
    public final PermissionHandler G0 = new PermissionHandler();
    protected LifecycleOwner mLifeCycleOwner;

    @Override // com.bbva.cellscore.reactor.GlobalReaction
    public final void c(Reaction reaction, PubSubMessage pubSubMessage) {
        if (reaction.getPermissionsNeeded() == null) {
            b(reaction, pubSubMessage);
        } else {
            this.f27036y0.cleanChannel(reaction.getChannel().getName());
            this.G0.request(this.mActivity, reaction, pubSubMessage);
        }
    }

    public void create(LifecycleOwner lifecycleOwner) {
        this.mLifeCycleOwner = lifecycleOwner;
        super.create();
        this.mLifeCycleOwner.getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        log("onDestroy", new LogParam[0]);
        Iterator it = this.f27034w0.iterator();
        while (it.hasNext()) {
            this.f27036y0.removeChannel(((Channel) it.next()).getName());
        }
        ComponentManager.clearScreen(this.E0);
        this.mLifeCycleOwner.getLifecycle().removeObserver(this);
        this.mActivity = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        log("onPause", new LogParam[0]);
        this.G0.disable();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        log("onResume", new LogParam[0]);
        this.G0.enable();
    }

    @Override // com.bbva.cellscore.reactor.GlobalReaction
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        super.onStart();
        PermissionHandler permissionHandler = this.G0;
        this.f27035x0.addAll(permissionHandler.granted().subscribe(new e(this, 0)), permissionHandler.denied().subscribe(new f(this, 0)));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        log("onStop", new LogParam[0]);
        if (this.F0) {
            this.F0 = false;
            CompositeDisposable compositeDisposable = this.f27035x0;
            if (compositeDisposable != null) {
                compositeDisposable.clear();
            }
            this.G0.disable();
        }
    }

    public void setActivity(String str, Activity activity) {
        this.mActivity = activity;
        addComponent(str, activity);
    }

    public void onPermissionDenied(PermissionResult permissionResult) {
    }
}
