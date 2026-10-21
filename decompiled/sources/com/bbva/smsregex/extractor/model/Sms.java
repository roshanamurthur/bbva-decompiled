package com.bbva.smsregex.extractor.model;

import android.content.Intent;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sms.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/smsregex/extractor/model/Sms;", "", "", "b", "Lkotlin/Lazy;", "getMessage", "()Ljava/lang/String;", "message", "Landroid/content/Intent;", "data", "<init>", "(Landroid/content/Intent;)V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
public final class Sms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Intent f36839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy message;

    /* JADX INFO: compiled from: Sms.kt */
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String stringExtra = Sms.this.f36839a.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE);
            return stringExtra == null ? "" : stringExtra;
        }
    }

    public Sms(@NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f36839a = data;
        this.message = LazyKt__LazyJVMKt.lazy(new a());
    }

    @NotNull
    public final String getMessage() {
        return (String) this.message.getValue();
    }
}
