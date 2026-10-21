package com.bbva.glomohybrid.welcome.presentation.util;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextSwitchHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001b\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/util/TextSwitchHandler;", "", "", EventDataKeys.Lifecycle.LIFECYCLE_START, EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "", "", "texts", "setTexts", "([Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "e", "Landroidx/lifecycle/MutableLiveData;", "getCurrentText", "()Landroidx/lifecycle/MutableLiveData;", "currentText", "textArray", "", "interval", "<init>", "([Ljava/lang/String;J)V", "Companion", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class TextSwitchHandler {
    public static final long DEFAULT_INTERVAL = 4000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String[] f34753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Handler f34755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<String> currentText;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextSwitchHandler$updateTextTask$1 f34758f;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.bbva.glomohybrid.welcome.presentation.util.TextSwitchHandler$updateTextTask$1] */
    public TextSwitchHandler(@NotNull String[] textArray, long j10) {
        Intrinsics.checkNotNullParameter(textArray, "textArray");
        this.f34753a = textArray;
        this.f34754b = j10;
        this.currentText = new MutableLiveData<>(this.f34753a[0]);
        this.f34758f = new Runnable() { // from class: com.bbva.glomohybrid.welcome.presentation.util.TextSwitchHandler$updateTextTask$1
            @Override // java.lang.Runnable
            public void run() {
                TextSwitchHandler textSwitchHandler = this.f34759p0;
                textSwitchHandler.getCurrentText().setValue(textSwitchHandler.f34753a[textSwitchHandler.f34756d % textSwitchHandler.f34753a.length]);
                textSwitchHandler.f34756d++;
                Handler handler = textSwitchHandler.f34755c;
                if (handler != null) {
                    handler.postDelayed(this, textSwitchHandler.f34754b);
                }
            }
        };
    }

    @NotNull
    public final MutableLiveData<String> getCurrentText() {
        return this.currentText;
    }

    public final void pause() {
        Handler handler = this.f34755c;
        if (handler != null) {
            handler.removeCallbacks(this.f34758f);
        }
        this.f34755c = null;
    }

    public final void setTexts(@NotNull String[] texts) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        this.f34753a = texts;
    }

    public final void start() {
        this.f34756d = 0;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f34755c = handler;
        handler.post(this.f34758f);
    }

    public /* synthetic */ TextSwitchHandler(String[] strArr, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr, (i10 & 2) != 0 ? DEFAULT_INTERVAL : j10);
    }
}
