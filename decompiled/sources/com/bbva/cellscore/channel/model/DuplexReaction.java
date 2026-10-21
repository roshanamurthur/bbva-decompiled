package com.bbva.cellscore.channel.model;

/* JADX INFO: loaded from: classes2.dex */
public class DuplexReaction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reaction f26965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reaction f26966b;

    public DuplexReaction(Reaction reaction, Reaction reaction2) {
        this.f26965a = reaction;
        this.f26966b = reaction2;
    }

    public Reaction getBackwardReaction() {
        return this.f26966b;
    }

    public Reaction getForwardReaction() {
        return this.f26965a;
    }
}
