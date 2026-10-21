package com.bbva.proguarded.android.sslpinning;

import android.content.Context;
import android.content.res.Resources;
import com.bbva.sl.ar.android.sslpinning.SSLChecker;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import com.bbva.sl.ar.android.sslpinning.exception.RepositoryException;
import com.bbva.sl.ar.android.sslpinning.repo.SharedPreferencesRepository;
import com.bbva.sl.ar.android.sslpinning.result.ErrorInfo;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.security.PublicKey;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.openpay.library.domain.util.Constant;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes8.dex */
public class c extends b {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Logger f36130w0 = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Level f36131x0 = Level.ALL;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f36132y0 = SharedPreferencesRepository.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f36133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ErrorInfo f36134e;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final k f36135q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Thread f36136r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f36137s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f36138t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f36139u0;
    public final PublicKey v0;

    public c(Context context, int i10, boolean z10) throws InitializationException {
        Logger logger = f36130w0;
        this.f36137s0 = 0L;
        this.f36138t0 = 0;
        this.f36139u0 = 0;
        try {
            this.f36133d = context;
            logger.info("Loading configuration tree.");
            try {
                Element elementA = v.a(context.getResources().openRawResource(i10), "sslpinningconfig");
                if (elementA == null) {
                    throw new InitializationException(105, "Configuration error: Invalid config.");
                }
                logger.info("Loading configuration...");
                this.v0 = a(elementA);
                Level level = f36131x0;
                try {
                    level = Level.parse(getProperty("com.bbva.sl.ar.sslpinning.log.level", level.getName()));
                } catch (IllegalArgumentException unused) {
                }
                p.a(new p(), "com.bbva.sl.ar.android", level);
                logger.info("Loading repository...");
                String property = getProperty("com.bbva.sl.ar.sslpinning.repo.implclass", f36132y0);
                logger.finer("Loading repository class [" + property + "].");
                k kVar = (k) u.a(property);
                logger.finer("Initializating repository...");
                kVar.a(this, z10);
                this.f36135q0 = kVar;
                logger.info("Loading catalog...");
                a(elementA, this.v0);
                if (!containsKey("com.bbva.sl.ar.sslpinning.update.url") || getProperty("com.bbva.sl.ar.sslpinning.update.url").trim().length() == 0) {
                    throw new InitializationException(106, "Missing required config param [com.bbva.sl.ar.sslpinning.update.url].");
                }
            } catch (Resources.NotFoundException e5) {
                throw new InitializationException(104, "Config resource not found", e5);
            }
        } catch (RepositoryException e7) {
            throw new InitializationException(401, "Error initializating repository.", e7);
        }
    }

    public final synchronized void a(d dVar) throws RepositoryException, InitializationException {
        try {
            d dVar2 = this.f36127a;
            if (dVar2 == null) {
                this.f36127a = dVar;
            } else {
                if (!dVar2.f36142b.equals(dVar.f36142b)) {
                    throw new InitializationException(204, "Different catalog version detected");
                }
                dVar2.clear();
                dVar2.putAll(dVar);
                dVar2.f36141a = dVar.f36141a;
                dVar2.f36143c = dVar.f36143c;
            }
            this.f36129c = System.currentTimeMillis();
            f36130w0.fine("Saving catalog revision [" + this.f36127a.f36141a + "] to local repository. Last update: " + this.f36129c);
            this.f36135q0.a("com.bbva.sl.ar.sslpinning.sitecatalog.revision.v2", Long.toString(this.f36127a.f36141a));
            this.f36135q0.a(this.f36127a);
            this.f36135q0.a("com.bbva.sl.ar.sslpinning.sitecatalog.lastupdate.v2", Long.toString(this.f36129c));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        this.f36129c = System.currentTimeMillis();
    }

    public final void d() {
        this.f36137s0 = System.currentTimeMillis() + 120000;
    }

    public final String e() {
        return this.f36128b;
    }

    public final long f() throws RepositoryException {
        String strA = this.f36135q0.a("com.bbva.sl.ar.sslpinning.sitecatalog.revision.v2");
        Logger logger = f36130w0;
        if (strA == null) {
            logger.info("No catalog revision found in repository.");
            return -1L;
        }
        logger.fine("Revision [" + strA + "] found in repository,");
        return Long.parseLong(strA);
    }

    public final synchronized void a(SSLChecker sSLChecker) {
        long jA;
        int i10;
        try {
            jA = a("com.bbva.sl.ar.sslpinning.update.threshold") * 1000;
        } catch (Exception unused) {
            jA = 86000000;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f36129c + jA >= jCurrentTimeMillis || this.f36137s0 >= jCurrentTimeMillis) {
            Logger logger = f36130w0;
            logger.fine("Last update [" + this.f36129c + "] still in threshold. Update not required.");
            logger.finer("Current time: [" + jCurrentTimeMillis + "], Last update: [" + this.f36129c + "], Threshold: [" + jA + "], Delayed Check time: [" + this.f36137s0 + "].");
            return;
        }
        Logger logger2 = f36130w0;
        logger2.fine("Last update time [" + this.f36129c + "] age exceeded threshold. Starting update process.");
        Thread thread = this.f36136r0;
        if (thread != null && thread.isAlive() && (i10 = this.f36138t0) < 10) {
            int i11 = i10 + 1;
            this.f36138t0 = i11;
            this.f36137s0 = androidx.emoji2.text.flatbuffer.a.a(i11, 5000L, jCurrentTimeMillis, this.f36137s0);
            logger2.warning("Update thread [" + this.f36136r0.getId() + "] still running. Delaying until " + this.f36137s0 + Constant.DOT_STRING);
            return;
        }
        Thread thread2 = this.f36136r0;
        if (thread2 != null && thread2.isAlive()) {
            this.f36136r0.interrupt();
            int i12 = this.f36139u0;
            this.f36139u0 = i12 + 1;
            if (i12 > 20) {
                logger2.warning("Maximum interrupted threads [20] reached. Will not update");
                return;
            }
        }
        this.f36138t0 = 0;
        this.f36137s0 = 0L;
        Thread thread3 = new Thread(new x(this, sSLChecker, this.v0));
        this.f36136r0 = thread3;
        thread3.setName("SSLPUpdate");
        this.f36136r0.start();
        logger2.fine("Started update thread [" + this.f36136r0.getId() + "].");
    }

    @Override // com.bbva.proguarded.android.sslpinning.b
    public final synchronized void a(Element element, PublicKey publicKey) throws InitializationException {
        try {
            d dVarA = d.a(element, publicKey);
            long j10 = 0;
            if (f() < dVarA.f36141a) {
                a(dVarA);
                this.f36129c = 0L;
                return;
            }
            this.f36127a = this.f36135q0.a(publicKey);
            if (f() != this.f36127a.f36141a) {
                throw new RepositoryException(ResultCode.ERROR_REPO_CORRUPT, "Inconsistent revisions found stored in repository.");
            }
            String strA = this.f36135q0.a("com.bbva.sl.ar.sslpinning.sitecatalog.lastupdate.v2");
            if (strA != null) {
                j10 = Long.parseLong(strA);
            }
            this.f36129c = j10;
            f36130w0.fine("Catalog revision [" + this.f36127a.f36141a + "] loaded from local repository. Last update: " + this.f36129c);
        } catch (RepositoryException e5) {
            throw new InitializationException(e5);
        }
    }
}
