package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorListener;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorType;
import java.util.Collection;
import java.util.EnumSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class InAppMessageComponent implements com.salesforce.marketingcloud.e, InAppMessageManager, i, com.salesforce.marketingcloud.k.e, com.salesforce.marketingcloud.events.f, com.salesforce.marketingcloud.behaviors.b, BehaviorListener {
    static final String EXTRA_MESSAGE_HANDLER = "messageHandler";
    private final com.salesforce.marketingcloud.alarms.b alarmScheduler;
    private final com.salesforce.marketingcloud.analytics.f analyticsListener;
    private final com.salesforce.marketingcloud.behaviors.c behaviorManager;
    private com.salesforce.marketingcloud.config.a configComponent;
    private final Context context;
    private com.salesforce.marketingcloud.internal.l executors;
    private o imageHandler;
    private final Handler messageDelayHandler;
    m realInAppMessageComponent;
    private final com.salesforce.marketingcloud.storage.j storage;
    private final com.salesforce.marketingcloud.k syncRouteComponent;
    private SFMCSdkComponents uSdkComponents;
    private final UrlHandler urlHandler;

    public InAppMessageComponent(Context context, com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.k kVar, com.salesforce.marketingcloud.behaviors.c cVar, o oVar, UrlHandler urlHandler, com.salesforce.marketingcloud.internal.l lVar, com.salesforce.marketingcloud.analytics.f fVar, @NonNull com.salesforce.marketingcloud.config.a aVar) {
        this(context, jVar, bVar, kVar, cVar, oVar, urlHandler, lVar, fVar, null, aVar);
    }

    private void subscribeForBehaviours() {
        SFMCSdkComponents sFMCSdkComponents = this.uSdkComponents;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getBehaviorManager().registerForBehaviors(EnumSet.of(BehaviorType.APPLICATION_FOREGROUNDED, BehaviorType.APPLICATION_BACKGROUNDED), this);
        } else {
            this.behaviorManager.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED));
        }
    }

    private void unSubscribeForBehaviours() {
        SFMCSdkComponents sFMCSdkComponents = this.uSdkComponents;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getBehaviorManager().unregisterForAllBehaviors(this);
        }
        com.salesforce.marketingcloud.behaviors.c cVar = this.behaviorManager;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public boolean canDisplay(@NonNull InAppMessage inAppMessage) {
        m mVar = this.realInAppMessageComponent;
        return mVar != null && mVar.canDisplay(inAppMessage);
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "InAppMessageManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            return mVar.a();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
        if (!com.salesforce.marketingcloud.b.a(i10, 4096)) {
            if (this.realInAppMessageComponent == null) {
                this.realInAppMessageComponent = new m(this.context, this.storage, this.alarmScheduler, this.imageHandler, this.urlHandler, this.executors, this.analyticsListener, this.messageDelayHandler, this.configComponent);
            }
            subscribeForBehaviours();
            this.syncRouteComponent.a(com.salesforce.marketingcloud.k.d.inAppMessages, this);
            return;
        }
        this.syncRouteComponent.a(com.salesforce.marketingcloud.k.d.inAppMessages, (com.salesforce.marketingcloud.k.e) null);
        unSubscribeForBehaviours();
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.b(com.salesforce.marketingcloud.b.c(i10, 4096));
            this.realInAppMessageComponent = null;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public int getStatusBarColor() {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            return mVar.getStatusBarColor();
        }
        return 0;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    @Nullable
    public Typeface getTypeface() {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            return mVar.getTypeface();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public void handleMessageFinished(@NonNull InAppMessage inAppMessage, @NonNull j jVar) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.handleMessageFinished(inAppMessage, jVar);
        }
    }

    @Override // com.salesforce.marketingcloud.events.f
    public void handleOutcomes(@NonNull Collection<String> collection) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.handleOutcomes(collection);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public o imageHandler() {
        m mVar = this.realInAppMessageComponent;
        return mVar != null ? mVar.imageHandler() : this.imageHandler;
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i10) {
        if (com.salesforce.marketingcloud.b.b(i10, 4096)) {
            this.syncRouteComponent.a(com.salesforce.marketingcloud.k.d.inAppMessages, this);
            this.realInAppMessageComponent = new m(this.context, this.storage, this.alarmScheduler, this.imageHandler, this.urlHandler, this.executors, this.analyticsListener, this.messageDelayHandler, this.configComponent);
            subscribeForBehaviours();
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            if (aVar == com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED) {
                mVar.b();
            } else if (aVar == com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED) {
                mVar.c();
            }
        }
    }

    @Override // com.salesforce.marketingcloud.k.e
    @WorkerThread
    public void onSyncReceived(@NonNull com.salesforce.marketingcloud.k.d dVar, @NonNull JSONObject jSONObject) {
        m mVar = this.realInAppMessageComponent;
        if (mVar == null || dVar != com.salesforce.marketingcloud.k.d.inAppMessages) {
            return;
        }
        mVar.a(jSONObject);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setInAppMessageListener(@Nullable InAppMessageManager.EventListener eventListener) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.setInAppMessageListener(eventListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setStatusBarColor(int i10) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.setStatusBarColor(i10);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setTypeface(@Nullable Typeface typeface) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.setTypeface(typeface);
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void showMessage(InAppMessage inAppMessage) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.d(inAppMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.b(false);
            this.realInAppMessageComponent = null;
        }
        com.salesforce.marketingcloud.k kVar = this.syncRouteComponent;
        if (kVar != null) {
            kVar.a(com.salesforce.marketingcloud.k.d.inAppMessages, (com.salesforce.marketingcloud.k.e) null);
        }
        unSubscribeForBehaviours();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public UrlHandler urlHandler() {
        m mVar = this.realInAppMessageComponent;
        return mVar != null ? mVar.urlHandler() : this.urlHandler;
    }

    public InAppMessageComponent(Context context, com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.k kVar, com.salesforce.marketingcloud.behaviors.c cVar, o oVar, UrlHandler urlHandler, com.salesforce.marketingcloud.internal.l lVar, com.salesforce.marketingcloud.analytics.f fVar, SFMCSdkComponents sFMCSdkComponents, @NonNull com.salesforce.marketingcloud.config.a aVar) {
        this.messageDelayHandler = new Handler(Looper.getMainLooper());
        this.context = context;
        this.storage = jVar;
        this.alarmScheduler = bVar;
        this.syncRouteComponent = kVar;
        this.behaviorManager = cVar;
        this.imageHandler = oVar;
        this.urlHandler = urlHandler;
        this.analyticsListener = fVar;
        this.executors = lVar;
        this.uSdkComponents = sFMCSdkComponents;
        this.configComponent = aVar;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorListener
    public void onBehavior(@NonNull Behavior behavior) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            if (behavior instanceof Behavior.AppForegrounded) {
                mVar.b();
            } else if (behavior instanceof Behavior.AppBackgrounded) {
                mVar.c();
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void showMessage(@NonNull String str) {
        m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.showMessage(str);
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public InAppMessageComponent(m mVar) {
        this(null, null, null, null, null, null, null, null, null, null);
        this.realInAppMessageComponent = mVar;
    }
}
