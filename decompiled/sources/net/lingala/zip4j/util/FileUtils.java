package net.lingala.zip4j.util;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.c;
import androidx.core.app.e;
import androidx.core.app.f;
import androidx.core.graphics.d;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ExcludeFileFilter;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes12.dex */
public class FileUtils {
    public static final byte[] DEFAULT_POSIX_FILE_ATTRIBUTES = {0, 0, -92, KSUtils.PLAIN_BUFFER};
    public static final byte[] DEFAULT_POSIX_FOLDER_ATTRIBUTES = {0, 0, -19, 65};

    public static class a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f85147a;

        public a(String str) {
            this.f85147a = str;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(this.f85147a + Constant.DOT_STRING);
        }
    }

    public static void a(byte b10, int i10, HashSet hashSet, PosixFilePermission posixFilePermission) {
        if (BitUtils.isBitSet(b10, i10)) {
            hashSet.add(posixFilePermission);
        }
    }

    public static void assertFilesExist(List<File> list, ZipParameters.SymbolicLinkAction symbolicLinkAction) throws ZipException {
        for (File file : list) {
            if (!isSymbolicLink(file)) {
                if (!file.exists()) {
                    throw new ZipException("File does not exist: " + file);
                }
            } else if (symbolicLinkAction.equals(ZipParameters.SymbolicLinkAction.INCLUDE_LINK_AND_LINKED_FILE) || symbolicLinkAction.equals(ZipParameters.SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY)) {
                if (!file.exists()) {
                    throw new ZipException("Symlink target '" + readSymbolicLink(file) + "' does not exist for link '" + file + "'");
                }
            }
        }
    }

    public static String b(File file, String str) throws IOException {
        if (Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            return str;
        }
        return isSymbolicLink(file) ? file.toPath().toRealPath(LinkOption.NOFOLLOW_LINKS).getFileName().toString() : file.getName();
    }

    public static byte[] c(Path path) {
        byte[] bArr = new byte[4];
        try {
            Set setPermissions = f.b(Files.getFileAttributeView(path, e.d(), LinkOption.NOFOLLOW_LINKS)).readAttributes().permissions();
            bArr[3] = e(bArr[3], 7, Files.isRegularFile(path, new LinkOption[0]));
            bArr[3] = e(bArr[3], 6, Files.isDirectory(path, new LinkOption[0]));
            bArr[3] = e(bArr[3], 5, Files.isSymbolicLink(path));
            bArr[3] = e(bArr[3], 0, setPermissions.contains(PosixFilePermission.OWNER_READ));
            bArr[2] = e(bArr[2], 7, setPermissions.contains(PosixFilePermission.OWNER_WRITE));
            bArr[2] = e(bArr[2], 6, setPermissions.contains(PosixFilePermission.OWNER_EXECUTE));
            bArr[2] = e(bArr[2], 5, setPermissions.contains(PosixFilePermission.GROUP_READ));
            bArr[2] = e(bArr[2], 4, setPermissions.contains(PosixFilePermission.GROUP_WRITE));
            bArr[2] = e(bArr[2], 3, setPermissions.contains(PosixFilePermission.GROUP_EXECUTE));
            bArr[2] = e(bArr[2], 2, setPermissions.contains(PosixFilePermission.OTHERS_READ));
            bArr[2] = e(bArr[2], 1, setPermissions.contains(PosixFilePermission.OTHERS_WRITE));
            bArr[2] = e(bArr[2], 0, setPermissions.contains(PosixFilePermission.OTHERS_EXECUTE));
        } catch (IOException unused) {
        }
        return bArr;
    }

    public static void copyFile(RandomAccessFile randomAccessFile, OutputStream outputStream, long j10, long j11, ProgressMonitor progressMonitor, int i10) throws ZipException {
        long j12 = 0;
        if (j10 < 0 || j11 < 0 || j10 > j11) {
            throw new ZipException("invalid offsets");
        }
        if (j10 == j11) {
            return;
        }
        try {
            randomAccessFile.seek(j10);
            long j13 = j11 - j10;
            byte[] bArr = j13 < ((long) i10) ? new byte[(int) j13] : new byte[i10];
            while (true) {
                int i11 = randomAccessFile.read(bArr);
                if (i11 == -1) {
                    return;
                }
                outputStream.write(bArr, 0, i11);
                long j14 = i11;
                progressMonitor.updateWorkCompleted(j14);
                if (progressMonitor.isCancelAllTasks()) {
                    progressMonitor.setResult(ProgressMonitor.Result.CANCELLED);
                    return;
                }
                j12 += j14;
                if (j12 == j13) {
                    return;
                }
                if (((long) bArr.length) + j12 > j13) {
                    bArr = new byte[(int) (j13 - j12)];
                }
            }
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    public static byte[] d(Path path) {
        byte[] bArr = new byte[4];
        try {
            DosFileAttributes attributes = androidx.camera.camera2.internal.compat.workaround.a.f(Files.getFileAttributeView(path, d.d(), LinkOption.NOFOLLOW_LINKS)).readAttributes();
            bArr[0] = e(e(e(e(e((byte) 0, 0, attributes.isReadOnly()), 1, attributes.isHidden()), 2, attributes.isSystem()), 4, attributes.isDirectory()), 5, attributes.isArchive());
        } catch (IOException unused) {
        }
        return bArr;
    }

    public static byte e(byte b10, int i10, boolean z10) {
        return z10 ? BitUtils.setBit(b10, i10) : b10;
    }

    public static File[] getAllSortedNumberedSplitFiles(File file) {
        File[] fileArrListFiles = file.getParentFile().listFiles(new a(getFileNameWithoutExtension(file.getName())));
        if (fileArrListFiles == null) {
            return new File[0];
        }
        Arrays.sort(fileArrListFiles);
        return fileArrListFiles;
    }

    public static byte[] getDefaultFileAttributes(boolean z10) {
        byte[] bArr = new byte[4];
        if (isUnix() || isMac()) {
            if (z10) {
                System.arraycopy(DEFAULT_POSIX_FOLDER_ATTRIBUTES, 0, bArr, 0, 4);
            } else {
                System.arraycopy(DEFAULT_POSIX_FILE_ATTRIBUTES, 0, bArr, 0, 4);
            }
        } else if (isWindows() && z10) {
            bArr[0] = BitUtils.setBit(bArr[0], 4);
        }
        return bArr;
    }

    public static byte[] getFileAttributes(File file) {
        if (file != null) {
            try {
                if (Files.isSymbolicLink(file.toPath()) || file.exists()) {
                    Path path = file.toPath();
                    if (isWindows()) {
                        return d(path);
                    }
                    if (!isMac() && !isUnix()) {
                        return new byte[4];
                    }
                    return c(path);
                }
            } catch (NoSuchMethodError unused) {
                return new byte[4];
            }
        }
        return new byte[4];
    }

    public static String getFileExtension(File file) {
        String name = file.getName();
        return !name.contains(Constant.DOT_STRING) ? "" : name.substring(name.lastIndexOf(Constant.DOT_STRING) + 1);
    }

    public static String getFileNameWithoutExtension(String str) {
        int iLastIndexOf = str.lastIndexOf(Constant.DOT_STRING);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public static List<File> getFilesInDirectoryRecursive(File file, boolean z10, boolean z11) throws ZipException {
        return getFilesInDirectoryRecursive(file, z10, z11, null);
    }

    public static String getNextNumberedSplitFileCounterAsExtension(int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder(Constant.DOT_STRING);
        if (i10 < 9) {
            str = "00";
        } else {
            str = i10 < 99 ? "0" : "";
        }
        sb2.append(str);
        sb2.append(i10 + 1);
        return sb2.toString();
    }

    public static String getRelativeFileName(File file, ZipParameters zipParameters) throws ZipException {
        String strB;
        String strSubstring;
        try {
            String canonicalPath = file.getCanonicalPath();
            if (Zip4jUtil.isStringNotNullAndNotEmpty(zipParameters.getDefaultFolderPath())) {
                String canonicalPath2 = new File(zipParameters.getDefaultFolderPath()).getCanonicalPath();
                String str = InternalZipConstants.FILE_SEPARATOR;
                if (!canonicalPath2.endsWith(str)) {
                    canonicalPath2 = canonicalPath2 + str;
                }
                if (isSymbolicLink(file)) {
                    strSubstring = new File(file.getParentFile().getCanonicalFile().getPath() + File.separator + file.getCanonicalFile().getName()).getPath().substring(canonicalPath2.length());
                } else {
                    strSubstring = canonicalPath.substring(canonicalPath2.length());
                }
                if (strSubstring.startsWith(System.getProperty("file.separator"))) {
                    strSubstring = strSubstring.substring(1);
                }
                File file2 = new File(canonicalPath);
                if (file2.isDirectory()) {
                    strB = strSubstring.replaceAll("\\\\", "/") + "/";
                } else {
                    strB = strSubstring.substring(0, strSubstring.lastIndexOf(file2.getName())).replaceAll("\\\\", "/") + b(file2, zipParameters.getFileNameInZip());
                }
            } else {
                File file3 = new File(canonicalPath);
                strB = b(file3, zipParameters.getFileNameInZip());
                if (file3.isDirectory()) {
                    strB = strB + "/";
                }
            }
            String rootFolderNameInZip = zipParameters.getRootFolderNameInZip();
            if (Zip4jUtil.isStringNotNullAndNotEmpty(rootFolderNameInZip)) {
                if (!rootFolderNameInZip.endsWith("\\") && !rootFolderNameInZip.endsWith("/")) {
                    StringBuilder sbD = c.d(rootFolderNameInZip);
                    sbD.append(InternalZipConstants.FILE_SEPARATOR);
                    rootFolderNameInZip = sbD.toString();
                }
                rootFolderNameInZip = rootFolderNameInZip.replaceAll("\\\\", "/");
                strB = u.f(rootFolderNameInZip, strB);
            }
            if (Zip4jUtil.isStringNotNullAndNotEmpty(strB)) {
                return strB;
            }
            StringBuilder sbD2 = ci.a.d("fileName to add to zip is empty or null. fileName: '", strB, "' DefaultFolderPath: '");
            sbD2.append(zipParameters.getDefaultFolderPath());
            sbD2.append("' FileNameInZip: ");
            sbD2.append(zipParameters.getFileNameInZip());
            String string = sbD2.toString();
            if (isSymbolicLink(file)) {
                string = u.f(string, "isSymlink: true ");
            }
            if (Zip4jUtil.isStringNotNullAndNotEmpty(rootFolderNameInZip)) {
                string = h0.b("rootFolderNameInZip: '", rootFolderNameInZip, "' ");
            }
            throw new ZipException(string);
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    public static List<File> getSplitZipFiles(ZipModel zipModel) throws ZipException {
        if (zipModel == null) {
            throw new ZipException("cannot get split zip files: zipmodel is null");
        }
        if (zipModel.getEndOfCentralDirectoryRecord() == null) {
            return null;
        }
        if (!zipModel.getZipFile().exists()) {
            throw new ZipException("zip file does not exist");
        }
        ArrayList arrayList = new ArrayList();
        File zipFile = zipModel.getZipFile();
        if (!zipModel.isSplitArchive()) {
            arrayList.add(zipFile);
            return arrayList;
        }
        int numberOfThisDisk = zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk();
        if (numberOfThisDisk == 0) {
            arrayList.add(zipFile);
            return arrayList;
        }
        int i10 = 0;
        while (i10 <= numberOfThisDisk) {
            if (i10 == numberOfThisDisk) {
                arrayList.add(zipModel.getZipFile());
            } else {
                StringBuilder sbE = androidx.camera.core.processing.f.e(zipFile.getName().contains(Constant.DOT_STRING) ? zipFile.getPath().substring(0, zipFile.getPath().lastIndexOf(Constant.DOT_STRING)) : zipFile.getPath(), i10 >= 9 ? ".z" : ".z0");
                sbE.append(i10 + 1);
                arrayList.add(new File(sbE.toString()));
            }
            i10++;
        }
        return arrayList;
    }

    public static String getZipFileNameWithoutExtension(String str) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            throw new ZipException("zip file name is empty or null, cannot determine zip file name");
        }
        if (str.contains(System.getProperty("file.separator"))) {
            str = str.substring(str.lastIndexOf(System.getProperty("file.separator")) + 1);
        }
        return str.endsWith(".zip") ? str.substring(0, str.lastIndexOf(Constant.DOT_STRING)) : str;
    }

    public static boolean isMac() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }

    public static boolean isNumberedSplitFile(File file) {
        return file.getName().endsWith(InternalZipConstants.SEVEN_ZIP_SPLIT_FILE_EXTENSION_PATTERN);
    }

    public static boolean isSymbolicLink(File file) {
        try {
            return Files.isSymbolicLink(file.toPath());
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static boolean isUnix() {
        return System.getProperty("os.name").toLowerCase().contains("nux");
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    public static boolean isZipEntryDirectory(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    public static String readSymbolicLink(File file) {
        try {
            return Files.readSymbolicLink(file.toPath()).toString();
        } catch (Error | Exception unused) {
            return "";
        }
    }

    public static void setFileAttributes(Path path, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            if (isWindows()) {
                if (bArr[0] == 0) {
                    return;
                }
                DosFileAttributeView dosFileAttributeViewF = androidx.camera.camera2.internal.compat.workaround.a.f(Files.getFileAttributeView(path, d.d(), LinkOption.NOFOLLOW_LINKS));
                dosFileAttributeViewF.setReadOnly(BitUtils.isBitSet(bArr[0], 0));
                dosFileAttributeViewF.setHidden(BitUtils.isBitSet(bArr[0], 1));
                dosFileAttributeViewF.setSystem(BitUtils.isBitSet(bArr[0], 2));
                dosFileAttributeViewF.setArchive(BitUtils.isBitSet(bArr[0], 5));
            } else {
                if (!isMac() && !isUnix()) {
                    return;
                }
                if (bArr[2] == 0 && bArr[3] == 0) {
                    return;
                }
                HashSet hashSet = new HashSet();
                a(bArr[3], 0, hashSet, PosixFilePermission.OWNER_READ);
                a(bArr[2], 7, hashSet, PosixFilePermission.OWNER_WRITE);
                a(bArr[2], 6, hashSet, PosixFilePermission.OWNER_EXECUTE);
                a(bArr[2], 5, hashSet, PosixFilePermission.GROUP_READ);
                a(bArr[2], 4, hashSet, PosixFilePermission.GROUP_WRITE);
                a(bArr[2], 3, hashSet, PosixFilePermission.GROUP_EXECUTE);
                a(bArr[2], 2, hashSet, PosixFilePermission.OTHERS_READ);
                a(bArr[2], 1, hashSet, PosixFilePermission.OTHERS_WRITE);
                a(bArr[2], 0, hashSet, PosixFilePermission.OTHERS_EXECUTE);
                Files.setPosixFilePermissions(path, hashSet);
            }
        } catch (IOException unused) {
        }
    }

    public static void setFileLastModifiedTime(Path path, long j10) {
        if (j10 <= 0 || !Files.exists(path, new LinkOption[0])) {
            return;
        }
        try {
            Files.setLastModifiedTime(path, FileTime.fromMillis(Zip4jUtil.dosToExtendedEpochTme(j10)));
        } catch (Exception unused) {
        }
    }

    public static void setFileLastModifiedTimeWithoutNio(File file, long j10) {
        file.setLastModified(Zip4jUtil.dosToExtendedEpochTme(j10));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:33:0x004b A[SYNTHETIC] */
    public static List<File> getFilesInDirectoryRecursive(File file, boolean z10, boolean z11, ExcludeFileFilter excludeFileFilter) throws ZipException {
        if (file == null) {
            throw new ZipException("input path is null, cannot read files in the directory");
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (file.isDirectory() && file.canRead() && fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (excludeFileFilter == null || !excludeFileFilter.isExcluded(file2)) {
                    if (!file2.isHidden()) {
                        arrayList.add(file2);
                        if (file2.isDirectory()) {
                            arrayList.addAll(getFilesInDirectoryRecursive(file2, z10, z11, excludeFileFilter));
                        }
                    } else if (file2.isDirectory()) {
                        if (z11) {
                            arrayList.add(file2);
                            if (file2.isDirectory()) {
                                arrayList.addAll(getFilesInDirectoryRecursive(file2, z10, z11, excludeFileFilter));
                            }
                        }
                    } else if (z10) {
                        arrayList.add(file2);
                        if (file2.isDirectory()) {
                            arrayList.addAll(getFilesInDirectoryRecursive(file2, z10, z11, excludeFileFilter));
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
