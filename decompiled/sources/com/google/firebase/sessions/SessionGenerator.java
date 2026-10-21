package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SessionGenerator.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00028\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "Lcom/google/firebase/sessions/SessionDetails;", "generateNewSession", "<set-?>", "e", "Lcom/google/firebase/sessions/SessionDetails;", "getCurrentSession", "()Lcom/google/firebase/sessions/SessionDetails;", "currentSession", "", "getHasGenerateSession", "()Z", "hasGenerateSession", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lkotlin/Function0;", "Ljava/util/UUID;", "uuidGenerator", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lkotlin/jvm/functions/Function0;)V", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionGenerator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TimeProvider f48870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<UUID> f48871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f48872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public SessionDetails currentSession;

    /* JADX INFO: compiled from: SessionGenerator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator$Companion;", "", "()V", "instance", "Lcom/google/firebase/sessions/SessionGenerator;", "getInstance", "()Lcom/google/firebase/sessions/SessionGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SessionGenerator getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionGenerator.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionGenerator::class.java]");
            return (SessionGenerator) obj;
        }
    }

    /* JADX INFO: compiled from: SessionGenerator.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<UUID> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f48875p0 = new a();

        public a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public SessionGenerator(@NotNull TimeProvider timeProvider, @NotNull Function0<UUID> uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f48870a = timeProvider;
        this.f48871b = uuidGenerator;
        this.f48872c = a();
        this.f48873d = -1;
    }

    public final String a() {
        String string = this.f48871b.invoke().toString();
        Intrinsics.checkNotNullExpressionValue(string, "uuidGenerator().toString()");
        String lowerCase = l.replace$default(string, Constant.DASH_STRING, "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @NotNull
    public final SessionDetails generateNewSession() {
        int i10 = this.f48873d + 1;
        this.f48873d = i10;
        this.currentSession = new SessionDetails(i10 == 0 ? this.f48872c : a(), this.f48872c, this.f48873d, this.f48870a.currentTimeUs());
        return getCurrentSession();
    }

    @NotNull
    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentSession");
        return null;
    }

    public final boolean getHasGenerateSession() {
        return this.currentSession != null;
    }

    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, (i10 & 2) != 0 ? a.f48875p0 : function0);
    }
}
