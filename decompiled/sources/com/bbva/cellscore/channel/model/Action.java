package com.bbva.cellscore.channel.model;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.cells.component.kit.model.ActionSpec;

/* JADX INFO: loaded from: classes2.dex */
public class Action<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionSpec<T> f26950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Channel<T> f26951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26952e;

    public Action(String str, ActionSpec<T> actionSpec, Channel<T> channel) {
        this.f26949b = str;
        this.f26950c = actionSpec;
        this.f26951d = channel;
        this.f26948a = createId(str, actionSpec.getId());
    }

    public static String createId(String str, String str2) {
        return u.f(str, str2);
    }

    public Action<T> duplicateWithChannel(Channel<T> channel) {
        return new Action<>(this.f26949b, this.f26950c, channel, this.f26952e);
    }

    public boolean equalsTo(String str) {
        return this.f26948a.equals(str);
    }

    public ActionSpec<T> getActionSpec() {
        return this.f26950c;
    }

    public String getAlias() {
        String str = this.f26952e;
        return str == null ? this.f26950c.getId() : str;
    }

    public Channel<T> getChannel() {
        return this.f26951d;
    }

    public String getComponentId() {
        return this.f26949b;
    }

    public String getId() {
        return this.f26948a;
    }

    public void setAlias(String str) {
        this.f26952e = str;
    }

    public Action(String str, ActionSpec<T> actionSpec, Channel<T> channel, String str2) {
        this(str, actionSpec, channel);
        this.f26952e = str2;
    }
}
