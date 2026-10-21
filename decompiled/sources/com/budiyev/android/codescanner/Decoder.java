package com.budiyev.android.codescanner;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class Decoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiFormatReader f37966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f37967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListener f37968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumMap f37969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f37970e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile DecodeCallback f37971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile pc.a f37972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile State f37973h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State DECODED;
        public static final State DECODING;
        public static final State IDLE;
        public static final State INITIALIZED;
        public static final State STOPPED;

        static {
            State state = new State("INITIALIZED", 0);
            INITIALIZED = state;
            State state2 = new State("IDLE", 1);
            IDLE = state2;
            State state3 = new State("DECODING", 2);
            DECODING = state3;
            State state4 = new State("DECODED", 3);
            DECODED = state4;
            State state5 = new State("STOPPED", 4);
            STOPPED = state5;
            $VALUES = new State[]{state, state2, state3, state4, state5};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public interface StateListener {
        boolean onStateChanged(@NonNull State state);
    }

    public final class a extends Thread {
        public a() {
            super("cs-decoder");
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0005 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            pc.a aVar;
            Result resultA;
            Decoder decoder;
            State state;
            DecodeCallback decodeCallback;
            Process.setThreadPriority(10);
            while (true) {
                Decoder decoder2 = Decoder.this;
                State state2 = State.IDLE;
                decoder2.f37973h = state2;
                decoder2.f37968c.onStateChanged(state2);
                while (true) {
                    try {
                        synchronized (Decoder.this.f37970e) {
                            try {
                                aVar = Decoder.this.f37972g;
                                if (aVar != null) {
                                    break;
                                }
                                try {
                                    Decoder.this.f37970e.wait();
                                } catch (InterruptedException unused) {
                                    Decoder decoder3 = Decoder.this;
                                    State state3 = State.STOPPED;
                                    decoder3.f37973h = state3;
                                    decoder3.f37968c.onStateChanged(state3);
                                    return;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        Decoder decoder4 = Decoder.this;
                        State state4 = State.DECODING;
                        decoder4.f37973h = state4;
                        decoder4.f37968c.onStateChanged(state4);
                        resultA = aVar.a(Decoder.this.f37966a);
                        if (resultA != null) {
                            Decoder.this.f37972g = null;
                            decoder = Decoder.this;
                            state = State.DECODED;
                            decoder.f37973h = state;
                            if (!decoder.f37968c.onStateChanged(state) && (decodeCallback = Decoder.this.f37971f) != null) {
                                decodeCallback.onDecoded(resultA);
                            }
                        }
                    } catch (ReaderException unused2) {
                    }
                }
                Decoder.this.f37972g = null;
                Decoder decoder5 = Decoder.this;
                State state5 = State.DECODING;
                decoder5.f37973h = state5;
                decoder5.f37968c.onStateChanged(state5);
                resultA = aVar.a(Decoder.this.f37966a);
                if (resultA != null) {
                    Decoder.this.f37972g = null;
                    decoder = Decoder.this;
                    state = State.DECODED;
                    decoder.f37973h = state;
                    if (!decoder.f37968c.onStateChanged(state)) {
                    }
                }
            }
        }
    }

    public Decoder(@NonNull CodeScanner.a aVar, @NonNull CodeScanner.b bVar, @NonNull List list, @Nullable DecodeCallback decodeCallback) {
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.f37966a = multiFormatReader;
        a aVar2 = new a();
        this.f37967b = aVar2;
        aVar2.setUncaughtExceptionHandler(bVar);
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.f37969d = enumMap;
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, list);
        multiFormatReader.setHints(enumMap);
        this.f37971f = decodeCallback;
        this.f37968c = aVar;
        this.f37973h = State.INITIALIZED;
    }
}
