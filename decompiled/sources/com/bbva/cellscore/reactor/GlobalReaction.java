package com.bbva.cellscore.reactor;

import android.app.Activity;
import androidx.annotation.IdRes;
import androidx.lifecycle.LifecycleObserver;
import com.bbva.androidtoolkit.utils.ResourceUtils;
import com.bbva.cells.component.kit.common.Component;
import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.builder.refactor.impl.DuplexReactorCore;
import com.bbva.cellscore.channel.builder.refactor.impl.ReactorCore;
import com.bbva.cellscore.channel.builder.refactor.impl.WriteOn;
import com.bbva.cellscore.channel.container.ActionReactionContainer;
import com.bbva.cellscore.channel.model.Action;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.channel.model.channel.PrivateChannel;
import com.bbva.cellscore.extension.ComponentKt;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.cellscore.featureflag.FeatureFlagManagerKt;
import com.bbva.cellscore.logger.CellsLogger;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.logger.LogModule;
import com.bbva.cellscore.logger.LogParam;
import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.pubsub.PubSubMessage;
import com.bbva.cellscore.trace.TrackerController;
import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.data.component.ComponentDefinition;
import com.bbva.cellscore.web.reader.RouteReader;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GlobalReaction implements ActionReactionContainer, LifecycleObserver {
    public int E0;
    public boolean F0;
    protected Activity mActivity;
    protected String mTag;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public RouteReader f27031s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TrackerController f27032t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public FeatureFlagManager f27033u0;
    public CellsPage v0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CompositeDisposable f27035x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public PubSubController f27036y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f27028p0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final HashMap f27030r0 = new HashMap();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f27029q0 = new ArrayList();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ArrayList f27034w0 = new ArrayList();

    public final PrivateChannel a(String str) {
        StringBuilder sbE = androidx.camera.core.processing.f.e(str, "-channel_");
        sbE.append(UUID.randomUUID());
        PrivateChannel privateChannel = new PrivateChannel(sbE.toString());
        this.f27034w0.add(privateChannel);
        log("createPrivateChannel", CellsLoggerKt.paramOf("channel", privateChannel));
        return privateChannel;
    }

    @Override // com.bbva.cellscore.channel.container.ActionReactionContainer
    public void addAction(Action action) {
        log("addAction", CellsLoggerKt.paramOf("action", action.getAlias()));
        this.f27028p0.add(action);
    }

    public void addComponent(String str, Object obj) {
        log("addComponent", CellsLoggerKt.paramOf("componentId", str));
        ComponentManager.addComponentToPage(this.E0, str, obj);
    }

    @Override // com.bbva.cellscore.channel.container.ActionReactionContainer
    public void addReaction(Reaction reaction) {
        log("addReaction", CellsLoggerKt.paramOf("reaction", reaction.toString()));
        this.f27029q0.add(reaction);
    }

    public final void b(Reaction reaction, PubSubMessage pubSubMessage) {
        log("executeReaction", CellsLoggerKt.paramOf("reaction", reaction), CellsLoggerKt.paramOf("pubSubMessage", pubSubMessage));
        Object payload = pubSubMessage.getPayload();
        if (reaction.filter(payload)) {
            FlagState flagState = this.f27033u0.getFlags().get(reaction.testFeatureFlag());
            if (flagState == null || flagState == FlagState.Enable) {
                Object obj = ComponentManager.get(this.E0, reaction.getComponentId());
                if (obj == null) {
                    obj = ComponentManager.get(reaction.getComponentId());
                }
                reaction.trace(this.f27032t0, payload);
                if (reaction.isNavigation()) {
                    reaction.getNavigation().execute(this.mActivity, obj, payload);
                } else {
                    reaction.getExecution().execute(obj, payload);
                }
                if (reaction.cleanChannel()) {
                    this.f27036y0.cleanChannel(pubSubMessage.getChannelName());
                }
            }
        }
    }

    public void c(Reaction reaction, PubSubMessage pubSubMessage) {
        b(reaction, pubSubMessage);
    }

    public void cleanAction(String str, String str2) {
        List list = (List) this.f27030r0.get(str + str2);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f27036y0.cleanChannel(((Channel) it.next()).getName());
            }
        }
    }

    public abstract void configure();

    public void create() {
        log("create", new LogParam[0]);
        configure();
        for (Action action : this.f27028p0) {
            this.f27036y0.createChannelIfNeeded(action.getChannel());
            String str = action.getComponentId() + action.getActionSpec().getId();
            HashMap map = this.f27030r0;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            List list = (List) map.get(str);
            if (list instanceof PrivateChannel) {
                list.add(action.getChannel());
            } else {
                list.add(0, action.getChannel());
            }
        }
    }

    public final void d(boolean z10) {
        log("updateComponentsProperties", CellsLoggerKt.paramOf("page", this.v0));
        for (ComponentDefinition componentDefinition : this.v0.getComponents()) {
            String strTag = componentDefinition.tag();
            if (componentDefinition.type() == ComponentDefinition.ComponentType.UI) {
                strTag = String.valueOf(ResourceUtils.getId(this.mActivity, componentDefinition.tag()));
            }
            Component component = (Component) ComponentManager.get(strTag);
            if (component != null) {
                if (!z10) {
                    component.setProperties(componentDefinition.properties());
                }
                ComponentKt.applyFeatureFlag(component, this.f27033u0, componentDefinition);
            }
            Component component2 = (Component) ComponentManager.get(this.E0, strTag);
            if (component2 != null) {
                if (!z10) {
                    component2.setProperties(componentDefinition.properties());
                }
                ComponentKt.applyFeatureFlag(component2, this.f27033u0, componentDefinition);
            }
        }
    }

    public void init(PubSubController pubSubController, RouteReader routeReader, TrackerController trackerController, FeatureFlagManager featureFlagManager) {
        this.f27036y0 = pubSubController;
        this.f27031s0 = routeReader;
        this.f27032t0 = trackerController;
        this.f27033u0 = featureFlagManager;
    }

    public boolean isStarted() {
        return this.F0;
    }

    public void log(String str, LogParam... logParamArr) {
        LogParam[] logParamArr2 = new LogParam[3];
        logParamArr2[0] = CellsLoggerKt.paramOf("page", this.mTag);
        logParamArr2[1] = CellsLoggerKt.paramOf(Name.LABEL, getClass().getSimpleName());
        Activity activity = this.mActivity;
        logParamArr2[2] = CellsLoggerKt.paramOf("activityOwner", activity == null ? null : activity.getLocalClassName());
        CellsLogger.INSTANCE.logMethod(LogModule.Reactor, str, (LogParam[]) ArraysKt___ArraysJvmKt.plus((Object[]) logParamArr2, (Object[]) logParamArr));
    }

    public void onStart() {
        int i10 = 0;
        log("onStart", new LogParam[0]);
        if (this.F0) {
            return;
        }
        this.v0 = this.f27031s0.readRoute(this.mTag);
        d(false);
        FeatureFlagManagerKt.applyFeatureFlags(this.f27033u0);
        this.F0 = true;
        this.f27035x0 = new CompositeDisposable();
        PublishSubject publishSubjectCreate = PublishSubject.create();
        for (final Reaction reaction : this.f27029q0) {
            this.f27035x0.add(this.f27036y0.subscribe(reaction.getChannel().getName(), reaction.getDelay(), publishSubjectCreate, new Consumer() { // from class: com.bbva.cellscore.reactor.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    this.f27043p0.c(reaction, (PubSubMessage) obj);
                }
            }));
        }
        publishSubjectCreate.onNext(Boolean.TRUE);
        this.f27035x0.add(this.f27033u0.onFlags().forEach(new a(this, i10)));
    }

    public void publishAction(String str, String str2, Object obj) {
        List<Channel> list = (List) this.f27030r0.get(Action.createId(str, str2));
        if (list != null) {
            for (Channel channel : list) {
                if (this.F0 || (channel instanceof PrivateChannel)) {
                    FlagState flagState = this.f27033u0.getFlags().get(channel.getFeatureFlagFilter());
                    if (flagState == null || flagState == FlagState.Enable) {
                        this.f27036y0.sendMessageToChannel(new PubSubMessage(channel.getName(), obj), true);
                    }
                }
            }
        }
    }

    public <T> ReactorCoreBuilder.PlainThenActionBuilder<T> reactTo(Channel<T> channel) {
        this.f27036y0.createChannelIfNeeded(channel);
        return new ReactorCore(channel, this);
    }

    public void reset() {
        log("reset", new LogParam[0]);
        if (this.F0) {
            this.v0 = this.f27031s0.readRoute(this.mTag);
            d(false);
            FeatureFlagManagerKt.applyFeatureFlags(this.f27033u0);
        }
    }

    public void setActivity(Activity activity) {
        this.mActivity = activity;
    }

    public void setPageId(int i10) {
        this.E0 = i10;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public ReactorCoreBuilder.PlainActionBuilder when(@IdRes int i10) {
        return when(String.valueOf(i10));
    }

    public ReactorCoreBuilder.PlainActionBuilder whenever(@IdRes int i10) {
        return when(i10);
    }

    public <T> WriteOnBuilder<T> writeOn(Channel<T> channel) {
        this.f27036y0.createChannelIfNeeded(channel);
        return new WriteOn(channel, this);
    }

    public ReactorCoreBuilder.PlainActionBuilder when(String str) {
        return new ReactorCore(a(str), this).when(str);
    }

    public ReactorCoreBuilder.PlainActionBuilder whenever(String str) {
        return when(str);
    }

    public void addComponent(Component component) {
        log("addComponent", CellsLoggerKt.paramOf("componentId", component.getK0()));
        ComponentManager.addComponentToPage(this.E0, component);
    }

    public DuplexReactorCoreBuilder.PlainDuplexActionBuilder when(@IdRes int i10, String str) {
        return when(String.valueOf(i10), str);
    }

    public DuplexReactorCoreBuilder.PlainDuplexActionBuilder when(String str, String str2) {
        return new DuplexReactorCore(a(str), a(str2), this).when(str, str2);
    }
}
