package com.sun.mail.imap;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.event.MessageCountEvent;

/* JADX INFO: loaded from: classes9.dex */
public class MessageVanishedEvent extends MessageCountEvent {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Message[] f65386q0 = new Message[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long[] f65387p0;

    public MessageVanishedEvent(Folder folder, long[] jArr) {
        super(folder, 2, true, f65386q0);
        this.f65387p0 = jArr;
    }

    public long[] getUIDs() {
        return this.f65387p0;
    }
}
