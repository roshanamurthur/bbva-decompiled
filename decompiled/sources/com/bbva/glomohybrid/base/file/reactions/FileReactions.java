package com.bbva.glomohybrid.base.file.reactions;

import android.app.Activity;
import androidx.camera.core.imagecapture.a;
import androidx.collection.h;
import bk.q;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.actionlauncher.ActionLauncherComponent;
import com.bbva.component.dm.actionlauncher.model.Action;
import com.bbva.component.dm.filefetcher.data.model.FileFetchErrorResponse;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.FileResponse;
import com.bbva.component.dm.filefetcher.datamanager.FileFetcherDataManager;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.R;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.bbva.glomohybrid.base.file.channels.FileInteractionChannels;
import com.bbva.glomohybrid.base.file.common.FileExporter;
import com.bbva.glomohybrid.base.file.infrastructure.FileActions;
import com.bbva.glomohybrid.base.file.infrastructure.resolver.FileNameResolver;
import com.bbva.glomohybrid.base.file.receipts.ReceiptsStore;
import com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import com.bbva.network.NetworkWorker;
import j4.b;
import java.util.Iterator;
import java.util.Map;
import k4.d;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import w4.j;
import w4.l;
import w4.n;
import w4.s;

/* JADX INFO: compiled from: FileReactions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/base/file/reactions/FileReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "Lorg/koin/core/component/KoinComponent;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "externalComponentId", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFileReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReactions.kt\ncom/bbva/glomohybrid/base/file/reactions/FileReactions\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,269:1\n56#2,6:270\n56#2,6:276\n56#2,6:282\n1855#3,2:288\n34#4,7:290\n25#4,8:297\n25#4,8:305\n25#4,8:313\n34#4,7:321\n25#4,8:328\n25#4,8:336\n25#4,8:344\n25#4,8:352\n25#4,8:360\n*S KotlinDebug\n*F\n+ 1 FileReactions.kt\ncom/bbva/glomohybrid/base/file/reactions/FileReactions\n*L\n41#1:270,6\n43#1:276,6\n45#1:282,6\n103#1:288,2\n202#1:290,7\n208#1:297,8\n213#1:305,8\n218#1:313,8\n228#1:321,7\n235#1:328,8\n241#1:336,8\n246#1:344,8\n251#1:352,8\n256#1:360,8\n*E\n"})
public final class FileReactions implements PageReactionDelegator, KoinComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f31350p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Activity f31351q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final String f31352r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f31353s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f31354t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f31355u0;

    /* JADX WARN: Multi-variable type inference failed */
    public FileReactions(@NotNull BaseReaction baseReaction, @NotNull Activity activity, @NotNull String externalComponentId) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(externalComponentId, "externalComponentId");
        this.f31350p0 = baseReaction;
        this.f31351q0 = activity;
        this.f31352r0 = externalComponentId;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f31353s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ReceiptsStore>() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.file.receipts.ReceiptsStore, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ReceiptsStore invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ReceiptsStore.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f31354t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<FileExporter>() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.file.common.FileExporter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FileExporter invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FileExporter.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f31355u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<FileNameResolver>() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.file.infrastructure.resolver.FileNameResolver, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FileNameResolver invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FileNameResolver.class), objArr4, objArr5);
            }
        });
    }

    public static final FileNameResolver access$getFileNameResolver(FileReactions fileReactions) {
        return (FileNameResolver) fileReactions.f31355u0.getValue();
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        NetworkWorker networkWorker = (NetworkWorker) ComponentManager.get(NetworkWorker.class.getName());
        Intrinsics.checkNotNull(networkWorker);
        FileFetcherDataManager fileFetcherDataManager = new FileFetcherDataManager(networkWorker, this.f31351q0, null, 4, null);
        BaseReaction baseReaction = this.f31350p0;
        baseReaction.addComponent(FileFetcherDataManager.ID, fileFetcherDataManager);
        baseReaction.addComponent(FileManagerComponent.ID, new FileManagerComponent((FileExporter) this.f31354t0.getValue(), (ReceiptsStore) this.f31353s0.getValue(), (FileNameResolver) this.f31355u0.getValue()));
        FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf = baseReaction.reactTo(fileInteractionChannels.getFileChannel()).then().onlyIf(new b(1));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf, "onlyIf(...)");
        reactionBuilderOnlyIf.inside(TermsDataManager.INSTANCE.getID(), TermsDataManager.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$getTermsUrl$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, FileInteraction fileInteraction) {
                Intrinsics.checkNotNull(p4);
                FileInteraction fileInteraction2 = fileInteraction;
                Intrinsics.checkNotNull(fileInteraction2, "null cannot be cast to non-null type com.bbva.glomohybrid.base.file.channels.FileInteraction.TermsAndConditions");
                ((TermsDataManager) p4).getTerms(((FileInteraction.TermsAndConditions) fileInteraction2).getName());
            }
        });
        baseReaction.reactTo(fileInteractionChannels.getFileChannel()).then().onlyIf(new j(2)).inside(FileManagerComponent.ID, FileManagerComponent.class).doReactionAndCleanChannel(new c8.a(this, 0));
        baseReaction.reactTo(fileInteractionChannels.getFileChannel()).then().onlyIf(new d(3)).inside(FileManagerComponent.ID, FileManagerComponent.class).doReactionAndCleanChannel(new l(1));
        baseReaction.reactTo(fileInteractionChannels.getFileChannel()).then().onlyIf(new z0.a(4)).inside(FileManagerComponent.ID, FileManagerComponent.class).doReactionAndCleanChannel(new n(1));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(fileInteractionChannels.getMonthlyStatementChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        final FileActions fileActions = FileActions.Monthly;
        reactionBuilderThen.inside(FileManagerComponent.ID, FileManagerComponent.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$downloadFile$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Result<? extends String> result) {
                Intrinsics.checkNotNull(p4);
                Object f79387p0 = result.getF79387p0();
                FileManagerComponent fileManagerComponent = (FileManagerComponent) p4;
                if (Result.m5540isFailureimpl(f79387p0)) {
                    f79387p0 = null;
                }
                fileManagerComponent.downloadFile(fileActions, (String) f79387p0);
            }
        });
        Iterator<T> it = fileInteractionChannels.getReceiptChannels().iterator();
        while (it.hasNext()) {
            baseReaction.reactTo((Channel) it.next()).then().inside(FileManagerComponent.ID, FileManagerComponent.class).doReactionAndCleanChannel(new s(1));
        }
        FileInteractionChannels fileInteractionChannels2 = FileInteractionChannels.INSTANCE;
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen = baseReaction.writeOn(fileInteractionChannels2.getHideLoadingChannel()).when(ActionLauncherComponent.ID);
        ActionSpec<Action> actionSpec = ActionLauncherComponent.ACTION_LAUNCH_SUCCESS;
        writableActionBuilderWhen.doAction(actionSpec);
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen2 = baseReaction.writeOn(fileInteractionChannels2.getHideLoadingChannel()).when(ActionLauncherComponent.ID);
        ActionSpec<Action> actionSpec2 = ActionLauncherComponent.ACTION_LAUNCH_ERROR;
        writableActionBuilderWhen2.doAction(actionSpec2);
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen3 = baseReaction.writeOn(fileInteractionChannels2.getTermsResultChannel()).when(FileManagerComponent.ID);
        final FileActions fileActions2 = FileActions.Terms;
        writableActionBuilderWhen3.doAction(fileActions2.getResultAction());
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen4 = baseReaction.writeOn(fileInteractionChannels2.getMonthlyResultChannel()).when(FileManagerComponent.ID);
        FileActions fileActions3 = FileActions.Monthly;
        writableActionBuilderWhen4.doAction(fileActions3.getResultAction());
        baseReaction.writeOn(fileInteractionChannels2.getGenericPdfResultChannel()).when(FileManagerComponent.ID).doAction(FileActions.PdfDocument.getResultAction());
        baseReaction.writeOn(fileInteractionChannels2.getMonthlyStatementSuccessChannel()).when(FileManagerComponent.ID).doAction(fileActions3.getSuccessAction());
        baseReaction.writeOn(fileInteractionChannels2.getMonthlyStatementErrorChannel()).when(FileManagerComponent.ID).doAction(fileActions3.getErrorAction());
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = baseReaction.whenever(FileManagerComponent.ID);
        ActionConstants actionConstants = ActionConstants.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = plainActionBuilderWhenever.doAction(actionConstants.getACTION_FETCH_MONTHLY_STATEMENT$Base_release()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2.inside(FileFetcherDataManager.ID, FileFetcherDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$fetchMonthlyStatement$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                String str2 = str;
                FileNameResolver fileNameResolverAccess$getFileNameResolver = FileReactions.access$getFileNameResolver(this.f31357p0);
                FileActions fileActions4 = FileActions.Monthly;
                ((FileFetcherDataManager) p4).fetchFile(FileActions.toFileRequest$default(fileActions4, str2, fileNameResolverAccess$getFileNameResolver.getName(fileActions4), null, 4, null));
            }
        }), "doReaction(...)");
        TermsDataManager.Companion companion = TermsDataManager.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = baseReaction.whenever(companion.getID()).doAction(TermsDataManager.ACTION_URL_SUCCESS).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        reactionBuilderThen3.inside(FileManagerComponent.ID, FileManagerComponent.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$downloadFile$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Result<? extends String> result) {
                Intrinsics.checkNotNull(p4);
                Object f79387p0 = result.getF79387p0();
                FileManagerComponent fileManagerComponent = (FileManagerComponent) p4;
                if (Result.m5540isFailureimpl(f79387p0)) {
                    f79387p0 = null;
                }
                fileManagerComponent.downloadFile(fileActions2, (String) f79387p0);
            }
        });
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever2 = baseReaction.whenever(FileManagerComponent.ID);
        FileManagerComponent.Companion companion2 = FileManagerComponent.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = plainActionBuilderWhenever2.doAction(companion2.getACTION_DOWNLOAD_FILE()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4.inside(FileFetcherDataManager.ID, FileFetcherDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$downloadFileWithRequest$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, FileRequest fileRequest) {
                Intrinsics.checkNotNull(p4);
                ((FileFetcherDataManager) p4).fetchFile(fileRequest);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen5 = baseReaction.whenever(FileFetcherDataManager.ID).doAction(FileFetcherDataManager.ON_FETCH_SUCCESS).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5.inside(FileManagerComponent.ID, FileManagerComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$handleDownloadedFile$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, FileResponse fileResponse) {
                Intrinsics.checkNotNull(p4);
                ((FileManagerComponent) p4).downloadedFile(fileResponse);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen6 = baseReaction.whenever(FileFetcherDataManager.ID).doAction(FileFetcherDataManager.ON_FETCH_ERROR).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen6.inside(FileManagerComponent.ID, FileManagerComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$handleDownloadFileError$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, FileFetchErrorResponse fileFetchErrorResponse) {
                Intrinsics.checkNotNull(p4);
                ((FileManagerComponent) p4).errorDownloadingFile(fileFetchErrorResponse);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        andReactionBuilderDoReaction.and().inside(FileManagerComponent.ID, FileManagerComponent.class).doReactionAndCleanChannel(new c8.b(0));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen7 = baseReaction.whenever(FileManagerComponent.ID).doAction(companion2.getACTION_OPEN_FILE()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7.inside(ActionLauncherComponent.ID, ActionLauncherComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$openFileWithExternalApplication$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Map<String, ? extends Object> map) {
                Intrinsics.checkNotNull(p4);
                ((ActionLauncherComponent) p4).launch(this.f31358p0.f31351q0, map);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen8 = baseReaction.whenever(ActionLauncherComponent.ID).doAction(actionSpec).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen8, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen8.inside(FileManagerComponent.ID, FileManagerComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$sendFileOpened$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Action action) {
                Intrinsics.checkNotNull(p4);
                ((FileManagerComponent) p4).fileOpened(action.getActionId());
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen9 = baseReaction.whenever(ActionLauncherComponent.ID).doAction(actionSpec2).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen9, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen9.inside(FileManagerComponent.ID, FileManagerComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$sendOpeningFileError$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Action action) {
                Intrinsics.checkNotNull(p4);
                Action action2 = action;
                FileManagerComponent fileManagerComponent = (FileManagerComponent) p4;
                if (FileActions.INSTANCE.of(action2.getActionId()) != null) {
                    String actionId = action2.getActionId();
                    String string = this.f31360p0.f31351q0.getString(R.string.pdf_application_not_available);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    fileManagerComponent.cannotOpenFile(actionId, string);
                }
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen10 = baseReaction.whenever(FileManagerComponent.ID).doAction(actionConstants.getACTION_SHARE_RECEIPT$Base_release()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen10, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen10.inside(ActionLauncherComponent.ID, ActionLauncherComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$openReceipt$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                FileReactions fileReactions = this.f31359p0;
                ((ActionLauncherComponent) p4).launch(fileReactions.f31351q0, q.mapOf(TuplesKt.to("type", Action.TYPE_SHARE_FILE), TuplesKt.to("value", q.mapOf(TuplesKt.to("title", fileReactions.f31351q0.getString(R.string.share_via)), TuplesKt.to("uri", str), TuplesKt.to("mime", "image/png"), TuplesKt.to("flags", 1)))));
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf2 = baseReaction.whenever(this.f31352r0).doAction(companion2.getACTION_NATIVE_DOWNLOAD_FILE()).then().onlyIf(new h());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf2, "onlyIf(...)");
        reactionBuilderOnlyIf2.inside(companion.getID(), TermsDataManager.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.file.reactions.FileReactions$getTermsUrl$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, FileInteraction fileInteraction) {
                Intrinsics.checkNotNull(p4);
                FileInteraction fileInteraction2 = fileInteraction;
                Intrinsics.checkNotNull(fileInteraction2, "null cannot be cast to non-null type com.bbva.glomohybrid.base.file.channels.FileInteraction.TermsAndConditions");
                ((TermsDataManager) p4).getTerms(((FileInteraction.TermsAndConditions) fileInteraction2).getName());
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
