package com.bbva.dcaptureplugin.command;

import android.app.Application;
import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.filesystem.WebFile;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.dcaptureplugin.command.params.LaunchDocumentCaptureParams;
import com.bbva.dcaptureplugin.command.params.LaunchDocumentCaptureParamsValidator;
import com.bbva.dcaptureplugin.command.response.CachedCapturedDocument;
import com.bbva.dcaptureplugin.command.response.CapturedDocument;
import com.bbva.dcaptureplugin.command.response.Face;
import com.bbva.dcaptureplugin.command.response.OnDocumentCaptured;
import com.bbva.dcaptureplugin.command.response.OnTimeWithoutPhotoTaken;
import com.bbva.dcaptureplugin.di.InjectorKt;
import com.bbva.image.compressor.JpegCompressor;
import com.dasnano.vddocumentcapture.VDDocumentCapture;
import com.dasnano.vddocumentcapture.other.VDDocument;
import com.dasnano.vddocumentcapture.other.VDEnums;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k6.d;
import k6.e;
import k6.f;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchDocumentCaptureCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u0017\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0017J,\u0010\u0011\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000eH\u0017J,\u0010\u0017\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000eH\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/bbva/dcaptureplugin/command/LaunchDocumentCaptureCommand;", "Lcom/dasnano/vddocumentcapture/VDDocumentCapture$IVDDocumentCapture;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/dcaptureplugin/command/params/LaunchDocumentCaptureParams;", "Lkotlinx/coroutines/CoroutineScope;", "", "executeWithPermissionsGranted", "", "p0", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "type", "VDTimeWithoutPhotoTaken", "", "content", "", "Lcom/dasnano/vddocumentcapture/other/VDDocument;", "documents", "VDDocumentCaptured", "", "success", "VDDocumentCaptureFinished", "p1", "p2", "VDDocumentCutCaptured", "Ljava/io/ByteArrayInputStream;", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDDocumentType;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLaunchDocumentCaptureCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchDocumentCaptureCommand.kt\ncom/bbva/dcaptureplugin/command/LaunchDocumentCaptureCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1557#2:165\n1628#2,3:166\n*S KotlinDebug\n*F\n+ 1 LaunchDocumentCaptureCommand.kt\ncom/bbva/dcaptureplugin/command/LaunchDocumentCaptureCommand\n*L\n76#1:165\n76#1:166,3\n*E\n"})
public final class LaunchDocumentCaptureCommand extends PermissionCommand<LaunchDocumentCaptureParams> implements VDDocumentCapture.IVDDocumentCapture, CoroutineScope {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29015q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ArrayList f29016r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f29017s0;

    /* JADX INFO: compiled from: LaunchDocumentCaptureCommand.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VDEnums.VDCaptureType.values().length];
            try {
                iArr[VDEnums.VDCaptureType.VD_REVERSE_WITHOUT_FLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VDEnums.VDCaptureType.VD_OBVERSE_PASSPORT_WITHOUT_FLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LaunchDocumentCaptureCommand.kt */
    @DebugMetadata(c = "com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand$VDDocumentCaptured$1$1", f = "LaunchDocumentCaptureCommand.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29018p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CachedCapturedDocument f29020r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CachedCapturedDocument cachedCapturedDocument, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29020r0 = cachedCapturedDocument;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchDocumentCaptureCommand.this.new a(this.f29020r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29018p0;
            LaunchDocumentCaptureCommand launchDocumentCaptureCommand = LaunchDocumentCaptureCommand.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f29018p0 = 1;
                obj = LaunchDocumentCaptureCommand.access$asDocumentCaptured(launchDocumentCaptureCommand, this.f29020r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CapturedDocument capturedDocument = (CapturedDocument) obj;
            launchDocumentCaptureCommand.f29016r0.add(capturedDocument);
            LaunchDocumentCaptureCommand.access$sendCapturedDocument(launchDocumentCaptureCommand, capturedDocument);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LaunchDocumentCaptureCommand.kt */
    @DebugMetadata(c = "com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand", f = "LaunchDocumentCaptureCommand.kt", i = {}, l = {133}, m = "createUrl", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29021p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f29023r0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29021p0 = obj;
            this.f29023r0 |= Integer.MIN_VALUE;
            return LaunchDocumentCaptureCommand.this.b(null, this);
        }
    }

    public LaunchDocumentCaptureCommand() {
        super(LaunchDocumentCaptureParams.class, 2, "android.permission.CAMERA");
        this.f29015q0 = CoroutineScopeKt.MainScope();
        this.f29016r0 = new ArrayList();
        setValidator(new LaunchDocumentCaptureParamsValidator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit a(LaunchDocumentCaptureCommand launchDocumentCaptureCommand, DocumentCapturable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context applicationContext = launchDocumentCaptureCommand.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        it.startWithDocumentIDs(launchDocumentCaptureCommand, applicationContext, ((LaunchDocumentCaptureParams) launchDocumentCaptureCommand.mParams).getDocuments(), ((LaunchDocumentCaptureParams) launchDocumentCaptureCommand.mParams).getConfiguration());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$asDocumentCaptured(LaunchDocumentCaptureCommand launchDocumentCaptureCommand, CachedCapturedDocument cachedCapturedDocument, Continuation continuation) {
        e eVar;
        launchDocumentCaptureCommand.getClass();
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f79208s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f79208s0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(launchDocumentCaptureCommand, continuation);
            }
        } else {
            eVar = new e(launchDocumentCaptureCommand, continuation);
        }
        Object objB = eVar.f79206q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f79208s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objB);
            byte[] content = cachedCapturedDocument.getContent();
            eVar.f79205p0 = cachedCapturedDocument;
            eVar.f79208s0 = 1;
            objB = launchDocumentCaptureCommand.b(content, eVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cachedCapturedDocument = eVar.f79205p0;
            ResultKt.throwOnFailure(objB);
        }
        boolean flash = cachedCapturedDocument.getFlash();
        String strName = cachedCapturedDocument.getFace().name();
        Locale locale = Locale.ROOT;
        return new CapturedDocument((String) objB, flash, androidx.room.a.d(locale, "ROOT", strName, locale, "toLowerCase(...)"), cachedCapturedDocument.getDocumentIds());
    }

    public static final void access$sendCapturedDocument(LaunchDocumentCaptureCommand launchDocumentCaptureCommand, CapturedDocument capturedDocument) {
        launchDocumentCaptureCommand.mPostMessenger.postMessage("OnDocumentCaptured", new OnDocumentCaptured(capturedDocument));
        if (launchDocumentCaptureCommand.f29017s0) {
            launchDocumentCaptureCommand.f29017s0 = false;
            BuildersKt__Builders_commonKt.launch$default(launchDocumentCaptureCommand, null, null, new f(launchDocumentCaptureCommand, null), 3, null);
        }
    }

    @Override // com.dasnano.vddocumentcapture.VDDocumentCapture.IVDDocumentCapture
    public void VDDocumentCaptureFinished(boolean success) {
        if (success) {
            this.f29017s0 = true;
        } else {
            this.mCommandCallback.sendError(Errors.ErrorCanceled);
        }
    }

    @Override // com.dasnano.vddocumentcapture.VDDocumentCapture.IVDDocumentCapture
    @Deprecated(message = "VDDocumentCaptured(byte[] var1, VDEnums.VDCaptureType var2, List<VDDocument> var3);")
    public void VDDocumentCaptured(@Nullable ByteArrayInputStream p4, @Nullable VDEnums.VDCaptureType p10, @Nullable List<VDEnums.VDDocumentType> p11) {
    }

    @Override // com.dasnano.vddocumentcapture.VDDocumentCapture.IVDDocumentCapture
    @Deprecated(message = "VDDocumentCaptured(byte[] var1, VDEnums.VDCaptureType var2, List<VDDocument> var3);")
    public void VDDocumentCutCaptured(@Nullable ByteArrayInputStream p4, @Nullable VDEnums.VDCaptureType p10, @Nullable List<VDEnums.VDDocumentType> p11) {
    }

    @Override // com.dasnano.vddocumentcapture.VDDocumentCapture.IVDDocumentCapture
    public void VDTimeWithoutPhotoTaken(int p4, @Nullable VDEnums.VDCaptureType type) {
        String strName;
        if (type == null || (strName = type.name()) == null) {
            return;
        }
        this.mPostMessenger.postMessage("OnTimeWithoutPhotoTaken", new OnTimeWithoutPhotoTaken(p4, strName));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(byte[] bArr, Continuation<? super String> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f29023r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f29023r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objFrom = bVar.f29021p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f29023r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objFrom);
            WebFile.Companion companion = WebFile.INSTANCE;
            Application mApplication = this.mApplication;
            Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            bVar.f29023r0 = 1;
            objFrom = companion.from(mApplication, byteArrayInputStream, JpegCompressor.ID, bVar);
            if (objFrom == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFrom);
        }
        WebFile webFile = (WebFile) objFrom;
        return String.valueOf(webFile != null ? webFile.getUrl() : null);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        CommandCallback mCommandCallback = this.mCommandCallback;
        Intrinsics.checkNotNullExpressionValue(mCommandCallback, "mCommandCallback");
        InjectorKt.withDocumentCapture(mCommandCallback, new d(this, 0));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29015q0.getCoroutineContext();
    }

    @Override // com.dasnano.vddocumentcapture.VDDocumentCapture.IVDDocumentCapture
    public void VDDocumentCaptured(@NotNull byte[] content, @NotNull VDEnums.VDCaptureType type, @NotNull List<VDDocument> documents) {
        CachedCapturedDocument cachedCapturedDocument;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(documents, "documents");
        List<VDDocument> list = documents;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((VDDocument) it.next()).getID());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            cachedCapturedDocument = new CachedCapturedDocument(content, false, Face.BACK, arrayList);
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cachedCapturedDocument = new CachedCapturedDocument(content, false, Face.FRONT, arrayList);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(cachedCapturedDocument, null), 3, null);
    }

    @Override // com.dasnano.vddocumentcapture.VDDocumentCapture.IVDDocumentCapture
    @Deprecated(message = "VDDocumentCaptured(byte[] var1, VDEnums.VDCaptureType var2, List<VDDocument> var3);")
    public void VDDocumentCutCaptured(@Nullable byte[] p4, @Nullable VDEnums.VDCaptureType p10, @Nullable List<VDDocument> p11) {
    }
}
