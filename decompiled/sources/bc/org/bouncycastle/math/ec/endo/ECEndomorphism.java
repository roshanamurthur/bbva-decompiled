package bc.org.bouncycastle.math.ec.endo;

import bc.org.bouncycastle.math.ec.ECPointMap;

/* JADX INFO: loaded from: classes2.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
