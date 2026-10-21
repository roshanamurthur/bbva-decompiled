package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.heartbeatinfo.HeartBeatResult;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import gg.f;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import tf.d;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<f> f48397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f48398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<UserAgentPublisher> f48399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<HeartBeatConsumer> f48400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f48401e;

    @VisibleForTesting
    public DefaultHeartBeatController() {
        throw null;
    }

    public DefaultHeartBeatController(Context context, String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider, Executor executor) {
        this.f48397a = new d(context, str, 1);
        this.f48400d = set;
        this.f48401e = executor;
        this.f48399c = provider;
        this.f48398b = context;
    }

    @NonNull
    public static Component<DefaultHeartBeatController> component() {
        final Qualified qualified = Qualified.qualified(Background.class, Executor.class);
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.setOf((Class<?>) HeartBeatConsumer.class)).add(Dependency.requiredProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.required((Qualified<?>) qualified)).factory(new ComponentFactory() { // from class: gg.e
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), componentContainer.setOf(HeartBeatConsumer.class), componentContainer.getProvider(UserAgentPublisher.class), (Executor) componentContainer.get(qualified));
            }
        }).build();
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f fVar = this.f48397a.get();
        if (!fVar.i(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        fVar.g();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        if (!UserManagerCompat.isUserUnlocked(this.f48398b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f48401e, new Callable() { // from class: gg.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                DefaultHeartBeatController defaultHeartBeatController = this.f68608p0;
                synchronized (defaultHeartBeatController) {
                    try {
                        f fVar = defaultHeartBeatController.f48397a.get();
                        ArrayList arrayListC = fVar.c();
                        fVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                            HeartBeatResult heartBeatResult = (HeartBeatResult) arrayListC.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", heartBeatResult.getUserAgent());
                            jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return string;
            }
        });
    }

    public Task<Void> registerHeartBeat() {
        if (this.f48400d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!UserManagerCompat.isUserUnlocked(this.f48398b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f48401e, new Callable() { // from class: gg.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DefaultHeartBeatController defaultHeartBeatController = this.f68609p0;
                synchronized (defaultHeartBeatController) {
                    defaultHeartBeatController.f48397a.get().k(System.currentTimeMillis(), defaultHeartBeatController.f48399c.get().getUserAgent());
                }
                return null;
            }
        });
    }
}
