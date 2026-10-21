package com.bbva.cellscore.permission;

import com.bbva.androidtoolkit.plugin.permission.Permission;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.pubsub.PubSubMessage;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PermissionResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Permission> f27017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Permission> f27018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Reaction f27020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PubSubMessage f27021e;

    public PermissionResult(List<Permission> list, List<Permission> list2) {
        this.f27017a = list;
        this.f27018b = list2;
    }

    public boolean areAllGranted() {
        return this.f27018b.isEmpty();
    }

    public List<Permission> getPermissionDenied() {
        return this.f27018b;
    }

    public List<Permission> getPermissionGranted() {
        return this.f27017a;
    }

    public PubSubMessage getPubSubMessage() {
        return this.f27021e;
    }

    public Reaction getReaction() {
        return this.f27020d;
    }

    public boolean hasPermanentlyDeniedAnyPermission() {
        return this.f27019c;
    }

    public void setPubSubMessage(PubSubMessage pubSubMessage) {
        this.f27021e = pubSubMessage;
    }

    public void setReaction(Reaction reaction) {
        this.f27020d = reaction;
    }
}
