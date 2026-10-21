package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.b;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.ContentUriTriggers;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class WorkTypeConverters {

    public interface BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final int LINEAR = 1;
    }

    public interface NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;
    }

    public interface OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;
    }

    public interface StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f24593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f24594d;

        static {
            int[] iArr = new int[OutOfQuotaPolicy.values().length];
            f24594d = iArr;
            try {
                iArr[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24594d[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NetworkType.values().length];
            f24593c = iArr2;
            try {
                iArr2[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24593c[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24593c[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24593c[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24593c[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[BackoffPolicy.values().length];
            f24592b = iArr3;
            try {
                iArr3[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24592b[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[WorkInfo.State.values().length];
            f24591a = iArr4;
            try {
                iArr4[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24591a[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24591a[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24591a[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24591a[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24591a[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    @TypeConverter
    public static int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        int i10 = a.f24592b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @TypeConverter
    public static ContentUriTriggers byteArrayToContentUriTriggers(byte[] bArr) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        IOException e5;
        ContentUriTriggers contentUriTriggers = new ContentUriTriggers();
        if (bArr == null) {
            return contentUriTriggers;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            contentUriTriggers.add(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e10) {
                        e5 = e10;
                        e5.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th2;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        throw th2;
                    }
                }
            } catch (IOException e14) {
                objectInputStream = null;
                e5 = e14;
            } catch (Throwable th4) {
                th2 = th4;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th2;
            }
        } catch (IOException e15) {
            e15.printStackTrace();
        }
        return contentUriTriggers;
    }

    @TypeConverter
    public static byte[] contentUriTriggersToByteArray(ContentUriTriggers contentUriTriggers) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        if (contentUriTriggers.size() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(contentUriTriggers.size());
                        for (ContentUriTriggers.Trigger trigger : contentUriTriggers.getTriggers()) {
                            objectOutputStream2.writeUTF(trigger.getUri().toString());
                            objectOutputStream2.writeBoolean(trigger.shouldTriggerForDescendants());
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        e = e7;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    @TypeConverter
    public static BackoffPolicy intToBackoffPolicy(int i10) {
        if (i10 == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i10 == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(b.a("Could not convert ", i10, " to BackoffPolicy"));
    }

    @TypeConverter
    public static NetworkType intToNetworkType(int i10) {
        if (i10 == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return NetworkType.CONNECTED;
        }
        if (i10 == 2) {
            return NetworkType.UNMETERED;
        }
        if (i10 == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i10 == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(b.a("Could not convert ", i10, " to NetworkType"));
        }
        return NetworkType.TEMPORARILY_UNMETERED;
    }

    @NonNull
    @TypeConverter
    public static OutOfQuotaPolicy intToOutOfQuotaPolicy(int i10) {
        if (i10 == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(b.a("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    @TypeConverter
    public static WorkInfo.State intToState(int i10) {
        if (i10 == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i10 == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i10 == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i10 == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i10 == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i10 == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException(b.a("Could not convert ", i10, " to State"));
    }

    @TypeConverter
    public static int networkTypeToInt(NetworkType networkType) {
        int i10 = a.f24593c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @TypeConverter
    public static int outOfQuotaPolicyToInt(@NonNull OutOfQuotaPolicy outOfQuotaPolicy) {
        int i10 = a.f24594d[outOfQuotaPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + outOfQuotaPolicy + " to int");
    }

    @TypeConverter
    public static int stateToInt(WorkInfo.State state) {
        switch (a.f24591a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }
}
