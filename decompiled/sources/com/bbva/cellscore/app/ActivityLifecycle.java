package com.bbva.cellscore.app;

import android.os.Bundle;
import android.view.View;
import androidx.camera.camera2.internal.h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.cellscore.logger.CellsLogger;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.logger.LogModule;
import com.bbva.cellscore.logger.LogParam;
import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.reactor.JsonPageReaction;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.reactor.PageReactionManager;
import com.bbva.cellscore.reactor.ReactionContainer;
import com.bbva.cellscore.trace.TrackerController;
import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.bbva.cellscore.web.reader.RouteReader;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Iterator;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityLifecycle extends FragmentManager.FragmentLifecycleCallbacks implements ReactorPublisher {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PageReactionManager f26872p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ReactionContainer<PageReaction> f26873q0 = new ReactionContainer<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PubSubController f26874r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RouteReader f26875s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f26876t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final TrackerController f26877u0;
    public final Dispatcher v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final FeatureFlagManager f26878w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f26879x0;

    public ActivityLifecycle(PageReactionManager pageReactionManager, PubSubController pubSubController, RouteReader routeReader, Dispatcher dispatcher, TrackerController trackerController, FeatureFlagManager featureFlagManager, String str) {
        this.f26872p0 = pageReactionManager;
        this.f26874r0 = pubSubController;
        this.f26875s0 = routeReader;
        this.f26876t0 = str;
        this.v0 = dispatcher;
        this.f26877u0 = trackerController;
        this.f26878w0 = featureFlagManager;
        Reactor.addPublisher(this);
    }

    public static void a(String str, LogParam... logParamArr) {
        CellsLogger.INSTANCE.logMethod(LogModule.ActivityLifeCycle, str, logParamArr);
    }

    @Override // com.bbva.cellscore.app.ReactorPublisher
    public void clean(String str, String str2) {
        a("clean", CellsLoggerKt.paramOf("componentId", str), CellsLoggerKt.paramOf("action", str2));
        Iterator<PageReaction> it = this.f26873q0.values().iterator();
        while (it.hasNext()) {
            it.next().cleanAction(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        PageReaction jsonPageReaction = null;
        if (fragment == CellsViewModelProviders.f26903a) {
            CellsViewModelProviders.f26903a = null;
        }
        String tag = fragment.getTag();
        a("onFragmentActivityCreated", CellsLoggerKt.paramOf("fragment", fragment), CellsLoggerKt.paramOf(LogKeysKt.TAG, tag));
        if (tag != null) {
            FragmentActivity activity = fragment.getActivity();
            PageReaction pageReaction = this.f26872p0.get(tag);
            RouteReader routeReader = this.f26875s0;
            if (pageReaction == null) {
                CellsPage route = routeReader.readRoute(tag);
                if (route == CellsPage.EMPTY) {
                    CellsLogger.INSTANCE.log(LogModule.AppLifecycle, LoggerLevel.ERROR, h0.b("Not page reaction for tag: [", tag, Constant.BRACKET_CLOSE));
                } else {
                    jsonPageReaction = new JsonPageReaction(route, this.v0);
                }
                if (jsonPageReaction != null) {
                    this.f26873q0.put(tag, fragment, jsonPageReaction);
                }
            }
            jsonPageReaction = pageReaction;
            jsonPageReaction.init(this.f26874r0, routeReader, this.f26877u0, this.f26878w0);
            jsonPageReaction.setPageId(fragment.hashCode());
            jsonPageReaction.setTag(tag);
            jsonPageReaction.setActivity(this.f26876t0, activity);
            jsonPageReaction.addComponent(tag, fragment);
            jsonPageReaction.create(fragment);
            if (jsonPageReaction != null) {
                this.f26873q0.put(tag, fragment, jsonPageReaction);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        a("onFragmentCreated", CellsLoggerKt.paramOf("fragment", fragment), CellsLoggerKt.paramOf("detached", Boolean.valueOf(fragment.isDetached())), CellsLoggerKt.paramOf("savedInstanceState", bundle));
        if (fragment.isDetached() || bundle != null) {
            return;
        }
        CellsViewModelProviders.f26903a = fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        a("onFragmentDestroyed", CellsLoggerKt.paramOf("fragment", fragment));
        String tag = fragment.getTag();
        if (tag != null) {
            ReactionContainer<PageReaction> reactionContainer = this.f26873q0;
            if (reactionContainer.containsPage(tag, fragment)) {
                reactionContainer.remove(tag, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        a("onFragmentPreCreated", CellsLoggerKt.paramOf("fragment", fragment));
        super.onFragmentPreCreated(fragmentManager, fragment, bundle);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        a("onFragmentViewCreated", CellsLoggerKt.paramOf("fragment", fragment));
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        if (fragment == CellsViewModelProviders.f26903a) {
            CellsViewModelProviders.f26903a = null;
        }
    }

    @Override // com.bbva.cellscore.app.ReactorPublisher
    public void publish(String str, String str2, Object obj) {
        a("publish", CellsLoggerKt.paramOf("componentId", str), CellsLoggerKt.paramOf("action", str2), CellsLoggerKt.paramOf("param", obj));
        for (PageReaction pageReaction : this.f26873q0.values()) {
            if (!this.f26879x0) {
                pageReaction.publishAction(str, str2, obj);
            } else if (pageReaction.isStarted()) {
                pageReaction.publishAction(str, str2, obj);
            }
        }
    }

    public void setDeactivatePageOnStop(boolean z10) {
        a("setDeactivatePageOnStop", CellsLoggerKt.paramOf("deactivatePageOnStop", Boolean.valueOf(z10)));
        this.f26879x0 = z10;
    }
}
