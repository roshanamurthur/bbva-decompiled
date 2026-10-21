package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.n1;
import com.appsflyer.AFLogger;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1bSDK implements AFf1fSDK {
    private static final BitSet afDebugLog;
    boolean AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    final Handler AFKeystoreWrapper;
    private boolean AFLogger;
    private long AFLogger$LogLevel;
    private final Map<AFf1dSDK, AFf1dSDK> afErrorLog;
    private final Runnable afErrorLogForExcManagerOnly;
    private final Map<AFf1dSDK, Map<String, Object>> afInfoLog;
    private final SensorManager afRDLog;
    private int afWarnLog;
    private Runnable getLevel;
    final Object valueOf;
    final Runnable values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1bSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFf1bSDK.this.afErrorLog.isEmpty()) {
                    for (AFf1dSDK aFf1dSDK : AFf1bSDK.this.afErrorLog.values()) {
                        AFf1bSDK.this.afRDLog.unregisterListener(aFf1dSDK);
                        aFf1dSDK.AFKeystoreWrapper(AFf1bSDK.this.afInfoLog, true);
                    }
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th2);
            }
            AFf1bSDK.this.afWarnLog = 0;
            AFf1bSDK.this.AFLogger = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        afDebugLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    @VisibleForTesting
    private AFf1bSDK(@NonNull SensorManager sensorManager, Handler handler) {
        this.valueOf = new Object();
        BitSet bitSet = afDebugLog;
        this.afErrorLog = new HashMap(bitSet.size());
        this.afInfoLog = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1bSDK.this.valueOf) {
                    final AFf1bSDK aFf1bSDK = AFf1bSDK.this;
                    aFf1bSDK.AFKeystoreWrapper.post(new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFf1bSDK.this.afRDLog.getSensorList(-1)) {
                                    if (AFf1bSDK.AFInAppEventType(sensor.getType())) {
                                        AFf1dSDK aFf1dSDK = new AFf1dSDK(sensor);
                                        if (!AFf1bSDK.this.afErrorLog.containsKey(aFf1dSDK)) {
                                            AFf1bSDK.this.afErrorLog.put(aFf1dSDK, aFf1dSDK);
                                        }
                                        AFf1bSDK.this.afRDLog.registerListener((SensorEventListener) AFf1bSDK.this.afErrorLog.get(aFf1dSDK), sensor, 0, AFf1bSDK.this.AFKeystoreWrapper);
                                    }
                                }
                            } catch (Throwable th2) {
                                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th2);
                            }
                            AFf1bSDK.this.AFLogger = true;
                        }
                    });
                    AFf1bSDK aFf1bSDK2 = AFf1bSDK.this;
                    aFf1bSDK2.AFKeystoreWrapper.postDelayed(aFf1bSDK2.afErrorLogForExcManagerOnly, 100L);
                    AFf1bSDK.this.AFInAppEventParameterName = true;
                }
            }
        };
        this.values = new n1(this, 4);
        this.getLevel = new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1bSDK.this.valueOf) {
                    try {
                        AFf1bSDK aFf1bSDK = AFf1bSDK.this;
                        if (aFf1bSDK.AFInAppEventParameterName) {
                            aFf1bSDK.AFKeystoreWrapper.removeCallbacks(aFf1bSDK.AFInAppEventType);
                            AFf1bSDK aFf1bSDK2 = AFf1bSDK.this;
                            aFf1bSDK2.AFKeystoreWrapper.removeCallbacks(aFf1bSDK2.values);
                            AFf1bSDK aFf1bSDK3 = AFf1bSDK.this;
                            aFf1bSDK3.AFKeystoreWrapper.post(aFf1bSDK3.new AnonymousClass3());
                            AFf1bSDK.this.AFInAppEventParameterName = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.afWarnLog = 1;
        this.AFLogger$LogLevel = 0L;
        this.afErrorLogForExcManagerOnly = new Runnable() { // from class: com.appsflyer.internal.AFf1bSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1bSDK.this.valueOf) {
                    try {
                        if (AFf1bSDK.this.afWarnLog == 0) {
                            AFf1bSDK.this.afWarnLog = 1;
                        }
                        AFf1bSDK aFf1bSDK = AFf1bSDK.this;
                        aFf1bSDK.AFKeystoreWrapper.postDelayed(aFf1bSDK.values, ((long) aFf1bSDK.afWarnLog) * 500);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.afRDLog = sensorManager;
        this.AFKeystoreWrapper = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void afErrorLog() {
        synchronized (this.valueOf) {
            this.AFKeystoreWrapper.post(new AnonymousClass3());
        }
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> afInfoLog() {
        synchronized (this.valueOf) {
            try {
                if (!this.afErrorLog.isEmpty() && this.AFLogger) {
                    Iterator<AFf1dSDK> it = this.afErrorLog.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFKeystoreWrapper(this.afInfoLog, false);
                    }
                }
                if (this.afInfoLog.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.afInfoLog.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    private List<Map<String, Object>> AFInAppEventParameterName() {
        Iterator<AFf1dSDK> it = this.afErrorLog.values().iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(this.afInfoLog, true);
        }
        Map<AFf1dSDK, Map<String, Object>> map = this.afInfoLog;
        return (map == null || map.isEmpty()) ? new CopyOnWriteArrayList(Collections.emptyList()) : new CopyOnWriteArrayList(this.afInfoLog.values());
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    @NonNull
    public final Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAfInfoLog = afInfoLog();
        if (listAfInfoLog.isEmpty()) {
            List<Map<String, Object>> listAFInAppEventParameterName = AFInAppEventParameterName();
            if (!listAFInAppEventParameterName.isEmpty()) {
                concurrentHashMap.put("sensors", listAFInAppEventParameterName);
            }
        } else {
            concurrentHashMap.put("sensors", listAfInfoLog);
        }
        return concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFInAppEventType(int i10) {
        return i10 >= 0 && afDebugLog.get(i10);
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    @NonNull
    public final Map<String, Object> valueOf() throws ParseException {
        ConcurrentHashMap concurrentHashMap;
        AFf1eSDK.AFa1zSDK aFa1zSDK;
        ArrayList arrayList;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        List<Map<String, Object>> listAFInAppEventParameterName = AFInAppEventParameterName();
        String str = "sensors";
        String str2 = "na";
        if (!listAFInAppEventParameterName.isEmpty()) {
            new AFf1eSDK();
            HashMap map = new HashMap();
            Iterator<Map<String, Object>> it = listAFInAppEventParameterName.iterator();
            while (it.hasNext()) {
                Map<String, Object> next = it.next();
                HashMap map2 = new HashMap();
                boolean z10 = next.get("sVS") != null;
                boolean z11 = next.get("sVE") != null;
                if (z10 && z11) {
                    aFa1zSDK = AFf1eSDK.AFa1zSDK.ALL;
                } else if (z10) {
                    aFa1zSDK = AFf1eSDK.AFa1zSDK.FIRST;
                } else {
                    aFa1zSDK = AFf1eSDK.AFa1zSDK.NONE;
                }
                if (aFa1zSDK != AFf1eSDK.AFa1zSDK.NONE) {
                    Integer num = (Integer) next.get("sT");
                    String str3 = (String) next.get("sN");
                    if (str3 != null) {
                        map2.put("n", str3);
                    } else {
                        map2.put("n", "uk");
                    }
                    AFf1eSDK.AFa1vSDK aFa1vSDK = AFf1eSDK.AFa1vSDK.values()[num.intValue()];
                    ArrayList arrayList2 = new ArrayList(AFf1eSDK.AFKeystoreWrapper(next.get("sVS")));
                    if (aFa1zSDK == AFf1eSDK.AFa1zSDK.ALL) {
                        arrayList2.addAll(AFf1eSDK.AFKeystoreWrapper(next.get("sVE")));
                    }
                    if (aFa1vSDK == AFf1eSDK.AFa1vSDK.MAGNETOMETER) {
                        ArrayList arrayList3 = new ArrayList();
                        BigDecimal bigDecimal = (BigDecimal) arrayList2.get(0);
                        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), bigDecimal.doubleValue()) * 57.29577951308232d);
                        DecimalFormat decimalFormat = new DecimalFormat("##.#");
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        decimalFormat.setRoundingMode(roundingMode);
                        arrayList3.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat.format(bigDecimalValueOf))));
                        BigDecimal bigDecimal2 = (BigDecimal) arrayList2.get(2);
                        DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                        decimalFormat2.setRoundingMode(roundingMode);
                        arrayList3.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat2.format(bigDecimal2))));
                        ArrayList arrayList4 = new ArrayList();
                        if (arrayList2.size() > 5) {
                            BigDecimal bigDecimal3 = (BigDecimal) arrayList2.get(3);
                            BigDecimal bigDecimalSubtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), bigDecimal3.doubleValue()) * 57.29577951308232d).subtract(bigDecimalValueOf);
                            DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                            decimalFormat3.setRoundingMode(roundingMode);
                            arrayList4.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat3.format(bigDecimalSubtract))));
                            BigDecimal bigDecimalSubtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                            DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                            decimalFormat4.setRoundingMode(roundingMode);
                            arrayList4.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat4.format(bigDecimalSubtract2))));
                        }
                        arrayList = new ArrayList();
                        arrayList.add(arrayList3);
                        arrayList.add(arrayList4);
                    } else {
                        concurrentHashMap2 = concurrentHashMap2;
                        str = str;
                        str2 = str2;
                        ArrayList arrayList5 = new ArrayList();
                        if (arrayList2.size() > 5) {
                            BigDecimal bigDecimalSubtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                            DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                            decimalFormat5.setRoundingMode(roundingMode2);
                            arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat5.format(bigDecimalSubtract3))));
                            BigDecimal bigDecimalSubtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                            DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                            decimalFormat6.setRoundingMode(roundingMode2);
                            arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat6.format(bigDecimalSubtract4))));
                            BigDecimal bigDecimalSubtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                            DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                            decimalFormat7.setRoundingMode(roundingMode2);
                            arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat7.format(bigDecimalSubtract5))));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        BigDecimal bigDecimal4 = (BigDecimal) arrayList2.get(0);
                        DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        decimalFormat8.setRoundingMode(roundingMode3);
                        arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat8.format(bigDecimal4))));
                        BigDecimal bigDecimal5 = (BigDecimal) arrayList2.get(1);
                        DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                        decimalFormat9.setRoundingMode(roundingMode3);
                        arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat9.format(bigDecimal5))));
                        BigDecimal bigDecimal6 = (BigDecimal) arrayList2.get(2);
                        DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                        decimalFormat10.setRoundingMode(roundingMode3);
                        arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(decimalFormat10.format(bigDecimal6))));
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(arrayList6);
                        arrayList7.add(arrayList5);
                        arrayList = arrayList7;
                    }
                    map2.put(SharedPrefsStorage.VERSION_KEY, arrayList);
                    map.put(AFf1eSDK.AFa1wSDK.values()[num.intValue()].valueOf, map2);
                    if (aFa1zSDK == AFf1eSDK.AFa1zSDK.FIRST) {
                        map.put("er", "no_svs");
                    }
                    it = it;
                    concurrentHashMap2 = concurrentHashMap2;
                    str = str;
                    str2 = str2;
                } else {
                    map = new HashMap();
                    map.put("er", str2);
                    concurrentHashMap = concurrentHashMap2;
                    concurrentHashMap.put(str, map);
                    return concurrentHashMap;
                }
            }
            concurrentHashMap = concurrentHashMap2;
            concurrentHashMap.put(str, map);
            return concurrentHashMap;
        }
        concurrentHashMap2.put("sensors", "na");
        return concurrentHashMap2;
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final synchronized void values() {
        this.AFKeystoreWrapper.post(this.getLevel);
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final void AFInAppEventType() {
        this.AFKeystoreWrapper.post(this.getLevel);
        this.AFKeystoreWrapper.post(this.AFInAppEventType);
    }

    public AFf1bSDK(@NonNull Context context) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()));
    }
}
