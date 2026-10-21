package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.fasterxml.jackson.core.JsonPointer;
import com.veridas.Veridas;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    public static final SimpleDateFormat R;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    public static final SimpleDateFormat S;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_OFFSET_TIME = "OffsetTime";
    public static final String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";
    public static final e W;

    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final e[][] X;
    public static final e[] Y;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    public static final HashMap<Integer, e>[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final HashMap<String, e>[] f21409a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final HashSet<String> f21410b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f21411c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Charset f21412d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f21413e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f21414f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f21415g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Pattern f21416h0;
    public static final Pattern i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Pattern f21417j0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f21424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f21425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, d>[] f21428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f21429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f21430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21434l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f21435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21441t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21442u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f21418v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List<Integer> f21419w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List<Integer> f21420x = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f21421y = {-1, -40, -1};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f21422z = {102, 116, 121, Constants.CVR_B1b85_0111_VERIFIED_CLOUD};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, Constants.CVR_B1b85_0101_MOBILE_APP, 0};
    public static final byte[] D = {79, 76, 89, 77, Constants.CVR_B1b85_0101_MOBILE_APP, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, Constants.CVR_B1b85_0101_MOBILE_APP, 78, 71, 13, 10, MessageUtils.MESSAGE_26_SUB, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, Constants.CVR_B1b85_0101_MOBILE_APP};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final OutputStream f21450p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ByteOrder f21451q0;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f21450p0 = outputStream;
            this.f21451q0 = byteOrder;
        }

        public final void a(int i10) throws IOException {
            this.f21450p0.write(i10);
        }

        public final void b(int i10) throws IOException {
            ByteOrder byteOrder = this.f21451q0;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f21450p0;
            if (byteOrder == byteOrder2) {
                outputStream.write(i10 & 255);
                outputStream.write((i10 >>> 8) & 255);
                outputStream.write((i10 >>> 16) & 255);
                outputStream.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i10 >>> 24) & 255);
                outputStream.write((i10 >>> 16) & 255);
                outputStream.write((i10 >>> 8) & 255);
                outputStream.write(i10 & 255);
            }
        }

        public final void c(short s4) throws IOException {
            ByteOrder byteOrder = this.f21451q0;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f21450p0;
            if (byteOrder == byteOrder2) {
                outputStream.write(s4 & 255);
                outputStream.write((s4 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s4 >>> 8) & 255);
                outputStream.write(s4 & 255);
            }
        }

        public final void d(long j10) throws IOException {
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            b((int) j10);
        }

        public final void e(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            c((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f21450p0.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f21450p0.write(bArr, i10, i11);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f21455d;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(ExifInterface.f21412d0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.U[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.U[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f21460a);
                byteBufferWrap.putInt((int) fVar.f21461b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(int i10, ByteOrder byteOrder) {
            return f(new int[]{i10}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.U[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public final double g(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objJ instanceof String) {
                return Double.parseDouble((String) objJ);
            }
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objJ;
            if (fVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            f fVar = fVarArr[0];
            return fVar.f21460a / fVar.f21461b;
        }

        public final int h(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objJ instanceof String) {
                return Integer.parseInt((String) objJ);
            }
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                return null;
            }
            if (objJ instanceof String) {
                return (String) objJ;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objJ instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objJ;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f21460a);
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append(fVarArr[i10].f21461b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:148:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 2, insn: 0x0029: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:42), block:B:14:0x0029 */
        /* JADX WARN: Type inference failed for: r12v20, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r12v21, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r12v22, types: [androidx.exifinterface.media.ExifInterface$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r12v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r12v24, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r12v25, types: [androidx.exifinterface.media.ExifInterface$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r12v26, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r12v27, types: [double[], java.io.Serializable] */
        public final Serializable j(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte[] bArr = this.f21455d;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.f21447r0 = byteOrder;
                        int i10 = this.f21452a;
                        int length = 0;
                        int i11 = this.f21453b;
                        switch (i10) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                    String str = new String(bArr, ExifInterface.f21412d0);
                                    try {
                                        bVar.close();
                                        break;
                                    } catch (IOException unused) {
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused2) {
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (i11 >= ExifInterface.V.length) {
                                    int i12 = 0;
                                    while (true) {
                                        byte[] bArr2 = ExifInterface.V;
                                        if (i12 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i12] == bArr2[i12]) {
                                            i12++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    while (length < i11) {
                                        byte b11 = bArr[length];
                                        if (b11 == 0) {
                                            String string = sb2.toString();
                                            bVar.close();
                                            return string;
                                        }
                                        if (b11 >= 32) {
                                            sb2.append((char) b11);
                                        } else {
                                            sb2.append('?');
                                        }
                                        length++;
                                    }
                                    bVar.close();
                                    break;
                                } catch (IOException unused3) {
                                }
                                String string2 = sb2.toString();
                                return string2;
                            case 3:
                                ?? r12 = new int[i11];
                                while (length < i11) {
                                    r12[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused4) {
                                }
                                return r12;
                            case 4:
                                ?? r13 = new long[i11];
                                while (length < i11) {
                                    r13[length] = ((long) bVar.readInt()) & 4294967295L;
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused5) {
                                }
                                return r13;
                            case 5:
                                ?? r14 = new f[i11];
                                while (length < i11) {
                                    r14[length] = new f(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused6) {
                                }
                                return r14;
                            case 8:
                                ?? r15 = new int[i11];
                                while (length < i11) {
                                    r15[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused7) {
                                }
                                return r15;
                            case 9:
                                ?? r16 = new int[i11];
                                while (length < i11) {
                                    r16[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused8) {
                                }
                                return r16;
                            case 10:
                                ?? r17 = new f[i11];
                                while (length < i11) {
                                    r17[length] = new f(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused9) {
                                }
                                return r17;
                            case 11:
                                ?? r18 = new double[i11];
                                while (length < i11) {
                                    r18[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused10) {
                                }
                                return r18;
                            case 12:
                                ?? r19 = new double[i11];
                                while (length < i11) {
                                    r19[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused11) {
                                }
                                return r19;
                            default:
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused12) {
                                }
                                return null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException unused13) {
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused14) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(ExifInterface.T[this.f21452a]);
            sb2.append(", data length:");
            return androidx.appcompat.widget.a.c(sb2, this.f21455d.length, ")");
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f21452a = i10;
            this.f21453b = i11;
            this.f21454c = j10;
            this.f21455d = bArr;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21461b;

        public f(double d2) {
            this((long) (d2 * 10000.0d), 10000L);
        }

        public final String toString() {
            return this.f21460a + "/" + this.f21461b;
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f21460a = 0L;
                this.f21461b = 1L;
            } else {
                this.f21460a = j10;
                this.f21461b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e(TAG_NEW_SUBFILE_TYPE, 254, 4), new e(TAG_SUBFILE_TYPE, 255, 4), new e(TAG_IMAGE_WIDTH, 256, 3, 4), new e(TAG_IMAGE_LENGTH, 257, 3, 4), new e(TAG_BITS_PER_SAMPLE, 258, 3), new e(TAG_COMPRESSION, 259, 3), new e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new e(TAG_IMAGE_DESCRIPTION, BarcodeUtils.ROTATION_270, 2), new e(TAG_MAKE, 271, 2), new e(TAG_MODEL, 272, 2), new e(TAG_STRIP_OFFSETS, 273, 3, 4), new e(TAG_ORIENTATION, 274, 3), new e(TAG_SAMPLES_PER_PIXEL, 277, 3), new e(TAG_ROWS_PER_STRIP, 278, 3, 4), new e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new e(TAG_X_RESOLUTION, 282, 5), new e(TAG_Y_RESOLUTION, 283, 5), new e(TAG_PLANAR_CONFIGURATION, 284, 3), new e(TAG_RESOLUTION_UNIT, 296, 3), new e(TAG_TRANSFER_FUNCTION, 301, 3), new e(TAG_SOFTWARE, 305, 2), new e(TAG_DATETIME, 306, 2), new e(TAG_ARTIST, 315, 2), new e(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new e("SubIFDPointer", 330, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new e(TAG_Y_CB_CR_POSITIONING, 531, 3), new e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new e(TAG_COPYRIGHT, 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new e(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new e(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new e(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new e(TAG_RW2_ISO, 23, 3), new e(TAG_RW2_JPG_FROM_RAW, 46, 7), new e(TAG_XMP, 700, 1)};
        e[] eVarArr2 = {new e(TAG_EXPOSURE_TIME, 33434, 5), new e(TAG_F_NUMBER, 33437, 5), new e(TAG_EXPOSURE_PROGRAM, 34850, 3), new e(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new e(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new e(TAG_OECF, 34856, 7), new e(TAG_SENSITIVITY_TYPE, 34864, 3), new e(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new e(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new e(TAG_ISO_SPEED, 34867, 4), new e(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new e(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new e(TAG_EXIF_VERSION, 36864, 2), new e(TAG_DATETIME_ORIGINAL, 36867, 2), new e(TAG_DATETIME_DIGITIZED, 36868, 2), new e(TAG_OFFSET_TIME, 36880, 2), new e(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new e(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new e(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new e(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new e(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new e(TAG_APERTURE_VALUE, 37378, 5), new e(TAG_BRIGHTNESS_VALUE, 37379, 10), new e(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new e(TAG_MAX_APERTURE_VALUE, 37381, 5), new e(TAG_SUBJECT_DISTANCE, 37382, 5), new e(TAG_METERING_MODE, 37383, 3), new e(TAG_LIGHT_SOURCE, 37384, 3), new e(TAG_FLASH, 37385, 3), new e(TAG_FOCAL_LENGTH, 37386, 5), new e(TAG_SUBJECT_AREA, 37396, 3), new e(TAG_MAKER_NOTE, 37500, 7), new e(TAG_USER_COMMENT, 37510, 7), new e(TAG_SUBSEC_TIME, 37520, 2), new e(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new e(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new e(TAG_FLASHPIX_VERSION, 40960, 7), new e(TAG_COLOR_SPACE, 40961, 3), new e(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new e(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new e(TAG_RELATED_SOUND_FILE, 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e(TAG_FLASH_ENERGY, 41483, 5), new e(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new e(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new e(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new e(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new e(TAG_SUBJECT_LOCATION, 41492, 3), new e(TAG_EXPOSURE_INDEX, 41493, 5), new e(TAG_SENSING_METHOD, 41495, 3), new e(TAG_FILE_SOURCE, 41728, 7), new e(TAG_SCENE_TYPE, 41729, 7), new e(TAG_CFA_PATTERN, 41730, 7), new e(TAG_CUSTOM_RENDERED, 41985, 3), new e(TAG_EXPOSURE_MODE, 41986, 3), new e(TAG_WHITE_BALANCE, 41987, 3), new e(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new e(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new e(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new e(TAG_GAIN_CONTROL, 41991, 3), new e(TAG_CONTRAST, 41992, 3), new e(TAG_SATURATION, 41993, 3), new e(TAG_SHARPNESS, 41994, 3), new e(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new e(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new e(TAG_IMAGE_UNIQUE_ID, 42016, 2), new e("CameraOwnerName", 42032, 2), new e(TAG_BODY_SERIAL_NUMBER, 42033, 2), new e(TAG_LENS_SPECIFICATION, 42034, 5), new e(TAG_LENS_MAKE, 42035, 2), new e(TAG_LENS_MODEL, 42036, 2), new e(TAG_GAMMA, 42240, 5), new e(TAG_DNG_VERSION, 50706, 1), new e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        e[] eVarArr3 = {new e(TAG_GPS_VERSION_ID, 0, 1), new e(TAG_GPS_LATITUDE_REF, 1, 2), new e(TAG_GPS_LATITUDE, 2, 5, 10), new e(TAG_GPS_LONGITUDE_REF, 3, 2), new e(TAG_GPS_LONGITUDE, 4, 5, 10), new e(TAG_GPS_ALTITUDE_REF, 5, 1), new e(TAG_GPS_ALTITUDE, 6, 5), new e(TAG_GPS_TIMESTAMP, 7, 5), new e(TAG_GPS_SATELLITES, 8, 2), new e(TAG_GPS_STATUS, 9, 2), new e(TAG_GPS_MEASURE_MODE, 10, 2), new e(TAG_GPS_DOP, 11, 5), new e(TAG_GPS_SPEED_REF, 12, 2), new e(TAG_GPS_SPEED, 13, 5), new e(TAG_GPS_TRACK_REF, 14, 2), new e(TAG_GPS_TRACK, 15, 5), new e(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new e(TAG_GPS_IMG_DIRECTION, 17, 5), new e(TAG_GPS_MAP_DATUM, 18, 2), new e(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new e(TAG_GPS_DEST_LATITUDE, 20, 5), new e(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new e(TAG_GPS_DEST_LONGITUDE, 22, 5), new e(TAG_GPS_DEST_BEARING_REF, 23, 2), new e(TAG_GPS_DEST_BEARING, 24, 5), new e(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new e(TAG_GPS_DEST_DISTANCE, 26, 5), new e(TAG_GPS_PROCESSING_METHOD, 27, 7), new e(TAG_GPS_AREA_INFORMATION, 28, 7), new e(TAG_GPS_DATESTAMP, 29, 2), new e(TAG_GPS_DIFFERENTIAL, 30, 3), new e(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        e[] eVarArr4 = {new e(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        e[] eVarArr5 = {new e(TAG_NEW_SUBFILE_TYPE, 254, 4), new e(TAG_SUBFILE_TYPE, 255, 4), new e(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new e(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new e(TAG_BITS_PER_SAMPLE, 258, 3), new e(TAG_COMPRESSION, 259, 3), new e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new e(TAG_IMAGE_DESCRIPTION, BarcodeUtils.ROTATION_270, 2), new e(TAG_MAKE, 271, 2), new e(TAG_MODEL, 272, 2), new e(TAG_STRIP_OFFSETS, 273, 3, 4), new e(TAG_THUMBNAIL_ORIENTATION, 274, 3), new e(TAG_SAMPLES_PER_PIXEL, 277, 3), new e(TAG_ROWS_PER_STRIP, 278, 3, 4), new e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new e(TAG_X_RESOLUTION, 282, 5), new e(TAG_Y_RESOLUTION, 283, 5), new e(TAG_PLANAR_CONFIGURATION, 284, 3), new e(TAG_RESOLUTION_UNIT, 296, 3), new e(TAG_TRANSFER_FUNCTION, 301, 3), new e(TAG_SOFTWARE, 305, 2), new e(TAG_DATETIME, 306, 2), new e(TAG_ARTIST, 315, 2), new e(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new e("SubIFDPointer", 330, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new e(TAG_Y_CB_CR_POSITIONING, 531, 3), new e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new e(TAG_COPYRIGHT, 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e(TAG_DNG_VERSION, 50706, 1), new e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        W = new e(TAG_STRIP_OFFSETS, 273, 3);
        X = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new e(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)}, new e[]{new e(TAG_ORF_ASPECT_FRAME, 4371, 3)}, new e[]{new e(TAG_COLOR_SPACE, 55, 3)}};
        Y = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        Z = new HashMap[10];
        f21409a0 = new HashMap[10];
        f21410b0 = new HashSet<>(Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE, TAG_GPS_TIMESTAMP));
        f21411c0 = new HashMap<>();
        Charset charsetForName = Charset.forName(Veridas.US_ASCII);
        f21412d0 = charsetForName;
        f21413e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f21414f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Veridas.EXIF_SHORT_DATE_FORMAT, locale);
        R = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        S = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr6 = X;
            if (i10 >= eVarArr6.length) {
                HashMap<Integer, Integer> map = f21411c0;
                e[] eVarArr7 = Y;
                map.put(Integer.valueOf(eVarArr7[0].f21456a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f21456a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f21456a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f21456a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f21456a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f21456a), 8);
                f21415g0 = Pattern.compile(".*[1-9].*");
                f21416h0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                i0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f21417j0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i10] = new HashMap<>();
            f21409a0[i10] = new HashMap<>();
            for (e eVar : eVarArr6[i10]) {
                Z[i10].put(Integer.valueOf(eVar.f21456a), eVar);
                f21409a0[i10].put(eVar.f21457b, eVar);
            }
            i10++;
        }
    }

    public ExifInterface(@NonNull File file) throws Throwable {
        e[][] eVarArr = X;
        this.f21428f = new HashMap[eVarArr.length];
        this.f21429g = new HashSet(eVarArr.length);
        this.f21430h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        q(file.getAbsolutePath());
    }

    public static String b(double d2) {
        long j10 = (long) d2;
        double d3 = d2 - j10;
        long j11 = (long) (d3 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d3 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public static double c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d3 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d7 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d3 / 60.0d) + d2;
            if (!str2.equals(LATITUDE_SOUTH) && !str2.equals(LONGITUDE_WEST)) {
                if (!str2.equals("N") && !str2.equals(LONGITUDE_EAST)) {
                    throw new IllegalArgumentException();
                }
                return d7;
            }
            return -d7;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean isSupportedMimeType(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        byte b10 = -1;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    b10 = 0;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    b10 = 1;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    b10 = 2;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    b10 = 3;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    b10 = 4;
                }
                break;
            case -1487394660:
                if (lowerCase.equals(Veridas.JPEG_MIME_TYPE)) {
                    b10 = 5;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    b10 = 6;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    b10 = 7;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    b10 = 8;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    b10 = 9;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    b10 = 10;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    b10 = 11;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    b10 = 12;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    b10 = 13;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    public static Pair<Integer, Integer> o(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairO = o(strArrSplit[0]);
            if (((Integer) pairO.first).intValue() == 2) {
                return pairO;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairO2 = o(strArrSplit[i10]);
                int iIntValue = (((Integer) pairO2.first).equals(pairO.first) || ((Integer) pairO2.second).equals(pairO.first)) ? ((Integer) pairO.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairO.second).intValue() == -1 || !(((Integer) pairO2.first).equals(pairO.second) || ((Integer) pairO2.second).equals(pairO.second))) ? -1 : ((Integer) pairO.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairO = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairO = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairO;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    if (lValueOf.longValue() < 0 || lValueOf.longValue() > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return lValueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j10 >= 0 && j11 >= 0) {
                    if (j10 <= 2147483647L && j11 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static Long t(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        long j10;
        if (str != null && f21415g0.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = R.parse(str, parsePosition);
                if (date == null && (date = S.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    String strSubstring = str3.substring(0, 1);
                    int i10 = Integer.parseInt(str3.substring(1, 3));
                    int i11 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || Constant.DASH_STRING.equals(strSubstring)) && DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER.equals(str3.substring(3, 4)) && i10 <= 14) {
                        time += (long) (((i10 * 60) + i11) * 60000 * (Constant.DASH_STRING.equals(strSubstring) ? 1 : -1));
                    }
                }
                if (str2 != null) {
                    try {
                        int iMin = Math.min(str2.length(), 3);
                        j10 = Long.parseLong(str2.substring(0, iMin));
                        while (iMin < 3) {
                            j10 *= 10;
                            iMin++;
                        }
                    } catch (NumberFormatException unused) {
                        j10 = 0;
                    }
                    time += j10;
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused2) {
            }
        }
        return null;
    }

    public static ByteOrder w(b bVar) throws IOException {
        short s4 = bVar.readShort();
        if (s4 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s4 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s4));
    }

    public final void A(int i10, String str, String str2) {
        HashMap<String, d>[] mapArr = this.f21428f;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f21418v) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        String attribute = getAttribute(TAG_XMP);
        HashMap<String, d>[] mapArr = this.f21428f;
        d dVarRemove = (attribute == null || !this.f21442u) ? null : mapArr[0].remove(TAG_XMP);
        cVar.a(-1);
        cVar.a(-31);
        I(cVar);
        if (dVarRemove != null) {
            mapArr[0].put(TAG_XMP, dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.a(-1);
                cVar.a(b10);
                androidx.exifinterface.media.a.d(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.a(-1);
                cVar.a(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.e(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i11);
                    i10 -= i11;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i12 = unsignedShort2 - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i12 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f21413e0)) {
                        bVar.a(unsignedShort2 - 8);
                    }
                }
                cVar.a(-1);
                cVar.a(b10);
                cVar.e(unsignedShort2);
                if (i12 >= 6) {
                    i12 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i12 > 0) {
                    int i13 = bVar.read(bArr, 0, Math.min(i12, 4096));
                    if (i13 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i13);
                    i12 -= i13;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f21418v) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = E;
        androidx.exifinterface.media.a.c(bVar, cVar, bArr.length);
        int i10 = this.f21437p;
        if (i10 == 0) {
            int i11 = bVar.readInt();
            cVar.b(i11);
            androidx.exifinterface.media.a.c(bVar, cVar, i11 + 8);
        } else {
            androidx.exifinterface.media.a.c(bVar, cVar, (i10 - bArr.length) - 8);
            bVar.a(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                I(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f21450p0).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                androidx.exifinterface.media.a.a(byteArrayOutputStream2);
                androidx.exifinterface.media.a.d(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.a.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        int i10;
        int i11;
        boolean z10;
        int i12;
        byte[] bArr;
        if (f21418v) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = I;
        androidx.exifinterface.media.a.c(bVar, cVar, bArr2.length);
        byte[] bArr3 = J;
        bVar.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.f21437p;
                    if (i13 != 0) {
                        androidx.exifinterface.media.a.c(bVar, cVar2, (i13 - ((bArr2.length + 4) + bArr3.length)) - 8);
                        bVar.a(4);
                        int i14 = bVar.readInt();
                        if (i14 % 2 != 0) {
                            i14++;
                        }
                        bVar.a(i14);
                        I(cVar2);
                    } else {
                        byte[] bArr4 = new byte[4];
                        bVar.readFully(bArr4);
                        byte[] bArr5 = M;
                        boolean zEquals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = O;
                        byte[] bArr7 = N;
                        if (!zEquals) {
                            if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                int i15 = bVar.readInt();
                                int i16 = i15 % 2 == 1 ? i15 + 1 : i15;
                                byte[] bArr8 = new byte[3];
                                boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                byte[] bArr9 = L;
                                if (zEquals2) {
                                    bVar.readFully(bArr8);
                                    byte[] bArr10 = new byte[3];
                                    bVar.readFully(bArr10);
                                    if (!Arrays.equals(bArr9, bArr10)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i10 = bVar.readInt();
                                    i16 -= 10;
                                    i11 = (i10 << 18) >> 18;
                                    i12 = (i10 << 2) >> 18;
                                    z10 = false;
                                } else if (!Arrays.equals(bArr4, bArr7)) {
                                    i10 = 0;
                                    i11 = 0;
                                    z10 = false;
                                    i12 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Error checking VP8L signature");
                                    }
                                    i10 = bVar.readInt();
                                    z10 = true;
                                    i11 = (i10 & 16383) + 1;
                                    i12 = ((i10 & 268419072) >>> 14) + 1;
                                    if ((i10 & 268435456) == 0) {
                                        z10 = false;
                                    }
                                    i16 -= 5;
                                }
                                cVar2.write(bArr5);
                                cVar2.b(10);
                                byte[] bArr11 = new byte[10];
                                if (z10) {
                                    bArr11[0] = (byte) (bArr11[0] | 16);
                                }
                                bArr11[0] = (byte) (bArr11[0] | 8);
                                int i17 = i11 - 1;
                                int i18 = i12 - 1;
                                bArr11[4] = (byte) i17;
                                bArr11[5] = (byte) (i17 >> 8);
                                bArr11[6] = (byte) (i17 >> 16);
                                bArr11[7] = (byte) i18;
                                bArr11[8] = (byte) (i18 >> 8);
                                bArr11[9] = (byte) (i18 >> 16);
                                cVar2.write(bArr11);
                                cVar2.write(bArr4);
                                cVar2.b(i15);
                                if (Arrays.equals(bArr4, bArr6)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(bArr9);
                                    cVar2.b(i10);
                                } else if (Arrays.equals(bArr4, bArr7)) {
                                    cVar2.write(47);
                                    cVar2.b(i10);
                                }
                                androidx.exifinterface.media.a.c(bVar, cVar2, i16);
                                I(cVar2);
                            }
                            androidx.exifinterface.media.a.d(bVar, cVar2);
                            c cVar3 = cVar;
                            cVar3.b(byteArrayOutputStream2.size() + bArr3.length);
                            cVar3.write(bArr3);
                            byteArrayOutputStream2.writeTo(cVar3);
                            androidx.exifinterface.media.a.a(byteArrayOutputStream2);
                        }
                        int i19 = bVar.readInt();
                        byte[] bArr12 = new byte[i19 % 2 == 1 ? i19 + 1 : i19];
                        bVar.readFully(bArr12);
                        byte b10 = (byte) (8 | bArr12[0]);
                        bArr12[0] = b10;
                        boolean z11 = ((b10 >> 1) & 1) == 1;
                        cVar2.write(bArr5);
                        cVar2.b(i19);
                        cVar2.write(bArr12);
                        if (z11) {
                            byte[] bArr13 = P;
                            do {
                                bArr = new byte[4];
                                bVar.readFully(bArr);
                                int i20 = bVar.readInt();
                                cVar2.write(bArr);
                                cVar2.b(i20);
                                if (i20 % 2 == 1) {
                                    i20++;
                                }
                                androidx.exifinterface.media.a.c(bVar, cVar2, i20);
                            } while (!Arrays.equals(bArr, bArr13));
                            while (true) {
                                byte[] bArr14 = new byte[4];
                                try {
                                    bVar.readFully(bArr14);
                                    if (!Arrays.equals(bArr14, Q)) {
                                        break;
                                    }
                                    int i21 = bVar.readInt();
                                    cVar2.write(bArr14);
                                    cVar2.b(i21);
                                    if (i21 % 2 == 1) {
                                        i21++;
                                    }
                                    androidx.exifinterface.media.a.c(bVar, cVar2, i21);
                                } catch (EOFException unused) {
                                }
                            }
                            I(cVar2);
                        } else {
                            while (true) {
                                byte[] bArr15 = new byte[4];
                                bVar.readFully(bArr15);
                                int i22 = bVar.readInt();
                                cVar2.write(bArr15);
                                cVar2.b(i22);
                                if (i22 % 2 == 1) {
                                    i22++;
                                }
                                androidx.exifinterface.media.a.c(bVar, cVar2, i22);
                                if (Arrays.equals(bArr15, bArr6) || (bArr7 != null && Arrays.equals(bArr15, bArr7))) {
                                    break;
                                }
                            }
                            I(cVar2);
                        }
                    }
                    cVar = cVar;
                    androidx.exifinterface.media.a.d(bVar, cVar2);
                    c cVar4 = cVar;
                    cVar4.b(byteArrayOutputStream2.size() + bArr3.length);
                    cVar4.write(bArr3);
                    byteArrayOutputStream2.writeTo(cVar4);
                    androidx.exifinterface.media.a.a(byteArrayOutputStream2);
                } catch (Exception e5) {
                    e = e5;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    androidx.exifinterface.media.a.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    public final void E(b bVar) throws Throwable {
        d dVar;
        HashMap<String, d> map = this.f21428f[4];
        d dVar2 = map.get(TAG_COMPRESSION);
        if (dVar2 == null) {
            this.f21436o = 6;
            p(bVar, map);
            return;
        }
        int iH = dVar2.h(this.f21430h);
        this.f21436o = iH;
        if (iH != 1) {
            if (iH == 6) {
                p(bVar, map);
                return;
            } else if (iH != 7) {
                return;
            }
        }
        d dVar3 = map.get(TAG_BITS_PER_SAMPLE);
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f21430h);
            int[] iArr2 = BITS_PER_SAMPLE_RGB;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f21426d != 3 || (dVar = map.get(TAG_PHOTOMETRIC_INTERPRETATION)) == null) {
                    return;
                }
                int iH2 = dVar.h(this.f21430h);
                if ((iH2 != 1 || !Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) && (iH2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            d dVar4 = map.get(TAG_STRIP_OFFSETS);
            d dVar5 = map.get(TAG_STRIP_BYTE_COUNTS);
            if (dVar4 == null || dVar5 == null) {
                return;
            }
            long[] jArrB = androidx.exifinterface.media.a.b(dVar4.j(this.f21430h));
            long[] jArrB2 = androidx.exifinterface.media.a.b(dVar5.j(this.f21430h));
            if (jArrB == null || jArrB.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrB2 == null || jArrB2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrB.length != jArrB2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j10 = 0;
            for (long j11 : jArrB2) {
                j10 += j11;
            }
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            this.f21433k = true;
            this.f21432j = true;
            this.f21431i = true;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < jArrB.length; i13++) {
                int i14 = (int) jArrB[i13];
                int i15 = (int) jArrB2[i13];
                if (i13 < jArrB.length - 1 && i14 + i15 != jArrB[i13 + 1]) {
                    this.f21433k = false;
                }
                int i16 = i14 - i11;
                if (i16 < 0) {
                    return;
                }
                try {
                    bVar.a(i16);
                    int i17 = i11 + i16;
                    byte[] bArr2 = new byte[i15];
                    bVar.readFully(bArr2);
                    i11 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i12, i15);
                    i12 += i15;
                } catch (EOFException unused) {
                    return;
                }
            }
            this.f21435n = bArr;
            if (this.f21433k) {
                this.f21434l = (int) jArrB[0];
                this.m = i10;
            }
        }
    }

    public final void F(int i10, int i11) throws Throwable {
        HashMap<String, d>[] mapArr = this.f21428f;
        if (mapArr[i10].isEmpty() || mapArr[i11].isEmpty()) {
            return;
        }
        d dVar = mapArr[i10].get(TAG_IMAGE_LENGTH);
        d dVar2 = mapArr[i10].get(TAG_IMAGE_WIDTH);
        d dVar3 = mapArr[i11].get(TAG_IMAGE_LENGTH);
        d dVar4 = mapArr[i11].get(TAG_IMAGE_WIDTH);
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int iH = dVar.h(this.f21430h);
        int iH2 = dVar2.h(this.f21430h);
        int iH3 = dVar3.h(this.f21430h);
        int iH4 = dVar4.h(this.f21430h);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void G(g gVar, int i10) throws Throwable {
        d dVarE;
        d dVarE2;
        HashMap<String, d>[] mapArr = this.f21428f;
        d dVar = mapArr[i10].get(TAG_DEFAULT_CROP_SIZE);
        d dVar2 = mapArr[i10].get(TAG_RW2_SENSOR_TOP_BORDER);
        d dVar3 = mapArr[i10].get(TAG_RW2_SENSOR_LEFT_BORDER);
        d dVar4 = mapArr[i10].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        d dVar5 = mapArr[i10].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (dVar != null) {
            if (dVar.f21452a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f21430h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarE = d.d(new f[]{fVarArr[0]}, this.f21430h);
                    dVarE2 = d.d(new f[]{fVarArr[1]}, this.f21430h);
                }
            } else {
                int[] iArr = (int[]) dVar.j(this.f21430h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarE = d.e(iArr[0], this.f21430h);
                dVarE2 = d.e(iArr[1], this.f21430h);
            }
            mapArr[i10].put(TAG_IMAGE_WIDTH, dVarE);
            mapArr[i10].put(TAG_IMAGE_LENGTH, dVarE2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int iH = dVar2.h(this.f21430h);
            int iH2 = dVar4.h(this.f21430h);
            int iH3 = dVar5.h(this.f21430h);
            int iH4 = dVar3.h(this.f21430h);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            d dVarE3 = d.e(iH2 - iH, this.f21430h);
            d dVarE4 = d.e(iH3 - iH4, this.f21430h);
            mapArr[i10].put(TAG_IMAGE_LENGTH, dVarE3);
            mapArr[i10].put(TAG_IMAGE_WIDTH, dVarE4);
            return;
        }
        d dVar6 = mapArr[i10].get(TAG_IMAGE_LENGTH);
        d dVar7 = mapArr[i10].get(TAG_IMAGE_WIDTH);
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = mapArr[i10].get(TAG_JPEG_INTERCHANGE_FORMAT);
            d dVar9 = mapArr[i10].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int iH5 = dVar8.h(this.f21430h);
            int iH6 = dVar8.h(this.f21430h);
            gVar.d(iH5);
            byte[] bArr = new byte[iH6];
            gVar.readFully(bArr);
            f(new b(bArr), iH5, i10);
        }
    }

    public final void H() throws Throwable {
        F(0, 5);
        F(0, 4);
        F(5, 4);
        HashMap<String, d>[] mapArr = this.f21428f;
        d dVar = mapArr[1].get(TAG_PIXEL_X_DIMENSION);
        d dVar2 = mapArr[1].get(TAG_PIXEL_Y_DIMENSION);
        if (dVar != null && dVar2 != null) {
            mapArr[0].put(TAG_IMAGE_WIDTH, dVar);
            mapArr[0].put(TAG_IMAGE_LENGTH, dVar2);
        }
        if (mapArr[4].isEmpty() && r(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        r(mapArr[4]);
        A(0, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        A(0, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        A(0, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        A(5, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        A(5, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        A(5, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        A(4, TAG_ORIENTATION, TAG_THUMBNAIL_ORIENTATION);
        A(4, TAG_IMAGE_LENGTH, TAG_THUMBNAIL_IMAGE_LENGTH);
        A(4, TAG_IMAGE_WIDTH, TAG_THUMBNAIL_IMAGE_WIDTH);
    }

    public final void I(c cVar) throws IOException {
        HashMap<String, d>[] mapArr;
        int[] iArr;
        e[][] eVarArr = X;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = Y;
        for (e eVar : eVarArr2) {
            z(eVar.f21457b);
        }
        if (this.f21431i) {
            if (this.f21432j) {
                z(TAG_STRIP_OFFSETS);
                z(TAG_STRIP_BYTE_COUNTS);
            } else {
                z(TAG_JPEG_INTERCHANGE_FORMAT);
                z(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            }
        }
        int i10 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f21428f;
            if (i10 >= length) {
                break;
            }
            Object[] array = mapArr[i10].entrySet().toArray();
            int length2 = array.length;
            int i11 = 0;
            while (i11 < length2) {
                Map.Entry entry = (Map.Entry) array[i11];
                if (entry.getValue() == null) {
                    mapArr[i10].remove(entry.getKey());
                }
                i11++;
                array = array;
            }
            i10++;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(eVarArr2[1].f21457b, d.b(0L, this.f21430h));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(eVarArr2[2].f21457b, d.b(0L, this.f21430h));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(eVarArr2[3].f21457b, d.b(0L, this.f21430h));
        }
        if (this.f21431i) {
            if (this.f21432j) {
                mapArr[4].put(TAG_STRIP_OFFSETS, d.e(0, this.f21430h));
                mapArr[4].put(TAG_STRIP_BYTE_COUNTS, d.e(this.m, this.f21430h));
            } else {
                mapArr[4].put(TAG_JPEG_INTERCHANGE_FORMAT, d.b(0L, this.f21430h));
                mapArr[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, d.b(this.m, this.f21430h));
            }
        }
        int i12 = 0;
        while (true) {
            int length3 = eVarArr.length;
            iArr = U;
            if (i12 >= length3) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = mapArr[i12].entrySet().iterator();
            int i13 = 0;
            while (it.hasNext()) {
                d value = it.next().getValue();
                value.getClass();
                int i14 = iArr[value.f21452a] * value.f21453b;
                if (i14 > 4) {
                    i13 += i14;
                }
            }
            iArr3[i12] = iArr3[i12] + i13;
            i12++;
        }
        int size = 8;
        for (int i15 = 0; i15 < eVarArr.length; i15++) {
            if (!mapArr[i15].isEmpty()) {
                iArr2[i15] = size;
                size = (mapArr[i15].size() * 12) + 6 + iArr3[i15] + size;
            }
        }
        if (this.f21431i) {
            if (this.f21432j) {
                mapArr[4].put(TAG_STRIP_OFFSETS, d.e(size, this.f21430h));
            } else {
                mapArr[4].put(TAG_JPEG_INTERCHANGE_FORMAT, d.b(size, this.f21430h));
            }
            this.f21434l = size;
            size += this.m;
        }
        if (this.f21426d == 4) {
            size += 8;
        }
        if (f21418v) {
            for (int i16 = 0; i16 < eVarArr.length; i16++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i16), Integer.valueOf(iArr2[i16]), Integer.valueOf(mapArr[i16].size()), Integer.valueOf(iArr3[i16]), Integer.valueOf(size));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(eVarArr2[1].f21457b, d.b(iArr2[1], this.f21430h));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(eVarArr2[2].f21457b, d.b(iArr2[2], this.f21430h));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(eVarArr2[3].f21457b, d.b(iArr2[3], this.f21430h));
        }
        int i17 = this.f21426d;
        if (i17 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.b.a("Size of exif data (", size, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.e(size);
            cVar.write(f21413e0);
        } else if (i17 == 13) {
            cVar.b(size);
            cVar.write(F);
        } else if (i17 == 14) {
            cVar.write(K);
            cVar.b(size);
        }
        cVar.c(this.f21430h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f21451q0 = this.f21430h;
        cVar.e(42);
        cVar.d(8L);
        for (int i18 = 0; i18 < eVarArr.length; i18++) {
            if (!mapArr[i18].isEmpty()) {
                cVar.e(mapArr[i18].size());
                int size2 = (mapArr[i18].size() * 12) + iArr2[i18] + 2 + 4;
                for (Map.Entry<String, d> entry2 : mapArr[i18].entrySet()) {
                    int i19 = f21409a0[i18].get(entry2.getKey()).f21456a;
                    d value2 = entry2.getValue();
                    value2.getClass();
                    int i20 = value2.f21452a;
                    int i21 = iArr[i20];
                    int i22 = value2.f21453b;
                    int i23 = i21 * i22;
                    cVar.e(i19);
                    cVar.e(i20);
                    cVar.b(i22);
                    if (i23 > 4) {
                        cVar.d(size2);
                        size2 += i23;
                    } else {
                        cVar.write(value2.f21455d);
                        if (i23 < 4) {
                            while (i23 < 4) {
                                cVar.a(0);
                                i23++;
                            }
                        }
                    }
                }
                if (i18 != 0 || mapArr[4].isEmpty()) {
                    cVar.d(0L);
                } else {
                    cVar.d(iArr2[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = mapArr[i18].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f21455d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f21431i) {
            cVar.write(getThumbnailBytes());
        }
        if (this.f21426d == 14 && size % 2 == 1) {
            cVar.a(0);
        }
        cVar.f21451q0 = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        HashMap<String, d>[] mapArr = this.f21428f;
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            mapArr[0].put(TAG_DATETIME, d.a(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            mapArr[0].put(TAG_IMAGE_WIDTH, d.b(0L, this.f21430h));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            mapArr[0].put(TAG_IMAGE_LENGTH, d.b(0L, this.f21430h));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            mapArr[0].put(TAG_ORIENTATION, d.b(0L, this.f21430h));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            mapArr[1].put(TAG_LIGHT_SOURCE, d.b(0L, this.f21430h));
        }
    }

    @Nullable
    public final d d(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i10 = 0; i10 < X.length; i10++) {
            d dVar = this.f21428f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void e(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                androidx.exifinterface.media.a.b.a(mediaMetadataRetriever, new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, d>[] mapArr = this.f21428f;
                if (strExtractMetadata != null) {
                    mapArr[0].put(TAG_IMAGE_WIDTH, d.e(Integer.parseInt(strExtractMetadata), this.f21430h));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put(TAG_IMAGE_LENGTH, d.e(Integer.parseInt(strExtractMetadata2), this.f21430h));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put(TAG_ORIENTATION, d.e(i10, this.f21430h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.d(i12);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f21413e0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    gVar.readFully(bArr2);
                    this.f21437p = i14;
                    x(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed A[LOOP:2: B:65:0x00e3->B:70:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136 A[LOOP:0: B:10:0x0023->B:78:0x0136, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0062. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(androidx.exifinterface.media.ExifInterface.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.f(androidx.exifinterface.media.ExifInterface$b, int, int):void");
    }

    public void flipHorizontally() {
        int i10 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i10));
    }

    public void flipVertically() {
        int i10 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i10));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a A[LOOP:3: B:107:0x012e->B:112:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0143  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d A[LOOP:4: B:114:0x013e->B:119:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x0153 A[LOOP:2: B:102:0x0122->B:122:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x014c A[EDGE_INSN: B:153:0x014c->B:118:0x014c BREAK  A[LOOP:3: B:107:0x012e->B:112:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x014c A[EDGE_INSN: B:155:0x014c->B:118:0x014c BREAK  A[LOOP:3: B:107:0x012e->B:112:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109 A[RETURN] */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        int i10;
        byte[] bArr;
        int i11;
        byte[] bArr2;
        int i12;
        byte[] bArr3;
        b bVar7;
        boolean z10;
        short s4;
        boolean z11;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr5 = f21421y;
            if (i13 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i13] != bArr5[i13]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i14 = 0; i14 < bytes.length; i14++) {
                    if (bArr4[i14] != bytes[i14]) {
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                long j11 = bVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                bVar2.readFully(bArr6);
                                if (Arrays.equals(bArr6, f21422z)) {
                                    if (j11 == 1) {
                                        j11 = bVar2.readLong();
                                        j10 = 16;
                                        if (j11 < 16) {
                                        }
                                    } else {
                                        j10 = 8;
                                    }
                                    long j12 = 5000;
                                    if (j11 > j12) {
                                        j11 = j12;
                                    }
                                    long j13 = j11 - j10;
                                    if (j13 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        boolean z12 = false;
                                        boolean z13 = false;
                                        for (long j14 = 0; j14 < j13 / 4; j14++) {
                                            try {
                                                bVar2.readFully(bArr7);
                                                if (j14 != 1) {
                                                    if (Arrays.equals(bArr7, A)) {
                                                        z12 = true;
                                                    } else if (Arrays.equals(bArr7, B)) {
                                                        z13 = true;
                                                    }
                                                    if (z12 && z13) {
                                                        bVar2.close();
                                                        return 12;
                                                    }
                                                }
                                            } catch (EOFException unused) {
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                                if (bVar2 != null) {
                                }
                                bVar4 = new b(bArr4);
                                ByteOrder byteOrderW = w(bVar4);
                                this.f21430h = byteOrderW;
                                bVar4.f21447r0 = byteOrderW;
                                s4 = bVar4.readShort();
                                if (s4 != 20306) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                bVar4.close();
                                if (z11) {
                                    return 7;
                                }
                                bVar7 = new b(bArr4);
                                try {
                                    ByteOrder byteOrderW2 = w(bVar7);
                                    this.f21430h = byteOrderW2;
                                    bVar7.f21447r0 = byteOrderW2;
                                    if (bVar7.readShort() == 85) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    bVar7.close();
                                    if (z10) {
                                        return 10;
                                    }
                                    while (true) {
                                        bArr = E;
                                        if (i10 < bArr.length) {
                                            return 13;
                                        }
                                        if (bArr4[i10] != bArr[i10]) {
                                            i11 = 0;
                                            while (true) {
                                                bArr2 = I;
                                                if (i11 < bArr2.length) {
                                                    i12 = 0;
                                                    while (true) {
                                                        bArr3 = J;
                                                        if (i12 < bArr3.length) {
                                                            return 14;
                                                        }
                                                        if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                            break;
                                                        }
                                                        i12++;
                                                    }
                                                } else {
                                                    if (bArr4[i11] != bArr2[i11]) {
                                                        break;
                                                    }
                                                    i11++;
                                                }
                                            }
                                            return 0;
                                        }
                                        i10++;
                                    }
                                } catch (Exception unused3) {
                                    bVar6 = bVar7;
                                    if (bVar6 != null) {
                                        bVar6.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar5 = bVar7;
                                    if (bVar5 != null) {
                                        bVar5.close();
                                    }
                                    throw th;
                                }
                                i10 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            bVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = null;
                        }
                        bVar2.close();
                        try {
                            try {
                                bVar4 = new b(bArr4);
                                try {
                                    ByteOrder byteOrderW3 = w(bVar4);
                                    this.f21430h = byteOrderW3;
                                    bVar4.f21447r0 = byteOrderW3;
                                    s4 = bVar4.readShort();
                                    if (s4 != 20306 || s4 == 21330) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    bVar4.close();
                                    if (z11) {
                                        return 7;
                                    }
                                    while (true) {
                                        bArr = E;
                                        if (i10 < bArr.length) {
                                            return 13;
                                        }
                                        if (bArr4[i10] != bArr[i10]) {
                                            i11 = 0;
                                            while (true) {
                                                bArr2 = I;
                                                if (i11 < bArr2.length) {
                                                    i12 = 0;
                                                    while (true) {
                                                        bArr3 = J;
                                                        if (i12 < bArr3.length) {
                                                            return 14;
                                                        }
                                                        if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                            break;
                                                            break;
                                                        }
                                                        i12++;
                                                    }
                                                } else {
                                                    if (bArr4[i11] != bArr2[i11]) {
                                                        break;
                                                        break;
                                                    }
                                                    i11++;
                                                }
                                            }
                                            return 0;
                                        }
                                        i10++;
                                    }
                                } catch (Exception unused5) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVar3 = bVar4;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused6) {
                                bVar4 = null;
                            } catch (Throwable th6) {
                                th = th6;
                                bVar3 = null;
                            }
                            bVar7 = new b(bArr4);
                            ByteOrder byteOrderW4 = w(bVar7);
                            this.f21430h = byteOrderW4;
                            bVar7.f21447r0 = byteOrderW4;
                            if (bVar7.readShort() == 85) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bVar7.close();
                            if (z10) {
                                return 10;
                            }
                        } catch (Exception unused7) {
                            bVar6 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            bVar5 = null;
                        }
                        i10 = 0;
                    }
                }
                return 9;
            }
            i13++;
        }
    }

    public double getAltitude(double d2) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d2;
        }
        return attributeDouble * ((double) (attributeInt != 1 ? 1 : -1));
    }

    @Nullable
    public String getAttribute(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarD = d(str);
        if (dVarD != null) {
            if (!f21410b0.contains(str)) {
                return dVarD.i(this.f21430h);
            }
            if (str.equals(TAG_GPS_TIMESTAMP)) {
                int i10 = dVarD.f21452a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                f[] fVarArr = (f[]) dVarD.j(this.f21430h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                f fVar2 = fVarArr[1];
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (fVar.f21460a / fVar.f21461b)), Integer.valueOf((int) (fVar2.f21460a / fVar2.f21461b)), Integer.valueOf((int) (fVar3.f21460a / fVar3.f21461b)));
            }
            try {
                return Double.toString(dVarD.g(this.f21430h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    public byte[] getAttributeBytes(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarD = d(str);
        if (dVarD != null) {
            return dVarD.f21455d;
        }
        return null;
    }

    public double getAttributeDouble(@NonNull String str, double d2) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarD = d(str);
        if (dVarD == null) {
            return d2;
        }
        try {
            return dVarD.g(this.f21430h);
        } catch (NumberFormatException unused) {
            return d2;
        }
    }

    public int getAttributeInt(@NonNull String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarD = d(str);
        if (dVarD == null) {
            return i10;
        }
        try {
            return dVarD.h(this.f21430h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    @Nullable
    public long[] getAttributeRange(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f21441t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d dVarD = d(str);
        if (dVarD != null) {
            return new long[]{dVarD.f21454c, dVarD.f21455d.length};
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTime() {
        return t(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeDigitized() {
        return t(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeOriginal() {
        return t(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    @Nullable
    @SuppressLint({"AutoBoxing"})
    public Long getGpsDateTime() {
        String attribute = getAttribute(TAG_GPS_DATESTAMP);
        String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            Pattern pattern = f21415g0;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String strE = ad.d.e(attribute, ' ', attribute2);
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = R.parse(strE, parsePosition);
                    if (date == null && (date = S.parse(strE, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return BarcodeUtils.ROTATION_270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @Nullable
    public byte[] getThumbnail() {
        int i10 = this.f21436o;
        if (i10 == 6 || i10 == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    @Nullable
    public Bitmap getThumbnailBitmap() throws Throwable {
        if (!this.f21431i) {
            return null;
        }
        if (this.f21435n == null) {
            this.f21435n = getThumbnailBytes();
        }
        int i10 = this.f21436o;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f21435n, 0, this.m);
        }
        if (i10 == 1) {
            int length = this.f21435n.length / 3;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr = this.f21435n;
                int i12 = i11 * 3;
                iArr[i11] = (bArr[i12] << 16) + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
            }
            HashMap<String, d>[] mapArr = this.f21428f;
            d dVar = mapArr[4].get(TAG_THUMBNAIL_IMAGE_LENGTH);
            d dVar2 = mapArr[4].get(TAG_THUMBNAIL_IMAGE_WIDTH);
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.h(this.f21430h), dVar.h(this.f21430h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    @Nullable
    public byte[] getThumbnailBytes() throws Throwable {
        Throwable th2;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th3;
        InputStream inputStream = null;
        if (!this.f21431i) {
            return null;
        }
        byte[] bArr = this.f21435n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.f21425c;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        androidx.exifinterface.media.a.a(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception unused) {
                    fileDescriptor = null;
                } catch (Throwable th4) {
                    inputStream = fileInputStream;
                    th2 = th4;
                    fileDescriptor = null;
                    androidx.exifinterface.media.a.a(inputStream);
                    if (fileDescriptor == null) {
                        throw th2;
                    }
                    try {
                        androidx.exifinterface.media.a.C0083a.a(fileDescriptor);
                        throw th2;
                    } catch (Exception unused2) {
                        throw th2;
                    }
                }
                androidx.exifinterface.media.a.a(fileInputStream);
                if (fileDescriptor != null) {
                    try {
                        androidx.exifinterface.media.a.C0083a.a(fileDescriptor);
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
            if (this.f21423a != null) {
                fileInputStream = new FileInputStream(this.f21423a);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorB = androidx.exifinterface.media.a.C0083a.b(this.f21424b);
                try {
                    androidx.exifinterface.media.a.C0083a.c(fileDescriptorB, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorB;
                    fileInputStream = new FileInputStream(fileDescriptorB);
                } catch (Exception unused4) {
                    fileDescriptor = fileDescriptorB;
                    fileInputStream = null;
                } catch (Throwable th5) {
                    th3 = th5;
                    fileDescriptor = fileDescriptorB;
                    th2 = th3;
                    androidx.exifinterface.media.a.a(inputStream);
                    if (fileDescriptor == null) {
                        throw th2;
                    }
                    androidx.exifinterface.media.a.C0083a.a(fileDescriptor);
                    throw th2;
                }
            }
            try {
                b bVar = new b(fileInputStream);
                bVar.a(this.f21434l + this.f21437p);
                byte[] bArr2 = new byte[this.m];
                bVar.readFully(bArr2);
                this.f21435n = bArr2;
                androidx.exifinterface.media.a.a(fileInputStream);
                if (fileDescriptor != null) {
                    try {
                        androidx.exifinterface.media.a.C0083a.a(fileDescriptor);
                    } catch (Exception unused5) {
                    }
                }
                return bArr2;
            } catch (Exception unused6) {
            } catch (Throwable th6) {
                th3 = th6;
                inputStream = fileInputStream;
                th2 = th3;
                androidx.exifinterface.media.a.a(inputStream);
                if (fileDescriptor == null) {
                    throw th2;
                }
                androidx.exifinterface.media.a.C0083a.a(fileDescriptor);
                throw th2;
            }
        } catch (Exception unused7) {
            fileInputStream = null;
            fileDescriptor = null;
        } catch (Throwable th7) {
            th2 = th7;
            fileDescriptor = null;
        }
    }

    @Nullable
    public long[] getThumbnailRange() {
        if (this.f21441t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f21431i) {
            return null;
        }
        if (!this.f21432j || this.f21433k) {
            return new long[]{this.f21434l + this.f21437p, this.m};
        }
        return null;
    }

    public final void h(g gVar) throws Throwable {
        int i10;
        int i11;
        k(gVar);
        HashMap<String, d>[] mapArr = this.f21428f;
        d dVar = mapArr[1].get(TAG_MAKER_NOTE);
        if (dVar != null) {
            g gVar2 = new g(dVar.f21455d);
            gVar2.f21447r0 = this.f21430h;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.d(0L);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.d(12L);
            }
            y(gVar2, 6);
            d dVar2 = mapArr[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            d dVar3 = mapArr[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put(TAG_JPEG_INTERCHANGE_FORMAT, dVar2);
                mapArr[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, dVar3);
            }
            d dVar4 = mapArr[8].get(TAG_ORF_ASPECT_FRAME);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f21430h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarE = d.e(i14, this.f21430h);
                d dVarE2 = d.e(i15, this.f21430h);
                mapArr[0].put(TAG_IMAGE_WIDTH, dVarE);
                mapArr[0].put(TAG_IMAGE_LENGTH, dVarE2);
            }
        }
    }

    public boolean hasAttribute(@NonNull String str) {
        return d(str) != null;
    }

    public boolean hasThumbnail() {
        return this.f21431i;
    }

    public final void i(b bVar) throws Throwable {
        if (f21418v) {
            Objects.toString(bVar);
        }
        bVar.f21447r0 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, H)) {
                    return;
                }
                if (Arrays.equals(bArr2, F)) {
                    byte[] bArr3 = new byte[i10];
                    bVar.readFully(bArr3);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f21437p = i11;
                        x(0, bArr3);
                        H();
                        E(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.a(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.f21431i) {
            return false;
        }
        int i10 = this.f21436o;
        return i10 == 6 || i10 == 7;
    }

    public final void j(b bVar) throws Throwable {
        if (f21418v) {
            Objects.toString(bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f21446q0);
        bVar.readFully(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f21446q0);
        bVar.f21447r0 = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == W.f21456a) {
                short s4 = bVar.readShort();
                short s7 = bVar.readShort();
                d dVarE = d.e(s4, this.f21430h);
                d dVarE2 = d.e(s7, this.f21430h);
                HashMap<String, d>[] mapArr = this.f21428f;
                mapArr[0].put(TAG_IMAGE_LENGTH, dVarE);
                mapArr[0].put(TAG_IMAGE_WIDTH, dVarE2);
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void k(g gVar) throws Throwable {
        u(gVar);
        y(gVar, 0);
        G(gVar, 0);
        G(gVar, 5);
        G(gVar, 4);
        H();
        if (this.f21426d == 8) {
            HashMap<String, d>[] mapArr = this.f21428f;
            d dVar = mapArr[1].get(TAG_MAKER_NOTE);
            if (dVar != null) {
                g gVar2 = new g(dVar.f21455d);
                gVar2.f21447r0 = this.f21430h;
                gVar2.a(6);
                y(gVar2, 9);
                d dVar2 = mapArr[9].get(TAG_COLOR_SPACE);
                if (dVar2 != null) {
                    mapArr[1].put(TAG_COLOR_SPACE, dVar2);
                }
            }
        }
    }

    public final void l(g gVar) throws Throwable {
        if (f21418v) {
            Objects.toString(gVar);
        }
        k(gVar);
        HashMap<String, d>[] mapArr = this.f21428f;
        d dVar = mapArr[0].get(TAG_RW2_JPG_FROM_RAW);
        if (dVar != null) {
            f(new b(dVar.f21455d), (int) dVar.f21454c, 5);
        }
        d dVar2 = mapArr[0].get(TAG_RW2_ISO);
        d dVar3 = mapArr[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, dVar2);
    }

    public final void m(g gVar) throws IOException {
        byte[] bArr = f21413e0;
        gVar.a(bArr.length);
        byte[] bArr2 = new byte[gVar.f21445p0.available()];
        gVar.readFully(bArr2);
        this.f21437p = bArr.length;
        x(0, bArr2);
    }

    public final void n(b bVar) throws Throwable {
        if (f21418v) {
            Objects.toString(bVar);
        }
        bVar.f21447r0 = ByteOrder.LITTLE_ENDIAN;
        bVar.a(I.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    bVar.readFully(bArr3);
                    this.f21437p = i12;
                    x(0, bArr3);
                    E(new b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get(TAG_JPEG_INTERCHANGE_FORMAT);
        d dVar2 = (d) map.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iH = dVar.h(this.f21430h);
        int iH2 = dVar2.h(this.f21430h);
        if (this.f21426d == 7) {
            iH += this.f21438q;
        }
        if (iH <= 0 || iH2 <= 0) {
            return;
        }
        this.f21431i = true;
        if (this.f21423a == null && this.f21425c == null && this.f21424b == null) {
            byte[] bArr = new byte[iH2];
            bVar.a(iH);
            bVar.readFully(bArr);
            this.f21435n = bArr;
        }
        this.f21434l = iH;
        this.m = iH2;
    }

    public final void q(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f21425c = null;
        this.f21423a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    androidx.exifinterface.media.a.C0083a.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f21424b = fileInputStream2.getFD();
                } catch (Exception unused) {
                    this.f21424b = null;
                }
                s(fileInputStream2);
                androidx.exifinterface.media.a.a(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.a.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean r(HashMap map) throws IOException {
        d dVar = (d) map.get(TAG_IMAGE_LENGTH);
        d dVar2 = (d) map.get(TAG_IMAGE_WIDTH);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f21430h) <= 512 && dVar2.h(this.f21430h) <= 512;
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, Integer.toString(1));
    }

    public void rotate(int i10) {
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        Integer numValueOf = Integer.valueOf(attributeInt);
        List<Integer> list = f21419w;
        int iIntValue = 0;
        if (list.contains(numValueOf)) {
            int iIndexOf = ((i10 / 90) + list.indexOf(Integer.valueOf(attributeInt))) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            Integer numValueOf2 = Integer.valueOf(attributeInt);
            List<Integer> list2 = f21420x;
            if (list2.contains(numValueOf2)) {
                int iIndexOf2 = ((i10 / 90) + list2.indexOf(Integer.valueOf(attributeInt))) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(iIntValue));
    }

    public final void s(@NonNull InputStream inputStream) throws Throwable {
        boolean z10 = f21418v;
        for (int i10 = 0; i10 < X.length; i10++) {
            try {
                try {
                    this.f21428f[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    a();
                    if (z10) {
                        v();
                    }
                    throw th2;
                }
            } catch (IOException | UnsupportedOperationException e5) {
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e5);
                }
                a();
                if (!z10) {
                    return;
                }
            }
        }
        boolean z11 = this.f21427e;
        if (!z11) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f21426d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i11 = this.f21426d;
        if (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) {
            b bVar = new b(inputStream);
            int i12 = this.f21426d;
            if (i12 == 4) {
                f(bVar, 0, 0);
            } else if (i12 == 13) {
                i(bVar);
            } else if (i12 == 9) {
                j(bVar);
            } else if (i12 == 14) {
                n(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (z11) {
                m(gVar);
            } else {
                int i13 = this.f21426d;
                if (i13 == 12) {
                    e(gVar);
                } else if (i13 == 7) {
                    h(gVar);
                } else if (i13 == 10) {
                    l(gVar);
                } else {
                    k(gVar);
                }
            }
            gVar.d(this.f21437p);
            E(gVar);
        }
        a();
        if (!z10) {
            return;
        }
        v();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00f2 A[Catch: all -> 0x0102, Exception -> 0x0106, TryCatch #21 {Exception -> 0x0106, all -> 0x0102, blocks: (B:73:0x00ee, B:75:0x00f2, B:83:0x0111, B:82:0x0109), top: B:126:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0109 A[Catch: all -> 0x0102, Exception -> 0x0106, TryCatch #21 {Exception -> 0x0106, all -> 0x0102, blocks: (B:73:0x00ee, B:75:0x00f2, B:83:0x0111, B:82:0x0109), top: B:126:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:98:0x014f  */
    public void saveAttributes() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        int i10 = this.f21426d;
        if (i10 != 4 && i10 != 13 && i10 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f21424b == null && this.f21423a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f21431i && this.f21432j && !this.f21433k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        boolean z10 = true;
        this.f21441t = true;
        this.f21435n = getThumbnail();
        Closeable closeable = null;
        try {
            File fileCreateTempFile = File.createTempFile(com.bbva.plugin.media.capture.util.Constants.TEMP_FOLDER, "tmp");
            if (this.f21423a != null) {
                fileInputStream = new FileInputStream(this.f21423a);
            } else {
                androidx.exifinterface.media.a.C0083a.c(this.f21424b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f21424b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    androidx.exifinterface.media.a.d(fileInputStream, fileOutputStream);
                    androidx.exifinterface.media.a.a(fileInputStream);
                    androidx.exifinterface.media.a.a(fileOutputStream);
                    boolean z11 = false;
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f21423a != null) {
                                        fileOutputStream2 = new FileOutputStream(this.f21423a);
                                    } else {
                                        androidx.exifinterface.media.a.C0083a.c(this.f21424b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.f21424b);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i11 = this.f21426d;
                                                if (i11 == 4) {
                                                    B(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 13) {
                                                    C(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 14) {
                                                    D(bufferedInputStream, bufferedOutputStream);
                                                }
                                                androidx.exifinterface.media.a.a(bufferedInputStream);
                                                androidx.exifinterface.media.a.a(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f21435n = null;
                                            } catch (Exception e5) {
                                                e = e5;
                                                closeable = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f21423a == null) {
                                                            androidx.exifinterface.media.a.C0083a.c(this.f21424b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream3 = new FileOutputStream(this.f21424b);
                                                        } else {
                                                            fileOutputStream3 = new FileOutputStream(this.f21423a);
                                                        }
                                                        fileOutputStream2 = fileOutputStream3;
                                                        androidx.exifinterface.media.a.d(fileInputStream2, fileOutputStream2);
                                                        androidx.exifinterface.media.a.a(fileInputStream2);
                                                        androidx.exifinterface.media.a.a(fileOutputStream2);
                                                        throw new IOException("Failed to save new file", e);
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        closeable = fileInputStream2;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            try {
                                                                androidx.exifinterface.media.a.a(closeable);
                                                                androidx.exifinterface.media.a.a(fileOutputStream2);
                                                                throw th;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                z11 = z10;
                                                                closeable = bufferedInputStream;
                                                                androidx.exifinterface.media.a.a(closeable);
                                                                androidx.exifinterface.media.a.a(bufferedOutputStream);
                                                                if (!z11) {
                                                                    fileCreateTempFile.delete();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        closeable = fileInputStream2;
                                                        z10 = false;
                                                        androidx.exifinterface.media.a.a(closeable);
                                                        androidx.exifinterface.media.a.a(fileOutputStream2);
                                                        throw th;
                                                    }
                                                } catch (Exception e10) {
                                                    e = e10;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            bufferedOutputStream = null;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            bufferedOutputStream = null;
                                            closeable = bufferedInputStream;
                                            androidx.exifinterface.media.a.a(closeable);
                                            androidx.exifinterface.media.a.a(bufferedOutputStream);
                                            if (!z11) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        bufferedInputStream = null;
                                        bufferedOutputStream = bufferedInputStream;
                                        closeable = fileInputStream3;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (this.f21423a == null) {
                                            androidx.exifinterface.media.a.C0083a.c(this.f21424b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(this.f21424b);
                                        } else {
                                            fileOutputStream3 = new FileOutputStream(this.f21423a);
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        androidx.exifinterface.media.a.d(fileInputStream2, fileOutputStream2);
                                        androidx.exifinterface.media.a.a(fileInputStream2);
                                        androidx.exifinterface.media.a.a(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    fileOutputStream2 = null;
                                    bufferedInputStream = null;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                bufferedOutputStream = null;
                                androidx.exifinterface.media.a.a(closeable);
                                androidx.exifinterface.media.a.a(bufferedOutputStream);
                                if (!z11) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            fileOutputStream2 = null;
                            bufferedInputStream = null;
                            bufferedOutputStream = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Exception e15) {
                    e = e15;
                    closeable = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th9) {
                        th = th9;
                        androidx.exifinterface.media.a.a(closeable);
                        androidx.exifinterface.media.a.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    closeable = fileInputStream;
                    androidx.exifinterface.media.a.a(closeable);
                    androidx.exifinterface.media.a.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
                fileOutputStream = null;
            } catch (Throwable th11) {
                th = th11;
                fileOutputStream = null;
            }
        } catch (Exception e17) {
            e = e17;
            fileOutputStream = null;
        } catch (Throwable th12) {
            th = th12;
            fileOutputStream = null;
        }
    }

    public void setAltitude(double d2) {
        String str = d2 >= 0.0d ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, new f(Math.abs(d2)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0278 A[LOOP:5: B:99:0x0275->B:101:0x0278, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0298 A[LOOP:6: B:103:0x0296->B:104:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bb A[LOOP:7: B:107:0x02b8->B:109:0x02bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f5 A[LOOP:8: B:112:0x02f2->B:114:0x02f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x030d  */
    /* JADX WARN: Code duplicated, block: B:119:0x031b A[LOOP:9: B:117:0x0318->B:119:0x031b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0333  */
    /* JADX WARN: Code duplicated, block: B:122:0x0340  */
    /* JADX WARN: Code duplicated, block: B:124:0x034a  */
    /* JADX WARN: Code duplicated, block: B:129:0x036b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c4 A[LOOP:1: B:82:0x01c1->B:84:0x01c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e4 A[LOOP:2: B:86:0x01e2->B:87:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0205 A[LOOP:3: B:90:0x0202->B:92:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x024a A[LOOP:4: B:94:0x0248->B:95:0x024a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x026a  */
    public void setAttribute(@NonNull String str, @Nullable String str2) {
        e eVar;
        int[] iArr;
        int i10;
        d dVar;
        String[] strArrSplit;
        int[] iArr2;
        int i11;
        String[] strArrSplit2;
        long[] jArr;
        int i12;
        int i13;
        String[] strArrSplit3;
        f[] fVarArr;
        int i14;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i15;
        ByteBuffer byteBufferWrap;
        int i16;
        String[] strArrSplit5;
        int length2;
        f[] fVarArr2;
        int i17;
        int i18;
        ByteBuffer byteBufferWrap2;
        int i19;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i20;
        ByteBuffer byteBufferWrap3;
        int i21;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ((TAG_DATETIME.equals(str3) || TAG_DATETIME_ORIGINAL.equals(str3) || TAG_DATETIME_DIGITIZED.equals(str3)) && strReplaceAll != null) {
            boolean zFind = i0.matcher(strReplaceAll).find();
            boolean zFind2 = f21417j0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll(Constant.DASH_STRING, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            }
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str3)) {
            str3 = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        int i22 = 2;
        if (strReplaceAll != null && f21410b0.contains(str3)) {
            if (str3.equals(TAG_GPS_TIMESTAMP)) {
                Matcher matcher = f21416h0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i23 = 0;
        int i24 = 0;
        while (i24 < X.length) {
            if ((i24 != 4 || this.f21431i) && (eVar = f21409a0[i24].get(str3)) != null) {
                HashMap<String, d>[] mapArr = this.f21428f;
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairO = o(strReplaceAll);
                    int iIntValue = ((Integer) pairO.first).intValue();
                    int i25 = -1;
                    int i26 = eVar.f21458c;
                    if (i26 != iIntValue && i26 != ((Integer) pairO.second).intValue()) {
                        int i27 = eVar.f21459d;
                        if (i27 != -1 && (i27 == ((Integer) pairO.first).intValue() || i27 == ((Integer) pairO.second).intValue())) {
                            i26 = i27;
                        } else if (i26 != 1 && i26 != 7 && i26 != i22) {
                            if (f21418v) {
                                String[] strArr = T;
                                String str4 = strArr[i26];
                                if (i27 != -1) {
                                    new StringBuilder(", ").append(strArr[i27]);
                                }
                                String str5 = strArr[((Integer) pairO.first).intValue()];
                                if (((Integer) pairO.second).intValue() != -1) {
                                    new StringBuilder(", ").append(strArr[((Integer) pairO.second).intValue()]);
                                }
                            }
                        }
                        iArr = U;
                        switch (i26) {
                            case 1:
                                i10 = i24;
                                HashMap<String, d> map = mapArr[i10];
                                if (strReplaceAll.length() == 1) {
                                    i23 = 0;
                                    if (strReplaceAll.charAt(0) < '0') {
                                    }
                                    map.put(str3, dVar);
                                } else {
                                    i23 = 0;
                                }
                                byte[] bytes = strReplaceAll.getBytes(f21412d0);
                                dVar = new d(1, bytes.length, bytes);
                                map.put(str3, dVar);
                                break;
                            case 2:
                            case 7:
                                i10 = i24;
                                mapArr[i10].put(str3, d.a(strReplaceAll));
                                i23 = 0;
                                break;
                            case 3:
                                i10 = i24;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i11 = 0; i11 < strArrSplit.length; i11++) {
                                    iArr2[i11] = Integer.parseInt(strArrSplit[i11]);
                                }
                                mapArr[i10].put(str3, d.f(iArr2, this.f21430h));
                                i23 = 0;
                                break;
                            case 4:
                                i10 = i24;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i12 = 0; i12 < strArrSplit2.length; i12++) {
                                    jArr[i12] = Long.parseLong(strArrSplit2[i12]);
                                }
                                mapArr[i10].put(str3, d.c(jArr, this.f21430h));
                                i23 = 0;
                                break;
                            case 5:
                                i10 = i24;
                                i13 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i14 = 0;
                                while (i14 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i14].split("/", i13);
                                    fVarArr[i14] = new f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i14++;
                                    i13 = -1;
                                }
                                mapArr[i10].put(str3, d.d(fVarArr, this.f21430h));
                                i23 = 0;
                                break;
                            case 9:
                                i10 = i24;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i15 = 0; i15 < strArrSplit4.length; i15++) {
                                    iArr3[i15] = Integer.parseInt(strArrSplit4[i15]);
                                }
                                HashMap<String, d> map2 = mapArr[i10];
                                ByteOrder byteOrder = this.f21430h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (i16 = 0; i16 < length; i16++) {
                                    byteBufferWrap.putInt(iArr3[i16]);
                                }
                                map2.put(str3, new d(9, length, byteBufferWrap.array()));
                                i23 = 0;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i17 = i23;
                                while (i17 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i17].split("/", i25);
                                    fVarArr2[i17] = new f((long) Double.parseDouble(strArrSplit8[i23]), (long) Double.parseDouble(strArrSplit8[1]));
                                    i17++;
                                    length2 = length2;
                                    i24 = i24;
                                    i23 = 0;
                                    i25 = -1;
                                }
                                i10 = i24;
                                i18 = length2;
                                HashMap<String, d> map3 = mapArr[i10];
                                ByteOrder byteOrder2 = this.f21430h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * i18]);
                                byteBufferWrap2.order(byteOrder2);
                                for (i19 = 0; i19 < i18; i19++) {
                                    f fVar = fVarArr2[i19];
                                    byteBufferWrap2.putInt((int) fVar.f21460a);
                                    byteBufferWrap2.putInt((int) fVar.f21461b);
                                }
                                map3.put(str3, new d(10, i18, byteBufferWrap2.array()));
                                i23 = 0;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i20 = i23; i20 < strArrSplit6.length; i20++) {
                                    dArr[i20] = Double.parseDouble(strArrSplit6[i20]);
                                }
                                HashMap<String, d> map4 = mapArr[i24];
                                ByteOrder byteOrder3 = this.f21430h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                for (i21 = i23; i21 < length3; i21++) {
                                    byteBufferWrap3.putDouble(dArr[i21]);
                                }
                                map4.put(str3, new d(12, length3, byteBufferWrap3.array()));
                                break;
                        }
                    } else {
                        iArr = U;
                        switch (i26) {
                            case 1:
                                i10 = i24;
                                HashMap<String, d> map5 = mapArr[i10];
                                if (strReplaceAll.length() == 1) {
                                    i23 = 0;
                                    if (strReplaceAll.charAt(0) < '0' && strReplaceAll.charAt(0) <= '1') {
                                        dVar = new d(1, 1, new byte[]{(byte) (strReplaceAll.charAt(0) - '0')});
                                    }
                                    map5.put(str3, dVar);
                                } else {
                                    i23 = 0;
                                }
                                byte[] bytes2 = strReplaceAll.getBytes(f21412d0);
                                dVar = new d(1, bytes2.length, bytes2);
                                map5.put(str3, dVar);
                                break;
                            case 2:
                            case 7:
                                i10 = i24;
                                mapArr[i10].put(str3, d.a(strReplaceAll));
                                i23 = 0;
                                break;
                            case 3:
                                i10 = i24;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i11 < strArrSplit.length) {
                                    iArr2[i11] = Integer.parseInt(strArrSplit[i11]);
                                }
                                mapArr[i10].put(str3, d.f(iArr2, this.f21430h));
                                i23 = 0;
                                break;
                            case 4:
                                i10 = i24;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i12 < strArrSplit2.length) {
                                    jArr[i12] = Long.parseLong(strArrSplit2[i12]);
                                }
                                mapArr[i10].put(str3, d.c(jArr, this.f21430h));
                                i23 = 0;
                                break;
                            case 5:
                                i10 = i24;
                                i13 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i14 = 0;
                                while (i14 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i14].split("/", i13);
                                    fVarArr[i14] = new f((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i14++;
                                    i13 = -1;
                                }
                                mapArr[i10].put(str3, d.d(fVarArr, this.f21430h));
                                i23 = 0;
                                break;
                            case 9:
                                i10 = i24;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i15 < strArrSplit4.length) {
                                    iArr3[i15] = Integer.parseInt(strArrSplit4[i15]);
                                }
                                HashMap<String, d> map6 = mapArr[i10];
                                ByteOrder byteOrder4 = this.f21430h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder4);
                                while (i16 < length) {
                                    byteBufferWrap.putInt(iArr3[i16]);
                                }
                                map6.put(str3, new d(9, length, byteBufferWrap.array()));
                                i23 = 0;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i17 = i23;
                                while (i17 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i17].split("/", i25);
                                    fVarArr2[i17] = new f((long) Double.parseDouble(strArrSplit10[i23]), (long) Double.parseDouble(strArrSplit10[1]));
                                    i17++;
                                    length2 = length2;
                                    i24 = i24;
                                    i23 = 0;
                                    i25 = -1;
                                }
                                i10 = i24;
                                i18 = length2;
                                HashMap<String, d> map7 = mapArr[i10];
                                ByteOrder byteOrder5 = this.f21430h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * i18]);
                                byteBufferWrap2.order(byteOrder5);
                                while (i19 < i18) {
                                    f fVar2 = fVarArr2[i19];
                                    byteBufferWrap2.putInt((int) fVar2.f21460a);
                                    byteBufferWrap2.putInt((int) fVar2.f21461b);
                                }
                                map7.put(str3, new d(10, i18, byteBufferWrap2.array()));
                                i23 = 0;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i20 < strArrSplit6.length) {
                                    dArr[i20] = Double.parseDouble(strArrSplit6[i20]);
                                }
                                HashMap<String, d> map8 = mapArr[i24];
                                ByteOrder byteOrder6 = this.f21430h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                while (i21 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i21]);
                                }
                                map8.put(str3, new d(12, length3, byteBufferWrap3.array()));
                                break;
                        }
                    }
                } else {
                    mapArr[i24].remove(str3);
                }
                i10 = i24;
            } else {
                i10 = i24;
            }
            i24 = i10 + 1;
            i22 = 2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDateTime(@NonNull Long l6) {
        if (l6 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l6.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l6.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = androidx.camera.core.processing.f.d("0", string);
        }
        setAttribute(TAG_DATETIME, R.format(new Date(l6.longValue())));
        setAttribute(TAG_SUBSEC_TIME, string);
    }

    public void setGpsInfo(Location location) {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, new f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = R.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, strArrSplit[0]);
        setAttribute(TAG_GPS_TIMESTAMP, strArrSplit[1]);
    }

    public void setLatLong(double d2, double d3) {
        if (d2 < -90.0d || d2 > 90.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Latitude value " + d2 + " is not valid.");
        }
        if (d3 < -180.0d || d3 > 180.0d || Double.isNaN(d3)) {
            throw new IllegalArgumentException("Longitude value " + d3 + " is not valid.");
        }
        setAttribute(TAG_GPS_LATITUDE_REF, d2 >= 0.0d ? "N" : LATITUDE_SOUTH);
        setAttribute(TAG_GPS_LATITUDE, b(Math.abs(d2)));
        setAttribute(TAG_GPS_LONGITUDE_REF, d3 >= 0.0d ? LONGITUDE_EAST : LONGITUDE_WEST);
        setAttribute(TAG_GPS_LONGITUDE, b(Math.abs(d3)));
    }

    public final void u(b bVar) throws IOException {
        ByteOrder byteOrderW = w(bVar);
        this.f21430h = byteOrderW;
        bVar.f21447r0 = byteOrderW;
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f21426d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException(g0.c("Invalid first Ifd offset: ", i11));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.a(i12);
        }
    }

    public final void v() throws Throwable {
        int i10 = 0;
        while (true) {
            HashMap<String, d>[] mapArr = this.f21428f;
            if (i10 >= mapArr.length) {
                return;
            }
            mapArr[i10].size();
            for (Map.Entry<String, d> entry : mapArr[i10].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.i(this.f21430h);
            }
            i10++;
        }
    }

    public final void x(int i10, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        u(gVar);
        y(gVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:99:0x0194  */
    public final void y(g gVar, int i10) throws IOException {
        boolean z10;
        HashMap<String, d>[] mapArr;
        short s4;
        HashSet hashSet;
        boolean z11;
        long j10;
        int i11;
        boolean z12;
        HashSet hashSet2;
        HashSet hashSet3;
        int unsignedShort;
        long j11;
        int i12;
        Integer numValueOf = Integer.valueOf(gVar.f21446q0);
        HashSet hashSet4 = this.f21429g;
        hashSet4.add(numValueOf);
        short s7 = gVar.readShort();
        if (s7 <= 0) {
            return;
        }
        short s9 = 0;
        while (true) {
            z10 = f21418v;
            mapArr = this.f21428f;
            if (s9 >= s7) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i13 = gVar.readInt();
            short s10 = s9;
            long j12 = ((long) gVar.f21446q0) + 4;
            e eVar = Z[i10].get(Integer.valueOf(unsignedShort2));
            if (z10) {
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = eVar != null ? eVar.f21457b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i13);
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr);
            }
            if (eVar != null && unsignedShort3 > 0) {
                int[] iArr = U;
                if (unsignedShort3 >= iArr.length) {
                    s4 = s7;
                } else {
                    int i14 = eVar.f21458c;
                    if (i14 == 7 || unsignedShort3 == 7 || i14 == unsignedShort3 || (i11 = eVar.f21459d) == unsignedShort3) {
                        s4 = s7;
                    } else {
                        s4 = s7;
                        if (((i14 != 4 && i11 != 4) || unsignedShort3 != 3) && (((i14 != 9 && i11 != 9) || unsignedShort3 != 8) && ((i14 != 12 && i11 != 12) || unsignedShort3 != 11))) {
                            if (z10) {
                                String str = T[unsignedShort3];
                            }
                        }
                    }
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = i14;
                    }
                    hashSet = hashSet4;
                    z11 = z10;
                    j10 = ((long) i13) * ((long) iArr[unsignedShort3]);
                    z12 = j10 >= 0 && j10 <= 2147483647L;
                }
                hashSet = hashSet4;
                z11 = z10;
                j10 = 0;
            } else {
                s4 = s7;
                hashSet = hashSet4;
                z11 = z10;
                j10 = 0;
            }
            if (z12) {
                if (j10 > 4) {
                    int i15 = gVar.readInt();
                    if (this.f21426d == 7) {
                        if (TAG_MAKER_NOTE.equals(eVar.f21457b)) {
                            this.f21438q = i15;
                        } else if (i10 == 6 && TAG_ORF_THUMBNAIL_IMAGE.equals(eVar.f21457b)) {
                            this.f21439r = i15;
                            this.f21440s = i13;
                            d dVarE = d.e(6, this.f21430h);
                            d dVarB = d.b(this.f21439r, this.f21430h);
                            d dVarB2 = d.b(this.f21440s, this.f21430h);
                            mapArr[4].put(TAG_COMPRESSION, dVarE);
                            mapArr[4].put(TAG_JPEG_INTERCHANGE_FORMAT, dVarB);
                            mapArr[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, dVarB2);
                        }
                    }
                    gVar.d(i15);
                } else {
                    j10 = j10;
                }
                Integer num = f21411c0.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j11 = ((long) gVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = gVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = gVar.readInt();
                        } else {
                            j11 = -1;
                        }
                        if (z11) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f21457b);
                        }
                        if (j11 > 0 || ((i12 = gVar.f21449t0) != -1 && j11 >= i12)) {
                            hashSet = hashSet;
                        } else {
                            hashSet = hashSet;
                            if (!hashSet.contains(Integer.valueOf((int) j11))) {
                                gVar.d(j11);
                                y(gVar, num.intValue());
                            }
                        }
                        gVar.d(j12);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    j11 = unsignedShort;
                    if (z11) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f21457b);
                    }
                    if (j11 > 0) {
                        hashSet = hashSet;
                    } else {
                        hashSet = hashSet;
                    }
                    gVar.d(j12);
                } else {
                    int i16 = gVar.f21446q0 + this.f21437p;
                    byte[] bArr = new byte[(int) j10];
                    gVar.readFully(bArr);
                    hashSet3 = hashSet2;
                    d dVar = new d(unsignedShort3, i13, i16, bArr);
                    mapArr[i10].put(eVar.f21457b, dVar);
                    String str2 = eVar.f21457b;
                    if (TAG_DNG_VERSION.equals(str2)) {
                        hashSet2 = hashSet;
                        this.f21426d = 3;
                    }
                    hashSet2 = hashSet;
                    if (((TAG_MAKE.equals(str2) || TAG_MODEL.equals(str2)) && dVar.i(this.f21430h).contains("PENTAX")) || (TAG_COMPRESSION.equals(str2) && dVar.h(this.f21430h) == 65535)) {
                        this.f21426d = 8;
                    }
                    if (gVar.f21446q0 != j12) {
                        gVar.d(j12);
                    }
                }
                s9 = (short) (s10 + 1);
                hashSet4 = hashSet3;
                s7 = s4;
            } else {
                gVar.d(j12);
            }
            hashSet3 = hashSet;
            s9 = (short) (s10 + 1);
            hashSet4 = hashSet3;
            s7 = s4;
        }
        HashSet hashSet5 = hashSet4;
        int i17 = gVar.readInt();
        if (z10) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i17));
        }
        long j13 = i17;
        if (j13 <= 0 || hashSet5.contains(Integer.valueOf(i17))) {
            return;
        }
        gVar.d(j13);
        if (mapArr[4].isEmpty()) {
            y(gVar, 4);
        } else if (mapArr[5].isEmpty()) {
            y(gVar, 5);
        }
    }

    public final void z(String str) {
        for (int i10 = 0; i10 < X.length; i10++) {
            this.f21428f[i10].remove(str);
        }
    }

    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final DataInputStream f21445p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f21446q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ByteOrder f21447r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public byte[] f21448s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f21449t0;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f21449t0 = bArr.length;
        }

        public final void a(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                DataInputStream dataInputStream = this.f21445p0;
                int i12 = i10 - i11;
                int iSkip = (int) dataInputStream.skip(i12);
                if (iSkip <= 0) {
                    if (this.f21448s0 == null) {
                        this.f21448s0 = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f21448s0, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException(androidx.camera.core.impl.utils.b.a("Reached EOF while skipping ", i10, " bytes."));
                    }
                }
                i11 += iSkip;
            }
            this.f21446q0 += i11;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f21445p0.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f21446q0++;
            return this.f21445p0.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f21446q0++;
            return this.f21445p0.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f21446q0++;
            int i10 = this.f21445p0.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f21446q0 += 2;
            return this.f21445p0.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f21446q0 += i11;
            this.f21445p0.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f21446q0 += 4;
            DataInputStream dataInputStream = this.f21445p0;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21447r0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f21447r0);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.f21446q0 += 8;
            DataInputStream dataInputStream = this.f21445p0;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            int i17 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21447r0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f21447r0);
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f21446q0 += 2;
            DataInputStream dataInputStream = this.f21445p0;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21447r0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f21447r0);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f21446q0 += 2;
            return this.f21445p0.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f21446q0++;
            return this.f21445p0.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f21446q0 += 2;
            DataInputStream dataInputStream = this.f21445p0;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21447r0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f21447r0);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f21445p0.read(bArr, i10, i11);
            this.f21446q0 += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f21446q0 += bArr.length;
            this.f21445p0.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f21445p0 = dataInputStream;
            dataInputStream.mark(0);
            this.f21446q0 = 0;
            this.f21447r0 = byteOrder;
            this.f21449t0 = inputStream instanceof b ? ((b) inputStream).f21449t0 : -1;
        }
    }

    public static class g extends b {
        public g(byte[] bArr) throws IOException {
            super(bArr);
            this.f21445p0.mark(Integer.MAX_VALUE);
        }

        public final void d(long j10) throws IOException {
            int i10 = this.f21446q0;
            if (i10 > j10) {
                this.f21446q0 = 0;
                this.f21445p0.reset();
            } else {
                j10 -= (long) i10;
            }
            a((int) j10);
        }

        public g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f21445p0.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    @Nullable
    public double[] getLatLong() {
        String attribute = getAttribute(TAG_GPS_LATITUDE);
        String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{c(attribute, attribute2), c(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4));
            return null;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21459d;

        public e(String str, int i10, int i11) {
            this.f21457b = str;
            this.f21456a = i10;
            this.f21458c = i11;
            this.f21459d = -1;
        }

        public e(String str, int i10, int i11, int i12) {
            this.f21457b = str;
            this.f21456a = i10;
            this.f21458c = i11;
            this.f21459d = i12;
        }
    }

    public ExifInterface(@NonNull String str) throws Throwable {
        e[][] eVarArr = X;
        this.f21428f = new HashMap[eVarArr.length];
        this.f21429g = new HashSet(eVarArr.length);
        this.f21430h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            q(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public ExifInterface(@NonNull FileDescriptor fileDescriptor) throws Throwable {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = X;
        this.f21428f = new HashMap[eVarArr.length];
        this.f21429g = new HashSet(eVarArr.length);
        this.f21430h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f21425c = null;
            this.f21423a = null;
            try {
                androidx.exifinterface.media.a.C0083a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.f21424b = fileDescriptor;
                try {
                    fileDescriptor = androidx.exifinterface.media.a.C0083a.b(fileDescriptor);
                    z10 = true;
                } catch (Exception e5) {
                    throw new IOException("Failed to duplicate file descriptor", e5);
                }
            } catch (Exception unused) {
                this.f21424b = null;
                z10 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    s(fileInputStream);
                    androidx.exifinterface.media.a.a(fileInputStream);
                    if (z10) {
                        try {
                            androidx.exifinterface.media.a.C0083a.a(fileDescriptor);
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    androidx.exifinterface.media.a.a(fileInputStream);
                    if (z10) {
                        try {
                            androidx.exifinterface.media.a.C0083a.a(fileDescriptor);
                        } catch (Exception unused3) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public class a extends MediaDataSource {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f21443p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ g f21444q0;

        public a(g gVar) {
            this.f21444q0 = gVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f21443p0;
                g gVar = this.f21444q0;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) gVar.f21445p0.available())) {
                        return -1;
                    }
                    gVar.d(j10);
                    this.f21443p0 = j10;
                }
                if (i11 > gVar.f21445p0.available()) {
                    i11 = gVar.f21445p0.available();
                }
                int i12 = gVar.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f21443p0 += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f21443p0 = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }

    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public ExifInterface(@NonNull InputStream inputStream, int i10) throws Throwable {
        e[][] eVarArr = X;
        this.f21428f = new HashMap[eVarArr.length];
        this.f21429g = new HashSet(eVarArr.length);
        this.f21430h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f21423a = null;
            if (i10 == 1) {
                byte[] bArr = f21413e0;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, bArr.length);
                bufferedInputStream.mark(bArr.length);
                byte[] bArr2 = new byte[bArr.length];
                bufferedInputStream.read(bArr2);
                bufferedInputStream.reset();
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    if (bArr2[i11] != bArr[i11]) {
                        Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                        return;
                    }
                }
                this.f21427e = true;
                this.f21425c = null;
                this.f21424b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f21425c = (AssetManager.AssetInputStream) inputStream;
                this.f21424b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    androidx.exifinterface.media.a.C0083a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f21425c = null;
                    this.f21424b = fileInputStream.getFD();
                } catch (Exception unused) {
                    this.f21425c = null;
                    this.f21424b = null;
                }
            } else {
                this.f21425c = null;
                this.f21424b = null;
            }
            s(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
