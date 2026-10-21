package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.SSLChecker;
import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import com.bbva.sl.ar.android.sslpinning.result.ErrorInfo;
import java.security.PublicKey;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class x implements Runnable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Logger f36174r0 = Logger.getLogger(x.class.getName());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final c f36175p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final y f36176q0;

    public x(c cVar, SSLChecker sSLChecker, PublicKey publicKey) {
        this.f36175p0 = cVar;
        this.f36176q0 = new y(cVar, sSLChecker, publicKey);
        a();
    }

    public final z a() {
        z zVar = new z();
        f36174r0.fine("Establishing params for update request.");
        zVar.a("protocol_version", "1.0");
        c cVar = this.f36175p0;
        zVar.a("catalog_actualrevision", Long.toString(cVar.a().f36141a));
        zVar.a("catalog_lastupdate", Long.toString(cVar.b()));
        zVar.a("catalog_version", cVar.a().f36142b);
        zVar.a("config_version", cVar.e());
        return zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f36175p0;
        Logger logger = f36174r0;
        logger.fine("Starting update process...");
        try {
            d dVarA = this.f36176q0.a(a());
            if (dVarA == null) {
                logger.severe("Error updating catalog. Null object retrieved.");
                cVar.f36134e = new ErrorInfo(801, "Error updating catalog. Null object retrieved.", null);
                cVar.d();
                return;
            }
            if (dVarA.f36141a > cVar.a().f36141a) {
                logger.info("New site catalog dowloaded. Replacing.");
                cVar.a(dVarA);
            } else {
                logger.fine("Downloaded catalog on the same or older revision. No need to update.");
                cVar.c();
            }
            cVar.f36134e = new ErrorInfo(0, "OK. Updated to revision " + dVarA.f36141a, null);
        } catch (SSLPinningException e5) {
            logger.severe("Error updating catalog: " + e5.getErrCode());
            cVar.f36134e = new ErrorInfo(e5);
            cVar.d();
        } catch (NullPointerException e7) {
            logger.warning("Could not save the new catalog because a clear data process is running");
            logger.warning(e7.toString());
        }
    }
}
