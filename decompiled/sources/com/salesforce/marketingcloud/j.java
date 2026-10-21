package com.salesforce.marketingcloud;

import androidx.core.app.NotificationCompat;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.LogLevel;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.LogListener;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.Logger;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007J\u001c\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J3\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0014J3\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0005\u0010\u0011J;\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0005\u0010\u0014J3\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J;\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J3\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0011J;\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0014J3\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0011J;\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0014J+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0005\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/salesforce/marketingcloud/j;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/Logger;", "Ljava/lang/Class;", "clazz", "", "a", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogLevel;", "logLevel", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", LogKeysKt.TAG, NotificationCompat.CATEGORY_MESSAGE, "", "", "args", "d", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "c", "e", "b", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class j extends Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f64353a = new j();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr) {
            super(0);
            this.f64354a = str;
            this.f64355b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64354a;
            Object[] objArr = this.f64355b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64357b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr) {
            super(0);
            this.f64356a = str;
            this.f64357b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64356a;
            Object[] objArr = this.f64357b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64359b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr) {
            super(0);
            this.f64358a = str;
            this.f64359b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64358a;
            Object[] objArr = this.f64359b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr) {
            super(0);
            this.f64360a = str;
            this.f64361b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64360a;
            Object[] objArr = this.f64361b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class e extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr) {
            super(0);
            this.f64362a = str;
            this.f64363b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64362a;
            Object[] objArr = this.f64363b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class f extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64365b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr) {
            super(0);
            this.f64364a = str;
            this.f64365b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64364a;
            Object[] objArr = this.f64365b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class g extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64367b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr) {
            super(0);
            this.f64366a = str;
            this.f64367b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64366a;
            Object[] objArr = this.f64367b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class h extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Object[] objArr) {
            super(0);
            this.f64368a = str;
            this.f64369b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64368a;
            Object[] objArr = this.f64369b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class i extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Object[] objArr) {
            super(0);
            this.f64370a = str;
            this.f64371b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64370a;
            Object[] objArr = this.f64371b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class C0255j extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0255j(String str, Object[] objArr) {
            super(0);
            this.f64372a = str;
            this.f64373b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            j jVar = j.f64353a;
            String str = this.f64372a;
            Object[] objArr = this.f64373b;
            return jVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    private j() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.e(tag, new c(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void c(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.d(tag, new e(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.d(tag, new g(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.w(tag, new i(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    @NotNull
    public static final String a(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String simpleName = clazz.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "clazz.simpleName");
        return com.salesforce.marketingcloud.g.a(simpleName);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.e(tag, throwable, new d(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void c(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.d(tag, throwable, new f(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.d(tag, throwable, new h(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.w(tag, throwable, new C0255j(msg, args));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(String msg, Object... args) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ENGLISH;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, msg, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    @JvmStatic
    public static final void a(@NotNull LogLevel logLevel, @Nullable LogListener listener) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        j jVar = f64353a;
        jVar.setLogLevel(logLevel);
        jVar.setListener(listener);
    }

    public static /* synthetic */ void a(LogLevel logLevel, LogListener logListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logListener = null;
        }
        a(logLevel, logListener);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.d(tag, new a(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64353a.d(tag, throwable, new b(msg, args));
    }
}
