package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class BufferRecyclers {
    public static final String SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    protected static final ThreadLocal<SoftReference<JsonStringEncoder>> _encoderRef;
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43142a;

    static {
        f43142a = "true".equals(System.getProperty(SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS)) ? a.C0193a.f43171a : null;
        _recyclerRef = new ThreadLocal<>();
        _encoderRef = new ThreadLocal<>();
    }

    public static byte[] encodeAsUTF8(String str) {
        return getJsonStringEncoder().encodeAsUTF8(str);
    }

    public static BufferRecycler getBufferRecycler() {
        SoftReference<BufferRecycler> softReference;
        ThreadLocal<SoftReference<BufferRecycler>> threadLocal = _recyclerRef;
        SoftReference<BufferRecycler> softReference2 = threadLocal.get();
        BufferRecycler bufferRecycler = softReference2 == null ? null : softReference2.get();
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            a aVar = f43142a;
            if (aVar != null) {
                ReferenceQueue<BufferRecycler> referenceQueue = aVar.f43170c;
                softReference = new SoftReference<>(bufferRecycler, referenceQueue);
                ConcurrentHashMap concurrentHashMap = aVar.f43169b;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference<>(bufferRecycler);
            }
            threadLocal.set(softReference);
        }
        return bufferRecycler;
    }

    public static JsonStringEncoder getJsonStringEncoder() {
        ThreadLocal<SoftReference<JsonStringEncoder>> threadLocal = _encoderRef;
        SoftReference<JsonStringEncoder> softReference = threadLocal.get();
        JsonStringEncoder jsonStringEncoder = softReference == null ? null : softReference.get();
        if (jsonStringEncoder != null) {
            return jsonStringEncoder;
        }
        JsonStringEncoder jsonStringEncoder2 = new JsonStringEncoder();
        threadLocal.set(new SoftReference<>(jsonStringEncoder2));
        return jsonStringEncoder2;
    }

    public static char[] quoteAsJsonText(String str) {
        return getJsonStringEncoder().quoteAsString(str);
    }

    public static byte[] quoteAsJsonUTF8(String str) {
        return getJsonStringEncoder().quoteAsUTF8(str);
    }

    public static int releaseBuffers() {
        int i10;
        a aVar = f43142a;
        if (aVar == null) {
            return -1;
        }
        synchronized (aVar.f43168a) {
            while (true) {
                try {
                    SoftReference softReference = (SoftReference) aVar.f43170c.poll();
                    if (softReference == null) {
                        break;
                    }
                    aVar.f43169b.remove(softReference);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = aVar.f43169b.keySet().iterator();
            i10 = 0;
            while (it.hasNext()) {
                ((SoftReference) it.next()).clear();
                i10++;
            }
            aVar.f43169b.clear();
        }
        return i10;
    }

    public static void quoteAsJsonText(CharSequence charSequence, StringBuilder sb2) {
        getJsonStringEncoder().quoteAsString(charSequence, sb2);
    }
}
