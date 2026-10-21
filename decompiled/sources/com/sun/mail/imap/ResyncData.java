package com.sun.mail.imap;

import com.sun.mail.imap.protocol.UIDSet;

/* JADX INFO: loaded from: classes9.dex */
public class ResyncData {
    public static final ResyncData CONDSTORE = new ResyncData(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f65393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIDSet[] f65394c;

    public ResyncData(long j10, long j11) {
        this.f65392a = j10;
        this.f65393b = j11;
        this.f65394c = null;
    }

    public long getModSeq() {
        return this.f65393b;
    }

    public long getUIDValidity() {
        return this.f65392a;
    }

    public ResyncData(long j10, long j11, long j12, long j13) {
        this.f65394c = null;
        this.f65392a = j10;
        this.f65393b = j11;
        this.f65394c = new UIDSet[]{new UIDSet(j12, j13)};
    }

    public ResyncData(long j10, long j11, long[] jArr) {
        this.f65394c = null;
        this.f65392a = j10;
        this.f65393b = j11;
        this.f65394c = UIDSet.createUIDSets(jArr);
    }
}
