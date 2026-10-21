package com.bbva.glomohybrid.base.cells;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.Reactor;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsReactor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\b\u001a\\\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u000bj\b\u0012\u0004\u0012\u0002H\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0014\b\u0004\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u0013H\u0086\bø\u0001\u0000\u001aL\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u000bj\b\u0012\u0004\u0012\u0002H\u0002`\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0013H\u0086\bø\u0001\u0000\u001ag\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0019\u0018\u0001*\u00020\u001a*\u0012\u0012\u0004\u0012\u0002H\u00020\u000bj\b\u0012\u0004\u0012\u0002H\u0002`\f2\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001f\b\u0004\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000\u001ae\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0019\u0018\u0001*\u00020\u001a*\u0012\u0012\u0004\u0012\u0002H\u00020\u000bj\b\u0012\u0004\u0012\u0002H\u0002`\f2\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001f\b\u0004\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000\u001am\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0019\u0018\u0001*\u00020\u001a*\u0012\u0012\u0004\u0012\u0002H\u00020\u000bj\b\u0012\u0004\u0012\u0002H\u0002`\f2\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001f\b\u0004\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000\u001ak\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0019\u0018\u0001*\u00020\u001a*\u0012\u0012\u0004\u0012\u0002H\u00020\u000bj\b\u0012\u0004\u0012\u0002H\u0002`\f2\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001f\b\u0004\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000*\u001c\u0010 \u001a\u0004\b\u0000\u0010\u0002\"\b\u0012\u0004\u0012\u0002H\u00020\u000b2\b\u0012\u0004\u0012\u0002H\u00020\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"fire", "", ExifInterface.GPS_DIRECTION_TRUE, "componentId", "", "action", "Lcom/bbva/cells/component/kit/model/ActionSpec;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "(Ljava/lang/String;Lcom/bbva/cells/component/kit/model/ActionSpec;Ljava/lang/Object;)V", LogKeysKt.LOG, "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$AndReactionBuilder;", "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$ReactionBuilder;", "Lcom/bbva/glomohybrid/base/cells/Reaction;", "level", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleParam", "Lkotlin/Function1;", "react", "delay", "", "reaction", "reactAndClean", "P", "", "id", "", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "reactIn", "Reaction", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "CellsReactor")
@SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,83:1\n25#1,8:84\n*S KotlinDebug\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n71#1:84,8\n*E\n"})
public final class CellsReactor {

    /* JADX INFO: compiled from: CellsReactor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerLevel.values().length];
            try {
                iArr[LoggerLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggerLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggerLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggerLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoggerLevel.WTF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoggerLevel.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bbva.glomohybrid.base.cells.CellsReactor$react$1, reason: invalid class name */
    /* JADX INFO: compiled from: CellsReactor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous parameter 0>", "Lcom/bbva/glomohybrid/base/router/Router;", "kotlin.jvm.PlatformType", "params", "execute", "(Lcom/bbva/glomohybrid/base/router/Router;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$react$1\n*L\n1#1,83:1\n*E\n"})
    public static final class AnonymousClass1<C, P> implements Reaction.ReactionExecution {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f31057p0;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super T, Unit> function1) {
            this.f31057p0 = function1;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
        public final void execute(Router router, T t10) {
            this.f31057p0.invoke(t10);
        }
    }

    /* JADX INFO: renamed from: com.bbva.glomohybrid.base.cells.CellsReactor$reactAndClean$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CellsReactor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "component", "kotlin.jvm.PlatformType", "params", "execute", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$reactAndClean$1\n*L\n1#1,83:1\n*E\n"})
    public static final class C05631<C, P> implements Reaction.ReactionExecution {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<P, T, Unit> f31058p0;

        /* JADX WARN: Multi-variable type inference failed */
        public C05631(Function2<? super P, ? super T, Unit> function2) {
            this.f31058p0 = function2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
        public final void execute(P p4, T t10) {
            Intrinsics.checkNotNull(p4);
            this.f31058p0.invoke(p4, t10);
        }
    }

    /* JADX INFO: renamed from: com.bbva.glomohybrid.base.cells.CellsReactor$reactAndClean$2, reason: invalid class name */
    /* JADX INFO: compiled from: CellsReactor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "component", "kotlin.jvm.PlatformType", "params", "execute", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$reactAndClean$2\n*L\n1#1,83:1\n*E\n"})
    public static final class AnonymousClass2<C, P> implements Reaction.ReactionExecution {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<P, T, Unit> f31059p0;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super P, ? super T, Unit> function2) {
            this.f31059p0 = function2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
        public final void execute(P p4, T t10) {
            Intrinsics.checkNotNull(p4);
            this.f31059p0.invoke(p4, t10);
        }
    }

    /* JADX INFO: renamed from: com.bbva.glomohybrid.base.cells.CellsReactor$reactIn$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CellsReactor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "component", "kotlin.jvm.PlatformType", "params", "execute", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$reactIn$1\n*L\n1#1,83:1\n*E\n"})
    public static final class C05641<C, P> implements Reaction.ReactionExecution {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<P, T, Unit> f31060p0;

        /* JADX WARN: Multi-variable type inference failed */
        public C05641(Function2<? super P, ? super T, Unit> function2) {
            this.f31060p0 = function2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
        public final void execute(P p4, T t10) {
            Intrinsics.checkNotNull(p4);
            this.f31060p0.invoke(p4, t10);
        }
    }

    /* JADX INFO: renamed from: com.bbva.glomohybrid.base.cells.CellsReactor$reactIn$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CellsReactor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "component", "kotlin.jvm.PlatformType", "params", "execute", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$reactIn$2\n*L\n1#1,83:1\n*E\n"})
    public static final class C05652<C, P> implements Reaction.ReactionExecution {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<P, T, Unit> f31061p0;

        /* JADX WARN: Multi-variable type inference failed */
        public C05652(Function2<? super P, ? super T, Unit> function2) {
            this.f31061p0 = function2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
        public final void execute(P p4, T t10) {
            Intrinsics.checkNotNull(p4);
            this.f31061p0.invoke(p4, t10);
        }
    }

    public static final <T> void fire(@NotNull String componentId, @NotNull ActionSpec<T> action, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(action, "action");
        Reactor.inside(componentId).doAction(action).with(t10).fire();
    }

    public static /* synthetic */ void fire$default(String str, ActionSpec actionSpec, Object obj, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            obj = null;
        }
        fire(str, actionSpec, obj);
    }

    @NotNull
    public static final <T> ReactorCoreBuilder.AndReactionBuilder<T> log(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @NotNull LoggerLevel level, @Nullable Exception exc, @NotNull Function1<? super T, String> handleParam) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(handleParam, "handleParam");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(Router.ID, Router.class).delay(0L).doReaction(new CellsReactor$log$$inlined$reactIn$default$1(handleParam, level, exc));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder log$default(ReactorCoreBuilder.ReactionBuilder reactionBuilder, LoggerLevel level, Exception exc, Function1 handleParam, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            exc = null;
        }
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(handleParam, "handleParam");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilder.inside(Router.ID, Router.class).delay(0L).doReaction(new CellsReactor$log$$inlined$reactIn$default$1(handleParam, level, exc));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @NotNull
    public static final <T> ReactorCoreBuilder.AndReactionBuilder<T> react(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, long j10, @NotNull Function1<? super T, Unit> reaction) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(Router.ID, Router.class).delay(j10).doReaction(new AnonymousClass1(reaction));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder react$default(ReactorCoreBuilder.ReactionBuilder reactionBuilder, long j10, Function1 reaction, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilder.inside(Router.ID, Router.class).delay(j10).doReaction(new AnonymousClass1(reaction));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    public static final /* synthetic */ <T, P> void reactAndClean(ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, String id, long j10, Function2<? super P, ? super T, Unit> reaction) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        reactionBuilder.inside(id, Object.class).delay(j10).doReactionAndCleanChannel(new C05631(reaction));
    }

    public static /* synthetic */ void reactAndClean$default(ReactorCoreBuilder.ReactionBuilder reactionBuilder, String id, long j10, Function2 reaction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        reactionBuilder.inside(id, Object.class).delay(j10).doReactionAndCleanChannel(new C05631(reaction));
    }

    public static final /* synthetic */ <T, P> ReactorCoreBuilder.AndReactionBuilder<T> reactIn(ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, String id, long j10, Function2<? super P, ? super T, Unit> reaction) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(id, Object.class).delay(j10).doReaction(new C05641(reaction));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder reactIn$default(ReactorCoreBuilder.ReactionBuilder reactionBuilder, String id, long j10, Function2 reaction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilder.inside(id, Object.class).delay(j10).doReaction(new C05641(reaction));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    public static final /* synthetic */ <T, P> void reactAndClean(ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @IdRes int i10, long j10, Function2<? super P, ? super T, Unit> reaction) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        reactionBuilder.inside(i10, Object.class).delay(j10).doReactionAndCleanChannel(new AnonymousClass2(reaction));
    }

    public static final /* synthetic */ <T, P> ReactorCoreBuilder.AndReactionBuilder<T> reactIn(ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @IdRes int i10, long j10, Function2<? super P, ? super T, Unit> reaction) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(i10, Object.class).delay(j10).doReaction(new C05652(reaction));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    public static /* synthetic */ void reactAndClean$default(ReactorCoreBuilder.ReactionBuilder reactionBuilder, int i10, long j10, Function2 reaction, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        reactionBuilder.inside(i10, Object.class).delay(j10).doReactionAndCleanChannel(new AnonymousClass2(reaction));
    }

    public static /* synthetic */ ReactorCoreBuilder.AndReactionBuilder reactIn$default(ReactorCoreBuilder.ReactionBuilder reactionBuilder, int i10, long j10, Function2 reaction, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.reifiedOperationMarker(4, "P");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilder.inside(i10, Object.class).delay(j10).doReaction(new C05652(reaction));
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }
}
