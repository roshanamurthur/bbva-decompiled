package com.bbva.ethermobilesdk.passchecker.network;

import android.content.Context;
import bk.p;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.passchecker.logger.PassCheckerLoggerKt;
import com.bbva.ethermobilesdk.passchecker.model.internal.EmptyResponseException;
import com.bbva.ethermobilesdk.passchecker.model.internal.HaveBeenPwnedItem;
import com.bbva.ethermobilesdk.passchecker.util.HashKt;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.impl.OkHttpNetworkWorker;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HaveBeenPwned.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "context", "", "password", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "", "timeoutRequest", "Lcom/bbva/ethermobile/help/kit/result/Result;", "haveBeenPwned", "(Landroid/content/Context;Ljava/lang/String;Lcom/bbva/network/NetworkWorker;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "passchecker_release"}, k = 2, mv = {1, 8, 0})
public final class HaveBeenPwnedKt {

    /* JADX INFO: compiled from: HaveBeenPwned.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.passchecker.network.HaveBeenPwnedKt$haveBeenPwned$2", f = "HaveBeenPwned.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHaveBeenPwned.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HaveBeenPwned.kt\ncom/bbva/ethermobilesdk/passchecker/network/HaveBeenPwnedKt$haveBeenPwned$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1620#2,3:76\n766#2:79\n857#2,2:80\n*S KotlinDebug\n*F\n+ 1 HaveBeenPwned.kt\ncom/bbva/ethermobilesdk/passchecker/network/HaveBeenPwnedKt$haveBeenPwned$2\n*L\n47#1:76,3\n52#1:79\n52#1:80,2\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<Integer>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29899p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f29900q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ NetworkWorker f29901r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Context f29902s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f29903t0;

        /* JADX INFO: renamed from: com.bbva.ethermobilesdk.passchecker.network.HaveBeenPwnedKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HaveBeenPwned.kt */
        public static final class C0126a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f29904p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f29905q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0126a(String str, int i10) {
                super(1);
                this.f29904p0 = str;
                this.f29905q0 = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
                MutableNetworkRequest request = mutableNetworkRequest;
                Intrinsics.checkNotNullParameter(request, "$this$request");
                StringBuilder sb2 = new StringBuilder();
                byte[] bArrBase64ToByteArray = EncodingUtilsKt.base64ToByteArray("aHR0cHM6Ly9hcGkucHduZWRwYXNzd29yZHMuY29tL3JhbmdlLw==");
                Charset charset = Charsets.UTF_8;
                sb2.append(new String(bArrBase64ToByteArray, charset));
                String strSubstring = this.f29904p0.substring(0, 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                request.setUrl(sb2.toString());
                request.setMethod(Method.GET);
                request.setHeaders(p.mapOf(TuplesKt.to(new String(EncodingUtilsKt.base64ToByteArray("QWRkLVBhZGRpbmc="), charset), "true")));
                request.setTimeout(Integer.valueOf(this.f29905q0));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, NetworkWorker networkWorker, int i10, Continuation continuation) {
            super(2, continuation);
            this.f29900q0 = str;
            this.f29901r0 = networkWorker;
            this.f29902s0 = context;
            this.f29903t0 = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f29902s0, this.f29900q0, this.f29901r0, this.f29903t0, continuation);
            aVar.f29899p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Integer>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f29899p0;
            String str = this.f29900q0;
            Context context = this.f29902s0;
            int i10 = this.f29903t0;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                String hex$default = EncodingUtilsKt.toHex$default((byte[]) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(HashKt.shaOf(l.encodeToByteArray(str))), null, 1, null);
                NetworkWorker okHttpNetworkWorker = this.f29901r0;
                if (okHttpNetworkWorker == null) {
                    okHttpNetworkWorker = new OkHttpNetworkWorker(context, null, null, null, null, 30, null);
                }
                String strString = okHttpNetworkWorker.execute(MutableNetworkRequestKt.request(new C0126a(hex$default, i10))).getBody().string();
                if (strString == null) {
                    throw new EmptyResponseException("Unexpected service response (empty body)");
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = StringsKt__StringsKt.lines(strString).iterator();
                while (it.hasNext()) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER}, false, 0, 6, (Object) null);
                    arrayList.add(new HaveBeenPwnedItem((String) listSplit$default.get(0), Integer.parseInt((String) listSplit$default.get(1))));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    HaveBeenPwnedItem haveBeenPwnedItem = (HaveBeenPwnedItem) obj2;
                    String partialHash = haveBeenPwnedItem.getPartialHash();
                    String strSubstring = hex$default.substring(5, hex$default.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (Intrinsics.areEqual(partialHash, strSubstring) && haveBeenPwnedItem.getTimes() != 0) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2.isEmpty() ? new Result.Success(Boxing.boxInt(0)) : new Result.Success(Boxing.boxInt(((HaveBeenPwnedItem) CollectionsKt___CollectionsKt.first((List) arrayList2)).getTimes()));
            } catch (Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                Object objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
                Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl == null) {
                    return objM5535constructorimpl;
                }
                PassCheckerLoggerKt.logPassCheckerError(EtherLogger.INSTANCE, thM5538exceptionOrNullimpl, coroutineScope.getClass());
                return new Result.Error(thM5538exceptionOrNullimpl);
            }
        }
    }

    @Nullable
    public static final Object haveBeenPwned(@NotNull Context context, @NotNull String str, @Nullable NetworkWorker networkWorker, int i10, @NotNull Continuation<? super Result<Integer>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(context, str, networkWorker, i10, null), continuation);
    }

    public static /* synthetic */ Object haveBeenPwned$default(Context context, String str, NetworkWorker networkWorker, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            networkWorker = null;
        }
        return haveBeenPwned(context, str, networkWorker, i10, continuation);
    }
}
