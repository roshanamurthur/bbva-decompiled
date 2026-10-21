package com.bbva.glomohybrid.base.file.channels;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.component.dm.actionlauncher.model.Action;
import com.bbva.glomohybrid.base.file.receipts.model.Receipt;
import com.bbva.glomoutils.Either;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileInteractionChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Should be migrated to OpenDocument plugin")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bL\u0010\u000bJ\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003R'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR5\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0007\u0012\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0011\u0010\tR5\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u0012\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\tR5\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0007\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0019\u0010\tR0\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001c0\u00038FX\u0087\u0084\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001d\u0010\u0007\u0012\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001e\u0010\tR'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0007\u0012\u0004\b#\u0010\u000b\u001a\u0004\b\"\u0010\tR'\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0007\u0012\u0004\b'\u0010\u000b\u001a\u0004\b&\u0010\tR'\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0007\u0012\u0004\b,\u0010\u000b\u001a\u0004\b+\u0010\tR'\u00101\u001a\b\u0012\u0004\u0012\u00020)0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0007\u0012\u0004\b0\u0010\u000b\u001a\u0004\b/\u0010\tR'\u00105\u001a\b\u0012\u0004\u0012\u00020)0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0007\u0012\u0004\b4\u0010\u000b\u001a\u0004\b3\u0010\tR'\u00109\u001a\b\u0012\u0004\u0012\u00020)0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0007\u0012\u0004\b8\u0010\u000b\u001a\u0004\b7\u0010\tR'\u0010=\u001a\b\u0012\u0004\u0012\u00020)0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0007\u0012\u0004\b<\u0010\u000b\u001a\u0004\b;\u0010\tR'\u0010A\u001a\b\u0012\u0004\u0012\u00020)0\u00038FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0007\u0012\u0004\b@\u0010\u000b\u001a\u0004\b?\u0010\tR!\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0007\u001a\u0004\bD\u0010\tR\u001b\u0010I\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00030F8F¢\u0006\u0006\u001a\u0004\bJ\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/bbva/glomohybrid/base/file/channels/FileInteractionChannels;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cellscore/channel/model/Channel;", "autoClean", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "a", "Lkotlin/Lazy;", "getFileChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "getFileChannel$annotations", "()V", "fileChannel", "Lcom/bbva/glomoutils/Either;", "", "", "b", "getTermsResultChannel", "getTermsResultChannel$annotations", "termsResultChannel", "c", "getMonthlyResultChannel", "getMonthlyResultChannel$annotations", "monthlyResultChannel", "d", "getGenericPdfResultChannel", "getGenericPdfResultChannel$annotations", "genericPdfResultChannel", "Lkotlin/Result;", "e", "getMonthlyStatementChannel", "getMonthlyStatementChannel$annotations", "monthlyStatementChannel", "f", "getMonthlyStatementSuccessChannel", "getMonthlyStatementSuccessChannel$annotations", "monthlyStatementSuccessChannel", "g", "getMonthlyStatementErrorChannel", "getMonthlyStatementErrorChannel$annotations", "monthlyStatementErrorChannel", "Lcom/bbva/glomohybrid/base/file/receipts/model/Receipt;", "h", "getTransferChannel", "getTransferChannel$annotations", "transferChannel", "i", "getCreditCardPaymentChannel", "getCreditCardPaymentChannel$annotations", "creditCardPaymentChannel", "j", "getCardlessWithdrawalChannel", "getCardlessWithdrawalChannel$annotations", "cardlessWithdrawalChannel", "k", "getPrepaidCardTopUpChannel", "getPrepaidCardTopUpChannel$annotations", "prepaidCardTopUpChannel", "l", "getMobileTopUpChannel", "getMobileTopUpChannel$annotations", "mobileTopUpChannel", "m", "getWalletTransferChannel", "getWalletTransferChannel$annotations", "walletTransferChannel", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "n", "getHideLoadingChannel", "hideLoadingChannel", "", "getChannels", "()Ljava/util/List;", NavigationOperations.UPDATE, "getReceiptChannels", "receiptChannels", "<init>", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFileInteractionChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileInteractionChannels.kt\ncom/bbva/glomohybrid/base/file/channels/FileInteractionChannels\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
public final class FileInteractionChannels {

    @NotNull
    public static final FileInteractionChannels INSTANCE = new FileInteractionChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy fileChannel = LazyKt__LazyJVMKt.lazy(c.f31334p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy termsResultChannel = LazyKt__LazyJVMKt.lazy(l.f31343p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy monthlyResultChannel = LazyKt__LazyJVMKt.lazy(g.f31338p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy genericPdfResultChannel = LazyKt__LazyJVMKt.lazy(d.f31335p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy monthlyStatementChannel = LazyKt__LazyJVMKt.lazy(h.f31339p0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy monthlyStatementSuccessChannel = LazyKt__LazyJVMKt.lazy(j.f31341p0);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy monthlyStatementErrorChannel = LazyKt__LazyJVMKt.lazy(i.f31340p0);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy transferChannel = LazyKt__LazyJVMKt.lazy(m.f31344p0);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy creditCardPaymentChannel = LazyKt__LazyJVMKt.lazy(b.f31333p0);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy cardlessWithdrawalChannel = LazyKt__LazyJVMKt.lazy(a.f31332p0);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy prepaidCardTopUpChannel = LazyKt__LazyJVMKt.lazy(k.f31342p0);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy mobileTopUpChannel = LazyKt__LazyJVMKt.lazy(f.f31337p0);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Lazy walletTransferChannel = LazyKt__LazyJVMKt.lazy(n.f31345p0);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy hideLoadingChannel = LazyKt__LazyJVMKt.lazy(e.f31336p0);

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class a extends Lambda implements Function0<Channel<Receipt>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31332p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Receipt> invoke() {
            return FileInteractionChannels.access$receiptChannelOf(FileInteractionChannels.INSTANCE, "send_cardless_withdrawal_operative_receipt", "receipt_cardless_withdrawal");
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class b extends Lambda implements Function0<Channel<Receipt>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31333p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Receipt> invoke() {
            return FileInteractionChannels.access$receiptChannelOf(FileInteractionChannels.INSTANCE, "send_credit_card_payment_operative_receipt", "receipt_card_payment");
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class c extends Lambda implements Function0<Channel<FileInteraction>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f31334p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<FileInteraction> invoke() {
            FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
            WebChannel webChannelCreate = new WebChannel.Builder("mobile_manage_operation").toNativeObject(new androidx.databinding.f()).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return fileInteractionChannels.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class d extends Lambda implements Function0<Channel<Either<? extends String, ? extends Boolean>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f31335p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Either<? extends String, ? extends Boolean>> invoke() {
            FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
            WebChannel webChannelCreate = new WebChannel.Builder("mobile_manage_operation_pdf_result").toWebObject(new v7.a(1)).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return fileInteractionChannels.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class e extends Lambda implements Function0<Channel<Action>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f31336p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Action> invoke() {
            FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
            WebChannel webChannelCreate = new WebChannel.Builder("global_hide_loading_channel").create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return fileInteractionChannels.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class f extends Lambda implements Function0<Channel<Receipt>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f31337p0 = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Receipt> invoke() {
            return FileInteractionChannels.access$receiptChannelOf(FileInteractionChannels.INSTANCE, "send_mobile_top_up_operative_receipt", "receipt_mobile_top_up");
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class g extends Lambda implements Function0<Channel<Either<? extends String, ? extends Boolean>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f31338p0 = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Either<? extends String, ? extends Boolean>> invoke() {
            FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
            WebChannel webChannelCreate = new WebChannel.Builder("mobile_manage_operation_monthly_result").toWebObject(new w4.a(3)).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return fileInteractionChannels.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class h extends Lambda implements Function0<Channel<Result<? extends String>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f31339p0 = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Result<? extends String>> invoke() {
            FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
            WebChannel webChannelCreate = new WebChannel.Builder("global_monthly_statement_send_params").toNativeObject(new w4.b(2)).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return fileInteractionChannels.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class i extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f31340p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return androidx.databinding.f.d("global_monthly_statement_download_pdf_error");
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class j extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f31341p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return androidx.databinding.f.d("global_monthly_statement_download_pdf_success");
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class k extends Lambda implements Function0<Channel<Receipt>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f31342p0 = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Receipt> invoke() {
            return FileInteractionChannels.access$receiptChannelOf(FileInteractionChannels.INSTANCE, "send_prepaid_card_top_up_operative_receipt", "receipt_prepaid_card_top_up");
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class l extends Lambda implements Function0<Channel<Either<? extends String, ? extends Boolean>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f31343p0 = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Either<? extends String, ? extends Boolean>> invoke() {
            FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
            WebChannel webChannelCreate = new WebChannel.Builder("mobile_manage_operation_terms_conditions_result").toWebObject(new i8.d(3)).create();
            Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
            return fileInteractionChannels.autoClean(webChannelCreate);
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class m extends Lambda implements Function0<Channel<Receipt>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f31344p0 = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Receipt> invoke() {
            return FileInteractionChannels.access$receiptChannelOf(FileInteractionChannels.INSTANCE, "send_transfer_operative_receipt", "receipt_transfer");
        }
    }

    /* JADX INFO: compiled from: FileInteractionChannels.kt */
    public static final class n extends Lambda implements Function0<Channel<Receipt>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f31345p0 = new n(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Receipt> invoke() {
            return FileInteractionChannels.access$receiptChannelOf(FileInteractionChannels.INSTANCE, "send_mobile_phone_wallet_transfer_operative_receipt", "receipt_wallet_transfer");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final FileInteraction access$convertToOperation(FileInteractionChannels fileInteractionChannels, Bundle bundle) {
        fileInteractionChannels.getClass();
        String string = bundle.getString("id", "");
        if (string != null) {
            switch (string.hashCode()) {
                case -2073004062:
                    if (string.equals("monthlyStatement")) {
                        return FileInteractionsKt.toMonthlyOperation(bundle);
                    }
                    break;
                case 184905850:
                    if (string.equals("pdfDownloadAndShow")) {
                        return FileInteractionsKt.toGenericPdfOperation(bundle);
                    }
                    break;
                case 664072537:
                    if (string.equals("shareReceipt")) {
                        return FileInteractionsKt.toReceiptOperation(bundle);
                    }
                    break;
                case 1466385832:
                    if (string.equals("termsAndConditions")) {
                        return FileInteractionsKt.toTermsAndConditionsOperation(bundle);
                    }
                    break;
            }
        }
        return new FileInteraction.Unrecognized(null, 1, null);
    }

    public static final Channel access$receiptChannelOf(FileInteractionChannels fileInteractionChannels, String str, String str2) {
        fileInteractionChannels.getClass();
        WebChannel webChannelCreate = new WebChannel.Builder(str).toNativeObject(new a8.a(str2)).create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
        return fileInteractionChannels.autoClean(webChannelCreate);
    }

    @NotNull
    public final <T> Channel<T> autoClean(@NotNull Channel<T> channel) {
        Intrinsics.checkNotNullParameter(channel, "<this>");
        channel.setAutoClean(true);
        return channel;
    }

    @NotNull
    public final Channel<Receipt> getCardlessWithdrawalChannel() {
        return (Channel) cardlessWithdrawalChannel.getValue();
    }

    @NotNull
    public final List<Channel<?>> getChannels() {
        return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsKt.listOf((Object[]) new Channel[]{getFileChannel(), getTermsResultChannel(), getMonthlyResultChannel(), getMonthlyStatementChannel(), getMonthlyStatementSuccessChannel(), getMonthlyStatementErrorChannel()}), (Iterable) getReceiptChannels());
    }

    @NotNull
    public final Channel<Receipt> getCreditCardPaymentChannel() {
        return (Channel) creditCardPaymentChannel.getValue();
    }

    @NotNull
    public final Channel<FileInteraction> getFileChannel() {
        return (Channel) fileChannel.getValue();
    }

    @NotNull
    public final Channel<Either<String, Boolean>> getGenericPdfResultChannel() {
        return (Channel) genericPdfResultChannel.getValue();
    }

    @NotNull
    public final Channel<Action> getHideLoadingChannel() {
        return (Channel) hideLoadingChannel.getValue();
    }

    @NotNull
    public final Channel<Receipt> getMobileTopUpChannel() {
        return (Channel) mobileTopUpChannel.getValue();
    }

    @NotNull
    public final Channel<Either<String, Boolean>> getMonthlyResultChannel() {
        return (Channel) monthlyResultChannel.getValue();
    }

    @NotNull
    public final Channel<Result<String>> getMonthlyStatementChannel() {
        return (Channel) monthlyStatementChannel.getValue();
    }

    @NotNull
    public final Channel<String> getMonthlyStatementErrorChannel() {
        Object value = monthlyStatementErrorChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getMonthlyStatementSuccessChannel() {
        Object value = monthlyStatementSuccessChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Receipt> getPrepaidCardTopUpChannel() {
        return (Channel) prepaidCardTopUpChannel.getValue();
    }

    @NotNull
    public final List<Channel<Receipt>> getReceiptChannels() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Channel[]{getTransferChannel(), getCreditCardPaymentChannel(), getCardlessWithdrawalChannel(), getPrepaidCardTopUpChannel(), getMobileTopUpChannel(), getWalletTransferChannel()});
    }

    @NotNull
    public final Channel<Either<String, Boolean>> getTermsResultChannel() {
        return (Channel) termsResultChannel.getValue();
    }

    @NotNull
    public final Channel<Receipt> getTransferChannel() {
        return (Channel) transferChannel.getValue();
    }

    @NotNull
    public final Channel<Receipt> getWalletTransferChannel() {
        return (Channel) walletTransferChannel.getValue();
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getCardlessWithdrawalChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getCreditCardPaymentChannel$annotations() {
    }

    @Deprecated(message = "Should be migrated to OpenDocument plugin")
    public static /* synthetic */ void getFileChannel$annotations() {
    }

    @Deprecated(message = "Should be migrated to OpenDocument plugin")
    public static /* synthetic */ void getGenericPdfResultChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getMobileTopUpChannel$annotations() {
    }

    @Deprecated(message = "Should be migrated to OpenDocument plugin")
    public static /* synthetic */ void getMonthlyResultChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getMonthlyStatementChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getMonthlyStatementErrorChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getMonthlyStatementSuccessChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getPrepaidCardTopUpChannel$annotations() {
    }

    @Deprecated(message = "Should be migrated to OpenDocument plugin")
    public static /* synthetic */ void getTermsResultChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getTransferChannel$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getWalletTransferChannel$annotations() {
    }
}
