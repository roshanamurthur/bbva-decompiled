package com.veridas.lib.entities.resources;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DetectionParameters.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ©\u00012\u00020\u0001:\u0004ª\u0001©\u0001B\u009d\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\b\b\u0002\u0010'\u001a\u00020\b\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010)\u001a\u00020\u0006\u0012\b\b\u0002\u0010*\u001a\u00020\u0006\u0012\b\b\u0002\u0010+\u001a\u00020\n\u0012\b\b\u0002\u0010,\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020\b\u0012\b\b\u0002\u0010/\u001a\u00020\b\u0012\b\b\u0002\u00100\u001a\u00020\b\u0012\b\b\u0002\u00101\u001a\u00020\b\u0012\b\b\u0002\u00102\u001a\u00020\u0006\u0012\b\b\u0002\u00103\u001a\u00020\b\u0012\b\b\u0002\u00104\u001a\u00020\b\u0012\b\b\u0002\u00105\u001a\u00020\b\u0012\b\b\u0002\u00106\u001a\u00020\b\u0012\b\b\u0002\u00107\u001a\u00020\b\u0012\b\b\u0002\u00108\u001a\u00020\b\u0012\b\b\u0002\u00109\u001a\u00020\b\u0012\b\b\u0002\u0010:\u001a\u00020\b\u0012\b\b\u0002\u0010;\u001a\u00020\b¢\u0006\u0006\b£\u0001\u0010¤\u0001B´\u0002\b\u0011\u0012\u0007\u0010¥\u0001\u001a\u00020\u0006\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010$\u001a\u00020\u0006\u0012\b\b\u0001\u0010%\u001a\u00020\b\u0012\b\b\u0001\u0010&\u001a\u00020\n\u0012\b\b\u0001\u0010'\u001a\u00020\b\u0012\b\b\u0001\u0010(\u001a\u00020\b\u0012\b\b\u0001\u0010)\u001a\u00020\u0006\u0012\b\b\u0001\u0010*\u001a\u00020\u0006\u0012\b\b\u0001\u0010+\u001a\u00020\n\u0012\b\b\u0001\u0010,\u001a\u00020\b\u0012\b\b\u0001\u0010-\u001a\u00020\b\u0012\b\b\u0001\u0010.\u001a\u00020\b\u0012\b\b\u0001\u0010/\u001a\u00020\b\u0012\b\b\u0001\u00100\u001a\u00020\b\u0012\b\b\u0001\u00101\u001a\u00020\b\u0012\b\b\u0001\u00102\u001a\u00020\u0006\u0012\b\b\u0001\u00103\u001a\u00020\b\u0012\b\b\u0001\u00104\u001a\u00020\b\u0012\b\b\u0001\u00105\u001a\u00020\b\u0012\b\b\u0001\u00106\u001a\u00020\b\u0012\b\b\u0001\u00107\u001a\u00020\b\u0012\b\b\u0001\u00108\u001a\u00020\b\u0012\b\b\u0001\u00109\u001a\u00020\b\u0012\b\b\u0001\u0010:\u001a\u00020\b\u0012\b\b\u0001\u0010;\u001a\u00020\b\u0012\n\u0010§\u0001\u001a\u0005\u0018\u00010¦\u0001¢\u0006\u0006\b£\u0001\u0010¨\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\nHÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u009d\u0002\u0010<\u001a\u00020\u00002\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\bHÆ\u0001J\t\u0010=\u001a\u00020\u0002HÖ\u0001J\t\u0010>\u001a\u00020\u0006HÖ\u0001J\u0013\u0010@\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J(\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DHÁ\u0001¢\u0006\u0004\bG\u0010HR\"\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010MR\"\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u0010K\u0012\u0004\bR\u0010O\u001a\u0004\bQ\u0010MR\"\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010K\u0012\u0004\bU\u0010O\u001a\u0004\bT\u0010MR \u0010$\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010O\u001a\u0004\bX\u0010YR \u0010%\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u0010\\\u0012\u0004\b_\u0010O\u001a\u0004\b]\u0010^R \u0010&\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bc\u0010O\u001a\u0004\b&\u0010bR \u0010'\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bd\u0010\\\u0012\u0004\bf\u0010O\u001a\u0004\be\u0010^R \u0010(\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bg\u0010\\\u0012\u0004\bi\u0010O\u001a\u0004\bh\u0010^R \u0010)\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bj\u0010W\u0012\u0004\bl\u0010O\u001a\u0004\bk\u0010YR \u0010*\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bm\u0010W\u0012\u0004\bo\u0010O\u001a\u0004\bn\u0010YR \u0010+\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bp\u0010a\u0012\u0004\br\u0010O\u001a\u0004\bq\u0010bR \u0010,\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bs\u0010\\\u0012\u0004\bu\u0010O\u001a\u0004\bt\u0010^R \u0010-\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010\\\u0012\u0004\bx\u0010O\u001a\u0004\bw\u0010^R \u0010.\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\by\u0010\\\u0012\u0004\b{\u0010O\u001a\u0004\bz\u0010^R \u0010/\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b|\u0010\\\u0012\u0004\b~\u0010O\u001a\u0004\b}\u0010^R\"\u00100\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u007f\u0010\\\u0012\u0005\b\u0081\u0001\u0010O\u001a\u0005\b\u0080\u0001\u0010^R#\u00101\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010\\\u0012\u0005\b\u0084\u0001\u0010O\u001a\u0005\b\u0083\u0001\u0010^R#\u00102\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010W\u0012\u0005\b\u0087\u0001\u0010O\u001a\u0005\b\u0086\u0001\u0010YR#\u00103\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010\\\u0012\u0005\b\u008a\u0001\u0010O\u001a\u0005\b\u0089\u0001\u0010^R#\u00104\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010\\\u0012\u0005\b\u008d\u0001\u0010O\u001a\u0005\b\u008c\u0001\u0010^R#\u00105\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010\\\u0012\u0005\b\u0090\u0001\u0010O\u001a\u0005\b\u008f\u0001\u0010^R#\u00106\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010\\\u0012\u0005\b\u0093\u0001\u0010O\u001a\u0005\b\u0092\u0001\u0010^R#\u00107\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\\\u0012\u0005\b\u0096\u0001\u0010O\u001a\u0005\b\u0095\u0001\u0010^R#\u00108\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010\\\u0012\u0005\b\u0099\u0001\u0010O\u001a\u0005\b\u0098\u0001\u0010^R#\u00109\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010\\\u0012\u0005\b\u009c\u0001\u0010O\u001a\u0005\b\u009b\u0001\u0010^R#\u0010:\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010\\\u0012\u0005\b\u009f\u0001\u0010O\u001a\u0005\b\u009e\u0001\u0010^R#\u0010;\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0001\u0010\\\u0012\u0005\b¢\u0001\u0010O\u001a\u0005\b¡\u0001\u0010^¨\u0006«\u0001"}, d2 = {"Lcom/veridas/lib/entities/resources/DetectionParameters;", "", "", "component1", "component2", "component3", "", "component4", "", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "documentId", "templateName", "cascadeName", "pyramidRange", "pyramidFactor", "isGray", "roiFactor", "minFactorImgTemplate", "thresholdArea", "prevMargin", "rectangles", ImageScaleTypeHandler.ID, "minDivisorHeight", "minDivisorWidth", "minDivisorSize", "minDivisorHeightVideo", "minDivisorWidthVideo", "neighbours", "minScore", "xTransformFactorXml", "yTransformFactorXml", "widthTransformFactorXml", "heightTransformFactorXml", "xTransformFactorTemplate", "yTransformFactorTemplate", "widthTransformFactorTemplate", "heightTransformFactorTemplate", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$common_core_jvm", "(Lcom/veridas/lib/entities/resources/DetectionParameters;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "a", "Ljava/lang/String;", "getDocumentId", "()Ljava/lang/String;", "getDocumentId$annotations", "()V", "b", "getTemplateName", "getTemplateName$annotations", "c", "getCascadeName", "getCascadeName$annotations", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPyramidRange", "()I", "getPyramidRange$annotations", "e", "D", "getPyramidFactor", "()D", "getPyramidFactor$annotations", "f", "Z", "()Z", "isGray$annotations", "g", "getRoiFactor", "getRoiFactor$annotations", "h", "getMinFactorImgTemplate", "getMinFactorImgTemplate$annotations", "i", "getThresholdArea", "getThresholdArea$annotations", "j", "getPrevMargin", "getPrevMargin$annotations", "k", "getRectangles", "getRectangles$annotations", "l", "getScale", "getScale$annotations", "m", "getMinDivisorHeight", "getMinDivisorHeight$annotations", "n", "getMinDivisorWidth", "getMinDivisorWidth$annotations", "o", "getMinDivisorSize", "getMinDivisorSize$annotations", "p", "getMinDivisorHeightVideo", "getMinDivisorHeightVideo$annotations", "q", "getMinDivisorWidthVideo", "getMinDivisorWidthVideo$annotations", "r", "getNeighbours", "getNeighbours$annotations", "s", "getMinScore", "getMinScore$annotations", "t", "getXTransformFactorXml", "getXTransformFactorXml$annotations", "u", "getYTransformFactorXml", "getYTransformFactorXml$annotations", SharedPrefsStorage.VERSION_KEY, "getWidthTransformFactorXml", "getWidthTransformFactorXml$annotations", "w", "getHeightTransformFactorXml", "getHeightTransformFactorXml$annotations", "x", "getXTransformFactorTemplate", "getXTransformFactorTemplate$annotations", "y", "getYTransformFactorTemplate", "getYTransformFactorTemplate$annotations", "z", "getWidthTransformFactorTemplate", "getWidthTransformFactorTemplate$annotations", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getHeightTransformFactorTemplate", "getHeightTransformFactorTemplate$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDZDDIIZDDDDDDIDDDDDDDDD)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IDZDDIIZDDDDDDIDDDDDDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class DetectionParameters {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final double heightTransformFactorTemplate;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String templateName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String cascadeName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int pyramidRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final double pyramidFactor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isGray;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final double roiFactor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final double minFactorImgTemplate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int thresholdArea;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int prevMargin;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean rectangles;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final double scale;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final double minDivisorHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final double minDivisorWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final double minDivisorSize;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final double minDivisorHeightVideo;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final double minDivisorWidthVideo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int neighbours;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final double minScore;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final double xTransformFactorXml;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final double yTransformFactorXml;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final double widthTransformFactorXml;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final double heightTransformFactorXml;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final double xTransformFactorTemplate;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final double yTransformFactorTemplate;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final double widthTransformFactorTemplate;

    /* JADX INFO: compiled from: DetectionParameters.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/veridas/lib/entities/resources/DetectionParameters$Companion;", "", "()V", "HEIGHT_TRANSFORMATION_FACTOR_MIN", "", "MINIMUM_DIVISOR_VALUE", "MINIMUM_NEIGHBOURS_NUMBER", "", "MINIMUM_SCALE", "MINIMUM_SCORE_VALUE", "WIDTH_TRANSFORMATION_FACTOR_MIN", "X_TRANSFORMATION_FACTOR_MIN", "Y_TRANSFORMATION_FACTOR_MIN", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/DetectionParameters;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<DetectionParameters> serializer() {
            return DetectionParameters$$serializer.INSTANCE;
        }
    }

    public DetectionParameters() {
        this((String) null, (String) null, (String) null, 0, 0.0d, false, 0.0d, 0.0d, 0, 0, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 134217727, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$common_core_jvm(DetectionParameters self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.documentId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.documentId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.templateName != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.templateName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cascadeName != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.cascadeName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.pyramidRange != 12) {
            output.encodeIntElement(serialDesc, 3, self.pyramidRange);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || Double.compare(self.pyramidFactor, 0.95d) != 0) {
            output.encodeDoubleElement(serialDesc, 4, self.pyramidFactor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.isGray) {
            output.encodeBooleanElement(serialDesc, 5, self.isGray);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || Double.compare(self.roiFactor, 0.15d) != 0) {
            output.encodeDoubleElement(serialDesc, 6, self.roiFactor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || Double.compare(self.minFactorImgTemplate, 2.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 7, self.minFactorImgTemplate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.thresholdArea != 35) {
            output.encodeIntElement(serialDesc, 8, self.thresholdArea);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.prevMargin != 2) {
            output.encodeIntElement(serialDesc, 9, self.prevMargin);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !self.rectangles) {
            output.encodeBooleanElement(serialDesc, 10, self.rectangles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || Double.compare(self.scale, 1.05d) != 0) {
            output.encodeDoubleElement(serialDesc, 11, self.scale);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || Double.compare(self.minDivisorHeight, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 12, self.minDivisorHeight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || Double.compare(self.minDivisorWidth, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 13, self.minDivisorWidth);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || Double.compare(self.minDivisorSize, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 14, self.minDivisorSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || Double.compare(self.minDivisorHeightVideo, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 15, self.minDivisorHeightVideo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || Double.compare(self.minDivisorWidthVideo, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 16, self.minDivisorWidthVideo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.neighbours != 4) {
            output.encodeIntElement(serialDesc, 17, self.neighbours);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || Double.compare(self.minScore, 0.43d) != 0) {
            output.encodeDoubleElement(serialDesc, 18, self.minScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || Double.compare(self.xTransformFactorXml, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 19, self.xTransformFactorXml);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || Double.compare(self.yTransformFactorXml, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 20, self.yTransformFactorXml);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || Double.compare(self.widthTransformFactorXml, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 21, self.widthTransformFactorXml);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || Double.compare(self.heightTransformFactorXml, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 22, self.heightTransformFactorXml);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || Double.compare(self.xTransformFactorTemplate, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 23, self.xTransformFactorTemplate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || Double.compare(self.yTransformFactorTemplate, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 24, self.yTransformFactorTemplate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || Double.compare(self.widthTransformFactorTemplate, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 25, self.widthTransformFactorTemplate);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 26) && Double.compare(self.heightTransformFactorTemplate, 1.0d) == 0) {
            return;
        }
        output.encodeDoubleElement(serialDesc, 26, self.heightTransformFactorTemplate);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPrevMargin() {
        return this.prevMargin;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getRectangles() {
        return this.rectangles;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getMinDivisorHeight() {
        return this.minDivisorHeight;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getMinDivisorWidth() {
        return this.minDivisorWidth;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getMinDivisorSize() {
        return this.minDivisorSize;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final double getMinDivisorHeightVideo() {
        return this.minDivisorHeightVideo;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final double getMinDivisorWidthVideo() {
        return this.minDivisorWidthVideo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getNeighbours() {
        return this.neighbours;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final double getMinScore() {
        return this.minScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final double getXTransformFactorXml() {
        return this.xTransformFactorXml;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final double getYTransformFactorXml() {
        return this.yTransformFactorXml;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final double getWidthTransformFactorXml() {
        return this.widthTransformFactorXml;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final double getHeightTransformFactorXml() {
        return this.heightTransformFactorXml;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final double getXTransformFactorTemplate() {
        return this.xTransformFactorTemplate;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final double getYTransformFactorTemplate() {
        return this.yTransformFactorTemplate;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final double getWidthTransformFactorTemplate() {
        return this.widthTransformFactorTemplate;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final double getHeightTransformFactorTemplate() {
        return this.heightTransformFactorTemplate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCascadeName() {
        return this.cascadeName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPyramidRange() {
        return this.pyramidRange;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getPyramidFactor() {
        return this.pyramidFactor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsGray() {
        return this.isGray;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getRoiFactor() {
        return this.roiFactor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getMinFactorImgTemplate() {
        return this.minFactorImgTemplate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getThresholdArea() {
        return this.thresholdArea;
    }

    @NotNull
    public final DetectionParameters copy(@Nullable String documentId, @Nullable String templateName, @Nullable String cascadeName, int pyramidRange, double pyramidFactor, boolean isGray, double roiFactor, double minFactorImgTemplate, int thresholdArea, int prevMargin, boolean rectangles, double scale, double minDivisorHeight, double minDivisorWidth, double minDivisorSize, double minDivisorHeightVideo, double minDivisorWidthVideo, int neighbours, double minScore, double xTransformFactorXml, double yTransformFactorXml, double widthTransformFactorXml, double heightTransformFactorXml, double xTransformFactorTemplate, double yTransformFactorTemplate, double widthTransformFactorTemplate, double heightTransformFactorTemplate) {
        return new DetectionParameters(documentId, templateName, cascadeName, pyramidRange, pyramidFactor, isGray, roiFactor, minFactorImgTemplate, thresholdArea, prevMargin, rectangles, scale, minDivisorHeight, minDivisorWidth, minDivisorSize, minDivisorHeightVideo, minDivisorWidthVideo, neighbours, minScore, xTransformFactorXml, yTransformFactorXml, widthTransformFactorXml, heightTransformFactorXml, xTransformFactorTemplate, yTransformFactorTemplate, widthTransformFactorTemplate, heightTransformFactorTemplate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectionParameters)) {
            return false;
        }
        DetectionParameters detectionParameters = (DetectionParameters) other;
        return Intrinsics.areEqual(this.documentId, detectionParameters.documentId) && Intrinsics.areEqual(this.templateName, detectionParameters.templateName) && Intrinsics.areEqual(this.cascadeName, detectionParameters.cascadeName) && this.pyramidRange == detectionParameters.pyramidRange && Double.compare(this.pyramidFactor, detectionParameters.pyramidFactor) == 0 && this.isGray == detectionParameters.isGray && Double.compare(this.roiFactor, detectionParameters.roiFactor) == 0 && Double.compare(this.minFactorImgTemplate, detectionParameters.minFactorImgTemplate) == 0 && this.thresholdArea == detectionParameters.thresholdArea && this.prevMargin == detectionParameters.prevMargin && this.rectangles == detectionParameters.rectangles && Double.compare(this.scale, detectionParameters.scale) == 0 && Double.compare(this.minDivisorHeight, detectionParameters.minDivisorHeight) == 0 && Double.compare(this.minDivisorWidth, detectionParameters.minDivisorWidth) == 0 && Double.compare(this.minDivisorSize, detectionParameters.minDivisorSize) == 0 && Double.compare(this.minDivisorHeightVideo, detectionParameters.minDivisorHeightVideo) == 0 && Double.compare(this.minDivisorWidthVideo, detectionParameters.minDivisorWidthVideo) == 0 && this.neighbours == detectionParameters.neighbours && Double.compare(this.minScore, detectionParameters.minScore) == 0 && Double.compare(this.xTransformFactorXml, detectionParameters.xTransformFactorXml) == 0 && Double.compare(this.yTransformFactorXml, detectionParameters.yTransformFactorXml) == 0 && Double.compare(this.widthTransformFactorXml, detectionParameters.widthTransformFactorXml) == 0 && Double.compare(this.heightTransformFactorXml, detectionParameters.heightTransformFactorXml) == 0 && Double.compare(this.xTransformFactorTemplate, detectionParameters.xTransformFactorTemplate) == 0 && Double.compare(this.yTransformFactorTemplate, detectionParameters.yTransformFactorTemplate) == 0 && Double.compare(this.widthTransformFactorTemplate, detectionParameters.widthTransformFactorTemplate) == 0 && Double.compare(this.heightTransformFactorTemplate, detectionParameters.heightTransformFactorTemplate) == 0;
    }

    @Nullable
    public final String getCascadeName() {
        return this.cascadeName;
    }

    @Nullable
    public final String getDocumentId() {
        return this.documentId;
    }

    public final double getHeightTransformFactorTemplate() {
        return this.heightTransformFactorTemplate;
    }

    public final double getHeightTransformFactorXml() {
        return this.heightTransformFactorXml;
    }

    public final double getMinDivisorHeight() {
        return this.minDivisorHeight;
    }

    public final double getMinDivisorHeightVideo() {
        return this.minDivisorHeightVideo;
    }

    public final double getMinDivisorSize() {
        return this.minDivisorSize;
    }

    public final double getMinDivisorWidth() {
        return this.minDivisorWidth;
    }

    public final double getMinDivisorWidthVideo() {
        return this.minDivisorWidthVideo;
    }

    public final double getMinFactorImgTemplate() {
        return this.minFactorImgTemplate;
    }

    public final double getMinScore() {
        return this.minScore;
    }

    public final int getNeighbours() {
        return this.neighbours;
    }

    public final int getPrevMargin() {
        return this.prevMargin;
    }

    public final double getPyramidFactor() {
        return this.pyramidFactor;
    }

    public final int getPyramidRange() {
        return this.pyramidRange;
    }

    public final boolean getRectangles() {
        return this.rectangles;
    }

    public final double getRoiFactor() {
        return this.roiFactor;
    }

    public final double getScale() {
        return this.scale;
    }

    @Nullable
    public final String getTemplateName() {
        return this.templateName;
    }

    public final int getThresholdArea() {
        return this.thresholdArea;
    }

    public final double getWidthTransformFactorTemplate() {
        return this.widthTransformFactorTemplate;
    }

    public final double getWidthTransformFactorXml() {
        return this.widthTransformFactorXml;
    }

    public final double getXTransformFactorTemplate() {
        return this.xTransformFactorTemplate;
    }

    public final double getXTransformFactorXml() {
        return this.xTransformFactorXml;
    }

    public final double getYTransformFactorTemplate() {
        return this.yTransformFactorTemplate;
    }

    public final double getYTransformFactorXml() {
        return this.yTransformFactorXml;
    }

    public int hashCode() {
        String str = this.documentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cascadeName;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.pyramidRange) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.pyramidFactor);
        int i10 = (((iHashCode3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + (this.isGray ? 1231 : 1237)) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.roiFactor);
        int i11 = (i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.minFactorImgTemplate);
        int i12 = (((((((i11 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31) + this.thresholdArea) * 31) + this.prevMargin) * 31) + (this.rectangles ? 1231 : 1237)) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.scale);
        int i13 = (i12 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.minDivisorHeight);
        int i14 = (i13 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.minDivisorWidth);
        int i15 = (i14 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.minDivisorSize);
        int i16 = (i15 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31;
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.minDivisorHeightVideo);
        int i17 = (i16 + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31;
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.minDivisorWidthVideo);
        int i18 = (((i17 + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)))) * 31) + this.neighbours) * 31;
        long jDoubleToLongBits10 = Double.doubleToLongBits(this.minScore);
        int i19 = (i18 + ((int) (jDoubleToLongBits10 ^ (jDoubleToLongBits10 >>> 32)))) * 31;
        long jDoubleToLongBits11 = Double.doubleToLongBits(this.xTransformFactorXml);
        int i20 = (i19 + ((int) (jDoubleToLongBits11 ^ (jDoubleToLongBits11 >>> 32)))) * 31;
        long jDoubleToLongBits12 = Double.doubleToLongBits(this.yTransformFactorXml);
        int i21 = (i20 + ((int) (jDoubleToLongBits12 ^ (jDoubleToLongBits12 >>> 32)))) * 31;
        long jDoubleToLongBits13 = Double.doubleToLongBits(this.widthTransformFactorXml);
        int i22 = (i21 + ((int) (jDoubleToLongBits13 ^ (jDoubleToLongBits13 >>> 32)))) * 31;
        long jDoubleToLongBits14 = Double.doubleToLongBits(this.heightTransformFactorXml);
        int i23 = (i22 + ((int) (jDoubleToLongBits14 ^ (jDoubleToLongBits14 >>> 32)))) * 31;
        long jDoubleToLongBits15 = Double.doubleToLongBits(this.xTransformFactorTemplate);
        int i24 = (i23 + ((int) (jDoubleToLongBits15 ^ (jDoubleToLongBits15 >>> 32)))) * 31;
        long jDoubleToLongBits16 = Double.doubleToLongBits(this.yTransformFactorTemplate);
        int i25 = (i24 + ((int) (jDoubleToLongBits16 ^ (jDoubleToLongBits16 >>> 32)))) * 31;
        long jDoubleToLongBits17 = Double.doubleToLongBits(this.widthTransformFactorTemplate);
        int i26 = (i25 + ((int) (jDoubleToLongBits17 ^ (jDoubleToLongBits17 >>> 32)))) * 31;
        long jDoubleToLongBits18 = Double.doubleToLongBits(this.heightTransformFactorTemplate);
        return i26 + ((int) (jDoubleToLongBits18 ^ (jDoubleToLongBits18 >>> 32)));
    }

    public final boolean isGray() {
        return this.isGray;
    }

    @NotNull
    public String toString() {
        return "DetectionParameters(documentId=" + this.documentId + ", templateName=" + this.templateName + ", cascadeName=" + this.cascadeName + ", pyramidRange=" + this.pyramidRange + ", pyramidFactor=" + this.pyramidFactor + ", isGray=" + this.isGray + ", roiFactor=" + this.roiFactor + ", minFactorImgTemplate=" + this.minFactorImgTemplate + ", thresholdArea=" + this.thresholdArea + ", prevMargin=" + this.prevMargin + ", rectangles=" + this.rectangles + ", scale=" + this.scale + ", minDivisorHeight=" + this.minDivisorHeight + ", minDivisorWidth=" + this.minDivisorWidth + ", minDivisorSize=" + this.minDivisorSize + ", minDivisorHeightVideo=" + this.minDivisorHeightVideo + ", minDivisorWidthVideo=" + this.minDivisorWidthVideo + ", neighbours=" + this.neighbours + ", minScore=" + this.minScore + ", xTransformFactorXml=" + this.xTransformFactorXml + ", yTransformFactorXml=" + this.yTransformFactorXml + ", widthTransformFactorXml=" + this.widthTransformFactorXml + ", heightTransformFactorXml=" + this.heightTransformFactorXml + ", xTransformFactorTemplate=" + this.xTransformFactorTemplate + ", yTransformFactorTemplate=" + this.yTransformFactorTemplate + ", widthTransformFactorTemplate=" + this.widthTransformFactorTemplate + ", heightTransformFactorTemplate=" + this.heightTransformFactorTemplate + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DetectionParameters(int i10, @SerialName("i") String str, @SerialName("tn") String str2, @SerialName("cn") String str3, @SerialName("pr") int i11, @SerialName("pf") double d2, @SerialName("ig") boolean z10, @SerialName("rf") double d3, @SerialName("mfit") double d7, @SerialName("ta") int i12, @SerialName("pm") int i13, @SerialName("r") boolean z11, @SerialName("s") double d10, @SerialName("mdh") double d11, @SerialName("mdw") double d12, @SerialName("mds") double d13, @SerialName("mdhv") double d14, @SerialName("mdwv") double d15, @SerialName("n") int i14, @SerialName("ms") double d16, @SerialName("xtfx") double d17, @SerialName("ytfy") double d18, @SerialName("wtfw") double d19, @SerialName("htfh") double d20, @SerialName("xtft") double d21, @SerialName("ytft") double d22, @SerialName("wtft") double d23, @SerialName("htft") double d24, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.documentId = null;
        } else {
            this.documentId = str;
        }
        if ((i10 & 2) == 0) {
            this.templateName = null;
        } else {
            this.templateName = str2;
        }
        if ((i10 & 4) == 0) {
            this.cascadeName = null;
        } else {
            this.cascadeName = str3;
        }
        this.pyramidRange = (i10 & 8) == 0 ? 12 : i11;
        this.pyramidFactor = (i10 & 16) == 0 ? 0.95d : d2;
        this.isGray = (i10 & 32) == 0 ? false : z10;
        this.roiFactor = (i10 & 64) == 0 ? 0.15d : d3;
        this.minFactorImgTemplate = (i10 & 128) == 0 ? 2.0d : d7;
        this.thresholdArea = (i10 & 256) == 0 ? 35 : i12;
        this.prevMargin = (i10 & 512) == 0 ? 2 : i13;
        this.rectangles = (i10 & 1024) == 0 ? true : z11;
        this.scale = (i10 & 2048) == 0 ? 1.05d : d10;
        if ((i10 & 4096) == 0) {
            this.minDivisorHeight = 1.0d;
        } else {
            this.minDivisorHeight = d11;
        }
        if ((i10 & 8192) == 0) {
            this.minDivisorWidth = 1.0d;
        } else {
            this.minDivisorWidth = d12;
        }
        if ((i10 & 16384) == 0) {
            this.minDivisorSize = 1.0d;
        } else {
            this.minDivisorSize = d13;
        }
        if ((32768 & i10) == 0) {
            this.minDivisorHeightVideo = 1.0d;
        } else {
            this.minDivisorHeightVideo = d14;
        }
        if ((65536 & i10) == 0) {
            this.minDivisorWidthVideo = 1.0d;
        } else {
            this.minDivisorWidthVideo = d15;
        }
        this.neighbours = (131072 & i10) == 0 ? 4 : i14;
        this.minScore = (262144 & i10) == 0 ? 0.43d : d16;
        if ((524288 & i10) == 0) {
            this.xTransformFactorXml = 0.0d;
        } else {
            this.xTransformFactorXml = d17;
        }
        if ((1048576 & i10) == 0) {
            this.yTransformFactorXml = 0.0d;
        } else {
            this.yTransformFactorXml = d18;
        }
        if ((2097152 & i10) == 0) {
            this.widthTransformFactorXml = 1.0d;
        } else {
            this.widthTransformFactorXml = d19;
        }
        if ((4194304 & i10) == 0) {
            this.heightTransformFactorXml = 1.0d;
        } else {
            this.heightTransformFactorXml = d20;
        }
        if ((8388608 & i10) == 0) {
            this.xTransformFactorTemplate = 0.0d;
        } else {
            this.xTransformFactorTemplate = d21;
        }
        if ((16777216 & i10) == 0) {
            this.yTransformFactorTemplate = 0.0d;
        } else {
            this.yTransformFactorTemplate = d22;
        }
        if ((33554432 & i10) == 0) {
            this.widthTransformFactorTemplate = 1.0d;
        } else {
            this.widthTransformFactorTemplate = d23;
        }
        if ((i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            this.heightTransformFactorTemplate = 1.0d;
        } else {
            this.heightTransformFactorTemplate = d24;
        }
        if (this.scale < 1.0d) {
            throw new IllegalArgumentException("The scale must not be lower than 1.0".toString());
        }
        if (this.minDivisorHeight < 1.0d) {
            throw new IllegalArgumentException("The divisor height must not be lower than 1.0".toString());
        }
        if (this.minDivisorWidth < 1.0d) {
            throw new IllegalArgumentException("The divisor width must not be lower than 1.0".toString());
        }
        if (this.minDivisorSize < 1.0d) {
            throw new IllegalArgumentException("The divisor size must not be lower than 1.0".toString());
        }
        if (this.minDivisorHeightVideo < 1.0d) {
            throw new IllegalArgumentException("The divisor height for video must not be lower than 1.0".toString());
        }
        if (this.minDivisorWidthVideo < 1.0d) {
            throw new IllegalArgumentException("The divisor width for video must not be lower than 1.0".toString());
        }
        if (this.neighbours < 0) {
            throw new IllegalArgumentException("The number of neighbours must not be lower than 0".toString());
        }
        if (this.minScore < 0.0d) {
            throw new IllegalArgumentException("The minimum score must not be lower than 0".toString());
        }
        if (this.xTransformFactorXml < 0.0d) {
            throw new IllegalArgumentException("XML X transformation factor must not be lower than 0.0".toString());
        }
        if (this.yTransformFactorXml < 0.0d) {
            throw new IllegalArgumentException("XML Y transformation factor must not be lower than 0.0".toString());
        }
        if (this.widthTransformFactorXml < 1.0d) {
            throw new IllegalArgumentException("XML width transform factor must not be lower than 1.0".toString());
        }
        if (this.heightTransformFactorXml < 1.0d) {
            throw new IllegalArgumentException("XML height transform factor must not be lower than 1.0".toString());
        }
        if (this.xTransformFactorTemplate < 0.0d) {
            throw new IllegalArgumentException("X transformation factor must not be lower than 0.0".toString());
        }
        if (this.yTransformFactorTemplate < 0.0d) {
            throw new IllegalArgumentException("Y transformation factor must not be lower than 0.0".toString());
        }
        if (this.widthTransformFactorTemplate < 1.0d) {
            throw new IllegalArgumentException("Width transformation factor must not be lower than 1.0".toString());
        }
        if (this.heightTransformFactorTemplate < 1.0d) {
            throw new IllegalArgumentException("Height transformation factor must not be lower than 1.0".toString());
        }
    }

    public DetectionParameters(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, double d2, boolean z10, double d3, double d7, int i11, int i12, boolean z11, double d10, double d11, double d12, double d13, double d14, double d15, int i13, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24) {
        this.documentId = str;
        this.templateName = str2;
        this.cascadeName = str3;
        this.pyramidRange = i10;
        this.pyramidFactor = d2;
        this.isGray = z10;
        this.roiFactor = d3;
        this.minFactorImgTemplate = d7;
        this.thresholdArea = i11;
        this.prevMargin = i12;
        this.rectangles = z11;
        this.scale = d10;
        this.minDivisorHeight = d11;
        this.minDivisorWidth = d12;
        this.minDivisorSize = d13;
        this.minDivisorHeightVideo = d14;
        this.minDivisorWidthVideo = d15;
        this.neighbours = i13;
        this.minScore = d16;
        this.xTransformFactorXml = d17;
        this.yTransformFactorXml = d18;
        this.widthTransformFactorXml = d19;
        this.heightTransformFactorXml = d20;
        this.xTransformFactorTemplate = d21;
        this.yTransformFactorTemplate = d22;
        this.widthTransformFactorTemplate = d23;
        this.heightTransformFactorTemplate = d24;
        if (d10 < 1.0d) {
            throw new IllegalArgumentException("The scale must not be lower than 1.0".toString());
        }
        if (d11 < 1.0d) {
            throw new IllegalArgumentException("The divisor height must not be lower than 1.0".toString());
        }
        if (d12 < 1.0d) {
            throw new IllegalArgumentException("The divisor width must not be lower than 1.0".toString());
        }
        if (d13 < 1.0d) {
            throw new IllegalArgumentException("The divisor size must not be lower than 1.0".toString());
        }
        if (d14 < 1.0d) {
            throw new IllegalArgumentException("The divisor height for video must not be lower than 1.0".toString());
        }
        if (d15 < 1.0d) {
            throw new IllegalArgumentException("The divisor width for video must not be lower than 1.0".toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("The number of neighbours must not be lower than 0".toString());
        }
        if (d16 < 0.0d) {
            throw new IllegalArgumentException("The minimum score must not be lower than 0".toString());
        }
        if (d17 < 0.0d) {
            throw new IllegalArgumentException("XML X transformation factor must not be lower than 0.0".toString());
        }
        if (d18 < 0.0d) {
            throw new IllegalArgumentException("XML Y transformation factor must not be lower than 0.0".toString());
        }
        if (d19 < 1.0d) {
            throw new IllegalArgumentException("XML width transform factor must not be lower than 1.0".toString());
        }
        if (d20 < 1.0d) {
            throw new IllegalArgumentException("XML height transform factor must not be lower than 1.0".toString());
        }
        if (d21 < 0.0d) {
            throw new IllegalArgumentException("X transformation factor must not be lower than 0.0".toString());
        }
        if (d22 < 0.0d) {
            throw new IllegalArgumentException("Y transformation factor must not be lower than 0.0".toString());
        }
        if (d23 < 1.0d) {
            throw new IllegalArgumentException("Width transformation factor must not be lower than 1.0".toString());
        }
        if (d24 < 1.0d) {
            throw new IllegalArgumentException("Height transformation factor must not be lower than 1.0".toString());
        }
    }

    @SerialName("cn")
    public static /* synthetic */ void getCascadeName$annotations() {
    }

    @SerialName("i")
    public static /* synthetic */ void getDocumentId$annotations() {
    }

    @SerialName("htft")
    public static /* synthetic */ void getHeightTransformFactorTemplate$annotations() {
    }

    @SerialName("htfh")
    public static /* synthetic */ void getHeightTransformFactorXml$annotations() {
    }

    @SerialName("mdh")
    public static /* synthetic */ void getMinDivisorHeight$annotations() {
    }

    @SerialName("mdhv")
    public static /* synthetic */ void getMinDivisorHeightVideo$annotations() {
    }

    @SerialName("mds")
    public static /* synthetic */ void getMinDivisorSize$annotations() {
    }

    @SerialName("mdw")
    public static /* synthetic */ void getMinDivisorWidth$annotations() {
    }

    @SerialName("mdwv")
    public static /* synthetic */ void getMinDivisorWidthVideo$annotations() {
    }

    @SerialName("mfit")
    public static /* synthetic */ void getMinFactorImgTemplate$annotations() {
    }

    @SerialName("ms")
    public static /* synthetic */ void getMinScore$annotations() {
    }

    @SerialName("n")
    public static /* synthetic */ void getNeighbours$annotations() {
    }

    @SerialName("pm")
    public static /* synthetic */ void getPrevMargin$annotations() {
    }

    @SerialName("pf")
    public static /* synthetic */ void getPyramidFactor$annotations() {
    }

    @SerialName("pr")
    public static /* synthetic */ void getPyramidRange$annotations() {
    }

    @SerialName("r")
    public static /* synthetic */ void getRectangles$annotations() {
    }

    @SerialName("rf")
    public static /* synthetic */ void getRoiFactor$annotations() {
    }

    @SerialName("s")
    public static /* synthetic */ void getScale$annotations() {
    }

    @SerialName("tn")
    public static /* synthetic */ void getTemplateName$annotations() {
    }

    @SerialName("ta")
    public static /* synthetic */ void getThresholdArea$annotations() {
    }

    @SerialName("wtft")
    public static /* synthetic */ void getWidthTransformFactorTemplate$annotations() {
    }

    @SerialName("wtfw")
    public static /* synthetic */ void getWidthTransformFactorXml$annotations() {
    }

    @SerialName("xtft")
    public static /* synthetic */ void getXTransformFactorTemplate$annotations() {
    }

    @SerialName("xtfx")
    public static /* synthetic */ void getXTransformFactorXml$annotations() {
    }

    @SerialName("ytft")
    public static /* synthetic */ void getYTransformFactorTemplate$annotations() {
    }

    @SerialName("ytfy")
    public static /* synthetic */ void getYTransformFactorXml$annotations() {
    }

    @SerialName("ig")
    public static /* synthetic */ void isGray$annotations() {
    }

    public /* synthetic */ DetectionParameters(String str, String str2, String str3, int i10, double d2, boolean z10, double d3, double d7, int i11, int i12, boolean z11, double d10, double d11, double d12, double d13, double d14, double d15, int i13, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) == 0 ? str3 : null, (i14 & 8) != 0 ? 12 : i10, (i14 & 16) != 0 ? 0.95d : d2, (i14 & 32) != 0 ? false : z10, (i14 & 64) != 0 ? 0.15d : d3, (i14 & 128) != 0 ? 2.0d : d7, (i14 & 256) != 0 ? 35 : i11, (i14 & 512) != 0 ? 2 : i12, (i14 & 1024) != 0 ? true : z11, (i14 & 2048) != 0 ? 1.05d : d10, (i14 & 4096) != 0 ? 1.0d : d11, (i14 & 8192) != 0 ? 1.0d : d12, (i14 & 16384) != 0 ? 1.0d : d13, (i14 & 32768) != 0 ? 1.0d : d14, (i14 & 65536) != 0 ? 1.0d : d15, (i14 & 131072) != 0 ? 4 : i13, (i14 & 262144) != 0 ? 0.43d : d16, (i14 & 524288) != 0 ? 0.0d : d17, (i14 & 1048576) != 0 ? 0.0d : d18, (i14 & 2097152) != 0 ? 1.0d : d19, (i14 & 4194304) != 0 ? 1.0d : d20, (i14 & 8388608) != 0 ? 0.0d : d21, (i14 & 16777216) == 0 ? d22 : 0.0d, (i14 & 33554432) != 0 ? 1.0d : d23, (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0 ? d24 : 1.0d);
    }
}
