package javax.mail;

import java.security.AccessController;
import java.util.EventListener;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import javax.mail.event.MailEvent;

/* JADX INFO: compiled from: EventQueue.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static WeakHashMap<ClassLoader, a> f78941r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public volatile LinkedBlockingQueue f78942p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Executor f78943q0;

    /* JADX INFO: renamed from: javax.mail.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventQueue.java */
    public static class C0432a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MailEvent f78944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Vector<? extends EventListener> f78945b;

        public C0432a(MailEvent mailEvent, Vector<? extends EventListener> vector) {
            this.f78944a = mailEvent;
            this.f78945b = vector;
        }
    }

    /* JADX INFO: compiled from: EventQueue.java */
    public static class b extends MailEvent {
        @Override // javax.mail.event.MailEvent
        public final void dispatch(Object obj) {
            Thread.currentThread().interrupt();
        }
    }

    public a(Executor executor) {
        this.f78943q0 = executor;
    }

    public static synchronized a b(Executor executor) {
        a aVar;
        try {
            Session session = Session.m;
            ClassLoader classLoader = (ClassLoader) AccessController.doPrivileged(new c());
            if (f78941r0 == null) {
                f78941r0 = new WeakHashMap<>();
            }
            aVar = f78941r0.get(classLoader);
            if (aVar == null) {
                aVar = new a(executor);
                f78941r0.put(classLoader, aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void a(MailEvent mailEvent, Vector<? extends EventListener> vector) {
        try {
            if (this.f78942p0 == null) {
                this.f78942p0 = new LinkedBlockingQueue();
                Executor executor = this.f78943q0;
                if (executor != null) {
                    executor.execute(this);
                } else {
                    Thread thread = new Thread(this, "JavaMail-EventQueue");
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            this.f78942p0.add(new C0432a(mailEvent, vector));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        if (this.f78942p0 != null) {
            Vector vector = new Vector();
            vector.setSize(1);
            this.f78942p0.add(new C0432a(new b(new Object()), vector));
            this.f78942p0 = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedBlockingQueue linkedBlockingQueue = this.f78942p0;
        if (linkedBlockingQueue == null) {
            return;
        }
        while (true) {
            try {
                C0432a c0432a = (C0432a) linkedBlockingQueue.take();
                MailEvent mailEvent = c0432a.f78944a;
                Vector<? extends EventListener> vector = c0432a.f78945b;
                for (int i10 = 0; i10 < vector.size(); i10++) {
                    try {
                        mailEvent.dispatch(vector.elementAt(i10));
                    } catch (Throwable th2) {
                        if (th2 instanceof InterruptedException) {
                            return;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
