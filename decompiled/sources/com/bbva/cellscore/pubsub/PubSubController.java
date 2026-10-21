package com.bbva.cellscore.pubsub;

import ad.e;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.ChannelStore;
import com.bbva.cellscore.component.EmptyMessage;
import com.bbva.cellscore.component.ErrorMessage;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.cellscore.helper.RxHelper;
import com.bbva.cellscore.logger.CellsLogger;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.logger.LogModule;
import com.bbva.cellscore.logger.LogParam;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.base.webview.WebActions;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class PubSubController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27022a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f27023b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f27024c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<ChannelStore> f27025d;

    public static void a(String str, LogParam... logParamArr) {
        CellsLogger.INSTANCE.logMethod(LogModule.PubSub, str, logParamArr);
    }

    public final void b(ChannelStore channelStore, Channel<?> channel) {
        a("restoreChannel", CellsLoggerKt.paramOf("channelStored", channelStore), CellsLoggerKt.paramOf("channel", channel));
        Channel.RestoreExecutor<?> restoreValue = channel.getRestoreValue();
        if (restoreValue == null) {
            CellsLogger.INSTANCE.log(LogModule.PubSub, LoggerLevel.WARNING, "Channel[" + channel.getName() + "] restore adapter not found");
            return;
        }
        Bundle payload = channelStore.getPayload();
        Object objTryGetValue = BundleHelper.tryGetValue(payload);
        if (objTryGetValue == null) {
            objTryGetValue = restoreValue.onRestore(payload);
        }
        sendMessageToChannel(new PubSubMessage(channel.getName(), objTryGetValue), false);
    }

    public void cleanAllChannels(boolean z10) {
        a("cleanAllChannels", CellsLoggerKt.paramOf("syncWithWeb", Boolean.valueOf(z10)));
        Iterator it = this.f27022a.values().iterator();
        while (it.hasNext()) {
            cleanChannel(((Channel) it.next()).getName(), z10);
        }
        this.f27024c.clear();
    }

    public void cleanChannel(@NonNull String str) {
        a("cleanChannel", CellsLoggerKt.paramOf("channel", str));
        cleanChannel(str, true);
    }

    public void createChannelIfNeeded(Channel channel) {
        Object obj;
        a("createChannelIfNeeded", CellsLoggerKt.paramOf("channel", channel));
        String name = channel.getName();
        HashMap map = this.f27022a;
        if (map.containsKey(name)) {
            return;
        }
        map.put(name, channel);
        ChannelStore channelStore = (ChannelStore) this.f27023b.remove(name);
        if (channelStore != null) {
            b(channelStore, channel);
        }
        Bundle bundle = (Bundle) this.f27024c.remove(name);
        if (bundle != null) {
            a("recoverChannel", CellsLoggerKt.paramOf("channel", channel));
            Object objTransformContentToNativeObject = channel.transformContentToNativeObject(bundle);
            if (objTransformContentToNativeObject != null) {
                obj = bundle;
                obj = objTransformContentToNativeObject;
            }
            obj = bundle;
            sendMessageToChannel(new PubSubMessage(channel.getName(), obj), false);
        }
    }

    @Nullable
    public Channel<?> getChannel(@NonNull String str) {
        return (Channel) this.f27022a.get(str);
    }

    public Map<String, Channel<?>> getChannels() {
        return this.f27022a;
    }

    public void removeChannel(String str) {
        a("removeChannel", CellsLoggerKt.paramOf("channel", str));
        this.f27022a.remove(str);
    }

    public void restoreState(@NonNull Bundle bundle) {
        a("restoreState", new LogParam[0]);
        ArrayList<ChannelStore> parcelableArrayList = bundle.getParcelableArrayList("com.bbva.cells.PubSubController.CHANNELS");
        if (parcelableArrayList == null) {
            return;
        }
        for (ChannelStore channelStore : parcelableArrayList) {
            Channel<?> channel = (Channel) this.f27022a.get(channelStore.getName());
            if (channel != null) {
                b(channelStore, channel);
            } else {
                this.f27023b.put(channelStore.getName(), channelStore);
            }
        }
    }

    public void saveState(Bundle bundle) {
        a("saveState", new LogParam[0]);
        ArrayList<ChannelStore> arrayList = this.f27025d;
        if (arrayList != null) {
            bundle.putParcelableArrayList("com.bbva.cells.PubSubController.CHANNELS", arrayList);
            return;
        }
        this.f27025d = new ArrayList<>();
        Iterator it = this.f27022a.entrySet().iterator();
        while (it.hasNext()) {
            Channel channel = (Channel) ((Map.Entry) it.next()).getValue();
            if (channel.isSaveOnDestroy()) {
                PubSubMessage pubSubMessage = (PubSubMessage) RxHelper.getSubjectBuffer(channel.getSubject());
                if (!(pubSubMessage instanceof EmptyMessage) && !(pubSubMessage instanceof ErrorMessage) && pubSubMessage != null) {
                    Bundle bundle2 = new Bundle();
                    Channel.SaveExecutor saveValue = channel.getSaveValue();
                    Object payload = pubSubMessage.getPayload();
                    if (!BundleHelper.addToBundleIfPossible(bundle2, payload) && saveValue != null) {
                        saveValue.onSave(bundle2, payload);
                    }
                    this.f27025d.add(new ChannelStore(channel.getName(), bundle2));
                }
            }
        }
        bundle.putParcelableArrayList("com.bbva.cells.PubSubController.CHANNELS", this.f27025d);
    }

    public void sendMessageToChannel(PubSubMessage pubSubMessage, boolean z10) {
        a("sendMessageToChannel", CellsLoggerKt.paramOf("message", pubSubMessage), CellsLoggerKt.paramOf("syncWithWeb", Boolean.valueOf(z10)));
        Channel<?> channel = getChannel(pubSubMessage.getChannelName());
        if (channel == null) {
            CellsLogger.INSTANCE.log(LogModule.PubSub, LoggerLevel.WARNING, "Channel [" + pubSubMessage.getChannelName() + "] doesn't exist");
            return;
        }
        if (z10 && (channel instanceof WebChannel)) {
            ((WebController) ComponentManager.get(WebActions.ID)).sendMessageToWeb(channel, pubSubMessage);
        }
        channel.getSubject().onNext(pubSubMessage);
        if ((channel.getRestoreValue() == null || (pubSubMessage instanceof EmptyMessage)) && (pubSubMessage instanceof ErrorMessage)) {
            return;
        }
        this.f27025d = null;
    }

    public void sendRawMessageToChannel(String str, Bundle bundle) {
        Object obj;
        a("createChannelIfNeeded", CellsLoggerKt.paramOf("channel", str), CellsLoggerKt.paramOf("value", bundle));
        Channel<?> channel = getChannel(str);
        if (channel == null) {
            this.f27024c.put(str, bundle);
            return;
        }
        Object objTransformContentToNativeObject = channel.transformContentToNativeObject(bundle);
        if (objTransformContentToNativeObject != null) {
            obj = bundle;
            obj = objTransformContentToNativeObject;
        }
        obj = bundle;
        sendMessageToChannel(new PubSubMessage(str, obj), false);
    }

    public Disposable subscribe(@NonNull String str, long j10, Observable<Boolean> observable, @NonNull Consumer<PubSubMessage> consumer) {
        a("subscribe", CellsLoggerKt.paramOf("channel", str), CellsLoggerKt.paramOf("delay", Long.valueOf(j10)));
        Channel<?> channel = getChannel(str);
        if (channel != null) {
            Observable<PubSubMessage> observableFilter = channel.getSubject().filter(new e());
            if (j10 > 0) {
                observableFilter = observableFilter.delay(j10, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
            }
            return observableFilter.delaySubscription(observable).subscribe(consumer);
        }
        Log.w("PubSubController", "Channel [" + str + "] doesn't exist");
        return EmptyDisposable.INSTANCE;
    }

    public void cleanChannel(@NonNull String str, boolean z10) {
        a("sendMessageToChannel", CellsLoggerKt.paramOf("channel", str), CellsLoggerKt.paramOf("syncWithWeb", Boolean.valueOf(z10)));
        sendMessageToChannel(new EmptyMessage(str), z10);
    }
}
