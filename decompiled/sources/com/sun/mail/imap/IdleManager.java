package com.sun.mail.imap;

import com.sun.mail.util.MailLogger;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Session;

/* JADX INFO: loaded from: classes9.dex */
public class IdleManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f65372a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MailLogger f65374c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f65376e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f65375d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f65377f = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f65378g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Selector f65373b = Selector.open();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IdleManager.this.f65374c.fine("IdleManager select starting");
            try {
                IdleManager.this.f65376e = true;
                IdleManager.a(IdleManager.this);
            } finally {
                IdleManager.this.f65376e = false;
                IdleManager.this.f65374c.fine("IdleManager select terminating");
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ IMAPFolder f65380p0;

        public b(IMAPFolder iMAPFolder) {
            this.f65380p0 = iMAPFolder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f65380p0.o();
        }
    }

    public IdleManager(Session session, Executor executor) throws IOException {
        this.f65372a = executor;
        this.f65374c = new MailLogger(getClass(), "DEBUG IMAP", session.getDebug(), session.getDebugOut());
        executor.execute(new a());
    }

    public static void a(IdleManager idleManager) {
        idleManager.f65375d = false;
        while (!idleManager.f65375d) {
            try {
                try {
                    try {
                        idleManager.e();
                        idleManager.f65374c.finest("IdleManager waiting...");
                        int iSelect = idleManager.f65373b.select();
                        MailLogger mailLogger = idleManager.f65374c;
                        Level level = Level.FINEST;
                        if (mailLogger.isLoggable(level)) {
                            idleManager.f65374c.log(level, "IdleManager selected {0} channels", Integer.valueOf(iSelect));
                        }
                        if (idleManager.f65375d || Thread.currentThread().isInterrupted()) {
                            break;
                            break;
                        } else {
                            while (true) {
                                idleManager.c();
                                if (idleManager.f65373b.selectNow() > 0 || !idleManager.f65378g.isEmpty()) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        idleManager.f65375d = true;
                        idleManager.f65374c.finest("IdleManager unwatchAll");
                        try {
                            idleManager.d();
                            idleManager.f65373b.close();
                        } catch (IOException e5) {
                            idleManager.f65374c.log(Level.FINEST, "IdleManager unwatch exception", (Throwable) e5);
                        }
                        idleManager.f65374c.fine("IdleManager exiting");
                        throw th2;
                    }
                } catch (InterruptedIOException e7) {
                    idleManager.f65374c.log(Level.FINEST, "IdleManager interrupted", (Throwable) e7);
                    idleManager.f65375d = true;
                    idleManager.f65374c.finest("IdleManager unwatchAll");
                    try {
                        idleManager.d();
                        idleManager.f65373b.close();
                    } catch (IOException e10) {
                        e = e10;
                        idleManager.f65374c.log(Level.FINEST, "IdleManager unwatch exception", (Throwable) e);
                    }
                }
            } catch (IOException e11) {
                idleManager.f65374c.log(Level.FINEST, "IdleManager got I/O exception", (Throwable) e11);
                idleManager.f65375d = true;
                idleManager.f65374c.finest("IdleManager unwatchAll");
                try {
                    idleManager.d();
                    idleManager.f65373b.close();
                } catch (IOException e12) {
                    e = e12;
                    idleManager.f65374c.log(Level.FINEST, "IdleManager unwatch exception", (Throwable) e);
                }
            } catch (Exception e13) {
                idleManager.f65374c.log(Level.FINEST, "IdleManager got exception", (Throwable) e13);
                idleManager.f65375d = true;
                idleManager.f65374c.finest("IdleManager unwatchAll");
                try {
                    idleManager.d();
                    idleManager.f65373b.close();
                } catch (IOException e14) {
                    e = e14;
                    idleManager.f65374c.log(Level.FINEST, "IdleManager unwatch exception", (Throwable) e);
                }
            }
        }
        idleManager.f65375d = true;
        idleManager.f65374c.finest("IdleManager unwatchAll");
        try {
            idleManager.d();
            idleManager.f65373b.close();
        } catch (IOException e15) {
            e = e15;
            idleManager.f65374c.log(Level.FINEST, "IdleManager unwatch exception", (Throwable) e);
        }
        idleManager.f65374c.fine("IdleManager exiting");
    }

    public static String b(Folder folder) {
        try {
            return folder.getURLName().toString();
        } catch (MessagingException unused) {
            return folder.getStore().toString() + "/" + folder.toString();
        }
    }

    public final void c() throws IOException {
        Iterator<SelectionKey> it = this.f65373b.selectedKeys().iterator();
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            next.cancel();
            IMAPFolder iMAPFolder = (IMAPFolder) next.attachment();
            MailLogger mailLogger = this.f65374c;
            Level level = Level.FINEST;
            if (mailLogger.isLoggable(level)) {
                this.f65374c.log(level, "IdleManager selected folder: {0}", b(iMAPFolder));
            }
            next.channel().configureBlocking(true);
            try {
                if (iMAPFolder.m(false)) {
                    if (this.f65374c.isLoggable(level)) {
                        this.f65374c.log(level, "IdleManager continue watching folder {0}", b(iMAPFolder));
                    }
                    this.f65377f.add(iMAPFolder);
                } else if (this.f65374c.isLoggable(level)) {
                    this.f65374c.log(level, "IdleManager done watching folder {0}", b(iMAPFolder));
                }
            } catch (MessagingException e5) {
                this.f65374c.log(Level.FINEST, "IdleManager got exception for folder: " + b(iMAPFolder), (Throwable) e5);
            }
        }
        while (true) {
            IMAPFolder iMAPFolder2 = (IMAPFolder) this.f65378g.poll();
            if (iMAPFolder2 == null) {
                return;
            }
            MailLogger mailLogger2 = this.f65374c;
            Level level2 = Level.FINEST;
            if (mailLogger2.isLoggable(level2)) {
                this.f65374c.log(level2, "IdleManager aborting IDLE for folder: {0}", b(iMAPFolder2));
            }
            SocketChannel channel = iMAPFolder2.protocol != null ? iMAPFolder2.protocol.getChannel() : null;
            if (channel != null) {
                SelectionKey selectionKeyKeyFor = channel.keyFor(this.f65373b);
                if (selectionKeyKeyFor != null) {
                    selectionKeyKeyFor.cancel();
                }
                channel.configureBlocking(true);
                Socket socket = channel.socket();
                if (socket == null || socket.getSoTimeout() <= 0) {
                    synchronized (iMAPFolder2.messageCacheLock) {
                        try {
                            if (iMAPFolder2.f65276w0 == 1 && iMAPFolder2.protocol != null) {
                                iMAPFolder2.protocol.idleAbort();
                                iMAPFolder2.f65276w0 = 2;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.f65377f.add(iMAPFolder2);
                } else {
                    this.f65374c.finest("IdleManager requesting DONE with timeout");
                    this.f65377f.remove(iMAPFolder2);
                    this.f65372a.execute(new b(iMAPFolder2));
                }
            }
        }
    }

    public final void d() {
        MailLogger mailLogger;
        Iterator<SelectionKey> it = this.f65373b.keys().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mailLogger = this.f65374c;
            if (!zHasNext) {
                break;
            }
            SelectionKey next = it.next();
            next.cancel();
            IMAPFolder iMAPFolder = (IMAPFolder) next.attachment();
            Level level = Level.FINEST;
            if (mailLogger.isLoggable(level)) {
                mailLogger.log(level, "IdleManager no longer watching folder: {0}", b(iMAPFolder));
            }
            try {
                next.channel().configureBlocking(true);
                iMAPFolder.o();
            } catch (IOException e5) {
                mailLogger.log(Level.FINEST, "IdleManager exception while aborting idle for folder: " + b(iMAPFolder), (Throwable) e5);
            }
        }
        while (true) {
            IMAPFolder iMAPFolder2 = (IMAPFolder) this.f65377f.poll();
            if (iMAPFolder2 == null) {
                return;
            }
            Level level2 = Level.FINEST;
            if (mailLogger.isLoggable(level2)) {
                mailLogger.log(level2, "IdleManager aborting IDLE for unwatched folder: {0}", b(iMAPFolder2));
            }
            SocketChannel channel = iMAPFolder2.protocol != null ? iMAPFolder2.protocol.getChannel() : null;
            if (channel != null) {
                try {
                    channel.configureBlocking(true);
                    iMAPFolder2.o();
                } catch (IOException e7) {
                    mailLogger.log(Level.FINEST, "IdleManager exception while aborting idle for folder: " + b(iMAPFolder2), (Throwable) e7);
                }
            }
        }
    }

    public final void e() {
        while (true) {
            IMAPFolder iMAPFolder = (IMAPFolder) this.f65377f.poll();
            if (iMAPFolder == null) {
                return;
            }
            Level level = Level.FINEST;
            MailLogger mailLogger = this.f65374c;
            if (mailLogger.isLoggable(level)) {
                mailLogger.log(level, "IdleManager adding {0} to selector", b(iMAPFolder));
            }
            try {
                SocketChannel channel = iMAPFolder.protocol != null ? iMAPFolder.protocol.getChannel() : null;
                if (channel != null) {
                    channel.configureBlocking(false);
                    channel.register(this.f65373b, 1, iMAPFolder);
                }
            } catch (IOException e5) {
                mailLogger.log(Level.FINEST, "IdleManager can't register folder", (Throwable) e5);
            } catch (CancelledKeyException e7) {
                mailLogger.log(Level.FINEST, "IdleManager can't register folder", (Throwable) e7);
            }
        }
    }

    public boolean isRunning() {
        return this.f65376e;
    }

    public synchronized void stop() {
        this.f65375d = true;
        this.f65374c.fine("IdleManager stopping");
        this.f65373b.wakeup();
    }

    public void watch(Folder folder) throws MessagingException {
        if (this.f65375d) {
            throw new MessagingException("IdleManager is not running");
        }
        if (!(folder instanceof IMAPFolder)) {
            throw new MessagingException("Can only watch IMAP folders");
        }
        IMAPFolder iMAPFolder = (IMAPFolder) folder;
        if ((iMAPFolder.protocol != null ? iMAPFolder.protocol.getChannel() : null) == null) {
            if (!folder.isOpen()) {
                throw new MessagingException("Folder is not open");
            }
            throw new MessagingException("Folder is not using SocketChannels");
        }
        MailLogger mailLogger = this.f65374c;
        Level level = Level.FINEST;
        if (mailLogger.isLoggable(level)) {
            this.f65374c.log(level, "IdleManager watching {0}", b(iMAPFolder));
        }
        int i10 = 0;
        while (!iMAPFolder.q(this)) {
            MailLogger mailLogger2 = this.f65374c;
            Level level2 = Level.FINEST;
            if (mailLogger2.isLoggable(level2)) {
                this.f65374c.log(level2, "IdleManager.watch startIdle failed for {0}", b(iMAPFolder));
            }
            i10++;
        }
        MailLogger mailLogger3 = this.f65374c;
        Level level3 = Level.FINEST;
        if (mailLogger3.isLoggable(level3)) {
            if (i10 > 0) {
                this.f65374c.log(level3, androidx.camera.core.impl.utils.b.a("IdleManager.watch startIdle succeeded for {0} after ", i10, " tries"), b(iMAPFolder));
            } else {
                this.f65374c.log(level3, "IdleManager.watch startIdle succeeded for {0}", b(iMAPFolder));
            }
        }
        synchronized (this) {
            this.f65377f.add(iMAPFolder);
            this.f65373b.wakeup();
        }
    }
}
