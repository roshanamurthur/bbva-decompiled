package com.salesforce.marketingcloud;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J-\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\tJ3\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u0011J3\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u000eJ;\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0011J3\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J3\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u000eJ;\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J3\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ;\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0011J0\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002J+\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u001aJ\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J1\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0007¢\u0006\u0004\b\r\u0010\u001bJ1\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0007¢\u0006\u0004\b\u0004\u0010\u001bJ1\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0007¢\u0006\u0004\b\u0012\u0010\u001bJ1\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0007¢\u0006\u0004\b\u0013\u0010\u001bJ1\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0007¢\u0006\u0004\b\u0014\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\"\u0010\"\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0014\u0010 \"\u0004\b\u0004\u0010!R$\u0010(\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u0004\u0010&\"\u0004\b\u0004\u0010'¨\u0006+"}, d2 = {"Lcom/salesforce/marketingcloud/g;", "", "", LogKeysKt.TAG, "a", "appId", "accessToken", "senderId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", NotificationCompat.CATEGORY_MESSAGE, "", "args", "d", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "c", "e", "b", "", "lvl", "t", "Lkotlin/Function0;", "lazyMsg", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "MAX_TAG_LENGTH", "Ljava/lang/String;", "f", "()I", "(I)V", "logLevel", "Lcom/salesforce/marketingcloud/MCLogListener;", "g", "Lcom/salesforce/marketingcloud/MCLogListener;", "()Lcom/salesforce/marketingcloud/MCLogListener;", "(Lcom/salesforce/marketingcloud/MCLogListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int MAX_TAG_LENGTH = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private static String appId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private static String accessToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private static String senderId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private static MCLogListener listener;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f64223a = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static int logLevel = 6;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr) {
            super(0);
            this.f64230a = str;
            this.f64231b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64230a;
            Object[] objArr = this.f64231b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64233b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr) {
            super(0);
            this.f64232a = str;
            this.f64233b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64232a;
            Object[] objArr = this.f64233b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr) {
            super(0);
            this.f64234a = str;
            this.f64235b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64234a;
            Object[] objArr = this.f64235b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr) {
            super(0);
            this.f64236a = str;
            this.f64237b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64236a;
            Object[] objArr = this.f64237b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class e extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<String> f64238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<String> function0) {
            super(0);
            this.f64238a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f64238a.invoke() + " - Sdk Version: " + MarketingCloudSdk.getSdkVersionName();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class f extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64240b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr) {
            super(0);
            this.f64239a = str;
            this.f64240b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64239a;
            Object[] objArr = this.f64240b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class C0250g extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0250g(String str, Object[] objArr) {
            super(0);
            this.f64241a = str;
            this.f64242b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64241a;
            Object[] objArr = this.f64242b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class h extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Object[] objArr) {
            super(0);
            this.f64243a = str;
            this.f64244b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64243a;
            Object[] objArr = this.f64244b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class i extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64246b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Object[] objArr) {
            super(0);
            this.f64245a = str;
            this.f64246b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64245a;
            Object[] objArr = this.f64246b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class j extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Object[] objArr) {
            super(0);
            this.f64247a = str;
            this.f64248b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64247a;
            Object[] objArr = this.f64248b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class k extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f64250b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Object[] objArr) {
            super(0);
            this.f64249a = str;
            this.f64250b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            g gVar = g.f64223a;
            String str = this.f64249a;
            Object[] objArr = this.f64250b;
            return gVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    private g() {
    }

    private final String c(String tag) {
        if (!StringsKt__StringsKt.contains$default((CharSequence) tag, (CharSequence) "~!", false, 2, (Object) null)) {
            tag = androidx.camera.core.processing.f.d("~!", tag);
        }
        return tag.length() <= 23 ? tag : tag.subSequence(0, 23).toString();
    }

    public static /* synthetic */ void d(g gVar, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        gVar.d(str, th2, (Function0<String>) function0);
    }

    public static /* synthetic */ void e(g gVar, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        gVar.e(str, th2, (Function0<String>) function0);
    }

    @Nullable
    public final MCLogListener a() {
        return listener;
    }

    public final int b() {
        return logLevel;
    }

    private final String b(String msg) {
        String strReplace$default;
        String strReplace$default2;
        String strReplace$default3;
        if (TextUtils.getTrimmedLength(msg) == 0) {
            return "Log message was empty";
        }
        String str = appId;
        if (str != null && (strReplace$default3 = l.replace$default(msg, str, "████████-████-████-████-████████████", false, 4, (Object) null)) != null) {
            msg = strReplace$default3;
        }
        String str2 = accessToken;
        if (str2 != null && (strReplace$default2 = l.replace$default(msg, str2, "███████████████████████", false, 4, (Object) null)) != null) {
            msg = strReplace$default2;
        }
        String str3 = senderId;
        return (str3 == null || (strReplace$default = l.replace$default(msg, str3, "████████", false, 4, (Object) null)) == null) ? msg : strReplace$default;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        d(f64223a, tag, null, new h(msg, args), 2, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        e(f64223a, tag, null, new j(msg, args), 2, null);
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return f64223a.c(tag);
    }

    public static /* synthetic */ void b(g gVar, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        gVar.b(str, th2, (Function0<String>) function0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64223a.d(tag, throwable, new i(msg, args));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64223a.e(tag, throwable, new k(msg, args));
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

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        b(f64223a, tag, null, new c(msg, args), 2, null);
    }

    @JvmName(name = "-v")
    public final void d(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        a(2, tag, throwable, lazyMsg);
    }

    @JvmName(name = "-w")
    public final void e(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        a(5, tag, throwable, lazyMsg);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64223a.b(tag, throwable, new d(msg, args));
    }

    public final void a(int i10) {
        logLevel = i10;
    }

    private final void a(int lvl, String tag, Throwable t10, Function0<String> lazyMsg) {
        MCLogListener mCLogListener = listener;
        if (mCLogListener == null || lvl < logLevel) {
            return;
        }
        try {
            mCLogListener.out(lvl, c(tag), b(lazyMsg.invoke()), t10);
        } catch (Exception unused) {
        }
    }

    @JvmName(name = "-e")
    public final void b(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        a(6, tag, throwable, new e(lazyMsg));
    }

    public final void a(@Nullable MCLogListener mCLogListener) {
        listener = mCLogListener;
    }

    public static /* synthetic */ void a(g gVar, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        gVar.a(str, th2, (Function0<String>) function0);
    }

    @JvmStatic
    public static final void a(@Nullable String appId2, @Nullable String accessToken2, @Nullable String senderId2) {
        appId = appId2;
        accessToken = accessToken2;
        senderId = senderId2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        a(f64223a, tag, null, new a(msg, args), 2, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64223a.a(tag, throwable, new b(msg, args));
    }

    public static /* synthetic */ void c(g gVar, String str, Throwable th2, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        gVar.c(str, th2, (Function0<String>) function0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void c(@NotNull String tag, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        c(f64223a, tag, null, new f(msg, args), 2, null);
    }

    @JvmName(name = "-d")
    public final void a(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        a(3, tag, throwable, lazyMsg);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Do not use from Kotlin")
    @JvmStatic
    public static final void c(@NotNull String tag, @NotNull Throwable throwable, @NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        f64223a.c(tag, throwable, new C0250g(msg, args));
    }

    @JvmName(name = "-i")
    public final void c(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> lazyMsg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMsg, "lazyMsg");
        a(4, tag, throwable, lazyMsg);
    }
}
