package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import tf.f;
import uf.k;
import uf.l;
import uf.m;
import uf.n;
import uf.o;
import uf.p;
import uf.q;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy<ScheduledExecutorService> f47682a = new Lazy<>(new o());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy<ScheduledExecutorService> f47683b = new Lazy<>(new p());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy<ScheduledExecutorService> f47684c = new Lazy<>(new q());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy<ScheduledExecutorService> f47685d = new Lazy<>(new f(1));

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new k()).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new l()).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new m()).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new n()).build());
    }
}
