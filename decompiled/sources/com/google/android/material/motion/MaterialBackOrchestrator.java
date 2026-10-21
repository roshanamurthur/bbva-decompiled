package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Objects;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialBackOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f44940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialBackHandler f44941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f44942c;

    @RequiresApi(33)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public OnBackInvokedCallback f44943a;

        public OnBackInvokedCallback a(@NonNull final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.c
                public final void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }
            };
        }

        @DoNotInline
        public void b(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f44943a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackA = a(materialBackHandler);
                this.f44943a = onBackInvokedCallbackA;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? DurationKt.NANOS_IN_MILLIS : 0, onBackInvokedCallbackA);
            }
        }

        @DoNotInline
        public void c(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f44943a);
            this.f44943a = null;
        }
    }

    @RequiresApi(34)
    public static class b extends a {

        public class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MaterialBackHandler f44944a;

            public a(MaterialBackHandler materialBackHandler) {
                this.f44944a = materialBackHandler;
            }

            public final void onBackCancelled() {
                if (b.this.f44943a != null) {
                    this.f44944a.cancelBackProgress();
                }
            }

            public final void onBackInvoked() {
                this.f44944a.handleBackInvoked();
            }

            public final void onBackProgressed(@NonNull BackEvent backEvent) {
                if (b.this.f44943a != null) {
                    this.f44944a.updateBackProgress(new BackEventCompat(backEvent));
                }
            }

            public final void onBackStarted(@NonNull BackEvent backEvent) {
                if (b.this.f44943a != null) {
                    this.f44944a.startBackProgress(new BackEventCompat(backEvent));
                }
            }
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.a
        public final OnBackInvokedCallback a(@NonNull MaterialBackHandler materialBackHandler) {
            return new a(materialBackHandler);
        }
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(@NonNull T t10) {
        this(t10, t10);
    }

    public boolean shouldListenForBackCallbacks() {
        return this.f44940a != null;
    }

    public void startListeningForBackCallbacks() {
        a aVar = this.f44940a;
        if (aVar != null) {
            aVar.b(this.f44941b, this.f44942c, false);
        }
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        a aVar = this.f44940a;
        if (aVar != null) {
            aVar.b(this.f44941b, this.f44942c, true);
        }
    }

    public void stopListeningForBackCallbacks() {
        a aVar = this.f44940a;
        if (aVar != null) {
            aVar.c(this.f44942c);
        }
    }

    public MaterialBackOrchestrator(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view) {
        int i10 = Build.VERSION.SDK_INT;
        this.f44940a = i10 >= 34 ? new b() : i10 >= 33 ? new a() : null;
        this.f44941b = materialBackHandler;
        this.f44942c = view;
    }
}
